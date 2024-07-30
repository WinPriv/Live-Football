package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.views.AppDownloadButton;
import ka.cf;
import ka.fj;
import ka.n7;
import ka.wi;
import ka.xi;
import ka.y4;

/* loaded from: classes2.dex */
public class PPSAppDetailView extends RelativeLayout {

    /* renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f23139c0 = 0;
    public View A;
    public ka.v B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public xi H;
    public va.b I;
    public boolean J;
    public String K;
    public String L;
    public int M;
    public ka.l N;
    public AutoScaleSizeRelativeLayout O;
    public ScanningRelativeLayout P;
    public ParticleRelativeLayout Q;
    public int R;
    public SixElementsView S;
    public final Handler T;
    public boolean U;
    public int V;
    public final b W;

    /* renamed from: s, reason: collision with root package name */
    public Context f23140s;

    /* renamed from: t, reason: collision with root package name */
    public AppDownloadButton f23141t;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f23142u;

    /* renamed from: v, reason: collision with root package name */
    public PPSLabelView f23143v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23144w;

    /* renamed from: x, reason: collision with root package name */
    public AppInfo f23145x;
    public com.huawei.openalliance.ad.ppskit.handlers.l y;

    /* renamed from: z, reason: collision with root package name */
    public ContentRecord f23146z;

    /* loaded from: classes2.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean z10;
            int i10 = PPSAppDetailView.f23139c0;
            PPSAppDetailView pPSAppDetailView = PPSAppDetailView.this;
            boolean z11 = false;
            if (pPSAppDetailView.l()) {
                Integer q10 = androidx.transition.n.q(23, 0, pPSAppDetailView.f23146z.q0());
                if (q10 == null || q10.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    z11 = true;
                }
            }
            if (!z11) {
                return true;
            }
            pPSAppDetailView.g();
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnTouchListener {

        /* loaded from: classes2.dex */
        public class a implements fj {
            public a() {
            }

            @Override // ka.fj
            public final void a(AppDownloadButton appDownloadButton) {
                String str;
                b bVar = b.this;
                if (PPSAppDetailView.this.H != null) {
                    if (AppStatus.INSTALLED == appDownloadButton.getStatus()) {
                        str = "app";
                    } else {
                        str = "";
                    }
                    PPSAppDetailView pPSAppDetailView = PPSAppDetailView.this;
                    pPSAppDetailView.H.a(new wi(str, pPSAppDetailView.F, true));
                }
            }

