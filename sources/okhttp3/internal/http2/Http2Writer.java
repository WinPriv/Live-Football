package okhttp3.internal.http2;

import com.anythink.expressad.exoplayer.k.p;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.b;
import okio.c;

/* loaded from: classes2.dex */
final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final b hpackBuffer;
    final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final c sink;

    public Http2Writer(c cVar, boolean z10) {
        this.sink = cVar;
        this.client = z10;
        b bVar = new b();
        this.hpackBuffer = bVar;
        this.hpackWriter = new Hpack.Writer(bVar);
        this.maxFrameSize = 16384;
    }

    private void writeContinuationFrames(int i10, long j10) throws IOException {
        byte b10;
        while (j10 > 0) {
            int min = (int) Math.min(this.maxFrameSize, j10);
            long j11 = min;
            j10 -= j11;
            if (j10 == 0) {
                b10 = 4;
            } else {
                b10 = 0;
            }
            frameHeader(i10, min, (byte) 9, b10);
            this.sink.write(this.hpackBuffer, j11);
        }
    }

    private static void writeMedium(c cVar, int i10) throws IOException {
        cVar.writeByte((i10 >>> 16) & p.f9095b);
        cVar.writeByte((i10 >>> 8) & p.f9095b);
        cVar.writeByte(i10 & p.f9095b);
    }

    public synchronized void applyAndAckSettings(Settings settings) throws IOException {
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, (byte) 4, (byte) 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public synchronized void connectionPreface() throws IOException {
        if (!this.closed) {
            if (!this.client) {
                return;
            }
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.r()));
            }
            this.sink.write(Http2.CONNECTION_PREFACE.F());
            this.sink.flush();
            return;
        }
        throw new IOException("closed");
    }

    public synchronized void data(boolean z10, int i10, b bVar, int i11) throws IOException {
        byte b10;
        if (!this.closed) {
            if (z10) {
                b10 = (byte) 1;
            } else {
                b10 = 0;
            }
            dataFrame(i10, b10, bVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    public void dataFrame(int i10, byte b10, b bVar, int i11) throws IOException {
        frameHeader(i10, i11, (byte) 0, b10);
        if (i11 > 0) {
            this.sink.write(bVar, i11);
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public void frameHeader(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.frameLog(false, i10, i11, b10, b11));
        }
        int i12 = this.maxFrameSize;
        if (i11 <= i12) {
            if ((Integer.MIN_VALUE & i10) == 0) {
                writeMedium(this.sink, i11);
                this.sink.writeByte(b10 & DefaultClassResolver.NAME);
                this.sink.writeByte(b11 & DefaultClassResolver.NAME);
                this.sink.writeInt(i10 & Integer.MAX_VALUE);
                return;
            }
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i10));
        }
        throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public synchronized void goAway(int i10, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (!this.closed) {
            if (errorCode.httpCode != -1) {
                frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.sink.writeInt(i10);
                this.sink.writeInt(errorCode.httpCode);
                if (bArr.length > 0) {
                    this.sink.write(bArr);
                }
                this.sink.flush();
            } else {
                throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void headers(boolean z10, int i10, List<Header> list) throws IOException {
        byte b10;
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long j10 = this.hpackBuffer.f33824t;
            int min = (int) Math.min(this.maxFrameSize, j10);
            long j11 = min;
            if (j10 == j11) {
                b10 = 4;
            } else {
                b10 = 0;
            }
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            frameHeader(i10, min, (byte) 1, b10);
            this.sink.write(this.hpackBuffer, j11);
            if (j10 > j11) {
                writeContinuationFrames(i10, j10 - j11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public int maxDataLength() {
        return this.maxFrameSize;
    }

    public synchronized void ping(boolean z10, int i10, int i11) throws IOException {
        byte b10;
        if (!this.closed) {
            if (z10) {
                b10 = 1;
            } else {
                b10 = 0;
            }
            frameHeader(0, 8, (byte) 6, b10);
            this.sink.writeInt(i10);
            this.sink.writeInt(i11);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void pushPromise(int i10, int i11, List<Header> list) throws IOException {
        byte b10;
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long j10 = this.hpackBuffer.f33824t;
            int min = (int) Math.min(this.maxFrameSize - 4, j10);
            long j11 = min;
            if (j10 == j11) {
                b10 = 4;
            } else {
                b10 = 0;
            }
            frameHeader(i10, min + 4, (byte) 5, b10);
            this.sink.writeInt(i11 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j11);
            if (j10 > j11) {
                writeContinuationFrames(i10, j10 - j11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void rstStream(int i10, ErrorCode errorCode) throws IOException {
        if (!this.closed) {
            if (errorCode.httpCode != -1) {
                frameHeader(i10, 4, (byte) 3, (byte) 0);
                this.sink.writeInt(errorCode.httpCode);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void settings(Settings settings) throws IOException {
        int i10;
        if (!this.closed) {
            frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
            for (int i11 = 0; i11 < 10; i11++) {
                if (settings.isSet(i11)) {
                    if (i11 == 4) {
                        i10 = 3;
                    } else if (i11 == 7) {
                        i10 = 4;
                    } else {
                        i10 = i11;
                    }
                    this.sink.writeShort(i10);
                    this.sink.writeInt(settings.get(i11));
                }
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void windowUpdate(int i10, long j10) throws IOException {
        if (!this.closed) {
            if (j10 != 0 && j10 <= 2147483647L) {
                frameHeader(i10, 4, (byte) 8, (byte) 0);
                this.sink.writeInt((int) j10);
                this.sink.flush();
            } else {
                throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
            }
        } else {
            throw new IOException("closed");
        }
    }
}
