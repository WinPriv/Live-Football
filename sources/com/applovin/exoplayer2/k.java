package com.applovin.exoplayer2;

import android.os.SystemClock;
import com.applovin.exoplayer2.ab;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public final class k implements z {

    /* renamed from: a, reason: collision with root package name */
    private final float f16028a;

    /* renamed from: b, reason: collision with root package name */
    private final float f16029b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16030c;

    /* renamed from: d, reason: collision with root package name */
    private final float f16031d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16032e;
    private final long f;

    /* renamed from: g, reason: collision with root package name */
    private final float f16033g;

    /* renamed from: h, reason: collision with root package name */
    private long f16034h;

    /* renamed from: i, reason: collision with root package name */
    private long f16035i;

    /* renamed from: j, reason: collision with root package name */
    private long f16036j;

    /* renamed from: k, reason: collision with root package name */
    private long f16037k;

    /* renamed from: l, reason: collision with root package name */
    private long f16038l;

    /* renamed from: m, reason: collision with root package name */
    private long f16039m;

    /* renamed from: n, reason: collision with root package name */
    private float f16040n;
    private float o;

    /* renamed from: p, reason: collision with root package name */
    private float f16041p;

    /* renamed from: q, reason: collision with root package name */
    private long f16042q;

    /* renamed from: r, reason: collision with root package name */
    private long f16043r;

    /* renamed from: s, reason: collision with root package name */
    private long f16044s;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private float f16045a = 0.97f;

        /* renamed from: b, reason: collision with root package name */
        private float f16046b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        private long f16047c = 1000;

        /* renamed from: d, reason: collision with root package name */
        private float f16048d = 1.0E-7f;

        /* renamed from: e, reason: collision with root package name */
        private long f16049e = h.b(20L);
        private long f = h.b(500L);

        /* renamed from: g, reason: collision with root package name */
        private float f16050g = 0.999f;

        public k a() {
            return new k(this.f16045a, this.f16046b, this.f16047c, this.f16048d, this.f16049e, this.f, this.f16050g);
        }
    }

    private static long a(long j10, long j11, float f) {
        return ((1.0f - f) * ((float) j11)) + (((float) j10) * f);
    }

    private void c() {
        long j10 = this.f16034h;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            long j11 = this.f16035i;
            if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
                j10 = j11;
            }
            long j12 = this.f16037k;
            if (j12 != com.anythink.expressad.exoplayer.b.f7291b && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f16038l;
            if (j13 != com.anythink.expressad.exoplayer.b.f7291b && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f16036j == j10) {
            return;
        }
        this.f16036j = j10;
        this.f16039m = j10;
        this.f16043r = com.anythink.expressad.exoplayer.b.f7291b;
        this.f16044s = com.anythink.expressad.exoplayer.b.f7291b;
        this.f16042q = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.z
    public long b() {
        return this.f16039m;
    }

    private k(float f, float f10, long j10, float f11, long j11, long j12, float f12) {
        this.f16028a = f;
        this.f16029b = f10;
        this.f16030c = j10;
        this.f16031d = f11;
        this.f16032e = j11;
        this.f = j12;
        this.f16033g = f12;
        this.f16034h = com.anythink.expressad.exoplayer.b.f7291b;
        this.f16035i = com.anythink.expressad.exoplayer.b.f7291b;
        this.f16037k = com.anythink.expressad.exoplayer.b.f7291b;
        this.f16038l = com.anythink.expressad.exoplayer.b.f7291b;
        this.o = f;
        this.f16040n = f10;
        this.f16041p = 1.0f;
        this.f16042q = com.anythink.expressad.exoplayer.b.f7291b;
        this.f16036j = com.anythink.expressad.exoplayer.b.f7291b;
        this.f16039m = com.anythink.expressad.exoplayer.b.f7291b;
        this.f16043r = com.anythink.expressad.exoplayer.b.f7291b;
        this.f16044s = com.anythink.expressad.exoplayer.b.f7291b;
    }

    private void b(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f16043r;
        if (j13 == com.anythink.expressad.exoplayer.b.f7291b) {
            this.f16043r = j12;
            this.f16044s = 0L;
        } else {
            long max = Math.max(j12, a(j13, j12, this.f16033g));
            this.f16043r = max;
            this.f16044s = a(this.f16044s, Math.abs(j12 - max), this.f16033g);
        }
    }

    @Override // com.applovin.exoplayer2.z
    public void a(ab.e eVar) {
        this.f16034h = h.b(eVar.f13067b);
        this.f16037k = h.b(eVar.f13068c);
        this.f16038l = h.b(eVar.f13069d);
        float f = eVar.f13070e;
        if (f == -3.4028235E38f) {
            f = this.f16028a;
        }
        this.o = f;
        float f10 = eVar.f;
        if (f10 == -3.4028235E38f) {
            f10 = this.f16029b;
        }
        this.f16040n = f10;
        c();
    }

    @Override // com.applovin.exoplayer2.z
    public void a(long j10) {
        this.f16035i = j10;
        c();
    }

    private void b(long j10) {
        long j11 = (this.f16044s * 3) + this.f16043r;
        if (this.f16039m > j11) {
            float b10 = (float) h.b(this.f16030c);
            this.f16039m = com.applovin.exoplayer2.common.b.d.a(j11, this.f16036j, this.f16039m - (((this.f16041p - 1.0f) * b10) + ((this.f16040n - 1.0f) * b10)));
            return;
        }
        long a10 = com.applovin.exoplayer2.l.ai.a(j10 - (Math.max(gl.Code, this.f16041p - 1.0f) / this.f16031d), this.f16039m, j11);
        this.f16039m = a10;
        long j12 = this.f16038l;
        if (j12 == com.anythink.expressad.exoplayer.b.f7291b || a10 <= j12) {
            return;
        }
        this.f16039m = j12;
    }

    @Override // com.applovin.exoplayer2.z
    public void a() {
        long j10 = this.f16039m;
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return;
        }
        long j11 = j10 + this.f;
        this.f16039m = j11;
        long j12 = this.f16038l;
        if (j12 != com.anythink.expressad.exoplayer.b.f7291b && j11 > j12) {
            this.f16039m = j12;
        }
        this.f16042q = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.z
    public float a(long j10, long j11) {
        if (this.f16034h == com.anythink.expressad.exoplayer.b.f7291b) {
            return 1.0f;
        }
        b(j10, j11);
        if (this.f16042q != com.anythink.expressad.exoplayer.b.f7291b && SystemClock.elapsedRealtime() - this.f16042q < this.f16030c) {
            return this.f16041p;
        }
        this.f16042q = SystemClock.elapsedRealtime();
        b(j10);
        long j12 = j10 - this.f16039m;
        if (Math.abs(j12) < this.f16032e) {
            this.f16041p = 1.0f;
        } else {
            this.f16041p = com.applovin.exoplayer2.l.ai.a((this.f16031d * ((float) j12)) + 1.0f, this.o, this.f16040n);
        }
        return this.f16041p;
    }
}
