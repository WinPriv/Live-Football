package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.sdk.ab;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class w extends ab {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f17223a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<a> f17224b;

    /* loaded from: classes.dex */
    public interface a {
        void a(v vVar);

        void b(v vVar);

        void c(v vVar);
    }

    public w(com.applovin.impl.sdk.p pVar) {
        this.f17223a = pVar.L();
    }

    public void a(WeakReference<a> weakReference) {
        this.f17224b = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, str);
        return true;
    }

    private void a(WebView webView, String str) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f17223a.c("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof v)) {
            return;
        }
        v vVar = (v) webView;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        a aVar = this.f17224b.get();
        if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.a(vVar);
                return;
            }
            if ("/close_ad".equals(path)) {
                aVar.b(vVar);
                return;
            }
            if ("/skip_ad".equals(path)) {
                aVar.c(vVar);
                return;
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f17223a.d("WebViewButtonClient", "Unknown URL: ".concat(str));
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f17223a.d("WebViewButtonClient", "Path: " + path);
            }
        }
    }
}
