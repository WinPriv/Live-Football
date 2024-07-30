package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.c.i;
import com.applovin.impl.sdk.ab;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class d extends h {

    /* renamed from: c, reason: collision with root package name */
    private static WebView f17128c;

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f17129a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f17130b;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.d.d f17131d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.e f17132e;
    private boolean f;

    public d(e eVar, com.applovin.impl.sdk.p pVar, Context context) {
        super(context);
        WebViewClient abVar;
        b bVar;
        if (pVar != null) {
            this.f17130b = pVar;
            this.f17129a = pVar.L();
            setBackgroundColor(0);
            WebSettings settings = getSettings();
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptEnabled(true);
            if (eVar != null) {
                abVar = eVar;
            } else {
                abVar = new ab();
            }
            setWebViewClient(abVar);
            if (eVar != null) {
                bVar = eVar.a();
            } else {
                bVar = null;
            }
            setWebChromeClient(new c(bVar, pVar));
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setScrollBarStyle(33554432);
            if (com.applovin.impl.sdk.utils.h.i() && ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.fw)).booleanValue()) {
                setWebViewRenderProcessClient(new f(pVar).a());
            }
            setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.d.1
                @Override // android.view.View.OnTouchListener
                @SuppressLint({"ClickableViewAccessibility"})
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!view.hasFocus()) {
                        view.requestFocus();
                        return false;
                    }
                    return false;
                }
            });
            setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.d.2
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    com.applovin.impl.sdk.y unused = d.this.f17129a;
                    if (com.applovin.impl.sdk.y.a()) {
                        d.this.f17129a.b("AdWebView", "Received a LongClick event.");
                        return true;
                    }
                    return true;
                }
            });
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        if (f17128c != null) {
            return;
        }
        WebView tryToCreateWebView = Utils.tryToCreateWebView(com.applovin.impl.sdk.p.y(), "postbacks");
        f17128c = tryToCreateWebView;
        if (tryToCreateWebView == null) {
            return;
        }
        tryToCreateWebView.getSettings().setJavaScriptEnabled(true);
        f17128c.loadData("<html><head>\n<script type=\"text/javascript\">\n    window.al_firePostback = function(postback) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = postback;\n    }, 100);\n};\n</script></head>\n<body></body></html>", "text/html", "UTF-8");
        f17128c.setWebViewClient(new WebViewClient() { // from class: com.applovin.impl.adview.d.4
            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (webView == d.f17128c) {
                    d.f17128c.destroy();
                    WebView unused = d.f17128c = null;
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            d.c();
                        }
                    });
                    return true;
                }
                return true;
            }
        });
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f = true;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.e getCurrentAd() {
        return this.f17132e;
    }

    public com.applovin.impl.sdk.d.d getStatsManagerHelper() {
        return this.f17131d;
    }

    public void setStatsManagerHelper(com.applovin.impl.sdk.d.d dVar) {
        this.f17131d = dVar;
    }

    private void b(com.applovin.impl.sdk.ad.e eVar) {
        Boolean n10;
        Integer a10;
        loadUrl(com.anythink.core.common.res.d.f6477a);
        int az = this.f17132e.az();
        if (az >= 0) {
            setLayerType(az, null);
        }
        if (com.applovin.impl.sdk.utils.h.b()) {
            getSettings().setMediaPlaybackRequiresUserGesture(eVar.av());
        }
        if (com.applovin.impl.sdk.utils.h.c() && eVar.ax()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        x ay = eVar.ay();
        if (ay != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b10 = ay.b();
            if (b10 != null) {
                settings.setPluginState(b10);
            }
            Boolean c10 = ay.c();
            if (c10 != null) {
                settings.setAllowFileAccess(c10.booleanValue());
            }
            Boolean d10 = ay.d();
            if (d10 != null) {
                settings.setLoadWithOverviewMode(d10.booleanValue());
            }
            Boolean e10 = ay.e();
            if (e10 != null) {
                settings.setUseWideViewPort(e10.booleanValue());
            }
            Boolean f = ay.f();
            if (f != null) {
                settings.setAllowContentAccess(f.booleanValue());
            }
            Boolean g6 = ay.g();
            if (g6 != null) {
                settings.setBuiltInZoomControls(g6.booleanValue());
            }
            Boolean h10 = ay.h();
            if (h10 != null) {
                settings.setDisplayZoomControls(h10.booleanValue());
            }
            Boolean i10 = ay.i();
            if (i10 != null) {
                settings.setSaveFormData(i10.booleanValue());
            }
            Boolean j10 = ay.j();
            if (j10 != null) {
                settings.setGeolocationEnabled(j10.booleanValue());
            }
            Boolean k10 = ay.k();
            if (k10 != null) {
                settings.setNeedInitialFocus(k10.booleanValue());
            }
            Boolean l10 = ay.l();
            if (l10 != null) {
                settings.setAllowFileAccessFromFileURLs(l10.booleanValue());
            }
            Boolean m10 = ay.m();
            if (m10 != null) {
                settings.setAllowUniversalAccessFromFileURLs(m10.booleanValue());
            }
            if (com.applovin.impl.sdk.utils.h.d() && (a10 = ay.a()) != null) {
                settings.setMixedContentMode(a10.intValue());
            }
            if (!com.applovin.impl.sdk.utils.h.e() || (n10 = ay.n()) == null) {
                return;
            }
            settings.setOffscreenPreRaster(n10.booleanValue());
        }
    }

    public void a(com.applovin.impl.sdk.ad.e eVar) {
        if (!this.f) {
            this.f17132e = eVar;
            try {
                b(eVar);
                if (Utils.isBML(eVar.getSize())) {
                    setVisibility(0);
                }
                if (eVar instanceof com.applovin.impl.sdk.ad.a) {
                    com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
                    String b10 = aVar.b();
                    if (!aVar.q() && aVar.isOpenMeasurementEnabled()) {
                        b10 = this.f17130b.ag().a(b10);
                    }
                    loadDataWithBaseURL(eVar.aw(), b10, "text/html", null, "");
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f17129a.b("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (eVar instanceof com.applovin.impl.c.a) {
                    com.applovin.impl.c.a aVar2 = (com.applovin.impl.c.a) eVar;
                    com.applovin.impl.c.d aQ = aVar2.aQ();
                    if (aQ != null) {
                        com.applovin.impl.c.i b11 = aQ.b();
                        Uri b12 = b11.b();
                        String uri = b12 != null ? b12.toString() : "";
                        String c10 = b11.c();
                        String aU = aVar2.aU();
                        if (!StringUtils.isValidString(uri) && !StringUtils.isValidString(c10)) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f17129a.e("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (b11.a() == i.a.STATIC) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f17129a.b("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String a10 = a((String) this.f17130b.a(com.applovin.impl.sdk.c.b.eG), uri);
                            if (aVar2.c() && aVar2.isOpenMeasurementEnabled() && aVar2.e()) {
                                a10 = this.f17130b.ag().a(a10);
                            }
                            loadDataWithBaseURL(eVar.aw(), a10, "text/html", null, "");
                            return;
                        }
                        if (b11.a() == i.a.HTML) {
                            if (StringUtils.isValidString(c10)) {
                                String a11 = a(aU, c10);
                                if (StringUtils.isValidString(a11)) {
                                    c10 = a11;
                                }
                                if (aVar2.c() && aVar2.isOpenMeasurementEnabled() && !aVar2.q()) {
                                    c10 = this.f17130b.ag().a(c10);
                                }
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f17129a.b("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + c10);
                                }
                                loadDataWithBaseURL(eVar.aw(), c10, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(uri)) {
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f17129a.b("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(uri, eVar.aw(), aU, this.f17130b, aVar2);
                                return;
                            }
                            return;
                        }
                        if (b11.a() == i.a.IFRAME) {
                            if (StringUtils.isValidString(uri)) {
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f17129a.b("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(uri, eVar.aw(), aU, this.f17130b, aVar2);
                                return;
                            }
                            if (StringUtils.isValidString(c10)) {
                                String a12 = a(aU, c10);
                                if (StringUtils.isValidString(a12)) {
                                    c10 = a12;
                                }
                                if (aVar2.c() && aVar2.isOpenMeasurementEnabled() && !aVar2.q()) {
                                    c10 = this.f17130b.ag().a(c10);
                                }
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f17129a.b("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + c10);
                                }
                                loadDataWithBaseURL(eVar.aw(), c10, "text/html", null, "");
                                return;
                            }
                            return;
                        }
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f17129a.e("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f17129a.b("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (eVar != null ? String.valueOf(eVar.getAdIdNumber()) : "null") + ") - " + th);
            }
        }
        com.applovin.impl.sdk.y.i("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    public void a(String str) {
        a(str, (Runnable) null);
    }

    public void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.y.a()) {
                this.f17129a.b("AdWebView", "Forwarding \"" + str + "\" to ad template");
            }
            loadUrl(str);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f17129a.b("AdWebView", "Unable to forward to template", th);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.p pVar, com.applovin.impl.c.a aVar) {
        String a10 = a(str3, str);
        if (StringUtils.isValidString(a10)) {
            if (aVar.c() && aVar.isOpenMeasurementEnabled() && !aVar.q()) {
                a10 = pVar.ag().a(a10);
            }
            String str4 = a10;
            if (com.applovin.impl.sdk.y.a()) {
                a3.k.t("Rendering webview for VAST ad with resourceContents : ", str4, this.f17129a, "AdWebView");
            }
            loadDataWithBaseURL(str2, str4, "text/html", null, "");
            return;
        }
        String a11 = a((String) pVar.a(com.applovin.impl.sdk.c.b.eH), str);
        if (StringUtils.isValidString(a11)) {
            if (aVar.c() && aVar.isOpenMeasurementEnabled()) {
                a11 = pVar.ag().a(a11);
            }
            String str5 = a11;
            if (com.applovin.impl.sdk.y.a()) {
                a3.k.t("Rendering webview for VAST ad with resourceContents : ", str5, this.f17129a, "AdWebView");
            }
            loadDataWithBaseURL(str2, str5, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            a3.k.t("Rendering webview for VAST ad with resourceURL : ", str, this.f17129a, "AdWebView");
        }
        loadUrl(str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    public static void a(final com.applovin.impl.sdk.network.l lVar, final com.applovin.impl.sdk.p pVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.3
            @Override // java.lang.Runnable
            public void run() {
                String a10 = com.applovin.impl.sdk.network.l.this.a();
                d.c();
                if (d.f17128c == null) {
                    appLovinPostbackListener.onPostbackFailure(a10, -1);
                    return;
                }
                if (com.applovin.impl.sdk.network.l.this.c() != null) {
                    a10 = StringUtils.appendQueryParameters(a10, com.applovin.impl.sdk.network.l.this.c(), ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.dv)).booleanValue());
                }
                String l10 = a3.k.l("al_firePostback('", a10, "');");
                if (!com.applovin.impl.sdk.utils.h.c()) {
                    d.f17128c.loadUrl("javascript:" + l10);
                } else {
                    d.f17128c.evaluateJavascript(l10, null);
                }
                appLovinPostbackListener.onPostbackSuccess(a10);
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
    }
}
