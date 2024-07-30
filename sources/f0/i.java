package f0;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi28Impl.java */
/* loaded from: classes.dex */
public final class i extends h {
    @Override // f0.h
    public final Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f27922l.invoke(null, newInstance, com.anythink.expressad.exoplayer.b.f7305m, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // f0.h
    public final Method o(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