            @Override // ka.fj
            public final void b(AppDownloadButton appDownloadButton) {
                String str;
                b bVar = b.this;
                if (PPSAppDetailView.this.H != null) {
                    if (AppStatus.INSTALLED == appDownloadButton.getStatus()) {
                        str = "app";
                    } else {
                        str = "";
                    }
                    PPSAppDetailView pPSAppDetailView = PPSAppDetailView.this;
                    pPSAppDetailView.H.a(new wi(str, pPSAppDetailView.F, false));
                }
            }
        }

        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z10;
            n7.e("PPSAppDetailView", "action:" + motionEvent.getAction());
            PPSAppDetailView pPSAppDetailView = PPSAppDetailView.this;
            if (pPSAppDetailView.f23141t != null) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1) {
                        int rawX = (int) motionEvent.getRawX();
                        int rawY = (int) motionEvent.getRawY();
                        if (pPSAppDetailView.F) {
                            pPSAppDetailView.f23141t.setClickActionListener(new a());
                        }
                        PPSAppDetailView.f(pPSAppDetailView, pPSAppDetailView.F);
                        int i10 = pPSAppDetailView.D;
                        int i11 = pPSAppDetailView.E;
                        int i12 = pPSAppDetailView.C;
                        if (Math.abs(i10 - rawX) <= i12 && Math.abs(i11 - rawY) <= i12) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!z10) {
                            if (n7.d()) {
                                n7.c("PPSAppDetailView", "touch up download area x=%d, y=%d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                            }
                            pPSAppDetailView.B.g(rawX, rawY, pPSAppDetailView.f23146z);
                        }
                    }
                } else {
                    pPSAppDetailView.D = (int) motionEvent.getRawX();
                    pPSAppDetailView.E = (int) motionEvent.getRawY();
                }
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            PPSAppDetailView pPSAppDetailView = PPSAppDetailView.this;
            if (pPSAppDetailView.F) {
                if (pPSAppDetailView.H != null) {
                    if (AppStatus.INSTALLED == pPSAppDetailView.f23141t.getStatus()) {
                        str = "app";
                    } else {
                        str = "";
                    }
                    pPSAppDetailView.H.a(new wi(str, pPSAppDetailView.F, true));
                }
                pPSAppDetailView.f23141t.onClick(null);
                return;
            }
            xi xiVar = pPSAppDetailView.H;
            if (xiVar != null) {
                xiVar.a(new wi(pPSAppDetailView.getClickDestination(), false, false));
            } else {
                n7.e("PPSAppDetailView", "onButtonClick, appDetailClickListener is null");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements com.huawei.openalliance.ad.ppskit.utils.n1 {

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Drawable f23152s;

            public a(Drawable drawable) {
                this.f23152s = drawable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                PPSAppDetailView.this.f23142u.setBackground(null);
                PPSAppDetailView.this.f23142u.setImageDrawable(this.f23152s);
            }
        }

        public d() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.n1
        public final void a() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.n1
        public final void a(String str, Drawable drawable) {
            if (drawable != null) {
                d2.a(new a(drawable));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements AppDownloadButton.k {
        public e() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.k
        public final void a(AppStatus appStatus) {
            boolean z10;
            PPSAppDetailView pPSAppDetailView = PPSAppDetailView.this;
            pPSAppDetailView.setCancelDownloadButtonVisibility(appStatus);
            boolean z11 = false;
            if (n7.d()) {
                n7.c("PPSAppDetailView", "onStatusChanged: %s", appStatus);
            }
            if (appStatus == AppStatus.DOWNLOAD || appStatus == AppStatus.INSTALLED) {
                if (pPSAppDetailView.l()) {
                    Integer q10 = androidx.transition.n.q(23, 0, pPSAppDetailView.f23146z.q0());
                    if (q10 == null || q10.intValue() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        z11 = true;
                    }
                }
                if (z11) {
                    pPSAppDetailView.g();
                    return;
                }
            }
            pPSAppDetailView.h();
        }
    }

    /* loaded from: classes2.dex */
    public class f implements AppDownloadButton.i {
        public f() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.i
        public final CharSequence a(String str) {
            PPSAppDetailView pPSAppDetailView = PPSAppDetailView.this;
            if (!pPSAppDetailView.F) {
                return androidx.activity.n.E(pPSAppDetailView.L, pPSAppDetailView.f23140s.getString(R.string.hiad_download_open));
            }
            return str;
        }
    }

    /* loaded from: classes2.dex */
    public class g implements AppDownloadButton.l {
        public g() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.l
        public final boolean a() {
            boolean z10;
            PPSAppDetailView pPSAppDetailView = PPSAppDetailView.this;
            va.b bVar = pPSAppDetailView.I;
            if (bVar != null) {
                z10 = PPSRewardActivity.this.C;
            } else {
                z10 = false;
            }
            if (!z10 && pPSAppDetailView.y.R(pPSAppDetailView.K) && pPSAppDetailView.U) {
                pPSAppDetailView.f23141t.m();
                return false;
            }
            pPSAppDetailView.f23141t.setAllowedNonWifiNetwork(true);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f23157s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.huawei.openalliance.ad.ppskit.utils.n1 f23158t;

        public h(String str, com.huawei.openalliance.ad.ppskit.utils.n1 n1Var) {
            this.f23157s = str;
            this.f23158t = n1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SourceParam sourceParam = new SourceParam();
            sourceParam.l(false);
            sourceParam.o(true);
            sourceParam.h("icon");
            sourceParam.n(this.f23157s);
            PPSAppDetailView pPSAppDetailView = PPSAppDetailView.this;
            if (!pPSAppDetailView.F) {
                sourceParam.b(pPSAppDetailView.y.O(pPSAppDetailView.K));
            }
            e6.c e10 = new za.c(pPSAppDetailView.f23140s, sourceParam).e();
            if (e10 != null) {
                String str = e10.f27764a;
                if (!TextUtils.isEmpty(str)) {
                    String h10 = y4.a(pPSAppDetailView.f23140s, "normal").h(pPSAppDetailView.f23140s, str);
                    if (!TextUtils.isEmpty(h10)) {
                        SourceParam sourceParam2 = new SourceParam();
                        sourceParam2.n(h10);
                        com.huawei.openalliance.ad.ppskit.utils.v0.g(pPSAppDetailView.f23140s, sourceParam2, this.f23158t, null, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PPSAppDetailView(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView r5, boolean r6) {
        /*
            r0 = 28
            r1 = 0
            if (r6 == 0) goto L74
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r6 = r5.f23146z
            r2 = 16
            r3 = 1
            if (r6 == 0) goto L1f
            java.lang.String r6 = r6.q0()
            java.lang.Integer r6 = androidx.transition.n.q(r2, r1, r6)
            if (r6 != 0) goto L17
            goto L1f
        L17:
            int r6 = r6.intValue()
            if (r6 != 0) goto L1f
            r6 = r3
            goto L20
        L1f:
            r6 = r1
        L20:
            if (r6 == 0) goto L2e
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton r6 = r5.f23141t
            r0 = 5
            r6.setSource(r0)
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton r5 = r5.f23141t
            r5.performClick()
            goto L8c
        L2e:
            ka.xi r6 = r5.H
            if (r6 == 0) goto L8c
            ka.wi r6 = new ka.wi
            java.lang.String r4 = "web"
            r6.<init>(r3, r1, r4, r0)
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r0 = r5.f23146z
            if (r0 == 0) goto L5a
            java.lang.String r0 = r0.q0()
            java.lang.Integer r0 = androidx.transition.n.q(r2, r1, r0)
            if (r0 != 0) goto L48
            goto L51
        L48:
            r2 = 2
            int r0 = r0.intValue()
            if (r2 != r0) goto L51
            r0 = r3
            goto L52
        L51:
            r0 = r1
        L52:
            if (r0 == 0) goto L5a
            int r0 = r5.V
            if (r0 != 0) goto L5a
            r0 = r3
            goto L5b
        L5a:
            r0 = r1
        L5b:
            if (r0 == 0) goto L62
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L6c
        L62:
            boolean r0 = r5.i()
            if (r0 == 0) goto L6e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L6c:
            r6.f32151e = r0
        L6e:
            ka.xi r5 = r5.H
            r5.a(r6)
            goto L8c
        L74:
            ka.xi r6 = r5.H
            if (r6 == 0) goto L8c
            boolean r6 = r5.i()
            if (r6 != 0) goto L8c
            ka.xi r6 = r5.H
            ka.wi r2 = new ka.wi
            java.lang.String r5 = r5.getClickDestination()
            r2.<init>(r1, r1, r5, r0)
            r6.a(r2)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView.f(com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView, boolean):void");
    }

    private int getButtonRadius() {
        AppDownloadButton appDownloadButton = getAppDownloadButton();
        if (appDownloadButton == null) {
            return 0;
        }
        return appDownloadButton.getRoundRadius();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getClickDestination() {
        if (this.R == 9) {
            return com.huawei.openalliance.ad.constant.v.I;
        }
        return com.huawei.openalliance.ad.constant.v.B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCancelDownloadButtonVisibility(AppStatus appStatus) {
        AppInfo j02;
        if (appStatus == AppStatus.DOWNLOAD && (j02 = this.f23146z.j0()) != null && j02.d0()) {
            new cf(this.f23140s).a(j02);
        }
    }

    public int a(Context context) {
        if (this.M == 1) {
            return R.layout.hiad_landing_app_detail_half;
        }
        return R.layout.hiad_landing_app_detail;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout, ka.zi] */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout, ka.zi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView.b():void");
    }

    public void c(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f20q0);
            if (obtainStyledAttributes != null) {
                try {
                    int integer = obtainStyledAttributes.getInteger(0, 0);
                    this.M = integer;
                    n7.c("PPSAppDetailView", "FullScreen %s", Integer.valueOf(integer));
                } finally {
                }
            }
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f16m0);
            if (obtainStyledAttributes != null) {
                try {
                    int integer2 = obtainStyledAttributes.getInteger(0, 0);
                    this.V = integer2;
                    n7.c("PPSAppDetailView", "detailViewType %d", Integer.valueOf(integer2));
                } finally {
                }
            }
        }
    }

    public final void d(ImageView imageView, String str, com.huawei.openalliance.ad.ppskit.utils.n1 n1Var) {
        if (!TextUtils.isEmpty(str) && imageView != null) {
            n7.e("PPSAppDetailView", "load app icon:" + y1.j(str));
            p2.a(new h(str, n1Var), 4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction() & com.anythink.expressad.exoplayer.k.p.f9095b;
            if (action == 0) {
                MaterialClickInfo h02 = a0.a.h0(this, motionEvent);
                AppDownloadButton appDownloadButton = this.f23141t;
                if (appDownloadButton != null) {
                    appDownloadButton.setClickInfo(h02);
                }
            }
            if (1 == action) {
                MaterialClickInfo h03 = a0.a.h0(this, motionEvent);
                AppDownloadButton appDownloadButton2 = this.f23141t;
                if (appDownloadButton2 != null && appDownloadButton2.getClickInfo() != null) {
                    if (h03 != null) {
                        this.f23141t.getClickInfo().e(h03.i());
                        this.f23141t.getClickInfo().g(h03.j());
                    }
                    this.f23141t.getClickInfo().c(oa.a.f33786c);
                    this.f23141t.getClickInfo().b(Float.valueOf(i2.i(getContext())));
                }
            }
        } catch (Throwable th) {
            n7.h("PPSAppDetailView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout, ka.zi] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout, ka.zi] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout, ka.zi] */
    public final void g() {
        k();
        ?? r02 = this.O;
        if (r02 != 0 && !r02.e()) {
            this.O.setAutoRepeat(true);
            n7.e("PPSAppDetailView", "start animation.");
            try {
                this.O.p((RelativeLayout) findViewById(R.id.app_download_btn_rl), this.f23146z);
            } catch (Throwable th) {
                n7.h("PPSAppDetailView", "start animation error: %s", th.getClass().getSimpleName());
            }
        }
    }

    public AppDownloadButton getAppDownloadButton() {
        return this.f23141t;
    }

    public AppInfo getAppInfo() {
        return this.f23145x;
    }

    public int getDetailStyle() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout, ka.zi] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout, ka.zi] */
    public final void h() {
        ?? r02 = this.O;
        if (r02 != 0 && r02.e()) {
            n7.e("PPSAppDetailView", "stop animation.");
            this.O.b();
        }
    }

    public final boolean i() {
        boolean z10;
        boolean z11;
        ContentRecord contentRecord = this.f23146z;
        if (contentRecord == null) {
            return false;
        }
        Integer q10 = androidx.transition.n.q(16, 0, contentRecord.q0());
        if (q10 == null || 1 == q10.intValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Integer q11 = androidx.transition.n.q(16, 0, this.f23146z.q0());
            if (q11 != null && 2 == q11.intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 || this.V != 1) {
                return false;
            }
        }
        return true;
    }

    public final void k() {
        AppDownloadButton appDownloadButton;
        c1 e1Var;
        ka.l lVar = this.N;
        if (lVar != null && this.f23141t != null) {
            if (lVar.g()) {
                appDownloadButton = this.f23141t;
                e1Var = new f1(this.f23140s);
            } else {
                appDownloadButton = this.f23141t;
                e1Var = new e1(this.f23140s);
            }
            appDownloadButton.setAppDownloadButtonStyle(e1Var);
            this.f23141t.l();
        }
    }

    public final boolean l() {
        AppDownloadButton appDownloadButton;
        if (this.f23146z == null || this.O == null || (appDownloadButton = this.f23141t) == null) {
            return false;
        }
        AppStatus l10 = appDownloadButton.l();
        if (l10 != AppStatus.DOWNLOAD && l10 != AppStatus.INSTALLED) {
            return false;
        }
        return true;
    }

    public void setAdLandingData(ContentRecord contentRecord) {
        String str;
        if (contentRecord == null) {
            return;
        }
        try {
            n7.e("PPSAppDetailView", "set ad landing data");
            this.f23146z = contentRecord;
            this.f23145x = contentRecord.j0();
            this.K = contentRecord.h1();
            if (this.f23145x == null) {
                n7.b("PPSAppDetailView", "appInfo is null, hide appDetailView");
                View view = this.A;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else {
                b();
            }
            MetaData X1 = contentRecord.X1();
            if (X1 != null) {
                this.L = y1.p(X1.a());
            }
            this.U = contentRecord.L0();
        } catch (RuntimeException unused) {
            str = "setAdLandingPageData RuntimeException";
            n7.g("PPSAppDetailView", str);
        } catch (Exception unused2) {
            str = "setAdLandingPageData error";
            n7.g("PPSAppDetailView", str);
        }
    }

    public void setAppDetailClickListener(xi xiVar) {
        this.H = xiVar;
    }

    public void setAppIconImageDrawable(Drawable drawable) {
        ImageView imageView = this.f23142u;
        if (imageView != null && drawable != null) {
            imageView.setBackground(null);
            this.f23142u.setImageDrawable(drawable);
        }
    }

    public void setAppRelated(boolean z10) {
        this.F = z10;
    }

    public void setDetailViewType(int i10) {
        this.V = i10;
    }

    public void setInterType(int i10) {
        this.R = i10;
    }

    public void setLoadAppIconSelf(boolean z10) {
        this.G = z10;
    }

    public void setNeedPerBeforDownload(boolean z10) {
        this.J = z10;
    }

    public void setNeedShowDspInfo(boolean z10) {
        this.f23144w = z10;
    }

    public void setOnNonWifiDownloadListener(va.b bVar) {
        this.I = bVar;
    }
}
