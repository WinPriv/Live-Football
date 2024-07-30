package com.anythink.expressad.advanced.js;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.a.i;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.videocommon.b.a;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeAdvancedJsUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6912a = "onViewDisappeared";

    /* renamed from: b, reason: collision with root package name */
    public static final String f6913b = "onViewAppeared";

    /* renamed from: c, reason: collision with root package name */
    public static final String f6914c = "onSystemDestory";

    /* renamed from: d, reason: collision with root package name */
    public static final String f6915d = "setStyleList";

    /* renamed from: e, reason: collision with root package name */
    public static final String f6916e = "params";
    public static final String f = "showCloseButton";

    /* renamed from: g, reason: collision with root package name */
    public static final String f6917g = "hideCloseButton";

    /* renamed from: h, reason: collision with root package name */
    public static final String f6918h = "setVolume";

    /* renamed from: i, reason: collision with root package name */
    public static final String f6919i = "mute";

    /* renamed from: j, reason: collision with root package name */
    public static final String f6920j = "setVideoPlayMode";

    /* renamed from: k, reason: collision with root package name */
    public static final String f6921k = "autoPlay";

    /* renamed from: l, reason: collision with root package name */
    public static final String f6922l = "onNetstatChanged";

    /* renamed from: m, reason: collision with root package name */
    public static final String f6923m = "netstat";

    /* renamed from: n, reason: collision with root package name */
    public static final String f6924n = "sq";
    public static final String o = "thirdPartyCalled";

    /* renamed from: p, reason: collision with root package name */
    public static final String f6925p = "action";

    /* renamed from: q, reason: collision with root package name */
    public static final String f6926q = "params";

    /* renamed from: r, reason: collision with root package name */
    private static String f6927r = "NativeAdvancedJsUtils";

    public static void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f6985b);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            o.a(f6927r, e10.getMessage());
        }
    }

    public static void fireOnJSBridgeConnected(WebView webView) {
        o.d(f6927r, "fireOnJSBridgeConnected");
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
                o.a(f6927r, e10.getMessage());
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
                                        o.a(f6927r, "VideoBean not null");
                                        jSONObject5.put("type", 1);
                                        str2 = str5;
                                        r11 = str6;
                                        jSONObject5.put("videoDataLength", b10.d());
                                        String b11 = b10.b();
                                        if (TextUtils.isEmpty(b11)) {
                                            o.a(f6927r, "VideoPath null");
                                            jSONObject5.put("path", str4);
                                            jSONObject5.put("path4Web", str4);
                                            str = str4;
                                        } else {
                                            str = str4;
                                            o.a(f6927r, "VideoPath not null");
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
                                        o.a(f6927r, "VideoBean null");
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
                                            o.a(f6927r, "getFileInfo Mraid file ".concat(String.valueOf(optString)));
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
                            o.a(f6927r, e11.getMessage());
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
                    o.a(f6927r, e.getMessage());
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

    public static void sendEventToH5(WebView webView, String str, String str2) {
        j.a();
        j.a(webView, str, str2);
    }

    public static void sendThirdToH5(WebView webView, String str, String str2, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f6924n, 1);
            jSONObject.put("action", str);
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str2, obj);
                jSONObject.put("params", jSONObject2);
            }
            if (TextUtils.isEmpty(str2) && obj != null) {
                jSONObject.put("params", obj);
            }
            j.a();
            j.a(webView, o, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
