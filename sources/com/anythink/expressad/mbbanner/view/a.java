package com.anythink.expressad.mbbanner.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.base.BaseWebView;
import com.anythink.expressad.atsignalcommon.base.b;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.o;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    String f10438a;

    /* renamed from: b, reason: collision with root package name */
    List<c> f10439b;

    /* renamed from: c, reason: collision with root package name */
    com.anythink.expressad.mbbanner.a.c.a f10440c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10441d = "BannerWebViewClient";

    public a(String str, List<c> list, com.anythink.expressad.mbbanner.a.c.a aVar) {
        this.f10438a = str;
        this.f10439b = list;
        this.f10440c = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            StringBuilder sb2 = new StringBuilder("javascript:");
            com.anythink.expressad.d.b.a.a();
            sb2.append(com.anythink.expressad.d.b.a.b());
            webView.evaluateJavascript(sb2.toString(), new ValueCallback<String>() { // from class: com.anythink.expressad.mbbanner.view.a.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable th) {
            o.b("BannerWebViewClient", "onPageStarted", th);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.anythink.expressad.atsignalcommon.base.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            o.d("BannerWebViewClient", "Use html to open url.");
            BaseWebView baseWebView = (BaseWebView) webView;
            if (System.currentTimeMillis() - baseWebView.lastTouchTime > com.anythink.expressad.a.b.a.f6634c) {
                c cVar = this.f10439b.get(0);
                baseWebView.getUrl();
                if (com.anythink.expressad.a.b.a.a(cVar)) {
                    return false;
                }
            }
            if (this.f10439b.size() > 1) {
                n.a().g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f10440c;
            if (aVar != null) {
                aVar.a(false, str);
            }
            return true;
        } catch (Throwable th) {
            o.b("BannerWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }
}
