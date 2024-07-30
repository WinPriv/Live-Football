package e6;

import d6.g0;

/* compiled from: VideoSize.java */
/* loaded from: classes2.dex */
public final class n implements k4.f {

    /* renamed from: s, reason: collision with root package name */
    public final int f27845s;

    /* renamed from: t, reason: collision with root package name */
    public final int f27846t;

    /* renamed from: u, reason: collision with root package name */
    public final int f27847u;

    /* renamed from: v, reason: collision with root package name */
    public final float f27848v;

    /* renamed from: w, reason: collision with root package name */
    public static final n f27842w = new n(0, 0, 0, 1.0f);

    /* renamed from: x, reason: collision with root package name */
    public static final String f27843x = g0.F(0);
    public static final String y = g0.F(1);

    /* renamed from: z, reason: collision with root package name */
    public static final String f27844z = g0.F(2);
    public static final String A = g0.F(3);

    public n(int i10, int i11, int i12, float f) {
        this.f27845s = i10;
        this.f27846t = i11;
        this.f27847u = i12;
        this.f27848v = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f27845s == nVar.f27845s && this.f27846t == nVar.f27846t && this.f27847u == nVar.f27847u && this.f27848v == nVar.f27848v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f27848v) + ((((((217 + this.f27845s) * 31) + this.f27846t) * 31) + this.f27847u) * 31);
    }
}
