package com.anythink.expressad.splash.js;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.a.i;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.videocommon.b.a;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SplashJsUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11083a = "onSystemPause";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11084b = "onSystemResume";

    /* renamed from: c, reason: collision with root package name */
    public static final String f11085c = "onSystemDestory";

    /* renamed from: d, reason: collision with root package name */
    private static String f11086d = "SplashJsUtils";

    /* renamed from: e, reason: collision with root package name */
    private static int f11087e = 0;
    private static int f = 1;

    private static void b(String str, c cVar) {
        if (f.o != null && !TextUtils.isEmpty(cVar.aZ())) {
            f.a(str, cVar, f.f);
        }
    }

    public static void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f);
            jSONObject.put(CrashHianalyticsData.MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            o.a(f11086d, e10.getMessage());
        }
    }

    public static void callbackSuccess(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f11087e);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            callbackExcep(obj, e10.getMessage());
            o.a(f11086d, e10.getMessage());
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
            o.d(f11086d, "code to string is error");
            return "";
        }
    }

    public static void fireOnJSBridgeConnected(WebView webView) {
        o.d(f11086d, "fireOnJSBridgeConnected");
        j.a();
        j.b(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v2, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v1, types: [org.json.JSONObject, java.lang.Object] */
    public static void getFileInfo(Object obj, JSONObject jSONObject) {
        ?? r22;
        ?? r11;
        String str;
        String str2;
        JSONArray jSONArray;
        boolean z10;
        String a10;
        String str3;
        File file;
        String c10;
        String str4 = "";
        ?? jSONObject2 = new JSONObject();
        String str5 = CrashHianalyticsData.MESSAGE;
        String str6 = "code";
        int i10 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(CrashHianalyticsData.MESSAGE, "params is null");
                j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e10) {
                o.a(f11086d, e10.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(CrashHianalyticsData.MESSAGE, "");
            r11 = jSONObject.getJSONArray("resource");
            try {
                if (r11 != 0) {
                    try {
                        if (r11.length() > 0) {
                            ?? jSONArray2 = new JSONArray();
                            int length = r11.length();
                            int i11 = 0;
                            JSONArray jSONArray3 = r11;
                            while (i11 < length) {
                                JSONObject jSONObject3 = jSONArray3.getJSONObject(i11);
                                String optString = jSONObject3.optString("ref", str4);
                                int i12 = jSONObject3.getInt("type");
                                ?? jSONObject4 = new JSONObject();
                                if (i12 == i10 && !TextUtils.isEmpty(optString)) {
                                    JSONObject jSONObject5 = new JSONObject();
                                    a.a();
                                    i b10 = a.b(optString);
                                    if (b10 != null) {
                                        jSONArray = jSONArray3;
                                        o.a(f11086d, "VideoBean not null");
                                        jSONObject5.put("type", 1);
                                        str2 = str5;
                                        r11 = str6;
                                        jSONObject5.put("videoDataLength", b10.d());
                                        String b11 = b10.b();
                                        if (TextUtils.isEmpty(b11)) {
                                            o.a(f11086d, "VideoPath null");
                                            jSONObject5.put("path", str4);
                                            jSONObject5.put("path4Web", str4);
                                            str = str4;
                                        } else {
                                            str = str4;
                                            o.a(f11086d, "VideoPath not null");
                                            jSONObject5.put("path", b11);
                                            jSONObject5.put("path4Web", b11);
                                        }
                                        if (b10.c() == 100) {
                                            jSONObject5.put("downloaded", 1);
                                            z10 = false;
                                        } else {
                                            z10 = false;
                                            jSONObject5.put("downloaded", 0);
                                        }
                                        jSONObject4.put(optString, jSONObject5);
                                        jSONArray2.put(jSONObject4);
                                    } else {
                                        str = str4;
                                        str2 = str5;
                                        jSONArray = jSONArray3;
                                        z10 = false;
                                        r11 = str6;
                                        o.a(f11086d, "VideoBean null");
                                    }
                                } else {
                                    str = str4;
                                    str2 = str5;
                                    jSONArray = jSONArray3;
                                    z10 = false;
                                    r11 = str6;
                                    if (i12 == 2 && !TextUtils.isEmpty(optString)) {
                                        JSONObject jSONObject6 = new JSONObject();
                                        jSONObject6.put("type", 2);
                                        if (com.anythink.expressad.videocommon.b.i.a().c(optString) == null) {
                                            c10 = str;
                                        } else {
                                            c10 = com.anythink.expressad.videocommon.b.i.a().c(optString);
                                        }
                                        jSONObject6.put("path", c10);
                                        jSONObject4.put(optString, jSONObject6);
                                        jSONArray2.put(jSONObject4);
                                    } else if (i12 == 3 && !TextUtils.isEmpty(optString)) {
                                        try {
                                            file = new File(optString);
                                        } catch (Throwable th) {
                                            if (com.anythink.expressad.a.f6552a) {
                                                th.printStackTrace();
                                            }
                                        }
                                        if (file.exists() && file.isFile() && file.canRead()) {
                                            o.a(f11086d, "getFileInfo Mraid file ".concat(String.valueOf(optString)));
                                            str3 = "file:////".concat(String.valueOf(optString));
                                            JSONObject jSONObject7 = new JSONObject();
                                            jSONObject7.put("type", 3);
                                            jSONObject7.put("path", str3);
                                            jSONObject4.put(optString, jSONObject7);
                                            jSONArray2.put(jSONObject4);
                                        }
                                        str3 = str;
                                        JSONObject jSONObject72 = new JSONObject();
                                        jSONObject72.put("type", 3);
                                        jSONObject72.put("path", str3);
                                        jSONObject4.put(optString, jSONObject72);
                                        jSONArray2.put(jSONObject4);
                                    } else if (i12 == 4 && !TextUtils.isEmpty(optString)) {
                                        JSONObject jSONObject8 = new JSONObject();
                                        jSONObject8.put("type", 4);
                                        if (s.a(optString) == null) {
                                            a10 = str;
                                        } else {
                                            a10 = s.a(optString);
                                        }
                                        jSONObject8.put("path", a10);
                                        jSONObject4.put(optString, jSONObject8);
                                        jSONArray2.put(jSONObject4);
                                    }
                                }
                                i11++;
                                str6 = r11;
                                str5 = str2;
                                str4 = str;
                                i10 = 1;
                                jSONArray3 = jSONArray;
                            }
                            jSONObject2.put("resource", jSONArray2);
                            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = str6;
                        r22 = str5;
                        try {
                            jSONObject2.put(r11, 1);
                            jSONObject2.put(r22, th.getLocalizedMessage());
                            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                            return;
                        } catch (JSONException e11) {
                            o.a(f11086d, e11.getMessage());
                            return;
                        }
                    }
                }
                r11 = "code";
                r22 = 1;
                try {
                    try {
                        jSONObject2.put(r11, 1);
                    } catch (Throwable th3) {
                        th = th3;
                        jSONObject2.put(r11, 1);
                        jSONObject2.put(r22, th.getLocalizedMessage());
                        j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        return;
                    }
                } catch (JSONException e12) {
                    e = e12;
                }
                try {
                    jSONObject2.put(CrashHianalyticsData.MESSAGE, "resource is null");
                    j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                } catch (JSONException e13) {
                    e = e13;
                    o.a(f11086d, e.getMessage());
                }
            } catch (Throwable th4) {
                th = th4;
                r22 = str2;
            }
        } catch (Throwable th5) {
            th = th5;
            r22 = CrashHianalyticsData.MESSAGE;
            r11 = "code";
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

    public static void sendEventToH5(WebView webView, String str, String str2) {
        j.a();
        j.a(webView, str, str2);
    }

    public static void updateFrequence(final c cVar) {
        new Thread(new Runnable() { // from class: com.anythink.expressad.splash.js.SplashJsUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SplashJsUtils.a(c.this.K(), c.this);
                } catch (Throwable th) {
                    o.b(SplashJsUtils.f11086d, th.getMessage(), th);
                }
            }
        }).start();
    }

    public static /* synthetic */ void a(String str, c cVar) {
        if (f.o == null || TextUtils.isEmpty(cVar.aZ())) {
            return;
        }
        f.a(str, cVar, f.f);
    }
}
