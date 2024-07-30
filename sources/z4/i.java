package z4;

import java.util.Collections;
import java.util.List;
import k4.i0;
import z4.d0;

/* compiled from: DvbSubtitleReader.java */
/* loaded from: classes2.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final List<d0.a> f37097a;

    /* renamed from: b, reason: collision with root package name */
    public final p4.w[] f37098b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37099c;

    /* renamed from: d, reason: collision with root package name */
    public int f37100d;

    /* renamed from: e, reason: collision with root package name */
    public int f37101e;
    public long f = com.anythink.expressad.exoplayer.b.f7291b;

    public i(List<d0.a> list) {
        this.f37097a = list;
        this.f37098b = new p4.w[list.size()];
    }

    @Override // z4.j
    public final void a() {
        this.f37099c = false;
        this.f = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // z4.j
    public final void c(d6.w wVar) {
        boolean z10;
        boolean z11;
        if (this.f37099c) {
            if (this.f37100d == 2) {
                if (wVar.f27386c - wVar.f27385b == 0) {
                    z11 = false;
                } else {
                    if (wVar.t() != 32) {
                        this.f37099c = false;
                    }
                    this.f37100d--;
                    z11 = this.f37099c;
                }
                if (!z11) {
                    return;
                }
            }
            if (this.f37100d == 1) {
                if (wVar.f27386c - wVar.f27385b == 0) {
                    z10 = false;
                } else {
                    if (wVar.t() != 0) {
                        this.f37099c = false;
                    }
                    this.f37100d--;
                    z10 = this.f37099c;
                }
                if (!z10) {
                    return;
                }
            }
            int i10 = wVar.f27385b;
            int i11 = wVar.f27386c - i10;
            for (p4.w wVar2 : this.f37098b) {
                wVar.E(i10);
                wVar2.f(i11, wVar);
            }
            this.f37101e += i11;
        }
    }

    @Override // z4.j
    public final void d() {
        if (this.f37099c) {
            if (this.f != com.anythink.expressad.exoplayer.b.f7291b) {
                for (p4.w wVar : this.f37098b) {
                    wVar.c(this.f, 1, this.f37101e, 0, null);
                }
            }
            this.f37099c = false;
        }
    }

    @Override // z4.j
    public final void e(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f37099c = true;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f = j10;
        }
        this.f37101e = 0;
        this.f37100d = 2;
    }

    @Override // z4.j
    public final void f(p4.j jVar, d0.d dVar) {
        int i10 = 0;
        while (true) {
            p4.w[] wVarArr = this.f37098b;
            if (i10 < wVarArr.length) {
                d0.a aVar = this.f37097a.get(i10);
                dVar.a();
                dVar.b();
                p4.w s10 = jVar.s(dVar.f37050d, 3);
                i0.a aVar2 = new i0.a();
                dVar.b();
                aVar2.f30525a = dVar.f37051e;
                aVar2.f30534k = com.anythink.expressad.exoplayer.k.o.aj;
                aVar2.f30536m = Collections.singletonList(aVar.f37043b);
                aVar2.f30527c = aVar.f37042a;
                s10.b(new i0(aVar2));
                wVarArr[i10] = s10;
                i10++;
            } else {
                return;
            }
        }
    }
}
