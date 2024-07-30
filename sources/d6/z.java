package d6;

import k4.d1;

/* compiled from: StandaloneMediaClock.java */
/* loaded from: classes2.dex */
public final class z implements q {

    /* renamed from: s, reason: collision with root package name */
    public final c f27395s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f27396t;

    /* renamed from: u, reason: collision with root package name */
    public long f27397u;

    /* renamed from: v, reason: collision with root package name */
    public long f27398v;

    /* renamed from: w, reason: collision with root package name */
    public d1 f27399w = d1.f30400v;

    public z(c cVar) {
        this.f27395s = cVar;
    }

    @Override // d6.q
    public final void a(d1 d1Var) {
        if (this.f27396t) {
            b(l());
        }
        this.f27399w = d1Var;
    }

    public final void b(long j10) {
        this.f27397u = j10;
        if (this.f27396t) {
            this.f27398v = this.f27395s.elapsedRealtime();
        }
    }

    @Override // d6.q
    public final d1 d() {
        return this.f27399w;
    }

    @Override // d6.q
    public final long l() {
        long j10;
        long j11 = this.f27397u;
        if (this.f27396t) {
            long elapsedRealtime = this.f27395s.elapsedRealtime() - this.f27398v;
            if (this.f27399w.f30401s == 1.0f) {
                j10 = g0.J(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * r4.f30403u;
            }
            return j11 + j10;
        }
        return j11;
    }
}
