package com.ironsource.sdk.controller;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class OpenUrlActivity extends Activity {
    public static final int B = SDKUtils.generateViewId();
    public static final int C = SDKUtils.generateViewId();

    /* renamed from: t, reason: collision with root package name */
    public x f26084t;

    /* renamed from: u, reason: collision with root package name */
    public ProgressBar f26085u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f26086v;

    /* renamed from: w, reason: collision with root package name */
    public RelativeLayout f26087w;

    /* renamed from: x, reason: collision with root package name */
    public String f26088x;

    /* renamed from: s, reason: collision with root package name */
    public WebView f26083s = null;
    public final Handler y = new Handler();

    /* renamed from: z, reason: collision with root package name */
    public boolean f26089z = false;
    public final b A = new b();

    /* loaded from: classes2.dex */
    public class a implements View.OnSystemUiVisibilityChangeListener {
        public a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public final void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 4098) == 0) {
                OpenUrlActivity openUrlActivity = OpenUrlActivity.this;
                Handler handler = openUrlActivity.y;
                b bVar = openUrlActivity.A;
                handler.removeCallbacks(bVar);
                openUrlActivity.y.postDelayed(bVar, 500L);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OpenUrlActivity openUrlActivity = OpenUrlActivity.this;
            openUrlActivity.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(openUrlActivity.f26089z));
        }
    }

    /* loaded from: classes2.dex */
    public class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f26085u.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f26085u.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean didCrash;
            StringBuilder sb2 = new StringBuilder("Chromium process crashed - detail.didCrash():");
            didCrash = renderProcessGoneDetail.didCrash();
            sb2.append(didCrash);
            Logger.e("OpenUrlActivity", sb2.toString());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            OpenUrlActivity openUrlActivity = OpenUrlActivity.this;
            List<String> b10 = com.ironsource.sdk.utils.b.a().b();
            if (!b10.isEmpty()) {
                Iterator<String> it = b10.iterator();
                while (it.hasNext()) {
                    if (str.contains(it.next())) {
                        try {
                            openUrlActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            openUrlActivity.f26084t.h();
                        } catch (Exception e10) {
                            StringBuilder sb2 = new StringBuilder();
                            if (e10 instanceof ActivityNotFoundException) {
                                sb2.append("no activity to handle url");
                            } else {
                                sb2.append("activity failed to open with unspecified reason");
                            }
                            x xVar = openUrlActivity.f26084t;
                            if (xVar != null) {
                                String sb3 = sb2.toString();
                                if (TextUtils.isEmpty(str)) {
                                    str = "unknown url";
                                }
                                String str3 = str;
                                if (TextUtils.isEmpty(sb3)) {
                                    str2 = "activity failed to open with unspecified reason";
                                } else {
                                    str2 = sb3;
                                }
                                xVar.b(x.b("failedToStartStoreActivity", x.a("errMsg", str2, "url", str3, null, null, null, null, null, false)));
                            }
                        }
                        openUrlActivity.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        x xVar;
        if (this.f26086v && (xVar = this.f26084t) != null) {
            xVar.e("secondaryClose");
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f26083s.stopLoading();
        this.f26083s.clearHistory();
        try {
            this.f26083s.loadUrl(str);
        } catch (Throwable th) {
            Logger.e("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f26083s.canGoBack()) {
            this.f26083s.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i("OpenUrlActivity", "onCreate()");
        try {
            this.f26084t = (x) com.ironsource.sdk.d.b.a((Context) this).f26402a.f26120a;
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            Bundle extras = getIntent().getExtras();
            this.f26088x = extras.getString(x.f26247c);
            this.f26086v = extras.getBoolean(x.f26248d);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.f26089z = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.A);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f26087w = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e10) {
            e10.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        WebView webView = this.f26083s;
        if (webView != null) {
            webView.destroy();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f26089z && (i10 == 25 || i10 == 24)) {
            this.y.postDelayed(this.A, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        x xVar = this.f26084t;
        if (xVar != null) {
            xVar.a(false, "secondary");
            if (this.f26087w != null && (viewGroup = (ViewGroup) this.f26083s.getParent()) != null) {
                if (viewGroup.findViewById(B) != null) {
                    viewGroup.removeView(this.f26083s);
                }
                if (viewGroup.findViewById(C) != null) {
                    viewGroup.removeView(this.f26085u);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        WebView webView = this.f26083s;
        int i10 = B;
        if (webView == null) {
            WebView webView2 = new WebView(getApplicationContext());
            this.f26083s = webView2;
            webView2.setId(i10);
            this.f26083s.getSettings().setJavaScriptEnabled(true);
            this.f26083s.setWebViewClient(new c());
            loadUrl(this.f26088x);
        }
        if (findViewById(i10) == null) {
            this.f26087w.addView(this.f26083s, new RelativeLayout.LayoutParams(-1, -1));
        }
        ProgressBar progressBar = this.f26085u;
        int i11 = C;
        if (progressBar == null) {
            ProgressBar progressBar2 = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.f26085u = progressBar2;
            progressBar2.setId(i11);
        }
        if (findViewById(i11) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f26085u.setLayoutParams(layoutParams);
            this.f26085u.setVisibility(4);
            this.f26087w.addView(this.f26085u);
        }
        x xVar = this.f26084t;
        if (xVar != null) {
            xVar.a(true, "secondary");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f26089z && z10) {
            runOnUiThread(this.A);
        }
    }
}
