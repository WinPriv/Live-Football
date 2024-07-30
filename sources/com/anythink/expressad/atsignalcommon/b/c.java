package com.anythink.expressad.atsignalcommon.b;

import com.anythink.expressad.atsignalcommon.b.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static a f6953a;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static class a extends Throwable {

            /* renamed from: d, reason: collision with root package name */
            private static final long f6954d = 1;

            /* renamed from: a, reason: collision with root package name */
            private Class<?> f6955a;

            /* renamed from: b, reason: collision with root package name */
            private String f6956b;

            /* renamed from: c, reason: collision with root package name */
            private String f6957c;

            public a(String str) {
                super(str);
            }

            public final Class<?> a() {
                return this.f6955a;
            }

            public final String b() {
                return this.f6957c;
            }

            public final String c() {
                return this.f6956b;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() != null) {
                    return a.class.getName() + ": " + getCause();
                }
                return super.toString();
            }

            public a(Exception exc) {
                super(exc);
            }

            public final void a(Class<?> cls) {
                this.f6955a = cls;
            }

            public final void b(String str) {
                this.f6956b = str;
            }

            public final void a(String str) {
                this.f6957c = str;
            }
        }
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.b.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0091c<C> {

        /* renamed from: a, reason: collision with root package name */
        protected Class<C> f6958a;

        public C0091c(Class<C> cls) {
            this.f6958a = cls;
        }

        private e<C, Object> a(String str) {
            return new e<>(this.f6958a, str, 8);
        }

        private e<C, Object> b(String str) {
            return new e<>(this.f6958a, str, 0);
        }

        private f b(String str, Class<?>... clsArr) {
            return new f(this.f6958a, str, clsArr, 8);
        }

        public final f a(String str, Class<?>... clsArr) {
            return new f(this.f6958a, str, clsArr, 0);
        }

        private d a(Class<?>... clsArr) {
            return new d(this.f6958a, clsArr);
        }

        private Class<C> a() {
            return this.f6958a;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        protected Constructor<?> f6959a;

        public d(Class<?> cls, Class<?>[] clsArr) {
            if (cls == null) {
                return;
            }
            try {
                this.f6959a = cls.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException e10) {
                b.a aVar = new b.a(e10);
                aVar.a(cls);
                c.b(aVar);
            }
        }

        private Object a(Object... objArr) {
            this.f6959a.setAccessible(true);
            try {
                return this.f6959a.newInstance(objArr);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.a aVar) {
        a aVar2 = f6953a;
        if (aVar2 != null) {
            if (aVar2.a()) {
                return;
            } else {
                throw aVar;
            }
        }
        throw aVar;
    }

    /* loaded from: classes.dex */
    public static class e<C, T> {

        /* renamed from: a, reason: collision with root package name */
        private Object f6960a;

        /* renamed from: b, reason: collision with root package name */
        private final Field f6961b;

        public e(Class<C> cls, String str, int i10) {
            Field field = null;
            if (cls == null) {
                return;
            }
            try {
                this.f6960a = null;
                field = cls.getDeclaredField(str);
                if (i10 > 0 && (field.getModifiers() & i10) != i10) {
                    c.b(new b.a(field + " does not match modifiers: " + i10));
                }
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                b.a aVar = new b.a(e10);
                aVar.a((Class<?>) cls);
                aVar.b(str);
                c.b(aVar);
            } finally {
                this.f6961b = field;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> a(Class<?> cls) {
            Field field = this.f6961b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                c.b(new b.a(new ClassCastException(this.f6961b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> b(Class<T2> cls) {
            Field field = this.f6961b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                c.b(new b.a(new ClassCastException(this.f6961b + " is not of type " + cls)));
            }
            return this;
        }

        private e<C, T> a(String str) {
            try {
                Class<?> cls = Class.forName(str);
                Field field = this.f6961b;
                if (field != null && !cls.isAssignableFrom(field.getType())) {
                    c.b(new b.a(new ClassCastException(this.f6961b + " is not of type " + cls)));
                }
                return this;
            } catch (ClassNotFoundException e10) {
                c.b(new b.a(e10));
                return this;
            }
        }

        private e<C, T> b(C c10) {
            this.f6960a = c10;
            return this;
        }

        private Field b() {
            return this.f6961b;
        }

        private T a() {
            try {
                return (T) this.f6961b.get(this.f6960a);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        private void a(Object obj) {
            try {
                this.f6961b.set(this.f6960a, obj);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            }
        }

        private void a(b.AbstractC0090b<?> abstractC0090b) {
            T a10 = a();
            if (a10 != null) {
                try {
                    this.f6961b.set(this.f6960a, com.anythink.expressad.atsignalcommon.b.b.a(a10, abstractC0090b, a10.getClass().getInterfaces()));
                    return;
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            throw new IllegalStateException("Cannot mapping null");
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Method f6962a;

        public f(Class<?> cls, String str, Class<?>[] clsArr, int i10) {
            Method method = null;
            if (cls == null) {
                return;
            }
            try {
                method = cls.getDeclaredMethod(str, clsArr);
                if (i10 > 0 && (method.getModifiers() & i10) != i10) {
                    c.b(new b.a(method + " does not match modifiers: " + i10));
                }
                method.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                b.a aVar = new b.a(e10);
                aVar.a(cls);
                aVar.a(str);
                c.b(aVar);
            } finally {
                this.f6962a = method;
            }
        }

        public final Object a(Object obj, Object... objArr) {
            try {
                return this.f6962a.invoke(obj, objArr);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public final Method a() {
            return this.f6962a;
        }
    }

    private static <T> C0091c<T> a(Class<T> cls) {
        return new C0091c<>(cls);
    }

    private static <T> C0091c<T> a(String str) {
        try {
            return new C0091c<>(Class.forName(str));
        } catch (ClassNotFoundException e10) {
            b(new b.a(e10));
            return new C0091c<>(null);
        }
    }

    public static <T> C0091c<T> a(ClassLoader classLoader, String str) {
        try {
            return new C0091c<>(classLoader.loadClass(str));
        } catch (Exception e10) {
            b(new b.a(e10));
            return new C0091c<>(null);
        }
    }

    private static void a(a aVar) {
        f6953a = aVar;
    }
}
