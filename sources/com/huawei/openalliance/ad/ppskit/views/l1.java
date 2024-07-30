package com.huawei.openalliance.ad.ppskit.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.f2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import java.io.File;
import java.io.FileInputStream;
import java.util.Locale;
import ka.d5;
import ka.ej;
import ka.n7;
import ka.sc;
import ka.tc;
import ka.y4;

/* loaded from: classes2.dex */
public final class l1 extends db.j {

    /* renamed from: b, reason: collision with root package name */
    public boolean f23462b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23463c = false;

    /* renamed from: d, reason: collision with root package name */
    public View f23464d;

    /* renamed from: e, reason: collision with root package name */
    public tc f23465e;
    public WebViewClient f;

    /* renamed from: g, reason: collision with root package name */
    public WebViewClient f23466g;

    /* renamed from: h, reason: collision with root package name */
    public final ej f23467h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23468i;

    /* renamed from: j, reason: collision with root package name */
    public long f23469j;

    /* renamed from: k, reason: collision with root package name */
    public d5 f23470k;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f23471s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f23472t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f23473u;

        public a(String str, int i10, String str2) {
            this.f23471s = str;
            this.f23472t = i10;
            this.f23473u = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ej ejVar = l1.this.f23467h;
            if (ejVar != null) {
                ejVar.a(this.f23471s, "onReceivedError", "mainframe:true, errorCode:" + this.f23472t + ", desc:" + this.f23473u);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ WebResourceRequest f23475s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f23476t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ WebResourceError f23477u;

        public b(WebResourceRequest webResourceRequest, boolean z10, WebResourceError webResourceError) {
            this.f23475s = webResourceRequest;
            this.f23476t = z10;
            this.f23477u = webResourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ej ejVar = l1.this.f23467h;
            if (ejVar != null) {
                String valueOf = String.valueOf(this.f23475s.getUrl());
                StringBuilder sb2 = new StringBuilder("mainframe:");
                sb2.append(String.valueOf(this.f23476t));
                sb2.append(", errorCode:");
                WebResourceError webResourceError = this.f23477u;
                sb2.append(webResourceError.getErrorCode());
                sb2.append(", desc:");
                sb2.append(String.valueOf(webResourceError.getDescription()));
                ejVar.a(valueOf, "onReceivedError", sb2.toString());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ WebResourceRequest f23479s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f23480t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ WebResourceResponse f23481u;

        public c(WebResourceRequest webResourceRequest, boolean z10, WebResourceResponse webResourceResponse) {
            this.f23479s = webResourceRequest;
            this.f23480t = z10;
            this.f23481u = webResourceResponse;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ej ejVar = l1.this.f23467h;
            if (ejVar != null) {
                String valueOf = String.valueOf(this.f23479s.getUrl());
                StringBuilder sb2 = new StringBuilder("mainframe:");
                sb2.append(String.valueOf(this.f23480t));
                sb2.append(", statusCode:");
                WebResourceResponse webResourceResponse = this.f23481u;
                sb2.append(webResourceResponse.getStatusCode());
                sb2.append(", reasonPhrase:");
                sb2.append(webResourceResponse.getReasonPhrase());
                ejVar.a(valueOf, "onReceivedHttpError", sb2.toString());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SslError f23483s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f23484t;

        public d(SslError sslError, boolean z10) {
            this.f23483s = sslError;
            this.f23484t = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ej ejVar = l1.this.f23467h;
            if (ejVar != null) {
                SslError sslError = this.f23483s;
                ejVar.a(sslError.getUrl(), "onReceivedSslError", "mainframe:" + this.f23484t + ", SSL error: " + String.valueOf(sslError));
            }
        }
    }

    public l1(ej ejVar) {
        this.f23467h = ejVar;
    }

    @Override // db.j
    public final void b(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        boolean z10;
        ej ejVar = this.f23467h;
        if (ejVar != null) {
            z10 = TextUtils.equals(y1.k(sslError.getUrl()), y1.k(ejVar.getCurrentPageUrl()));
            if (z10) {
                i();
            }
        } else {
            z10 = false;
        }
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else if (z10) {
            f(webView, true);
        }
        d2.a(new d(sslError, z10));
    }

    public final WebResourceResponse c(Context context, String str) {
        return new WebResourceResponse((String) f2.f22848c.get(f2.c(str).toLowerCase(Locale.ENGLISH)), "UTF-8", new FileInputStream(new File(d(context).h(context, d5.f(str)))));
    }

    public final d5 d(Context context) {
        if (this.f23470k == null) {
            this.f23470k = y4.a(context, "webview_preload");
        }
        return this.f23470k;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.doUpdateVisitedHistory(webView, str, z10);
        } else {
            super.doUpdateVisitedHistory(webView, str, z10);
        }
    }

    public final void e(View view, boolean z10) {
        this.f23464d = view;
        this.f23468i = z10;
        if (z1.D()) {
            n7.e("PPSWebViewClient", "rtl language, set rtl direction.");
            if (z10) {
                view.setRotation(180.0f);
            } else {
                view.setLayoutDirection(1);
            }
        }
    }

    public final void f(WebView webView, boolean z10) {
        if (z10) {
            webView.loadUrl(com.anythink.core.common.res.d.f6477a);
            ej ejVar = this.f23467h;
            if (ejVar != null) {
                ejVar.l();
            }
        }
    }

    public final void g(tc tcVar) {
        this.f23465e = tcVar;
    }

    public final boolean h(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            if (com.huawei.openalliance.ad.ppskit.handlers.l.d(context).b(y1.u(str))) {
                n7.e("PPSWebViewClient", "url is blocked");
                tc tcVar = this.f23465e;
                if (tcVar != null) {
                    ((sc) tcVar).x();
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        n7.e("PPSWebViewClient", "processError");
        this.f23463c = true;
        View view = this.f23464d;
        if (view != null && view.getVisibility() == 0) {
            this.f23464d.setVisibility(8);
            if (this.f23468i) {
                this.f23464d.setProgress(0);
            } else {
                ((HiProgressBar) this.f23464d).a();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onFormResubmission(webView, message, message2);
        } else {
            super.onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onLoadResource(webView, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public final void onPageCommitVisible(WebView webView, String str) {
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(webView, str);
        } else {
            super.onPageCommitVisible(webView, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageFinished(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            android.webkit.WebSettings r0 = r9.getSettings()
            boolean r0 = r0.getLoadsImagesAutomatically()
            r1 = 1
            if (r0 != 0) goto L12
            android.webkit.WebSettings r0 = r9.getSettings()
            r0.setLoadsImagesAutomatically(r1)
        L12:
            android.view.View r0 = r8.f23464d
            if (r0 == 0) goto L30
            r2 = 8
            r0.setVisibility(r2)
            boolean r0 = r8.f23468i
            r2 = 100
            if (r0 == 0) goto L29
            android.view.View r0 = r8.f23464d
            com.huawei.uikit.phone.hwprogressbar.widget.HwProgressBar r0 = (com.huawei.uikit.phone.hwprogressbar.widget.HwProgressBar) r0
            r0.setProgress(r2, r1)
            goto L30
        L29:
            android.view.View r0 = r8.f23464d
            com.huawei.openalliance.ad.ppskit.views.HiProgressBar r0 = (com.huawei.openalliance.ad.ppskit.views.HiProgressBar) r0
            r0.setProgress(r2)
        L30:
            ka.tc r0 = r8.f23465e
            if (r0 == 0) goto L85
            r2 = 0
            if (r0 != 0) goto L39
        L37:
            r0 = r2
            goto L53
        L39:
            if (r10 == 0) goto L37
            java.lang.String r0 = "about:blank"
            boolean r0 = android.text.TextUtils.equals(r0, r10)
            if (r0 == 0) goto L44
            goto L37
        L44:
            boolean r0 = r8.f23463c
            if (r0 == 0) goto L4b
            r8.f23463c = r2
            goto L37
        L4b:
            boolean r0 = r8.f23462b
            if (r0 == 0) goto L50
            goto L37
        L50:
            r8.f23462b = r1
            r0 = r1
        L53:
            if (r0 == 0) goto L85
            boolean r0 = ka.n7.d()
            if (r0 == 0) goto L7e
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r0[r2] = r5
            java.lang.String r5 = "PPSWebViewClient"
            java.lang.String r6 = "onPageFinished, load finish time is: %d"
            ka.n7.c(r5, r6, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            long r6 = r8.f23469j
            long r3 = r3 - r6
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0[r2] = r1
            java.lang.String r1 = "onPageFinished, load time is: %d"
            ka.n7.c(r5, r1, r0)
        L7e:
            ka.tc r0 = r8.f23465e
            ka.sc r0 = (ka.sc) r0
            r0.w()
        L85:
            android.webkit.WebViewClient r0 = r8.f23466g
            if (r0 == 0) goto L8c
            r0.onPageFinished(r9, r10)
        L8c:
            android.webkit.WebViewClient r0 = r8.f
            if (r0 == 0) goto L93
            r0.onPageFinished(r9, r10)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.l1.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Context context = webView.getContext();
        d(context);
        long currentTimeMillis = System.currentTimeMillis();
        this.f23469j = currentTimeMillis;
        n7.c("PPSWebViewClient", "onPageFinished, load start time is: %d", Long.valueOf(currentTimeMillis));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ej ejVar = this.f23467h;
        if (ejVar != null) {
            ejVar.b(str);
        }
        if (Uri.parse(str) != null) {
            String u2 = y1.u(str);
            if (!TextUtils.isEmpty(u2) && com.huawei.openalliance.ad.ppskit.handlers.l.d(context).b(u2)) {
                if (this.f23465e != null) {
                    n7.g("PPSWebViewClient", "url is blocked");
                    ((sc) this.f23465e).x();
                }
                if (ejVar != null) {
                    ejVar.m();
                    return;
                }
                return;
            }
        }
        WebViewClient webViewClient = this.f23466g;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
        WebViewClient webViewClient2 = this.f;
        if (webViewClient2 != null) {
            webViewClient2.onPageStarted(webView, str, bitmap);
            return;
        }
        View view = this.f23464d;
        if (view != null) {
            view.setVisibility(0);
            if (this.f23468i) {
                this.f23464d.setProgress(0);
            } else {
                ((HiProgressBar) this.f23464d).a();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        n7.h("PPSWebViewClient", "onReceivedError, errorCode: %d description: %s", Integer.valueOf(i10), str);
        i();
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i10, str, str2);
        } else {
            f(webView, true);
        }
        d2.a(new a(str2, i10, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        boolean isForMainFrame = webResourceRequest.isForMainFrame();
        n7.g("PPSWebViewClient", "onReceivedHttpError, isForMainFrame:" + isForMainFrame + ", ReasonPhrase:" + webResourceResponse.getReasonPhrase());
        if (isForMainFrame) {
            i();
        }
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else if (isForMainFrame) {
            f(webView, isForMainFrame);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
        d2.a(new c(webResourceRequest, isForMainFrame, webResourceResponse));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f10) {
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f, f10);
        } else {
            super.onScaleChanged(webView, f, f10);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        String f = d5.f(uri);
        n7.c("PPSWebViewClient", "url is : %s, diskCache url is : %s", y1.j(uri), y1.j(f));
        Context context = webView.getContext();
        if (TextUtils.isEmpty(uri) || context == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        try {
        } catch (Exception e10) {
            n7.h("PPSWebViewClient", "Read cache file met error: %s", e10.getClass().getSimpleName());
        }
        if (d(context).l(context, f) && f2.b(uri)) {
            n7.c("PPSWebViewClient", "exist cacheFile. url: %s", y1.j(uri));
            return c(context, uri);
        }
        n7.c("PPSWebViewClient", "not exist cacheFile. url: %s", y1.j(uri));
        WebViewClient webViewClient = this.f;
        return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        tc tcVar;
        ej ejVar = this.f23467h;
        if (ejVar != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            if (h(webResourceRequest.getUrl().toString(), webView.getContext())) {
                return true;
            }
            ejVar.b(webResourceRequest.getUrl().toString());
        }
        WebViewClient webViewClient = this.f23466g;
        if (webViewClient != null && this.f != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest) || this.f.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        if (webViewClient != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        if (webResourceRequest != null && (tcVar = this.f23465e) != null) {
            if (((sc) tcVar).u(webView, webResourceRequest.getUrl())) {
                return true;
            }
        }
        WebViewClient webViewClient2 = this.f;
        return webViewClient2 != null ? webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest) : super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean isForMainFrame = webResourceRequest.isForMainFrame();
        n7.g("PPSWebViewClient", "onReceivedError, isForMainFrame:" + isForMainFrame + ", description:" + ((Object) webResourceError.getDescription()));
        if (isForMainFrame) {
            i();
        }
        WebViewClient webViewClient = this.f;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        } else if (isForMainFrame) {
            f(webView, isForMainFrame);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
        d2.a(new b(webResourceRequest, isForMainFrame, webResourceError));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        ej ejVar = this.f23467h;
        if (ejVar != null) {
            if (h(str, webView.getContext())) {
                return true;
            }
            ejVar.b(str);
        }
        WebViewClient webViewClient = this.f23466g;
        if (webViewClient != null && this.f != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, str) || this.f.shouldOverrideUrlLoading(webView, str);
        }
        if (webViewClient != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, str);
        }
        try {
            tc tcVar = this.f23465e;
            if (tcVar != null) {
                if (((sc) tcVar).u(webView, Uri.parse(str))) {
                    return true;
                }
            }
        } catch (Exception unused) {
            n7.g("PPSWebViewClient", "shouldOverrideUrlLoading Exception");
        }
        WebViewClient webViewClient2 = this.f;
        return webViewClient2 != null ? webViewClient2.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        String f = d5.f(str);
        n7.c("PPSWebViewClient", "url is : %s, diskCache url is : %s", y1.j(str), y1.j(f));
        Context context = webView.getContext();
        if (TextUtils.isEmpty(str) || context == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        try {
        } catch (Exception e10) {
            n7.j("PPSWebViewClient", "Read cache file met error: %s", e10.getClass().getSimpleName());
        }
        if (d(context).l(context, f) && f2.b(str)) {
            n7.c("PPSWebViewClient", "exist cacheFile. url: %s", y1.j(str));
            return c(context, str);
        }
        n7.c("PPSWebViewClient", "not exist cacheFile. url: %s", y1.j(str));
        WebViewClient webViewClient = this.f;
        return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, str) : super.shouldInterceptRequest(webView, str);
    }
}
