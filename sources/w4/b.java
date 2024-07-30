package w4;

import d6.g0;
import p4.u;
import p4.v;

/* compiled from: IndexSeeker.java */
/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long f36076a;

    /* renamed from: b, reason: collision with root package name */
    public final s.d f36077b;

    /* renamed from: c, reason: collision with root package name */
    public final s.d f36078c;

    /* renamed from: d, reason: collision with root package name */
    public long f36079d;

    public b(long j10, long j11, long j12) {
        this.f36079d = j10;
        this.f36076a = j12;
        s.d dVar = new s.d();
        this.f36077b = dVar;
        s.d dVar2 = new s.d();
        this.f36078c = dVar2;
        dVar.c(0L);
        dVar2.c(j11);
    }

    @Override // w4.e
    public final long a(long j10) {
        return this.f36077b.d(g0.d(this.f36078c, j10));
    }

    @Override // w4.e
    public final long b() {
        return this.f36076a;
    }

    public final boolean c(long j10) {
        s.d dVar = this.f36077b;
        if (j10 - dVar.d(dVar.f35025c - 1) < 100000) {
            return true;
        }
        return false;
    }

    @Override // p4.u
    public final boolean e() {
        return true;
    }

    @Override // p4.u
    public final u.a h(long j10) {
        s.d dVar = this.f36077b;
        int d10 = g0.d(dVar, j10);
        long d11 = dVar.d(d10);
        s.d dVar2 = this.f36078c;
        v vVar = new v(d11, dVar2.d(d10));
        if (d11 != j10 && d10 != dVar.f35025c - 1) {
            int i10 = d10 + 1;
            return new u.a(vVar, new v(dVar.d(i10), dVar2.d(i10)));
        }
        return new u.a(vVar, vVar);
    }

    @Override // p4.u
    public final long i() {
        return this.f36079d;
    }
}
