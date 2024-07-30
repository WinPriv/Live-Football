package p4;

import d6.g0;
import p4.u;

/* compiled from: IndexSeekMap.java */
/* loaded from: classes2.dex */
public final class s implements u {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f34345a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f34346b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34347c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34348d;

    public s(long[] jArr, long[] jArr2, long j10) {
        boolean z10;
        boolean z11;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        int length = jArr2.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34348d = z11;
        if (z11 && jArr2[0] > 0) {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f34345a = jArr3;
            long[] jArr4 = new long[i10];
            this.f34346b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f34345a = jArr;
            this.f34346b = jArr2;
        }
        this.f34347c = j10;
    }

    @Override // p4.u
    public final boolean e() {
        return this.f34348d;
    }

    @Override // p4.u
    public final u.a h(long j10) {
        if (!this.f34348d) {
            v vVar = v.f34354c;
            return new u.a(vVar, vVar);
        }
        long[] jArr = this.f34346b;
        int f = g0.f(jArr, j10, true);
        long j11 = jArr[f];
        long[] jArr2 = this.f34345a;
        v vVar2 = new v(j11, jArr2[f]);
        if (j11 != j10 && f != jArr.length - 1) {
            int i10 = f + 1;
            return new u.a(vVar2, new v(jArr[i10], jArr2[i10]));
        }
        return new u.a(vVar2, vVar2);
    }

    @Override // p4.u
    public final long i() {
        return this.f34347c;
    }
}
