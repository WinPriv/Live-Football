package com.huawei.openalliance.ad.ppskit.views;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;
import com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EncryptionField;
import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.AppDownloadButton;
import com.huawei.openalliance.ad.ppskit.views.CustomEmuiActionBar;
import com.huawei.openalliance.ad.ppskit.views.linkscroll.LinkScrollWebView;
import com.huawei.uikit.phone.hwprogressbar.widget.HwProgressBar;
import ka.Cif;
import ka.ej;
import ka.ke;
import ka.n7;
import ka.sc;
import ka.tc;
import ka.zh;

/* loaded from: classes2.dex */
public class PPSWebView extends RelativeLayout implements ej {
    public View A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public String H;
    public final boolean I;
    public ka.l J;
    public boolean K;
    public boolean L;
    public AppDownloadButton M;
    public ScanningRelativeLayout N;
    public ParticleRelativeLayout O;
    public RelativeLayout P;
    public AutoScaleSizeRelativeLayout Q;
    public boolean R;
    public final Handler S;
    public final b T;
    public final c U;

    /* renamed from: s, reason: collision with root package name */
    public final CustomEmuiActionBar.a f23295s;

    /* renamed from: t, reason: collision with root package name */
    public LinkScrollWebView f23296t;

    /* renamed from: u, reason: collision with root package name */
    public CustomEmuiActionBar f23297u;

    /* renamed from: v, reason: collision with root package name */
    public View f23298v;

    /* renamed from: w, reason: collision with root package name */
    public sc f23299w;

    /* renamed from: x, reason: collision with root package name */
    public final ActionBar f23300x;
    public ContentRecord y;

    /* renamed from: z, reason: collision with root package name */
    public l1 f23301z;

