package c6;

import java.io.IOException;

/* compiled from: LoadErrorHandlingPolicy.java */
/* loaded from: classes2.dex */
public interface a0 {

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f3288a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3289b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3290c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3291d;

        public a(int i10, int i11, int i12, int i13) {
            this.f3288a = i10;
            this.f3289b = i11;
            this.f3290c = i12;
            this.f3291d = i13;
        }

        public final boolean a(int i10) {
            if (i10 == 1) {
                if (this.f3288a - this.f3289b <= 1) {
                    return false;
                }
            } else if (this.f3290c - this.f3291d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3292a;

        /* renamed from: b, reason: collision with root package name */
        public final long f3293b;

        public b(int i10, long j10) {
            boolean z10;
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.a(z10);
            this.f3292a = i10;
            this.f3293b = j10;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final IOException f3294a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3295b;

        public c(IOException iOException, int i10) {
            this.f3294a = iOException;
            this.f3295b = i10;
        }
    }

    long a(c cVar);

    b b(a aVar, c cVar);

    int c(int i10);
}
