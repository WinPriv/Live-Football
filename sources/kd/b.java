package kd;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;

/* compiled from: GCJInstantiatorBase.java */
/* loaded from: classes2.dex */
public abstract class b<T> implements id.a<T> {

    /* renamed from: t, reason: collision with root package name */
    public static Method f32286t;

    /* renamed from: u, reason: collision with root package name */
    public static a f32287u;

    /* renamed from: s, reason: collision with root package name */
    public final Class<T> f32288s;

    /* compiled from: GCJInstantiatorBase.java */
    /* loaded from: classes2.dex */
    public static class a extends ObjectInputStream {
    }

    public b(Class<T> cls) {
        this.f32288s = cls;
        if (f32286t == null) {
            try {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newObject", Class.class, Class.class);
                f32286t = declaredMethod;
                declaredMethod.setAccessible(true);
                f32287u = new a();
            } catch (IOException e10) {
                throw new r2.a(e10);
            } catch (NoSuchMethodException e11) {
                throw new r2.a(e11);
            } catch (RuntimeException e12) {
                throw new r2.a(e12);
            }
        }
    }
}
