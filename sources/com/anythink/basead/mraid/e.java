package com.anythink.basead.mraid;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.anythink.expressad.foundation.h.o;

/* loaded from: classes.dex */
public final class e extends com.anythink.expressad.atsignalcommon.base.b {

    /* renamed from: a, reason: collision with root package name */
    final String f4071a = com.anythink.core.c.e.f4869a;

    /* renamed from: b, reason: collision with root package name */
    String f4072b;

    /* renamed from: c, reason: collision with root package name */
    b f4073c;

    public e(String str) {
        this.f4072b = str;
    }

    private void a(b bVar) {
        this.f4073c = bVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            StringBuilder sb2 = new StringBuilder("javascript:");
            com.anythink.expressad.d.b.a.a();
            sb2.append(com.anythink.expressad.d.b.a.b());
            webView.evaluateJavascript(sb2.toString(), new ValueCallback<String>() { // from class: com.anythink.basead.mraid.e.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable th) {
            o.b(this.f4071a, "onPageStarted", th);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.anythink.expressad.atsignalcommon.base.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            if (TextUtils.equals(str, this.f4072b)) {
                return true;
            }
            o.d(this.f4071a, "Use html to open url.");
            b bVar = this.f4073c;
            if (bVar != null) {
                bVar.open(str);
            }
            return true;
        } catch (Throwable th) {
            o.b(this.f4071a, "shouldOverrideUrlLoading", th);
            return false;
        }
    }
}
