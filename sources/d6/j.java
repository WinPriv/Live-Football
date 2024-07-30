package d6;

import android.util.SparseBooleanArray;

/* compiled from: FlagSet.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f27321a;

    /* compiled from: FlagSet.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f27322a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        public boolean f27323b;

        public final void a(int i10) {
            d6.a.d(!this.f27323b);
            this.f27322a.append(i10, true);
        }

        public final j b() {
            d6.a.d(!this.f27323b);
            this.f27323b = true;
            return new j(this.f27322a);
        }
    }

    public j(SparseBooleanArray sparseBooleanArray) {
        this.f27321a = sparseBooleanArray;
    }

    public final int a(int i10) {
        d6.a.c(i10, b());
        return this.f27321a.keyAt(i10);
    }

    public final int b() {
        return this.f27321a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (g0.f27302a < 24) {
            if (b() != jVar.b()) {
                return false;
            }
            for (int i10 = 0; i10 < b(); i10++) {
                if (a(i10) != jVar.a(i10)) {
                    return false;
                }
            }
            return true;
        }
        return this.f27321a.equals(jVar.f27321a);
    }

    public final int hashCode() {
        if (g0.f27302a < 24) {
            int b10 = b();
            for (int i10 = 0; i10 < b(); i10++) {
                b10 = (b10 * 31) + a(i10);
            }
            return b10;
        }
        return this.f27321a.hashCode();
    }
}
