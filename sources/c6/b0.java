package c6;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: Loader.java */
/* loaded from: classes2.dex */
public final class b0 implements c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f3296d = new b(0, com.anythink.expressad.exoplayer.b.f7291b);

    /* renamed from: e, reason: collision with root package name */
    public static final b f3297e = new b(2, com.anythink.expressad.exoplayer.b.f7291b);
    public static final b f = new b(3, com.anythink.expressad.exoplayer.b.f7291b);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f3298a;

    /* renamed from: b, reason: collision with root package name */
    public c<? extends d> f3299b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f3300c;

    /* compiled from: Loader.java */
    /* loaded from: classes2.dex */
    public interface a<T extends d> {
        void g(T t10, long j10, long j11);

        b n(T t10, long j10, long j11, IOException iOException, int i10);

        void q(T t10, long j10, long j11, boolean z10);
    }

    /* compiled from: Loader.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3301a;

        /* renamed from: b, reason: collision with root package name */
        public final long f3302b;

        public b(int i10, long j10) {
            this.f3301a = i10;
            this.f3302b = j10;
        }

        public final boolean a() {
            int i10 = this.f3301a;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Loader.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public final class c<T extends d> extends Handler implements Runnable {
        public volatile boolean A;

        /* renamed from: s, reason: collision with root package name */
        public final int f3303s;

        /* renamed from: t, reason: collision with root package name */
        public final T f3304t;

        /* renamed from: u, reason: collision with root package name */
        public final long f3305u;

        /* renamed from: v, reason: collision with root package name */
        public a<T> f3306v;

        /* renamed from: w, reason: collision with root package name */
        public IOException f3307w;

        /* renamed from: x, reason: collision with root package name */
        public int f3308x;
        public Thread y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f3309z;

        public c(Looper looper, T t10, a<T> aVar, int i10, long j10) {
            super(looper);
            this.f3304t = t10;
            this.f3306v = aVar;
            this.f3303s = i10;
            this.f3305u = j10;
        }

        public final void a(boolean z10) {
            this.A = z10;
            this.f3307w = null;
            if (hasMessages(0)) {
                this.f3309z = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f3309z = true;
                    this.f3304t.a();
                    Thread thread = this.y;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                b0.this.f3299b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.f3306v;
                aVar.getClass();
                aVar.q(this.f3304t, elapsedRealtime, elapsedRealtime - this.f3305u, true);
                this.f3306v = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(long j10) {
            boolean z10;
            b0 b0Var = b0.this;
            if (b0Var.f3299b == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.d(z10);
            b0Var.f3299b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
                return;
            }
            this.f3307w = null;
            ExecutorService executorService = b0Var.f3298a;
            c<? extends d> cVar = b0Var.f3299b;
            cVar.getClass();
            executorService.execute(cVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.A) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                this.f3307w = null;
                b0 b0Var = b0.this;
                ExecutorService executorService = b0Var.f3298a;
                c<? extends d> cVar = b0Var.f3299b;
                cVar.getClass();
                executorService.execute(cVar);
                return;
            }
            if (i10 != 3) {
                b0.this.f3299b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f3305u;
                a<T> aVar = this.f3306v;
                aVar.getClass();
                if (this.f3309z) {
                    aVar.q(this.f3304t, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f3307w = iOException;
                        int i12 = this.f3308x + 1;
                        this.f3308x = i12;
                        b n10 = aVar.n(this.f3304t, elapsedRealtime, j10, iOException, i12);
                        int i13 = n10.f3301a;
                        if (i13 == 3) {
                            b0.this.f3300c = this.f3307w;
                            return;
                        } else {
                            if (i13 != 2) {
                                if (i13 == 1) {
                                    this.f3308x = 1;
                                }
                                long j11 = n10.f3302b;
                                if (j11 == com.anythink.expressad.exoplayer.b.f7291b) {
                                    j11 = Math.min((this.f3308x - 1) * 1000, 5000);
                                }
                                b(j11);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                try {
                    aVar.g(this.f3304t, elapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    d6.p.d("LoadTask", "Unexpected exception handling load completed", e10);
                    b0.this.f3300c = new g(e10);
                    return;
                }
            }
            throw ((Error) message.obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                synchronized (this) {
                    if (!this.f3309z) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.y = Thread.currentThread();
                }
                if (z10) {
                    a0.a.n0("load:".concat(this.f3304t.getClass().getSimpleName()));
                    try {
                        this.f3304t.load();
                        a0.a.F0();
                    } catch (Throwable th) {
                        a0.a.F0();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.y = null;
                    Thread.interrupted();
                }
                if (!this.A) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e10) {
                if (!this.A) {
                    obtainMessage(2, e10).sendToTarget();
                }
            } catch (OutOfMemoryError e11) {
                if (!this.A) {
                    d6.p.d("LoadTask", "OutOfMemory error loading stream", e11);
                    obtainMessage(2, new g(e11)).sendToTarget();
                }
            } catch (Error e12) {
                if (!this.A) {
                    d6.p.d("LoadTask", "Unexpected error loading stream", e12);
                    obtainMessage(3, e12).sendToTarget();
                }
                throw e12;
            } catch (Exception e13) {
                if (!this.A) {
                    d6.p.d("LoadTask", "Unexpected exception loading stream", e13);
                    obtainMessage(2, new g(e13)).sendToTarget();
                }
            }
        }
    }

    /* compiled from: Loader.java */
    /* loaded from: classes2.dex */
    public interface d {
        void a();

        void load() throws IOException;
    }

    /* compiled from: Loader.java */
    /* loaded from: classes2.dex */
    public interface e {
        void h();
    }

    /* compiled from: Loader.java */
    /* loaded from: classes2.dex */
    public static final class f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final e f3310s;

        public f(e eVar) {
            this.f3310s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3310s.h();
        }
    }

    /* compiled from: Loader.java */
    /* loaded from: classes2.dex */
    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public b0(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i10 = d6.g0.f27302a;
        this.f3298a = Executors.newSingleThreadExecutor(new d6.f0(concat));
    }

    @Override // c6.c0
    public final void a() throws IOException {
        IOException iOException;
        IOException iOException2 = this.f3300c;
        if (iOException2 == null) {
            c<? extends d> cVar = this.f3299b;
            if (cVar != null && (iOException = cVar.f3307w) != null && cVar.f3308x > cVar.f3303s) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public final void b() {
        c<? extends d> cVar = this.f3299b;
        d6.a.e(cVar);
        cVar.a(false);
    }

    public final boolean c() {
        if (this.f3300c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f3299b != null) {
            return true;
        }
        return false;
    }

    public final void e(e eVar) {
        c<? extends d> cVar = this.f3299b;
        if (cVar != null) {
            cVar.a(true);
        }
        ExecutorService executorService = this.f3298a;
        if (eVar != null) {
            executorService.execute(new f(eVar));
        }
        executorService.shutdown();
    }

    public final <T extends d> long f(T t10, a<T> aVar, int i10) {
        Looper myLooper = Looper.myLooper();
        d6.a.e(myLooper);
        this.f3300c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new c(myLooper, t10, aVar, i10, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }
}
