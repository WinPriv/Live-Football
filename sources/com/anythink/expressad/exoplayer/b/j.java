package com.anythink.expressad.exoplayer.b;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.anythink.expressad.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7391a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7392b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7393c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static final long f7394d = 5000000;

    /* renamed from: e, reason: collision with root package name */
    private static final long f7395e = 5000000;
    private static final long f = 200;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7396g = 10;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7397h = 30000;

    /* renamed from: i, reason: collision with root package name */
    private static final int f7398i = 500000;
    private long A;
    private long B;
    private int C;
    private int D;
    private long E;
    private long F;
    private long G;
    private long H;

    /* renamed from: j, reason: collision with root package name */
    private final a f7399j;

    /* renamed from: k, reason: collision with root package name */
    private final long[] f7400k;

    /* renamed from: l, reason: collision with root package name */
    private AudioTrack f7401l;

    /* renamed from: m, reason: collision with root package name */
    private int f7402m;

    /* renamed from: n, reason: collision with root package name */
    private int f7403n;
    private i o;

    /* renamed from: p, reason: collision with root package name */
    private int f7404p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f7405q;

    /* renamed from: r, reason: collision with root package name */
    private long f7406r;

    /* renamed from: s, reason: collision with root package name */
    private long f7407s;

    /* renamed from: t, reason: collision with root package name */
    private long f7408t;

    /* renamed from: u, reason: collision with root package name */
    private Method f7409u;

    /* renamed from: v, reason: collision with root package name */
    private long f7410v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f7411w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f7412x;
    private long y;

    /* renamed from: z, reason: collision with root package name */
    private long f7413z;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, long j10);

        void a(long j10);

        void a(long j10, long j11, long j12, long j13);

        void b(long j10, long j11, long j12, long j13);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public j(a aVar) {
        this.f7399j = (a) com.anythink.expressad.exoplayer.k.a.a(aVar);
        if (af.f8993a >= 18) {
            try {
                this.f7409u = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f7400k = new long[10];
    }

    private void f(long j10) {
        Method method;
        if (!this.f7412x || (method = this.f7409u) == null || j10 - this.y < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) method.invoke(this.f7401l, null)).intValue() * 1000) - this.f7406r;
            this.f7410v = intValue;
            long max = Math.max(intValue, 0L);
            this.f7410v = max;
            if (max > 5000000) {
                this.f7399j.a(max);
                this.f7410v = 0L;
            }
        } catch (Exception unused) {
            this.f7409u = null;
        }
        this.y = j10;
    }

    private long g(long j10) {
        return (j10 * 1000000) / this.f7404p;
    }

    private long h() {
        return g(i());
    }

    private long i() {
        if (this.E != com.anythink.expressad.exoplayer.b.f7291b) {
            return Math.min(this.H, this.G + ((((SystemClock.elapsedRealtime() * 1000) - this.E) * this.f7404p) / 1000000));
        }
        int playState = this.f7401l.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f7401l.getPlaybackHeadPosition() & 4294967295L;
        if (this.f7405q) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.B = this.f7413z;
            }
            playbackHeadPosition += this.B;
        }
        if (af.f8993a <= 28) {
            if (playbackHeadPosition == 0 && this.f7413z > 0 && playState == 3) {
                if (this.F == com.anythink.expressad.exoplayer.b.f7291b) {
                    this.F = SystemClock.elapsedRealtime();
                }
                return this.f7413z;
            }
            this.F = com.anythink.expressad.exoplayer.b.f7291b;
        }
        if (this.f7413z > playbackHeadPosition) {
            this.A++;
        }
        this.f7413z = playbackHeadPosition;
        return playbackHeadPosition + (this.A << 32);
    }

    public final void a(AudioTrack audioTrack, int i10, int i11, int i12) {
        this.f7401l = audioTrack;
        this.f7402m = i11;
        this.f7403n = i12;
        this.o = new i(audioTrack);
        this.f7404p = audioTrack.getSampleRate();
        this.f7405q = af.f8993a < 23 && (i10 == 5 || i10 == 6);
        boolean b10 = af.b(i10);
        this.f7412x = b10;
        this.f7406r = b10 ? g(i12 / i11) : -9223372036854775807L;
        this.f7413z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.f7411w = false;
        this.E = com.anythink.expressad.exoplayer.b.f7291b;
        this.F = com.anythink.expressad.exoplayer.b.f7291b;
        this.f7410v = 0L;
    }

    public final boolean b() {
        return this.f7401l.getPlayState() == 3;
    }

    public final boolean c(long j10) {
        return this.F != com.anythink.expressad.exoplayer.b.f7291b && j10 > 0 && SystemClock.elapsedRealtime() - this.F >= f;
    }

    public final void d(long j10) {
        this.G = i();
        this.E = SystemClock.elapsedRealtime() * 1000;
        this.H = j10;
    }

    public final boolean e(long j10) {
        return j10 > i() || g();
    }

    private boolean g() {
        return this.f7405q && this.f7401l.getPlayState() == 2 && i() == 0;
    }

    public final int b(long j10) {
        return this.f7403n - ((int) (j10 - (i() * this.f7402m)));
    }

    private void e() {
        long h10 = h();
        if (h10 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f7408t >= 30000) {
            long[] jArr = this.f7400k;
            int i10 = this.C;
            jArr[i10] = h10 - nanoTime;
            this.C = (i10 + 1) % 10;
            int i11 = this.D;
            if (i11 < 10) {
                this.D = i11 + 1;
            }
            this.f7408t = nanoTime;
            this.f7407s = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.D;
                if (i12 >= i13) {
                    break;
                }
                this.f7407s = (this.f7400k[i12] / i13) + this.f7407s;
                i12++;
            }
        }
        if (this.f7405q) {
            return;
        }
        if (this.o.a(nanoTime)) {
            long f10 = this.o.f();
            long g6 = this.o.g();
            if (Math.abs(f10 - nanoTime) > 5000000) {
                this.f7399j.b(g6, f10, nanoTime, h10);
                this.o.a();
            } else if (Math.abs(g(g6) - h10) > 5000000) {
                this.f7399j.a(g6, f10, nanoTime, h10);
                this.o.a();
            } else {
                this.o.b();
            }
        }
        f(nanoTime);
    }

    public final boolean c() {
        f();
        if (this.E != com.anythink.expressad.exoplayer.b.f7291b) {
            return false;
        }
        this.o.e();
        return true;
    }

    public final void d() {
        f();
        this.f7401l = null;
        this.o = null;
    }

    private void f() {
        this.f7407s = 0L;
        this.D = 0;
        this.C = 0;
        this.f7408t = 0L;
    }

    public final long a(boolean z10) {
        long j10;
        if (this.f7401l.getPlayState() == 3) {
            long h10 = h();
            if (h10 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f7408t >= 30000) {
                    long[] jArr = this.f7400k;
                    int i10 = this.C;
                    jArr[i10] = h10 - nanoTime;
                    this.C = (i10 + 1) % 10;
                    int i11 = this.D;
                    if (i11 < 10) {
                        this.D = i11 + 1;
                    }
                    this.f7408t = nanoTime;
                    this.f7407s = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.D;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f7407s = (this.f7400k[i12] / i13) + this.f7407s;
                        i12++;
                    }
                }
                if (!this.f7405q) {
                    if (this.o.a(nanoTime)) {
                        long f10 = this.o.f();
                        long g6 = this.o.g();
                        if (Math.abs(f10 - nanoTime) > 5000000) {
                            this.f7399j.b(g6, f10, nanoTime, h10);
                            this.o.a();
                        } else if (Math.abs(g(g6) - h10) > 5000000) {
                            this.f7399j.a(g6, f10, nanoTime, h10);
                            this.o.a();
                        } else {
                            this.o.b();
                        }
                    }
                    f(nanoTime);
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.o.c()) {
            long g10 = g(this.o.g());
            return !this.o.d() ? g10 : (nanoTime2 - this.o.f()) + g10;
        }
        if (this.D == 0) {
            j10 = h();
        } else {
            j10 = nanoTime2 + this.f7407s;
        }
        return !z10 ? j10 - this.f7410v : j10;
    }

    public final void a() {
        this.o.e();
    }

    public final boolean a(long j10) {
        a aVar;
        int playState = this.f7401l.getPlayState();
        if (this.f7405q) {
            if (playState == 2) {
                this.f7411w = false;
                return false;
            }
            if (playState == 1 && i() == 0) {
                return false;
            }
        }
        boolean z10 = this.f7411w;
        boolean e10 = e(j10);
        this.f7411w = e10;
        if (z10 && !e10 && playState != 1 && (aVar = this.f7399j) != null) {
            aVar.a(this.f7403n, com.anythink.expressad.exoplayer.b.a(this.f7406r));
        }
        return true;
    }

    private void a(long j10, long j11) {
        if (this.o.a(j10)) {
            long f10 = this.o.f();
            long g6 = this.o.g();
            if (Math.abs(f10 - j10) > 5000000) {
                this.f7399j.b(g6, f10, j10, j11);
                this.o.a();
            } else if (Math.abs(g(g6) - j11) > 5000000) {
                this.f7399j.a(g6, f10, j10, j11);
                this.o.a();
            } else {
                this.o.b();
            }
        }
    }

    private static boolean a(int i10) {
        if (af.f8993a < 23) {
            return i10 == 5 || i10 == 6;
        }
        return false;
    }
}
