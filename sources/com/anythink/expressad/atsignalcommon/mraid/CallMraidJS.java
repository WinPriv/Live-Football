package com.anythink.expressad.atsignalcommon.mraid;

import android.webkit.WebView;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CallMraidJS {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7000a = "placementType";

    /* renamed from: b, reason: collision with root package name */
    public static final String f7001b = "state";

    /* renamed from: c, reason: collision with root package name */
    public static final String f7002c = "viewable";

    /* renamed from: d, reason: collision with root package name */
    public static final String f7003d = "currentAppOrientation";

    /* renamed from: e, reason: collision with root package name */
    public static final String f7004e = "loading";
    public static final String f = "default";

    /* renamed from: g, reason: collision with root package name */
    public static final String f7005g = "expanded";

    /* renamed from: h, reason: collision with root package name */
    public static final String f7006h = "hidden";

    /* renamed from: i, reason: collision with root package name */
    public static final String f7007i = "resized";

    /* renamed from: j, reason: collision with root package name */
    public static final String f7008j = "Interstitial";

    /* renamed from: k, reason: collision with root package name */
    public static final String f7009k = "inline";

    /* loaded from: classes.dex */
    public static class SingletonHolder {

        /* renamed from: a, reason: collision with root package name */
        private static final CallMraidJS f7010a = new CallMraidJS();

        private SingletonHolder() {
        }
    }

    private static void a(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static CallMraidJS getInstance() {
        return SingletonHolder.f7010a;
    }

    public void fireAudioVolumeChange(WebView webView, double d10) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.audioVolumeChange(%s);", Double.valueOf(d10)));
    }

    public void fireChangeEventForPropertys(WebView webView, Map<String, Object> map) {
        if (map != null && map.size() != 0) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            a(webView, String.format("javascript:window.mraidbridge.fireChangeEvent(%s);", jSONObject.toString()));
        }
    }

    public void fireErrorEvent(WebView webView, String str, String str2) {
        a(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    public void fireNativeMethodCompleteEvent(WebView webView, String str) {
        a(webView, String.format("javascript:window.mraidbridge.nativeCallComplete('%s');", str));
    }

    public void fireReadyEvent(WebView webView) {
        a(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    public void fireSetCurrentPosition(WebView webView, float f10, float f11, float f12, float f13) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
    }

    public void fireSetDefaultPosition(WebView webView, float f10, float f11, float f12, float f13) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
    }

    public void fireSetIsViewable(WebView webView, String str) {
        a(webView, String.format("javascript:window.mraidbridge.setIsViewable(%s);", str));
    }

    public void fireSetMaxSize(WebView webView, float f10, float f11) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void fireSetPlacementType(WebView webView, String str) {
        a(webView, String.format("javascript:window.mraidbridge.setPlacementType(%s);", str));
    }

    public void fireSetScreenSize(WebView webView, float f10, float f11) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void fireSizeChangeEvent(WebView webView, float f10, float f11) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }
}
