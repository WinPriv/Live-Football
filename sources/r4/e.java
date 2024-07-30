package r4;

import d6.g0;
import p4.u;
import p4.v;
import p4.w;

/* compiled from: ChunkReader.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final w f34877a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34878b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34879c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34880d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34881e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f34882g;

    /* renamed from: h, reason: collision with root package name */
    public int f34883h;

    /* renamed from: i, reason: collision with root package name */
    public int f34884i;

    /* renamed from: j, reason: collision with root package name */
    public int f34885j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f34886k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f34887l;

    public e(int i10, int i11, long j10, int i12, w wVar) {
        int i13;
        int i14;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d6.a.a(z10);
        this.f34880d = j10;
        this.f34881e = i12;
        this.f34877a = wVar;
        if (i11 == 2) {
            i13 = 1667497984;
        } else {
            i13 = 1651965952;
        }
        int i15 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f34878b = i13 | i15;
        if (i11 == 2) {
            i14 = i15 | 1650720768;
        } else {
            i14 = -1;
        }
        this.f34879c = i14;
        this.f34886k = new long[512];
        this.f34887l = new int[512];
    }

    public final v a(int i10) {
        return new v(((this.f34880d * 1) / this.f34881e) * this.f34887l[i10], this.f34886k[i10]);
    }

    public final u.a b(long j10) {
        int i10 = (int) (j10 / ((this.f34880d * 1) / this.f34881e));
        int e10 = g0.e(this.f34887l, i10, true, true);
        if (this.f34887l[e10] == i10) {
            v a10 = a(e10);
            return new u.a(a10, a10);
        }
        v a11 = a(e10);
        int i11 = e10 + 1;
        if (i11 < this.f34886k.length) {
            return new u.a(a11, a(i11));
        }
        return new u.a(a11, a11);
    }
}
