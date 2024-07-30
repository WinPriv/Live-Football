package w4;

import d6.g0;
import p4.u;
import p4.v;

/* compiled from: XingSeeker.java */
/* loaded from: classes2.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long f36106a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36107b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36108c;

    /* renamed from: d, reason: collision with root package name */
    public final long f36109d;

    /* renamed from: e, reason: collision with root package name */
    public final long f36110e;
    public final long[] f;

    public g(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f36106a = j10;
        this.f36107b = i10;
        this.f36108c = j11;
        this.f = jArr;
        this.f36109d = j12;
        this.f36110e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // w4.e
    public final long a(long j10) {
        long j11;
        double d10;
        long j12 = j10 - this.f36106a;
        if (e() && j12 > this.f36107b) {
            long[] jArr = this.f;
            d6.a.e(jArr);
            double d11 = (j12 * 256.0d) / this.f36109d;
            int f = g0.f(jArr, (long) d11, true);
            long j13 = this.f36108c;
            long j14 = (f * j13) / 100;
            long j15 = jArr[f];
            int i10 = f + 1;
            long j16 = (j13 * i10) / 100;
            if (f == 99) {
                j11 = 256;
            } else {
                j11 = jArr[i10];
            }
            if (j15 == j11) {
                d10 = 0.0d;
            } else {
                d10 = (d11 - j15) / (j11 - j15);
            }
            return Math.round(d10 * (j16 - j14)) + j14;
        }
        return 0L;
    }

    @Override // w4.e
    public final long b() {
        return this.f36110e;
    }

    @Override // p4.u
    public final boolean e() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    @Override // p4.u
    public final u.a h(long j10) {
        double d10;
        double d11;
        boolean e10 = e();
        int i10 = this.f36107b;
        long j11 = this.f36106a;
        if (!e10) {
            v vVar = new v(0L, j11 + i10);
            return new u.a(vVar, vVar);
        }
        long i11 = g0.i(j10, 0L, this.f36108c);
        double d12 = (i11 * 100.0d) / this.f36108c;
        double d13 = 0.0d;
        if (d12 > 0.0d) {
            if (d12 >= 100.0d) {
                d10 = 256.0d;
                d13 = 256.0d;
                double d14 = d13 / d10;
                long j12 = this.f36109d;
                v vVar2 = new v(i11, j11 + g0.i(Math.round(d14 * j12), i10, j12 - 1));
                return new u.a(vVar2, vVar2);
            }
            int i12 = (int) d12;
            long[] jArr = this.f;
            d6.a.e(jArr);
            double d15 = jArr[i12];
            if (i12 == 99) {
                d11 = 256.0d;
            } else {
                d11 = jArr[i12 + 1];
            }
            d13 = ((d11 - d15) * (d12 - i12)) + d15;
        }
        d10 = 256.0d;
        double d142 = d13 / d10;
        long j122 = this.f36109d;
        v vVar22 = new v(i11, j11 + g0.i(Math.round(d142 * j122), i10, j122 - 1));
        return new u.a(vVar22, vVar22);
    }

    @Override // p4.u
    public final long i() {
        return this.f36108c;
    }
}
