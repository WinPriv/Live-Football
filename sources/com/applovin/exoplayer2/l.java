package com.applovin.exoplayer2;

/* loaded from: classes.dex */
public class l implements aa {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.m f16243a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16244b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16245c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16246d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16247e;
    private final int f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f16248g;

    /* renamed from: h, reason: collision with root package name */
    private final long f16249h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f16250i;

    /* renamed from: j, reason: collision with root package name */
    private int f16251j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16252k;

    public l() {
        this(new com.applovin.exoplayer2.k.m(true, com.anythink.expressad.exoplayer.b.aX), com.anythink.expressad.exoplayer.d.f7614b, com.anythink.expressad.exoplayer.d.f7614b, 2500, 5000, -1, false, 0, false);
    }

    @Override // com.applovin.exoplayer2.aa
    public void a() {
        a(false);
    }

    @Override // com.applovin.exoplayer2.aa
    public void b() {
        a(true);
    }

    @Override // com.applovin.exoplayer2.aa
    public void c() {
        a(true);
    }

    @Override // com.applovin.exoplayer2.aa
    public com.applovin.exoplayer2.k.b d() {
        return this.f16243a;
    }

    @Override // com.applovin.exoplayer2.aa
    public long e() {
        return this.f16249h;
    }

    @Override // com.applovin.exoplayer2.aa
    public boolean f() {
        return this.f16250i;
    }

    public l(com.applovin.exoplayer2.k.m mVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        a(i12, 0, "bufferForPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i11, i10, "maxBufferMs", "minBufferMs");
        a(i15, 0, "backBufferDurationMs", "0");
        this.f16243a = mVar;
        this.f16244b = h.b(i10);
        this.f16245c = h.b(i11);
        this.f16246d = h.b(i12);
        this.f16247e = h.b(i13);
        this.f = i14;
        this.f16251j = i14 == -1 ? com.anythink.expressad.exoplayer.b.aY : i14;
        this.f16248g = z10;
        this.f16249h = h.b(i15);
        this.f16250i = z11;
    }

    @Override // com.applovin.exoplayer2.aa
    public void a(ar[] arVarArr, com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.d[] dVarArr) {
        int i10 = this.f;
        if (i10 == -1) {
            i10 = a(arVarArr, dVarArr);
        }
        this.f16251j = i10;
        this.f16243a.a(i10);
    }

    @Override // com.applovin.exoplayer2.aa
    public boolean a(long j10, long j11, float f) {
        boolean z10 = true;
        boolean z11 = this.f16243a.e() >= this.f16251j;
        long j12 = this.f16244b;
        if (f > 1.0f) {
            j12 = Math.min(com.applovin.exoplayer2.l.ai.a(j12, f), this.f16245c);
        }
        if (j11 < Math.max(j12, 500000L)) {
            if (!this.f16248g && z11) {
                z10 = false;
            }
            this.f16252k = z10;
            if (!z10 && j11 < 500000) {
                com.applovin.exoplayer2.l.q.c("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f16245c || z11) {
            this.f16252k = false;
        }
        return this.f16252k;
    }

    @Override // com.applovin.exoplayer2.aa
    public boolean a(long j10, float f, boolean z10, long j11) {
        long b10 = com.applovin.exoplayer2.l.ai.b(j10, f);
        long j12 = z10 ? this.f16247e : this.f16246d;
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || b10 >= j12 || (!this.f16248g && this.f16243a.e() >= this.f16251j);
    }

    public int a(ar[] arVarArr, com.applovin.exoplayer2.j.d[] dVarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < arVarArr.length; i11++) {
            if (dVarArr[i11] != null) {
                i10 += a(arVarArr[i11].a());
            }
        }
        return Math.max(com.anythink.expressad.exoplayer.b.aY, i10);
    }

    private void a(boolean z10) {
        int i10 = this.f;
        if (i10 == -1) {
            i10 = com.anythink.expressad.exoplayer.b.aY;
        }
        this.f16251j = i10;
        this.f16252k = false;
        if (z10) {
            this.f16243a.d();
        }
    }

    private static int a(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return com.anythink.expressad.exoplayer.b.aY;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private static void a(int i10, int i11, String str, String str2) {
        com.applovin.exoplayer2.l.a.a(i10 >= i11, str + " cannot be less than " + str2);
    }
}
