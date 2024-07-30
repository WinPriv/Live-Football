package com.esotericsoftware.kryo.util;

import com.anythink.expressad.exoplayer.k.p;
import com.esotericsoftware.minlog.Log;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.ironsource.adapters.facebook.a;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class Util {
    public static final boolean IS_ANDROID;
    private static final ConcurrentHashMap<String, Boolean> classAvailabilities;

    @Deprecated
    public static boolean isAndroid;

    static {
        boolean equals = "Dalvik".equals(System.getProperty("java.vm.name"));
        IS_ANDROID = equals;
        isAndroid = equals;
        classAvailabilities = new ConcurrentHashMap<>();
    }

    public static String className(Class cls) {
        if (cls.isArray()) {
            Class elementClass = getElementClass(cls);
            StringBuilder sb2 = new StringBuilder(16);
            int dimensionCount = getDimensionCount(cls);
            for (int i10 = 0; i10 < dimensionCount; i10++) {
                sb2.append(ContentRecord.XRINFOLIST_NULL);
            }
            return className(elementClass) + ((Object) sb2);
        }
        if (!cls.isPrimitive() && cls != Object.class && cls != Boolean.class && cls != Byte.class && cls != Character.class && cls != Short.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class) {
            return cls.getName();
        }
        return cls.getSimpleName();
    }

    public static int getDimensionCount(Class cls) {
        int i10 = 0;
        for (Class<?> componentType = cls.getComponentType(); componentType != null; componentType = componentType.getComponentType()) {
            i10++;
        }
        return i10;
    }

    public static Class getElementClass(Class cls) {
        while (cls.getComponentType() != null) {
            cls = cls.getComponentType();
        }
        return cls;
    }

    public static Class getPrimitiveClass(Class cls) {
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Void.class) {
            return Void.TYPE;
        }
        return cls;
    }

    public static Class getWrapperClass(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        return Void.class;
    }

    public static boolean isClassAvailable(String str) {
        Boolean bool = classAvailabilities.get(str);
        if (bool == null) {
            try {
                Class.forName(str);
                bool = Boolean.TRUE;
            } catch (Exception unused) {
                Log.debug("kryo", "Class not available: " + str);
                bool = Boolean.FALSE;
            }
            classAvailabilities.put(str, bool);
        }
        return bool.booleanValue();
    }

    public static boolean isWrapperClass(Class cls) {
        if (cls != Integer.class && cls != Float.class && cls != Boolean.class && cls != Long.class && cls != Byte.class && cls != Character.class && cls != Short.class && cls != Double.class) {
            return false;
        }
        return true;
    }

    public static void log(String str, Object obj) {
        if (obj == null) {
            if (Log.TRACE) {
                Log.trace("kryo", str + ": null");
                return;
            }
            return;
        }
        Class<?> cls = obj.getClass();
        if (!cls.isPrimitive() && cls != Boolean.class && cls != Byte.class && cls != Character.class && cls != Short.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class) {
            StringBuilder l10 = a.l(str, ": ");
            l10.append(string(obj));
            Log.debug("kryo", l10.toString());
        } else if (Log.TRACE) {
            StringBuilder l11 = a.l(str, ": ");
            l11.append(string(obj));
            Log.trace("kryo", l11.toString());
        }
    }

    public static String string(Object obj) {
        String simpleName;
        if (obj == null) {
            return "null";
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            return className(cls);
        }
        try {
            if (cls.getMethod("toString", new Class[0]).getDeclaringClass() == Object.class) {
                if (Log.TRACE) {
                    return className(cls);
                }
                return cls.getSimpleName();
            }
        } catch (Exception unused) {
        }
        try {
            return String.valueOf(obj);
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder();
            if (Log.TRACE) {
                simpleName = className(cls);
            } else {
                simpleName = cls.getSimpleName();
            }
            sb2.append(simpleName);
            sb2.append("(Exception ");
            sb2.append(th);
            sb2.append(" in toString)");
            return sb2.toString();
        }
    }

    public static int swapInt(int i10) {
        return ((i10 >> 24) & p.f9095b) | ((i10 & p.f9095b) << 24) | ((65280 & i10) << 8) | ((16711680 & i10) >> 8);
    }

    public static long swapLong(long j10) {
        return (((j10 >> 56) & 255) << 0) | (((j10 >> 0) & 255) << 56) | (((j10 >> 8) & 255) << 48) | (((j10 >> 16) & 255) << 40) | (((j10 >> 24) & 255) << 32) | (((j10 >> 32) & 255) << 24) | (((j10 >> 40) & 255) << 16) | (((j10 >> 48) & 255) << 8);
    }
}
