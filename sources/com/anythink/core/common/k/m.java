package com.anythink.core.common.k;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m {
    public static final String A = "it_src";

    /* renamed from: a, reason: collision with root package name */
    public static final String f6196a = "platform";

    /* renamed from: b, reason: collision with root package name */
    public static final String f6197b = "os_vn";

    /* renamed from: c, reason: collision with root package name */
    public static final String f6198c = "os_vc";

    /* renamed from: d, reason: collision with root package name */
    public static final String f6199d = "package_name";

    /* renamed from: e, reason: collision with root package name */
    public static final String f6200e = "app_vn";
    public static final String f = "app_vc";

    /* renamed from: g, reason: collision with root package name */
    public static final String f6201g = "brand";

    /* renamed from: h, reason: collision with root package name */
    public static final String f6202h = "model";

    /* renamed from: i, reason: collision with root package name */
    public static final String f6203i = "screen";

    /* renamed from: j, reason: collision with root package name */
    public static final String f6204j = "network_type";

    /* renamed from: k, reason: collision with root package name */
    public static final String f6205k = "mnc";

    /* renamed from: l, reason: collision with root package name */
    public static final String f6206l = "mcc";

    /* renamed from: m, reason: collision with root package name */
    public static final String f6207m = "language";

    /* renamed from: n, reason: collision with root package name */
    public static final String f6208n = "timezone";
    public static final String o = "sdk_ver";

    /* renamed from: p, reason: collision with root package name */
    public static final String f6209p = "gp_ver";

    /* renamed from: q, reason: collision with root package name */
    public static final String f6210q = "nw_ver";

    /* renamed from: r, reason: collision with root package name */
    public static final String f6211r = "ua";

    /* renamed from: s, reason: collision with root package name */
    public static final String f6212s = "orient";

    /* renamed from: t, reason: collision with root package name */
    public static final String f6213t = "system";

    /* renamed from: u, reason: collision with root package name */
    public static final String f6214u = "android_id";

    /* renamed from: v, reason: collision with root package name */
    public static final String f6215v = "gaid";

    /* renamed from: w, reason: collision with root package name */
    public static final String f6216w = "channel";

    /* renamed from: x, reason: collision with root package name */
    public static final String f6217x = "sub_channel";
    public static final String y = "upid";

    /* renamed from: z, reason: collision with root package name */
    public static final String f6218z = "ps_id";

    public static JSONObject a() {
        JSONObject b10 = b();
        JSONObject c10 = c();
        try {
            b10.put("app_id", com.anythink.core.common.b.n.a().p());
            Iterator<String> keys = c10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                b10.put(next, c10.opt(next));
            }
        } catch (JSONException unused) {
        }
        return b10;
    }

    private static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        Context g6 = com.anythink.core.common.b.n.a().g();
        try {
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", d.e());
            jSONObject.put("os_vc", d.d());
            jSONObject.put("package_name", d.k(g6));
            jSONObject.put("app_vn", d.i(g6));
            jSONObject.put("app_vc", d.h(g6));
            jSONObject.put("brand", d.b());
            jSONObject.put("model", d.a());
            jSONObject.put("screen", d.j(g6));
            jSONObject.put("network_type", String.valueOf(d.m(g6)));
            jSONObject.put("mnc", d.c(g6));
            jSONObject.put("mcc", d.b(g6));
            jSONObject.put("language", d.f(g6));
            jSONObject.put("timezone", d.c());
            jSONObject.put("sdk_ver", g.a());
            jSONObject.put("gp_ver", d.n(g6));
            jSONObject.put("ua", d.i());
            jSONObject.put("orient", d.g(g6));
            jSONObject.put("system", 1);
            if (!TextUtils.isEmpty(com.anythink.core.common.b.n.a().n())) {
                jSONObject.put("channel", com.anythink.core.common.b.n.a().n());
            }
            if (!TextUtils.isEmpty(com.anythink.core.common.b.n.a().o())) {
                jSONObject.put("sub_channel", com.anythink.core.common.b.n.a().o());
            }
            jSONObject.put("upid", com.anythink.core.common.b.n.a().x());
            jSONObject.put("ps_id", com.anythink.core.common.b.n.a().r());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static JSONObject c() {
        String F;
        String str;
        Context g6 = com.anythink.core.common.b.n.a().g();
        JSONObject jSONObject = new JSONObject();
        com.anythink.core.c.a h10 = a3.l.h(com.anythink.core.c.b.a(g6));
        String str2 = "";
        if (h10 == null) {
            F = "";
        } else {
            try {
                F = h10.F();
            } catch (Exception unused) {
            }
        }
        boolean z10 = true;
        if (!TextUtils.isEmpty(F)) {
            try {
                JSONObject jSONObject2 = new JSONObject(F);
                if (!jSONObject2.isNull("a")) {
                    if (jSONObject2.optInt("a") != 1) {
                        z10 = false;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        if (!z10) {
            str = "";
        } else {
            str = d.d(g6);
        }
        jSONObject.put("android_id", str);
        jSONObject.put("gaid", d.f());
        IExHandler b10 = com.anythink.core.common.b.n.a().b();
        if (b10 != null) {
            b10.fillRequestData(jSONObject, h10);
            jSONObject.put("is_cn_sdk", "1");
        } else {
            jSONObject.put("is_cn_sdk", "0");
        }
        String l10 = d.l(g6);
        if (!TextUtils.isEmpty(l10)) {
            str2 = l10;
        }
        jSONObject.put("it_src", str2);
        return jSONObject;
    }
}
