package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ag;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w implements com.applovin.exoplayer2.e.h {

    /* renamed from: a */
    public static final com.applovin.exoplayer2.e.l f14846a = new v2.a(4);

    /* renamed from: b */
    private final ag f14847b;

    /* renamed from: c */
    private final SparseArray<a> f14848c;

    /* renamed from: d */
    private final com.applovin.exoplayer2.l.y f14849d;

    /* renamed from: e */
    private final v f14850e;
    private boolean f;

    /* renamed from: g */
    private boolean f14851g;

    /* renamed from: h */
    private boolean f14852h;

    /* renamed from: i */
    private long f14853i;

    /* renamed from: j */
    private u f14854j;

    /* renamed from: k */
    private com.applovin.exoplayer2.e.j f14855k;

    /* renamed from: l */
    private boolean f14856l;

    public w() {
        this(new ag(0L));
    }

    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new w()};
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final j f14857a;

        /* renamed from: b */
        private final ag f14858b;

        /* renamed from: c */
        private final com.applovin.exoplayer2.l.x f14859c = new com.applovin.exoplayer2.l.x(new byte[64]);

        /* renamed from: d */
        private boolean f14860d;

        /* renamed from: e */
        private boolean f14861e;
        private boolean f;

        /* renamed from: g */
        private int f14862g;

        /* renamed from: h */
        private long f14863h;

        public a(j jVar, ag agVar) {
            this.f14857a = jVar;
            this.f14858b = agVar;
        }

        private void b() {
            this.f14859c.b(8);
            this.f14860d = this.f14859c.e();
            this.f14861e = this.f14859c.e();
            this.f14859c.b(6);
            this.f14862g = this.f14859c.c(8);
        }

        private void c() {
            this.f14863h = 0L;
            if (this.f14860d) {
                this.f14859c.b(4);
                this.f14859c.b(1);
                this.f14859c.b(1);
                long c10 = (this.f14859c.c(3) << 30) | (this.f14859c.c(15) << 15) | this.f14859c.c(15);
                this.f14859c.b(1);
                if (!this.f && this.f14861e) {
                    this.f14859c.b(4);
                    this.f14859c.b(1);
                    this.f14859c.b(1);
                    this.f14859c.b(1);
                    this.f14858b.b((this.f14859c.c(3) << 30) | (this.f14859c.c(15) << 15) | this.f14859c.c(15));
                    this.f = true;
                }
                this.f14863h = this.f14858b.b(c10);
            }
        }

        public void a() {
            this.f = false;
            this.f14857a.a();
        }

        public void a(com.applovin.exoplayer2.l.y yVar) throws ai {
            yVar.a(this.f14859c.f16363a, 0, 3);
            this.f14859c.a(0);
            b();
            yVar.a(this.f14859c.f16363a, 0, this.f14862g);
            this.f14859c.a(0);
            c();
            this.f14857a.a(this.f14863h, 4);
            this.f14857a.a(yVar);
            this.f14857a.b();
        }
    }

    public w(ag agVar) {
        this.f14847b = agVar;
        this.f14849d = new com.applovin.exoplayer2.l.y(4096);
        this.f14848c = new SparseArray<>();
        this.f14850e = new v();
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        byte[] bArr = new byte[14];
        iVar.d(bArr, 0, 14);
        if (442 != (((bArr[0] & DefaultClassResolver.NAME) << 24) | ((bArr[1] & DefaultClassResolver.NAME) << 16) | ((bArr[2] & DefaultClassResolver.NAME) << 8) | (bArr[3] & DefaultClassResolver.NAME)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        iVar.c(bArr[13] & 7);
        iVar.d(bArr, 0, 3);
        return 1 == ((((bArr[0] & DefaultClassResolver.NAME) << 16) | ((bArr[1] & DefaultClassResolver.NAME) << 8)) | (bArr[2] & DefaultClassResolver.NAME));
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.f14855k = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        boolean z10 = this.f14847b.c() == com.anythink.expressad.exoplayer.b.f7291b;
        if (!z10) {
            long a10 = this.f14847b.a();
            z10 = (a10 == com.anythink.expressad.exoplayer.b.f7291b || a10 == 0 || a10 == j11) ? false : true;
        }
        if (z10) {
            this.f14847b.a(j11);
        }
        u uVar = this.f14854j;
        if (uVar != null) {
            uVar.a(j11);
        }
        for (int i10 = 0; i10 < this.f14848c.size(); i10++) {
            this.f14848c.valueAt(i10).a();
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        j jVar;
        com.applovin.exoplayer2.l.a.a(this.f14855k);
        long d10 = iVar.d();
        if ((d10 != -1) && !this.f14850e.a()) {
            return this.f14850e.a(iVar, uVar);
        }
        a(d10);
        u uVar2 = this.f14854j;
        if (uVar2 != null && uVar2.b()) {
            return this.f14854j.a(iVar, uVar);
        }
        iVar.a();
        long b10 = d10 != -1 ? d10 - iVar.b() : -1L;
        if ((b10 != -1 && b10 < 4) || !iVar.b(this.f14849d.d(), 0, 4, true)) {
            return -1;
        }
        this.f14849d.d(0);
        int q10 = this.f14849d.q();
        if (q10 == 441) {
            return -1;
        }
        if (q10 == 442) {
            iVar.d(this.f14849d.d(), 0, 10);
            this.f14849d.d(9);
            iVar.b((this.f14849d.h() & 7) + 14);
            return 0;
        }
        if (q10 == 443) {
            iVar.d(this.f14849d.d(), 0, 2);
            this.f14849d.d(0);
            iVar.b(this.f14849d.i() + 6);
            return 0;
        }
        if (((q10 & (-256)) >> 8) != 1) {
            iVar.b(1);
            return 0;
        }
        int i10 = q10 & com.anythink.expressad.exoplayer.k.p.f9095b;
        a aVar = this.f14848c.get(i10);
        if (!this.f) {
            if (aVar == null) {
                if (i10 == 189) {
                    jVar = new b();
                    this.f14851g = true;
                    this.f14853i = iVar.c();
                } else if ((i10 & 224) == 192) {
                    jVar = new q();
                    this.f14851g = true;
                    this.f14853i = iVar.c();
                } else if ((i10 & 240) == 224) {
                    jVar = new k();
                    this.f14852h = true;
                    this.f14853i = iVar.c();
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    jVar.a(this.f14855k, new ad.d(i10, 256));
                    aVar = new a(jVar, this.f14847b);
                    this.f14848c.put(i10, aVar);
                }
            }
            if (iVar.c() > ((this.f14851g && this.f14852h) ? this.f14853i + 8192 : com.huawei.openalliance.ad.constant.w.f22146c)) {
                this.f = true;
                this.f14855k.a();
            }
        }
        iVar.d(this.f14849d.d(), 0, 2);
        this.f14849d.d(0);
        int i11 = this.f14849d.i() + 6;
        if (aVar == null) {
            iVar.b(i11);
        } else {
            this.f14849d.a(i11);
            iVar.b(this.f14849d.d(), 0, i11);
            this.f14849d.d(6);
            aVar.a(this.f14849d);
            com.applovin.exoplayer2.l.y yVar = this.f14849d;
            yVar.c(yVar.e());
        }
        return 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    private void a(long j10) {
        if (this.f14856l) {
            return;
        }
        this.f14856l = true;
        if (this.f14850e.c() != com.anythink.expressad.exoplayer.b.f7291b) {
            u uVar = new u(this.f14850e.b(), this.f14850e.c(), j10);
            this.f14854j = uVar;
            this.f14855k.a(uVar.a());
            return;
        }
        this.f14855k.a(new v.b(this.f14850e.c()));
    }
}
