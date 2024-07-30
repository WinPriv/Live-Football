package com.anythink.expressad.atsignalcommon.a;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.e;
import com.anythink.expressad.foundation.h.o;

/* loaded from: classes.dex */
public class b implements e {

    /* renamed from: d, reason: collision with root package name */
    protected static final String f6949d = "WindVaneWebView";

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void loadingResourceStatus(WebView webView, int i10) {
        o.a(f6949d, "loadingResourceStatus");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onPageFinished(WebView webView, String str) {
        o.a(f6949d, "onPageFinished");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        o.a(f6949d, "onPageStarted");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onProgressChanged(WebView webView, int i10) {
        o.a(f6949d, "onProgressChanged");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        o.a(f6949d, "onReceivedError");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        o.a(f6949d, "onReceivedSslError");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void readyState(WebView webView, int i10) {
        o.a(f6949d, "readyState");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        o.a(f6949d, "shouldOverrideUrlLoading");
        return true;
    }
}
