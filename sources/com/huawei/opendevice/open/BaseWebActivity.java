package com.huawei.opendevice.open;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.activity.SafeActivity;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.h;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.HiProgressBar;
import com.huawei.openalliance.ad.ppskit.views.web.NetworkLoadStatusView;
import com.huawei.uikit.phone.hwprogressbar.widget.HwProgressBar;
import db.k;
import ib.a0;
import ib.p;
import ib.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import ka.Cif;
import ka.ke;
import ka.l;
import ka.n7;
import ka.o;
import ka.sh;
import ka.v;

/* loaded from: classes2.dex */
public abstract class BaseWebActivity extends SafeActivity implements NetworkLoadStatusView.b, db.b, p, a0 {
    public f1.f E;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24183s;

    /* renamed from: t, reason: collision with root package name */
    public NetworkLoadStatusView f24184t;

    /* renamed from: u, reason: collision with root package name */
    public WebView f24185u;

    /* renamed from: v, reason: collision with root package name */
    public View f24186v;

    /* renamed from: w, reason: collision with root package name */
    public View f24187w;

    /* renamed from: x, reason: collision with root package name */
    public String f24188x;
    public final f y = new f();

    /* renamed from: z, reason: collision with root package name */
    public boolean f24189z = false;
    public boolean A = true;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public final z F = new z();

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ View f24190s;

