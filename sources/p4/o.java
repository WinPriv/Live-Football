package p4;

import d6.g0;
import p4.p;
import p4.u;

/* compiled from: FlacSeekTableSeekMap.java */
/* loaded from: classes2.dex */
public final class o implements u {

    /* renamed from: a, reason: collision with root package name */
    public final p f34326a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34327b;

    public o(p pVar, long j10) {
        this.f34326a = pVar;
        this.f34327b = j10;
    }

    @Override // p4.u
    public final boolean e() {
        return true;
    }

    @Override // p4.u
    public final u.a h(long j10) {
        long j11;
        p pVar = this.f34326a;
        d6.a.e(pVar.f34337k);
        p.a aVar = pVar.f34337k;
        long[] jArr = aVar.f34339a;
        int f = g0.f(jArr, g0.i((pVar.f34332e * j10) / 1000000, 0L, pVar.f34336j - 1), false);
        long j12 = 0;
        if (f == -1) {
            j11 = 0;
        } else {
            j11 = jArr[f];
        }
        long[] jArr2 = aVar.f34340b;
        if (f != -1) {
            j12 = jArr2[f];
        }
        int i10 = pVar.f34332e;
        long j13 = (j11 * 1000000) / i10;
        long j14 = this.f34327b;
        v vVar = new v(j13, j12 + j14);
        if (j13 != j10 && f != jArr.length - 1) {
            int i11 = f + 1;
            return new u.a(vVar, new v((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
        }
        return new u.a(vVar, vVar);
    }

    @Override // p4.u
    public final long i() {
        return this.f34326a.b();
    }
}
