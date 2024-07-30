package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* compiled from: FragmentFactory.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final q.i<ClassLoader, q.i<String, Class<?>>> f1863a = new q.i<>();

    public static Class<?> a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        q.i<ClassLoader, q.i<String, Class<?>>> iVar = f1863a;
        q.i<String, Class<?>> orDefault = iVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new q.i<>();
            iVar.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 == null) {
            Class<?> cls = Class.forName(str, false, classLoader);
            orDefault.put(str, cls);
            return cls;
        }
        return orDefault2;
    }

    public static Class<? extends Fragment> b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.j(a3.k.l("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.j(a3.k.l("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }
}
