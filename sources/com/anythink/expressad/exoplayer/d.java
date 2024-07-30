package com.anythink.expressad.exoplayer;

import com.anythink.expressad.exoplayer.k.af;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7613a = 15000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7614b = 50000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7615c = 2500;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7616d = 5000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7617e = -1;
    public static final boolean f = true;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.l f7618g;

    /* renamed from: h, reason: collision with root package name */
    private final long f7619h;

    /* renamed from: i, reason: collision with root package name */
    private final long f7620i;

    /* renamed from: j, reason: collision with root package name */
    private final long f7621j;

    /* renamed from: k, reason: collision with root package name */
    private final long f7622k;

    /* renamed from: l, reason: collision with root package name */
    private final int f7623l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f7624m;

    /* renamed from: n, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.k.v f7625n;
    private int o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7626p;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.exoplayer.j.l f7627a = null;

        /* renamed from: b, reason: collision with root package name */
        private int f7628b = d.f7613a;

        /* renamed from: c, reason: collision with root package name */
        private int f7629c = d.f7614b;

        /* renamed from: d, reason: collision with root package name */
        private int f7630d = 2500;

        /* renamed from: e, reason: collision with root package name */
        private int f7631e = 5000;
        private int f = -1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f7632g = true;

        /* renamed from: h, reason: collision with root package name */
        private com.anythink.expressad.exoplayer.k.v f7633h = null;

        private a a(com.anythink.expressad.exoplayer.j.l lVar) {
            this.f7627a = lVar;
            return this;
        }

        private a a(int i10, int i11, int i12, int i13) {
            this.f7628b = i10;
            this.f7629c = i11;
            this.f7630d = i12;
            this.f7631e = i13;
            return this;
        }

        private a a(int i10) {
            this.f = i10;
            return this;
        }

        private a a(boolean z10) {
            this.f7632g = z10;
            return this;
        }

        private a a(com.anythink.expressad.exoplayer.k.v vVar) {
            this.f7633h = vVar;
            return this;
        }

        private d a() {
            if (this.f7627a == null) {
                this.f7627a = new com.anythink.expressad.exoplayer.j.l((byte) 0);
            }
            return new d(this.f7627a, this.f7628b, this.f7629c, this.f7630d, this.f7631e, this.f, this.f7632g, this.f7633h);
        }
    }

    public d() {
        this(new com.anythink.expressad.exoplayer.j.l((byte) 0));
    }

    @Override // com.anythink.expressad.exoplayer.p
    public final void a() {
        a(false);
    }

    @Override // com.anythink.expressad.exoplayer.p
    public final void b() {
        a(true);
    }

    @Override // com.anythink.expressad.exoplayer.p
    public final void c() {
        a(true);
    }

    @Override // com.anythink.expressad.exoplayer.p
    public final com.anythink.expressad.exoplayer.j.b d() {
        return this.f7618g;
    }

    @Override // com.anythink.expressad.exoplayer.p
    public final long e() {
        return 0L;
    }

    @Override // com.anythink.expressad.exoplayer.p
    public final boolean f() {
        return false;
    }

    @Deprecated
    private d(com.anythink.expressad.exoplayer.j.l lVar) {
        this(lVar, (byte) 0);
    }

    private static int b(y[] yVarArr, com.anythink.expressad.exoplayer.i.g gVar) {
        int i10 = 0;
        for (int i11 = 0; i11 < yVarArr.length; i11++) {
            if (gVar.a(i11) != null) {
                i10 = af.g(yVarArr[i11].a()) + i10;
            }
        }
        return i10;
    }

    @Override // com.anythink.expressad.exoplayer.p
    public final void a(y[] yVarArr, com.anythink.expressad.exoplayer.i.g gVar) {
        int i10 = this.f7623l;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < yVarArr.length; i12++) {
                if (gVar.a(i12) != null) {
                    i11 += af.g(yVarArr[i12].a());
                }
            }
            i10 = i11;
        }
        this.o = i10;
        this.f7618g.a(i10);
    }

    @Deprecated
    private d(com.anythink.expressad.exoplayer.j.l lVar, byte b10) {
        this(lVar, f7613a, f7614b, 2500, 5000, -1, true, null);
    }

    @Deprecated
    public d(com.anythink.expressad.exoplayer.j.l lVar, int i10, int i11, int i12, int i13, int i14, boolean z10, com.anythink.expressad.exoplayer.k.v vVar) {
        a(i12, 0, "bufferForPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i11, i10, "maxBufferMs", "minBufferMs");
        this.f7618g = lVar;
        this.f7619h = i10 * 1000;
        this.f7620i = i11 * 1000;
        this.f7621j = i12 * 1000;
        this.f7622k = i13 * 1000;
        this.f7623l = i14;
        this.f7624m = z10;
        this.f7625n = vVar;
    }

    @Override // com.anythink.expressad.exoplayer.p
    public final boolean a(long j10, float f10) {
        boolean z10;
        boolean z11 = true;
        boolean z12 = this.f7618g.c() >= this.o;
        boolean z13 = this.f7626p;
        long j11 = this.f7619h;
        if (f10 > 1.0f) {
            j11 = Math.min(af.a(j11, f10), this.f7620i);
        }
        if (j10 < j11) {
            if (!this.f7624m && z12) {
                z11 = false;
            }
            this.f7626p = z11;
        } else if (j10 > this.f7620i || z12) {
            this.f7626p = false;
        }
        com.anythink.expressad.exoplayer.k.v vVar = this.f7625n;
        if (vVar != null && (z10 = this.f7626p) != z13) {
            if (z10) {
                vVar.a();
            } else {
                vVar.c();
            }
        }
        return this.f7626p;
    }

    @Override // com.anythink.expressad.exoplayer.p
    public final boolean a(long j10, float f10, boolean z10) {
        long b10 = af.b(j10, f10);
        long j11 = z10 ? this.f7622k : this.f7621j;
        if (j11 <= 0 || b10 >= j11) {
            return true;
        }
        return !this.f7624m && this.f7618g.c() >= this.o;
    }

    private void a(boolean z10) {
        this.o = 0;
        com.anythink.expressad.exoplayer.k.v vVar = this.f7625n;
        if (vVar != null && this.f7626p) {
            vVar.c();
        }
        this.f7626p = false;
        if (z10) {
            this.f7618g.e();
        }
    }

    private static void a(int i10, int i11, String str, String str2) {
        com.anythink.expressad.exoplayer.k.a.a(i10 >= i11, str + " cannot be less than " + str2);
    }
}
