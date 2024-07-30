package com.esotericsoftware.reflectasm;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.security.ProtectionDomain;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AccessClassLoader extends ClassLoader {
    private static final WeakHashMap<ClassLoader, WeakReference<AccessClassLoader>> accessClassLoaders = new WeakHashMap<>();
    private static volatile Method defineClassMethod;
    private static volatile AccessClassLoader selfContextAccessClassLoader;
    private static final ClassLoader selfContextParentClassLoader;

    static {
        ClassLoader parentClassLoader = getParentClassLoader(AccessClassLoader.class);
        selfContextParentClassLoader = parentClassLoader;
        selfContextAccessClassLoader = new AccessClassLoader(parentClassLoader);
    }

    private AccessClassLoader(ClassLoader classLoader) {
        super(classLoader);
    }

    public static int activeAccessClassLoaders() {
        int size = accessClassLoaders.size();
        if (selfContextAccessClassLoader != null) {
            return size + 1;
        }
        return size;
    }

    public static boolean areInSameRuntimeClassLoader(Class cls, Class cls2) {
        if (cls.getPackage() != cls2.getPackage()) {
            return false;
        }
        ClassLoader classLoader = cls.getClassLoader();
        ClassLoader classLoader2 = cls2.getClassLoader();
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        if (classLoader == null) {
            if (classLoader2 != null && classLoader2 != systemClassLoader) {
                return false;
            }
            return true;
        }
        if (classLoader2 == null) {
            if (classLoader != systemClassLoader) {
                return false;
            }
            return true;
        }
        if (classLoader != classLoader2) {
            return false;
        }
        return true;
    }

    public static AccessClassLoader get(Class cls) {
        ClassLoader parentClassLoader = getParentClassLoader(cls);
        ClassLoader classLoader = selfContextParentClassLoader;
        if (classLoader.equals(parentClassLoader)) {
            if (selfContextAccessClassLoader == null) {
                synchronized (accessClassLoaders) {
                    if (selfContextAccessClassLoader == null) {
                        selfContextAccessClassLoader = new AccessClassLoader(classLoader);
                    }
                }
            }
            return selfContextAccessClassLoader;
        }
        WeakHashMap<ClassLoader, WeakReference<AccessClassLoader>> weakHashMap = accessClassLoaders;
        synchronized (weakHashMap) {
            WeakReference<AccessClassLoader> weakReference = weakHashMap.get(parentClassLoader);
            if (weakReference != null) {
                AccessClassLoader accessClassLoader = weakReference.get();
                if (accessClassLoader != null) {
                    return accessClassLoader;
                }
                weakHashMap.remove(parentClassLoader);
            }
            AccessClassLoader accessClassLoader2 = new AccessClassLoader(parentClassLoader);
            weakHashMap.put(parentClassLoader, new WeakReference<>(accessClassLoader2));
            return accessClassLoader2;
        }
    }

    private static Method getDefineClassMethod() throws Exception {
        if (defineClassMethod == null) {
            synchronized (accessClassLoaders) {
                Class cls = Integer.TYPE;
                defineClassMethod = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls, cls, ProtectionDomain.class);
                try {
                    defineClassMethod.setAccessible(true);
                } catch (Exception unused) {
                }
            }
        }
        return defineClassMethod;
    }

    private static ClassLoader getParentClassLoader(Class cls) {
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemClassLoader();
        }
        return classLoader;
    }

    public static void remove(ClassLoader classLoader) {
        if (selfContextParentClassLoader.equals(classLoader)) {
            selfContextAccessClassLoader = null;
            return;
        }
        WeakHashMap<ClassLoader, WeakReference<AccessClassLoader>> weakHashMap = accessClassLoaders;
        synchronized (weakHashMap) {
            weakHashMap.remove(classLoader);
        }
    }

    public Class<?> defineClass(String str, byte[] bArr) throws ClassFormatError {
        try {
            return (Class) getDefineClassMethod().invoke(getParent(), str, bArr, 0, Integer.valueOf(bArr.length), getClass().getProtectionDomain());
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length, getClass().getProtectionDomain());
        }
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z10) throws ClassNotFoundException {
        if (str.equals(FieldAccess.class.getName())) {
            return FieldAccess.class;
        }
        if (str.equals(MethodAccess.class.getName())) {
            return MethodAccess.class;
        }
        if (str.equals(ConstructorAccess.class.getName())) {
            return ConstructorAccess.class;
        }
        if (str.equals(PublicConstructorAccess.class.getName())) {
            return PublicConstructorAccess.class;
        }
        return super.loadClass(str, z10);
    }
}
