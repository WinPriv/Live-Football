package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<Class<?>> f1954a = androidx.activity.n.F0(Application.class, x.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List<Class<?>> f1955b = androidx.activity.n.E0(x.class);

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        List list2;
        zc.d.d(list, "signature");
        Object[] constructors = cls.getConstructors();
        zc.d.c(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            zc.d.c(parameterTypes, "constructor.parameterTypes");
            int length = parameterTypes.length;
            if (length != 0) {
                if (length != 1) {
                    list2 = new ArrayList(new vc.a(parameterTypes));
                } else {
                    list2 = androidx.activity.n.E0(parameterTypes[0]);
                }
            } else {
                list2 = vc.d.f36006s;
            }
            if (zc.d.a(list, list2)) {
                return constructor;
            }
            if (list.size() == list2.size() && list2.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends e0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
