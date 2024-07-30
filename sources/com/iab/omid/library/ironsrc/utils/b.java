package com.iab.omid.library.ironsrc.utils;

import android.os.Build;
import com.huawei.openalliance.ad.constant.av;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return "Android";
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, av.f22030e, a());
        c.a(jSONObject, "osVersion", c());
        c.a(jSONObject, "os", b());
        return jSONObject;
    }
}
