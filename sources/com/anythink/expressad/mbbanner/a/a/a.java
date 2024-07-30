package com.anythink.expressad.mbbanner.a.a;

import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.huawei.hms.ads.ep;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10277a = "BannerCallJS";

    public static void a(WebView webView) {
        o.d(f10277a, "fireOnJSBridgeConnected");
        j.a();
        j.b(webView);
    }

    public static void a(WebView webView, float f, float f10) {
        o.d(f10277a, "fireOnBannerWebViewShow");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startX", f);
            jSONObject.put("startY", f10);
            jSONObject.put("scale", t.c(n.a().g()));
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            j.a();
            j.a(webView, "webviewshow", encodeToString);
        } catch (Throwable th) {
            o.b(f10277a, "fireOnBannerWebViewShow", th);
        }
    }

    private static void a(WebView webView, int i10, int i11) {
        o.d(f10277a, "fireOnBannerViewSizeChange");
        try {
            CallMraidJS.getInstance().fireSizeChangeEvent(webView, i10, i11);
        } catch (Throwable th) {
            o.b(f10277a, "fireOnBannerViewSizeChange", th);
        }
    }

    public static void a(WindVaneWebView windVaneWebView, boolean z10) {
        try {
            CallMraidJS.getInstance().fireSetIsViewable(windVaneWebView, z10 ? ep.Code : ep.V);
        } catch (Throwable th) {
            o.b(f10277a, "fireMraidIsViewable", th);
        }
    }

    public static void a(WebView webView, int i10, int i11, int i12, int i13) {
        o.d(f10277a, "transInfoForMraid");
        try {
            int i14 = n.a().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i14 == 2 ? "landscape" : i14 == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", ep.Code);
            float e10 = k.e(n.a().g());
            float f = k.f(n.a().g());
            HashMap g6 = k.g(n.a().g());
            int intValue = ((Integer) g6.get(ContentRecord.WIDTH)).intValue();
            int intValue2 = ((Integer) g6.get(ContentRecord.HEIGHT)).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(CallMraidJS.f7000a, CallMraidJS.f7009k);
            hashMap.put("state", CallMraidJS.f);
            hashMap.put(CallMraidJS.f7002c, ep.Code);
            hashMap.put(CallMraidJS.f7003d, jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            CallMraidJS.getInstance().fireSetDefaultPosition(webView, f10, f11, f12, f13);
            CallMraidJS.getInstance().fireSetCurrentPosition(webView, f10, f11, f12, f13);
            CallMraidJS.getInstance().fireSetScreenSize(webView, e10, f);
            CallMraidJS.getInstance().fireSetMaxSize(webView, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(webView, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(webView);
        } catch (Throwable th) {
            o.b(f10277a, "transInfoForMraid", th);
        }
    }
}
