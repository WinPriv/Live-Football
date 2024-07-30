package com.anythink.expressad.video.bt.a;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.o;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String f11208c = "HandlerH5MessageManager";

    /* renamed from: a, reason: collision with root package name */
    int f11209a;

    /* renamed from: b, reason: collision with root package name */
    int f11210b;

    /* renamed from: d, reason: collision with root package name */
    private String f11211d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static b f11212a = new b(0);

        private a() {
        }
    }

    public /* synthetic */ b(byte b10) {
        this();
    }

    public static b a() {
        return a.f11212a;
    }

    private b() {
        this.f11211d = "handlerNativeResult";
        this.f11209a = 0;
        this.f11210b = 1;
    }

    public final void a(Object obj, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(jSONObject.toString())) {
                a(this.f11210b, "params is null", obj);
                return;
            }
            String optString = jSONObject.optString("uniqueIdentifier");
            String optString2 = jSONObject.optString("name");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                    optJSONObject.optInt("type", 0);
                }
                a(this.f11209a, "receivedMessage", obj);
                if (optString.equalsIgnoreCase("reporter") || !optString.equalsIgnoreCase("MediaPlayer")) {
                    return;
                }
                com.anythink.expressad.video.bt.a.a.a().a(obj, optString2, optJSONArray);
                return;
            }
            a(this.f11210b, "module or method is null", obj);
        } catch (Exception e10) {
            o.a(f11208c, e10.getMessage());
            a(this.f11210b, e10.getMessage(), obj);
        } catch (Throwable th) {
            o.a(f11208c, th.getMessage());
            a(this.f11210b, th.getMessage(), obj);
        }
    }

    private static void a(int i10, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            jSONObject.put(CrashHianalyticsData.MESSAGE, str);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e10) {
            o.a(f11208c, e10.getMessage());
        } catch (Throwable th) {
            o.a(f11208c, th.getMessage());
        }
    }
}
