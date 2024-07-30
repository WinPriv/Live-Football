package com.anythink.core.basead.ui.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.basead.a;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.am;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.j.c;
import com.anythink.core.common.k.h;
import com.anythink.core.common.k.l;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class WebLandPageActivity extends Activity {

    /* renamed from: e, reason: collision with root package name */
    private static final int f4699e = 343452;

    /* renamed from: b, reason: collision with root package name */
    JSONArray f4701b;
    private WebProgressBarView f;

    /* renamed from: g, reason: collision with root package name */
    private WebView f4704g;

    /* renamed from: h, reason: collision with root package name */
    private ImageButton f4705h;

    /* renamed from: i, reason: collision with root package name */
    private ImageButton f4706i;

    /* renamed from: j, reason: collision with root package name */
    private ImageButton f4707j;

    /* renamed from: k, reason: collision with root package name */
    private ImageButton f4708k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4709l;

    /* renamed from: m, reason: collision with root package name */
    private i f4710m;

    /* renamed from: n, reason: collision with root package name */
    private j f4711n;
    private String o;

    /* renamed from: p, reason: collision with root package name */
    private IOfferClickHandler f4712p;

    /* renamed from: q, reason: collision with root package name */
    private b f4713q;

    /* renamed from: a, reason: collision with root package name */
    int f4700a = 8;

    /* renamed from: r, reason: collision with root package name */
    private ValueCallback<Uri[]> f4714r = null;

    /* renamed from: s, reason: collision with root package name */
    private final int f4715s = 512;

    /* renamed from: c, reason: collision with root package name */
    int f4702c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f4703d = 0;

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements DownloadListener {
        public AnonymousClass1() {
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
            if (WebLandPageActivity.this.f4710m != null && WebLandPageActivity.this.f4711n != null && !TextUtils.isEmpty(WebLandPageActivity.this.f4710m.B())) {
                if (WebLandPageActivity.this.f4712p != null && (WebLandPageActivity.this.f4712p instanceof IOfferClickHandler) && WebLandPageActivity.this.f4712p.startDownloadApp(WebLandPageActivity.this.getApplicationContext(), WebLandPageActivity.this.f4710m, WebLandPageActivity.this.f4711n, str)) {
                    WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                    webLandPageActivity.f4700a = 6;
                    webLandPageActivity.f4703d = 1;
                } else {
                    WebLandPageActivity webLandPageActivity2 = WebLandPageActivity.this;
                    webLandPageActivity2.f4703d = 2;
                    l.a(webLandPageActivity2, str);
                    WebLandPageActivity.this.f4700a = 7;
                }
            } else {
                WebLandPageActivity webLandPageActivity3 = WebLandPageActivity.this;
                webLandPageActivity3.f4700a = 11;
                l.a(webLandPageActivity3, str);
            }
            WebLandPageActivity.this.finish();
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (WebLandPageActivity.this.f4704g.canGoBack()) {
                WebLandPageActivity.this.f4704g.goBack();
            }
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (WebLandPageActivity.this.f4704g.canGoForward()) {
                WebLandPageActivity.this.f4704g.goForward();
            }
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WebLandPageActivity.this.f4704g.reload();
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WebLandPageActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        super.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            r0 = 512(0x200, float:7.17E-43)
            if (r8 != r0) goto L4c
            android.webkit.ValueCallback<android.net.Uri[]> r0 = r7.f4714r     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L9
            goto L4c
        L9:
            r0 = -1
            r1 = 0
            if (r9 != r0) goto L41
            if (r10 == 0) goto L41
            java.lang.String r0 = r10.getDataString()     // Catch: java.lang.Throwable -> L49
            r2 = 0
            android.content.ClipData r3 = r10.getClipData()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L34
            int r4 = r3.getItemCount()     // Catch: java.lang.Throwable -> L34
            android.net.Uri[] r4 = new android.net.Uri[r4]     // Catch: java.lang.Throwable -> L34
            r5 = r2
        L21:
            int r6 = r3.getItemCount()     // Catch: java.lang.Throwable -> L35
            if (r5 >= r6) goto L35
            android.content.ClipData$Item r6 = r3.getItemAt(r5)     // Catch: java.lang.Throwable -> L35
            android.net.Uri r6 = r6.getUri()     // Catch: java.lang.Throwable -> L35
            r4[r5] = r6     // Catch: java.lang.Throwable -> L35
            int r5 = r5 + 1
            goto L21
        L34:
            r4 = r1
        L35:
            if (r0 == 0) goto L42
            r3 = 1
            android.net.Uri[] r4 = new android.net.Uri[r3]     // Catch: java.lang.Throwable -> L49
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L49
            r4[r2] = r0     // Catch: java.lang.Throwable -> L49
            goto L42
        L41:
            r4 = r1
        L42:
            android.webkit.ValueCallback<android.net.Uri[]> r0 = r7.f4714r     // Catch: java.lang.Throwable -> L49
            r0.onReceiveValue(r4)     // Catch: java.lang.Throwable -> L49
            r7.f4714r = r1     // Catch: java.lang.Throwable -> L49
        L49:
            super.onActivityResult(r8, r9, r10)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.basead.ui.web.WebLandPageActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(-1);
        boolean requestFeature = getWindow().requestFeature(2);
        this.f4709l = requestFeature;
        if (requestFeature) {
            getWindow().setFeatureInt(2, -1);
        }
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra(a.C0068a.f4677c);
                if (serializableExtra != null && (serializableExtra instanceof i)) {
                    i iVar = (i) serializableExtra;
                    this.f4710m = iVar;
                    this.f4713q = new b(iVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra(a.C0068a.f4679e);
                if (serializableExtra2 != null && (serializableExtra2 instanceof j)) {
                    this.f4711n = (j) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra(a.C0068a.f4685l);
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.f4712p = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.o = intent.getStringExtra(a.C0068a.f4683j);
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        }
        String str = this.o;
        if (TextUtils.isEmpty(str)) {
            i iVar2 = this.f4710m;
            if (iVar2 != null) {
                str = iVar2.A();
            } else {
                str = "";
            }
        }
        Context applicationContext = getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            Toast.makeText(applicationContext, h.a(applicationContext, "basead_click_empty", com.anythink.expressad.foundation.h.i.f10128g), 0).show();
            finish();
            return;
        }
        am a10 = com.anythink.core.basead.a.a.a(applicationContext, str);
        if (a10.f5548m) {
            a(a10);
            return;
        }
        a(a10);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-16777216);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(f4699e);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, h.a(this, 55.0f));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundDrawable(new ColorDrawable(-592138));
        int a11 = h.a(this, 20.0f);
        linearLayout.setPadding(a11, 0, a11, 0);
        relativeLayout.addView(linearLayout);
        this.f4705h = a(getResources().getDrawable(h.a(this, "browser_unleft_icon", com.anythink.expressad.foundation.h.i.f10125c)));
        this.f4706i = a(getResources().getDrawable(h.a(this, "browser_unright_icon", com.anythink.expressad.foundation.h.i.f10125c)));
        this.f4707j = a(getResources().getDrawable(h.a(this, "browser_refresh_icon", com.anythink.expressad.foundation.h.i.f10125c)));
        this.f4708k = a(getResources().getDrawable(h.a(this, "browser_close_icon", com.anythink.expressad.foundation.h.i.f10125c)));
        linearLayout.addView(this.f4705h);
        linearLayout.addView(this.f4706i);
        linearLayout.addView(this.f4707j);
        linearLayout.addView(this.f4708k);
        this.f4704g = new BaseWebView(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, f4699e);
        this.f4704g.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f4704g);
        View view = new View(this);
        view.setBackgroundColor(-2434342);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, h.a(this, 1.0f));
        layoutParams3.addRule(2, f4699e);
        view.setLayoutParams(layoutParams3);
        relativeLayout.addView(view);
        WebProgressBarView webProgressBarView = new WebProgressBarView(this);
        this.f = webProgressBarView;
        webProgressBarView.setProgress(0);
        relativeLayout.addView(this.f, new RelativeLayout.LayoutParams(-1, h.a(this, 2.0f)));
        setContentView(relativeLayout);
        this.f4705h.setBackgroundColor(0);
        this.f4705h.setOnClickListener(new AnonymousClass2());
        this.f4706i.setBackgroundColor(0);
        this.f4706i.setOnClickListener(new AnonymousClass3());
        this.f4707j.setBackgroundColor(0);
        this.f4707j.setOnClickListener(new AnonymousClass4());
        this.f4708k.setBackgroundColor(0);
        this.f4708k.setOnClickListener(new AnonymousClass5());
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().startSync();
        WebSettings settings = this.f4704g.getSettings();
        this.f4704g.setHorizontalScrollBarEnabled(false);
        this.f4704g.setVerticalScrollBarEnabled(false);
        this.f4704g.setVerticalScrollBarEnabled(false);
        this.f4704g.requestFocus();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setMixedContentMode(0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception unused) {
        }
        settings.setDatabaseEnabled(true);
        String path = getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        this.f4704g.setWebViewClient(new a(this));
        this.f4704g.setDownloadListener(new AnonymousClass1());
        am a12 = com.anythink.core.basead.a.a.a(str);
        this.f4700a = a12.f5547l;
        this.f4704g.loadUrl(a12.o);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        j jVar;
        super.onDestroy();
        WebView webView = this.f4704g;
        if (webView != null) {
            webView.destroy();
        }
        this.f4704g = null;
        i iVar = this.f4710m;
        if (iVar != null && (jVar = this.f4711n) != null) {
            c.a(jVar.f5654b, jVar.f5656d, iVar.d(), this.f4710m.p(), this.f4701b, this.f4702c, this.f4703d, this.f4700a, this.o, this.f4711n.f5661j);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
        this.f4704g.setWebChromeClient(null);
        WebView webView = this.f4704g;
        if (isFinishing()) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
        this.f4704g.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.6
            @Override // android.webkit.WebChromeClient
            public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                try {
                    callback.invoke(str, true, false);
                } catch (Throwable unused) {
                }
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i10) {
                if (WebLandPageActivity.this.f != null) {
                    WebLandPageActivity.this.f.setProgress(i10);
                    if (i10 == 100) {
                        n.a().a(new Runnable() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                WebLandPageActivity.this.f.setVisibility(8);
                            }
                        }, 200L);
                    }
                }
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                try {
                    WebLandPageActivity.this.f4714r = valueCallback;
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                    intent.setType("*/*");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                    WebLandPageActivity.this.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 512);
                    return true;
                } catch (Throwable unused) {
                    return false;
                }
            }
        });
        this.f4704g.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    private void b() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra(a.C0068a.f4677c);
                if (serializableExtra != null && (serializableExtra instanceof i)) {
                    i iVar = (i) serializableExtra;
                    this.f4710m = iVar;
                    this.f4713q = new b(iVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra(a.C0068a.f4679e);
                if (serializableExtra2 != null && (serializableExtra2 instanceof j)) {
                    this.f4711n = (j) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra(a.C0068a.f4685l);
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.f4712p = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.o = intent.getStringExtra(a.C0068a.f4683j);
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        }
    }

    private void c() {
        this.f4705h.setBackgroundColor(0);
        this.f4705h.setOnClickListener(new AnonymousClass2());
        this.f4706i.setBackgroundColor(0);
        this.f4706i.setOnClickListener(new AnonymousClass3());
        this.f4707j.setBackgroundColor(0);
        this.f4707j.setOnClickListener(new AnonymousClass4());
        this.f4708k.setBackgroundColor(0);
        this.f4708k.setOnClickListener(new AnonymousClass5());
    }

    private void d() {
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().startSync();
    }

    private View e() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-16777216);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(f4699e);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, h.a(this, 55.0f));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundDrawable(new ColorDrawable(-592138));
        int a10 = h.a(this, 20.0f);
        linearLayout.setPadding(a10, 0, a10, 0);
        relativeLayout.addView(linearLayout);
        this.f4705h = a(getResources().getDrawable(h.a(this, "browser_unleft_icon", com.anythink.expressad.foundation.h.i.f10125c)));
        this.f4706i = a(getResources().getDrawable(h.a(this, "browser_unright_icon", com.anythink.expressad.foundation.h.i.f10125c)));
        this.f4707j = a(getResources().getDrawable(h.a(this, "browser_refresh_icon", com.anythink.expressad.foundation.h.i.f10125c)));
        this.f4708k = a(getResources().getDrawable(h.a(this, "browser_close_icon", com.anythink.expressad.foundation.h.i.f10125c)));
        linearLayout.addView(this.f4705h);
        linearLayout.addView(this.f4706i);
        linearLayout.addView(this.f4707j);
        linearLayout.addView(this.f4708k);
        this.f4704g = new BaseWebView(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, f4699e);
        this.f4704g.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f4704g);
        View view = new View(this);
        view.setBackgroundColor(-2434342);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, h.a(this, 1.0f));
        layoutParams3.addRule(2, f4699e);
        view.setLayoutParams(layoutParams3);
        relativeLayout.addView(view);
        WebProgressBarView webProgressBarView = new WebProgressBarView(this);
        this.f = webProgressBarView;
        webProgressBarView.setProgress(0);
        relativeLayout.addView(this.f, new RelativeLayout.LayoutParams(-1, h.a(this, 2.0f)));
        return relativeLayout;
    }

    public static void a(Context context, com.anythink.core.basead.b.a aVar) {
        Intent intent = new Intent();
        intent.setClass(context, WebLandPageActivity.class);
        intent.putExtra(a.C0068a.f4677c, aVar.f4692c);
        intent.putExtra(a.C0068a.f4679e, aVar.f4696h);
        intent.putExtra(a.C0068a.f4683j, aVar.f);
        IOfferClickHandler iOfferClickHandler = aVar.f4695g;
        if (iOfferClickHandler != null) {
            intent.putExtra(a.C0068a.f4685l, iOfferClickHandler);
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static void a(Context context, String str) {
        com.anythink.core.basead.b.a aVar = new com.anythink.core.basead.b.a();
        aVar.f = str;
        a(context, aVar);
    }

    private void a(boolean z10) {
        this.f4706i.setImageResource(z10 ? h.a(this, "browser_right_icon", com.anythink.expressad.foundation.h.i.f10125c) : h.a(this, "browser_unright_icon", com.anythink.expressad.foundation.h.i.f10125c));
    }

    private void b(boolean z10) {
        this.f4705h.setImageResource(z10 ? h.a(this, "browser_left_icon", com.anythink.expressad.foundation.h.i.f10125c) : h.a(this, "browser_unleft_icon", com.anythink.expressad.foundation.h.i.f10125c));
    }

    public final void a(WebView webView, String str) {
        JSONObject jSONObject;
        this.f4705h.setImageResource(webView.canGoBack() ? h.a(this, "browser_left_icon", com.anythink.expressad.foundation.h.i.f10125c) : h.a(this, "browser_unleft_icon", com.anythink.expressad.foundation.h.i.f10125c));
        this.f4706i.setImageResource(webView.canGoForward() ? h.a(this, "browser_right_icon", com.anythink.expressad.foundation.h.i.f10125c) : h.a(this, "browser_unright_icon", com.anythink.expressad.foundation.h.i.f10125c));
        b bVar = this.f4713q;
        if (bVar == null || (jSONObject = bVar.f4728b) == null) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && str != null && str.contains(next) && bVar.f4729c.get(next) == null) {
                    bVar.f4729c.put(next, Boolean.TRUE);
                    webView.loadUrl(bVar.f4728b.optString(next));
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void b(String str) {
        if (this.f4701b == null) {
            this.f4701b = new JSONArray();
        }
        this.f4701b.put(str);
    }

    private void a(String str) {
        WebSettings settings = this.f4704g.getSettings();
        this.f4704g.setHorizontalScrollBarEnabled(false);
        this.f4704g.setVerticalScrollBarEnabled(false);
        this.f4704g.setVerticalScrollBarEnabled(false);
        this.f4704g.requestFocus();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setMixedContentMode(0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception unused) {
        }
        settings.setDatabaseEnabled(true);
        String path = getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        this.f4704g.setWebViewClient(new a(this));
        this.f4704g.setDownloadListener(new AnonymousClass1());
        am a10 = com.anythink.core.basead.a.a.a(str);
        this.f4700a = a10.f5547l;
        this.f4704g.loadUrl(a10.o);
    }

    public final WebProgressBarView a() {
        return this.f;
    }

    private ImageButton a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, h.a(this, 35.0f), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setBackgroundColor(0);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }

    public final void a(am amVar) {
        this.f4700a = amVar.f5547l;
        if (amVar.f5549n) {
            if (amVar.f5548m) {
                this.f4702c = 1;
                finish();
            } else {
                this.f4702c = 2;
            }
        }
    }
}
