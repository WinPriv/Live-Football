package com.anythink.expressad.foundation.d;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p implements com.anythink.expressad.e.b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9678a = "amount_max";

    /* renamed from: b, reason: collision with root package name */
    public static final String f9679b = "callback_rule";

    /* renamed from: c, reason: collision with root package name */
    public static final String f9680c = "virtual_currency";

    /* renamed from: d, reason: collision with root package name */
    public static final String f9681d = "amount";

    /* renamed from: e, reason: collision with root package name */
    public static final String f9682e = "icon";
    public static final String f = "currency_id";

    /* renamed from: g, reason: collision with root package name */
    public static final String f9683g = "name";

    /* renamed from: h, reason: collision with root package name */
    private int f9684h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f9685i = 1;

    /* renamed from: j, reason: collision with root package name */
    private String f9686j = "";

    /* renamed from: k, reason: collision with root package name */
    private int f9687k = 1;

    /* renamed from: l, reason: collision with root package name */
    private String f9688l = "";

    /* renamed from: m, reason: collision with root package name */
    private int f9689m = 1;

    /* renamed from: n, reason: collision with root package name */
    private String f9690n = "Virtual Item";

    private void c(int i10) {
        this.f9687k = i10;
    }

    private int d() {
        return this.f9684h;
    }

    private int e() {
        return this.f9685i;
    }

    private String f() {
        return this.f9686j;
    }

    private String g() {
        return this.f9688l;
    }

    private int h() {
        return this.f9689m;
    }

    public final int a() {
        return this.f9687k;
    }

    public final String b() {
        return this.f9690n;
    }

    private void a(int i10) {
        this.f9684h = i10;
    }

    private void b(int i10) {
        this.f9685i = i10;
    }

    private void c(String str) {
        this.f9688l = str;
    }

    private void d(int i10) {
        this.f9689m = i10;
    }

    public static p a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            p pVar = new p();
            pVar.f9684h = jSONObject.optInt("amount_max", 0);
            pVar.f9685i = jSONObject.optInt("callback_rule", 1);
            pVar.f9686j = jSONObject.optString("virtual_currency", "");
            pVar.f9688l = jSONObject.optString("icon", "");
            pVar.f9689m = jSONObject.optInt("currency_id", 1);
            if (jSONObject.has("amount")) {
                pVar.f9687k = jSONObject.optInt("amount", 1);
            }
            if (jSONObject.has("name")) {
                pVar.f9690n = jSONObject.optString("name", "Virtual Item");
            }
            return pVar;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private void b(String str) {
        this.f9686j = str;
    }

    private void d(String str) {
        this.f9690n = str;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("amount_max", this.f9684h);
            jSONObject.put("callback_rule", this.f9685i);
            jSONObject.put("virtual_currency", this.f9686j);
            jSONObject.put("amount", this.f9687k);
            jSONObject.put("icon", this.f9688l);
            jSONObject.put("currency_id", this.f9689m);
            jSONObject.put("name", this.f9690n);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    private static p a(JSONObject jSONObject) {
        p pVar = new p();
        pVar.f9684h = jSONObject.optInt("amount_max", 0);
        pVar.f9685i = jSONObject.optInt("callback_rule", 1);
        pVar.f9686j = jSONObject.optString("virtual_currency", "");
        pVar.f9688l = jSONObject.optString("icon", "");
        pVar.f9689m = jSONObject.optInt("currency_id", 1);
        if (jSONObject.has("amount")) {
            pVar.f9687k = jSONObject.optInt("amount", 1);
        }
        if (jSONObject.has("name")) {
            pVar.f9690n = jSONObject.optString("name", "Virtual Item");
        }
        return pVar;
    }
}
