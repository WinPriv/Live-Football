package k4;

import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import d6.j;
import java.util.Arrays;
import java.util.List;

/* compiled from: Player.java */
/* loaded from: classes2.dex */
public interface e1 {

    /* compiled from: Player.java */
    /* loaded from: classes2.dex */
    public static final class a implements f {

        /* renamed from: s, reason: collision with root package name */
        public final d6.j f30412s;

        /* compiled from: Player.java */
        /* renamed from: k4.e1$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0417a {

            /* renamed from: a, reason: collision with root package name */
            public final j.a f30413a = new j.a();

            public final void a(int i10, boolean z10) {
                j.a aVar = this.f30413a;
                if (z10) {
                    aVar.a(i10);
                } else {
                    aVar.getClass();
                }
            }
        }

        static {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            d6.a.d(!false);
            new d6.j(sparseBooleanArray);
            d6.g0.F(0);
        }

        public a(d6.j jVar) {
            this.f30412s = jVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.f30412s.equals(((a) obj).f30412s);
        }

        public final int hashCode() {
            return this.f30412s.hashCode();
        }
    }

    /* compiled from: Player.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final d6.j f30414a;

        public b(d6.j jVar) {
            this.f30414a = jVar;
        }

        public final boolean a(int... iArr) {
            d6.j jVar = this.f30414a;
            jVar.getClass();
            for (int i10 : iArr) {
                if (jVar.f27321a.get(i10)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f30414a.equals(((b) obj).f30414a);
        }

        public final int hashCode() {
            return this.f30414a.hashCode();
        }
    }

    /* compiled from: Player.java */
    /* loaded from: classes2.dex */
    public static final class d implements f {
        public final int A;

        /* renamed from: s, reason: collision with root package name */
        public final Object f30415s;

        /* renamed from: t, reason: collision with root package name */
        public final int f30416t;

        /* renamed from: u, reason: collision with root package name */
        public final n0 f30417u;

        /* renamed from: v, reason: collision with root package name */
        public final Object f30418v;

        /* renamed from: w, reason: collision with root package name */
        public final int f30419w;

        /* renamed from: x, reason: collision with root package name */
        public final long f30420x;
        public final long y;

        /* renamed from: z, reason: collision with root package name */
        public final int f30421z;

        static {
            d6.g0.F(0);
            d6.g0.F(1);
            d6.g0.F(2);
            d6.g0.F(3);
            d6.g0.F(4);
            d6.g0.F(5);
            d6.g0.F(6);
        }

        public d(Object obj, int i10, n0 n0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f30415s = obj;
            this.f30416t = i10;
            this.f30417u = n0Var;
            this.f30418v = obj2;
            this.f30419w = i11;
            this.f30420x = j10;
            this.y = j11;
            this.f30421z = i12;
            this.A = i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f30416t == dVar.f30416t && this.f30419w == dVar.f30419w && this.f30420x == dVar.f30420x && this.y == dVar.y && this.f30421z == dVar.f30421z && this.A == dVar.A && i7.g.a(this.f30415s, dVar.f30415s) && i7.g.a(this.f30418v, dVar.f30418v) && i7.g.a(this.f30417u, dVar.f30417u)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f30415s, Integer.valueOf(this.f30416t), this.f30417u, this.f30418v, Integer.valueOf(this.f30419w), Long.valueOf(this.f30420x), Long.valueOf(this.y), Integer.valueOf(this.f30421z), Integer.valueOf(this.A)});
        }
    }

    int A();

    int B();

    boolean C(int i10);

    void D(int i10);

    void E(SurfaceView surfaceView);

    boolean F();

    int G();

    int H();

    q1 I();

    Looper J();

    boolean K();

    long L();

    void M();

    void N();

    void O(TextureView textureView);

    void P();

    o0 Q();

    boolean R();

    void a(d1 d1Var);

    void b();

    boolean c();

    d1 d();

    long e();

    void f(int i10, long j10);

    boolean g();

    long getCurrentPosition();

    void h(boolean z10);

    long i();

    boolean isPlaying();

    int j();

    void k(TextureView textureView);

    e6.n l();

    void m();

    boolean n();

    int o();

    void p(SurfaceView surfaceView);

    void pause();

    void play();

    void q(c cVar);

    void r();

    void s(c cVar);

    long t();

    boolean u();

    int v();

    r1 w();

    boolean x();

    r5.c y();

    m z();

    /* compiled from: Player.java */
    /* loaded from: classes2.dex */
    public interface c {
        @Deprecated
        default void T() {
        }

        default void X() {
        }

        @Deprecated
        default void a0() {
        }

        @Deprecated
        default void onSeekProcessed() {
        }

        default void C(boolean z10) {
        }

        default void F(int i10) {
        }

        default void L(d1 d1Var) {
        }

        default void M(r1 r1Var) {
        }

        default void Q(o0 o0Var) {
        }

        default void S(int i10) {
        }

        default void U(a aVar) {
        }

        default void Y(b bVar) {
        }

        @Deprecated
        default void Z(List<r5.a> list) {
        }

        default void a(e6.n nVar) {
        }

        default void c0(m mVar) {
        }

        default void d0(l lVar) {
        }

        default void h(Metadata metadata) {
        }

        default void i0(boolean z10) {
        }

        default void l(boolean z10) {
        }

        default void onRepeatModeChanged(int i10) {
        }

        default void onShuffleModeEnabledChanged(boolean z10) {
        }

        default void u(r5.c cVar) {
        }

        default void w(int i10) {
        }

        default void x(m mVar) {
        }

        default void D(int i10, boolean z10) {
        }

        default void R(int i10, boolean z10) {
        }

        default void e0(int i10, int i11) {
        }

        default void g0(n0 n0Var, int i10) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z10, int i10) {
        }

        default void f0(int i10, d dVar, d dVar2) {
        }
    }
}
