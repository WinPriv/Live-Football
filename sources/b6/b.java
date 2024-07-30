package b6;

import android.os.SystemClock;
import d6.g0;
import j5.m0;
import java.util.Arrays;
import java.util.List;
import k4.i0;

/* compiled from: BaseTrackSelection.java */
/* loaded from: classes2.dex */
public abstract class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f3012a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3013b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f3014c;

    /* renamed from: d, reason: collision with root package name */
    public final i0[] f3015d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f3016e;
    public int f;

    public b(m0 m0Var, int[] iArr) {
        boolean z10;
        int i10 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        m0Var.getClass();
        this.f3012a = m0Var;
        int length = iArr.length;
        this.f3013b = length;
        this.f3015d = new i0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f3015d[i11] = m0Var.f29804v[iArr[i11]];
        }
        Arrays.sort(this.f3015d, new k0.d(3));
        this.f3014c = new int[this.f3013b];
        while (true) {
            int i12 = this.f3013b;
            if (i10 < i12) {
                this.f3014c[i10] = m0Var.a(this.f3015d[i10]);
                i10++;
            } else {
                this.f3016e = new long[i12];
                return;
            }
        }
    }

    @Override // b6.i
    public final m0 a() {
        return this.f3012a;
    }

    @Override // b6.i
    public final int b(i0 i0Var) {
        for (int i10 = 0; i10 < this.f3013b; i10++) {
            if (this.f3015d[i10] == i0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // b6.i
    public final i0 c(int i10) {
        return this.f3015d[i10];
    }

    @Override // b6.i
    public final int d(int i10) {
        return this.f3014c[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3012a == bVar.f3012a && Arrays.equals(this.f3014c, bVar.f3014c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.f3014c) + (System.identityHashCode(this.f3012a) * 31);
        }
        return this.f;
    }

    @Override // b6.f
    public final boolean i(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean j11 = j(i10, elapsedRealtime);
        for (int i11 = 0; i11 < this.f3013b && !j11; i11++) {
            if (i11 != i10 && !j(i11, elapsedRealtime)) {
                j11 = true;
            } else {
                j11 = false;
            }
        }
        if (!j11) {
            return false;
        }
        long[] jArr = this.f3016e;
        long j12 = jArr[i10];
        int i12 = g0.f27302a;
        long j13 = elapsedRealtime + j10;
        if (((j10 ^ j13) & (elapsedRealtime ^ j13)) < 0) {
            j13 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j12, j13);
        return true;
    }

    @Override // b6.f
    public final boolean j(int i10, long j10) {
        if (this.f3016e[i10] > j10) {
            return true;
        }
        return false;
    }

    @Override // b6.i
    public final int length() {
        return this.f3014c.length;
    }

    @Override // b6.f
    public int m(long j10, List<? extends l5.l> list) {
        return list.size();
    }

    @Override // b6.f
    public final int n() {
        return this.f3014c[g()];
    }

    @Override // b6.f
    public final i0 o() {
        return this.f3015d[g()];
    }

    @Override // b6.i
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f3013b; i11++) {
            if (this.f3014c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // b6.f
    public void e() {
    }

    @Override // b6.f
    public void l() {
    }

    @Override // b6.f
    public void q(float f) {
    }
}
