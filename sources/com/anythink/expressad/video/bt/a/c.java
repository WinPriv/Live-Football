package com.anythink.expressad.video.bt.a;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.core.common.a.i;
import com.anythink.core.common.b.n;
import com.anythink.core.common.c.g;
import com.anythink.core.common.k.u;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.bt.module.ATTempContainer;
import com.anythink.expressad.video.bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.bt.module.AnythinkBTLayout;
import com.anythink.expressad.video.bt.module.AnythinkBTNativeEC;
import com.anythink.expressad.video.bt.module.AnythinkBTVideoView;
import com.anythink.expressad.video.bt.module.AnythinkBTWebView;
import com.anythink.expressad.video.bt.module.BTBaseView;
import com.anythink.expressad.videocommon.e.d;
import com.huawei.hms.ads.jsb.constant.Constant;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.ReportDBAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11213a = -999;

    /* renamed from: b, reason: collision with root package name */
    private static final String f11214b = "OperateViews";

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> f11215c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static LinkedHashMap<String, String> f11216d = new LinkedHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static LinkedHashMap<String, com.anythink.expressad.foundation.d.c> f11217e = new LinkedHashMap<>();
    private static LinkedHashMap<String, d> f = new LinkedHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static LinkedHashMap<String, String> f11218g = new LinkedHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static LinkedHashMap<String, Integer> f11219h = new LinkedHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static LinkedHashMap<String, Activity> f11220i = new LinkedHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static volatile int f11221j = 10000;

    /* renamed from: k, reason: collision with root package name */
    private static int f11222k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static int f11223l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static String f11224m = "";

    /* renamed from: n, reason: collision with root package name */
    private static int f11225n;
    private static int o;

    /* renamed from: p, reason: collision with root package name */
    private static int f11226p;

    /* renamed from: q, reason: collision with root package name */
    private static int f11227q;

    /* renamed from: r, reason: collision with root package name */
    private static int f11228r;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static c f11242a = new c(0);

        private a() {
        }
    }

    public /* synthetic */ c(byte b10) {
        this();
    }

    public static void E(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public static void I(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public static void J(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            } else {
                c(obj, "android mediaPlayer not support setScaleType");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public static void P(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        boolean z10;
        String a10;
        String str4;
        File file;
        String c10;
        String str5 = CrashHianalyticsData.MESSAGE;
        String str6 = "code";
        JSONObject jSONObject2 = new JSONObject();
        int i10 = 1;
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(CrashHianalyticsData.MESSAGE, "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray == null || jSONArray.length() <= 0) {
                str = "code";
                try {
                    jSONObject2.put(str, 1);
                    str5 = CrashHianalyticsData.MESSAGE;
                    try {
                        try {
                            jSONObject2.put(str5, "resource is null");
                            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                            return;
                        } catch (JSONException e10) {
                            e = e10;
                            o.a(f11214b, e.getMessage());
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (JSONException e11) {
                    e = e11;
                    str5 = CrashHianalyticsData.MESSAGE;
                } catch (Throwable th2) {
                    th = th2;
                    str5 = CrashHianalyticsData.MESSAGE;
                }
            } else {
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i11 = 0;
                while (i11 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                    String optString = jSONObject3.optString("ref", "");
                    int i12 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    JSONArray jSONArray3 = jSONArray;
                    if (i12 == i10 && !TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        com.anythink.expressad.videocommon.b.a.a();
                        i b10 = com.anythink.expressad.videocommon.b.a.b(optString);
                        if (b10 != null) {
                            o.a(f11214b, "VideoBean not null");
                            jSONObject5.put("type", 1);
                            str2 = str5;
                            str3 = str6;
                            try {
                                jSONObject5.put("videoDataLength", b10.d());
                                String b11 = b10.b();
                                if (TextUtils.isEmpty(b11)) {
                                    o.a(f11214b, "VideoPath null");
                                    jSONObject5.put("path", "");
                                    jSONObject5.put("path4Web", "");
                                } else {
                                    o.a(f11214b, "VideoPath not null");
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
                            } catch (Throwable th3) {
                                th = th3;
                                str5 = str2;
                                str = str3;
                            }
                        } else {
                            str2 = str5;
                            str3 = str6;
                            z10 = false;
                            o.a(f11214b, "VideoBean null");
                        }
                        i11++;
                        jSONArray = jSONArray3;
                        str5 = str2;
                        str6 = str3;
                        i10 = 1;
                    } else {
                        str2 = str5;
                        str3 = str6;
                        z10 = false;
                        if (i12 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 2);
                            if (com.anythink.expressad.videocommon.b.i.a().c(optString) == null) {
                                c10 = "";
                            } else {
                                c10 = com.anythink.expressad.videocommon.b.i.a().c(optString);
                            }
                            jSONObject6.put("path", c10);
                            jSONObject4.put(optString, jSONObject6);
                            jSONArray2.put(jSONObject4);
                        } else if (i12 == 3 && !TextUtils.isEmpty(optString)) {
                            try {
                                file = new File(optString);
                            } catch (Throwable th4) {
                                if (com.anythink.expressad.a.f6552a) {
                                    th4.printStackTrace();
                                }
                            }
                            if (file.exists() && file.isFile() && file.canRead()) {
                                o.a(f11214b, "getFileInfo Mraid file ".concat(String.valueOf(optString)));
                                str4 = "file:////".concat(String.valueOf(optString));
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("type", 3);
                                jSONObject7.put("path", str4);
                                jSONObject4.put(optString, jSONObject7);
                                jSONArray2.put(jSONObject4);
                            }
                            str4 = "";
                            JSONObject jSONObject72 = new JSONObject();
                            jSONObject72.put("type", 3);
                            jSONObject72.put("path", str4);
                            jSONObject4.put(optString, jSONObject72);
                            jSONArray2.put(jSONObject4);
                        } else if (i12 == 4 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("type", 4);
                            if (s.a(optString) == null) {
                                a10 = "";
                            } else {
                                a10 = s.a(optString);
                            }
                            jSONObject8.put("path", a10);
                            jSONObject4.put(optString, jSONObject8);
                            jSONArray2.put(jSONObject4);
                        }
                        i11++;
                        jSONArray = jSONArray3;
                        str5 = str2;
                        str6 = str3;
                        i10 = 1;
                    }
                }
                str2 = str5;
                str3 = str6;
                jSONObject2.put("resource", jSONArray2);
                j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
        } catch (Throwable th5) {
            th = th5;
            str = str6;
        }
        try {
            jSONObject2.put(str, 1);
            jSONObject2.put(str5, th.getLocalizedMessage());
            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e12) {
            o.a(f11214b, e12.getMessage());
        }
    }

    public static c a() {
        return a.f11242a;
    }

    public static String b() {
        int i10 = f11221j + 1;
        f11221j = i10;
        return String.valueOf(i10);
    }

    public static void d(String str) {
        f11220i.remove(str);
    }

    public static int e(String str) {
        if (f11219h.containsKey(str)) {
            return f11219h.get(str).intValue();
        }
        return 2;
    }

    public static void f(String str) {
        if (f11218g.containsKey(str)) {
            f11218g.remove(str);
        }
        if (f.containsKey(str)) {
            f.remove(str);
        }
        if (f11217e.containsKey(str)) {
            f11217e.remove(str);
        }
        if (f11216d.containsKey(str)) {
            f11216d.remove(str);
        }
    }

    public static void g(String str) {
        if (f11219h.containsKey(str)) {
            f11219h.remove(str);
        }
    }

    private static String h(String str) {
        return f11216d.containsKey(str) ? f11216d.get(str) : "";
    }

    private static Activity i(String str) {
        if (f11220i.containsKey(str)) {
            return f11220i.get(str);
        }
        return null;
    }

    public final void A(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).play();
                    a(obj, optString2);
                    o.a(f11214b, "playerPlay success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    o.a(f11214b, "playerPlay failed instanceId is not player instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
            }
            c(obj, "instanceId not exit");
            o.a(f11214b, "playerPlay failed instanceId not exit instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("playerPlay failed: "), f11214b);
        }
    }

    public final void B(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).pause();
                    a(obj, optString2);
                    o.a(f11214b, "playerPause success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    o.a(f11214b, "playerPause failed instanceId is not player instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
            }
            c(obj, "instanceId not exit");
            o.a(f11214b, "playerPause failed instanceId not exit instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("playerPause failed: "), f11214b);
        }
    }

    public final void C(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).resume();
                    a(obj, optString2);
                    o.a(f11214b, "playerResume success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    o.a(f11214b, "playerResume failed instanceId is not player instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
            }
            c(obj, "instanceId not exit");
            o.a(f11214b, "playerResume failed instanceId not exit instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("playerResume failed: "), f11214b);
        }
    }

    public final void D(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).stop();
                    a(obj, optString2);
                    o.a(f11214b, "playerStop success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    o.a(f11214b, "playerStop failed instanceId is not player instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
            }
            c(obj, "instanceId not exit");
            o.a(f11214b, "playerStop failed instanceId not exit instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("playerStop failed: "), f11214b);
        }
    }

    public final void F(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    if (((AnythinkBTVideoView) view).playMute()) {
                        a(obj, optString2);
                        o.a(f11214b, "playerMute success");
                        return;
                    } else {
                        c(obj, "set mute failed");
                        o.a(f11214b, "playerMute failed set mute failed");
                        return;
                    }
                }
                c(obj, "instanceId is not player");
                o.a(f11214b, "playerMute failed: instanceId is not player");
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "playerMute failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("playerMute failed: "), f11214b);
        }
    }

    public final void G(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    if (((AnythinkBTVideoView) view).playUnMute()) {
                        a(obj, optString2);
                        a(obj, "onUnmute", optString2);
                        o.a(f11214b, "playerUnmute successed");
                        return;
                    } else {
                        a(obj, "set unmute failed");
                        o.a(f11214b, "playerUnmute failed: set unmute failed");
                        return;
                    }
                }
                c(obj, "instanceId is not player");
                o.a(f11214b, "playerUnmute failed: instanceId is not player");
                return;
            }
            c(obj, "instanceId not exit");
            o.a(f11214b, "playerUnmute failed: instanceId not exit");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("playerUnmute failed: "), f11214b);
        }
    }

    public final void H(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    int mute = ((AnythinkBTVideoView) view).getMute();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", f11222k);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", optString2);
                    jSONObject3.put("mute", mute);
                    jSONObject2.put("data", jSONObject3);
                    j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    o.a(f11214b, "playerGetMuteState successed mute = ".concat(String.valueOf(mute)));
                    return;
                }
                c(obj, "instanceId is not player");
                o.a(f11214b, "playerGetMuteState failed instanceId is not player");
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "playerGetMuteState failed instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("playerGetMuteState failed: "), f11214b);
        }
    }

    public final void K(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).preload();
                    a(obj, optString2);
                    return;
                } else {
                    c(obj, "view not exist");
                    return;
                }
            }
            c(obj, "instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("preloadSubPlayTemplateView failed: "), f11214b);
        }
    }

    public final void L(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.size() > 0) {
                AnythinkBTContainer anythinkBTContainer = null;
                for (View view : b10.values()) {
                    if (view instanceof AnythinkBTContainer) {
                        anythinkBTContainer = (AnythinkBTContainer) view;
                    } else if (view instanceof AnythinkBTWebView) {
                        ((AnythinkBTWebView) view).onDestory();
                    } else if (view instanceof AnythinkBTVideoView) {
                        String instanceId = ((AnythinkBTVideoView) view).getInstanceId();
                        com.anythink.expressad.video.bt.a.a.a();
                        com.anythink.expressad.video.bt.a.a.a(instanceId);
                        ((AnythinkBTVideoView) view).onDestory();
                    } else if (view instanceof ATTempContainer) {
                        ((ATTempContainer) view).onDestroy();
                    }
                }
                if (anythinkBTContainer != null) {
                    anythinkBTContainer.onAdClose();
                    f11215c.remove(b10);
                    b10.clear();
                    f11215c.remove(optString + "_" + h10);
                    a(obj, optString2);
                    return;
                }
                c(obj, "not found AnythinkBTContainer");
                o.a(f11214b, "closeAd successed");
                return;
            }
            c(obj, "unitId or instanceId not exist");
            o.a(f11214b, "closeAd failed: unitId or instanceId not exist unitId = ".concat(String.valueOf(optString)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("closeAd failed: "), f11214b);
        }
    }

    public final void M(Object obj, JSONObject jSONObject) {
        String str;
        try {
            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a;
            if (windVaneWebView == null) {
                str = "";
            } else {
                str = windVaneWebView.getRid();
            }
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            LinkedHashMap<String, View> b10 = b(optString, str);
            if (b10 != null && b10.size() > 0) {
                for (View view : b10.values()) {
                    if (view instanceof AnythinkBTWebView) {
                        ((AnythinkBTWebView) view).broadcast(optString2, optJSONObject);
                    }
                    if (view instanceof AnythinkBTLayout) {
                        ((AnythinkBTLayout) view).broadcast(optString2, optJSONObject);
                    }
                }
                a(obj, "");
                return;
            }
            c(obj, "unitId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("broadcast failed: "), f11214b);
        }
    }

    public final void N(Object obj, JSONObject jSONObject) {
        String str;
        com.anythink.expressad.videocommon.c.c cVar;
        String str2;
        try {
            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a;
            if (windVaneWebView == null) {
                str = "";
            } else {
                str = windVaneWebView.getRid();
            }
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String optString3 = optJSONObject.optString("userId");
            boolean optBoolean = optJSONObject.optBoolean("expired");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("reward");
            String optString4 = optJSONObject.optString(g.a.f5311h);
            if (optJSONObject2 != null) {
                cVar = new com.anythink.expressad.videocommon.c.c(optJSONObject2.optString("name"), optJSONObject2.optInt("amount"));
                str2 = optJSONObject2.optString("id");
            } else {
                cVar = null;
                str2 = "";
            }
            LinkedHashMap<String, View> b10 = b(optString, str);
            if (b10.size() > 0 && f11218g.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view instanceof ATTempContainer) {
                    ATTempContainer aTTempContainer = (ATTempContainer) view;
                    aTTempContainer.setReward(cVar);
                    aTTempContainer.setUserId(optString3);
                    aTTempContainer.setRewardId(str2);
                    aTTempContainer.setCampaignExpired(optBoolean);
                    if (!TextUtils.isEmpty(optString4)) {
                        aTTempContainer.setDeveloperExtraData(optString4);
                    }
                    a(obj, optString2);
                    o.a(f11214b, "setSubPlayTemplateInfo success instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "instanceId not exist");
                o.a(f11214b, "setSubPlayTemplateInfo failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "unitId not exist");
            o.a(f11214b, "setSubPlayTemplateInfo failed: unitId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("setSubPlayTemplateInfo failed: "), f11214b);
        }
    }

    public final void O(Object obj, JSONObject jSONObject) {
        try {
            String str = "";
            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a;
            if (windVaneWebView != null) {
                str = windVaneWebView.getRid();
            }
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String optString3 = optJSONObject.optString("eventName");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("eventData");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            LinkedHashMap<String, View> b10 = b(optString, str);
            if (b10.size() > 0) {
                View view = b10.get(optString2);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof WindVaneWebView) {
                            j.a();
                            j.a((WebView) childAt, optString3, Base64.encodeToString(optJSONObject2.toString().getBytes(), 2));
                            a(obj, optString2);
                            o.a(f11214b, "webviewFireEvent instanceId = ".concat(String.valueOf(optString2)));
                            return;
                        }
                    }
                }
                c(obj, "instanceId not exist");
                o.a(f11214b, "webviewFireEvent failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "unitId not exist");
            o.a(f11214b, "webviewFireEvent failed: unitId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("webviewFireEvent failed: "), f11214b);
        }
    }

    public final void Q(Object obj, JSONObject jSONObject) {
        o.a(f11214b, "createNativeEC:".concat(String.valueOf(jSONObject)));
        try {
            String optString = jSONObject.optString("unitId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String str = "";
                com.anythink.expressad.foundation.d.c b10 = com.anythink.expressad.foundation.d.c.b(optJSONObject.optJSONObject("campaign"));
                if (b10 != null && !TextUtils.isEmpty(optString)) {
                    b10.l(optString);
                    str = b10.Z();
                }
                d a10 = d.a(optJSONObject.optJSONObject("unitSetting"));
                if (a10 != null) {
                    a10.a(optString);
                }
                AnythinkBTNativeEC anythinkBTNativeEC = new AnythinkBTNativeEC(n.a().g());
                anythinkBTNativeEC.setCampaign(b10);
                com.anythink.expressad.video.signal.a.j jVar = new com.anythink.expressad.video.signal.a.j(null, b10);
                jVar.a(optString);
                anythinkBTNativeEC.setJSCommon(jVar);
                anythinkBTNativeEC.setUnitId(optString);
                anythinkBTNativeEC.setRewardUnitSetting(a10);
                WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a;
                if (windVaneWebView != null) {
                    str = windVaneWebView.getRid();
                    anythinkBTNativeEC.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> b11 = b(optString, str);
                String b12 = b();
                f11216d.put(b12, str);
                anythinkBTNativeEC.setInstanceId(b12);
                b11.put(b12, anythinkBTNativeEC);
                anythinkBTNativeEC.preLoadData();
                if (b10 == null) {
                    c(obj, "campaign is null");
                    o.a(f11214b, "createNativeEC failed");
                    return;
                } else {
                    a(obj, b12);
                    o.a(f11214b, "createNativeEC instanceId = ".concat(String.valueOf(b12)));
                    return;
                }
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("createNativeEC failed："), f11214b);
        }
    }

    public final void j(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String optString3 = optJSONObject.optString("id");
                LinkedHashMap<String, View> b10 = b(optString, h10);
                if (b10.containsKey(optString2) && b10.containsKey(optString3)) {
                    ViewGroup viewGroup = (ViewGroup) b10.get(optString3);
                    View view = b10.get(optString2);
                    u.a(view);
                    if (viewGroup != null && view != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                        if (view instanceof ATTempContainer) {
                            Iterator<View> it = b10.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                View next = it.next();
                                if (next instanceof AnythinkBTContainer) {
                                    u.a(view);
                                    ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, optJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            if (optJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    optInt = ((BTBaseView) view).getViewWidth();
                                    optInt2 = ((BTBaseView) view).getViewHeight();
                                } else {
                                    optInt = 0;
                                    rect = null;
                                    optInt2 = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(optJSONObject2.optInt("left", f11213a), optJSONObject2.optInt(Constant.MAP_KEY_TOP, f11213a), optJSONObject2.optInt("right", f11213a), optJSONObject2.optInt("bottom", f11213a));
                                optInt = optJSONObject2.optInt(ContentRecord.WIDTH);
                                optInt2 = optJSONObject2.optInt(ContentRecord.HEIGHT);
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            ViewGroup.LayoutParams a10 = a(layoutParams, rect, optInt, optInt2);
                            u.a(view);
                            viewGroup.addView(view, a10);
                        }
                        a(obj, optString2);
                        a(obj, "onAppendViewTo", optString2);
                        o.a(f11214b, "appendViewTo parentId = " + optString3 + " childId = " + optString2);
                        return;
                    }
                    c(obj, "view is not exist");
                    return;
                }
                c(obj, "instanceId is not exist");
                o.a(f11214b, "appendViewTo failed: instanceId is not exist");
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("appendViewTo failed: "), f11214b);
        }
    }

    public final void k(Object obj, JSONObject jSONObject) {
        int optInt;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("id");
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString3) && b10.containsKey(optString2)) {
                ViewGroup viewGroup = (ViewGroup) b10.get(optString2);
                View view = b10.get(optString3);
                if (viewGroup != null && view != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                    int i10 = 0;
                    if (view instanceof ATTempContainer) {
                        o.d(f11214b, "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f11225n), Integer.valueOf(o), Integer.valueOf(f11226p), Integer.valueOf(f11227q), Integer.valueOf(f11228r)));
                        ((ATTempContainer) view).setNotchPadding(f11225n, o, f11226p, f11227q, f11228r);
                        Iterator<View> it = b10.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof AnythinkBTContainer) {
                                u.a(view);
                                ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, optJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (optJSONObject2 == null) {
                            if (view instanceof BTBaseView) {
                                rect = ((BTBaseView) view).getRect();
                                int viewWidth = ((BTBaseView) view).getViewWidth();
                                i10 = ((BTBaseView) view).getViewHeight();
                                optInt = viewWidth;
                            } else {
                                rect = null;
                                optInt = 0;
                            }
                        } else {
                            Rect rect2 = new Rect(optJSONObject2.optInt("left", f11213a), optJSONObject2.optInt(Constant.MAP_KEY_TOP, f11213a), optJSONObject2.optInt("right", f11213a), optJSONObject2.optInt("bottom", f11213a));
                            optInt = optJSONObject2.optInt(ContentRecord.WIDTH);
                            i10 = optJSONObject2.optInt(ContentRecord.HEIGHT);
                            rect = rect2;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        viewGroup.addView(view, a(layoutParams, rect, optInt, i10));
                    }
                    a(obj, optString2);
                    a(obj, "onAppendView", optString2);
                    o.a(f11214b, "appendSubView parentId = " + optString2 + " childId = " + optString3);
                    return;
                }
                c(obj, "view is not exist");
                return;
            }
            c(obj, "instanceId is not exist");
            o.a(f11214b, "appendSubView failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("appendSubView failed: "), f11214b);
        }
    }

    public final void l(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String optString3 = optJSONObject.optString("id");
                LinkedHashMap<String, View> b10 = b(optString, h10);
                if (b10.containsKey(optString2) && b10.containsKey(optString3)) {
                    ViewGroup viewGroup = (ViewGroup) b10.get(optString3);
                    View view = b10.get(optString2);
                    if (viewGroup != null && view != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                        if (view instanceof ATTempContainer) {
                            Iterator<View> it = b10.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                View next = it.next();
                                if (next instanceof AnythinkBTContainer) {
                                    u.a(view);
                                    ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, optJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            if (optJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    optInt = ((BTBaseView) view).getViewWidth();
                                    optInt2 = ((BTBaseView) view).getViewHeight();
                                } else {
                                    optInt = 0;
                                    rect = null;
                                    optInt2 = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(optJSONObject2.optInt("left", f11213a), optJSONObject2.optInt(Constant.MAP_KEY_TOP, f11213a), optJSONObject2.optInt("right", f11213a), optJSONObject2.optInt("bottom", f11213a));
                                optInt = optJSONObject2.optInt(ContentRecord.WIDTH);
                                optInt2 = optJSONObject2.optInt(ContentRecord.HEIGHT);
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            viewGroup.addView(view, a(layoutParams, rect, optInt, optInt2));
                        }
                        a(obj, optString2);
                        a(obj, "onAppendViewTo", optString2);
                        o.a(f11214b, "appendViewTo parentId = " + optString3 + " childId = " + optString2);
                        return;
                    }
                    c(obj, "view is not exist");
                    return;
                }
                c(obj, "instanceId is not exist");
                o.a(f11214b, "appendViewTo failed: instanceId is not exist");
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("appendViewTo failed: "), f11214b);
        }
    }

    public final void m(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.bringChildToFront(view);
                        a(obj, optString2);
                        a(obj, "onBringViewToFront", optString2);
                        o.a(f11214b, "bringViewToFront instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    }
                    c(obj, "parent is null");
                    o.a(f11214b, "bringViewToFront failed: parent is null");
                    return;
                }
                c(obj, "view is null");
                o.a(f11214b, "bringViewToFront failed: view is null");
                return;
            }
            c(obj, "instanceId is not exist");
            o.a(f11214b, "bringViewToFront failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("bringViewToFront failed: "), f11214b);
        }
    }

    public final void n(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view != null) {
                    view.setVisibility(8);
                    a(obj, optString2);
                    a(obj, "onHideView", optString2);
                    o.a(f11214b, "hideView instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                o.a(f11214b, "hideView failed: view not exist");
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "hideView failed: instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("hideView failed: + "), f11214b);
        }
    }

    public final void o(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view != null) {
                    view.setVisibility(0);
                    a(obj, optString2);
                    a(obj, "onShowView", optString2);
                    o.a(f11214b, "showView instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                o.a(f11214b, "showView failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "showView failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("showView failed: "), f11214b);
        }
    }

    public final void p(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString(com.anythink.expressad.foundation.h.i.f10126d);
            if (TextUtils.isEmpty(optString3)) {
                c(obj, "color is not exist");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view != null) {
                    a(obj, optString2);
                    view.setBackgroundColor(Color.parseColor(optString3));
                    a(obj, "onViewBgColorChanged", optString2);
                    o.a(f11214b, "setViewBgColor instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                o.a(f11214b, "setViewBgColor failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "setViewBgColor failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("setViewBgColor failed: "), f11214b);
        }
    }

    public final void q(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("alpha", 1.0d);
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view != null) {
                    view.setAlpha((float) optDouble);
                    a(obj, optString2);
                    a(obj, "onViewAlphaChanged", optString2);
                    o.a(f11214b, "setViewAlpha instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                o.a(f11214b, "setViewAlpha failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "setViewAlpha failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("setViewAlpha failed: "), f11214b);
        }
    }

    public final void r(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("vertical", 1.0d);
            double optDouble2 = optJSONObject.optDouble("horizon", 1.0d);
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view != null) {
                    view.setScaleX((float) optDouble2);
                    view.setScaleY((float) optDouble);
                    a(obj, optString2);
                    a(obj, "onViewScaleChanged", optString2);
                    o.a(f11214b, "setViewScale instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                o.a(f11214b, "setViewScale failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "setViewScale failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("setViewScale failed: "), f11214b);
        }
    }

    public final void s(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2) && b10.containsKey(optString3)) {
                View view = b10.get(optString2);
                View view2 = b10.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                            rect = null;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt("left", f11213a), optJSONObject2.optInt(Constant.MAP_KEY_TOP, f11213a), optJSONObject2.optInt("right", f11213a), optJSONObject2.optInt("bottom", f11213a));
                        optInt = optJSONObject2.optInt(ContentRecord.WIDTH);
                        optInt2 = optJSONObject2.optInt(ContentRecord.HEIGHT);
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams a10 = a(layoutParams, rect, optInt, optInt2);
                    u.a(view);
                    viewGroup.addView(view, indexOfChild + 1, a10);
                    a(obj, optString2);
                    a(obj, "onInsertViewAbove", optString2);
                    o.a(f11214b, "insertViewAbove instanceId = " + optString2 + " brotherId = " + optString3);
                    return;
                }
                c(obj, "view not exist");
                o.a(f11214b, "insertViewAbove failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "insertViewAbove failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("insertViewAbove failed: "), f11214b);
        }
    }

    public final void t(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2) && b10.containsKey(optString3)) {
                View view = b10.get(optString2);
                View view2 = b10.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    int i10 = 0;
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            rect = null;
                            optInt = 0;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt("left", f11213a), optJSONObject2.optInt(Constant.MAP_KEY_TOP, f11213a), optJSONObject2.optInt("right", f11213a), optJSONObject2.optInt("bottom", f11213a));
                        optInt = optJSONObject2.optInt(ContentRecord.WIDTH);
                        optInt2 = optJSONObject2.optInt(ContentRecord.HEIGHT);
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams a10 = a(layoutParams, rect, optInt, optInt2);
                    u.a(view);
                    int i11 = indexOfChild - 1;
                    if (i11 >= 0) {
                        i10 = i11;
                    }
                    viewGroup.addView(view, i10, a10);
                    a(obj, optString2);
                    a(obj, "onInsertViewBelow", optString2);
                    o.a(f11214b, "insertViewBelow instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                o.a(f11214b, "insertViewBelow failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "insertViewBelow failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("insertViewBelow failed: "), f11214b);
        }
    }

    public final void u(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2) && b10.containsKey(optString3)) {
                View view = b10.get(optString2);
                View view2 = b10.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                            rect = null;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt("left", f11213a), optJSONObject2.optInt(Constant.MAP_KEY_TOP, f11213a), optJSONObject2.optInt("right", f11213a), optJSONObject2.optInt("bottom", f11213a));
                        optInt = optJSONObject2.optInt(ContentRecord.WIDTH);
                        optInt2 = optJSONObject2.optInt(ContentRecord.HEIGHT);
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    viewGroup.addView(view, indexOfChild + 1, a(layoutParams, rect, optInt, optInt2));
                    a(obj, optString2);
                    a(obj, "onInsertViewAbove", optString2);
                    o.a(f11214b, "insertViewAbove instanceId = " + optString2 + " brotherId = " + optString3);
                    return;
                }
                c(obj, "view not exist");
                o.a(f11214b, "insertViewAbove failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "insertViewAbove failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("insertViewAbove failed: "), f11214b);
        }
    }

    public final void v(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2) && b10.containsKey(optString3)) {
                View view = b10.get(optString2);
                View view2 = b10.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                            rect = null;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt("left", f11213a), optJSONObject2.optInt(Constant.MAP_KEY_TOP, f11213a), optJSONObject2.optInt("right", f11213a), optJSONObject2.optInt("bottom", f11213a));
                        optInt = optJSONObject2.optInt(ContentRecord.WIDTH);
                        optInt2 = optJSONObject2.optInt(ContentRecord.HEIGHT);
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    viewGroup.addView(view, indexOfChild, a(layoutParams, rect, optInt, optInt2));
                    a(obj, optString2);
                    a(obj, "onInsertViewBelow", optString2);
                    o.a(f11214b, "insertViewBelow instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                o.a(f11214b, "insertViewBelow failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "insertViewBelow failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("insertViewBelow failed: "), f11214b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.graphics.Rect] */
    public final void w(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        int i10;
        int i11;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("content");
            if (optJSONObject2 == null) {
                c(obj, "content is empty");
                return;
            }
            String optString3 = optJSONObject2.optString("fileURL");
            String optString4 = optJSONObject2.optString("filePath");
            String optString5 = optJSONObject2.optString("html");
            if (TextUtils.isEmpty(optString3) && TextUtils.isEmpty(optString4) && TextUtils.isEmpty(optString5)) {
                c(obj, "url is empty");
                return;
            }
            JSONArray optJSONArray = optJSONObject2.optJSONArray("campaigns");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    com.anythink.expressad.foundation.d.c b10 = com.anythink.expressad.foundation.d.c.b(optJSONArray.getJSONObject(i12));
                    if (b10 != null) {
                        b10.l(optString);
                        arrayList.add(b10);
                    }
                }
            }
            String optString6 = optJSONObject2.optString("unitId");
            d a10 = d.a(optJSONObject2.optJSONObject("unitSetting"));
            if (a10 != null) {
                a10.a(optString6);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("rect");
            Rect rect = new Rect(f11213a, f11213a, f11213a, f11213a);
            if (optJSONObject3 != null) {
                int optInt = optJSONObject3.optInt("left", f11213a);
                int optInt2 = optJSONObject3.optInt(Constant.MAP_KEY_TOP, f11213a);
                int optInt3 = optJSONObject3.optInt("right", f11213a);
                str2 = f11214b;
                try {
                    Rect rect2 = new Rect(optInt, optInt2, optInt3, optJSONObject3.optInt("bottom", f11213a));
                    int optInt4 = optJSONObject3.optInt(ContentRecord.WIDTH);
                    i10 = optJSONObject3.optInt(ContentRecord.HEIGHT);
                    i11 = optInt4;
                    str = rect2;
                } catch (Throwable th) {
                    th = th;
                    str = str2;
                    c(obj, th.getMessage());
                    l.z(th, new StringBuilder("webviewLoad failed: "), str);
                }
            } else {
                str2 = f11214b;
                i10 = 0;
                i11 = 0;
                str = rect;
            }
            int optInt5 = optJSONObject2.optInt("refreshCache", 0);
            try {
                LinkedHashMap<String, View> b11 = b(optString, h10);
                try {
                    if (b11.containsKey(optString2)) {
                        View view = b11.get(optString2);
                        if (view instanceof AnythinkBTWebView) {
                            AnythinkBTWebView anythinkBTWebView = (AnythinkBTWebView) view;
                            anythinkBTWebView.setHtml(optString5);
                            anythinkBTWebView.setFilePath(optString4);
                            anythinkBTWebView.setFileURL(optString3);
                            anythinkBTWebView.setRect(str);
                            anythinkBTWebView.setLayout(i11, i10);
                            anythinkBTWebView.setCampaigns(arrayList);
                            anythinkBTWebView.setRewardUnitSetting(a10);
                            anythinkBTWebView.webviewLoad(optInt5);
                            a(obj, optString2);
                            o.a(str2, "webviewLoad instanceId = ".concat(String.valueOf(optString2)));
                            return;
                        }
                        c(obj, "view not exist");
                        o.a(str2, "webviewLoad failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    }
                    c(obj, "instanceId not exist");
                    o.a(str2, "webviewLoad failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
                } catch (Throwable th2) {
                    th = th2;
                    c(obj, th.getMessage());
                    l.z(th, new StringBuilder("webviewLoad failed: "), str);
                }
            } catch (Throwable th3) {
                th = th3;
                str = str2;
                c(obj, th.getMessage());
                l.z(th, new StringBuilder("webviewLoad failed: "), str);
            }
        } catch (Throwable th4) {
            th = th4;
            str = f11214b;
        }
    }

    public final void x(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view instanceof AnythinkBTWebView) {
                    if (((AnythinkBTWebView) view).webviewReload()) {
                        a(obj, optString2);
                        o.a(f11214b, "webviewReload instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    } else {
                        c(obj, "reload failed");
                        o.a(f11214b, "webviewReload failed reload failed instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    }
                }
                c(obj, "view not exist");
                o.a(f11214b, "webviewReload failed view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "webviewReload failed instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("webviewReload failed: "), f11214b);
        }
    }

    public final void y(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view instanceof AnythinkBTWebView) {
                    if (((AnythinkBTWebView) view).webviewGoBack()) {
                        a(obj, optString2);
                        o.a(f11214b, "webviewGoBack instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    } else {
                        c(obj, "webviewGoBack failed");
                        o.a(f11214b, "webviewGoBack failed instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    }
                }
                c(obj, "view not exist");
                o.a(f11214b, "webviewGoBack failed view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "webviewGoBack failed instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("webviewGoBack failed: "), f11214b);
        }
    }

    public final void z(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view instanceof AnythinkBTWebView) {
                    if (((AnythinkBTWebView) view).webviewGoForward()) {
                        a(obj, optString2);
                        o.a(f11214b, "webviewGoForward instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    } else {
                        c(obj, "webviewGoForward failed");
                        o.a(f11214b, "webviewGoForward failed instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    }
                }
                c(obj, "view not exist");
                o.a(f11214b, "webviewGoForward failed view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "webviewGoForward failed instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("webviewGoForward failed: "), f11214b);
        }
    }

    private c() {
    }

    public static com.anythink.expressad.foundation.d.c a(String str) {
        if (f11217e.containsKey(str)) {
            return f11217e.get(str);
        }
        return null;
    }

    public static String c(String str) {
        return f11218g.containsKey(str) ? f11218g.get(str) : "";
    }

    public final void d(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                int optInt = optJSONObject.optInt("mute");
                String str = "";
                com.anythink.expressad.foundation.d.c b10 = com.anythink.expressad.foundation.d.c.b(optJSONObject.optJSONObject("campaign"));
                if (b10 != null && !TextUtils.isEmpty(optString)) {
                    b10.l(optString);
                    str = b10.Z();
                }
                d a10 = d.a(optJSONObject.optJSONObject("unitSetting"));
                if (a10 != null) {
                    a10.a(optString);
                }
                String optString2 = optJSONObject.optString("userId");
                if (TextUtils.isEmpty(str) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                    str = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> b11 = b(optString, str);
                String b12 = b();
                f11216d.put(b12, str);
                ATTempContainer aTTempContainer = new ATTempContainer(n.a().g());
                aTTempContainer.setInstanceId(b12);
                aTTempContainer.setUnitId(optString);
                aTTempContainer.setCampaign(b10);
                aTTempContainer.setRewardUnitSetting(a10);
                aTTempContainer.setBigOffer(true);
                if (!TextUtils.isEmpty(optString2)) {
                    aTTempContainer.setUserId(optString2);
                }
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("reward");
                if (optJSONObject2 != null) {
                    String optString3 = optJSONObject2.optString("id");
                    com.anythink.expressad.videocommon.c.c cVar = new com.anythink.expressad.videocommon.c.c(optJSONObject2.optString("name"), optJSONObject2.optInt("amount"));
                    if (!TextUtils.isEmpty(optString3)) {
                        aTTempContainer.setRewardId(optString3);
                    }
                    if (!TextUtils.isEmpty(cVar.a())) {
                        aTTempContainer.setReward(cVar);
                    }
                }
                String optString4 = optJSONObject.optString(g.a.f5311h);
                if (!TextUtils.isEmpty(optString4)) {
                    aTTempContainer.setDeveloperExtraData(optString4);
                }
                aTTempContainer.setMute(optInt);
                b11.put(b12, aTTempContainer);
                f11218g.put(b12, optString);
                f11217e.put(b12, b10);
                f.put(b12, a10);
                a(obj, b12);
                o.a(f11214b, "createSubPlayTemplateView instanceId = ".concat(String.valueOf(b12)));
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("createSubPlayTemplateView failed："), f11214b);
        }
    }

    public static d b(String str) {
        if (f.containsKey(str)) {
            return f.get(str);
        }
        return null;
    }

    public final void e(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") != null && !TextUtils.isEmpty(optString)) {
                String h10 = h(optString2);
                if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                    h10 = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> b10 = b(optString, h10);
                if (b10 != null && b10.containsKey(optString2)) {
                    View view = b10.get(optString2);
                    b10.remove(optString2);
                    if (view != null && view.getParent() != null) {
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) view;
                            if (viewGroup2.getChildCount() > 0) {
                                int childCount = viewGroup2.getChildCount();
                                for (int i10 = 0; i10 < childCount; i10++) {
                                    View childAt = viewGroup2.getChildAt(i10);
                                    if (childAt instanceof AnythinkBTWebView) {
                                        b10.remove(((AnythinkBTWebView) childAt).getInstanceId());
                                        ((AnythinkBTWebView) childAt).onDestory();
                                    } else if (childAt instanceof AnythinkBTVideoView) {
                                        b10.remove(((AnythinkBTVideoView) childAt).getInstanceId());
                                        ((AnythinkBTVideoView) childAt).onDestory();
                                    } else if (childAt instanceof ATTempContainer) {
                                        b10.remove(((ATTempContainer) childAt).getInstanceId());
                                        ((ATTempContainer) childAt).onDestroy();
                                    }
                                }
                            }
                        }
                    }
                    if (view instanceof ATTempContainer) {
                        ((ATTempContainer) view).onDestroy();
                    }
                    if (view instanceof AnythinkBTWebView) {
                        ((AnythinkBTWebView) view).onDestory();
                    }
                    if (view instanceof AnythinkBTVideoView) {
                        ((AnythinkBTVideoView) view).onDestory();
                    }
                    a(obj, optString2);
                    a(obj, "onComponentDestroy", optString2);
                    o.a(f11214b, "destroyComponent instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "unitId or instanceId not exist");
                o.a(f11214b, "destroyComponent failed");
                return;
            }
            c(obj, "unidId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            o.a(f11214b, "destroyComponent failed");
        }
    }

    public final void g(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            if (optJSONObject2 == null) {
                c(obj, "rect not exist");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            Rect rect = new Rect(optJSONObject2.optInt("left", f11213a), optJSONObject2.optInt(Constant.MAP_KEY_TOP, f11213a), optJSONObject2.optInt("right", f11213a), optJSONObject2.optInt("bottom", f11213a));
            int optInt = optJSONObject2.optInt(ContentRecord.WIDTH);
            int optInt2 = optJSONObject2.optInt(ContentRecord.HEIGHT);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view != null) {
                    if (view.getParent() != null) {
                        view.setLayoutParams(a(view.getLayoutParams(), rect, optInt, optInt2));
                        view.requestLayout();
                    } else {
                        if (view instanceof AnythinkBTWebView) {
                            ((AnythinkBTWebView) view).setRect(rect);
                            ((AnythinkBTWebView) view).setLayout(optInt, optInt2);
                        }
                        if (view instanceof AnythinkBTVideoView) {
                            ((AnythinkBTVideoView) view).setRect(rect);
                            ((AnythinkBTVideoView) view).setLayout(optInt, optInt2);
                        }
                    }
                    a(obj, optString2);
                    a(obj, "onViewRectChanged", optString2);
                    o.a(f11214b, "setViewRect instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view is null");
                o.a(f11214b, "setViewRect failed: view is null");
                return;
            }
            c(obj, "instanceId not exist");
            o.a(f11214b, "setViewRect failed: instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("setViewRect failed: "), f11214b);
        }
    }

    public final void h(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString2)) {
                View view = b10.get(optString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                        a(obj, optString2);
                        a(obj, "onRemoveFromView", optString2);
                        o.a(f11214b, "removeFromSuperView instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    }
                    c(obj, "parent is null");
                    o.a(f11214b, "removeFromSuperView failed: parent is null instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view is null");
                o.a(f11214b, "removeFromSuperView failed: view is null instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "params not enough");
            o.a(f11214b, "removeFromSuperView failed: params not enough instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("removeFromSuperView failed: "), f11214b);
        }
    }

    public final void i(Object obj, JSONObject jSONObject) {
        int optInt;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h10 = h(optString2);
            if (TextUtils.isEmpty(h10) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a) != null) {
                h10 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("id");
            LinkedHashMap<String, View> b10 = b(optString, h10);
            if (b10.containsKey(optString3) && b10.containsKey(optString2)) {
                ViewGroup viewGroup = (ViewGroup) b10.get(optString2);
                View view = b10.get(optString3);
                u.a(view);
                if (viewGroup != null && view != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                    int i10 = 0;
                    if (view instanceof ATTempContainer) {
                        o.d(f11214b, "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f11225n), Integer.valueOf(o), Integer.valueOf(f11226p), Integer.valueOf(f11227q), Integer.valueOf(f11228r)));
                        ((ATTempContainer) view).setNotchPadding(f11225n, o, f11226p, f11227q, f11228r);
                        Iterator<View> it = b10.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof AnythinkBTContainer) {
                                u.a(view);
                                ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, optJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (optJSONObject2 == null) {
                            if (view instanceof BTBaseView) {
                                rect = ((BTBaseView) view).getRect();
                                int viewWidth = ((BTBaseView) view).getViewWidth();
                                i10 = ((BTBaseView) view).getViewHeight();
                                optInt = viewWidth;
                            } else {
                                rect = null;
                                optInt = 0;
                            }
                        } else {
                            Rect rect2 = new Rect(optJSONObject2.optInt("left", f11213a), optJSONObject2.optInt(Constant.MAP_KEY_TOP, f11213a), optJSONObject2.optInt("right", f11213a), optJSONObject2.optInt("bottom", f11213a));
                            optInt = optJSONObject2.optInt(ContentRecord.WIDTH);
                            i10 = optJSONObject2.optInt(ContentRecord.HEIGHT);
                            rect = rect2;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        ViewGroup.LayoutParams a10 = a(layoutParams, rect, optInt, i10);
                        u.a(view);
                        viewGroup.addView(view, a10);
                    }
                    a(obj, optString2);
                    a(obj, "onAppendView", optString2);
                    o.a(f11214b, "appendSubView parentId = " + optString2 + " childId = " + optString3);
                    return;
                }
                c(obj, "view is not exist");
                return;
            }
            c(obj, "instanceId is not exist");
            o.a(f11214b, "appendSubView failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("appendSubView failed: "), f11214b);
        }
    }

    public static void a(String str, String str2) {
        f11216d.put(str, str2);
    }

    private static void c(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f11223l);
            jSONObject.put(CrashHianalyticsData.MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            o.a(f11214b, e10.getMessage());
        }
    }

    public static void a(String str, Activity activity) {
        f11220i.put(str, activity);
    }

    public final synchronized LinkedHashMap<String, View> b(String str, String str2) {
        if (f11215c.containsKey(str + "_" + str2)) {
            return f11215c.get(str + "_" + str2);
        }
        LinkedHashMap<String, View> linkedHashMap = new LinkedHashMap<>();
        f11215c.put(str + "_" + str2, linkedHashMap);
        return linkedHashMap;
    }

    public static void a(String str, int i10) {
        f11219h.put(str, Integer.valueOf(i10));
    }

    public static void a(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f11223l);
            jSONObject.put(CrashHianalyticsData.MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            j.a().a(webView, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            o.a(f11214b, e10.getMessage());
        }
    }

    public static void f(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            String optString = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            } else {
                a(obj, optString);
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void b(final Object obj, JSONObject jSONObject) {
        final int i10;
        final int i11;
        final Rect rect;
        try {
            final String optString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(optString)) {
                c(obj, "unitId is empty");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            int optInt = optJSONObject.optInt(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_DELAY, 0);
            final String optString2 = optJSONObject.optString("fileURL");
            final String optString3 = optJSONObject.optString("filePath");
            final String optString4 = optJSONObject.optString("html");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(f11213a, f11213a, f11213a, f11213a);
            if (optJSONObject2 != null) {
                Rect rect3 = new Rect(optJSONObject2.optInt("left", f11213a), optJSONObject2.optInt(Constant.MAP_KEY_TOP, f11213a), optJSONObject2.optInt("right", f11213a), optJSONObject2.optInt("bottom", f11213a));
                int optInt2 = optJSONObject2.optInt(ContentRecord.WIDTH);
                i11 = optJSONObject2.optInt(ContentRecord.HEIGHT);
                rect = rect3;
                i10 = optInt2;
            } else {
                i10 = 0;
                i11 = 0;
                rect = rect2;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.a.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a;
                    if (windVaneWebView != null) {
                        str = windVaneWebView.getRid();
                    } else {
                        str = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> b10 = c.this.b(optString, str);
                    String b11 = c.b();
                    c.f11216d.put(b11, str);
                    AnythinkBTWebView anythinkBTWebView = new AnythinkBTWebView(n.a().g());
                    b10.put(b11, anythinkBTWebView);
                    anythinkBTWebView.setInstanceId(b11);
                    anythinkBTWebView.setUnitId(optString);
                    anythinkBTWebView.setFileURL(optString2);
                    anythinkBTWebView.setFilePath(optString3);
                    anythinkBTWebView.setHtml(optString4);
                    anythinkBTWebView.setRect(rect);
                    anythinkBTWebView.setWebViewRid(str);
                    anythinkBTWebView.setCreateWebView(windVaneWebView);
                    int i12 = i10;
                    if (i12 > 0 || i11 > 0) {
                        anythinkBTWebView.setLayout(i12, i11);
                    }
                    anythinkBTWebView.preload();
                    c.a(obj, b11);
                    o.a(c.f11214b, "createWebview instanceId = ".concat(String.valueOf(b11)));
                }
            }, optInt);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("createWebview failed："), f11214b);
        }
    }

    public final void c(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String str = "";
                com.anythink.expressad.foundation.d.c b10 = com.anythink.expressad.foundation.d.c.b(optJSONObject.optJSONObject("campaign"));
                if (b10 != null && !TextUtils.isEmpty(optString)) {
                    b10.l(optString);
                    str = b10.Z();
                }
                int optInt = optJSONObject.optInt("show_time", 0);
                int optInt2 = optJSONObject.optInt("show_mute", 0);
                int optInt3 = optJSONObject.optInt("show_close", 0);
                int optInt4 = optJSONObject.optInt("orientation", 1);
                int optInt5 = optJSONObject.optInt("show_pgb", 0);
                AnythinkBTVideoView anythinkBTVideoView = new AnythinkBTVideoView(n.a().g());
                anythinkBTVideoView.setCampaign(b10);
                anythinkBTVideoView.setUnitId(optString);
                anythinkBTVideoView.setShowMute(optInt2);
                anythinkBTVideoView.setShowTime(optInt);
                anythinkBTVideoView.setShowClose(optInt3);
                anythinkBTVideoView.setOrientation(optInt4);
                anythinkBTVideoView.setProgressBarState(optInt5);
                WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a;
                if (windVaneWebView != null) {
                    str = windVaneWebView.getRid();
                    anythinkBTVideoView.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> b11 = b(optString, str);
                String b12 = b();
                f11216d.put(b12, str);
                anythinkBTVideoView.setInstanceId(b12);
                b11.put(b12, anythinkBTVideoView);
                anythinkBTVideoView.preLoadData();
                if (b10 == null) {
                    c(obj, "campaign is null");
                    o.a(f11214b, "createPlayerView failed");
                } else {
                    a(obj, b12);
                    o.a(f11214b, "createPlayerView instanceId = ".concat(String.valueOf(b12)));
                }
                com.anythink.expressad.video.bt.a.a.a();
                com.anythink.expressad.video.bt.a.a.a(b12, anythinkBTVideoView);
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("createPlayerView failed："), f11214b);
        }
    }

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f11222k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            c(obj, e10.getMessage());
            o.a(f11214b, e10.getMessage());
        }
    }

    private static void a(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f11222k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            c(obj, e10.getMessage());
            o.a(f11214b, e10.getMessage());
        }
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f11222k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            j.a();
            j.a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            a(webView, e10.getMessage());
            o.a(f11214b, e10.getMessage());
        }
    }

    public static void b(Object obj, String str) {
        o.a(f11214b, "reportUrls:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                int optInt = jSONObject.optInt("type");
                String optString = jSONObject.optString("url");
                int optInt2 = jSONObject.optInt(ReportDBAdapter.ReportColumns.TABLE_NAME);
                boolean z10 = true;
                if (optInt2 == 0) {
                    Context g6 = n.a().g();
                    if (optInt == 0) {
                        z10 = false;
                    }
                    com.anythink.expressad.a.a.a(g6, (com.anythink.expressad.foundation.d.c) null, "", optString, z10);
                } else {
                    com.anythink.expressad.a.a.a(n.a().g(), null, "", optString, false, optInt != 0, optInt2);
                }
            }
            a(obj, "");
        } catch (Throwable th) {
            o.b(f11214b, "reportUrls", th);
        }
    }

    public final void a(final Object obj, JSONObject jSONObject) {
        final int i10;
        final int i11;
        final Rect rect;
        try {
            final String optString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(optString)) {
                c(obj, "unitId is empty");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            int optInt = optJSONObject.optInt(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_DELAY, 0);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(f11213a, f11213a, f11213a, f11213a);
            if (optJSONObject2 != null) {
                Rect rect3 = new Rect(optJSONObject2.optInt("left", f11213a), optJSONObject2.optInt(Constant.MAP_KEY_TOP, f11213a), optJSONObject2.optInt("right", f11213a), optJSONObject2.optInt("bottom", f11213a));
                int optInt2 = optJSONObject2.optInt(ContentRecord.WIDTH);
                i11 = optJSONObject2.optInt(ContentRecord.HEIGHT);
                rect = rect3;
                i10 = optInt2;
            } else {
                i10 = 0;
                i11 = 0;
                rect = rect2;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.a.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).f7045a;
                    if (windVaneWebView != null) {
                        str = windVaneWebView.getRid();
                    } else {
                        str = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> b10 = c.this.b(optString, str);
                    String b11 = c.b();
                    c.f11216d.put(b11, str);
                    AnythinkBTLayout anythinkBTLayout = new AnythinkBTLayout(n.a().g());
                    b10.put(b11, anythinkBTLayout);
                    anythinkBTLayout.setInstanceId(b11);
                    anythinkBTLayout.setUnitId(optString);
                    anythinkBTLayout.setWebView(windVaneWebView);
                    anythinkBTLayout.setRect(rect);
                    int i12 = i10;
                    if (i12 > 0 || i11 > 0) {
                        anythinkBTLayout.setLayout(i12, i11);
                    }
                    c.a(obj, b11);
                    o.a(c.f11214b, "create view instanceId = ".concat(String.valueOf(b11)));
                }
            }, optInt);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            l.z(th, new StringBuilder("create view failed："), f11214b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.widget.LinearLayout$LayoutParams] */
    private static ViewGroup.LayoutParams a(ViewGroup.LayoutParams layoutParams, Rect rect, int i10, int i11) {
        if (rect == null) {
            rect = new Rect(f11213a, f11213a, f11213a, f11213a);
        }
        Context g6 = n.a().g();
        if (g6 == null) {
            return layoutParams;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            int i12 = rect.left;
            if (i12 != -999) {
                layoutParams2.leftMargin = t.b(g6, i12);
            }
            int i13 = rect.top;
            if (i13 != -999) {
                layoutParams2.topMargin = t.b(g6, i13);
            }
            int i14 = rect.right;
            if (i14 != -999) {
                layoutParams2.rightMargin = t.b(g6, i14);
            }
            int i15 = rect.bottom;
            if (i15 != -999) {
                layoutParams2.bottomMargin = t.b(g6, i15);
            }
            if (i10 > 0) {
                layoutParams2.width = t.b(g6, i10);
            }
            if (i11 > 0) {
                layoutParams2.height = t.b(g6, i11);
            }
            return layoutParams2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            int i16 = rect.left;
            if (i16 != -999) {
                layoutParams3.leftMargin = t.b(g6, i16);
            }
            int i17 = rect.top;
            if (i17 != -999) {
                layoutParams3.topMargin = t.b(g6, i17);
            }
            int i18 = rect.right;
            if (i18 != -999) {
                layoutParams3.rightMargin = t.b(g6, i18);
            }
            int i19 = rect.bottom;
            if (i19 != -999) {
                layoutParams3.bottomMargin = t.b(g6, i19);
            }
            if (i10 > 0) {
                layoutParams3.width = t.b(g6, i10);
            }
            if (i11 > 0) {
                layoutParams3.height = t.b(g6, i11);
            }
            return layoutParams3;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams = new LinearLayout.LayoutParams(-1, -1);
            int i20 = rect.left;
            if (i20 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = t.b(g6, i20);
            }
            int i21 = rect.top;
            if (i21 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).topMargin = t.b(g6, i21);
            }
            int i22 = rect.right;
            if (i22 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = t.b(g6, i22);
            }
            int i23 = rect.bottom;
            if (i23 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).bottomMargin = t.b(g6, i23);
            }
            if (i10 > 0) {
                ((LinearLayout.LayoutParams) layoutParams).width = t.b(g6, i10);
            }
            if (i11 > 0) {
                ((LinearLayout.LayoutParams) layoutParams).height = t.b(g6, i11);
            }
        }
        return layoutParams;
    }

    public static void a(Object obj) {
        try {
            a(obj, "");
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    private static void a(String str, com.anythink.expressad.foundation.d.c cVar) {
        if (f.f9822k == null || TextUtils.isEmpty(cVar.aZ())) {
            return;
        }
        f.a(str, cVar, "reward");
    }

    public static void a(int i10, int i11, int i12, int i13, int i14) {
        o.a(f11214b, "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)));
        f11224m = h.a(i10, i11, i12, i13, i14);
        f11225n = i10;
        o = i11;
        f11226p = i12;
        f11227q = i13;
        f11228r = i14;
    }

    private static void a(String str, String str2, String str3) {
        try {
            LinkedHashMap<String, View> b10 = a.f11242a.b(str, str2);
            if (b10 == null || b10.size() <= 0) {
                return;
            }
            for (View view : b10.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).notifyEvent(str3);
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).notifyEvent(str3);
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).notifyEvent(str3);
                }
            }
        } catch (Throwable th) {
            o.a(f11214b, th.getMessage());
        }
    }
}
