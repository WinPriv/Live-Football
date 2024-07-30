package r1;

import android.annotation.SuppressLint;

/* compiled from: Operation.java */
/* loaded from: classes.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final a.c f34825a = new a.c();

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final a.b f34826b = new a.b();

    /* compiled from: Operation.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* compiled from: Operation.java */
        /* renamed from: r1.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0468a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f34827a;

            public C0468a(Throwable th) {
                this.f34827a = th;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", this.f34827a.getMessage());
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
