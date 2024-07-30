package com.anythink.expressad.exoplayer.j;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.anythink.expressad.exoplayer.k.ad;
import com.anythink.expressad.exoplayer.k.af;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8908a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8909b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8910c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8911d = 3;

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f8912e;
    private b<? extends c> f;

    /* renamed from: g, reason: collision with root package name */
    private IOException f8913g;

    /* loaded from: classes.dex */
    public interface a<T extends c> {
        int a(T t10, long j10, long j11, IOException iOException);

        void a(T t10, long j10, long j11);

        void a(T t10, long j10, long j11, boolean z10);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface d {
        void g();
    }

    /* loaded from: classes.dex */
    public static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final d f8928a;

        public e(d dVar) {
            this.f8928a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8928a.g();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface f {
    }

    /* loaded from: classes.dex */
    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public t(String str) {
        this.f8912e = af.a(str);
    }

    private void d() {
        a((d) null);
    }

    @Override // com.anythink.expressad.exoplayer.j.u
    public final void c() {
        a(Integer.MIN_VALUE);
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public final class b<T extends c> extends Handler implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        private static final String f8914c = "LoadTask";

        /* renamed from: d, reason: collision with root package name */
        private static final int f8915d = 0;

        /* renamed from: e, reason: collision with root package name */
        private static final int f8916e = 1;
        private static final int f = 2;

        /* renamed from: g, reason: collision with root package name */
        private static final int f8917g = 3;

        /* renamed from: h, reason: collision with root package name */
        private static final int f8918h = 4;

        /* renamed from: a, reason: collision with root package name */
        public final int f8919a;

        /* renamed from: i, reason: collision with root package name */
        private final T f8921i;

        /* renamed from: j, reason: collision with root package name */
        private final long f8922j;

        /* renamed from: k, reason: collision with root package name */
        private a<T> f8923k;

        /* renamed from: l, reason: collision with root package name */
        private IOException f8924l;

        /* renamed from: m, reason: collision with root package name */
        private int f8925m;

        /* renamed from: n, reason: collision with root package name */
        private volatile Thread f8926n;
        private volatile boolean o;

        /* renamed from: p, reason: collision with root package name */
        private volatile boolean f8927p;

        public b(Looper looper, T t10, a<T> aVar, int i10, long j10) {
            super(looper);
            this.f8921i = t10;
            this.f8923k = aVar;
            this.f8919a = i10;
            this.f8922j = j10;
        }

        private void b() {
            t.this.f = null;
        }

        private long c() {
            return Math.min((this.f8925m - 1) * 1000, 5000);
        }

        public final void a(int i10) {
            IOException iOException = this.f8924l;
            if (iOException != null && this.f8925m > i10) {
                throw iOException;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10;
            if (this.f8927p) {
                return;
            }
            int i11 = message.what;
            if (i11 == 0) {
                a();
                return;
            }
            if (i11 != 4) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f8922j;
                if (this.o) {
                    this.f8923k.a((a<T>) this.f8921i, elapsedRealtime, j10, false);
                    return;
                }
                int i12 = message.what;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            IOException iOException = (IOException) message.obj;
                            this.f8924l = iOException;
                            int a10 = this.f8923k.a((a<T>) this.f8921i, elapsedRealtime, j10, iOException);
                            if (a10 == 3) {
                                t.this.f8913g = this.f8924l;
                                return;
                            } else {
                                if (a10 != 2) {
                                    if (a10 == 1) {
                                        i10 = 1;
                                    } else {
                                        i10 = this.f8925m + 1;
                                    }
                                    this.f8925m = i10;
                                    a(Math.min((i10 - 1) * 1000, 5000));
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        this.f8923k.a(this.f8921i, elapsedRealtime, j10);
                        return;
                    } catch (RuntimeException e10) {
                        Log.e(f8914c, "Unexpected exception handling load completed", e10);
                        t.this.f8913g = new g(e10);
                        return;
                    }
                }
                this.f8923k.a((a<T>) this.f8921i, elapsedRealtime, j10, false);
                return;
            }
            throw ((Error) message.obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f8926n = Thread.currentThread();
                if (!this.o) {
                    ad.a("load:".concat(this.f8921i.getClass().getSimpleName()));
                    try {
                        this.f8921i.b();
                        ad.a();
                    } catch (Throwable th) {
                        ad.a();
                        throw th;
                    }
                }
                if (!this.f8927p) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e10) {
                if (!this.f8927p) {
                    obtainMessage(3, e10).sendToTarget();
                }
            } catch (Error e11) {
                Log.e(f8914c, "Unexpected error loading stream", e11);
                if (!this.f8927p) {
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            } catch (InterruptedException unused) {
                com.anythink.expressad.exoplayer.k.a.b(this.o);
                if (!this.f8927p) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e12) {
                Log.e(f8914c, "Unexpected exception loading stream", e12);
                if (!this.f8927p) {
                    obtainMessage(3, new g(e12)).sendToTarget();
                }
            } catch (OutOfMemoryError e13) {
                Log.e(f8914c, "OutOfMemory error loading stream", e13);
                if (!this.f8927p) {
                    obtainMessage(3, new g(e13)).sendToTarget();
                }
            }
        }

        public final void a(long j10) {
            com.anythink.expressad.exoplayer.k.a.b(t.this.f == null);
            t.this.f = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                a();
            }
        }

        public final void a(boolean z10) {
            this.f8927p = z10;
            this.f8924l = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                this.o = true;
                this.f8921i.a();
                if (this.f8926n != null) {
                    this.f8926n.interrupt();
                }
            }
            if (z10) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f8923k.a((a<T>) this.f8921i, elapsedRealtime, elapsedRealtime - this.f8922j, true);
                this.f8923k = null;
            }
        }

        private void a() {
            this.f8924l = null;
            t.this.f8912e.execute(t.this.f);
        }
    }

    public final void b() {
        this.f.a(false);
    }

    public final <T extends c> long a(T t10, a<T> aVar, int i10) {
        Looper myLooper = Looper.myLooper();
        com.anythink.expressad.exoplayer.k.a.b(myLooper != null);
        this.f8913g = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new b(myLooper, t10, aVar, i10, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    public final boolean a() {
        return this.f != null;
    }

    public final void a(d dVar) {
        b<? extends c> bVar = this.f;
        if (bVar != null) {
            bVar.a(true);
        }
        if (dVar != null) {
            this.f8912e.execute(new e(dVar));
        }
        this.f8912e.shutdown();
    }

    @Override // com.anythink.expressad.exoplayer.j.u
    public final void a(int i10) {
        IOException iOException = this.f8913g;
        if (iOException == null) {
            b<? extends c> bVar = this.f;
            if (bVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = bVar.f8919a;
                }
                bVar.a(i10);
                return;
            }
            return;
        }
        throw iOException;
    }
}
