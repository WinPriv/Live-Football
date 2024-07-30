package com.anythink.expressad.splash.view;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;

/* loaded from: classes.dex */
public final class b extends com.anythink.expressad.atsignalcommon.base.b {

    /* renamed from: a, reason: collision with root package name */
    String f11198a;

    /* renamed from: b, reason: collision with root package name */
    com.anythink.expressad.splash.d.a f11199b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11200c = "SplashWebViewClient";

    public b(String str, com.anythink.expressad.splash.d.a aVar) {
        this.f11198a = str;
        this.f11199b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            StringBuilder sb2 = new StringBuilder("javascript:");
            com.anythink.expressad.d.b.a.a();
            sb2.append(com.anythink.expressad.d.b.a.b());
            webView.evaluateJavascript(sb2.toString(), new ValueCallback<String>() { // from class: com.anythink.expressad.splash.view.b.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable th) {
            o.b("SplashWebViewClient", "onPageStarted", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.base.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
            if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.anythink.expressad.a.b.a.f6634c) {
                c cVar = ((SplashJSBridgeImpl) windVaneWebView.getObject()).getmCampaignList().get(0);
                windVaneWebView.getUrl();
                if (com.anythink.expressad.a.b.a.a(cVar)) {
                    return false;
                }
            }
            o.d("SplashWebViewClient", "Use html to open url.");
            com.anythink.expressad.splash.d.a aVar = this.f11199b;
            if (aVar != null) {
                aVar.b(str);
                return true;
            }
            return true;
        } catch (Throwable th) {
            o.b("SplashWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }
}
