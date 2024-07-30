package androidx.lifecycle;

import androidx.lifecycle.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
@Deprecated
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f1942c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1943a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1944b = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f1945a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map<C0018b, i.b> f1946b;

        public a(HashMap hashMap) {
            this.f1946b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                i.b bVar = (i.b) entry.getValue();
                List list = (List) this.f1945a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f1945a.put(bVar, list);
                }
                list.add((C0018b) entry.getKey());
            }
        }

        public static void a(List<C0018b> list, m mVar, i.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0018b c0018b = list.get(size);
                    c0018b.getClass();
                    try {
                        int i10 = c0018b.f1947a;
                        Method method = c0018b.f1948b;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    method.invoke(obj, mVar, bVar);
                                }
                            } else {
                                method.invoke(obj, mVar);
                            }
                        } else {
                            method.invoke(obj, new Object[0]);
                        }
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException("Failed to call observer method", e11.getCause());
                    }
                }
            }
        }
    }

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0018b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1947a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f1948b;

        public C0018b(int i10, Method method) {
            this.f1947a = i10;
            this.f1948b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0018b)) {
                return false;
            }
            C0018b c0018b = (C0018b) obj;
            if (this.f1947a == c0018b.f1947a && this.f1948b.getName().equals(c0018b.f1948b.getName())) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f1948b.getName().hashCode() + (this.f1947a * 31);
        }
    }

    public static void c(HashMap hashMap, C0018b c0018b, i.b bVar, Class cls) {
        i.b bVar2 = (i.b) hashMap.get(c0018b);
        if (bVar2 != null && bVar != bVar2) {
            throw new IllegalArgumentException("Method " + c0018b.f1948b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar2 + ", new value " + bVar);
        }
        if (bVar2 == null) {
            hashMap.put(c0018b, bVar);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f1946b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0018b, i.b> entry : b(cls2).f1946b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            s sVar = (s) method.getAnnotation(s.class);
            if (sVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (parameterTypes[0].isAssignableFrom(m.class)) {
                        i10 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i10 = 0;
                }
                i.b value = sVar.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(i.b.class)) {
                        if (value == i.b.ON_ANY) {
                            i10 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new C0018b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f1943a.put(cls, aVar);
        this.f1944b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final a b(Class<?> cls) {
        a aVar = (a) this.f1943a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, null);
    }
}
