package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    private final z f14715a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14716b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14717c;

    /* renamed from: g, reason: collision with root package name */
    private long f14720g;

    /* renamed from: i, reason: collision with root package name */
    private String f14722i;

    /* renamed from: j, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14723j;

    /* renamed from: k, reason: collision with root package name */
    private a f14724k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14725l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14727n;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f14721h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    private final r f14718d = new r(7, 128);

    /* renamed from: e, reason: collision with root package name */
    private final r f14719e = new r(8, 128);
    private final r f = new r(6, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f14726m = com.anythink.expressad.exoplayer.b.f7291b;
    private final com.applovin.exoplayer2.l.y o = new com.applovin.exoplayer2.l.y();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.x f14728a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f14729b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f14730c;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray<v.b> f14731d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray<v.a> f14732e = new SparseArray<>();
        private final com.applovin.exoplayer2.l.z f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f14733g;

        /* renamed from: h, reason: collision with root package name */
        private int f14734h;

        /* renamed from: i, reason: collision with root package name */
        private int f14735i;

        /* renamed from: j, reason: collision with root package name */
        private long f14736j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f14737k;

        /* renamed from: l, reason: collision with root package name */
        private long f14738l;

        /* renamed from: m, reason: collision with root package name */
        private C0169a f14739m;

        /* renamed from: n, reason: collision with root package name */
        private C0169a f14740n;
        private boolean o;

        /* renamed from: p, reason: collision with root package name */
        private long f14741p;

        /* renamed from: q, reason: collision with root package name */
        private long f14742q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f14743r;

        /* renamed from: com.applovin.exoplayer2.e.i.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0169a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f14744a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f14745b;

            /* renamed from: c, reason: collision with root package name */
            private v.b f14746c;

            /* renamed from: d, reason: collision with root package name */
            private int f14747d;

            /* renamed from: e, reason: collision with root package name */
            private int f14748e;
            private int f;

            /* renamed from: g, reason: collision with root package name */
            private int f14749g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f14750h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f14751i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f14752j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f14753k;

            /* renamed from: l, reason: collision with root package name */
            private int f14754l;

            /* renamed from: m, reason: collision with root package name */
            private int f14755m;

            /* renamed from: n, reason: collision with root package name */
            private int f14756n;
            private int o;

            /* renamed from: p, reason: collision with root package name */
            private int f14757p;

            private C0169a() {
            }

            public boolean b() {
                int i10;
                if (this.f14745b && ((i10 = this.f14748e) == 7 || i10 == 2)) {
                    return true;
                }
                return false;
            }

            public void a() {
                this.f14745b = false;
                this.f14744a = false;
            }

            public void a(int i10) {
                this.f14748e = i10;
                this.f14745b = true;
            }

            public void a(v.b bVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f14746c = bVar;
                this.f14747d = i10;
                this.f14748e = i11;
                this.f = i12;
                this.f14749g = i13;
                this.f14750h = z10;
                this.f14751i = z11;
                this.f14752j = z12;
                this.f14753k = z13;
                this.f14754l = i14;
                this.f14755m = i15;
                this.f14756n = i16;
                this.o = i17;
                this.f14757p = i18;
                this.f14744a = true;
                this.f14745b = true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean a(C0169a c0169a) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f14744a) {
                    return false;
                }
                if (!c0169a.f14744a) {
                    return true;
                }
                v.b bVar = (v.b) com.applovin.exoplayer2.l.a.a(this.f14746c);
                v.b bVar2 = (v.b) com.applovin.exoplayer2.l.a.a(c0169a.f14746c);
                return (this.f == c0169a.f && this.f14749g == c0169a.f14749g && this.f14750h == c0169a.f14750h && (!this.f14751i || !c0169a.f14751i || this.f14752j == c0169a.f14752j) && (((i10 = this.f14747d) == (i11 = c0169a.f14747d) || (i10 != 0 && i11 != 0)) && (((i12 = bVar.f16352k) != 0 || bVar2.f16352k != 0 || (this.f14755m == c0169a.f14755m && this.f14756n == c0169a.f14756n)) && ((i12 != 1 || bVar2.f16352k != 1 || (this.o == c0169a.o && this.f14757p == c0169a.f14757p)) && (z10 = this.f14753k) == c0169a.f14753k && (!z10 || this.f14754l == c0169a.f14754l))))) ? false : true;
            }
        }

        public a(com.applovin.exoplayer2.e.x xVar, boolean z10, boolean z11) {
            this.f14728a = xVar;
            this.f14729b = z10;
            this.f14730c = z11;
            this.f14739m = new C0169a();
            this.f14740n = new C0169a();
            byte[] bArr = new byte[128];
            this.f14733g = bArr;
            this.f = new com.applovin.exoplayer2.l.z(bArr, 0, 0);
            b();
        }

        public boolean a() {
            return this.f14730c;
        }

        public void b() {
            this.f14737k = false;
            this.o = false;
            this.f14740n.a();
        }

        public void a(v.b bVar) {
            this.f14731d.append(bVar.f16346d, bVar);
        }

        public void a(v.a aVar) {
            this.f14732e.append(aVar.f16340a, aVar);
        }

        public void a(long j10, int i10, long j11) {
            this.f14735i = i10;
            this.f14738l = j11;
            this.f14736j = j10;
            if (!this.f14729b || i10 != 1) {
                if (!this.f14730c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            C0169a c0169a = this.f14739m;
            this.f14739m = this.f14740n;
            this.f14740n = c0169a;
            c0169a.a();
            this.f14734h = 0;
            this.f14737k = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.m.a.a(byte[], int, int):void");
        }

        public boolean a(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f14735i == 9 || (this.f14730c && this.f14740n.a(this.f14739m))) {
                if (z10 && this.o) {
                    a(i10 + ((int) (j10 - this.f14736j)));
                }
                this.f14741p = this.f14736j;
                this.f14742q = this.f14738l;
                this.f14743r = false;
                this.o = true;
            }
            if (this.f14729b) {
                z11 = this.f14740n.b();
            }
            boolean z13 = this.f14743r;
            int i11 = this.f14735i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f14743r = z14;
            return z14;
        }

        private void a(int i10) {
            long j10 = this.f14742q;
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                return;
            }
            boolean z10 = this.f14743r;
            this.f14728a.a(j10, z10 ? 1 : 0, (int) (this.f14736j - this.f14741p), i10, null);
        }
    }

    public m(z zVar, boolean z10, boolean z11) {
        this.f14715a = zVar;
        this.f14716b = z10;
        this.f14717c = z11;
    }

    private void c() {
        com.applovin.exoplayer2.l.a.a(this.f14723j);
        ai.a(this.f14724k);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f14720g = 0L;
        this.f14727n = false;
        this.f14726m = com.anythink.expressad.exoplayer.b.f7291b;
        com.applovin.exoplayer2.l.v.a(this.f14721h);
        this.f14718d.a();
        this.f14719e.a();
        this.f.a();
        a aVar = this.f14724k;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f14722i = dVar.c();
        com.applovin.exoplayer2.e.x a10 = jVar.a(dVar.b(), 2);
        this.f14723j = a10;
        this.f14724k = new a(a10, this.f14716b, this.f14717c);
        this.f14715a.a(jVar, dVar);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14726m = j10;
        }
        this.f14727n |= (i10 & 2) != 0;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        c();
        int c10 = yVar.c();
        int b10 = yVar.b();
        byte[] d10 = yVar.d();
        this.f14720g += yVar.a();
        this.f14723j.a(yVar, yVar.a());
        while (true) {
            int a10 = com.applovin.exoplayer2.l.v.a(d10, c10, b10, this.f14721h);
            if (a10 == b10) {
                a(d10, c10, b10);
                return;
            }
            int b11 = com.applovin.exoplayer2.l.v.b(d10, a10);
            int i10 = a10 - c10;
            if (i10 > 0) {
                a(d10, c10, a10);
            }
            int i11 = b10 - a10;
            long j10 = this.f14720g - i11;
            a(j10, i11, i10 < 0 ? -i10 : 0, this.f14726m);
            a(j10, b11, this.f14726m);
            c10 = a10 + 3;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    private void a(long j10, int i10, long j11) {
        if (!this.f14725l || this.f14724k.a()) {
            this.f14718d.a(i10);
            this.f14719e.a(i10);
        }
        this.f.a(i10);
        this.f14724k.a(j10, i10, j11);
    }

    private void a(byte[] bArr, int i10, int i11) {
        if (!this.f14725l || this.f14724k.a()) {
            this.f14718d.a(bArr, i10, i11);
            this.f14719e.a(bArr, i10, i11);
        }
        this.f.a(bArr, i10, i11);
        this.f14724k.a(bArr, i10, i11);
    }

    private void a(long j10, int i10, int i11, long j11) {
        if (!this.f14725l || this.f14724k.a()) {
            this.f14718d.b(i11);
            this.f14719e.b(i11);
            if (!this.f14725l) {
                if (this.f14718d.b() && this.f14719e.b()) {
                    ArrayList arrayList = new ArrayList();
                    r rVar = this.f14718d;
                    arrayList.add(Arrays.copyOf(rVar.f14818a, rVar.f14819b));
                    r rVar2 = this.f14719e;
                    arrayList.add(Arrays.copyOf(rVar2.f14818a, rVar2.f14819b));
                    r rVar3 = this.f14718d;
                    v.b a10 = com.applovin.exoplayer2.l.v.a(rVar3.f14818a, 3, rVar3.f14819b);
                    r rVar4 = this.f14719e;
                    v.a b10 = com.applovin.exoplayer2.l.v.b(rVar4.f14818a, 3, rVar4.f14819b);
                    this.f14723j.a(new v.a().a(this.f14722i).f(com.anythink.expressad.exoplayer.k.o.f9074h).d(com.applovin.exoplayer2.l.e.a(a10.f16343a, a10.f16344b, a10.f16345c)).g(a10.f16347e).h(a10.f).b(a10.f16348g).a(arrayList).a());
                    this.f14725l = true;
                    this.f14724k.a(a10);
                    this.f14724k.a(b10);
                    this.f14718d.a();
                    this.f14719e.a();
                }
            } else if (this.f14718d.b()) {
                r rVar5 = this.f14718d;
                this.f14724k.a(com.applovin.exoplayer2.l.v.a(rVar5.f14818a, 3, rVar5.f14819b));
                this.f14718d.a();
            } else if (this.f14719e.b()) {
                r rVar6 = this.f14719e;
                this.f14724k.a(com.applovin.exoplayer2.l.v.b(rVar6.f14818a, 3, rVar6.f14819b));
                this.f14719e.a();
            }
        }
        if (this.f.b(i11)) {
            r rVar7 = this.f;
            this.o.a(this.f.f14818a, com.applovin.exoplayer2.l.v.a(rVar7.f14818a, rVar7.f14819b));
            this.o.d(4);
            this.f14715a.a(j11, this.o);
        }
        if (this.f14724k.a(j10, i10, this.f14725l, this.f14727n)) {
            this.f14727n = false;
        }
    }
}