        public a(View view) {
            this.f24190s = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebView webView;
            boolean z10;
            PackageManager packageManager;
            Intent intent;
            int id2 = this.f24190s.getId();
            BaseWebActivity baseWebActivity = BaseWebActivity.this;
            if (id2 == R.id.privacy_set_network) {
                n7.e("SystemUtil", "open network setting.");
                Intent intent2 = new Intent("android.settings.WIFI_SETTINGS");
                intent2.setFlags(268435456);
                if (baseWebActivity != null && (packageManager = baseWebActivity.getPackageManager()) != null) {
                    if (!TextUtils.isEmpty(null)) {
                        intent2.setPackage(null);
                    }
                    if (intent2.getData() != null) {
                        intent = intent2.setDataAndTypeAndNormalize(intent2.getData(), intent2.getType());
                    } else {
                        intent = intent2;
                    }
                    z10 = !packageManager.queryIntentActivities(intent, 0).isEmpty();
                } else {
                    z10 = false;
                }
                if (z10) {
                    z1.r(baseWebActivity, intent2);
                    return;
                }
                try {
                    Intent intent3 = new Intent();
                    intent3.addFlags(268435456);
                    intent3.setPackage("com.huawei.homevision.settings");
                    intent3.setData(Uri.parse("tvsetting://com.huawei.homevision.settings/network"));
                    intent3.setClipData(oa.a.f33785b);
                    baseWebActivity.startActivity(intent3);
                    return;
                } catch (Throwable th) {
                    n7.h("SystemUtil", "open activity by deeplink error, %s", th.getClass().getSimpleName());
                    return;
                }
            }
            if (m.z(baseWebActivity) && (webView = baseWebActivity.f24185u) != null) {
                webView.loadUrl(baseWebActivity.f24188x);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f24192s;

        public b(String str) {
            this.f24192s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebView webView = BaseWebActivity.this.f24185u;
            if (webView != null) {
                webView.loadUrl(this.f24192s);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Context f24194a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f24195b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f24196c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f24197d;

        public c(Context context) {
            boolean z10 = true;
            this.f24195b = true;
            this.f24196c = false;
            this.f24197d = false;
            this.f24194a = context;
            l a10 = Cif.a(context);
            this.f24195b = d0.m(context);
            this.f24196c = m.Z(context);
            if (!a10.g() && !Cif.b()) {
                z10 = false;
            }
            this.f24197d = z10;
        }

        public static String a(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.length() == 1) {
                    return "0".concat(str);
                }
                return str;
            }
            return "";
        }

        @JavascriptInterface
        public String getPkgName() {
            return this.f24194a.getPackageName();
        }

        @JavascriptInterface
        public boolean isDarkMode() {
            return z1.T(this.f24194a);
        }

        @JavascriptInterface
        public boolean isEMuiVersion10() {
            return m.y();
        }

        @JavascriptInterface
        public boolean isEinkDevice() {
            return m.I();
        }

        @JavascriptInterface
        public boolean isHarmonyOS() {
            return this.f24197d;
        }

        @JavascriptInterface
        public boolean isPortableScreenDevice() {
            PackageManager packageManager = this.f24194a.getPackageManager();
            if (packageManager == null) {
                n7.i("DeviceUtil", "packageManager is null.");
                return false;
            }
            return packageManager.hasSystemFeature("huanglong.product.type.tv");
        }

        @JavascriptInterface
        public boolean isSpanVisible(String str) {
            List arrayList;
            List arrayList2;
            boolean contains;
            ConfigSpHandler b10 = ConfigSpHandler.b(this.f24194a);
            synchronized (b10.f22478a) {
                if (!TextUtils.isEmpty(str)) {
                    Map<String, String> u2 = b10.u(true);
                    if (!a0.a.e0(u2)) {
                        String str2 = u2.get("hideSpan");
                        Pattern pattern = y1.f23070a;
                        if (TextUtils.isEmpty(str2)) {
                            arrayList = Collections.emptyList();
                        } else {
                            arrayList = new ArrayList(Arrays.asList(str2.split(",")));
                        }
                        String str3 = u2.get("showSpan");
                        if (TextUtils.isEmpty(str3)) {
                            arrayList2 = Collections.emptyList();
                        } else {
                            arrayList2 = new ArrayList(Arrays.asList(str3.split(",")));
                        }
                        arrayList.contains(str);
                        contains = arrayList2.contains(str);
                    }
                }
                contains = false;
            }
            return contains;
        }

        @JavascriptInterface
        public boolean isTv() {
            return m.Z(this.f24194a);
        }

        @JavascriptInterface
        public String queryAdsBrainLables() {
            String lowerCase = this.f24194a.createDeviceProtectedStorageContext().getSharedPreferences("hiad_brain_config", 4).getString("msg_labels", "").toLowerCase(Locale.getDefault());
            n7.e("AdInfoUtil", "inject msg labels:" + lowerCase);
            return lowerCase;
        }

        @JavascriptInterface
        public int queryApiLevel() {
            return Build.VERSION.SDK_INT;
        }

        @JavascriptInterface
        public String querySite() {
            return z1.b(this.f24194a);
        }

        @JavascriptInterface
        public String queryThemeColor() {
            int color;
            Context context = this.f24194a;
            if (context != null) {
                try {
                    if ((this.f24197d && !this.f24196c) || !this.f24195b) {
                        color = context.getResources().getColor(R.color.hiad_emui_accent);
                    } else {
                        color = context.getResources().getColor(R.color.hiad_dark_mode_tag_color);
                    }
                    StringBuffer stringBuffer = new StringBuffer("#");
                    String hexString = Integer.toHexString(Color.alpha(color));
                    String hexString2 = Integer.toHexString(Color.red(color));
                    String hexString3 = Integer.toHexString(Color.green(color));
                    String hexString4 = Integer.toHexString(Color.blue(color));
                    String a10 = a(hexString);
                    String a11 = a(hexString2);
                    String a12 = a(hexString3);
                    String a13 = a(hexString4);
                    stringBuffer.append(a10);
                    stringBuffer.append(a11);
                    stringBuffer.append(a12);
                    stringBuffer.append(a13);
                    n7.c("BaseWebActivity", " color=%s", stringBuffer.toString());
                    return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
                } catch (Exception e10) {
                    n7.e("BaseWebActivity", "catch theme color exception:".concat(e10.getClass().getName()));
                    return "#FF007DFF";
                }
            }
            return "#FF007DFF";
        }

        @JavascriptInterface
        public boolean showMore() {
            boolean z10;
            Context context = this.f24194a;
            String c10 = z1.c(context);
            String d10 = z1.d(context);
            if (!w.bn.equalsIgnoreCase(c10) && !w.bn.equalsIgnoreCase(d10)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 || !m.y()) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements a0 {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<a0> f24198s;

        public d(a0 a0Var) {
            this.f24198s = new WeakReference<>(a0Var);
        }

        @Override // ib.a0
        public final void a(z zVar) {
            a0 a0Var = this.f24198s.get();
            if (a0Var != null) {
                a0Var.a(zVar);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements View.OnLongClickListener {
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class f extends WebChromeClient {
        public f() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (n7.d()) {
                n7.c("BaseWebActivity", "logFromJs: %s", consoleMessage.message());
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            BaseWebActivity.this.b(i10);
            super.onProgressChanged(webView, i10);
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
        }
    }

    private void k() {
        View decorView;
        try {
            Window window = getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2 | 4096);
            }
        } catch (Throwable unused) {
            n7.e("BaseWebActivity", "hideNavigation error ");
        }
    }

    @Override // ib.a0
    public final void a(z zVar) {
        n7.e("BaseWebActivity", "onPrivacyInfoUpdate");
        z zVar2 = this.F;
        zVar2.getClass();
        long j10 = zVar.f29533c;
        if (j10 != -1) {
            zVar2.f29533c = j10;
        }
        long j11 = zVar.f29534d;
        if (j11 != -1) {
            zVar2.f29534d = j11;
        }
        zVar2.f29531a = zVar.f29531a;
        zVar2.f29532b = zVar.f29532b;
        zVar2.f29535e = zVar.f29535e;
        zVar2.f = zVar.f;
    }

    public final void b(int i10) {
        View view = this.f24187w;
        if (view != null) {
            if (i10 == 100) {
                view.setVisibility(8);
                return;
            }
            if (view.getVisibility() == 8) {
                this.f24187w.setVisibility(0);
            }
            if (this.D) {
                this.f24187w.setProgress(i10, true);
            } else {
                ((HiProgressBar) this.f24187w).setProgress(i10);
            }
        }
    }

    public final void c(Activity activity) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        try {
            attributes.getClass().getDeclaredField("layoutInDisplayCutoutMode").setInt(attributes, 1);
            activity.getWindow().setAttributes(attributes);
        } catch (Throwable unused) {
            n7.g("BaseWebActivity", "setLayoutMode error");
        }
    }

    public final void d(String str) {
        n7.e("BaseWebActivity", "onGrsSuccess");
        this.f24188x = str;
        d2.a(new b(str));
    }

    @TargetApi(29)
    public final void e(int i10) {
        WebView webView;
        WebSettings settings;
        if (Build.VERSION.SDK_INT >= 29 && (webView = this.f24185u) != null && (settings = webView.getSettings()) != null) {
            settings.setForceDark(i10);
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void finish() {
        super.finish();
        if (this.E == null) {
            this.E = new f1.f(this);
        }
        this.E.a(2);
    }

    public int g() {
        return 0;
    }

    public String h() {
        return null;
    }

    public final void i() {
        LayoutInflater layoutInflater;
        int i10;
        WebSettings settings;
        ActionBar actionBar = getActionBar();
        if (h.a(getApplicationContext()).c()) {
            if (actionBar != null) {
                actionBar.hide();
            }
        } else if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            if (!this.f24189z) {
                layoutInflater = getLayoutInflater();
                i10 = R.layout.action_bar_title_layout;
            } else if (this.C) {
                z1.p(this);
                layoutInflater = getLayoutInflater();
                i10 = R.layout.action_bar_title_layout_hm;
            } else if (g() != 0) {
                actionBar.setTitle(g());
            }
            View inflate = layoutInflater.inflate(i10, (ViewGroup) null);
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setCustomView(inflate);
            actionBar.setElevation(gl.Code);
            try {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                Toolbar toolbar = (Toolbar) inflate.getParent();
                if (toolbar != null) {
                    toolbar.setLayoutParams(layoutParams);
                    if (this.C) {
                        toolbar.setBackgroundColor(getResources().getColor(R.color.hiad_emui_color_subbg));
                    }
                    inflate.post(new ib.b(this, inflate, toolbar));
                }
            } catch (Throwable unused) {
                n7.g("BaseWebActivity", "setCustomToolBar error.");
            }
            if (g() != 0) {
                ((TextView) findViewById(R.id.custom_action_bar_title)).setText(g());
            }
        }
        View findViewById = findViewById(R.id.content_statement);
        this.f24186v = findViewById;
        findViewById.setFitsSystemWindows(true);
        this.f24185u = (WebView) findViewById(R.id.content_webview);
        if (this.D) {
            HwProgressBar hwProgressBar = new HwProgressBar(this, (AttributeSet) null, hb.b.Widget_Emui_HwProgressBar_Horizontal);
            this.f24187w = hwProgressBar;
            hwProgressBar.setProgressDrawable(getResources().getDrawable(hb.a.hwprogressbar_horizontal_emui));
            this.f24187w.setFlickerEnable(true);
        } else {
            this.f24187w = new HiProgressBar(this);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, d0.b(this, 2.0f));
        layoutParams2.addRule(2, R.id.content_webview);
        ((LinearLayout) this.f24186v).addView(this.f24187w, 0, layoutParams2);
        WebView webView = this.f24185u;
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        WebView webView2 = this.f24185u;
        if (webView2 != null && (settings = webView2.getSettings()) != null) {
            if (this.B) {
                settings.setTextZoom(100);
            }
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
            onConfigurationChanged(getResources().getConfiguration());
        }
        k kVar = new k(this);
        kVar.c(this.f24187w, this.D);
        WebView webView3 = this.f24185u;
        if (webView3 != null) {
            webView3.setWebChromeClient(this.y);
            this.f24185u.setWebViewClient(kVar);
            this.f24185u.addJavascriptInterface(new c(this), "HwPPSPrivacy");
            this.f24185u.requestFocus();
        }
        f(this);
        a0.a.V(new d(this));
        NetworkLoadStatusView networkLoadStatusView = (NetworkLoadStatusView) findViewById(R.id.status_view);
        this.f24184t = networkLoadStatusView;
        if (networkLoadStatusView != null) {
            networkLoadStatusView.setState(1);
            this.f24184t.setOnEmptyClickListener(this);
            this.f24184t.setClickable(true);
            this.f24184t.setFitsSystemWindows(true);
        }
        if (this.C && !this.B) {
            int color = getResources().getColor(R.color.hiad_emui_color_subbg);
            this.f24186v.setBackgroundColor(color);
            this.f24184t.setBackgroundColor(color);
        }
    }

    public int j() {
        return 0;
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.web.NetworkLoadStatusView.b
    public void onClick(View view) {
        d2.a(new a(view));
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = configuration.uiMode & 48;
        n7.e("BaseWebActivity", "currentNightMode=" + i10);
        if (m.Z(getApplicationContext()) || 32 != i10) {
            e(0);
        } else {
            e(2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (r0 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x001f, code lost:
    
        if (r0 > 0) goto L13;
     */
    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.opendevice.open.BaseWebActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a0.a.f29v0 = null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String simpleName;
        String str;
        try {
            if (menuItem.getItemId() == 16908332) {
                super.onBackPressed();
                return true;
            }
            return super.onOptionsItemSelected(menuItem);
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str = "onOptionsItemSelected ";
            n7.g("BaseWebActivity", str.concat(simpleName));
            return false;
        } catch (Throwable th) {
            simpleName = th.getClass().getSimpleName();
            str = "onOptionsItemSelected ex: ";
            n7.g("BaseWebActivity", str.concat(simpleName));
            return false;
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onPause() {
        z zVar;
        super.onPause();
        if (!z1.R(this) && (zVar = this.F) != null) {
            if (n7.d()) {
                n7.b("BaseWebActivity", "onPause, record privacy close time.");
            }
            HashMap hashMap = d0.f22830a;
            zVar.f29534d = System.currentTimeMillis();
            zVar.f29531a = h();
            v vVar = new v(getApplicationContext());
            Context context = vVar.f31722a;
            try {
                o c10 = vVar.c(context.getPackageName(), true);
                if (c10 != null) {
                    if (n7.d()) {
                        n7.c("AnalysisReport", "onPrivacyStatementOpen, type: %s", zVar.f29531a);
                    }
                    c10.f31525a = "120";
                    c10.U0 = zVar.f29531a;
                    c10.V0 = zVar.f29532b;
                    c10.W0 = zVar.f29533c;
                    c10.X0 = zVar.f29534d;
                    c10.Y0 = zVar.f29535e;
                    c10.Z0 = zVar.f;
                    new ke(context, new sh(context, 0), null).t(c10.f31552l, c10, true, true);
                }
            } catch (Throwable th) {
                n7.h("AnalysisReport", "onPrivacyStatementOpen：%s", th.getClass().getSimpleName());
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onResume() {
        z zVar;
        super.onResume();
        if (z1.R(this)) {
            k();
        }
        if (!z1.R(this) && (zVar = this.F) != null) {
            if (n7.d()) {
                n7.b("BaseWebActivity", "onResume, record privacy open time.");
            }
            HashMap hashMap = d0.f22830a;
            zVar.f29533c = System.currentTimeMillis();
        }
    }

    public void f(p pVar) {
    }
}
