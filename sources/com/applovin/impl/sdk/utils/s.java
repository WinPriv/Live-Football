package com.applovin.impl.sdk.utils;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class s {
    public static void a(WebView webView) {
        if (webView == null) {
            return;
        }
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        webView.loadUrl(com.anythink.core.common.res.d.f6477a);
        webView.onPause();
        webView.destroyDrawingCache();
        webView.destroy();
    }
}
