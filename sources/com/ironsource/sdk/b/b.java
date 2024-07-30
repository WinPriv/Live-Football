package com.ironsource.sdk.b;

import a3.k;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.sdk.b.d;
import org.json.JSONException;
import org.json.JSONObject;
import s.f;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public a f26027a;

    /* renamed from: c, reason: collision with root package name */
    public WebView f26029c;

    /* renamed from: d, reason: collision with root package name */
    public String f26030d;

    /* renamed from: e, reason: collision with root package name */
    public String f26031e = "b";
    public final String[] f = {"handleGetViewVisibility"};

    /* renamed from: b, reason: collision with root package name */
    public d f26028b = new d();

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("visibilityParams", this.f26028b.a());
            jSONObject.put("configs", jSONObject2);
            jSONObject.put("adViewId", this.f26030d);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final void b(String str) {
        JSONObject a10 = this.f26028b.a();
        a10.put("adViewId", this.f26030d);
        a(str, a10);
    }

    public boolean c(String str) {
        for (String str2 : this.f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f26028b.a());
        } catch (Exception e10) {
            Log.e(this.f26031e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            e10.printStackTrace();
        }
        return jSONObject2;
    }

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f26030d);
            a(str, jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final void a(String str, int i10, boolean z10) {
        d dVar = this.f26028b;
        boolean containsKey = dVar.f26033a.containsKey(str);
        d.a aVar = dVar.f26033a;
        if (containsKey) {
            aVar.put(str, Boolean.valueOf(i10 == 0));
        }
        aVar.put("isShown", Boolean.valueOf(z10));
        aVar.put("isViewVisible", Boolean.valueOf((aVar.get("isWindowVisible").booleanValue() || aVar.get("isVisible").booleanValue()) && aVar.get("isShown").booleanValue()));
        if (!str.equalsIgnoreCase("isVisible") || this.f26027a == null || this.f26028b == null) {
            return;
        }
        a("containerIsVisible", a());
    }

    public final void a(String str, String str2) {
        a aVar = this.f26027a;
        if (aVar != null) {
            aVar.a(str, str2, this.f26030d);
        }
    }

    public final void a(String str, String str2, String str3) {
        if (this.f26029c == null) {
            String b10 = f.b("No external adUnit attached to ISNAdView while trying to send message: ", str);
            Log.e(this.f26031e, b10);
            this.f26027a.a(str3, b10, this.f26030d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException unused) {
            str = k.l("\"", str, "\"");
        }
        String format = String.format("window.ssa.onMessageReceived(%1$s)", str);
        com.ironsource.environment.e.a.f24660a.a(new vb.a(this, k.l("javascript:try{", format, "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}"), format));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f26030d);
        a(str2, jSONObject);
    }

    public final void a(String str, JSONObject jSONObject) {
        a aVar = this.f26027a;
        if (aVar != null) {
            aVar.a(str, jSONObject);
        }
    }
}
