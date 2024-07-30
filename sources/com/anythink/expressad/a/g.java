package com.anythink.expressad.a;

import a3.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anythink.expressad.foundation.h.o;
import com.huawei.openalliance.ad.constant.w;
import java.util.HashMap;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static long f6684a = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final String f6685d = "g";

    /* renamed from: p, reason: collision with root package name */
    private static final int f6686p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f6687q = 2;

    /* renamed from: r, reason: collision with root package name */
    private static final int f6688r = 0;

    /* renamed from: b, reason: collision with root package name */
    boolean f6689b;

    /* renamed from: c, reason: collision with root package name */
    boolean f6690c;

    /* renamed from: e, reason: collision with root package name */
    private int f6691e;
    private int f;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.d.a f6693h;

    /* renamed from: i, reason: collision with root package name */
    private a f6694i;

    /* renamed from: j, reason: collision with root package name */
    private String f6695j;

    /* renamed from: k, reason: collision with root package name */
    private String f6696k;

    /* renamed from: l, reason: collision with root package name */
    private WebView f6697l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6698m;

    /* renamed from: n, reason: collision with root package name */
    private String f6699n;
    private int o;

    /* renamed from: t, reason: collision with root package name */
    private boolean f6701t;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6700s = false;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f6702u = new Runnable() { // from class: com.anythink.expressad.a.g.4
        @Override // java.lang.Runnable
        public final void run() {
            g.n(g.this);
            g.this.o = 1;
            o.d(g.f6685d, "js超时！超时上限：" + g.this.f + "ms");
            g.p(g.this);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private final Runnable f6703v = new Runnable() { // from class: com.anythink.expressad.a.g.5
        @Override // java.lang.Runnable
        public final void run() {
            g.n(g.this);
            g.this.o = 2;
            o.d(g.f6685d, "http超时！超时上限：" + g.this.f6691e + "ms");
            g.p(g.this);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private Handler f6692g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, String str3);

        boolean a();

        boolean a(String str);

        boolean b(String str);
    }

    public g(boolean z10) {
        this.f6691e = com.anythink.expressad.exoplayer.d.f7613a;
        this.f = w.Z;
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.a b10 = com.anythink.expressad.d.b.b();
        this.f6693h = b10;
        if (b10 == null) {
            com.anythink.expressad.d.b.a();
            this.f6693h = com.anythink.expressad.d.b.c();
        }
        this.f6698m = this.f6693h.v();
        if (z10) {
            this.f6691e = (int) this.f6693h.q();
            this.f = (int) this.f6693h.q();
        } else {
            this.f6691e = (int) this.f6693h.r();
            this.f = (int) this.f6693h.r();
        }
    }

    private void c() {
        synchronized (f6685d) {
            try {
                f();
                this.f6697l.destroy();
                a aVar = this.f6694i;
                if (aVar != null) {
                    aVar.a(this.f6695j, this.f6699n);
                }
            } catch (Exception unused) {
                o.d(f6685d, "webview colse to failed");
            } catch (Throwable unused2) {
                o.d(f6685d, "webview colse to failed");
            }
        }
    }

    public static /* synthetic */ boolean e(g gVar) {
        gVar.f6701t = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        j();
        h();
    }

    public static /* synthetic */ void m(g gVar) {
        gVar.j();
        gVar.f6692g.postDelayed(gVar.f6702u, gVar.f);
    }

    public static /* synthetic */ boolean n(g gVar) {
        gVar.f6700s = true;
        return true;
    }

    public static /* synthetic */ void p(g gVar) {
        synchronized (f6685d) {
            try {
                gVar.f();
                gVar.f6697l.destroy();
                a aVar = gVar.f6694i;
                if (aVar != null) {
                    aVar.a(gVar.f6695j, gVar.f6699n);
                }
            } catch (Exception unused) {
                o.d(f6685d, "webview colse to failed");
            } catch (Throwable unused2) {
                o.d(f6685d, "webview colse to failed");
            }
        }
    }

    private void b() {
        synchronized (f6685d) {
            try {
                f();
                a aVar = this.f6694i;
                if (aVar != null) {
                    aVar.a(this.f6695j, this.f6699n);
                }
            } catch (Exception unused) {
                o.d(f6685d, "webview colse to failed");
            } catch (Throwable unused2) {
                o.d(f6685d, "webview colse to failed");
            }
        }
    }

    private void d() {
        h();
        this.f6692g.postDelayed(this.f6703v, this.f6691e);
    }

    private void e() {
        j();
        this.f6692g.postDelayed(this.f6702u, this.f);
    }

    private void g() {
        this.f6692g.postDelayed(this.f6703v, this.f6691e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f6692g.removeCallbacks(this.f6703v);
    }

    private void i() {
        this.f6692g.postDelayed(this.f6702u, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f6692g.removeCallbacks(this.f6702u);
    }

    public static /* synthetic */ void f(g gVar) {
        gVar.h();
        gVar.f6692g.postDelayed(gVar.f6703v, gVar.f6691e);
    }

    public final void a(String str, String str2, String str3, Context context, String str4, String str5, a aVar) {
        if (aVar != null) {
            this.f6696k = str5;
            this.f6695j = str4;
            this.f6694i = aVar;
            a(str, str2, str3, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public static /* synthetic */ void c(g gVar) {
        synchronized (f6685d) {
            try {
                gVar.f();
                a aVar = gVar.f6694i;
                if (aVar != null) {
                    aVar.a(gVar.f6695j, gVar.f6699n);
                }
            } catch (Exception unused) {
                o.d(f6685d, "webview colse to failed");
            } catch (Throwable unused2) {
                o.d(f6685d, "webview colse to failed");
            }
        }
    }

    public final void a(String str, String str2, String str3, Context context, String str4, a aVar) {
        if (aVar != null) {
            this.f6695j = str4;
            this.f6694i = aVar;
            a(str, str2, str3, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(final String str, final String str2, final String str3, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str2, str3, context, this.f6695j);
        } else {
            this.f6692g.post(new Runnable() { // from class: com.anythink.expressad.a.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    g gVar = g.this;
                    gVar.a(str2, str3, context, gVar.f6695j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f6696k)) {
                this.f6697l.getSettings().setDefaultTextEncodingName(com.anythink.expressad.foundation.g.a.bN);
                this.f = 2000;
                this.f6691e = 2000;
                o.b(f6685d, this.f6696k);
                this.f6697l.loadDataWithBaseURL(str3, this.f6696k, "*/*", com.anythink.expressad.foundation.g.a.bN, str3);
                return;
            }
            if (this.f6698m) {
                HashMap hashMap = new HashMap();
                if (this.f6697l.getUrl() != null) {
                    hashMap.put("Referer", this.f6697l.getUrl());
                }
                this.f6697l.loadUrl(str3, hashMap);
                return;
            }
            this.f6697l.loadUrl(str3);
        } catch (Throwable th) {
            try {
                a aVar = this.f6694i;
                if (aVar != null) {
                    aVar.a(this.f6695j, th.getMessage(), this.f6699n);
                }
            } catch (Exception unused) {
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.f6697l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f6697l.getSettings().setCacheMode(2);
        this.f6697l.getSettings().setLoadsImagesAutomatically(false);
        this.f6697l.setWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.a.g.2
            private boolean a() {
                g gVar = g.this;
                if (!gVar.f6689b && !gVar.f6690c) {
                    return false;
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str3) {
                super.onPageFinished(webView2, str3);
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str3, Bitmap bitmap) {
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                    boolean z10 = false;
                    if (g.this.f6701t) {
                        g.this.o = 0;
                        g.c(g.this);
                        return;
                    }
                    g.this.f6690c = false;
                    if (webView2.getTag() == null) {
                        webView2.setTag("has_first_started");
                    } else {
                        g.this.f6689b = true;
                    }
                    synchronized (g.f6685d) {
                        String str4 = "加载页面-开始：";
                        g gVar = g.this;
                        if (gVar.f6689b || gVar.f6690c) {
                            z10 = true;
                        }
                        if (z10) {
                            str4 = "加载页面-开始：（重定向）";
                        }
                        if (URLUtil.isHttpsUrl(str3)) {
                            o.d(g.f6685d, str4 + str3);
                        } else {
                            o.b(g.f6685d, str4 + str3);
                        }
                        g.this.f6695j = str3;
                        if (g.this.f6694i != null && g.this.f6694i.a(str3)) {
                            g.e(g.this);
                            g.c(g.this);
                        } else {
                            g.f(g.this);
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i10, String str3, String str4) {
                String str5 = g.f6685d;
                StringBuilder n10 = k.n("onReceivedError: errno = ", i10, ", url: ");
                n10.append(webView2.getUrl());
                n10.append(",\n onReceivedError：, description: ");
                n10.append(str3);
                n10.append(", failingUrl: ");
                n10.append(str4);
                o.b(str5, n10.toString());
                synchronized (g.f6685d) {
                    g.e(g.this);
                    g.this.f();
                    g.c(g.this);
                }
                if (g.this.f6694i != null) {
                    g.this.f6694i.a(webView2.getUrl(), str3, g.this.f6699n);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    o.a(g.f6685d, "onReceivedSslError IS_SP_CBT_CF:" + com.anythink.expressad.a.f6570q);
                    if (com.anythink.expressad.a.f6570q && sslErrorHandler != null) {
                        sslErrorHandler.cancel();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        TextUtils.isEmpty(str);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str3) {
                synchronized (g.f6685d) {
                    o.a(g.f6685d, "override js跳转：".concat(String.valueOf(str3)));
                    g gVar = g.this;
                    gVar.f6690c = true;
                    gVar.j();
                    if (g.this.f6701t) {
                        g.this.h();
                        g.c(g.this);
                        return true;
                    }
                    g.this.f6695j = str3;
                    if (g.this.f6694i != null && g.this.f6694i.b(str3)) {
                        g.e(g.this);
                        g.this.h();
                        g.c(g.this);
                        return true;
                    }
                    if (g.this.f6698m) {
                        HashMap hashMap = new HashMap();
                        if (g.this.f6697l.getUrl() != null) {
                            hashMap.put("Referer", g.this.f6697l.getUrl());
                        }
                        g.this.f6697l.loadUrl(str3, hashMap);
                    } else {
                        g.this.f6697l.loadUrl(str3);
                    }
                    return true;
                }
            }
        });
        this.f6697l.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.expressad.a.g.3
            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView2, String str3, String str4, String str5, JsPromptResult jsPromptResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i10) {
                if (i10 == 100) {
                    try {
                        o.b(g.f6685d, "加载页面-进度完成：" + webView2.getUrl());
                        webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!g.this.f6701t) {
                            g gVar = g.this;
                            if (!gVar.f6690c) {
                                g.m(gVar);
                            }
                        }
                        if (g.this.f6694i != null) {
                            a aVar = g.this.f6694i;
                            webView2.getUrl();
                            aVar.a();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }
}
