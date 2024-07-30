package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* loaded from: classes.dex */
public class c implements com.applovin.exoplayer2.e.h {

    /* renamed from: a */
    public static final l f14496a = new com.applovin.exoplayer2.e.c.f(1);

    /* renamed from: b */
    private j f14497b;

    /* renamed from: c */
    private h f14498c;

    /* renamed from: d */
    private boolean f14499d;

    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new c()};
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        e eVar = new e();
        if (eVar.a(iVar, true) && (eVar.f14506b & 2) == 2) {
            int min = Math.min(eVar.f14512i, 8);
            y yVar = new y(min);
            iVar.d(yVar.d(), 0, min);
            if (b.a(a(yVar))) {
                this.f14498c = new b();
            } else if (i.a(a(yVar))) {
                this.f14498c = new i();
            } else if (g.a(a(yVar))) {
                this.f14498c = new g();
            }
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        try {
            return b(iVar);
        } catch (ai unused) {
            return false;
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f14497b = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        h hVar = this.f14498c;
        if (hVar != null) {
            hVar.a(j10, j11);
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        com.applovin.exoplayer2.l.a.a(this.f14497b);
        if (this.f14498c == null) {
            if (b(iVar)) {
                iVar.a();
            } else {
                throw ai.b("Failed to determine bitstream type", null);
            }
        }
        if (!this.f14499d) {
            x a10 = this.f14497b.a(0, 1);
            this.f14497b.a();
            this.f14498c.a(this.f14497b, a10);
            this.f14499d = true;
        }
        return this.f14498c.a(iVar, uVar);
    }

    private static y a(y yVar) {
        yVar.d(0);
        return yVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
