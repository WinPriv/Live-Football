package db;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ka.bj;
import ka.n7;

/* loaded from: classes2.dex */
public final class g extends j {

    /* renamed from: b, reason: collision with root package name */
    public final bj f27590b;

    /* renamed from: c, reason: collision with root package name */
    public WebViewClient f27591c;

    public g(bj bjVar) {
        this.f27590b = bjVar;
    }

    @Override // db.j
    public final void a(WebView webView) {
        n7.e("PureWebViewClient", "onReceivedError");
        webView.loadUrl(com.anythink.core.common.res.d.f6477a);
        bj bjVar = this.f27590b;
        if (bjVar != null) {
            bjVar.l();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (!webView.getSettings().getLoadsImagesAutomatically()) {
            webView.getSettings().setLoadsImagesAutomatically(true);
        }
        n7.e("PureWebViewClient", "onPageFinished");
        this.f27590b.a();
        WebViewClient webViewClient = this.f27591c;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        n7.c("PureWebViewClient", "onPageStarted url=%s", str);
        WebViewClient webViewClient = this.f27591c;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        n7.c("PureWebViewClient", "onReceivedError description:%s", str);
        a(webView);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f27591c;
        return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest) : super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        n7.c("PureWebViewClient", "onReceivedError error:%s", webResourceError.getDescription());
        a(webView);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClient = this.f27591c;
        return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
    }
}
