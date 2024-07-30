package md;

/* compiled from: PlatformDescription.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f33032a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f33033b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f33034c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f33035d;

    static {
        String property;
        System.getProperty("java.specification.version");
        System.getProperty("java.runtime.version");
        System.getProperty("java.vm.info");
        System.getProperty("java.vm.version");
        System.getProperty("java.vm.vendor");
        f33032a = System.getProperty("java.vm.name");
        f33033b = a();
        boolean z10 = false;
        if (a() != 0 && (property = System.getProperty("java.boot.class.path")) != null && property.toLowerCase().contains("core-oj.jar")) {
            z10 = true;
        }
        f33034c = z10;
        f33035d = System.getProperty("com.google.appengine.runtime.version");
    }

    public static int a() {
        if (!b("Dalvik")) {
            return 0;
        }
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            try {
                try {
                    try {
                        return ((Integer) cls.getField("SDK_INT").get(null)).intValue();
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    }
                } catch (NoSuchFieldException unused) {
                    try {
                        return Integer.parseInt((String) cls.getField("SDK").get(null));
                    } catch (IllegalAccessException e11) {
                        throw new RuntimeException(e11);
                    }
                }
            } catch (NoSuchFieldException e12) {
                throw new r2.a(e12);
            }
        } catch (ClassNotFoundException e13) {
            throw new r2.a(e13);
        }
    }

    public static boolean b(String str) {
        return f33032a.startsWith(str);
    }
}