    /* loaded from: classes2.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            PPSWebView pPSWebView = PPSWebView.this;
            if (!PPSWebView.g(pPSWebView)) {
                return true;
            }
            pPSWebView.s();
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            PPSWebView pPSWebView;
            LinkScrollWebView linkScrollWebView;
            if (keyEvent.getAction() == 0 && i10 == 4 && (linkScrollWebView = (pPSWebView = PPSWebView.this).f23296t) != null && linkScrollWebView.canGoBack() && com.huawei.openalliance.ad.ppskit.utils.k1.g(pPSWebView.f23296t.getContext())) {
                pPSWebView.f23296t.goBack();
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z10;
            PPSWebView pPSWebView = PPSWebView.this;
            if (motionEvent != null && motionEvent.getAction() == 0) {
                pPSWebView.B++;
                pPSWebView.E = (int) motionEvent.getRawX();
                pPSWebView.F = (int) motionEvent.getRawY();
            }
            if (motionEvent != null && 1 == motionEvent.getAction()) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                int i10 = pPSWebView.E;
                int i11 = pPSWebView.F;
                int i12 = pPSWebView.G;
                if (Math.abs(i10 - rawX) <= i12 && Math.abs(i11 - rawY) <= i12) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    if (n7.d()) {
                        n7.c("PPSWebView", "touch up download area x=%d, y=%d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                    }
                    sc scVar = pPSWebView.f23299w;
                    scVar.f31830z.g(rawX, rawY, (ContentRecord) scVar.f32660t);
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public class d implements AppDownloadButton.k {
        public d() {
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout, ka.zi] */
        /* JADX WARN: Type inference failed for: r5v5, types: [com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout, ka.zi] */
        @Override // com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.k
        public final void a(AppStatus appStatus) {
            if (n7.d()) {
                n7.c("PPSWebView", "onStatusChanged: %s", appStatus);
            }
            PPSWebView pPSWebView = PPSWebView.this;
            if (8 == pPSWebView.getVisibility()) {
                return;
            }
            if ((appStatus == AppStatus.DOWNLOAD || appStatus == AppStatus.INSTALLED) && PPSWebView.g(pPSWebView)) {
                pPSWebView.s();
                return;
            }
            ?? r52 = pPSWebView.Q;
            if (r52 != 0 && r52.e()) {
                n7.e("PPSWebView", "stop animation.");
                pPSWebView.Q.b();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e extends WebChromeClient {
        public e() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            PPSWebView pPSWebView = PPSWebView.this;
            if (pPSWebView.f23298v != null) {
                if (i10 == 100) {
                    pPSWebView.f23298v.setVisibility(8);
                } else {
                    if (pPSWebView.f23298v.getVisibility() == 8) {
                        pPSWebView.f23298v.setVisibility(0);
                    }
                    boolean z10 = pPSWebView.L;
                    HwProgressBar hwProgressBar = pPSWebView.f23298v;
                    if (z10) {
                        hwProgressBar.setProgress(i10, true);
                    } else {
                        ((HiProgressBar) hwProgressBar).setProgress(i10);
                    }
                }
            }
            super.onProgressChanged(webView, i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
        
            if (r2.c0() == 1) goto L14;
         */
        @Override // android.webkit.WebChromeClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onReceivedTitle(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.String r0 = " "
                com.huawei.openalliance.ad.ppskit.views.PPSWebView r1 = com.huawei.openalliance.ad.ppskit.views.PPSWebView.this
                if (r7 != 0) goto L12
                android.content.res.Resources r7 = r1.getResources()
                r2 = 2131951982(0x7f13016e, float:1.9540394E38)
                java.lang.String r7 = r7.getString(r2)
                goto L1b
            L12:
                java.lang.String r2 = "about:blank"
                boolean r2 = android.text.TextUtils.equals(r7, r2)
                if (r2 == 0) goto L1b
                r7 = r0
            L1b:
                com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r2 = r1.y
                r3 = 0
                if (r2 == 0) goto L28
                int r2 = r2.c0()
                r4 = 1
                if (r2 != r4) goto L28
                goto L29
            L28:
                r4 = r3
            L29:
                com.huawei.openalliance.ad.ppskit.views.CustomEmuiActionBar r2 = r1.f23297u
                if (r2 == 0) goto L3e
                android.widget.TextView r0 = r2.f23117s
                if (r0 == 0) goto L38
                if (r4 == 0) goto L34
                goto L35
            L34:
                r3 = 4
            L35:
                r0.setVisibility(r3)
            L38:
                com.huawei.openalliance.ad.ppskit.views.CustomEmuiActionBar r0 = r1.f23297u
                r0.setTitle(r7)
                goto L48
            L3e:
                android.app.ActionBar r1 = r1.f23300x
                if (r1 == 0) goto L48
                if (r4 == 0) goto L45
                r0 = r7
            L45:
                r1.setTitle(r0)
            L48:
                super.onReceivedTitle(r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSWebView.e.onReceivedTitle(android.webkit.WebView, java.lang.String):void");
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
    }

    public PPSWebView(Context context, ActionBar actionBar, ContentRecord contentRecord, CustomEmuiActionBar.a aVar, boolean z10, boolean z11) {
        super(context);
        this.B = 0;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.K = false;
        this.L = false;
        this.R = false;
        this.S = new Handler(Looper.myLooper(), new a());
        this.T = new b();
        this.U = new c();
        this.D = false;
        j(context);
        this.I = z11;
        this.y = contentRecord;
        this.f23295s = aVar;
        this.f23300x = actionBar;
        this.f23299w = new sc(context, contentRecord, this);
        e(context, z10, false);
    }

    private void f(View view) {
        View view2 = this.A;
        if (view2 != null) {
            removeView(view2);
        }
        this.A = view;
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            CustomEmuiActionBar customEmuiActionBar = this.f23297u;
            if (customEmuiActionBar != null) {
                layoutParams.addRule(3, customEmuiActionBar.getId());
            }
            addView(this.A, layoutParams);
            this.A.setVisibility(8);
        }
        View view3 = this.A;
        if (view3 != null) {
            view3.setOnClickListener(new x0(this));
        }
        ImageView imageView = (ImageView) findViewById(R.id.hiad_id_load_fail_img);
        if (imageView != null) {
            Drawable drawable = getResources().getDrawable(R.drawable.hiad_ic_load_fail);
            if (z1.D()) {
                imageView.setImageBitmap(com.huawei.openalliance.ad.ppskit.utils.v0.l(drawable));
            }
        }
    }

    public static boolean g(PPSWebView pPSWebView) {
        AppDownloadButton appDownloadButton;
        AppStatus l10;
        if (pPSWebView.y != null && pPSWebView.Q != null && (appDownloadButton = pPSWebView.M) != null && ((l10 = appDownloadButton.l()) == AppStatus.DOWNLOAD || l10 == AppStatus.INSTALLED)) {
            return true;
        }
        return false;
    }

    private int getButtonRadius() {
        AppDownloadButton appDownloadButton = this.M;
        if (appDownloadButton == null) {
            return 0;
        }
        return appDownloadButton.getRoundRadius();
    }

    private void j(Context context) {
        boolean z10;
        boolean z11;
        ka.l a10 = Cif.a(context);
        this.J = a10;
        boolean g6 = a10.g();
        this.K = g6;
        if (g6) {
            ((j1.a) this.J).getClass();
            try {
                Class.forName("com.huawei.uikit.phone.hwprogressbar.widget.HwProgressBar");
                z11 = true;
            } catch (Throwable unused) {
                n7.g("BaseDeviceImpl", "check widget available error");
                z11 = false;
            }
            if (z11) {
                z10 = true;
                this.L = z10;
                n7.f("PPSWebView", "isHmOS: %s, useHmProgressBar: %s", Boolean.valueOf(this.K), Boolean.valueOf(this.L));
            }
        }
        z10 = false;
        this.L = z10;
        n7.f("PPSWebView", "isHmOS: %s, useHmProgressBar: %s", Boolean.valueOf(this.K), Boolean.valueOf(this.L));
    }

    @SuppressLint({"JavascriptInterface"})
    public final void a(Object obj, String str) {
        LinkScrollWebView linkScrollWebView = this.f23296t;
        if (linkScrollWebView != null) {
            linkScrollWebView.addJavascriptInterface(obj, str);
        }
    }

    @Override // ka.ej
    public final void b(String str) {
        this.H = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.content.Context r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSWebView.e(android.content.Context, boolean, boolean):void");
    }

    public AppDownloadButton getAppDownloadButton() {
        return this.M;
    }

    @Override // ka.ej
    public String getCurrentPageUrl() {
        return this.H;
    }

    public CustomEmuiActionBar getCustomEmuiActionBar() {
        return this.f23297u;
    }

    public WebSettings getSettings() {
        LinkScrollWebView linkScrollWebView = this.f23296t;
        if (linkScrollWebView != null) {
            return linkScrollWebView.getSettings();
        }
        return null;
    }

    public tc getWebDetailPresenter() {
        return this.f23299w;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long getWebHasShownTime() {
        /*
            r8 = this;
            ka.sc r0 = r8.f23299w
            java.lang.Long r1 = r0.D
            r2 = 0
            if (r1 == 0) goto L13
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = r0.D
            long r6 = r1.longValue()
            goto L1f
        L13:
            long r4 = r0.C
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L21
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r0.C
        L1f:
            long r4 = r4 - r6
            goto L22
        L21:
            r4 = r2
        L22:
            java.lang.Object r1 = r0.f32660t
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r1 = (com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord) r1
            int r1 = r1.z0()
            r6 = 7
            if (r1 != r6) goto L32
            boolean r0 = r0.E
            if (r0 != 0) goto L32
            goto L33
        L32:
            r2 = r4
        L33:
            boolean r0 = ka.n7.d()
            if (r0 == 0) goto L4a
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r0[r1] = r4
            java.lang.String r1 = "sc"
            java.lang.String r4 = "getWebHasShownTime, webShowTime, duration: %s"
            ka.n7.c(r1, r4, r0)
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSWebView.getWebHasShownTime():long");
    }

    public WebView getWebView() {
        return this.f23296t;
    }

    @Override // ka.ej
    public final void l() {
        View view = this.A;
        if (view != null) {
            view.setVisibility(0);
        }
        LinkScrollWebView linkScrollWebView = this.f23296t;
        if (linkScrollWebView != null) {
            linkScrollWebView.setVisibility(4);
        }
        View view2 = this.f23298v;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // ka.ej
    public final void m() {
        LinkScrollWebView linkScrollWebView = this.f23296t;
        if (linkScrollWebView != null) {
            linkScrollWebView.loadUrl(com.anythink.core.common.res.d.f6477a);
        }
        View view = this.f23298v;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void n() {
        Handler handler;
        sc scVar = this.f23299w;
        long currentTimeMillis = System.currentTimeMillis();
        scVar.getClass();
        if (n7.d()) {
            n7.c(com.anythink.expressad.d.a.b.bH, "setWebOpenTime, webOpenTime= %s", Long.valueOf(currentTimeMillis));
        }
        scVar.C = currentTimeMillis;
        scVar.D = null;
        if (!this.C) {
            this.C = true;
            sc scVar2 = this.f23299w;
            va.c cVar = scVar2.f31829x;
            if (cVar != null) {
                n7.e("WebEventReporter", "onWebOpen");
                ke keVar = (ke) ((f1.f) cVar).f27934c;
                androidx.transition.n.z(keVar.f31386g, keVar.f31381a, "webopen").d("webopen", keVar.z("webopen"), true, keVar.f31382b);
            } else {
                ContentRecord contentRecord = (ContentRecord) scVar2.f32660t;
                if (contentRecord == null) {
                    n7.g("event", "onWebOpen, ad data is null");
                } else {
                    androidx.activity.n.P(scVar2.f31827v, "reportWebOpen", androidx.activity.n.y(contentRecord));
                }
            }
        }
        if (getVisibility() == 0 && (handler = this.S) != null) {
            handler.sendEmptyMessageDelayed(1001, 100L);
        }
    }

    public final void p() {
        long j10;
        sc scVar = this.f23299w;
        int i10 = this.B;
        long j11 = 0;
        if (scVar.D != null) {
            j10 = System.currentTimeMillis() - scVar.D.longValue();
            scVar.D = null;
        } else if (scVar.C > 0) {
            j10 = System.currentTimeMillis() - scVar.C;
            scVar.C = 0L;
        } else {
            j10 = 0;
        }
        if (((ContentRecord) scVar.f32660t).z0() != 7 || scVar.E) {
            j11 = j10;
        }
        if (n7.d()) {
            n7.c(com.anythink.expressad.d.a.b.bH, "onWebClose, webCloseTime, duration: %s", Long.valueOf(j11));
        }
        va.c cVar = scVar.f31829x;
        if (cVar != null) {
            ((f1.f) cVar).a(i10);
            f1.f fVar = (f1.f) scVar.f31829x;
            fVar.getClass();
            n7.e("WebEventReporter", "onWebClose");
            ((ke) fVar.f27934c).c(i10, j11);
            return;
        }
        ContentRecord contentRecord = (ContentRecord) scVar.f32660t;
        if (contentRecord == null) {
            n7.g("event", "onWebClose, ad data is null");
            return;
        }
        AdEventReport y = androidx.activity.n.y(contentRecord);
        y.U(i10);
        y.D(Long.valueOf(j11));
        androidx.activity.n.P(scVar.f31827v, "reportWebClose", y);
    }

    public final void q() {
        if (this.y != null) {
            this.f23299w.q(this.f23296t);
            this.f23299w.s(this.f23296t, this.y.p3());
            this.H = this.y.p3();
        }
    }

    public final void r() {
        c1 j1Var;
        AppDownloadButton appDownloadButton = this.M;
        if (appDownloadButton == null) {
            return;
        }
        if (this.K) {
            j1Var = new k1(getContext());
        } else {
            j1Var = new j1(getContext());
        }
        appDownloadButton.setAppDownloadButtonStyle(j1Var);
        this.M.l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout, ka.zi] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout, ka.zi] */
    public final void s() {
        r();
        ?? r02 = this.Q;
        if (r02 == 0) {
            return;
        }
        r02.setAutoRepeat(true);
        n7.e("PPSWebView", "start animation.");
        try {
            this.Q.p(this.P, this.y);
        } catch (Throwable th) {
            n7.h("PPSWebView", "start animation error: %s", th.getClass().getSimpleName());
        }
    }

    public void setAdLandingPageData(ContentRecord contentRecord) {
        boolean z10;
        int i10;
        String str;
        this.y = contentRecord;
        sc scVar = this.f23299w;
        if (contentRecord != null) {
            scVar.f32660t = contentRecord;
            scVar.A = contentRecord.h1();
            ka.p pVar = scVar.y;
            if (pVar != null) {
                pVar.f31723b = contentRecord.n1();
            }
        } else {
            scVar.getClass();
        }
        if (i2.h(this.y) && ((getContext() instanceof PPSRewardActivity) || (getContext() instanceof PPSActivity))) {
            ActionBar actionBar = this.f23300x;
            if (actionBar != null) {
                actionBar.hide();
            }
            this.R = true;
            ContentRecord contentRecord2 = this.y;
            if (contentRecord2 != null && !TextUtils.isEmpty(contentRecord2.p3())) {
                EncryptionField<String> y0 = this.y.y0();
                if (y0 != null) {
                    str = y0.a(getContext());
                } else {
                    str = "";
                }
                z10 = y1.m(this.y.p3(), str);
            } else {
                z10 = false;
            }
            if (!z10) {
                View inflate = View.inflate(getContext(), R.layout.hiad_landing_play_download_button, null);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(12);
                addView(inflate, layoutParams);
                this.M = (AppDownloadButton) inflate.findViewById(R.id.app_download_btn);
                this.N = (ScanningRelativeLayout) inflate.findViewById(R.id.hiad_detail_btn_scan);
                this.O = (ParticleRelativeLayout) inflate.findViewById(R.id.hiad_detail_btn_particle);
                this.P = (RelativeLayout) inflate.findViewById(R.id.app_download_btn_rl);
                int buttonRadius = getButtonRadius();
                if (this.N != null && buttonRadius > 0) {
                    n7.f("PPSWebView", "got button radius: %s", Integer.valueOf(buttonRadius));
                    this.N.setRadius(buttonRadius);
                }
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.M.getLayoutParams();
                Context context = getContext();
                if (context == null) {
                    i10 = 0;
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    }
                    i10 = displayMetrics.heightPixels;
                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    WindowManager windowManager2 = (WindowManager) context.getSystemService("window");
                    if (windowManager2 != null) {
                        windowManager2.getDefaultDisplay().getRealMetrics(displayMetrics2);
                    }
                    int i11 = displayMetrics2.widthPixels;
                    if (i10 > i11) {
                        i10 = i11;
                    }
                }
                layoutParams2.width = (int) (i10 * 0.75f);
                this.M.setLayoutParamsInner(layoutParams2);
                ContentRecord contentRecord3 = this.y;
                if (contentRecord3 != null && androidx.transition.n.d0(contentRecord3.q0())) {
                    ScanningRelativeLayout scanningRelativeLayout = this.N;
                    this.Q = scanningRelativeLayout;
                    scanningRelativeLayout.setVisibility(0);
                    this.O.setVisibility(8);
                } else {
                    ContentRecord contentRecord4 = this.y;
                    if (contentRecord4 != null && androidx.transition.n.e0(contentRecord4.q0())) {
                        this.Q = this.O;
                        this.N.setVisibility(8);
                        this.O.setVisibility(0);
                    }
                }
                if (!(getContext() instanceof PPSActivity)) {
                    this.M.setPosition(4);
                }
            }
            i();
        } else {
            this.R = false;
        }
        AppDownloadButton appDownloadButton = this.M;
        if (appDownloadButton != null) {
            appDownloadButton.setContentRecord(contentRecord);
            this.M.setNeedShowPermision(true);
            r();
            this.M.setOnDownloadStatusChangedListener(new d());
        }
        if (i2.h(this.y)) {
            this.f23296t.setOnTouchListener(null);
        }
    }

    public void setErrorPageView(View view) {
        if (view == null) {
            return;
        }
        f(view);
    }

    public void setOnShowCloseCallBck(f fVar) {
        LinearLayout linearLayout;
        int i10;
        boolean z10 = this.R;
        if (fVar != null) {
            PPSActivity pPSActivity = PPSActivity.this;
            if (z10) {
                linearLayout = pPSActivity.H;
                i10 = 0;
            } else {
                linearLayout = pPSActivity.H;
                i10 = 8;
            }
            linearLayout.setVisibility(i10);
        }
    }

    public void setPPSWebEventCallback(va.c cVar) {
        this.f23299w.f31829x = cVar;
    }

    public void setRealOpenTime(long j10) {
        sc scVar = this.f23299w;
        scVar.D = Long.valueOf(j10);
        scVar.E = true;
    }

    public void setScrollListener(View.OnScrollChangeListener onScrollChangeListener) {
        LinkScrollWebView linkScrollWebView = this.f23296t;
        if (linkScrollWebView != null) {
            linkScrollWebView.setOnScrollChangeListener(onScrollChangeListener);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        Handler handler;
        super.setVisibility(i10);
        if (i10 == 0 && (handler = this.S) != null) {
            handler.sendEmptyMessageDelayed(1001, 100L);
        }
    }

    public void setVmallWebViewClient(WebViewClient webViewClient) {
        this.f23301z.f23466g = webViewClient;
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        LinkScrollWebView linkScrollWebView = this.f23296t;
        if (linkScrollWebView != null) {
            linkScrollWebView.setWebChromeClient(webChromeClient);
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.f23301z.f = webViewClient;
    }

    public PPSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = 0;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.K = false;
        this.L = false;
        this.R = false;
        this.S = new Handler(Looper.myLooper(), new a());
        this.T = new b();
        this.U = new c();
        this.D = true;
        this.f23299w = new sc(context, this);
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        j(context);
        try {
            e(context, false, true);
        } catch (Throwable unused) {
            n7.g("PPSWebView", "init webview error");
        }
    }

    @Override // ka.ej
    public final void a(String str, String str2, String str3) {
        sc scVar = this.f23299w;
        ka.p pVar = scVar.y;
        ContentRecord contentRecord = (ContentRecord) scVar.f32660t;
        pVar.getClass();
        if (contentRecord == null) {
            return;
        }
        try {
            ka.o f10 = pVar.f(contentRecord);
            if (f10 == null) {
                return;
            }
            f10.f31525a = "22";
            f10.f31565s = str3;
            f10.y = str2;
            f10.f31563r = str;
            Context context = pVar.f31722a;
            new ke(context, zh.a(contentRecord.z0(), context), null).t(contentRecord.h1(), f10, false, true);
        } catch (Throwable th) {
            e0.i.p(th, "onLandPageOpenFail:", "AnalysisReport");
        }
    }

    public void i() {
    }
}
