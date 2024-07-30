package com.anythink.core.activity.component;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.k.g;
import com.anythink.core.common.k.h;

/* loaded from: classes.dex */
public class PrivacyPolicyView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    private static String f4521n = "PrivacyPolicyView";

    /* renamed from: a, reason: collision with root package name */
    ViewGroup f4522a;

    /* renamed from: b, reason: collision with root package name */
    LinearLayout f4523b;

    /* renamed from: c, reason: collision with root package name */
    LoadingView f4524c;

    /* renamed from: d, reason: collision with root package name */
    TextView f4525d;

    /* renamed from: e, reason: collision with root package name */
    FrameLayout f4526e;
    WebView f;

    /* renamed from: g, reason: collision with root package name */
    CheckBox f4527g;

    /* renamed from: h, reason: collision with root package name */
    View f4528h;

    /* renamed from: i, reason: collision with root package name */
    TextView f4529i;

    /* renamed from: j, reason: collision with root package name */
    boolean f4530j;

    /* renamed from: k, reason: collision with root package name */
    boolean f4531k;

    /* renamed from: l, reason: collision with root package name */
    String f4532l;

    /* renamed from: m, reason: collision with root package name */
    a f4533m;

    /* renamed from: com.anythink.core.activity.component.PrivacyPolicyView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                PrivacyPolicyView privacyPolicyView = PrivacyPolicyView.this;
                if (privacyPolicyView.f != null && !privacyPolicyView.f4531k) {
                    privacyPolicyView.f4530j = true;
                    Log.d(PrivacyPolicyView.f4521n, "reload.......");
                    PrivacyPolicyView privacyPolicyView2 = PrivacyPolicyView.this;
                    privacyPolicyView2.loadPolicyUrl(privacyPolicyView2.f4532l);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.anythink.core.activity.component.PrivacyPolicyView$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends WebViewClient {
        public AnonymousClass2() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            try {
                Log.d(PrivacyPolicyView.f4521n, "onPageFinished：" + str + "   mIsWebViewloadSuccess:" + PrivacyPolicyView.this.f4530j);
                if (PrivacyPolicyView.this.f4532l.equals(str)) {
                    PrivacyPolicyView privacyPolicyView = PrivacyPolicyView.this;
                    if (privacyPolicyView.f4530j) {
                        privacyPolicyView.f4523b.setVisibility(4);
                        PrivacyPolicyView.this.f4522a.setVisibility(0);
                        PrivacyPolicyView.this.f4523b.setVisibility(8);
                        PrivacyPolicyView.this.f4524c.clearAnimation();
                        a aVar = PrivacyPolicyView.this.f4533m;
                        if (aVar != null) {
                            aVar.onPageLoadSuccess();
                        }
                    } else {
                        privacyPolicyView.f4523b.setVisibility(0);
                        PrivacyPolicyView.this.f4524c.clearAnimation();
                        PrivacyPolicyView.this.f4525d.setVisibility(0);
                        PrivacyPolicyView.this.f4522a.setVisibility(8);
                        a aVar2 = PrivacyPolicyView.this.f4533m;
                        if (aVar2 != null) {
                            aVar2.onPageLoadFail();
                        }
                    }
                    PrivacyPolicyView.this.f4531k = false;
                    super.onPageFinished(webView, str);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.d(PrivacyPolicyView.f4521n, "onPageStarted：".concat(String.valueOf(str)));
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            PrivacyPolicyView.this.f4530j = false;
            Log.d(PrivacyPolicyView.f4521n, "onPageFinished：" + webResourceError.getErrorCode());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.d(PrivacyPolicyView.f4521n, "shouldOverrideUrlLoading：".concat(String.valueOf(str)));
            if (!TextUtils.isEmpty(str)) {
                PrivacyPolicyView.a(PrivacyPolicyView.this.getContext(), str);
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.anythink.core.activity.component.PrivacyPolicyView$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 extends WebChromeClient {
        public AnonymousClass3() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("error")) {
                PrivacyPolicyView.this.f4530j = false;
            }
            super.onReceivedTitle(webView, str);
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void onLevelSelect(int i10);

        void onPageLoadFail();

        void onPageLoadSuccess();
    }

    public PrivacyPolicyView(Context context) {
        super(context);
        this.f4530j = true;
        this.f4531k = false;
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "privace_policy_layout", "layout"), this);
        this.f4522a = (ViewGroup) findViewById(h.a(getContext(), "policy_content_view", "id"));
        this.f4523b = (LinearLayout) findViewById(h.a(getContext(), "policy_loading_view", "id"));
        this.f4524c = new LoadingView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h.a(getContext(), 30.0f), h.a(getContext(), 30.0f));
        layoutParams.gravity = 1;
        this.f4524c.setLayoutParams(layoutParams);
        this.f4525d = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = h.a(getContext(), 5.0f);
        this.f4525d.setLayoutParams(layoutParams2);
        this.f4525d.setText("Page failed to load, please try again later.");
        this.f4525d.setTextColor(-8947849);
        this.f4525d.setTextSize(1, 12.0f);
        this.f4523b.addView(this.f4524c);
        this.f4523b.addView(this.f4525d);
        this.f4523b.setOnClickListener(new AnonymousClass1());
        this.f4526e = (FrameLayout) findViewById(h.a(getContext(), "policy_webview_area", "id"));
        WebView webView = new WebView(getContext());
        this.f = webView;
        g.a(webView);
        this.f4526e.addView(this.f, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(false);
            settings.setAppCacheEnabled(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(false);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        this.f.setWebViewClient(new AnonymousClass2());
        this.f.setWebChromeClient(new AnonymousClass3());
        this.f4527g = (CheckBox) findViewById(h.a(getContext(), "policy_check_box", "id"));
        this.f4528h = findViewById(h.a(getContext(), "policy_agree_view", "id"));
        this.f4529i = (TextView) findViewById(h.a(getContext(), "policy_reject_view", "id"));
        this.f4528h.setOnClickListener(this);
        this.f4529i.setOnClickListener(this);
        int a10 = h.a(getContext(), 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-13472268);
        gradientDrawable.setCornerRadius(a10);
        this.f4528h.setBackgroundDrawable(gradientDrawable);
        this.f4529i.setText(Html.fromHtml("<u>No,Thanks</u>"));
    }

    private void b() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "privace_policy_layout", "layout"), this);
        this.f4522a = (ViewGroup) findViewById(h.a(getContext(), "policy_content_view", "id"));
        this.f4523b = (LinearLayout) findViewById(h.a(getContext(), "policy_loading_view", "id"));
        this.f4524c = new LoadingView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h.a(getContext(), 30.0f), h.a(getContext(), 30.0f));
        layoutParams.gravity = 1;
        this.f4524c.setLayoutParams(layoutParams);
        this.f4525d = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = h.a(getContext(), 5.0f);
        this.f4525d.setLayoutParams(layoutParams2);
        this.f4525d.setText("Page failed to load, please try again later.");
        this.f4525d.setTextColor(-8947849);
        this.f4525d.setTextSize(1, 12.0f);
        this.f4523b.addView(this.f4524c);
        this.f4523b.addView(this.f4525d);
        this.f4523b.setOnClickListener(new AnonymousClass1());
        this.f4526e = (FrameLayout) findViewById(h.a(getContext(), "policy_webview_area", "id"));
        WebView webView = new WebView(getContext());
        this.f = webView;
        g.a(webView);
        this.f4526e.addView(this.f, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(false);
            settings.setAppCacheEnabled(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(false);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        this.f.setWebViewClient(new AnonymousClass2());
        this.f.setWebChromeClient(new AnonymousClass3());
        this.f4527g = (CheckBox) findViewById(h.a(getContext(), "policy_check_box", "id"));
        this.f4528h = findViewById(h.a(getContext(), "policy_agree_view", "id"));
        this.f4529i = (TextView) findViewById(h.a(getContext(), "policy_reject_view", "id"));
        this.f4528h.setOnClickListener(this);
        this.f4529i.setOnClickListener(this);
        int a10 = h.a(getContext(), 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-13472268);
        gradientDrawable.setCornerRadius(a10);
        this.f4528h.setBackgroundDrawable(gradientDrawable);
        this.f4529i.setText(Html.fromHtml("<u>No,Thanks</u>"));
    }

    private void c() {
        WebSettings settings = this.f.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(false);
            settings.setAppCacheEnabled(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(false);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        this.f.setWebViewClient(new AnonymousClass2());
        this.f.setWebChromeClient(new AnonymousClass3());
    }

    public void destory() {
        try {
            removeAllViews();
            ViewGroup viewGroup = this.f4522a;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            FrameLayout frameLayout = this.f4526e;
            if (frameLayout != null) {
                frameLayout.removeView(this.f);
                this.f.removeAllViews();
            }
            WebView webView = this.f;
            if (webView != null) {
                webView.clearHistory();
                this.f.clearCache(true);
                this.f.destroy();
                this.f = null;
            }
        } catch (Throwable unused) {
        }
    }

    public void loadPolicyUrl(String str) {
        if (this.f4531k) {
            return;
        }
        this.f4532l = str;
        if (h.a(getContext())) {
            this.f4530j = true;
            this.f4523b.setVisibility(0);
            this.f4524c.clearAnimation();
            this.f4524c.startAnimation();
            this.f4525d.setVisibility(8);
            this.f4531k = true;
            if (this.f4532l.equals(this.f.getUrl())) {
                this.f.reload();
                return;
            } else {
                this.f.loadUrl(this.f4532l);
                return;
            }
        }
        this.f4530j = false;
        this.f4523b.setVisibility(0);
        this.f4524c.clearAnimation();
        this.f4525d.setVisibility(0);
        this.f4522a.setVisibility(8);
        a aVar = this.f4533m;
        if (aVar != null) {
            aVar.onPageLoadFail();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f4528h) {
            ATSDK.setGDPRUploadDataLevel(getContext(), 0);
            view.setTag(0);
            a aVar = this.f4533m;
            if (aVar != null) {
                aVar.onLevelSelect(0);
                return;
            }
            return;
        }
        if (view == this.f4529i) {
            ATSDK.setGDPRUploadDataLevel(getContext(), 1);
            view.setTag(1);
            a aVar2 = this.f4533m;
            if (aVar2 != null) {
                aVar2.onLevelSelect(1);
            }
        }
    }

    public void setResultCallbackListener(a aVar) {
        this.f4533m = aVar;
    }

    public static /* synthetic */ void a(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private static void b(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
