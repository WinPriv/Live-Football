package com.anythink.expressad.atsignalcommon.a;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.expressad.foundation.h.o;
import com.applovin.impl.sdk.utils.JsonUtils;

/* loaded from: classes.dex */
public class a implements com.anythink.expressad.atsignalcommon.windvane.c {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f6948a = "RVWindVaneWebView";

    @Override // com.anythink.expressad.atsignalcommon.windvane.c
    public void a(Object obj) {
        o.a(f6948a, "getEndScreenInfo");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void loadingResourceStatus(WebView webView, int i10) {
        o.a(f6948a, "loadingResourceStatus");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onPageFinished(WebView webView, String str) {
        o.a(f6948a, "onPageFinished");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        o.a(f6948a, "onPageStarted");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onProgressChanged(WebView webView, int i10) {
        o.a(f6948a, "onProgressChanged");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        o.a(f6948a, "onReceivedError");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        o.a(f6948a, "onReceivedSslError");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void readyState(WebView webView, int i10) {
        o.a(f6948a, "readyState");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        o.a(f6948a, "shouldOverrideUrlLoading");
        return true;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.c
    public void a(String str, int i10, int i11) {
        o.a(f6948a, "loadAds");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.c
    public String a(String str) {
        o.a(f6948a, "getFileInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.c
    public void a(Object obj, String str) {
        o.a(f6948a, "operateComponent");
    }
}
