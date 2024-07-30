package p4;

import d6.g0;
import java.util.Arrays;
import p4.u;

/* compiled from: ChunkIndex.java */
/* loaded from: classes2.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final int f34300a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f34301b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f34302c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f34303d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f34304e;
    public final long f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f34301b = iArr;
        this.f34302c = jArr;
        this.f34303d = jArr2;
        this.f34304e = jArr3;
        int length = iArr.length;
        this.f34300a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // p4.u
    public final boolean e() {
        return true;
    }

    @Override // p4.u
    public final u.a h(long j10) {
        long[] jArr = this.f34304e;
        int f = g0.f(jArr, j10, true);
        long j11 = jArr[f];
        long[] jArr2 = this.f34302c;
        v vVar = new v(j11, jArr2[f]);
        if (j11 < j10 && f != this.f34300a - 1) {
            int i10 = f + 1;
            return new u.a(vVar, new v(jArr[i10], jArr2[i10]));
        }
        return new u.a(vVar, vVar);
    }

    @Override // p4.u
    public final long i() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f34300a + ", sizes=" + Arrays.toString(this.f34301b) + ", offsets=" + Arrays.toString(this.f34302c) + ", timeUs=" + Arrays.toString(this.f34304e) + ", durationsUs=" + Arrays.toString(this.f34303d) + ")";
    }
}
