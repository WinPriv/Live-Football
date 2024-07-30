package okhttp3.internal.http2;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.a0;
import okio.b;
import okio.d;
import okio.e;
import okio.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Http2Reader implements Closeable {
    static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private final ContinuationSource continuation;
    final Hpack.Reader hpackReader;
    private final d source;

    /* loaded from: classes2.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i10, String str, e eVar, String str2, int i11, long j10);

        void data(boolean z10, int i10, d dVar, int i11) throws IOException;

        void goAway(int i10, ErrorCode errorCode, e eVar);

        void headers(boolean z10, int i10, int i11, List<Header> list);

        void ping(boolean z10, int i10, int i11);

        void priority(int i10, int i11, int i12, boolean z10);

        void pushPromise(int i10, int i11, List<Header> list) throws IOException;

        void rstStream(int i10, ErrorCode errorCode);

        void settings(boolean z10, Settings settings);

        void windowUpdate(int i10, long j10);
    }

    public Http2Reader(d dVar, boolean z10) {
        this.source = dVar;
        this.client = z10;
        ContinuationSource continuationSource = new ContinuationSource(dVar);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(4096, continuationSource);
    }

    public static int lengthWithoutPadding(int i10, byte b10, short s10) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    private void readData(Handler handler, int i10, byte b10, int i11) throws IOException {
        boolean z10;
        short s10 = 0;
        if (i11 != 0) {
            boolean z11 = true;
            if ((b10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((b10 & 32) == 0) {
                z11 = false;
            }
            if (!z11) {
                if ((b10 & 8) != 0) {
                    s10 = (short) (this.source.readByte() & DefaultClassResolver.NAME);
                }
                handler.data(z10, i11, this.source, lengthWithoutPadding(i10, b10, s10));
                this.source.skip(s10);
                return;
            }
            throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    private void readGoAway(Handler handler, int i10, byte b10, int i11) throws IOException {
        if (i10 >= 8) {
            if (i11 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                int i12 = i10 - 8;
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt2);
                if (fromHttp2 != null) {
                    e eVar = e.f33834w;
                    if (i12 > 0) {
                        eVar = this.source.a(i12);
                    }
                    handler.goAway(readInt, fromHttp2, eVar);
                    return;
                }
                throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
    }

    private List<Header> readHeaderBlock(int i10, short s10, byte b10, int i11) throws IOException {
        ContinuationSource continuationSource = this.continuation;
        continuationSource.left = i10;
        continuationSource.length = i10;
        continuationSource.padding = s10;
        continuationSource.flags = b10;
        continuationSource.streamId = i11;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private void readHeaders(Handler handler, int i10, byte b10, int i11) throws IOException {
        boolean z10;
        short s10 = 0;
        if (i11 != 0) {
            if ((b10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((b10 & 8) != 0) {
                s10 = (short) (this.source.readByte() & DefaultClassResolver.NAME);
            }
            if ((b10 & 32) != 0) {
                readPriority(handler, i11);
                i10 -= 5;
            }
            handler.headers(z10, i11, -1, readHeaderBlock(lengthWithoutPadding(i10, b10, s10), s10, b10, i11));
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    public static int readMedium(d dVar) throws IOException {
        return (dVar.readByte() & DefaultClassResolver.NAME) | ((dVar.readByte() & DefaultClassResolver.NAME) << 16) | ((dVar.readByte() & DefaultClassResolver.NAME) << 8);
    }

    private void readPing(Handler handler, int i10, byte b10, int i11) throws IOException {
        boolean z10 = false;
        if (i10 == 8) {
            if (i11 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                if ((b10 & 1) != 0) {
                    z10 = true;
                }
                handler.ping(z10, readInt, readInt2);
                return;
            }
            throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
        }
        throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i10));
    }

    private void readPriority(Handler handler, int i10, byte b10, int i11) throws IOException {
        if (i10 != 5) {
            throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
        }
        if (i11 != 0) {
            readPriority(handler, i11);
            return;
        }
        throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
    }

    private void readPushPromise(Handler handler, int i10, byte b10, int i11) throws IOException {
        short s10 = 0;
        if (i11 != 0) {
            if ((b10 & 8) != 0) {
                s10 = (short) (this.source.readByte() & DefaultClassResolver.NAME);
            }
            handler.pushPromise(i11, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(lengthWithoutPadding(i10 - 4, b10, s10), s10, b10, i11));
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    private void readRstStream(Handler handler, int i10, byte b10, int i11) throws IOException {
        if (i10 == 4) {
            if (i11 != 0) {
                int readInt = this.source.readInt();
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
                if (fromHttp2 != null) {
                    handler.rstStream(i11, fromHttp2);
                    return;
                }
                throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
    }

    private void readSettings(Handler handler, int i10, byte b10, int i11) throws IOException {
        if (i11 == 0) {
            if ((b10 & 1) != 0) {
                if (i10 == 0) {
                    handler.ackSettings();
                    return;
                }
                throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            if (i10 % 6 == 0) {
                Settings settings = new Settings();
                for (int i12 = 0; i12 < i10; i12 += 6) {
                    int readShort = this.source.readShort() & 65535;
                    int readInt = this.source.readInt();
                    if (readShort != 2) {
                        if (readShort != 3) {
                            if (readShort != 4) {
                                if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                                    throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                                }
                            } else if (readInt >= 0) {
                                readShort = 7;
                            } else {
                                throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                        } else {
                            readShort = 4;
                        }
                    } else if (readInt != 0 && readInt != 1) {
                        throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    }
                    settings.set(readShort, readInt);
                }
                handler.settings(false, settings);
                return;
            }
            throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
        }
        throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
    }

    private void readWindowUpdate(Handler handler, int i10, byte b10, int i11) throws IOException {
        if (i10 == 4) {
            long readInt = this.source.readInt() & 2147483647L;
            if (readInt != 0) {
                handler.windowUpdate(i11, readInt);
                return;
            }
            throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(readInt));
        }
        throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public boolean nextFrame(boolean z10, Handler handler) throws IOException {
        try {
            this.source.T(9L);
            int readMedium = readMedium(this.source);
            if (readMedium >= 0 && readMedium <= 16384) {
                byte readByte = (byte) (this.source.readByte() & DefaultClassResolver.NAME);
                if (z10 && readByte != 4) {
                    throw Http2.ioException("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                }
                byte readByte2 = (byte) (this.source.readByte() & DefaultClassResolver.NAME);
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.frameLog(true, readInt, readMedium, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        readData(handler, readMedium, readByte2, readInt);
                        return true;
                    case 1:
                        readHeaders(handler, readMedium, readByte2, readInt);
                        return true;
                    case 2:
                        readPriority(handler, readMedium, readByte2, readInt);
                        return true;
                    case 3:
                        readRstStream(handler, readMedium, readByte2, readInt);
                        return true;
                    case 4:
                        readSettings(handler, readMedium, readByte2, readInt);
                        return true;
                    case 5:
                        readPushPromise(handler, readMedium, readByte2, readInt);
                        return true;
                    case 6:
                        readPing(handler, readMedium, readByte2, readInt);
                        return true;
                    case 7:
                        readGoAway(handler, readMedium, readByte2, readInt);
                        return true;
                    case 8:
                        readWindowUpdate(handler, readMedium, readByte2, readInt);
                        return true;
                    default:
                        this.source.skip(readMedium);
                        return true;
                }
            }
            throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(readMedium));
        } catch (EOFException unused) {
            return false;
        }
    }

    public void readConnectionPreface(Handler handler) throws IOException {
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw Http2.ioException("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        d dVar = this.source;
        e eVar = Http2.CONNECTION_PREFACE;
        e a10 = dVar.a(eVar.A());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION %s", a10.r()));
        }
        if (eVar.equals(a10)) {
        } else {
            throw Http2.ioException("Expected a connection header but was %s", a10.G());
        }
    }

    private void readPriority(Handler handler, int i10) throws IOException {
        int readInt = this.source.readInt();
        handler.priority(i10, readInt & Integer.MAX_VALUE, (this.source.readByte() & DefaultClassResolver.NAME) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* loaded from: classes2.dex */
    public static final class ContinuationSource implements z {
        byte flags;
        int left;
        int length;
        short padding;
        private final d source;
        int streamId;

        public ContinuationSource(d dVar) {
            this.source = dVar;
        }

        private void readContinuationHeader() throws IOException {
            int i10 = this.streamId;
            int readMedium = Http2Reader.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            byte readByte = (byte) (this.source.readByte() & DefaultClassResolver.NAME);
            this.flags = (byte) (this.source.readByte() & DefaultClassResolver.NAME);
            Logger logger = Http2Reader.logger;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.frameLog(true, this.streamId, this.length, readByte, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (readByte == 9) {
                if (readInt == i10) {
                    return;
                } else {
                    throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
                }
            }
            throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
        }

        @Override // okio.z
        public long read(b bVar, long j10) throws IOException {
            while (true) {
                int i10 = this.left;
                if (i10 == 0) {
                    this.source.skip(this.padding);
                    this.padding = (short) 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(bVar, Math.min(j10, i10));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left = (int) (this.left - read);
                    return read;
                }
            }
        }

        @Override // okio.z
        public a0 timeout() {
            return this.source.timeout();
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
