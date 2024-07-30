package j7;

import java.util.Comparator;

/* compiled from: ComparisonChain.java */
/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30109a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f30110b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f30111c = new b(1);

    /* compiled from: ComparisonChain.java */
    /* loaded from: classes2.dex */
    public class a extends v {
        public static v f(int i10) {
            if (i10 < 0) {
                return v.f30110b;
            }
            if (i10 > 0) {
                return v.f30111c;
            }
            return v.f30109a;
        }

        @Override // j7.v
        public final v a(int i10, int i11) {
            int i12;
            if (i10 < i11) {
                i12 = -1;
            } else if (i10 > i11) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            return f(i12);
        }

        @Override // j7.v
        public final <T> v b(T t10, T t11, Comparator<T> comparator) {
            return f(comparator.compare(t10, t11));
        }

        @Override // j7.v
        public final v c(boolean z10, boolean z11) {
            int i10;
            if (z10 == z11) {
                i10 = 0;
            } else if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            return f(i10);
        }

        @Override // j7.v
        public final v d(boolean z10, boolean z11) {
            int i10;
            if (z11 == z10) {
                i10 = 0;
            } else if (z11) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            return f(i10);
        }

        @Override // j7.v
        public final int e() {
            return 0;
        }
    }

    public abstract v a(int i10, int i11);

    public abstract <T> v b(T t10, T t11, Comparator<T> comparator);

    public abstract v c(boolean z10, boolean z11);

    public abstract v d(boolean z10, boolean z11);

    public abstract int e();

    /* compiled from: ComparisonChain.java */
    /* loaded from: classes2.dex */
    public static final class b extends v {

        /* renamed from: d, reason: collision with root package name */
        public final int f30112d;

        public b(int i10) {
            this.f30112d = i10;
        }

        @Override // j7.v
        public final int e() {
            return this.f30112d;
        }

        @Override // j7.v
        public final v a(int i10, int i11) {
            return this;
        }

        @Override // j7.v
        public final v c(boolean z10, boolean z11) {
            return this;
        }

        @Override // j7.v
        public final v d(boolean z10, boolean z11) {
            return this;
        }

        @Override // j7.v
        public final <T> v b(T t10, T t11, Comparator<T> comparator) {
            return this;
        }
    }
}
