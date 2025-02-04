package com.anythink.expressad.atsignalcommon.bridge;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CommonJSBridgeImpUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6984a = "CommonJSBridgeImpUtils";

    /* renamed from: b, reason: collision with root package name */
    public static int f6985b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f6986c = 1;

    public static /* synthetic */ void a(String str, c cVar) {
        if (f.f9825n != null && !TextUtils.isEmpty(cVar.aZ())) {
            f.a(str, cVar, f.f9817e);
        }
    }

    private static void b(String str, c cVar) {
        if (f.f9825n != null && !TextUtils.isEmpty(cVar.aZ())) {
            f.a(str, cVar, f.f9817e);
        }
    }

    public static String buildClickJsonObject(float f, float f10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(a.f9775cc, t.a(n.a().g(), f));
            jSONObject2.put(a.f9776cd, t.a(n.a().g(), f10));
            jSONObject2.put(a.cf, 0);
            jSONObject2.put(a.cg, n.a().g().getResources().getConfiguration().orientation);
            jSONObject2.put(a.ch, t.c(n.a().g()));
            jSONObject.put(a.ce, jSONObject2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f6986c);
            jSONObject.put(CrashHianalyticsData.MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            o.a(f6984a, e10.getMessage());
        }
    }

    public static void callbackSuccess(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f6985b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            callbackExcep(obj, e10.getMessage());
            o.a(f6984a, e10.getMessage());
        }
    }

    public static String codeToJsonString(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            o.d(f6984a, "code to string is error");
            return "";
        }
    }

    public static void increaseOfferFrequence(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                callbackExcep(obj, "data is empty");
                return;
            }
            c b10 = c.b(optJSONObject);
            if (b10 == null) {
                callbackExcep(obj, "data camapign is empty");
            } else {
                updateFrequence(b10);
                callbackSuccess(obj, "");
            }
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
        }
    }

    public static void updateFrequence(final c cVar) {
        new Thread(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    CommonJSBridgeImpUtils.a(c.this.K(), c.this);
                } catch (Throwable th) {
                    o.b(CommonJSBridgeImpUtils.f6984a, th.getMessage(), th);
                }
            }
        }).start();
    }
}
