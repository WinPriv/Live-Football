package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.v;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements com.applovin.exoplayer2.e.h {

    /* renamed from: a */
    public static final com.applovin.exoplayer2.e.l f14541a = new v2.a(3);

    /* renamed from: b */
    private final b f14542b = new b();

    /* renamed from: c */
    private final com.applovin.exoplayer2.l.y f14543c = new com.applovin.exoplayer2.l.y(2786);

    /* renamed from: d */
    private boolean f14544d;

    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new a()};
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
            iVar.d(yVar.d(), 0, 6);
            yVar.d(0);
            if (yVar.i() != 2935) {
                iVar.a();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                iVar.c(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int a10 = com.applovin.exoplayer2.b.b.a(yVar.d());
                if (a10 == -1) {
                    return false;
                }
                iVar.c(a10 - 6);
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.f14542b.a(jVar, new ad.d(0, 1));
        jVar.a();
        jVar.a(new v.b(com.anythink.expressad.exoplayer.b.f7291b));
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.f14544d = false;
        this.f14542b.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        int a10 = iVar.a(this.f14543c.d(), 0, 2786);
        if (a10 == -1) {
            return -1;
        }
        this.f14543c.d(0);
        this.f14543c.c(a10);
        if (!this.f14544d) {
            this.f14542b.a(0L, 4);
            this.f14544d = true;
        }
        this.f14542b.a(this.f14543c);
        return 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
