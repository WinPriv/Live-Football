package jd;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: AccessibleInstantiator.java */
/* loaded from: classes2.dex */
public final class a implements id.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f30220s;

    /* renamed from: t, reason: collision with root package name */
    public final Constructor f30221t;

    public a(Class cls, int i10) {
        this.f30220s = i10;
        if (i10 != 1) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                this.f30221t = declaredConstructor;
                if (declaredConstructor != null) {
                    declaredConstructor.setAccessible(true);
                    return;
                }
                return;
            } catch (Exception e10) {
                throw new r2.a(e10);
            }
        }
        try {
            Constructor constructor = Object.class.getConstructor(null);
            try {
                Class<?> cls2 = Class.forName("sun.reflect.ReflectionFactory");
                try {
                    try {
                        try {
                            Constructor constructor2 = (Constructor) cls2.getDeclaredMethod("newConstructorForSerialization", Class.class, Constructor.class).invoke(cls2.getDeclaredMethod("getReflectionFactory", new Class[0]).invoke(null, new Object[0]), cls, constructor);
                            this.f30221t = constructor2;
                            constructor2.setAccessible(true);
                        } catch (IllegalAccessException e11) {
                            throw new r2.a(e11);
                        } catch (IllegalArgumentException e12) {
                            throw new r2.a(e12);
                        } catch (InvocationTargetException e13) {
                            throw new r2.a(e13);
                        }
                    } catch (NoSuchMethodException e14) {
                        throw new r2.a(e14);
                    }
                } catch (IllegalAccessException e15) {
                    throw new r2.a(e15);
                } catch (IllegalArgumentException e16) {
                    throw new r2.a(e16);
                } catch (NoSuchMethodException e17) {
                    throw new r2.a(e17);
                } catch (InvocationTargetException e18) {
                    throw new r2.a(e18);
                }
            } catch (ClassNotFoundException e19) {
                throw new r2.a(e19);
            }
        } catch (NoSuchMethodException e20) {
            throw new r2.a(e20);
        }
    }

    @Override // id.a
    public final Object newInstance() {
        int i10 = this.f30220s;
        Constructor constructor = this.f30221t;
        switch (i10) {
            case 0:
                try {
                    return constructor.newInstance(null);
                } catch (Exception e10) {
                    throw new r2.a(e10);
                }
            default:
                try {
                    return constructor.newInstance(null);
                } catch (Exception e11) {
                    throw new r2.a(e11);
                }
        }
    }
}
