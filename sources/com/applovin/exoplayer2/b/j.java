package com.applovin.exoplayer2.b;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.applovin.exoplayer2.l.ai;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class j {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a, reason: collision with root package name */
    private final a f13409a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f13410b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f13411c;

    /* renamed from: d, reason: collision with root package name */
    private int f13412d;

    /* renamed from: e, reason: collision with root package name */
    private int f13413e;
    private i f;

    /* renamed from: g, reason: collision with root package name */
    private int f13414g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13415h;

    /* renamed from: i, reason: collision with root package name */
    private long f13416i;

    /* renamed from: j, reason: collision with root package name */
    private float f13417j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13418k;

    /* renamed from: l, reason: collision with root package name */
    private long f13419l;

    /* renamed from: m, reason: collision with root package name */
    private long f13420m;

    /* renamed from: n, reason: collision with root package name */
    private Method f13421n;
    private long o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13422p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13423q;

    /* renamed from: r, reason: collision with root package name */
    private long f13424r;

    /* renamed from: s, reason: collision with root package name */
    private long f13425s;

    /* renamed from: t, reason: collision with root package name */
    private long f13426t;

    /* renamed from: u, reason: collision with root package name */
    private long f13427u;

    /* renamed from: v, reason: collision with root package name */
    private int f13428v;

    /* renamed from: w, reason: collision with root package name */
    private int f13429w;

    /* renamed from: x, reason: collision with root package name */
    private long f13430x;
    private long y;

    /* renamed from: z, reason: collision with root package name */
    private long f13431z;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, long j10);

        void a(long j10);

        void a(long j10, long j11, long j12, long j13);

        void b(long j10);

        void b(long j10, long j11, long j12, long j13);
    }

    public j(a aVar) {
        this.f13409a = (a) com.applovin.exoplayer2.l.a.b(aVar);
        if (ai.f16274a >= 18) {
            try {
                this.f13421n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f13410b = new long[10];
    }

    private void g(long j10) {
        Method method;
        if (!this.f13423q || (method = this.f13421n) == null || j10 - this.f13424r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) ai.a((Integer) method.invoke(com.applovin.exoplayer2.l.a.b(this.f13411c), new Object[0]))).intValue() * 1000) - this.f13416i;
            this.o = intValue;
            long max = Math.max(intValue, 0L);
            this.o = max;
            if (max > 5000000) {
                this.f13409a.b(max);
                this.o = 0L;
            }
        } catch (Exception unused) {
            this.f13421n = null;
        }
        this.f13424r = j10;
    }

    private long h(long j10) {
        return (j10 * 1000000) / this.f13414g;
    }

    private long i() {
        AudioTrack audioTrack = (AudioTrack) com.applovin.exoplayer2.l.a.b(this.f13411c);
        if (this.f13430x != com.anythink.expressad.exoplayer.b.f7291b) {
            return Math.min(this.A, this.f13431z + ((((SystemClock.elapsedRealtime() * 1000) - this.f13430x) * this.f13414g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f13415h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f13427u = this.f13425s;
            }
            playbackHeadPosition += this.f13427u;
        }
        if (ai.f16274a <= 29) {
            if (playbackHeadPosition == 0 && this.f13425s > 0 && playState == 3) {
                if (this.y == com.anythink.expressad.exoplayer.b.f7291b) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.f13425s;
            }
            this.y = com.anythink.expressad.exoplayer.b.f7291b;
        }
        if (this.f13425s > playbackHeadPosition) {
            this.f13426t++;
        }
        this.f13425s = playbackHeadPosition;
        return playbackHeadPosition + (this.f13426t << 32);
    }

    public void a(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f13411c = audioTrack;
        this.f13412d = i11;
        this.f13413e = i12;
        this.f = new i(audioTrack);
        this.f13414g = audioTrack.getSampleRate();
        this.f13415h = z10 && a(i10);
        boolean d10 = ai.d(i10);
        this.f13423q = d10;
        this.f13416i = d10 ? h(i12 / i11) : -9223372036854775807L;
        this.f13425s = 0L;
        this.f13426t = 0L;
        this.f13427u = 0L;
        this.f13422p = false;
        this.f13430x = com.anythink.expressad.exoplayer.b.f7291b;
        this.y = com.anythink.expressad.exoplayer.b.f7291b;
        this.f13424r = 0L;
        this.o = 0L;
        this.f13417j = 1.0f;
    }

    public boolean b() {
        return ((AudioTrack) com.applovin.exoplayer2.l.a.b(this.f13411c)).getPlayState() == 3;
    }

    public long c(long j10) {
        return com.applovin.exoplayer2.h.a(h(j10 - i()));
    }

    public boolean d(long j10) {
        return this.y != com.anythink.expressad.exoplayer.b.f7291b && j10 > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public void e(long j10) {
        this.f13431z = i();
        this.f13430x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public boolean f(long j10) {
        return j10 > i() || g();
    }

    private void f() {
        this.f13419l = 0L;
        this.f13429w = 0;
        this.f13428v = 0;
        this.f13420m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f13418k = false;
    }

    private long h() {
        return h(i());
    }

    public int b(long j10) {
        return this.f13413e - ((int) (j10 - (i() * this.f13412d)));
    }

    public boolean c() {
        f();
        if (this.f13430x != com.anythink.expressad.exoplayer.b.f7291b) {
            return false;
        }
        ((i) com.applovin.exoplayer2.l.a.b(this.f)).d();
        return true;
    }

    public void d() {
        f();
        this.f13411c = null;
        this.f = null;
    }

    private void e() {
        long h10 = h();
        if (h10 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f13420m >= 30000) {
            long[] jArr = this.f13410b;
            int i10 = this.f13428v;
            jArr[i10] = h10 - nanoTime;
            this.f13428v = (i10 + 1) % 10;
            int i11 = this.f13429w;
            if (i11 < 10) {
                this.f13429w = i11 + 1;
            }
            this.f13420m = nanoTime;
            this.f13419l = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f13429w;
                if (i12 >= i13) {
                    break;
                }
                this.f13419l = (this.f13410b[i12] / i13) + this.f13419l;
                i12++;
            }
        }
        if (this.f13415h) {
            return;
        }
        a(nanoTime, h10);
        g(nanoTime);
    }

    private boolean g() {
        return this.f13415h && ((AudioTrack) com.applovin.exoplayer2.l.a.b(this.f13411c)).getPlayState() == 2 && i() == 0;
    }

    public void a(float f) {
        this.f13417j = f;
        i iVar = this.f;
        if (iVar != null) {
            iVar.d();
        }
    }

    public long a(boolean z10) {
        long j10;
        long j11;
        if (((AudioTrack) com.applovin.exoplayer2.l.a.b(this.f13411c)).getPlayState() == 3) {
            e();
        }
        long nanoTime = System.nanoTime() / 1000;
        i iVar = (i) com.applovin.exoplayer2.l.a.b(this.f);
        boolean c10 = iVar.c();
        if (c10) {
            j11 = ai.a(nanoTime - iVar.e(), this.f13417j) + h(iVar.f());
        } else {
            if (this.f13429w == 0) {
                j10 = h();
            } else {
                j10 = this.f13419l + nanoTime;
            }
            j11 = j10;
            if (!z10) {
                j11 = Math.max(0L, j11 - this.o);
            }
        }
        if (this.D != c10) {
            this.F = this.C;
            this.E = this.B;
        }
        long j12 = nanoTime - this.F;
        if (j12 < 1000000) {
            long a10 = ai.a(j12, this.f13417j) + this.E;
            long j13 = (j12 * 1000) / 1000000;
            j11 = (((1000 - j13) * a10) + (j11 * j13)) / 1000;
        }
        if (!this.f13418k) {
            long j14 = this.B;
            if (j11 > j14) {
                this.f13418k = true;
                this.f13409a.a(System.currentTimeMillis() - com.applovin.exoplayer2.h.a(ai.b(com.applovin.exoplayer2.h.a(j11 - j14), this.f13417j)));
            }
        }
        this.C = nanoTime;
        this.B = j11;
        this.D = c10;
        return j11;
    }

    public void a() {
        ((i) com.applovin.exoplayer2.l.a.b(this.f)).d();
    }

    public boolean a(long j10) {
        int playState = ((AudioTrack) com.applovin.exoplayer2.l.a.b(this.f13411c)).getPlayState();
        if (this.f13415h) {
            if (playState == 2) {
                this.f13422p = false;
                return false;
            }
            if (playState == 1 && i() == 0) {
                return false;
            }
        }
        boolean z10 = this.f13422p;
        boolean f = f(j10);
        this.f13422p = f;
        if (z10 && !f && playState != 1) {
            this.f13409a.a(this.f13413e, com.applovin.exoplayer2.h.a(this.f13416i));
        }
        return true;
    }

    private void a(long j10, long j11) {
        i iVar = (i) com.applovin.exoplayer2.l.a.b(this.f);
        if (iVar.a(j10)) {
            long e10 = iVar.e();
            long f = iVar.f();
            if (Math.abs(e10 - j10) > 5000000) {
                this.f13409a.b(f, e10, j10, j11);
                iVar.a();
            } else if (Math.abs(h(f) - j11) > 5000000) {
                this.f13409a.a(f, e10, j10, j11);
                iVar.a();
            } else {
                iVar.b();
            }
        }
    }

    private static boolean a(int i10) {
        return ai.f16274a < 23 && (i10 == 5 || i10 == 6);
    }
}
