package j5;

import android.net.Uri;
import c6.j;
import j5.u;
import java.util.Collections;
import java.util.Map;
import k4.i0;
import k4.n0;

/* compiled from: SingleSampleMediaSource.java */
/* loaded from: classes2.dex */
public final class k0 extends a {
    public final j.a A;
    public final k4.i0 B;
    public final c6.a0 D;
    public final i0 F;
    public final k4.n0 G;
    public c6.h0 H;

    /* renamed from: z, reason: collision with root package name */
    public final c6.m f29794z;
    public final long C = com.anythink.expressad.exoplayer.b.f7291b;
    public final boolean E = true;

    public k0(n0.j jVar, j.a aVar, c6.a0 a0Var) {
        this.A = aVar;
        this.D = a0Var;
        n0.a aVar2 = new n0.a();
        aVar2.f30581b = Uri.EMPTY;
        String uri = jVar.f30644a.toString();
        uri.getClass();
        aVar2.f30580a = uri;
        aVar2.f30586h = j7.j0.C(j7.j0.G(jVar));
        aVar2.f30587i = null;
        k4.n0 a10 = aVar2.a();
        this.G = a10;
        i0.a aVar3 = new i0.a();
        String str = jVar.f30645b;
        aVar3.f30534k = str == null ? "text/x-unknown" : str;
        aVar3.f30527c = jVar.f30646c;
        aVar3.f30528d = jVar.f30647d;
        aVar3.f30529e = jVar.f30648e;
        aVar3.f30526b = jVar.f;
        String str2 = jVar.f30649g;
        aVar3.f30525a = str2 != null ? str2 : null;
        this.B = new k4.i0(aVar3);
        Map emptyMap = Collections.emptyMap();
        Uri uri2 = jVar.f30644a;
        d6.a.f(uri2, "The uri must be set.");
        this.f29794z = new c6.m(uri2, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.F = new i0(com.anythink.expressad.exoplayer.b.f7291b, true, false, a10);
    }

    @Override // j5.u
    public final void c(s sVar) {
        ((j0) sVar).A.e(null);
    }

    @Override // j5.u
    public final k4.n0 d() {
        return this.G;
    }

    @Override // j5.u
    public final s p(u.b bVar, c6.b bVar2, long j10) {
        return new j0(this.f29794z, this.A, this.H, this.B, this.C, this.D, r(bVar), this.E);
    }

    @Override // j5.a
    public final void u(c6.h0 h0Var) {
        this.H = h0Var;
        v(this.F);
    }

    @Override // j5.u
    public final void j() {
    }

    @Override // j5.a
    public final void w() {
    }
}
