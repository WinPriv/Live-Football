package d6;

/* compiled from: Size.java */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final x f27387c = new x(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f27388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27389b;

    static {
        new x(0, 0);
    }

    public x(int i10, int i11) {
        boolean z10;
        if ((i10 != -1 && i10 < 0) || (i11 != -1 && i11 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        a.a(z10);
        this.f27388a = i10;
        this.f27389b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f27388a != xVar.f27388a || this.f27389b != xVar.f27389b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f27388a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f27389b;
    }

    public final String toString() {
        return this.f27388a + "x" + this.f27389b;
    }
}
