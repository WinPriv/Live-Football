package com.applovin.impl.sdk;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public class ab extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        y.f("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }
}
