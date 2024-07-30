package okhttp3.internal.ws;

import com.anythink.expressad.video.module.a.a;
import java.io.IOException;
import java.util.Random;
import okio.a0;
import okio.b;
import okio.c;
import okio.e;
import okio.y;

/* loaded from: classes2.dex */
final class WebSocketWriter {
    boolean activeWriter;
    final b buffer = new b();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    private final b.C0452b maskCursor;
    private final byte[] maskKey;
    final Random random;
    final c sink;
    final b sinkBuffer;
    boolean writerClosed;

    /* loaded from: classes2.dex */
    public final class FrameSink implements y {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        public FrameSink() {
        }

        @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.f33824t, this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.activeWriter = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // okio.y, java.io.Flushable
        public void flush() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.f33824t, this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // okio.y
        public a0 timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // okio.y
        public void write(b bVar, long j10) throws IOException {
            boolean z10;
            long d10;
            if (!this.closed) {
                WebSocketWriter.this.buffer.write(bVar, j10);
                if (this.isFirstFrame) {
                    long j11 = this.contentLength;
                    if (j11 != -1 && WebSocketWriter.this.buffer.f33824t > j11 - 8192) {
                        z10 = true;
                        d10 = WebSocketWriter.this.buffer.d();
                        if (d10 <= 0 && !z10) {
                            WebSocketWriter.this.writeMessageFrame(this.formatOpcode, d10, this.isFirstFrame, false);
                            this.isFirstFrame = false;
                            return;
                        }
                        return;
                    }
                }
                z10 = false;
                d10 = WebSocketWriter.this.buffer.d();
                if (d10 <= 0) {
                    return;
                } else {
                    return;
                }
            }
            throw new IOException("closed");
        }
    }

    public WebSocketWriter(boolean z10, c cVar, Random random) {
        byte[] bArr;
        if (cVar != null) {
            if (random != null) {
                this.isClient = z10;
                this.sink = cVar;
                this.sinkBuffer = cVar.n();
                this.random = random;
                if (z10) {
                    bArr = new byte[4];
                } else {
                    bArr = null;
                }
                this.maskKey = bArr;
                this.maskCursor = z10 ? new b.C0452b() : null;
                return;
            }
            throw new NullPointerException("random == null");
        }
        throw new NullPointerException("sink == null");
    }

    private void writeControlFrame(int i10, e eVar) throws IOException {
        if (!this.writerClosed) {
            int A = eVar.A();
            if (A <= 125) {
                this.sinkBuffer.Z(i10 | 128);
                if (this.isClient) {
                    this.sinkBuffer.Z(A | 128);
                    this.random.nextBytes(this.maskKey);
                    this.sinkBuffer.m6write(this.maskKey);
                    if (A > 0) {
                        b bVar = this.sinkBuffer;
                        long j10 = bVar.f33824t;
                        bVar.Y(eVar);
                        this.sinkBuffer.i(this.maskCursor);
                        this.maskCursor.b(j10);
                        WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.Z(A);
                    this.sinkBuffer.Y(eVar);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    public y newMessageSink(int i10, long j10) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            FrameSink frameSink = this.frameSink;
            frameSink.formatOpcode = i10;
            frameSink.contentLength = j10;
            frameSink.isFirstFrame = true;
            frameSink.closed = false;
            return frameSink;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    public void writeClose(int i10, e eVar) throws IOException {
        e eVar2 = e.f33834w;
        if (i10 != 0 || eVar != null) {
            if (i10 != 0) {
                WebSocketProtocol.validateCloseCode(i10);
            }
            b bVar = new b();
            bVar.e0(i10);
            if (eVar != null) {
                bVar.Y(eVar);
            }
            eVar2 = bVar.j();
        }
        try {
            writeControlFrame(8, eVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    public void writeMessageFrame(int i10, long j10, boolean z10, boolean z11) throws IOException {
        if (!this.writerClosed) {
            int i11 = 0;
            if (!z10) {
                i10 = 0;
            }
            if (z11) {
                i10 |= 128;
            }
            this.sinkBuffer.Z(i10);
            if (this.isClient) {
                i11 = 128;
            }
            if (j10 <= 125) {
                this.sinkBuffer.Z(((int) j10) | i11);
            } else if (j10 <= 65535) {
                this.sinkBuffer.Z(i11 | 126);
                this.sinkBuffer.e0((int) j10);
            } else {
                this.sinkBuffer.Z(i11 | a.R);
                this.sinkBuffer.d0(j10);
            }
            if (this.isClient) {
                this.random.nextBytes(this.maskKey);
                this.sinkBuffer.m6write(this.maskKey);
                if (j10 > 0) {
                    b bVar = this.sinkBuffer;
                    long j11 = bVar.f33824t;
                    bVar.write(this.buffer, j10);
                    this.sinkBuffer.i(this.maskCursor);
                    this.maskCursor.b(j11);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            } else {
                this.sinkBuffer.write(this.buffer, j10);
            }
            this.sink.q();
            return;
        }
        throw new IOException("closed");
    }

    public void writePing(e eVar) throws IOException {
        writeControlFrame(9, eVar);
    }

    public void writePong(e eVar) throws IOException {
        writeControlFrame(10, eVar);
    }
}
