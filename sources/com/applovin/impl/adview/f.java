package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(29)
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f17144a;

    /* renamed from: b, reason: collision with root package name */
    private final WebViewRenderProcessClient f17145b = new WebViewRenderProcessClient() { // from class: com.applovin.impl.adview.f.1
        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof d) {
                com.applovin.impl.sdk.ad.e currentAd = ((d) webView).getCurrentAd();
                f.this.f17144a.X().a(currentAd).a(com.applovin.impl.sdk.d.b.C).a();
                f.this.f17144a.L();
                if (com.applovin.impl.sdk.y.a()) {
                    f.this.f17144a.L().e("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }
    };

    public f(com.applovin.impl.sdk.p pVar) {
        this.f17144a = pVar;
    }

    public WebViewRenderProcessClient a() {
        return this.f17145b;
    }
}
