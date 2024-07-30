package y4;

import d6.g0;
import d6.w;
import java.io.IOException;
import k4.z0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p4.j;
import p4.z;

/* compiled from: OggExtractor.java */
/* loaded from: classes2.dex */
public final class c implements p4.h {

    /* renamed from: a, reason: collision with root package name */
    public j f36665a;

    /* renamed from: b, reason: collision with root package name */
    public h f36666b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36667c;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean a(p4.e eVar) throws IOException {
        boolean z10;
        boolean z11;
        e eVar2 = new e();
        if (eVar2.a(eVar, true) && (eVar2.f36673a & 2) == 2) {
            int min = Math.min(eVar2.f36677e, 8);
            w wVar = new w(min);
            eVar.c(wVar.f27384a, 0, min, false);
            wVar.E(0);
            if (wVar.f27386c - wVar.f27385b >= 5 && wVar.t() == 127 && wVar.u() == 1179402563) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f36666b = new b();
            } else {
                wVar.E(0);
                try {
                    z11 = z.c(1, wVar, true);
                } catch (z0 unused) {
                    z11 = false;
                }
                if (z11) {
                    this.f36666b = new i();
                } else {
                    wVar.E(0);
                    if (g.e(wVar, g.o)) {
                        this.f36666b = new g();
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0179  */
    @Override // p4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(p4.i r21, p4.t r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.c.c(p4.i, p4.t):int");
    }

    @Override // p4.h
    public final boolean d(p4.i iVar) throws IOException {
        try {
            return a((p4.e) iVar);
        } catch (z0 unused) {
            return false;
        }
    }

    @Override // p4.h
    public final void f(j jVar) {
        this.f36665a = jVar;
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        h hVar = this.f36666b;
        if (hVar != null) {
            d dVar = hVar.f36681a;
            e eVar = dVar.f36668a;
            eVar.f36673a = 0;
            eVar.f36674b = 0L;
            eVar.f36675c = 0;
            eVar.f36676d = 0;
            eVar.f36677e = 0;
            dVar.f36669b.B(0);
            dVar.f36670c = -1;
            dVar.f36672e = false;
            if (j10 == 0) {
                hVar.d(!hVar.f36691l);
                return;
            }
            if (hVar.f36687h != 0) {
                long j12 = (hVar.f36688i * j11) / 1000000;
                hVar.f36685e = j12;
                f fVar = hVar.f36684d;
                int i10 = g0.f27302a;
                fVar.c(j12);
                hVar.f36687h = 2;
            }
        }
    }

    @Override // p4.h
    public final void release() {
    }
}
