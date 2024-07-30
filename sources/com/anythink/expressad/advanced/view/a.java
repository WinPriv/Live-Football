package com.anythink.expressad.advanced.view;

import a3.l;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.anythink.expressad.advanced.d.c;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.atsignalcommon.base.b;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.o;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    String f6943a;

    /* renamed from: b, reason: collision with root package name */
    com.anythink.expressad.advanced.d.a f6944b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6945c = "NativeAdvancedWebViewClient";

    /* renamed from: d, reason: collision with root package name */
    private c f6946d;

    public a(String str, com.anythink.expressad.advanced.d.a aVar, c cVar) {
        this.f6943a = str;
        this.f6944b = aVar;
        this.f6946d = cVar;
    }

    private WebResourceResponse a(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        boolean z10 = false;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && "mb-h5".equals(parse.getScheme())) {
            z10 = true;
        }
        if (!z10 || this.f6946d == null) {
            return null;
        }
        String a10 = this.f6946d.a(URLDecoder.decode(Uri.parse(str).getQueryParameter("uri")));
        try {
            if (TextUtils.isEmpty(a10)) {
                return null;
            }
            o.a("webviewclient", "relace url".concat(String.valueOf(a10)));
            if (a10.contains("127.0.0.1") || a10.startsWith("http")) {
                return null;
            }
            return new WebResourceResponse("video/mp4", com.anythink.expressad.foundation.g.a.bN, new FileInputStream(a10));
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static boolean b(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || !"mb-h5".equals(parse.getScheme())) {
            return false;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            StringBuilder sb2 = new StringBuilder("javascript:");
            com.anythink.expressad.d.b.a.a();
            sb2.append(com.anythink.expressad.d.b.a.b());
            webView.evaluateJavascript(sb2.toString(), new ValueCallback<String>() { // from class: com.anythink.expressad.advanced.view.a.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable th) {
            o.b("NativeAdvancedWebViewClient", "onPageStarted", th);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        l.C(str, "============shouldInterceptRequest:", "NativeAdvancedWebViewClient");
        return a(str);
    }

    @Override // com.anythink.expressad.atsignalcommon.base.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.anythink.expressad.a.b.a.f6634c) {
                    com.anythink.expressad.foundation.d.c cVar = ((NativeAdvancedJSBridgeImpl) windVaneWebView.getObject()).getmCampaignList().get(0);
                    windVaneWebView.getUrl();
                    if (com.anythink.expressad.a.b.a.a(cVar)) {
                        return false;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            o.d("NativeAdvancedWebViewClient", "Use html to open url.");
            com.anythink.expressad.advanced.d.a aVar = this.f6944b;
            if (aVar != null) {
                aVar.a(str);
                return true;
            }
            return true;
        } catch (Throwable th) {
            o.b("NativeAdvancedWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webResourceRequest.getUrl().toString());
    }

    public final void a() {
        if (this.f6946d != null) {
            this.f6946d = null;
        }
    }
}
