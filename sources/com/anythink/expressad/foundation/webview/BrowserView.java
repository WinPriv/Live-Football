package com.anythink.expressad.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class BrowserView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10228a = "BrowserView";

    /* renamed from: b, reason: collision with root package name */
    private String f10229b;

    /* renamed from: c, reason: collision with root package name */
    private ProgressBar f10230c;

    /* renamed from: d, reason: collision with root package name */
    private WebView f10231d;

    /* renamed from: e, reason: collision with root package name */
    private ToolBar f10232e;
    private a f;

    /* renamed from: g, reason: collision with root package name */
    private c f10233g;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        boolean a(WebView webView, String str);

        void b();
    }

    public BrowserView(Context context, c cVar) {
        super(context);
        this.f10233g = cVar;
        init();
    }

    public void destroy() {
        WebView webView = this.f10231d;
        if (webView != null) {
            webView.stopLoading();
            this.f10231d.setWebViewClient(null);
            this.f10231d.destroy();
            removeAllViews();
        }
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f10230c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f10231d == null) {
                this.f10231d = b();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f10231d.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            o.b(f10228a, "webview is error", th);
        }
        this.f10232e = new ToolBar(getContext());
        this.f10232e.setLayoutParams(new LinearLayout.LayoutParams(-1, t.b(getContext(), 40.0f)));
        this.f10232e.setBackgroundColor(-1);
        addView(this.f10230c);
        WebView webView = this.f10231d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f10232e);
        this.f10230c.initResource(true);
        this.f10232e.getItem("backward").setEnabled(false);
        this.f10232e.getItem("forward").setEnabled(false);
        this.f10232e.setOnItemClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.webview.BrowserView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                if (BrowserView.this.f10231d != null) {
                    BrowserView.this.f10231d.stopLoading();
                }
                String str = (String) view.getTag();
                boolean z11 = false;
                if (TextUtils.equals(str, "backward")) {
                    BrowserView.this.f10232e.getItem("forward").setEnabled(true);
                    if (BrowserView.this.f10231d != null && BrowserView.this.f10231d.canGoBack()) {
                        BrowserView.this.f10231d.goBack();
                    }
                    View item = BrowserView.this.f10232e.getItem("backward");
                    if (BrowserView.this.f10231d != null && BrowserView.this.f10231d.canGoBack()) {
                        z11 = true;
                    }
                    item.setEnabled(z11);
                    return;
                }
                if (TextUtils.equals(str, "forward")) {
                    BrowserView.this.f10232e.getItem("backward").setEnabled(true);
                    if (BrowserView.this.f10231d != null && BrowserView.this.f10231d.canGoForward()) {
                        BrowserView.this.f10231d.goForward();
                    }
                    View item2 = BrowserView.this.f10232e.getItem("forward");
                    if (BrowserView.this.f10231d != null && BrowserView.this.f10231d.canGoForward()) {
                        z11 = true;
                    }
                    item2.setEnabled(z11);
                    return;
                }
                if (TextUtils.equals(str, "refresh")) {
                    View item3 = BrowserView.this.f10232e.getItem("backward");
                    if (BrowserView.this.f10231d != null && BrowserView.this.f10231d.canGoBack()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    item3.setEnabled(z10);
                    View item4 = BrowserView.this.f10232e.getItem("forward");
                    if (BrowserView.this.f10231d != null && BrowserView.this.f10231d.canGoForward()) {
                        z11 = true;
                    }
                    item4.setEnabled(z11);
                    if (BrowserView.this.f10231d != null) {
                        BrowserView.this.f10231d.loadUrl(BrowserView.this.f10229b);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, "exits") && BrowserView.this.f != null) {
                    BrowserView.this.f.a();
                }
            }
        });
    }

    public void loadUrl(String str) {
        WebView webView = this.f10231d;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setListener(a aVar) {
        this.f = aVar;
    }

    public void setWebView(WebView webView) {
        this.f10231d = webView;
    }

    private WebView b() {
        WebChromeClient webChromeClient;
        WebView webView = new WebView(getContext());
        try {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setAppCacheEnabled(true);
            settings.setAppCacheMaxSize(5242880L);
            settings.setAllowFileAccess(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    settings.setSafeBrowsingEnabled(false);
                } catch (Throwable th) {
                    o.d(f10228a, th.getMessage());
                }
            }
            settings.setMediaPlaybackRequiresUserGesture(false);
            try {
                settings.setAllowUniversalAccessFromFileURLs(true);
            } catch (Throwable th2) {
                o.d(f10228a, th2.getMessage());
            }
            try {
                settings.setMixedContentMode(0);
            } catch (Exception e10) {
                o.d(f10228a, e10.getMessage());
            }
            settings.setDatabaseEnabled(true);
            String path = getContext().getDir("database", 0).getPath();
            settings.setDatabasePath(path);
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(path);
            try {
                Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, Boolean.FALSE);
            } catch (Exception e11) {
                o.d(f10228a, e11.getMessage());
            }
        } catch (Throwable th3) {
            o.d(f10228a, th3.getMessage());
        }
        webView.setDownloadListener(new DownloadListener(this.f10233g));
        webView.setWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.foundation.webview.BrowserView.2
            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                o.b(BrowserView.f10228a, "开始! = ".concat(String.valueOf(str)));
                BrowserView.this.f10229b = str;
                if (BrowserView.this.f != null) {
                    a unused = BrowserView.this.f;
                }
                BrowserView.this.f10230c.setVisible(true);
                BrowserView.this.f10230c.setProgressState(5);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                o.b(BrowserView.f10228a, "js大跳! = ".concat(String.valueOf(str)));
                BrowserView.this.f10232e.getItem("backward").setEnabled(true);
                BrowserView.this.f10232e.getItem("forward").setEnabled(false);
                if (BrowserView.this.f != null) {
                    BrowserView.this.f.a(webView2, str);
                }
                return false;
            }
        });
        if (k.d() <= 10) {
            webChromeClient = new WebChromeClient() { // from class: com.anythink.expressad.foundation.webview.BrowserView.3
                @Override // android.webkit.WebChromeClient
                public final boolean onJsAlert(WebView webView2, String str, String str2, JsResult jsResult) {
                    return true;
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onJsConfirm(WebView webView2, String str, String str2, JsResult jsResult) {
                    return true;
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onJsPrompt(WebView webView2, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                    return true;
                }

                @Override // android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView2, int i10) {
                    if (i10 == 100) {
                        BrowserView.this.f10230c.setProgressState(7);
                        new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.foundation.webview.BrowserView.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                BrowserView.this.f10230c.setVisible(false);
                            }
                        }, 200L);
                    }
                }
            };
        } else {
            webChromeClient = new WebChromeClient() { // from class: com.anythink.expressad.foundation.webview.BrowserView.4
                @Override // android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView2, int i10) {
                    if (i10 == 100) {
                        BrowserView.this.f10230c.setProgressState(7);
                        new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.foundation.webview.BrowserView.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                BrowserView.this.f10230c.setVisible(false);
                            }
                        }, 200L);
                    }
                }
            };
        }
        webView.setWebChromeClient(webChromeClient);
        return webView;
    }

    private void a() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f10230c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f10231d == null) {
                this.f10231d = b();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f10231d.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            o.b(f10228a, "webview is error", th);
        }
        this.f10232e = new ToolBar(getContext());
        this.f10232e.setLayoutParams(new LinearLayout.LayoutParams(-1, t.b(getContext(), 40.0f)));
        this.f10232e.setBackgroundColor(-1);
        addView(this.f10230c);
        WebView webView = this.f10231d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f10232e);
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    /* loaded from: classes.dex */
    public static final class DownloadListener implements android.webkit.DownloadListener {
        private c campaignEx;
        private String title;

        public DownloadListener() {
        }

        public DownloadListener(c cVar) {
            this.campaignEx = cVar;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        }
    }
}
