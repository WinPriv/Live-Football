package z4;

import k4.i0;
import z4.d0;

/* compiled from: Id3Reader.java */
/* loaded from: classes2.dex */
public final class o implements j {

    /* renamed from: b, reason: collision with root package name */
    public p4.w f37214b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37215c;

    /* renamed from: e, reason: collision with root package name */
    public int f37217e;
    public int f;

    /* renamed from: a, reason: collision with root package name */
    public final d6.w f37213a = new d6.w(10);

    /* renamed from: d, reason: collision with root package name */
    public long f37216d = com.anythink.expressad.exoplayer.b.f7291b;

    @Override // z4.j
    public final void a() {
        this.f37215c = false;
        this.f37216d = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // z4.j
    public final void c(d6.w wVar) {
        d6.a.e(this.f37214b);
        if (!this.f37215c) {
            return;
        }
        int i10 = wVar.f27386c - wVar.f27385b;
        int i11 = this.f;
        if (i11 < 10) {
            int min = Math.min(i10, 10 - i11);
            byte[] bArr = wVar.f27384a;
            int i12 = wVar.f27385b;
            d6.w wVar2 = this.f37213a;
            System.arraycopy(bArr, i12, wVar2.f27384a, this.f, min);
            if (this.f + min == 10) {
                wVar2.E(0);
                if (73 == wVar2.t() && 68 == wVar2.t() && 51 == wVar2.t()) {
                    wVar2.F(3);
                    this.f37217e = wVar2.s() + 10;
                } else {
                    d6.p.f("Id3Reader", "Discarding invalid ID3 tag");
                    this.f37215c = false;
                    return;
                }
            }
        }
        int min2 = Math.min(i10, this.f37217e - this.f);
        this.f37214b.f(min2, wVar);
        this.f += min2;
    }

    @Override // z4.j
    public final void d() {
        int i10;
        d6.a.e(this.f37214b);
        if (this.f37215c && (i10 = this.f37217e) != 0 && this.f == i10) {
            long j10 = this.f37216d;
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                this.f37214b.c(j10, 1, i10, 0, null);
            }
            this.f37215c = false;
        }
    }

    @Override // z4.j
    public final void e(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f37215c = true;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f37216d = j10;
        }
        this.f37217e = 0;
        this.f = 0;
    }

    @Override // z4.j
    public final void f(p4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        p4.w s10 = jVar.s(dVar.f37050d, 5);
        this.f37214b = s10;
        i0.a aVar = new i0.a();
        dVar.b();
        aVar.f30525a = dVar.f37051e;
        aVar.f30534k = com.anythink.expressad.exoplayer.k.o.V;
        s10.b(new i0(aVar));
    }
}
