package com.anythink.core.basead.ui.web;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anythink.core.common.e.am;
import com.anythink.core.common.res.d;
import org.json.JSONArray;

/* loaded from: classes.dex */
final class a extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private WebLandPageActivity f4726a;

    public a(WebLandPageActivity webLandPageActivity) {
        this.f4726a = webLandPageActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f4726a.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        WebProgressBarView a10 = this.f4726a.a();
        if (a10 != null) {
            a10.setVisibility(0);
            a10.setProgress(0);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.f4726a.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && !d.f6477a.equals(str)) {
            WebLandPageActivity webLandPageActivity = this.f4726a;
            if (webLandPageActivity != null) {
                if (webLandPageActivity.f4701b == null) {
                    webLandPageActivity.f4701b = new JSONArray();
                }
                webLandPageActivity.f4701b.put(str);
            }
            am a10 = com.anythink.core.basead.a.a.a(webView.getContext(), str);
            if (a10.f5548m) {
                WebLandPageActivity webLandPageActivity2 = this.f4726a;
                if (webLandPageActivity2 != null) {
                    webLandPageActivity2.a(a10);
                }
                return true;
            }
            WebLandPageActivity webLandPageActivity3 = this.f4726a;
            if (webLandPageActivity3 != null) {
                webLandPageActivity3.a(a10);
            }
            am a11 = com.anythink.core.basead.a.a.a(str);
            WebLandPageActivity webLandPageActivity4 = this.f4726a;
            if (webLandPageActivity4 != null) {
                webLandPageActivity4.a(a11);
            }
            if (!TextUtils.equals(a11.o, str)) {
                webView.loadUrl(a11.o);
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
    }
}
