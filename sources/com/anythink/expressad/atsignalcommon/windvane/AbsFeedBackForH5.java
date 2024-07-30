package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.foundation.h.t;
import com.huawei.hms.ads.jsb.constant.Constant;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AbsFeedBackForH5 extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7027a = "onFeedbackAlertStatusNotify";

    /* renamed from: b, reason: collision with root package name */
    public static final String f7028b = "status";

    /* renamed from: c, reason: collision with root package name */
    public static final int f7029c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7030d = 2;

    /* renamed from: i, reason: collision with root package name */
    private static int f7031i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static int f7032j = 1;

    /* renamed from: h, reason: collision with root package name */
    private String f7033h = "AbsFeedBackForH5";

    public void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f7032j);
            jSONObject.put(CrashHianalyticsData.MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.a(this.f7033h, e10.getMessage());
        }
    }

    public void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f7031i);
            jSONObject.put(CrashHianalyticsData.MESSAGE, "");
            jSONObject.put("data", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            callbackExcep(obj, e10.getMessage());
            com.anythink.expressad.foundation.h.o.a(this.f7033h, e10.getMessage());
        }
    }

    public void callbackSuccessWithData(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f7031i);
            jSONObject2.put(CrashHianalyticsData.MESSAGE, "");
            jSONObject2.put("data", jSONObject);
            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e10) {
            callbackExcep(obj, e10.getMessage());
            com.anythink.expressad.foundation.h.o.a(this.f7033h, e10.getMessage());
        }
    }

    public void feedbackLayoutOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt(ContentRecord.WIDTH, -1);
                int optInt2 = jSONObject.optInt(ContentRecord.HEIGHT, -1);
                int optInt3 = jSONObject.optInt("radius", 20);
                int optInt4 = jSONObject.optInt("left", -1);
                int optInt5 = jSONObject.optInt(Constant.MAP_KEY_TOP, -1);
                double optDouble = jSONObject.optDouble("opacity", 1.0d);
                String optString = jSONObject.optString("fontColor", "");
                String optString2 = jSONObject.optString("bgColor", "");
                com.anythink.expressad.foundation.f.a.a a10 = com.anythink.expressad.foundation.f.b.a().a(jSONObject.optString("key", ""));
                Context g6 = com.anythink.core.common.b.n.a().g();
                a10.a(t.b(g6, optInt4), t.b(g6, optInt5), t.b(g6, optInt), t.b(g6, optInt2), t.b(g6, optInt3), (float) optDouble, optString, optString2);
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackOperate(Object obj, String str) {
        int i10;
        try {
            if (!TextUtils.isEmpty(str)) {
                a aVar = (a) obj;
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("view_visible", 1);
                String optString = jSONObject.optString("key", "");
                com.anythink.expressad.foundation.f.b a10 = com.anythink.expressad.foundation.f.b.a();
                if (optInt == 1) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                WindVaneWebView windVaneWebView = aVar.f7045a;
                com.anythink.expressad.foundation.f.a.a a11 = a10.a(optString);
                if (a11.c() != null) {
                    a11.a(i10);
                    if (i10 == 0) {
                        a10.a(optString, com.anythink.core.common.b.n.a().g(), windVaneWebView, null, null);
                    }
                }
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackPopupOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("view_visible", 1);
                com.anythink.expressad.foundation.f.a.a a10 = com.anythink.expressad.foundation.f.b.a().a(jSONObject.optString("key", ""));
                if (optInt == 1) {
                    a10.b();
                } else {
                    a10.a();
                }
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void getCacheKey(Object obj, String str) {
        try {
            com.anythink.expressad.atsignalcommon.c.a.a().a(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void startShake(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optInt("deviceMotionUpdateInterval", 1);
                com.anythink.expressad.atsignalcommon.c.a.a().a(obj, ((a) obj).f7045a, jSONObject.optString("oldCache", ""), jSONObject.optString("cache", ""));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void stopShake(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                com.anythink.expressad.atsignalcommon.c.a.a().a(obj, ((a) obj).f7045a, new JSONObject(str).optString("cache", ""));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }
}
