package b6;

import d6.p;
import j5.m0;
import java.util.List;
import k4.i0;

/* compiled from: ExoTrackSelection.java */
/* loaded from: classes2.dex */
public interface f extends i {

    /* compiled from: ExoTrackSelection.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final m0 f3060a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f3061b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3062c;

        public a() {
            throw null;
        }

        public a(int i10, m0 m0Var, int[] iArr) {
            if (iArr.length == 0) {
                p.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f3060a = m0Var;
            this.f3061b = iArr;
            this.f3062c = i10;
        }
    }

    /* compiled from: ExoTrackSelection.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    void e();

    void f(long j10, long j11, long j12, List<? extends l5.l> list, l5.m[] mVarArr);

    int g();

    default boolean h(long j10, l5.e eVar, List<? extends l5.l> list) {
        return false;
    }

    boolean i(int i10, long j10);

    boolean j(int i10, long j10);

    void l();

    int m(long j10, List<? extends l5.l> list);

    int n();

    i0 o();

    int p();

    void q(float f);

    Object r();

    default void s() {
    }

    default void t() {
    }

    default void k(boolean z10) {
    }
}
