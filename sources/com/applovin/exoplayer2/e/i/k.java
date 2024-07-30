package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: c, reason: collision with root package name */
    private static final double[] f14672c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f14673a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14674b;

    /* renamed from: d, reason: collision with root package name */
    private final af f14675d;

    /* renamed from: e, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14676e;
    private final r f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f14677g;

    /* renamed from: h, reason: collision with root package name */
    private final a f14678h;

    /* renamed from: i, reason: collision with root package name */
    private long f14679i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14680j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14681k;

    /* renamed from: l, reason: collision with root package name */
    private long f14682l;

    /* renamed from: m, reason: collision with root package name */
    private long f14683m;

    /* renamed from: n, reason: collision with root package name */
    private long f14684n;
    private long o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14685p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f14686q;

    public k() {
        this(null);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        com.applovin.exoplayer2.l.v.a(this.f14677g);
        this.f14678h.a();
        r rVar = this.f;
        if (rVar != null) {
            rVar.a();
        }
        this.f14679i = 0L;
        this.f14680j = false;
        this.f14683m = com.anythink.expressad.exoplayer.b.f7291b;
        this.o = com.anythink.expressad.exoplayer.b.f7291b;
    }

    public k(af afVar) {
        this.f14675d = afVar;
        this.f14677g = new boolean[4];
        this.f14678h = new a(128);
        if (afVar != null) {
            this.f = new r(178, 128);
            this.f14676e = new com.applovin.exoplayer2.l.y();
        } else {
            this.f = null;
            this.f14676e = null;
        }
        this.f14683m = com.anythink.expressad.exoplayer.b.f7291b;
        this.o = com.anythink.expressad.exoplayer.b.f7291b;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final byte[] f14687d = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public int f14688a;

        /* renamed from: b, reason: collision with root package name */
        public int f14689b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f14690c;

        /* renamed from: e, reason: collision with root package name */
        private boolean f14691e;

        public a(int i10) {
            this.f14690c = new byte[i10];
        }

        public void a() {
            this.f14691e = false;
            this.f14688a = 0;
            this.f14689b = 0;
        }

        public boolean a(int i10, int i11) {
            if (this.f14691e) {
                int i12 = this.f14688a - i11;
                this.f14688a = i12;
                if (this.f14689b == 0 && i10 == 181) {
                    this.f14689b = i12;
                } else {
                    this.f14691e = false;
                    return true;
                }
            } else if (i10 == 179) {
                this.f14691e = true;
            }
            byte[] bArr = f14687d;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f14691e) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f14690c;
                int length = bArr2.length;
                int i13 = this.f14688a;
                if (length < i13 + i12) {
                    this.f14690c = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f14690c, this.f14688a, i12);
                this.f14688a += i12;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f14673a = dVar.c();
        this.f14674b = jVar.a(dVar.b(), 2);
        af afVar = this.f14675d;
        if (afVar != null) {
            afVar.a(jVar, dVar);
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        this.f14683m = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    @Override // com.applovin.exoplayer2.e.i.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.applovin.exoplayer2.l.y r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.k.a(com.applovin.exoplayer2.l.y):void");
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair<com.applovin.exoplayer2.v, java.lang.Long> a(com.applovin.exoplayer2.e.i.k.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f14690c
            int r1 = r8.f14688a
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L37
            if (r6 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L31:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L42
        L37:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L42
        L3d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L42:
            float r6 = (float) r6
            float r1 = r1 / r6
        L44:
            com.applovin.exoplayer2.v$a r6 = new com.applovin.exoplayer2.v$a
            r6.<init>()
            com.applovin.exoplayer2.v$a r9 = r6.a(r9)
            java.lang.String r6 = "video/mpeg2"
            com.applovin.exoplayer2.v$a r9 = r9.f(r6)
            com.applovin.exoplayer2.v$a r9 = r9.g(r2)
            com.applovin.exoplayer2.v$a r9 = r9.h(r4)
            com.applovin.exoplayer2.v$a r9 = r9.b(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.applovin.exoplayer2.v$a r9 = r9.a(r1)
            com.applovin.exoplayer2.v r9 = r9.a()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = com.applovin.exoplayer2.e.i.k.f14672c
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.f14689b
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L90
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L90:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9a
        L98:
            r0 = 0
        L9a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.k.a(com.applovin.exoplayer2.e.i.k$a, java.lang.String):android.util.Pair");
    }
}
