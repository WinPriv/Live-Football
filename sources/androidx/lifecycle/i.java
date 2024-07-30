package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Lifecycle.java */
/* loaded from: classes.dex */
public abstract class i {

    /* compiled from: Lifecycle.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1973a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1974b;

        static {
            int[] iArr = new int[b.values().length];
            f1974b = iArr;
            try {
                iArr[b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1974b[b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1974b[b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1974b[b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1974b[b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1974b[b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1974b[b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[c.values().length];
            f1973a = iArr2;
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1973a[3] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1973a[4] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1973a[0] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1973a[1] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: Lifecycle.java */
    /* loaded from: classes.dex */
    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public final c k() {
            switch (a.f1974b[ordinal()]) {
                case 1:
                case 2:
                    return c.CREATED;
                case 3:
                case 4:
                    return c.STARTED;
                case 5:
                    return c.RESUMED;
                case 6:
                    return c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: Lifecycle.java */
    /* loaded from: classes.dex */
    public enum c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean a(c cVar) {
            if (compareTo(cVar) >= 0) {
                return true;
            }
            return false;
        }
    }

    public i() {
        new AtomicReference();
    }

    public abstract void a(l lVar);

    public abstract c b();

    public abstract void c(l lVar);
}
