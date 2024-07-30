package com.anythink.expressad.foundation.h;

import android.content.Context;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.e.ak;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private static final String y = "portrait";

    /* renamed from: z, reason: collision with root package name */
    private static final String f10097z = "landscape";

    /* renamed from: d, reason: collision with root package name */
    public String f10101d;

    /* renamed from: e, reason: collision with root package name */
    public String f10102e;

    /* renamed from: g, reason: collision with root package name */
    public String f10103g;

    /* renamed from: h, reason: collision with root package name */
    public String f10104h;

    /* renamed from: i, reason: collision with root package name */
    public String f10105i;

    /* renamed from: j, reason: collision with root package name */
    public String f10106j;

    /* renamed from: k, reason: collision with root package name */
    public String f10107k;

    /* renamed from: l, reason: collision with root package name */
    public String f10108l;

    /* renamed from: m, reason: collision with root package name */
    public String f10109m;

    /* renamed from: n, reason: collision with root package name */
    public String f10110n;
    public String o;

    /* renamed from: p, reason: collision with root package name */
    public String f10111p;

    /* renamed from: q, reason: collision with root package name */
    public String f10112q;

    /* renamed from: r, reason: collision with root package name */
    public String f10113r;

    /* renamed from: s, reason: collision with root package name */
    public String f10114s;

    /* renamed from: t, reason: collision with root package name */
    public String f10115t;

    /* renamed from: u, reason: collision with root package name */
    public String f10116u;

    /* renamed from: v, reason: collision with root package name */
    public int f10117v;

    /* renamed from: w, reason: collision with root package name */
    public String f10118w;

    /* renamed from: x, reason: collision with root package name */
    public JSONObject f10119x;

    /* renamed from: c, reason: collision with root package name */
    public String f10100c = "android";

    /* renamed from: a, reason: collision with root package name */
    public String f10098a = k.b();

    /* renamed from: b, reason: collision with root package name */
    public String f10099b = k.c();
    public String f = com.anythink.core.common.k.d.f();

    public c(Context context) {
        String str;
        String str2;
        String str3;
        this.f10101d = com.anythink.core.common.k.d.d(context);
        int a10 = k.a();
        this.f10103g = String.valueOf(a10);
        this.f10104h = k.a(context, a10);
        this.f10105i = com.anythink.core.common.k.d.i();
        this.f10106j = com.anythink.expressad.foundation.b.a.b().f();
        this.f10107k = com.anythink.expressad.foundation.b.a.b().e();
        this.f10108l = String.valueOf(t.f(context));
        this.f10109m = String.valueOf(t.e(context));
        this.f10113r = String.valueOf(t.c(context));
        this.f10114s = com.anythink.expressad.foundation.b.a.b().i().toString();
        this.f10116u = com.anythink.core.common.k.d.b();
        this.f10117v = com.anythink.core.common.p.a().c();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f10110n = f10097z;
        } else {
            this.f10110n = y;
        }
        IExHandler b10 = com.anythink.core.common.b.n.a().b();
        if (b10 != null) {
            str = b10.fillCDataParam("at_device1|||at_device12|||at_device3");
        } else {
            str = "|||";
        }
        String[] split = str.split("\\|\\|\\|");
        if (split != null) {
            if (split.length <= 0) {
                str2 = "";
            } else {
                str2 = split[0];
            }
            this.f10102e = str2;
            if (split.length <= 1) {
                str3 = "";
            } else {
                str3 = split[1];
            }
            this.f10118w = str3;
            this.f10112q = split.length > 2 ? split[2] : "";
        }
        this.o = com.anythink.expressad.foundation.g.a.co;
        this.f10111p = com.anythink.expressad.foundation.g.a.cp;
        this.f10115t = k.e();
        this.f10119x = b();
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(k.i());
            jSONObject.put("cid", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(k.f());
            jSONObject.put("dmt", sb3.toString());
            jSONObject.put("dmf", k.g());
            jSONObject.put(com.anythink.expressad.d.a.b.dx, k.h());
            jSONObject.put(com.anythink.core.common.k.c.b("aW1laQ=="), this.f10102e);
            jSONObject.put(com.anythink.core.common.k.c.b("bWFj"), this.f10118w);
            jSONObject.put("oaid", this.f10112q);
            jSONObject.put("android_id", this.f10101d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f10098a);
            jSONObject.put("system_version", this.f10099b);
            jSONObject.put("network_type", this.f10103g);
            jSONObject.put("network_type_str", this.f10104h);
            jSONObject.put("device_ua", this.f10105i);
            ak L = com.anythink.core.common.b.n.a().L();
            if (L != null) {
                jSONObject.put("has_wx", L.a());
                jSONObject.put("integrated_wx", L.b());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(L.c());
                jSONObject.put("opensdk_ver", sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(L.d());
                jSONObject.put("wx_api_ver", sb3.toString());
            }
            jSONObject.put("brand", this.f10116u);
            jSONObject.put("plantform", this.f10100c);
            jSONObject.put(com.anythink.core.common.k.c.b("ZGV2aWNlX2ltZWk="), this.f10102e);
            jSONObject.put("android_id", this.f10101d);
            jSONObject.put("google_ad_id", this.f);
            jSONObject.put("oaid", this.f10112q);
            jSONObject.put("appkey", this.f10106j);
            jSONObject.put("appId", this.f10107k);
            jSONObject.put("screen_width", this.f10108l);
            jSONObject.put("screen_height", this.f10109m);
            jSONObject.put("orientation", this.f10110n);
            jSONObject.put("scale", this.f10113r);
            jSONObject.put("b", this.o);
            jSONObject.put("c", this.f10111p);
            jSONObject.put("web_env", this.f10114s);
            jSONObject.put("f", this.f10115t);
            jSONObject.put("misk_spt", this.f10117v);
            jSONObject.put("dvi", j.a(this.f10119x.toString()));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
