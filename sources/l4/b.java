package l4;

import android.util.SparseArray;
import j5.u;
import java.util.Arrays;
import k4.b1;
import k4.e1;
import k4.q1;

/* compiled from: AnalyticsListener.java */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: AnalyticsListener.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f32394a;

        /* renamed from: b, reason: collision with root package name */
        public final q1 f32395b;

        /* renamed from: c, reason: collision with root package name */
        public final int f32396c;

        /* renamed from: d, reason: collision with root package name */
        public final u.b f32397d;

        /* renamed from: e, reason: collision with root package name */
        public final long f32398e;
        public final q1 f;

        /* renamed from: g, reason: collision with root package name */
        public final int f32399g;

        /* renamed from: h, reason: collision with root package name */
        public final u.b f32400h;

        /* renamed from: i, reason: collision with root package name */
        public final long f32401i;

        /* renamed from: j, reason: collision with root package name */
        public final long f32402j;

        public a(long j10, q1 q1Var, int i10, u.b bVar, long j11, q1 q1Var2, int i11, u.b bVar2, long j12, long j13) {
            this.f32394a = j10;
            this.f32395b = q1Var;
            this.f32396c = i10;
            this.f32397d = bVar;
            this.f32398e = j11;
            this.f = q1Var2;
            this.f32399g = i11;
            this.f32400h = bVar2;
            this.f32401i = j12;
            this.f32402j = j13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f32394a == aVar.f32394a && this.f32396c == aVar.f32396c && this.f32398e == aVar.f32398e && this.f32399g == aVar.f32399g && this.f32401i == aVar.f32401i && this.f32402j == aVar.f32402j && i7.g.a(this.f32395b, aVar.f32395b) && i7.g.a(this.f32397d, aVar.f32397d) && i7.g.a(this.f, aVar.f) && i7.g.a(this.f32400h, aVar.f32400h)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f32394a), this.f32395b, Integer.valueOf(this.f32396c), this.f32397d, Long.valueOf(this.f32398e), this.f, Integer.valueOf(this.f32399g), this.f32400h, Long.valueOf(this.f32401i), Long.valueOf(this.f32402j)});
        }
    }

    /* compiled from: AnalyticsListener.java */
    /* renamed from: l4.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0437b {

        /* renamed from: a, reason: collision with root package name */
        public final d6.j f32403a;

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray<a> f32404b;

        public C0437b(d6.j jVar, SparseArray<a> sparseArray) {
            this.f32403a = jVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(jVar.b());
            for (int i10 = 0; i10 < jVar.b(); i10++) {
                int a10 = jVar.a(i10);
                a aVar = sparseArray.get(a10);
                aVar.getClass();
                sparseArray2.append(a10, aVar);
            }
            this.f32404b = sparseArray2;
        }

        public final boolean a(int i10) {
            return this.f32403a.f27321a.get(i10);
        }
    }

    default void a(e6.n nVar) {
    }

    default void b(n4.e eVar) {
    }

    default void e(j5.r rVar) {
    }

    default void g(b1 b1Var) {
    }

    default void onPositionDiscontinuity(int i10) {
    }

    default void c(e1 e1Var, C0437b c0437b) {
    }

    default void d(a aVar, j5.r rVar) {
    }

    default void f(a aVar, int i10, long j10) {
    }
}
