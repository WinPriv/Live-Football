package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.v;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c implements com.applovin.exoplayer2.e.h {

    /* renamed from: a */
    public static final com.applovin.exoplayer2.e.l f14607a = new com.applovin.exoplayer2.e.b.c(1);

    /* renamed from: b */
    private final d f14608b = new d();

    /* renamed from: c */
    private final com.applovin.exoplayer2.l.y f14609c = new com.applovin.exoplayer2.l.y(16384);

    /* renamed from: d */
    private boolean f14610d;

    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new c()};
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(10);
        int i10 = 0;
        while (true) {
            iVar.d(yVar.d(), 0, 10);
            yVar.d(0);
            if (yVar.m() != 4801587) {
                break;
            }
            yVar.e(3);
            int v3 = yVar.v();
            i10 += v3 + 10;
            iVar.c(v3);
        }
        iVar.a();
        iVar.c(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            iVar.d(yVar.d(), 0, 7);
            yVar.d(0);
            int i13 = yVar.i();
            if (i13 == 44096 || i13 == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int a10 = com.applovin.exoplayer2.b.c.a(yVar.d(), i13);
                if (a10 == -1) {
                    return false;
                }
                iVar.c(a10 - 7);
            } else {
                iVar.a();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                iVar.c(i12);
                i11 = 0;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.f14608b.a(jVar, new ad.d(0, 1));
        jVar.a();
        jVar.a(new v.b(com.anythink.expressad.exoplayer.b.f7291b));
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.f14610d = false;
        this.f14608b.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        int a10 = iVar.a(this.f14609c.d(), 0, 16384);
        if (a10 == -1) {
            return -1;
        }
        this.f14609c.d(0);
        this.f14609c.c(a10);
        if (!this.f14610d) {
            this.f14608b.a(0L, 4);
            this.f14610d = true;
        }
        this.f14608b.a(this.f14609c);
        return 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
