package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.e.g.g;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.huawei.openalliance.ad.constant.be;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: b, reason: collision with root package name */
    private j f14176b;

    /* renamed from: c, reason: collision with root package name */
    private int f14177c;

    /* renamed from: d, reason: collision with root package name */
    private int f14178d;

    /* renamed from: e, reason: collision with root package name */
    private int f14179e;

    /* renamed from: g, reason: collision with root package name */
    private com.applovin.exoplayer2.g.f.b f14180g;

    /* renamed from: h, reason: collision with root package name */
    private i f14181h;

    /* renamed from: i, reason: collision with root package name */
    private c f14182i;

    /* renamed from: j, reason: collision with root package name */
    private g f14183j;

    /* renamed from: a, reason: collision with root package name */
    private final y f14175a = new y(6);
    private long f = -1;

    private int b(i iVar) throws IOException {
        this.f14175a.a(2);
        iVar.d(this.f14175a.d(), 0, 2);
        return this.f14175a.i();
    }

    private void d(i iVar) throws IOException {
        this.f14175a.a(2);
        iVar.b(this.f14175a.d(), 0, 2);
        int i10 = this.f14175a.i();
        this.f14178d = i10;
        if (i10 == 65498) {
            if (this.f != -1) {
                this.f14177c = 4;
                return;
            } else {
                b();
                return;
            }
        }
        if ((i10 < 65488 || i10 > 65497) && i10 != 65281) {
            this.f14177c = 1;
        }
    }

    private void e(i iVar) throws IOException {
        this.f14175a.a(2);
        iVar.b(this.f14175a.d(), 0, 2);
        this.f14179e = this.f14175a.i() - 2;
        this.f14177c = 2;
    }

    private void f(i iVar) throws IOException {
        String B;
        if (this.f14178d == 65505) {
            y yVar = new y(this.f14179e);
            iVar.b(yVar.d(), 0, this.f14179e);
            if (this.f14180g == null && "http://ns.adobe.com/xap/1.0/".equals(yVar.B()) && (B = yVar.B()) != null) {
                com.applovin.exoplayer2.g.f.b a10 = a(B, iVar.d());
                this.f14180g = a10;
                if (a10 != null) {
                    this.f = a10.f15192d;
                }
            }
        } else {
            iVar.b(this.f14179e);
        }
        this.f14177c = 0;
    }

    private void g(i iVar) throws IOException {
        if (!iVar.b(this.f14175a.d(), 0, 1, true)) {
            b();
            return;
        }
        iVar.a();
        if (this.f14183j == null) {
            this.f14183j = new g();
        }
        c cVar = new c(iVar, this.f);
        this.f14182i = cVar;
        if (this.f14183j.a(cVar)) {
            this.f14183j.a(new d(this.f, (j) com.applovin.exoplayer2.l.a.b(this.f14176b)));
            a();
        } else {
            b();
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        if (b(iVar) != 65496) {
            return false;
        }
        int b10 = b(iVar);
        this.f14178d = b10;
        if (b10 == 65504) {
            c(iVar);
            this.f14178d = b(iVar);
        }
        if (this.f14178d != 65505) {
            return false;
        }
        iVar.c(2);
        this.f14175a.a(6);
        iVar.d(this.f14175a.d(), 0, 6);
        return this.f14175a.o() == 1165519206 && this.f14175a.i() == 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
        g gVar = this.f14183j;
        if (gVar != null) {
            gVar.c();
        }
    }

    private void c(i iVar) throws IOException {
        this.f14175a.a(2);
        iVar.d(this.f14175a.d(), 0, 2);
        iVar.c(this.f14175a.i() - 2);
    }

    private void b() {
        a(new a.InterfaceC0172a[0]);
        ((j) com.applovin.exoplayer2.l.a.b(this.f14176b)).a();
        this.f14176b.a(new v.b(com.anythink.expressad.exoplayer.b.f7291b));
        this.f14177c = 6;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f14176b = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        int i10 = this.f14177c;
        if (i10 == 0) {
            d(iVar);
            return 0;
        }
        if (i10 == 1) {
            e(iVar);
            return 0;
        }
        if (i10 == 2) {
            f(iVar);
            return 0;
        }
        if (i10 == 4) {
            long c10 = iVar.c();
            long j10 = this.f;
            if (c10 != j10) {
                uVar.f14937a = j10;
                return 1;
            }
            g(iVar);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f14182i == null || iVar != this.f14181h) {
            this.f14181h = iVar;
            this.f14182i = new c(iVar, this.f);
        }
        int a10 = ((g) com.applovin.exoplayer2.l.a.b(this.f14183j)).a(this.f14182i, uVar);
        if (a10 == 1) {
            uVar.f14937a += this.f;
        }
        return a10;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f14177c = 0;
            this.f14183j = null;
        } else if (this.f14177c == 5) {
            ((g) com.applovin.exoplayer2.l.a.b(this.f14183j)).a(j10, j11);
        }
    }

    private void a() {
        a((a.InterfaceC0172a) com.applovin.exoplayer2.l.a.b(this.f14180g));
        this.f14177c = 5;
    }

    private void a(a.InterfaceC0172a... interfaceC0172aArr) {
        ((j) com.applovin.exoplayer2.l.a.b(this.f14176b)).a(1024, 4).a(new v.a().e(be.V).a(new com.applovin.exoplayer2.g.a(interfaceC0172aArr)).a());
    }

    private static com.applovin.exoplayer2.g.f.b a(String str, long j10) throws IOException {
        b a10;
        if (j10 == -1 || (a10 = e.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }
}
