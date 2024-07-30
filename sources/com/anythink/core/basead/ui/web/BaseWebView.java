package com.anythink.core.basead.ui.web;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.anythink.core.common.b.p;
import com.anythink.core.common.k.g;
import com.anythink.core.common.k.u;

/* loaded from: classes.dex */
public class BaseWebView extends WebView {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f4697b = false;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f4698a;

    public BaseWebView(Context context) {
        super(context.getApplicationContext());
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        com.anythink.core.basead.ui.a.a.a(this);
        g.a(this);
        if (!f4697b) {
            getContext();
            f4697b = true;
        }
    }

    private static void a(Context context) {
    }

    private void b() {
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f4698a) {
            return;
        }
        this.f4698a = true;
        u.a(this);
        removeAllViews();
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, p.a(getContext()).b());
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setAppCacheEnabled(true);
        getSettings().setAppCachePath(getContext().getCacheDir().getAbsolutePath());
    }
}
