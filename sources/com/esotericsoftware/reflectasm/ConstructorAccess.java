package com.esotericsoftware.reflectasm;

import hd.d;
import hd.n;
import java.lang.reflect.Modifier;
import s.f;

/* loaded from: classes.dex */
public abstract class ConstructorAccess<T> {
    boolean isNonStaticMemberClass;

    public static <T> ConstructorAccess<T> get(Class<T> cls) {
        boolean z10;
        int modifiers;
        String str;
        String str2;
        Class<?> defineClass;
        ConstructorAccess<T> constructorAccess;
        String str3;
        Class<?> enclosingClass = cls.getEnclosingClass();
        if (enclosingClass != null && cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
            z10 = true;
        } else {
            z10 = false;
        }
        String name = cls.getName();
        String concat = name.concat("ConstructorAccess");
        if (concat.startsWith("java.")) {
            concat = "reflectasm.".concat(concat);
        }
        AccessClassLoader accessClassLoader = AccessClassLoader.get(cls);
        try {
            defineClass = accessClassLoader.loadClass(concat);
        } catch (ClassNotFoundException unused) {
            synchronized (accessClassLoader) {
                try {
                    defineClass = accessClassLoader.loadClass(concat);
                } catch (ClassNotFoundException unused2) {
                    String replace = concat.replace('.', '/');
                    String replace2 = name.replace('.', '/');
                    if (!z10) {
                        str = null;
                        try {
                            modifiers = cls.getDeclaredConstructor(null).getModifiers();
                            if (Modifier.isPrivate(modifiers)) {
                                throw new RuntimeException("Class cannot be created (the no-arg constructor is private): ".concat(cls.getName()));
                            }
                        } catch (Exception e10) {
                            throw new RuntimeException("Class cannot be created (missing no-arg constructor): ".concat(cls.getName()), e10);
                        }
                    } else {
                        String replace3 = enclosingClass.getName().replace('.', '/');
                        try {
                            modifiers = cls.getDeclaredConstructor(enclosingClass).getModifiers();
                            if (!Modifier.isPrivate(modifiers)) {
                                str = replace3;
                            } else {
                                throw new RuntimeException("Non-static member class cannot be created (the enclosing class constructor is private): ".concat(cls.getName()));
                            }
                        } catch (Exception e11) {
                            throw new RuntimeException("Non-static member class cannot be created (missing enclosing class constructor): ".concat(cls.getName()), e11);
                        }
                    }
                    if (Modifier.isPublic(modifiers)) {
                        str2 = "com/esotericsoftware/reflectasm/PublicConstructorAccess";
                    } else {
                        str2 = "com/esotericsoftware/reflectasm/ConstructorAccess";
                    }
                    d dVar = new d(0);
                    dVar.Z(196653, 33, replace, null, str2, null);
                    insertConstructor(dVar, str2);
                    insertNewInstance(dVar, replace2);
                    insertNewInstanceInner(dVar, replace2, str);
                    defineClass = accessClassLoader.defineClass(concat, dVar.y0());
                    constructorAccess = (ConstructorAccess) defineClass.newInstance();
                    if (constructorAccess instanceof PublicConstructorAccess) {
                    }
                    constructorAccess.isNonStaticMemberClass = z10;
                    return constructorAccess;
                }
            }
        }
        try {
            constructorAccess = (ConstructorAccess) defineClass.newInstance();
            if ((constructorAccess instanceof PublicConstructorAccess) && !AccessClassLoader.areInSameRuntimeClassLoader(cls, defineClass)) {
                if (!z10) {
                    str3 = "Class cannot be created (the no-arg constructor is protected or package-protected, and its ConstructorAccess could not be defined in the same class loader): ";
                } else {
                    str3 = "Non-static member class cannot be created (the enclosing class constructor is protected or package-protected, and its ConstructorAccess could not be defined in the same class loader): ";
                }
                throw new RuntimeException(str3.concat(cls.getName()));
            }
            constructorAccess.isNonStaticMemberClass = z10;
            return constructorAccess;
        } catch (Throwable th) {
            throw new RuntimeException(f.b("Exception constructing constructor access class: ", concat), th);
        }
    }

    private static void insertConstructor(d dVar, String str) {
        n b02 = dVar.b0(1, "<init>", "()V", null, null);
        b02.g(25, 0);
        b02.d(183, str, "<init>", "()V");
        b02.a(177);
        b02.c(1, 1);
    }

    public static void insertNewInstance(d dVar, String str) {
        n b02 = dVar.b0(1, "newInstance", "()Ljava/lang/Object;", null, null);
        b02.f(187, str);
        b02.a(89);
        b02.d(183, str, "<init>", "()V");
        b02.a(176);
        b02.c(2, 1);
    }

    public static void insertNewInstanceInner(d dVar, String str, String str2) {
        n b02 = dVar.b0(1, "newInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
        if (str2 != null) {
            b02.f(187, str);
            b02.a(89);
            b02.g(25, 1);
            b02.f(192, str2);
            b02.a(89);
            b02.d(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            b02.a(87);
            b02.d(183, str, "<init>", "(L" + str2 + ";)V");
            b02.a(176);
            b02.c(4, 2);
            return;
        }
        b02.f(187, "java/lang/UnsupportedOperationException");
        b02.a(89);
        b02.b("Not an inner class.");
        b02.d(183, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V");
        b02.a(191);
        b02.c(3, 2);
    }

    public boolean isNonStaticMemberClass() {
        return this.isNonStaticMemberClass;
    }

    public abstract T newInstance();

    public abstract T newInstance(Object obj);
}
