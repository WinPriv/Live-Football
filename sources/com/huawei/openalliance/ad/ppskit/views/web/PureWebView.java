package com.huawei.openalliance.ad.ppskit.views.web;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.anythink.core.common.res.d;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.views.web.PureNetworkLoadStatusView;
import db.g;
import ka.bj;
import ka.lc;
import ka.n7;

/* loaded from: classes2.dex */
public class PureWebView extends RelativeLayout implements PureNetworkLoadStatusView.b, bj {

    /* renamed from: s, reason: collision with root package name */
    public ProgressBar f23598s;

    /* renamed from: t, reason: collision with root package name */
    public PureNetworkLoadStatusView f23599t;

    /* renamed from: u, reason: collision with root package name */
    public WebView f23600u;

    /* renamed from: v, reason: collision with root package name */
    public String f23601v;

    /* renamed from: w, reason: collision with root package name */
    public lc f23602w;

    /* renamed from: x, reason: collision with root package name */
    public g f23603x;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f23604s;

        public a(String str) {
            this.f23604s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PureWebView pureWebView = PureWebView.this;
            String str = this.f23604s;
            pureWebView.f23601v = str;
            WebView p10 = pureWebView.f23602w.p();
            if (p10 != null) {
                p10.setBackgroundColor(0);
                WebSettings settings = p10.getSettings();
                if (settings != null) {
                    settings.setLoadsImagesAutomatically(true);
                    settings.setUseWideViewPort(true);
                    settings.setLoadWithOverviewMode(true);
                    settings.setJavaScriptEnabled(true);
                    settings.setAllowFileAccess(false);
                    settings.setCacheMode(2);
                    settings.setSupportZoom(true);
                    settings.setBuiltInZoomControls(true);
                    settings.setDisplayZoomControls(false);
                    settings.setGeolocationEnabled(false);
                    settings.setAllowContentAccess(false);
                }
            }
            WebView p11 = pureWebView.f23602w.p();
            if (p11 != null) {
                p11.loadUrl(str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            PureWebView pureWebView = PureWebView.this;
            ProgressBar progressBar = pureWebView.f23598s;
            if (progressBar != null) {
                if (i10 == 100) {
                    progressBar.setVisibility(8);
                } else {
                    if (progressBar.getVisibility() == 8) {
                        pureWebView.f23598s.setVisibility(0);
                    }
                    pureWebView.f23598s.setProgress(i10);
                }
            }
            super.onProgressChanged(webView, i10);
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
        }
    }

    public PureWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.pure_web_layout, this);
        this.f23600u = (WebView) findViewById(R.id.content_webview);
        this.f23598s = (ProgressBar) findViewById(R.id.web_progress);
        PureNetworkLoadStatusView pureNetworkLoadStatusView = (PureNetworkLoadStatusView) findViewById(R.id.status_view);
        this.f23599t = pureNetworkLoadStatusView;
        if (pureNetworkLoadStatusView != null) {
            pureNetworkLoadStatusView.setState(1);
            this.f23599t.setOnEmptyClickListener(this);
            this.f23599t.setClickable(true);
        }
        this.f23602w = new lc(this);
        this.f23600u.setWebChromeClient(new b());
        WebView webView = this.f23600u;
        g gVar = new g(this);
        this.f23603x = gVar;
        webView.setWebViewClient(gVar);
    }

    @Override // ka.bj
    public final void a() {
        PureNetworkLoadStatusView pureNetworkLoadStatusView = this.f23599t;
        if (pureNetworkLoadStatusView == null) {
            return;
        }
        if (pureNetworkLoadStatusView.getCurrentState() == 1 && m.z(getContext())) {
            this.f23599t.setState(0);
        }
        this.f23599t.setState(1);
    }

    @Override // ka.ej
    public final void b(String str) {
        this.f23601v = str;
    }

    @Override // ka.ej
    public String getCurrentPageUrl() {
        return this.f23601v;
    }

    @Override // ka.bj
    public WebView getWebView() {
        return this.f23600u;
    }

    @Override // ka.ej
    public final void l() {
        PureNetworkLoadStatusView pureNetworkLoadStatusView;
        int i10;
        if (this.f23599t == null) {
            return;
        }
        if (!m.z(getContext())) {
            pureNetworkLoadStatusView = this.f23599t;
            i10 = -2;
        } else {
            pureNetworkLoadStatusView = this.f23599t;
            i10 = -1;
        }
        pureNetworkLoadStatusView.setState(i10);
    }

    @Override // ka.ej
    public final void m() {
        WebView webView = this.f23600u;
        if (webView != null) {
            webView.loadUrl(d.f6477a);
        }
        ProgressBar progressBar = this.f23598s;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.f23603x.f27591c = webViewClient;
    }

    @Override // ka.bj
    public final void a(Object obj, String str) {
        WebView p10 = this.f23602w.p();
        if (p10 != null) {
            n7.b("PureWebViewPresenter", "inject js");
            p10.addJavascriptInterface(obj, str);
        }
    }

    @Override // ka.bj
    public final void a(String str) {
        d2.a(new a(str));
    }

    @Override // ka.ej
    public final void a(String str, String str2, String str3) {
    }
}
