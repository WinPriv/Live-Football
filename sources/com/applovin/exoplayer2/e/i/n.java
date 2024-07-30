package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.Collections;

/* loaded from: classes.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    private final z f14758a;

    /* renamed from: b, reason: collision with root package name */
    private String f14759b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14760c;

    /* renamed from: d, reason: collision with root package name */
    private a f14761d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14762e;

    /* renamed from: l, reason: collision with root package name */
    private long f14768l;
    private final boolean[] f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final r f14763g = new r(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final r f14764h = new r(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final r f14765i = new r(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final r f14766j = new r(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final r f14767k = new r(40, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f14769m = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: n, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14770n = new com.applovin.exoplayer2.l.y();

    public n(z zVar) {
        this.f14758a = zVar;
    }

    private void c() {
        com.applovin.exoplayer2.l.a.a(this.f14760c);
        ai.a(this.f14761d);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f14768l = 0L;
        this.f14769m = com.anythink.expressad.exoplayer.b.f7291b;
        com.applovin.exoplayer2.l.v.a(this.f);
        this.f14763g.a();
        this.f14764h.a();
        this.f14765i.a();
        this.f14766j.a();
        this.f14767k.a();
        a aVar = this.f14761d;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    private void b(long j10, int i10, int i11, long j11) {
        this.f14761d.a(j10, i10, this.f14762e);
        if (!this.f14762e) {
            this.f14763g.b(i11);
            this.f14764h.b(i11);
            this.f14765i.b(i11);
            if (this.f14763g.b() && this.f14764h.b() && this.f14765i.b()) {
                this.f14760c.a(a(this.f14759b, this.f14763g, this.f14764h, this.f14765i));
                this.f14762e = true;
            }
        }
        if (this.f14766j.b(i11)) {
            r rVar = this.f14766j;
            this.f14770n.a(this.f14766j.f14818a, com.applovin.exoplayer2.l.v.a(rVar.f14818a, rVar.f14819b));
            this.f14770n.e(5);
            this.f14758a.a(j11, this.f14770n);
        }
        if (this.f14767k.b(i11)) {
            r rVar2 = this.f14767k;
            this.f14770n.a(this.f14767k.f14818a, com.applovin.exoplayer2.l.v.a(rVar2.f14818a, rVar2.f14819b));
            this.f14770n.e(5);
            this.f14758a.a(j11, this.f14770n);
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.x f14771a;

        /* renamed from: b, reason: collision with root package name */
        private long f14772b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f14773c;

        /* renamed from: d, reason: collision with root package name */
        private int f14774d;

        /* renamed from: e, reason: collision with root package name */
        private long f14775e;
        private boolean f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f14776g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f14777h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f14778i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f14779j;

        /* renamed from: k, reason: collision with root package name */
        private long f14780k;

        /* renamed from: l, reason: collision with root package name */
        private long f14781l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f14782m;

        public a(com.applovin.exoplayer2.e.x xVar) {
            this.f14771a = xVar;
        }

        private static boolean b(int i10) {
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                return true;
            }
            return false;
        }

        private static boolean c(int i10) {
            if (i10 >= 32 && i10 != 40) {
                return false;
            }
            return true;
        }

        public void a() {
            this.f = false;
            this.f14776g = false;
            this.f14777h = false;
            this.f14778i = false;
            this.f14779j = false;
        }

        public void a(long j10, int i10, int i11, long j11, boolean z10) {
            this.f14776g = false;
            this.f14777h = false;
            this.f14775e = j11;
            this.f14774d = 0;
            this.f14772b = j10;
            if (!c(i11)) {
                if (this.f14778i && !this.f14779j) {
                    if (z10) {
                        a(i10);
                    }
                    this.f14778i = false;
                }
                if (b(i11)) {
                    this.f14777h = !this.f14779j;
                    this.f14779j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f14773c = z11;
            this.f = z11 || i11 <= 9;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f) {
                int i12 = this.f14774d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    this.f14776g = (bArr[i13] & 128) != 0;
                    this.f = false;
                } else {
                    this.f14774d = (i11 - i10) + i12;
                }
            }
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f14779j && this.f14776g) {
                this.f14782m = this.f14773c;
                this.f14779j = false;
            } else if (this.f14777h || this.f14776g) {
                if (z10 && this.f14778i) {
                    a(i10 + ((int) (j10 - this.f14772b)));
                }
                this.f14780k = this.f14772b;
                this.f14781l = this.f14775e;
                this.f14782m = this.f14773c;
                this.f14778i = true;
            }
        }

        private void a(int i10) {
            long j10 = this.f14781l;
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                return;
            }
            boolean z10 = this.f14782m;
            this.f14771a.a(j10, z10 ? 1 : 0, (int) (this.f14772b - this.f14780k), i10, null);
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f14759b = dVar.c();
        com.applovin.exoplayer2.e.x a10 = jVar.a(dVar.b(), 2);
        this.f14760c = a10;
        this.f14761d = new a(a10);
        this.f14758a.a(jVar, dVar);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14769m = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        c();
        while (yVar.a() > 0) {
            int c10 = yVar.c();
            int b10 = yVar.b();
            byte[] d10 = yVar.d();
            this.f14768l += yVar.a();
            this.f14760c.a(yVar, yVar.a());
            while (c10 < b10) {
                int a10 = com.applovin.exoplayer2.l.v.a(d10, c10, b10, this.f);
                if (a10 == b10) {
                    a(d10, c10, b10);
                    return;
                }
                int c11 = com.applovin.exoplayer2.l.v.c(d10, a10);
                int i10 = a10 - c10;
                if (i10 > 0) {
                    a(d10, c10, a10);
                }
                int i11 = b10 - a10;
                long j10 = this.f14768l - i11;
                b(j10, i11, i10 < 0 ? -i10 : 0, this.f14769m);
                a(j10, i11, c11, this.f14769m);
                c10 = a10 + 3;
            }
        }
    }

    private static void b(com.applovin.exoplayer2.l.z zVar) {
        int d10 = zVar.d();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < d10; i11++) {
            if (i11 != 0) {
                z10 = zVar.b();
            }
            if (z10) {
                zVar.a();
                zVar.d();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (zVar.b()) {
                        zVar.a();
                    }
                }
            } else {
                int d11 = zVar.d();
                int d12 = zVar.d();
                int i13 = d11 + d12;
                for (int i14 = 0; i14 < d11; i14++) {
                    zVar.d();
                    zVar.a();
                }
                for (int i15 = 0; i15 < d12; i15++) {
                    zVar.d();
                    zVar.a();
                }
                i10 = i13;
            }
        }
    }

    private void a(long j10, int i10, int i11, long j11) {
        this.f14761d.a(j10, i10, i11, j11, this.f14762e);
        if (!this.f14762e) {
            this.f14763g.a(i11);
            this.f14764h.a(i11);
            this.f14765i.a(i11);
        }
        this.f14766j.a(i11);
        this.f14767k.a(i11);
    }

    private void a(byte[] bArr, int i10, int i11) {
        this.f14761d.a(bArr, i10, i11);
        if (!this.f14762e) {
            this.f14763g.a(bArr, i10, i11);
            this.f14764h.a(bArr, i10, i11);
            this.f14765i.a(bArr, i10, i11);
        }
        this.f14766j.a(bArr, i10, i11);
        this.f14767k.a(bArr, i10, i11);
    }

    private static com.applovin.exoplayer2.v a(String str, r rVar, r rVar2, r rVar3) {
        int i10 = rVar.f14819b;
        byte[] bArr = new byte[rVar2.f14819b + i10 + rVar3.f14819b];
        System.arraycopy(rVar.f14818a, 0, bArr, 0, i10);
        System.arraycopy(rVar2.f14818a, 0, bArr, rVar.f14819b, rVar2.f14819b);
        System.arraycopy(rVar3.f14818a, 0, bArr, rVar.f14819b + rVar2.f14819b, rVar3.f14819b);
        com.applovin.exoplayer2.l.z zVar = new com.applovin.exoplayer2.l.z(rVar2.f14818a, 0, rVar2.f14819b);
        zVar.a(44);
        int c10 = zVar.c(3);
        zVar.a();
        zVar.a(88);
        zVar.a(8);
        int i11 = 0;
        for (int i12 = 0; i12 < c10; i12++) {
            if (zVar.b()) {
                i11 += 89;
            }
            if (zVar.b()) {
                i11 += 8;
            }
        }
        zVar.a(i11);
        if (c10 > 0) {
            zVar.a((8 - c10) * 2);
        }
        zVar.d();
        int d10 = zVar.d();
        if (d10 == 3) {
            zVar.a();
        }
        int d11 = zVar.d();
        int d12 = zVar.d();
        if (zVar.b()) {
            int d13 = zVar.d();
            int d14 = zVar.d();
            int d15 = zVar.d();
            int d16 = zVar.d();
            d11 -= (d13 + d14) * ((d10 == 1 || d10 == 2) ? 2 : 1);
            d12 -= (d15 + d16) * (d10 == 1 ? 2 : 1);
        }
        zVar.d();
        zVar.d();
        int d17 = zVar.d();
        for (int i13 = zVar.b() ? 0 : c10; i13 <= c10; i13++) {
            zVar.d();
            zVar.d();
            zVar.d();
        }
        zVar.d();
        zVar.d();
        zVar.d();
        zVar.d();
        zVar.d();
        zVar.d();
        if (zVar.b() && zVar.b()) {
            a(zVar);
        }
        zVar.a(2);
        if (zVar.b()) {
            zVar.a(8);
            zVar.d();
            zVar.d();
            zVar.a();
        }
        b(zVar);
        if (zVar.b()) {
            for (int i14 = 0; i14 < zVar.d(); i14++) {
                zVar.a(d17 + 4 + 1);
            }
        }
        zVar.a(2);
        float f = 1.0f;
        if (zVar.b()) {
            if (zVar.b()) {
                int c11 = zVar.c(8);
                if (c11 == 255) {
                    int c12 = zVar.c(16);
                    int c13 = zVar.c(16);
                    if (c12 != 0 && c13 != 0) {
                        f = c12 / c13;
                    }
                } else {
                    float[] fArr = com.applovin.exoplayer2.l.v.f16337b;
                    if (c11 < fArr.length) {
                        f = fArr[c11];
                    } else {
                        a3.k.y("Unexpected aspect_ratio_idc value: ", c11, "H265Reader");
                    }
                }
            }
            if (zVar.b()) {
                zVar.a();
            }
            if (zVar.b()) {
                zVar.a(4);
                if (zVar.b()) {
                    zVar.a(24);
                }
            }
            if (zVar.b()) {
                zVar.d();
                zVar.d();
            }
            zVar.a();
            if (zVar.b()) {
                d12 *= 2;
            }
        }
        zVar.a(rVar2.f14818a, 0, rVar2.f14819b);
        zVar.a(24);
        return new v.a().a(str).f(com.anythink.expressad.exoplayer.k.o.f9075i).d(com.applovin.exoplayer2.l.e.a(zVar)).g(d11).h(d12).b(f).a(Collections.singletonList(bArr)).a();
    }

    private static void a(com.applovin.exoplayer2.l.z zVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!zVar.b()) {
                    zVar.d();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        zVar.e();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        zVar.e();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }
}
