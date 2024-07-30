package p4;

import p4.u;

/* compiled from: ConstantBitrateSeekMap.java */
/* loaded from: classes2.dex */
public class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public final long f34305a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34306b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34307c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34308d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34309e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f34310g;

    public d(long j10, long j11, int i10, int i11, boolean z10) {
        this.f34305a = j10;
        this.f34306b = j11;
        this.f34307c = i11 == -1 ? 1 : i11;
        this.f34309e = i10;
        this.f34310g = z10;
        if (j10 == -1) {
            this.f34308d = -1L;
            this.f = com.anythink.expressad.exoplayer.b.f7291b;
        } else {
            long j12 = j10 - j11;
            this.f34308d = j12;
            this.f = ((Math.max(0L, j12) * 8) * 1000000) / i10;
        }
    }

    @Override // p4.u
    public final boolean e() {
        if (this.f34308d == -1 && !this.f34310g) {
            return false;
        }
        return true;
    }

    @Override // p4.u
    public final u.a h(long j10) {
        long j11 = this.f34308d;
        long j12 = this.f34306b;
        if (j11 == -1 && !this.f34310g) {
            v vVar = new v(0L, j12);
            return new u.a(vVar, vVar);
        }
        int i10 = this.f34309e;
        long j13 = this.f34307c;
        long j14 = (((i10 * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            j14 = Math.min(j14, j11 - j13);
        }
        long max = Math.max(j14, 0L) + j12;
        long max2 = ((Math.max(0L, max - j12) * 8) * 1000000) / i10;
        v vVar2 = new v(max2, max);
        if (j11 != -1 && max2 < j10) {
            long j15 = j13 + max;
            if (j15 < this.f34305a) {
                return new u.a(vVar2, new v(((Math.max(0L, j15 - j12) * 8) * 1000000) / i10, j15));
            }
        }
        return new u.a(vVar2, vVar2);
    }

    @Override // p4.u
    public final long i() {
        return this.f;
    }
}
