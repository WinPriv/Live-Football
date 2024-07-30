package w4;

import m4.x;

/* compiled from: ConstantBitrateSeeker.java */
/* loaded from: classes2.dex */
public final class a extends p4.d implements e {
    public a(long j10, long j11, x.a aVar, boolean z10) {
        super(j10, j11, aVar.f, aVar.f32877c, z10);
    }

    @Override // w4.e
    public final long a(long j10) {
        return ((Math.max(0L, j10 - this.f34306b) * 8) * 1000000) / this.f34309e;
    }

    @Override // w4.e
    public final long b() {
        return -1L;
    }
}
