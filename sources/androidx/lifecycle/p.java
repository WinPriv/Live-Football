package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: Lifecycling.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1992a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1993b = new HashMap();

    public static f a(Constructor<? extends f> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    public static int c(Class<?> cls) {
        Constructor<?> constructor;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        HashMap hashMap = f1992a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r42 != null) {
                    str = r42.getName();
                } else {
                    str = "";
                }
                if (!str.isEmpty()) {
                    canonicalName = canonicalName.substring(str.length() + 1);
                }
                String b10 = b(canonicalName);
                if (!str.isEmpty()) {
                    b10 = str + "." + b10;
                }
                constructor = Class.forName(b10).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap hashMap2 = f1993b;
            if (constructor != null) {
                hashMap2.put(cls, Collections.singletonList(constructor));
            } else {
                b bVar = b.f1942c;
                HashMap hashMap3 = bVar.f1944b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (((s) declaredMethods[i11].getAnnotation(s.class)) != null) {
                                    bVar.a(cls, declaredMethods);
                                    z10 = true;
                                    break;
                                }
                                i11++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z10) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && l.class.isAssignableFrom(superclass)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (c(superclass) != 1) {
                            arrayList = new ArrayList((Collection) hashMap2.get(superclass));
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            Class<?> cls2 = interfaces[i12];
                            if (cls2 != null && l.class.isAssignableFrom(cls2)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) hashMap2.get(cls2));
                            }
                            i12++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i10 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
