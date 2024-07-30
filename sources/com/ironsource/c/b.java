package com.ironsource.c;

import com.ironsource.sdk.utils.SDKUtils;
import zc.d;

/* loaded from: classes2.dex */
public final class b {
    public static String a() {
        String sDKVersion = SDKUtils.getSDKVersion();
        d.c(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }

    public static String b() {
        String str = com.ironsource.sdk.e.a.a.f26451a;
        d.c(str, "OMID_LIB_VERSION");
        return str;
    }

    public static String c() {
        return "7";
    }
}
