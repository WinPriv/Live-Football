package com.iab.omid.library.vungle.d;

import android.os.Build;
import com.huawei.openalliance.ad.constant.av;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static String c() {
        return "Android";
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, av.f22030e, a());
        b.a(jSONObject, "osVersion", b());
        b.a(jSONObject, "os", c());
        return jSONObject;
    }
}
