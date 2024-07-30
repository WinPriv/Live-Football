package com.anythink.expressad.atsignalcommon.windvane;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* loaded from: classes.dex */
public interface e {
    void loadingResourceStatus(WebView webView, int i10);

    void onPageFinished(WebView webView, String str);

    void onPageStarted(WebView webView, String str, Bitmap bitmap);

    void onProgressChanged(WebView webView, int i10);

    void onReceivedError(WebView webView, int i10, String str, String str2);

    void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    void readyState(WebView webView, int i10);

    boolean shouldOverrideUrlLoading(WebView webView, String str);
}
