package k4;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j5.u;

/* compiled from: MediaPeriodInfo.java */
/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final u.b f30744a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30745b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30746c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30747d;

    /* renamed from: e, reason: collision with root package name */
    public final long f30748e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30749g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30750h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f30751i;

    public q0(u.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16 = false;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        d6.a.a(z14);
        if (z12 && !z11) {
            z15 = false;
        } else {
            z15 = true;
        }
        d6.a.a(z15);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z16 = true;
        }
        d6.a.a(z16);
        this.f30744a = bVar;
        this.f30745b = j10;
        this.f30746c = j11;
        this.f30747d = j12;
        this.f30748e = j13;
        this.f = z10;
        this.f30749g = z11;
        this.f30750h = z12;
        this.f30751i = z13;
    }

    public final q0 a(long j10) {
        if (j10 == this.f30746c) {
            return this;
        }
        return new q0(this.f30744a, this.f30745b, j10, this.f30747d, this.f30748e, this.f, this.f30749g, this.f30750h, this.f30751i);
    }

    public final q0 b(long j10) {
        if (j10 == this.f30745b) {
            return this;
        }
        return new q0(this.f30744a, j10, this.f30746c, this.f30747d, this.f30748e, this.f, this.f30749g, this.f30750h, this.f30751i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.f30745b == q0Var.f30745b && this.f30746c == q0Var.f30746c && this.f30747d == q0Var.f30747d && this.f30748e == q0Var.f30748e && this.f == q0Var.f && this.f30749g == q0Var.f30749g && this.f30750h == q0Var.f30750h && this.f30751i == q0Var.f30751i && d6.g0.a(this.f30744a, q0Var.f30744a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f30744a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f30745b)) * 31) + ((int) this.f30746c)) * 31) + ((int) this.f30747d)) * 31) + ((int) this.f30748e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.f30749g ? 1 : 0)) * 31) + (this.f30750h ? 1 : 0)) * 31) + (this.f30751i ? 1 : 0);
    }
}
