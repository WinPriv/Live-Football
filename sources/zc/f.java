package zc;

/* compiled from: Reflection.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final g f37365a;

    /* renamed from: b, reason: collision with root package name */
    public static final bd.a[] f37366b;

    static {
        g gVar = null;
        try {
            gVar = (g) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (gVar == null) {
            gVar = new g();
        }
        f37365a = gVar;
        f37366b = new bd.a[0];
    }
}
