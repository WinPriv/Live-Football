package com.applovin.impl.sdk;

import android.annotation.SuppressLint;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class ae extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private final p f18614a;

    /* renamed from: b, reason: collision with root package name */
    private final y f18615b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f18616c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<WebView> f18617d = Collections.synchronizedSet(new HashSet());

    public ae(p pVar) {
        this.f18614a = pVar;
        this.f18615b = pVar.L();
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == this.f18616c) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ae.4
                @Override // java.lang.Runnable
                public void run() {
                    ae.this.f18616c.destroy();
                    ae.this.f18616c = null;
                }
            });
            return true;
        }
        a(webView);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public WebView b(String str) {
        Utils.assertMainThread();
        WebView tryToCreateWebView = Utils.tryToCreateWebView(p.y(), "web tracker");
        if (tryToCreateWebView == null) {
            return null;
        }
        tryToCreateWebView.getSettings().setJavaScriptEnabled(true);
        tryToCreateWebView.setWebViewClient(this);
        tryToCreateWebView.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return tryToCreateWebView;
    }

    public void a(final com.applovin.impl.sdk.network.l lVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ae.1
            @Override // java.lang.Runnable
            public void run() {
                String appendQueryParameters = StringUtils.appendQueryParameters(lVar.a(), lVar.c(), ((Boolean) ae.this.f18614a.a(com.applovin.impl.sdk.c.b.dv)).booleanValue());
                if (ae.this.f18616c == null) {
                    ae aeVar = ae.this;
                    aeVar.f18616c = aeVar.b("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>");
                    if (ae.this.f18616c == null) {
                        y unused = ae.this.f18615b;
                        if (y.a()) {
                            ae.this.f18615b.e("WebTrackerManager", "Failed to fire postback since web view could not be created");
                        }
                        appLovinPostbackListener.onPostbackFailure(appendQueryParameters, -1);
                        return;
                    }
                }
                String l10 = a3.k.l("al_firePostback('", appendQueryParameters, "')");
                if (!com.applovin.impl.sdk.utils.h.c()) {
                    ae.this.f18616c.loadUrl("javascript:" + l10);
                } else {
                    ae.this.f18616c.evaluateJavascript(l10, null);
                }
                appLovinPostbackListener.onPostbackSuccess(appendQueryParameters);
            }
        });
    }

    public void a(final String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (y.a()) {
                this.f18615b.e("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (y.a()) {
                    this.f18615b.e("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ae.2
                @Override // java.lang.Runnable
                public void run() {
                    final WebView b10 = ae.this.b(str);
                    if (b10 == null) {
                        y unused = ae.this.f18615b;
                        if (y.a()) {
                            ae.this.f18615b.e("WebTrackerManager", "Failed to fire tracker since web view could not be created");
                            return;
                        }
                        return;
                    }
                    ae.this.f18617d.add(b10);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.ae.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ae.this.a(b10);
                        }
                    }, ((Integer) ae.this.f18614a.a(com.applovin.impl.sdk.c.b.f18717da)).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final WebView webView) {
        if (webView == null || !this.f18617d.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ae.3
            @Override // java.lang.Runnable
            public void run() {
                webView.destroy();
            }
        });
    }
}
