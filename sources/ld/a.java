package ld;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: UnsafeFactoryInstantiator.java */
/* loaded from: classes2.dex */
public final class a<T> implements id.a<T> {

    /* renamed from: t, reason: collision with root package name */
    public static Unsafe f32604t;

    /* renamed from: s, reason: collision with root package name */
    public final Class<T> f32605s;

    public a(Class<T> cls) {
        if (f32604t == null) {
            try {
                Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                try {
                    f32604t = (Unsafe) declaredField.get(null);
                } catch (IllegalAccessException e10) {
                    throw new r2.a(e10);
                }
            } catch (NoSuchFieldException e11) {
                throw new r2.a(e11);
            }
        }
        this.f32605s = cls;
    }

    @Override // id.a
    public final T newInstance() {
        try {
            Class<T> cls = this.f32605s;
            return cls.cast(f32604t.allocateInstance(cls));
        } catch (InstantiationException e10) {
            throw new r2.a(e10);
        }
    }
}
