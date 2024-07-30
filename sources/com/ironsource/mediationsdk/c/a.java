package com.ironsource.mediationsdk.c;

import com.ironsource.mediationsdk.logger.IronLog;
import zc.d;

/* loaded from: classes2.dex */
public final class a {
    static {
        new a();
    }

    private a() {
    }

    public static final <T> T a(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static final boolean a(Object obj, String str) {
        d.d(str, "errorMessage");
        if (obj != null) {
            return true;
        }
        IronLog.API.error(str);
        return false;
    }
}
