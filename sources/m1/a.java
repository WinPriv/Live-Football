package m1;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f32638a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f32639b;

    @SuppressLint({"NewApi"})
    public static boolean a() {
        boolean isEnabled;
        try {
            if (f32639b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f32639b == null) {
                f32638a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f32639b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f32639b.invoke(null, Long.valueOf(f32638a))).booleanValue();
        } catch (Exception e10) {
            if (e10 instanceof InvocationTargetException) {
                Throwable cause = e10.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
            return false;
        }
    }
}
