package com.applovin.exoplayer2.m;

import java.util.Arrays;

/* loaded from: classes.dex */
final class e {

    /* renamed from: c, reason: collision with root package name */
    private boolean f16451c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16452d;
    private int f;

    /* renamed from: a, reason: collision with root package name */
    private a f16449a = new a();

    /* renamed from: b, reason: collision with root package name */
    private a f16450b = new a();

    /* renamed from: e, reason: collision with root package name */
    private long f16453e = com.anythink.expressad.exoplayer.b.f7291b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f16454a;

        /* renamed from: b, reason: collision with root package name */
        private long f16455b;

        /* renamed from: c, reason: collision with root package name */
        private long f16456c;

        /* renamed from: d, reason: collision with root package name */
        private long f16457d;

        /* renamed from: e, reason: collision with root package name */
        private long f16458e;
        private long f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f16459g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f16460h;

        public void a() {
            this.f16457d = 0L;
            this.f16458e = 0L;
            this.f = 0L;
            this.f16460h = 0;
            Arrays.fill(this.f16459g, false);
        }

        public boolean b() {
            return this.f16457d > 15 && this.f16460h == 0;
        }

        public boolean c() {
            long j10 = this.f16457d;
            if (j10 == 0) {
                return false;
            }
            return this.f16459g[b(j10 - 1)];
        }

        public long d() {
            return this.f;
        }

        public long e() {
            long j10 = this.f16458e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f / j10;
        }

        private static int b(long j10) {
            return (int) (j10 % 15);
        }

        public void a(long j10) {
            long j11 = this.f16457d;
            if (j11 == 0) {
                this.f16454a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f16454a;
                this.f16455b = j12;
                this.f = j12;
                this.f16458e = 1L;
            } else {
                long j13 = j10 - this.f16456c;
                int b10 = b(j11);
                if (Math.abs(j13 - this.f16455b) <= 1000000) {
                    this.f16458e++;
                    this.f += j13;
                    boolean[] zArr = this.f16459g;
                    if (zArr[b10]) {
                        zArr[b10] = false;
                        this.f16460h--;
                    }
                } else {
                    boolean[] zArr2 = this.f16459g;
                    if (!zArr2[b10]) {
                        zArr2[b10] = true;
                        this.f16460h++;
                    }
                }
            }
            this.f16457d++;
            this.f16456c = j10;
        }
    }

    public void a() {
        this.f16449a.a();
        this.f16450b.a();
        this.f16451c = false;
        this.f16453e = com.anythink.expressad.exoplayer.b.f7291b;
        this.f = 0;
    }

    public boolean b() {
        return this.f16449a.b();
    }

    public int c() {
        return this.f;
    }

    public long d() {
        if (b()) {
            return this.f16449a.d();
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    public long e() {
        if (b()) {
            return this.f16449a.e();
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    public float f() {
        if (b()) {
            return (float) (1.0E9d / this.f16449a.e());
        }
        return -1.0f;
    }

    public void a(long j10) {
        this.f16449a.a(j10);
        if (this.f16449a.b() && !this.f16452d) {
            this.f16451c = false;
        } else if (this.f16453e != com.anythink.expressad.exoplayer.b.f7291b) {
            if (!this.f16451c || this.f16450b.c()) {
                this.f16450b.a();
                this.f16450b.a(this.f16453e);
            }
            this.f16451c = true;
            this.f16450b.a(j10);
        }
        if (this.f16451c && this.f16450b.b()) {
            a aVar = this.f16449a;
            this.f16449a = this.f16450b;
            this.f16450b = aVar;
            this.f16451c = false;
            this.f16452d = false;
        }
        this.f16453e = j10;
        this.f = this.f16449a.b() ? 0 : this.f + 1;
    }
}
