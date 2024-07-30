package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: s, reason: collision with root package name */
    public final Context f2590s;

    /* renamed from: t, reason: collision with root package name */
    public final WorkerParameters f2591t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f2592u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2593v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2594w;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0023a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.b f2595a = androidx.work.b.f2614c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && C0023a.class == obj.getClass()) {
                    return this.f2595a.equals(((C0023a) obj).f2595a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f2595a.hashCode() + (C0023a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f2595a + '}';
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && b.class == obj.getClass()) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.b f2596a;

            public c() {
                this(androidx.work.b.f2614c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && c.class == obj.getClass()) {
                    return this.f2596a.equals(((c) obj).f2596a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f2596a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f2596a + '}';
            }

            public c(androidx.work.b bVar) {
                this.f2596a = bVar;
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.f2590s = context;
                this.f2591t = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public boolean a() {
        return this.f2594w;
    }

    public abstract c2.c d();

    public final void f() {
        this.f2592u = true;
        b();
    }

    public void b() {
    }
}
