package com.huawei.openalliance.ad.ppskit.utils;

import android.os.Build;
import javax.net.ssl.SSLContext;
import ka.n7;

/* loaded from: classes2.dex */
public final class s1 {
    public static SSLContext a() {
        String str;
        if (Build.VERSION.SDK_INT >= 29) {
            n7.b("SSLContextUtil", "use tls 1.3");
            str = "TLSv1.3";
        } else {
            n7.b("SSLContextUtil", "use tls 1.2");
            str = "TLSv1.2";
        }
        return SSLContext.getInstance(str);
    }
}
