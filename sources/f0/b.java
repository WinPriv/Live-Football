package f0;

import android.graphics.Insets;

/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f27898e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f27899a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27900b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27901c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27902d;

    /* compiled from: Insets.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            Insets of;
            of = Insets.of(i10, i11, i12, i13);
            return of;
        }
    }

    public b(int i10, int i11, int i12, int i13) {
        this.f27899a = i10;
        this.f27900b = i11;
        this.f27901c = i12;
        this.f27902d = i13;
    }

    public static b a(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f27898e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b b(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return a(i10, i11, i12, i13);
    }

    public final Insets c() {
        return a.a(this.f27899a, this.f27900b, this.f27901c, this.f27902d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f27902d == bVar.f27902d && this.f27899a == bVar.f27899a && this.f27901c == bVar.f27901c && this.f27900b == bVar.f27900b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f27899a * 31) + this.f27900b) * 31) + this.f27901c) * 31) + this.f27902d;
    }

    public final String toString() {
        return "Insets{left=" + this.f27899a + ", top=" + this.f27900b + ", right=" + this.f27901c + ", bottom=" + this.f27902d + '}';
    }
}
