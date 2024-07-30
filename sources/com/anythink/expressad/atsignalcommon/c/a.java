package com.anythink.expressad.atsignalcommon.c;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.o;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import e0.i;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static int f6988b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f6989c = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f6990a;

    /* renamed from: d, reason: collision with root package name */
    private String f6991d;

    /* renamed from: e, reason: collision with root package name */
    private String f6992e;
    private WindVaneWebView f;

    /* renamed from: com.anythink.expressad.atsignalcommon.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0092a {

        /* renamed from: a, reason: collision with root package name */
        static a f6993a = new a(0);

        private C0092a() {
        }
    }

    public /* synthetic */ a(byte b10) {
        this();
    }

    private void a(Object obj, WindVaneWebView windVaneWebView, String str, String str2, String str3) {
        if (i.f(str, str2, str3).equals(this.f6991d)) {
            a(obj, windVaneWebView);
        }
    }

    private void b(Object obj) {
        a(obj, new JSONObject());
    }

    private a() {
        this.f6990a = "ShakeCacheManager";
    }

    public static a a() {
        return C0092a.f6993a;
    }

    public final void a(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cache", this.f6992e);
            a(obj, jSONObject);
        } catch (JSONException e10) {
            a(obj, e10.getMessage(), new JSONObject());
        }
    }

    public final void a(Object obj, WindVaneWebView windVaneWebView, String str, String str2) {
        if ((!TextUtils.isEmpty(this.f6992e) && this.f6992e.equals(str)) || (TextUtils.isEmpty(this.f6992e) && TextUtils.isEmpty(str))) {
            this.f6992e = str2;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    this.f6991d = new JSONObject(str2).optString("sid");
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            this.f = windVaneWebView;
            a(obj, new JSONObject());
            return;
        }
        String str3 = this.f6992e;
        if (windVaneWebView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("currentCache", str3);
                a(obj, "cache had changed", jSONObject);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    public final void a(Object obj, WindVaneWebView windVaneWebView, String str) {
        if (!TextUtils.isEmpty(this.f6992e) && this.f6992e.equals(str)) {
            this.f6992e = "";
            this.f = null;
            a(obj, windVaneWebView);
            a(obj, new JSONObject());
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentCache", this.f6992e);
            a(obj, "cache is exception", jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static void a(Object obj, WindVaneWebView windVaneWebView) {
        if (windVaneWebView != null) {
            j.a().a(obj, "releaseShake", "");
        }
    }

    private void a(Object obj, WebView webView, String str, String str2) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("currentCache", str);
                a(obj, str2, jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    private void a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f6988b);
            jSONObject2.put(CrashHianalyticsData.MESSAGE, "");
            jSONObject2.put("data", jSONObject);
            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e10) {
            a(obj, e10.getMessage(), new JSONObject());
            o.a(this.f6990a, e10.getMessage());
        }
    }

    private void a(Object obj, String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f6989c);
            jSONObject2.put(CrashHianalyticsData.MESSAGE, str);
            jSONObject2.put("data", jSONObject);
            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e10) {
            o.a(this.f6990a, e10.getMessage());
        }
    }
}
