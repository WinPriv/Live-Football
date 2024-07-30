package z4;

import d6.g0;
import k4.i0;
import z4.d0;

/* compiled from: PassthroughSectionPayloadReader.java */
/* loaded from: classes2.dex */
public final class s implements x {

    /* renamed from: a, reason: collision with root package name */
    public i0 f37253a;

    /* renamed from: b, reason: collision with root package name */
    public d6.d0 f37254b;

    /* renamed from: c, reason: collision with root package name */
    public p4.w f37255c;

    public s(String str) {
        i0.a aVar = new i0.a();
        aVar.f30534k = str;
        this.f37253a = new i0(aVar);
    }

    @Override // z4.x
    public final void b(d6.d0 d0Var, p4.j jVar, d0.d dVar) {
        this.f37254b = d0Var;
        dVar.a();
        dVar.b();
        p4.w s10 = jVar.s(dVar.f37050d, 5);
        this.f37255c = s10;
        s10.b(this.f37253a);
    }

    @Override // z4.x
    public final void c(d6.w wVar) {
        long c10;
        long j10;
        long j11;
        d6.a.e(this.f37254b);
        int i10 = g0.f27302a;
        d6.d0 d0Var = this.f37254b;
        synchronized (d0Var) {
            long j12 = d0Var.f27294c;
            if (j12 != com.anythink.expressad.exoplayer.b.f7291b) {
                c10 = j12 + d0Var.f27293b;
            } else {
                c10 = d0Var.c();
            }
            j10 = c10;
        }
        d6.d0 d0Var2 = this.f37254b;
        synchronized (d0Var2) {
            j11 = d0Var2.f27293b;
        }
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b && j11 != com.anythink.expressad.exoplayer.b.f7291b) {
            i0 i0Var = this.f37253a;
            if (j11 != i0Var.H) {
                i0.a aVar = new i0.a(i0Var);
                aVar.o = j11;
                i0 i0Var2 = new i0(aVar);
                this.f37253a = i0Var2;
                this.f37255c.b(i0Var2);
            }
            int i11 = wVar.f27386c - wVar.f27385b;
            this.f37255c.f(i11, wVar);
            this.f37255c.c(j10, 1, i11, 0, null);
        }
    }
}
