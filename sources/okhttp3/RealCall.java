package okhttp3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.connection.Transmitter;
import okhttp3.internal.platform.Platform;
import okio.a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RealCall implements Call {
    final OkHttpClient client;
    private boolean executed;
    final boolean forWebSocket;
    final Request originalRequest;
    private Transmitter transmitter;

    /* loaded from: classes2.dex */
    public final class AsyncCall extends NamedRunnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private volatile AtomicInteger callsPerHost;
        private final Callback responseCallback;

        public AsyncCall(Callback callback) {
            super("OkHttp %s", RealCall.this.redactedUrl());
            this.callsPerHost = new AtomicInteger(0);
            this.responseCallback = callback;
        }

        public AtomicInteger callsPerHost() {
            return this.callsPerHost;
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            RealCall.this.transmitter.timeoutEnter();
            boolean z10 = false;
            try {
                try {
                } catch (Throwable th) {
                    RealCall.this.client.dispatcher().finished(this);
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.responseCallback.onResponse(RealCall.this, RealCall.this.getResponseWithInterceptorChain());
            } catch (IOException e11) {
                e = e11;
                z10 = true;
                if (z10) {
                    Platform.get().log(4, "Callback failure for " + RealCall.this.toLoggableString(), e);
                } else {
                    this.responseCallback.onFailure(RealCall.this, e);
                }
                RealCall.this.client.dispatcher().finished(this);
            } catch (Throwable th3) {
                th = th3;
                z10 = true;
                RealCall.this.cancel();
                if (!z10) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.addSuppressed(th);
                    this.responseCallback.onFailure(RealCall.this, iOException);
                }
                throw th;
            }
            RealCall.this.client.dispatcher().finished(this);
        }

        public void executeOn(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    RealCall.this.transmitter.noMoreExchanges(interruptedIOException);
                    this.responseCallback.onFailure(RealCall.this, interruptedIOException);
                    RealCall.this.client.dispatcher().finished(this);
                }
            } catch (Throwable th) {
                RealCall.this.client.dispatcher().finished(this);
                throw th;
            }
        }

        public RealCall get() {
            return RealCall.this;
        }

        public String host() {
            return RealCall.this.originalRequest.url().host();
        }

        public Request request() {
            return RealCall.this.originalRequest;
        }

        public void reuseCallsPerHostFrom(AsyncCall asyncCall) {
            this.callsPerHost = asyncCall.callsPerHost;
        }
    }

    private RealCall(OkHttpClient okHttpClient, Request request, boolean z10) {
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z10;
    }

    public static RealCall newRealCall(OkHttpClient okHttpClient, Request request, boolean z10) {
        RealCall realCall = new RealCall(okHttpClient, request, z10);
        realCall.transmitter = new Transmitter(okHttpClient, realCall);
        return realCall;
    }

    @Override // okhttp3.Call
    public void cancel() {
        this.transmitter.cancel();
    }

    @Override // okhttp3.Call
    public void enqueue(Callback callback) {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.transmitter.callStart();
        this.client.dispatcher().enqueue(new AsyncCall(callback));
    }

    @Override // okhttp3.Call
    public Response execute() throws IOException {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.transmitter.timeoutEnter();
        this.transmitter.callStart();
        try {
            this.client.dispatcher().executed(this);
            return getResponseWithInterceptorChain();
        } finally {
            this.client.dispatcher().finished(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response getResponseWithInterceptorChain() throws java.io.IOException {
        /*
            r12 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            okhttp3.OkHttpClient r0 = r12.client
            java.util.List r0 = r0.interceptors()
            r1.addAll(r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r2 = r12.client
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r2 = r12.client
            okhttp3.CookieJar r2 = r2.cookieJar()
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r2 = r12.client
            okhttp3.internal.cache.InternalCache r2 = r2.internalCache()
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = new okhttp3.internal.connection.ConnectInterceptor
            okhttp3.OkHttpClient r2 = r12.client
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r12.forWebSocket
            if (r0 != 0) goto L4b
            okhttp3.OkHttpClient r0 = r12.client
            java.util.List r0 = r0.networkInterceptors()
            r1.addAll(r0)
        L4b:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r2 = r12.forWebSocket
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.http.RealInterceptorChain r10 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.internal.connection.Transmitter r2 = r12.transmitter
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r12.originalRequest
            okhttp3.OkHttpClient r0 = r12.client
            int r7 = r0.connectTimeoutMillis()
            okhttp3.OkHttpClient r0 = r12.client
            int r8 = r0.readTimeoutMillis()
            okhttp3.OkHttpClient r0 = r12.client
            int r9 = r0.writeTimeoutMillis()
            r0 = r10
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r12.originalRequest     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            okhttp3.Response r2 = r10.proceed(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            okhttp3.internal.connection.Transmitter r3 = r12.transmitter     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            boolean r3 = r3.isCanceled()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            if (r3 != 0) goto L8a
            okhttp3.internal.connection.Transmitter r1 = r12.transmitter
            r1.noMoreExchanges(r0)
            return r2
        L8a:
            okhttp3.internal.Util.closeQuietly(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            throw r2     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
        L95:
            r2 = move-exception
            goto La4
        L97:
            r1 = move-exception
            r2 = 1
            okhttp3.internal.connection.Transmitter r3 = r12.transmitter     // Catch: java.lang.Throwable -> La0
            java.io.IOException r1 = r3.noMoreExchanges(r1)     // Catch: java.lang.Throwable -> La0
            throw r1     // Catch: java.lang.Throwable -> La0
        La0:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
        La4:
            if (r1 != 0) goto Lab
            okhttp3.internal.connection.Transmitter r1 = r12.transmitter
            r1.noMoreExchanges(r0)
        Lab:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RealCall.getResponseWithInterceptorChain():okhttp3.Response");
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        return this.transmitter.isCanceled();
    }

    @Override // okhttp3.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    @Override // okhttp3.Call
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.Call
    public a0 timeout() {
        return this.transmitter.timeout();
    }

    public String toLoggableString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (isCanceled()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.forWebSocket) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb2.append(str2);
        sb2.append(" to ");
        sb2.append(redactedUrl());
        return sb2.toString();
    }

    @Override // okhttp3.Call
    public RealCall clone() {
        return newRealCall(this.client, this.originalRequest, this.forWebSocket);
    }
}
