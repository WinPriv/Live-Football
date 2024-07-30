package zc;

import a3.k;
import java.util.Arrays;

/* compiled from: Intrinsics.java */
/* loaded from: classes2.dex */
public final class d {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        e(nullPointerException);
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        e(nullPointerException);
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = d.class.getName();
            int i10 = 0;
            while (!stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            while (stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            StringBuilder o = k.o("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            o.append(str);
            NullPointerException nullPointerException = new NullPointerException(o.toString());
            e(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void e(RuntimeException runtimeException) {
        String name = d.class.getName();
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (name.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
    }
}
