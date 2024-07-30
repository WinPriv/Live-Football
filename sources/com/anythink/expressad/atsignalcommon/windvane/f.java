package com.anythink.expressad.atsignalcommon.windvane;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public class f {

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static abstract class b<T> implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private T f7052a;

        private T a() {
            return this.f7052a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return method.invoke(this.f7052a, objArr);
        }

        public final void a(T t10) {
            this.f7052a = t10;
        }
    }

    private f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T a(Object obj, Class<T> cls, b<T> bVar) {
        if (obj instanceof a) {
            return obj;
        }
        bVar.a(obj);
        return (T) Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{cls, a.class}, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T a(Object obj, b<T> bVar, Class<?>... clsArr) {
        if (Proxy.isProxyClass(obj.getClass())) {
            return obj;
        }
        bVar.a(obj);
        return (T) Proxy.newProxyInstance(f.class.getClassLoader(), clsArr, bVar);
    }
}
