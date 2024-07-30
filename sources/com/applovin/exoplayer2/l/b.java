package com.applovin.exoplayer2.l;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static Method f16287a;

    public static IBinder a(Bundle bundle, String str) {
        if (ai.f16274a >= 18) {
            return bundle.getBinder(str);
        }
        return b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) {
        Method method = f16287a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f16287a = method2;
                method2.setAccessible(true);
                method = f16287a;
            } catch (NoSuchMethodException e10) {
                q.a("BundleUtil", "Failed to retrieve getIBinder method", e10);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            q.a("BundleUtil", "Failed to invoke getIBinder via reflection", e11);
            return null;
        }
    }
}
