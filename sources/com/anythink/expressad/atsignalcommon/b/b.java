package com.anythink.expressad.atsignalcommon.b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0090b<T> implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private T f6952a;

        private T a() {
            return this.f6952a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(this.f6952a, objArr);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return null;
            } catch (IllegalArgumentException e11) {
                e11.printStackTrace();
                return null;
            } catch (InvocationTargetException e12) {
                throw e12.getTargetException();
            }
        }

        public final void a(T t10) {
            this.f6952a = t10;
        }
    }

    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T a(Object obj, Class<T> cls, AbstractC0090b<T> abstractC0090b) {
        if (obj instanceof a) {
            return obj;
        }
        abstractC0090b.a(obj);
        return (T) Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls, a.class}, abstractC0090b);
    }

    public static <T> T a(Object obj, AbstractC0090b<T> abstractC0090b, Class<?>... clsArr) {
        abstractC0090b.a(obj);
        return (T) Proxy.newProxyInstance(b.class.getClassLoader(), clsArr, abstractC0090b);
    }
}
