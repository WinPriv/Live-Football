package com.applovin.exoplayer2.k;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final b f16203a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f16204b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f16205c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f16206d;

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f16207e;
    private c<? extends d> f;

    /* renamed from: g, reason: collision with root package name */
    private IOException f16208g;

    /* loaded from: classes.dex */
    public interface a<T extends d> {
        b a(T t10, long j10, long j11, IOException iOException, int i10);

        void a(T t10, long j10, long j11);

        void a(T t10, long j10, long j11, boolean z10);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f16209a;

        /* renamed from: b, reason: collision with root package name */
        private final long f16210b;

        private b(int i10, long j10) {
            this.f16209a = i10;
            this.f16210b = j10;
        }

        public boolean a() {
            int i10 = this.f16209a;
            return i10 == 0 || i10 == 1;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b() throws IOException;
    }

    /* loaded from: classes.dex */
    public interface e {
        void h();
    }

    /* loaded from: classes.dex */
    public static final class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final e f16220a;

        public f(e eVar) {
            this.f16220a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16220a.h();
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j10 = com.anythink.expressad.exoplayer.b.f7291b;
        f16203a = a(false, com.anythink.expressad.exoplayer.b.f7291b);
        f16204b = a(true, com.anythink.expressad.exoplayer.b.f7291b);
        f16205c = new b(2, j10);
        f16206d = new b(3, j10);
    }

    public w(String str) {
        this.f16207e = ai.a("ExoPlayer:Loader:" + str);
    }

    public boolean c() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public void d() {
        ((c) com.applovin.exoplayer2.l.a.a(this.f)).a(false);
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public final class c<T extends d> extends Handler implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f16211a;

        /* renamed from: c, reason: collision with root package name */
        private final T f16213c;

        /* renamed from: d, reason: collision with root package name */
        private final long f16214d;

        /* renamed from: e, reason: collision with root package name */
        private a<T> f16215e;
        private IOException f;

        /* renamed from: g, reason: collision with root package name */
        private int f16216g;

        /* renamed from: h, reason: collision with root package name */
        private Thread f16217h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f16218i;

        /* renamed from: j, reason: collision with root package name */
        private volatile boolean f16219j;

        public c(Looper looper, T t10, a<T> aVar, int i10, long j10) {
            super(looper);
            this.f16213c = t10;
            this.f16215e = aVar;
            this.f16211a = i10;
            this.f16214d = j10;
        }

        private void b() {
            w.this.f = null;
        }

        private long c() {
            return Math.min((this.f16216g - 1) * 1000, 5000);
        }

        public void a(int i10) throws IOException {
            IOException iOException = this.f;
            if (iOException != null && this.f16216g > i10) {
                throw iOException;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long c10;
            if (this.f16219j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                a();
                return;
            }
            if (i10 != 3) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f16214d;
                a aVar = (a) com.applovin.exoplayer2.l.a.b(this.f16215e);
                if (this.f16218i) {
                    aVar.a(this.f16213c, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f = iOException;
                        int i12 = this.f16216g + 1;
                        this.f16216g = i12;
                        b a10 = aVar.a(this.f16213c, elapsedRealtime, j10, iOException, i12);
                        if (a10.f16209a == 3) {
                            w.this.f16208g = this.f;
                            return;
                        } else {
                            if (a10.f16209a != 2) {
                                if (a10.f16209a == 1) {
                                    this.f16216g = 1;
                                }
                                if (a10.f16210b != com.anythink.expressad.exoplayer.b.f7291b) {
                                    c10 = a10.f16210b;
                                } else {
                                    c10 = c();
                                }
                                a(c10);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                try {
                    aVar.a(this.f16213c, elapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    com.applovin.exoplayer2.l.q.c("LoadTask", "Unexpected exception handling load completed", e10);
                    w.this.f16208g = new g(e10);
                    return;
                }
            }
            throw ((Error) message.obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    if (!this.f16218i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f16217h = Thread.currentThread();
                }
                if (z10) {
                    ah.a("load:".concat(this.f16213c.getClass().getSimpleName()));
                    try {
                        this.f16213c.b();
                        ah.a();
                    } catch (Throwable th) {
                        ah.a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f16217h = null;
                    Thread.interrupted();
                }
                if (!this.f16219j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e10) {
                if (!this.f16219j) {
                    obtainMessage(2, e10).sendToTarget();
                }
            } catch (OutOfMemoryError e11) {
                if (!this.f16219j) {
                    com.applovin.exoplayer2.l.q.c("LoadTask", "OutOfMemory error loading stream", e11);
                    obtainMessage(2, new g(e11)).sendToTarget();
                }
            } catch (Error e12) {
                if (!this.f16219j) {
                    com.applovin.exoplayer2.l.q.c("LoadTask", "Unexpected error loading stream", e12);
                    obtainMessage(3, e12).sendToTarget();
                }
                throw e12;
            } catch (Exception e13) {
                if (!this.f16219j) {
                    com.applovin.exoplayer2.l.q.c("LoadTask", "Unexpected exception loading stream", e13);
                    obtainMessage(2, new g(e13)).sendToTarget();
                }
            }
        }

        public void a(long j10) {
            com.applovin.exoplayer2.l.a.b(w.this.f == null);
            w.this.f = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                a();
            }
        }

        public void a(boolean z10) {
            this.f16219j = z10;
            this.f = null;
            if (hasMessages(0)) {
                this.f16218i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f16218i = true;
                    this.f16213c.a();
                    Thread thread = this.f16217h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((a) com.applovin.exoplayer2.l.a.b(this.f16215e)).a(this.f16213c, elapsedRealtime, elapsedRealtime - this.f16214d, true);
                this.f16215e = null;
            }
        }

        private void a() {
            this.f = null;
            w.this.f16207e.execute((Runnable) com.applovin.exoplayer2.l.a.b(w.this.f));
        }
    }

    public void b() {
        this.f16208g = null;
    }

    public static b a(boolean z10, long j10) {
        return new b(z10 ? 1 : 0, j10);
    }

    public boolean a() {
        return this.f16208g != null;
    }

    public <T extends d> long a(T t10, a<T> aVar, int i10) {
        Looper looper = (Looper) com.applovin.exoplayer2.l.a.a(Looper.myLooper());
        this.f16208g = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new c(looper, t10, aVar, i10, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    public void a(e eVar) {
        c<? extends d> cVar = this.f;
        if (cVar != null) {
            cVar.a(true);
        }
        if (eVar != null) {
            this.f16207e.execute(new f(eVar));
        }
        this.f16207e.shutdown();
    }

    public void a(int i10) throws IOException {
        IOException iOException = this.f16208g;
        if (iOException == null) {
            c<? extends d> cVar = this.f;
            if (cVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = cVar.f16211a;
                }
                cVar.a(i10);
                return;
            }
            return;
        }
        throw iOException;
    }
}
