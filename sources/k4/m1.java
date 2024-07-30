package k4;

/* compiled from: SeekParameters.java */
/* loaded from: classes2.dex */
public final class m1 {

    /* renamed from: c, reason: collision with root package name */
    public static final m1 f30570c;

    /* renamed from: a, reason: collision with root package name */
    public final long f30571a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30572b;

    static {
        m1 m1Var = new m1(0L, 0L);
        new m1(Long.MAX_VALUE, Long.MAX_VALUE);
        new m1(Long.MAX_VALUE, 0L);
        new m1(0L, Long.MAX_VALUE);
        f30570c = m1Var;
    }

    public m1(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        d6.a.a(j11 >= 0);
        this.f30571a = j10;
        this.f30572b = j11;
    }

    public final long a(long j10, long j11, long j12) {
        boolean z10;
        long j13 = this.f30571a;
        long j14 = this.f30572b;
        if (j13 == 0 && j14 == 0) {
            return j10;
        }
        int i10 = d6.g0.f27302a;
        long j15 = j10 - j13;
        if (((j13 ^ j10) & (j10 ^ j15)) < 0) {
            j15 = Long.MIN_VALUE;
        }
        long j16 = j10 + j14;
        if (((j14 ^ j16) & (j10 ^ j16)) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z11 = true;
        if (j15 <= j11 && j11 <= j16) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j15 > j12 || j12 > j16) {
            z11 = false;
        }
        if (z10 && z11) {
            if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                return j11;
            }
            return j12;
        }
        if (z10) {
            return j11;
        }
        if (z11) {
            return j12;
        }
        return j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m1.class != obj.getClass()) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (this.f30571a == m1Var.f30571a && this.f30572b == m1Var.f30572b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f30571a) * 31) + ((int) this.f30572b);
    }
}
