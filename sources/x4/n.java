package x4;

import d6.g0;

/* compiled from: TrackSampleTable.java */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final k f36470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36471b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f36472c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f36473d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36474e;
    public final long[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f36475g;

    /* renamed from: h, reason: collision with root package name */
    public final long f36476h;

    public n(k kVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        d6.a.a(z11);
        d6.a.a(iArr2.length == jArr2.length);
        this.f36470a = kVar;
        this.f36472c = jArr;
        this.f36473d = iArr;
        this.f36474e = i10;
        this.f = jArr2;
        this.f36475g = iArr2;
        this.f36476h = j10;
        this.f36471b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f;
        for (int b10 = g0.b(jArr, j10, true); b10 < jArr.length; b10++) {
            if ((this.f36475g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }
}
