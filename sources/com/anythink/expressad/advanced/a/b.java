package com.anythink.expressad.advanced.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.ak;
import com.anythink.core.common.k.d;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public String f6759d;

    /* renamed from: e, reason: collision with root package name */
    public String f6760e;

    /* renamed from: g, reason: collision with root package name */
    public String f6761g;

    /* renamed from: h, reason: collision with root package name */
    public String f6762h;

    /* renamed from: i, reason: collision with root package name */
    public String f6763i;

    /* renamed from: j, reason: collision with root package name */
    public String f6764j;

    /* renamed from: k, reason: collision with root package name */
    public String f6765k;

    /* renamed from: l, reason: collision with root package name */
    public String f6766l;

    /* renamed from: m, reason: collision with root package name */
    public String f6767m;

    /* renamed from: n, reason: collision with root package name */
    public String f6768n;
    public String o;

    /* renamed from: p, reason: collision with root package name */
    public String f6769p;

    /* renamed from: c, reason: collision with root package name */
    public String f6758c = "android";

    /* renamed from: a, reason: collision with root package name */
    public String f6756a = k.b();

    /* renamed from: b, reason: collision with root package name */
    public String f6757b = k.c();
    public String f = d.f();

    public b(Context context) {
        String str;
        this.f6760e = d.d(context);
        int a10 = k.a();
        this.f6762h = String.valueOf(a10);
        this.f6763i = k.a(context, a10);
        this.f6764j = d.i();
        this.f6765k = com.anythink.expressad.foundation.b.a.b().f();
        this.f6766l = com.anythink.expressad.foundation.b.a.b().e();
        this.f6767m = String.valueOf(t.f(context));
        this.f6768n = String.valueOf(t.e(context));
        this.f6769p = String.valueOf(t.c(context));
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
            this.f6759d = "";
            this.f6761g = "";
        } else {
            String[] split = str.split("\\|\\|\\|");
            try {
                this.f6759d = split[0];
            } catch (Throwable unused) {
            }
            try {
                this.f6761g = split[2];
            } catch (Throwable unused2) {
            }
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f6756a);
            jSONObject.put("system_version", this.f6757b);
            jSONObject.put("network_type", this.f6762h);
            jSONObject.put("network_type_str", this.f6763i);
            jSONObject.put("device_ua", this.f6764j);
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
            jSONObject.put("plantform", this.f6758c);
            jSONObject.put(com.anythink.core.common.k.c.b("ZGV2aWNlX2ltZWk="), this.f6759d);
            jSONObject.put("android_id", this.f6760e);
            jSONObject.put("google_ad_id", this.f);
            jSONObject.put("oaid", this.f6761g);
            jSONObject.put("appkey", this.f6765k);
            jSONObject.put("appId", this.f6766l);
            jSONObject.put("screen_width", this.f6767m);
            jSONObject.put("screen_height", this.f6768n);
            jSONObject.put("orientation", this.o);
            jSONObject.put("scale", this.f6769p);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
