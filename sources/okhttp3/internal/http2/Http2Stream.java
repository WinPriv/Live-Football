package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.a;
import okio.a0;
import okio.b;
import okio.d;
import okio.y;
import okio.z;

/* loaded from: classes2.dex */
public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    final Http2Connection connection;

    @Nullable
    ErrorCode errorCode;

    @Nullable
    IOException errorException;
    private boolean hasResponseHeaders;
    private final Deque<Headers> headersQueue;

    /* renamed from: id, reason: collision with root package name */
    final int f33817id;
    final StreamTimeout readTimeout;
    final FramingSink sink;
    private final FramingSource source;
    long unacknowledgedBytesRead = 0;
    final StreamTimeout writeTimeout;

    /* loaded from: classes2.dex */
    public final class FramingSink implements y {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        boolean closed;
        boolean finished;
        private final b sendBuffer = new b();
        private Headers trailers;

        public FramingSink() {
        }

        private void emitFrame(boolean z10) throws IOException {
            Http2Stream http2Stream;
            long min;
            Http2Stream http2Stream2;
            boolean z11;
            synchronized (Http2Stream.this) {
                Http2Stream.this.writeTimeout.enter();
                while (true) {
                    try {
                        http2Stream = Http2Stream.this;
                        if (http2Stream.bytesLeftInWriteWindow > 0 || this.finished || this.closed || http2Stream.errorCode != null) {
                            break;
                        } else {
                            http2Stream.waitForIo();
                        }
                    } finally {
                        Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                    }
                }
                http2Stream.writeTimeout.exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed();
                min = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.f33824t);
                http2Stream2 = Http2Stream.this;
                http2Stream2.bytesLeftInWriteWindow -= min;
            }
            http2Stream2.writeTimeout.enter();
            if (z10) {
                try {
                    if (min == this.sendBuffer.f33824t) {
                        z11 = true;
                        boolean z12 = z11;
                        Http2Stream http2Stream3 = Http2Stream.this;
                        http2Stream3.connection.writeData(http2Stream3.f33817id, z12, this.sendBuffer, min);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z11 = false;
            boolean z122 = z11;
            Http2Stream http2Stream32 = Http2Stream.this;
            http2Stream32.connection.writeData(http2Stream32.f33817id, z122, this.sendBuffer, min);
        }

        @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            boolean z10;
            boolean z11;
            synchronized (Http2Stream.this) {
                if (this.closed) {
                    return;
                }
                Http2Stream http2Stream = Http2Stream.this;
                if (!http2Stream.sink.finished) {
                    if (this.sendBuffer.f33824t > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.trailers != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        while (this.sendBuffer.f33824t > 0) {
                            emitFrame(false);
                        }
                        Http2Stream http2Stream2 = Http2Stream.this;
                        http2Stream2.connection.writeHeaders(http2Stream2.f33817id, true, Util.toHeaderBlock(this.trailers));
                    } else if (z10) {
                        while (this.sendBuffer.f33824t > 0) {
                            emitFrame(true);
                        }
                    } else {
                        http2Stream.connection.writeData(http2Stream.f33817id, true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                }
                Http2Stream.this.connection.flush();
                Http2Stream.this.cancelStreamIfNecessary();
            }
        }

        @Override // okio.y, java.io.Flushable
        public void flush() throws IOException {
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.f33824t > 0) {
                emitFrame(false);
                Http2Stream.this.connection.flush();
            }
        }

        @Override // okio.y
        public a0 timeout() {
            return Http2Stream.this.writeTimeout;
        }

        @Override // okio.y
        public void write(b bVar, long j10) throws IOException {
            this.sendBuffer.write(bVar, j10);
            while (this.sendBuffer.f33824t >= EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class FramingSource implements z {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final b receiveBuffer = new b();
        private final b readBuffer = new b();

        public FramingSource(long j10) {
            this.maxByteCount = j10;
        }

        private void updateConnectionFlowControl(long j10) {
            Http2Stream.this.connection.updateConnectionFlowControl(j10);
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long j10;
            synchronized (Http2Stream.this) {
                this.closed = true;
                b bVar = this.readBuffer;
                j10 = bVar.f33824t;
                bVar.b();
                Http2Stream.this.notifyAll();
            }
            if (j10 > 0) {
                updateConnectionFlowControl(j10);
            }
            Http2Stream.this.cancelStreamIfNecessary();
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        
            r11 = -1;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
        @Override // okio.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(okio.b r11, long r12) throws java.io.IOException {
            /*
                r10 = this;
                r0 = 0
                int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r2 < 0) goto La1
            L6:
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r2)
                okhttp3.internal.http2.Http2Stream r3 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L9e
                okhttp3.internal.http2.Http2Stream$StreamTimeout r3 = r3.readTimeout     // Catch: java.lang.Throwable -> L9e
                r3.enter()     // Catch: java.lang.Throwable -> L9e
                okhttp3.internal.http2.Http2Stream r3 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L95
                okhttp3.internal.http2.ErrorCode r4 = r3.errorCode     // Catch: java.lang.Throwable -> L95
                if (r4 == 0) goto L25
                java.io.IOException r3 = r3.errorException     // Catch: java.lang.Throwable -> L95
                if (r3 == 0) goto L1b
                goto L26
            L1b:
                okhttp3.internal.http2.StreamResetException r3 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L95
                okhttp3.internal.http2.Http2Stream r4 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L95
                okhttp3.internal.http2.ErrorCode r4 = r4.errorCode     // Catch: java.lang.Throwable -> L95
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L95
                goto L26
            L25:
                r3 = 0
            L26:
                boolean r4 = r10.closed     // Catch: java.lang.Throwable -> L95
                if (r4 != 0) goto L8d
                okio.b r4 = r10.readBuffer     // Catch: java.lang.Throwable -> L95
                long r5 = r4.f33824t     // Catch: java.lang.Throwable -> L95
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                r8 = -1
                if (r7 <= 0) goto L64
                long r12 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L95
                long r11 = r4.read(r11, r12)     // Catch: java.lang.Throwable -> L95
                okhttp3.internal.http2.Http2Stream r13 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L95
                long r4 = r13.unacknowledgedBytesRead     // Catch: java.lang.Throwable -> L95
                long r4 = r4 + r11
                r13.unacknowledgedBytesRead = r4     // Catch: java.lang.Throwable -> L95
                if (r3 != 0) goto L79
                okhttp3.internal.http2.Http2Connection r13 = r13.connection     // Catch: java.lang.Throwable -> L95
                okhttp3.internal.http2.Settings r13 = r13.okHttpSettings     // Catch: java.lang.Throwable -> L95
                int r13 = r13.getInitialWindowSize()     // Catch: java.lang.Throwable -> L95
                int r13 = r13 / 2
                long r6 = (long) r13     // Catch: java.lang.Throwable -> L95
                int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r13 < 0) goto L79
                okhttp3.internal.http2.Http2Stream r13 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L95
                okhttp3.internal.http2.Http2Connection r4 = r13.connection     // Catch: java.lang.Throwable -> L95
                int r5 = r13.f33817id     // Catch: java.lang.Throwable -> L95
                long r6 = r13.unacknowledgedBytesRead     // Catch: java.lang.Throwable -> L95
                r4.writeWindowUpdateLater(r5, r6)     // Catch: java.lang.Throwable -> L95
                okhttp3.internal.http2.Http2Stream r13 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L95
                r13.unacknowledgedBytesRead = r0     // Catch: java.lang.Throwable -> L95
                goto L79
            L64:
                boolean r4 = r10.finished     // Catch: java.lang.Throwable -> L95
                if (r4 != 0) goto L78
                if (r3 != 0) goto L78
                okhttp3.internal.http2.Http2Stream r3 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L95
                r3.waitForIo()     // Catch: java.lang.Throwable -> L95
                okhttp3.internal.http2.Http2Stream r3 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L9e
                okhttp3.internal.http2.Http2Stream$StreamTimeout r3 = r3.readTimeout     // Catch: java.lang.Throwable -> L9e
                r3.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L9e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L9e
                goto L6
            L78:
                r11 = r8
            L79:
                okhttp3.internal.http2.Http2Stream r13 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L9e
                okhttp3.internal.http2.Http2Stream$StreamTimeout r13 = r13.readTimeout     // Catch: java.lang.Throwable -> L9e
                r13.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L9e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L9e
                int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r13 == 0) goto L89
                r10.updateConnectionFlowControl(r11)
                return r11
            L89:
                if (r3 != 0) goto L8c
                return r8
            L8c:
                throw r3
            L8d:
                java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L95
                java.lang.String r12 = "stream closed"
                r11.<init>(r12)     // Catch: java.lang.Throwable -> L95
                throw r11     // Catch: java.lang.Throwable -> L95
            L95:
                r11 = move-exception
                okhttp3.internal.http2.Http2Stream r12 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L9e
                okhttp3.internal.http2.Http2Stream$StreamTimeout r12 = r12.readTimeout     // Catch: java.lang.Throwable -> L9e
                r12.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L9e
                throw r11     // Catch: java.lang.Throwable -> L9e
            L9e:
                r11 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L9e
                throw r11
            La1:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r12 = a3.k.k(r0, r12)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(okio.b, long):long");
        }

        public void receive(d dVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            boolean z12;
            long j11;
            while (j10 > 0) {
                synchronized (Http2Stream.this) {
                    z10 = this.finished;
                    z11 = true;
                    if (this.readBuffer.f33824t + j10 > this.maxByteCount) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    dVar.skip(j10);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    dVar.skip(j10);
                    return;
                }
                long read = dVar.read(this.receiveBuffer, j10);
                if (read != -1) {
                    j10 -= read;
                    synchronized (Http2Stream.this) {
                        if (this.closed) {
                            b bVar = this.receiveBuffer;
                            j11 = bVar.f33824t;
                            bVar.b();
                        } else {
                            b bVar2 = this.readBuffer;
                            if (bVar2.f33824t != 0) {
                                z11 = false;
                            }
                            bVar2.J(this.receiveBuffer);
                            if (z11) {
                                Http2Stream.this.notifyAll();
                            }
                            j11 = 0;
                        }
                    }
                    if (j11 > 0) {
                        updateConnectionFlowControl(j11);
                    }
                } else {
                    throw new EOFException();
                }
            }
        }

        @Override // okio.z
        public a0 timeout() {
            return Http2Stream.this.readTimeout;
        }
    }

    /* loaded from: classes2.dex */
    public class StreamTimeout extends a {
        public StreamTimeout() {
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (!exit()) {
            } else {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.a
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.a
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.connection.sendDegradedPingLater();
        }
    }

    public Http2Stream(int i10, Http2Connection http2Connection, boolean z10, boolean z11, @Nullable Headers headers) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.headersQueue = arrayDeque;
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (http2Connection != null) {
            this.f33817id = i10;
            this.connection = http2Connection;
            this.bytesLeftInWriteWindow = http2Connection.peerSettings.getInitialWindowSize();
            FramingSource framingSource = new FramingSource(http2Connection.okHttpSettings.getInitialWindowSize());
            this.source = framingSource;
            FramingSink framingSink = new FramingSink();
            this.sink = framingSink;
            framingSource.finished = z11;
            framingSink.finished = z10;
            if (headers != null) {
                arrayDeque.add(headers);
            }
            if (isLocallyInitiated() && headers != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            if (!isLocallyInitiated() && headers == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
            return;
        }
        throw new NullPointerException("connection == null");
    }

    private boolean closeInternal(ErrorCode errorCode, @Nullable IOException iOException) {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            notifyAll();
            this.connection.removeStream(this.f33817id);
            return true;
        }
    }

    public void addBytesToWriteWindow(long j10) {
        this.bytesLeftInWriteWindow += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public void cancelStreamIfNecessary() throws IOException {
        boolean z10;
        boolean isOpen;
        synchronized (this) {
            FramingSource framingSource = this.source;
            if (!framingSource.finished && framingSource.closed) {
                FramingSink framingSink = this.sink;
                if (framingSink.finished || framingSink.closed) {
                    z10 = true;
                    isOpen = isOpen();
                }
            }
            z10 = false;
            isOpen = isOpen();
        }
        if (z10) {
            close(ErrorCode.CANCEL, null);
        } else if (!isOpen) {
            this.connection.removeStream(this.f33817id);
        }
    }

    public void checkOutNotClosed() throws IOException {
        FramingSink framingSink = this.sink;
        if (!framingSink.closed) {
            if (!framingSink.finished) {
                if (this.errorCode != null) {
                    IOException iOException = this.errorException;
                    if (iOException != null) {
                        throw iOException;
                    }
                    throw new StreamResetException(this.errorCode);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public void close(ErrorCode errorCode, @Nullable IOException iOException) throws IOException {
        if (!closeInternal(errorCode, iOException)) {
            return;
        }
        this.connection.writeSynReset(this.f33817id, errorCode);
    }

    public void closeLater(ErrorCode errorCode) {
        if (!closeInternal(errorCode, null)) {
            return;
        }
        this.connection.writeSynResetLater(this.f33817id, errorCode);
    }

    public void enqueueTrailers(Headers headers) {
        synchronized (this) {
            if (!this.sink.finished) {
                if (headers.size() != 0) {
                    this.sink.trailers = headers;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0");
                }
            } else {
                throw new IllegalStateException("already finished");
            }
        }
    }

    public Http2Connection getConnection() {
        return this.connection;
    }

    public synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public int getId() {
        return this.f33817id;
    }

    public y getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.sink;
    }

    public z getSource() {
        return this.source;
    }

    public boolean isLocallyInitiated() {
        boolean z10;
        if ((this.f33817id & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.connection.client == z10) {
            return true;
        }
        return false;
    }

    public synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        FramingSource framingSource = this.source;
        if (framingSource.finished || framingSource.closed) {
            FramingSink framingSink = this.sink;
            if (framingSink.finished || framingSink.closed) {
                if (this.hasResponseHeaders) {
                    return false;
                }
            }
        }
        return true;
    }

    public a0 readTimeout() {
        return this.readTimeout;
    }

    public void receiveData(d dVar, int i10) throws IOException {
        this.source.receive(dVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:9:0x0018, B:10:0x001c, B:11:0x0023, B:18:0x000f), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void receiveHeaders(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            if (r0 == 0) goto Lf
            if (r4 != 0) goto L9
            goto Lf
        L9:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L2e
            okhttp3.internal.http2.Http2Stream.FramingSource.access$202(r0, r3)     // Catch: java.lang.Throwable -> L2e
            goto L16
        Lf:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L2e
            java.util.Deque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
        L16:
            if (r4 == 0) goto L1c
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L2e
            r3.finished = r1     // Catch: java.lang.Throwable -> L2e
        L1c:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L2e
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L2d
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.f33817id
            r3.removeStream(r4)
        L2d:
            return
        L2e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public synchronized void receiveRstStream(ErrorCode errorCode) {
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public synchronized Headers takeHeaders() throws IOException {
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
        } else {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            throw new StreamResetException(this.errorCode);
        }
        return this.headersQueue.removeFirst();
    }

    public synchronized Headers trailers() throws IOException {
        Headers headers;
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            throw new StreamResetException(this.errorCode);
        }
        FramingSource framingSource = this.source;
        if (framingSource.finished && framingSource.receiveBuffer.u() && this.source.readBuffer.u()) {
            if (this.source.trailers != null) {
                headers = this.source.trailers;
            } else {
                headers = Util.EMPTY_HEADERS;
            }
        } else {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return headers;
    }

    public void waitForIo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public void writeHeaders(List<Header> list, boolean z10, boolean z11) throws IOException {
        if (list != null) {
            synchronized (this) {
                this.hasResponseHeaders = true;
                if (z10) {
                    this.sink.finished = true;
                }
            }
            if (!z11) {
                synchronized (this.connection) {
                    if (this.connection.bytesLeftInWriteWindow == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
            this.connection.writeHeaders(this.f33817id, z10, list);
            if (z11) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public a0 writeTimeout() {
        return this.writeTimeout;
    }
}
