package a5;

import d6.g0;
import p4.u;
import p4.v;

/* compiled from: WavSeekMap.java */
/* loaded from: classes2.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public final b f294a;

    /* renamed from: b, reason: collision with root package name */
    public final int f295b;

    /* renamed from: c, reason: collision with root package name */
    public final long f296c;

    /* renamed from: d, reason: collision with root package name */
    public final long f297d;

    /* renamed from: e, reason: collision with root package name */
    public final long f298e;

    public d(b bVar, int i10, long j10, long j11) {
        this.f294a = bVar;
        this.f295b = i10;
        this.f296c = j10;
        long j12 = (j11 - j10) / bVar.f289c;
        this.f297d = j12;
        this.f298e = c(j12);
    }

    public final long c(long j10) {
        return g0.P(j10 * this.f295b, 1000000L, this.f294a.f288b);
    }

    @Override // p4.u
    public final boolean e() {
        return true;
    }

    @Override // p4.u
    public final u.a h(long j10) {
        b bVar = this.f294a;
        long j11 = this.f297d;
        long i10 = g0.i((bVar.f288b * j10) / (this.f295b * 1000000), 0L, j11 - 1);
        long j12 = this.f296c;
        long c10 = c(i10);
        v vVar = new v(c10, (bVar.f289c * i10) + j12);
        if (c10 < j10 && i10 != j11 - 1) {
            long j13 = i10 + 1;
            return new u.a(vVar, new v(c(j13), (bVar.f289c * j13) + j12));
        }
        return new u.a(vVar, vVar);
    }

    @Override // p4.u
    public final long i() {
        return this.f298e;
    }
}
