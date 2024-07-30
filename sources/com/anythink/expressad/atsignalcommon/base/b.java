package com.anythink.expressad.atsignalcommon.base;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private a f6968a;

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.atsignalcommon.windvane.e f6969b;

    public final void a(a aVar) {
        this.f6968a = aVar;
    }

    public final a b() {
        return this.f6968a;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        com.anythink.expressad.atsignalcommon.windvane.e eVar = this.f6969b;
        if (eVar != null) {
            eVar.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        com.anythink.expressad.atsignalcommon.windvane.e eVar = this.f6969b;
        if (eVar != null) {
            eVar.onReceivedError(webView, i10, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.anythink.expressad.atsignalcommon.windvane.e eVar = this.f6969b;
        if (eVar != null) {
            eVar.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a aVar = this.f6968a;
        if (aVar != null && aVar.a(str)) {
            return true;
        }
        com.anythink.expressad.atsignalcommon.windvane.e eVar = this.f6969b;
        if (eVar != null) {
            eVar.shouldOverrideUrlLoading(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final void a(com.anythink.expressad.atsignalcommon.windvane.e eVar) {
        this.f6969b = eVar;
    }
}
