package okhttp3.internal.ws;

import com.anythink.expressad.video.module.a.a;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.b;
import okio.d;
import okio.e;

/* loaded from: classes2.dex */
final class WebSocketReader {
    boolean closed;
    final FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final b.C0452b maskCursor;
    private final byte[] maskKey;
    int opcode;
    final d source;
    private final b controlFrameBuffer = new b();
    private final b messageFrameBuffer = new b();

    /* loaded from: classes2.dex */
    public interface FrameCallback {
        void onReadClose(int i10, String str);

        void onReadMessage(String str) throws IOException;

        void onReadMessage(e eVar) throws IOException;

        void onReadPing(e eVar);

        void onReadPong(e eVar);
    }

    public WebSocketReader(boolean z10, d dVar, FrameCallback frameCallback) {
        byte[] bArr;
        if (dVar != null) {
            if (frameCallback != null) {
                this.isClient = z10;
                this.source = dVar;
                this.frameCallback = frameCallback;
                if (z10) {
                    bArr = null;
                } else {
                    bArr = new byte[4];
                }
                this.maskKey = bArr;
                this.maskCursor = z10 ? null : new b.C0452b();
                return;
            }
            throw new NullPointerException("frameCallback == null");
        }
        throw new NullPointerException("source == null");
    }

    private void readControlFrame() throws IOException {
        short s10;
        String str;
        long j10 = this.frameLength;
        if (j10 > 0) {
            this.source.w(this.controlFrameBuffer, j10);
            if (!this.isClient) {
                this.controlFrameBuffer.i(this.maskCursor);
                this.maskCursor.b(0L);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                b bVar = this.controlFrameBuffer;
                long j11 = bVar.f33824t;
                if (j11 != 1) {
                    if (j11 != 0) {
                        s10 = bVar.readShort();
                        str = this.controlFrameBuffer.l();
                        String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s10);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        s10 = 1005;
                        str = "";
                    }
                    this.frameCallback.onReadClose(s10, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.j());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.j());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.opcode));
        }
    }

    /* JADX WARN: Finally extract failed */
    private void readHeader() throws IOException {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int readByte = this.source.readByte() & DefaultClassResolver.NAME;
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.opcode = readByte & 15;
                boolean z15 = true;
                if ((readByte & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.isFinalFrame = z10;
                if ((readByte & 8) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.isControlFrame = z11;
                if (z11 && !z10) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((readByte & 64) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((readByte & 32) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((readByte & 16) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z12 && !z13 && !z14) {
                    int readByte2 = this.source.readByte() & DefaultClassResolver.NAME;
                    if ((readByte2 & 128) == 0) {
                        z15 = false;
                    }
                    if (z15 == this.isClient) {
                        if (this.isClient) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    long j10 = readByte2 & a.R;
                    this.frameLength = j10;
                    if (j10 == 126) {
                        this.frameLength = this.source.readShort() & 65535;
                    } else if (j10 == 127) {
                        long readLong = this.source.readLong();
                        this.frameLength = readLong;
                        if (readLong < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    }
                    if (z15) {
                        this.source.readFully(this.maskKey);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("Reserved flags are unsupported.");
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    private void readMessage() throws IOException {
        while (!this.closed) {
            long j10 = this.frameLength;
            if (j10 > 0) {
                this.source.w(this.messageFrameBuffer, j10);
                if (!this.isClient) {
                    this.messageFrameBuffer.i(this.maskCursor);
                    this.maskCursor.b(this.messageFrameBuffer.f33824t - this.frameLength);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private void readMessageFrame() throws IOException {
        int i10 = this.opcode;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i10));
        }
        readMessage();
        if (i10 == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.l());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.j());
        }
    }

    private void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    public void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
