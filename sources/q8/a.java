package q8;

import a3.k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m8.o;

/* compiled from: ReflectionHelper.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0464a f34709a;

    /* compiled from: ReflectionHelper.java */
    /* renamed from: q8.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0464a {
        public abstract Method a(Class<?> cls, Field field);

        public abstract <T> Constructor<T> b(Class<T> cls);

        public abstract String[] c(Class<?> cls);

        public abstract boolean d(Class<?> cls);
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes2.dex */
    public static class b extends AbstractC0464a {
        @Override // q8.a.AbstractC0464a
        public final Method a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // q8.a.AbstractC0464a
        public final <T> Constructor<T> b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // q8.a.AbstractC0464a
        public final String[] c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // q8.a.AbstractC0464a
        public final boolean d(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes2.dex */
    public static class c extends AbstractC0464a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f34710a = Class.class.getMethod("isRecord", new Class[0]);

        /* renamed from: b, reason: collision with root package name */
        public final Method f34711b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f34712c;

        /* renamed from: d, reason: collision with root package name */
        public final Method f34713d;

        public c() throws NoSuchMethodException {
            Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
            this.f34711b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f34712c = componentType.getMethod("getName", new Class[0]);
            this.f34713d = componentType.getMethod("getType", new Class[0]);
        }

        @Override // q8.a.AbstractC0464a
        public final Method a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
            }
        }

        @Override // q8.a.AbstractC0464a
        public final <T> Constructor<T> b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.f34711b.invoke(cls, new Object[0]);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    clsArr[i10] = (Class) this.f34713d.invoke(objArr[i10], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
            }
        }

        @Override // q8.a.AbstractC0464a
        public final String[] c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.f34711b.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    strArr[i10] = (String) this.f34712c.invoke(objArr[i10], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
            }
        }

        @Override // q8.a.AbstractC0464a
        public final boolean d(Class<?> cls) {
            try {
                return ((Boolean) this.f34710a.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
            }
        }
    }

    static {
        AbstractC0464a bVar;
        try {
            bVar = new c();
        } catch (NoSuchMethodException unused) {
            bVar = new b();
        }
        f34709a = bVar;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb2) {
        Class<?>[] parameterTypes;
        sb2.append('(');
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
    }

    public static String b(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb2);
        return sb2.toString();
    }

    public static String c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String d(AccessibleObject accessibleObject, boolean z10) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            a(method, sb2);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb2.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (z10 && Character.isLowerCase(str.charAt(0))) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public static void e(AccessibleObject accessibleObject) throws o {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e10) {
            throw new o(k.l("Failed making ", d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e10);
        }
    }
}
