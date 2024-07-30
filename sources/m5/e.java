package m5;

import d6.g0;
import n5.i;

/* compiled from: DashWrappingSegmentIndex.java */
/* loaded from: classes2.dex */
public final class e implements c {

    /* renamed from: s, reason: collision with root package name */
    public final p4.c f32896s;

    /* renamed from: t, reason: collision with root package name */
    public final long f32897t;

    public e(p4.c cVar, long j10) {
        this.f32896s = cVar;
        this.f32897t = j10;
    }

    @Override // m5.c
    public final long a(long j10) {
        return this.f32896s.f34304e[(int) j10] - this.f32897t;
    }

    @Override // m5.c
    public final long b(long j10, long j11) {
        return this.f32896s.f34303d[(int) j10];
    }

    @Override // m5.c
    public final long c(long j10, long j11) {
        return 0L;
    }

    @Override // m5.c
    public final long d(long j10, long j11) {
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // m5.c
    public final i e(long j10) {
        return new i(null, this.f32896s.f34302c[(int) j10], r0.f34301b[r8]);
    }

    @Override // m5.c
    public final long g(long j10, long j11) {
        return g0.f(this.f32896s.f34304e, j10 + this.f32897t, true);
    }

    @Override // m5.c
    public final boolean h() {
        return true;
    }

    @Override // m5.c
    public final long i() {
        return 0L;
    }

    @Override // m5.c
    public final long j(long j10) {
        return this.f32896s.f34300a;
    }

    @Override // m5.c
    public final long k(long j10, long j11) {
        return this.f32896s.f34300a;
    }
}
