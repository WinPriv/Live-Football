package o8;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f33778a;

    static {
        z yVar;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            yVar = new v(declaredField.get(null), cls.getMethod("allocateInstance", Class.class));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    yVar = new w(intValue, declaredMethod2);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    yVar = new x(declaredMethod3);
                }
            } catch (Exception unused3) {
                yVar = new y();
            }
        }
        f33778a = yVar;
    }

    public static void a(Class cls) {
        String a10 = j.a(cls);
        if (a10 == null) {
        } else {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a10));
        }
    }

    public abstract <T> T b(Class<T> cls) throws Exception;
}
