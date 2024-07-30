package w4;

import d6.g0;
import p4.u;
import p4.v;

/* compiled from: VbriSeeker.java */
/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f36102a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f36103b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36104c;

    /* renamed from: d, reason: collision with root package name */
    public final long f36105d;

    public f(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f36102a = jArr;
        this.f36103b = jArr2;
        this.f36104c = j10;
        this.f36105d = j11;
    }

    @Override // w4.e
    public final long a(long j10) {
        return this.f36102a[g0.f(this.f36103b, j10, true)];
    }

    @Override // w4.e
    public final long b() {
        return this.f36105d;
    }

    @Override // p4.u
    public final boolean e() {
        return true;
    }

    @Override // p4.u
    public final u.a h(long j10) {
        long[] jArr = this.f36102a;
        int f = g0.f(jArr, j10, true);
        long j11 = jArr[f];
        long[] jArr2 = this.f36103b;
        v vVar = new v(j11, jArr2[f]);
        if (j11 < j10 && f != jArr.length - 1) {
            int i10 = f + 1;
            return new u.a(vVar, new v(jArr[i10], jArr2[i10]));
        }
        return new u.a(vVar, vVar);
    }

    @Override // p4.u
    public final long i() {
        return this.f36104c;
    }
}
