package com.huawei.secure.android.common.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Arrays;
import java.util.Map;
import mb.b;

/* loaded from: classes2.dex */
public class SafeWebView extends WebView {

    /* renamed from: s, reason: collision with root package name */
    public String f24224s;

    /* renamed from: t, reason: collision with root package name */
    public String[] f24225t;

    /* renamed from: u, reason: collision with root package name */
    public String[] f24226u;

    /* renamed from: v, reason: collision with root package name */
    public String[] f24227v;

    public String getDefaultErrorPage() {
        return this.f24224s;
    }

    public b getWebViewLoadCallBack() {
        return null;
    }

    @TargetApi(9)
    @Deprecated
    public String[] getWhitelist() {
        String[] strArr = this.f24225t;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String[] getWhitelistNotMatchSubDomain() {
        String[] strArr = this.f24226u;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public String[] getWhitelistNotMathcSubDomain() {
        String[] strArr = this.f24226u;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public String[] getWhitelistWithPath() {
        String[] strArr = this.f24227v;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (URLUtil.isHttpUrl(str)) {
            Log.e("SafeWebView", "loadDataWithBaseURL: http url , not safe");
            if (!TextUtils.isEmpty(this.f24224s)) {
                super.loadDataWithBaseURL(this.f24224s, str2, str3, str4, str5);
                return;
            } else {
                getWebViewLoadCallBack();
                return;
            }
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        if (URLUtil.isHttpUrl(str)) {
            Log.e("SafeWebView", "loadUrl: http url , not safe");
            if (!TextUtils.isEmpty(this.f24224s)) {
                super.loadUrl(this.f24224s);
                return;
            } else {
                getWebViewLoadCallBack();
                return;
            }
        }
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView
    public final void postUrl(String str, byte[] bArr) {
        if (URLUtil.isHttpUrl(str)) {
            Log.e("SafeWebView", "postUrl: http url , not safe");
            if (!TextUtils.isEmpty(this.f24224s)) {
                super.postUrl(this.f24224s, bArr);
                return;
            } else {
                getWebViewLoadCallBack();
                return;
            }
        }
        super.postUrl(str, bArr);
    }

    public void setDefaultErrorPage(String str) {
        this.f24224s = str;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new a(webViewClient));
    }

    @TargetApi(9)
    @Deprecated
    public void setWhitelist(String[] strArr) {
        String[] strArr2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        this.f24225t = strArr2;
    }

    public void setWhitelistNotMatchSubDomain(String[] strArr) {
        String[] strArr2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        this.f24226u = strArr2;
    }

    @Deprecated
    public void setWhitelistNotMathcSubDomain(String[] strArr) {
        String[] strArr2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        this.f24226u = strArr2;
    }

    @TargetApi(9)
    public void setWhitelistWithPath(String[] strArr) {
        String[] strArr2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        this.f24227v = strArr2;
    }

    /* loaded from: classes2.dex */
    public final class a extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public final WebViewClient f24228a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f24229b = true;

        public a(WebViewClient webViewClient) {
            this.f24228a = webViewClient;
        }

        @Override // android.webkit.WebViewClient
        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z10);
            } else {
                super.doUpdateVisitedHistory(webView, str, z10);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onFormResubmission(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                super.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            } else {
                super.onPageFinished(webView, str);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x01db A[LOOP:2: B:101:0x0132->B:117:0x01db, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:118:0x01d9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00ca A[LOOP:0: B:42:0x0053->B:63:0x00ca, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01d9 A[SYNTHETIC] */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onPageStarted(android.webkit.WebView r18, java.lang.String r19, android.graphics.Bitmap r20) {
            /*
                Method dump skipped, instructions count: 564
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.webview.SafeWebView.a.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i10, str, str2);
            } else {
                super.onReceivedError(webView, i10, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } else {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(12)
        public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
            } else {
                super.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onScaleChanged(WebView webView, float f, float f10) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f, f10);
            } else {
                super.onScaleChanged(webView, f, f10);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onTooManyRedirects(webView, message, message2);
            } else {
                super.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
            }
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, str);
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(11)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, str);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f24228a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map<String, String> map) {
        if (URLUtil.isHttpUrl(str)) {
            Log.e("SafeWebView", "loadUrl: http url , not safe");
            if (!TextUtils.isEmpty(this.f24224s)) {
                super.loadUrl(this.f24224s, map);
                return;
            } else {
                getWebViewLoadCallBack();
                return;
            }
        }
        super.loadUrl(str, map);
    }

    public void setWebViewLoadCallBack(b bVar) {
    }
}
