package com.anythink.expressad.splash.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.ak;
import com.anythink.core.common.k.c;
import com.anythink.core.common.k.d;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public String f10885d;

    /* renamed from: e, reason: collision with root package name */
    public String f10886e;

    /* renamed from: g, reason: collision with root package name */
    public String f10887g;

    /* renamed from: h, reason: collision with root package name */
    public String f10888h;

    /* renamed from: i, reason: collision with root package name */
    public String f10889i;

    /* renamed from: j, reason: collision with root package name */
    public String f10890j;

    /* renamed from: k, reason: collision with root package name */
    public String f10891k;

    /* renamed from: l, reason: collision with root package name */
    public String f10892l;

    /* renamed from: m, reason: collision with root package name */
    public String f10893m;

    /* renamed from: n, reason: collision with root package name */
    public String f10894n;
    public String o;

    /* renamed from: p, reason: collision with root package name */
    public String f10895p;

    /* renamed from: c, reason: collision with root package name */
    public String f10884c = "android";

    /* renamed from: a, reason: collision with root package name */
    public String f10882a = k.b();

    /* renamed from: b, reason: collision with root package name */
    public String f10883b = k.c();
    public String f = d.f();

    public a(Context context) {
        String str;
        this.f10886e = d.d(context);
        int a10 = k.a();
        this.f10888h = String.valueOf(a10);
        this.f10889i = k.a(context, a10);
        this.f10890j = d.i();
        this.f10891k = com.anythink.expressad.foundation.b.a.b().f();
        this.f10892l = com.anythink.expressad.foundation.b.a.b().e();
        this.f10893m = String.valueOf(t.f(context));
        this.f10894n = String.valueOf(t.e(context));
        this.f10895p = String.valueOf(t.c(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.o = "landscape";
        } else {
            this.o = "portrait";
        }
        IExHandler b10 = n.a().b();
        if (b10 == null) {
            str = "";
        } else {
            str = b10.fillCDataParam("at_device1|||at_device2|||at_device3");
            str.replace("at_device1", "").replace("at_device2", "").replace("at_device3", "");
        }
        if (TextUtils.isEmpty(str)) {
            this.f10885d = "";
            this.f10887g = "";
        } else {
            String[] split = str.split("\\|\\|\\|");
            try {
                this.f10885d = split[0];
            } catch (Throwable unused) {
            }
            try {
                this.f10887g = split[2];
            } catch (Throwable unused2) {
            }
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f10882a);
            jSONObject.put("system_version", this.f10883b);
            jSONObject.put("network_type", this.f10888h);
            jSONObject.put("network_type_str", this.f10889i);
            jSONObject.put("device_ua", this.f10890j);
            ak L = n.a().L();
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
            jSONObject.put("plantform", this.f10884c);
            jSONObject.put(c.b("ZGV2aWNlX2ltZWk="), this.f10885d);
            jSONObject.put("android_id", this.f10886e);
            jSONObject.put("google_ad_id", this.f);
            jSONObject.put("oaid", this.f10887g);
            jSONObject.put("appkey", this.f10891k);
            jSONObject.put("appId", this.f10892l);
            jSONObject.put("screen_width", this.f10893m);
            jSONObject.put("screen_height", this.f10894n);
            jSONObject.put("orientation", this.o);
            jSONObject.put("scale", this.f10895p);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
