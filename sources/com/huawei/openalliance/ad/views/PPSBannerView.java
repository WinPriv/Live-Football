package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.ads.ChoicesView;
import com.huawei.hms.ads.RequestOptions;
import com.huawei.hms.ads.banner.R;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.cz;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fx;
import com.huawei.hms.ads.gk;
import com.huawei.hms.ads.hk;
import com.huawei.hms.ads.hl;
import com.huawei.hms.ads.ia;
import com.huawei.hms.ads.je;
import com.huawei.hms.ads.jv;
import com.huawei.hms.ads.reward.RewardVerifyConfig;
import com.huawei.hms.ads.whythisad.CusWhyThisAdView;
import com.huawei.openalliance.ad.constant.ag;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PPSBannerView extends RelativeLayout implements gk, jv {
    public PPSNativeView A;
    public ImageView B;
    public ImageView C;
    public ChoicesView D;
    public CusWhyThisAdView E;
    public ImageView F;
    public boolean G;
    public LinearLayout H;
    public LinearLayout I;
    public PPSLabelView J;
    public TextView K;
    public AutoScaleSizeRelativeLayout L;
    public com.huawei.openalliance.ad.inter.data.e M;
    public com.huawei.openalliance.ad.inter.data.e N;
    public int O;
    public ec P;
    public String Q;
    public ImageView R;
    public final byte[] S;
    public boolean T;
    public String U;
    public d V;
    public c W;

    /* renamed from: c0, reason: collision with root package name */
    public int f23768c0;

    /* renamed from: d0, reason: collision with root package name */
    public List<String> f23769d0;

    /* renamed from: e0, reason: collision with root package name */
    public String f23770e0;

    /* renamed from: f0, reason: collision with root package name */
    public String f23771f0;

    /* renamed from: g0, reason: collision with root package name */
    public RequestOptions f23772g0;

    /* renamed from: h0, reason: collision with root package name */
    public Location f23773h0;

    /* renamed from: i0, reason: collision with root package name */
    public com.huawei.openalliance.ad.inter.data.n f23774i0;

    /* renamed from: j0, reason: collision with root package name */
    public Integer f23775j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f23776k0;

    /* renamed from: l0, reason: collision with root package name */
    public RewardVerifyConfig f23777l0;

    /* renamed from: m0, reason: collision with root package name */
    public final a f23778m0;

    /* renamed from: n0, reason: collision with root package name */
    public b f23779n0;

    /* renamed from: s, reason: collision with root package name */
    public ia f23780s;

    /* renamed from: t, reason: collision with root package name */
    public long f23781t;

    /* renamed from: u, reason: collision with root package name */
    public long f23782u;

    /* renamed from: v, reason: collision with root package name */
    public String f23783v;

    /* renamed from: w, reason: collision with root package name */
    public ga.c f23784w;

    /* renamed from: x, reason: collision with root package name */
    public ga.k f23785x;
    public com.huawei.openalliance.ad.inter.data.b y;

    /* renamed from: z, reason: collision with root package name */
    public PPSNativeView f23786z;

    /* loaded from: classes2.dex */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            PPSBannerView pPSBannerView = PPSBannerView.this;
            if (i10 != 1000) {
                if (i10 == 1001) {
                    pPSBannerView.d(1, pPSBannerView.M, null);
                    return;
                }
                return;
            }
            pPSBannerView.b();
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        STARTED,
        PAUSED,
        RESUMED,
        DESTROYED
    }

    /* loaded from: classes2.dex */
    public enum d {
        IDLE,
        LOADING
    }

    public PPSBannerView(Context context) {
        super(context);
        com.huawei.openalliance.ad.inter.data.b bVar = com.huawei.openalliance.ad.inter.data.b.f22255e;
        this.y = bVar;
        this.G = true;
        this.O = 0;
        this.S = new byte[0];
        this.T = true;
        this.V = d.IDLE;
        this.W = c.STARTED;
        this.f23768c0 = 0;
        this.f23776k0 = 0.05f;
        this.f23778m0 = new a(this);
        this.f23779n0 = new b(Looper.myLooper());
        this.f23780s = new ia(context, this);
        ec Code = ec.Code(context);
        this.P = Code;
        this.f23776k0 = Code.s();
        View.inflate(context, R.layout.hiad_view_banner_ad, this);
        this.f23786z = (PPSNativeView) findViewById(R.id.hiad_banner_layout_1);
        this.A = (PPSNativeView) findViewById(R.id.hiad_banner_layout_2);
        this.B = (ImageView) findViewById(R.id.hiad_banner_image_1);
        this.C = (ImageView) findViewById(R.id.hiad_banner_image_2);
        this.I = (LinearLayout) findViewById(R.id.custom_ad_bg_layout);
        this.H = (LinearLayout) findViewById(R.id.custom_ad_bg_layout_container);
        this.J = (PPSLabelView) findViewById(R.id.hiad_ad_label);
        this.K = (TextView) findViewById(R.id.hiad_ad_source);
        this.R = (ImageView) findViewById(R.id.compliance_icon_banner);
        this.L = (AutoScaleSizeRelativeLayout) findViewById(R.id.hiad_banner_ad);
        setAdViewParam(context);
        this.L.setVisibility(8);
        boolean V = cl.Code(context).V();
        this.G = V;
        ex.Code("PPSBannerView", "isChinaRom = %s", Boolean.valueOf(V));
        if (!this.G) {
            if (this.E == null) {
                CusWhyThisAdView cusWhyThisAdView = new CusWhyThisAdView(getContext(), this.L);
                this.E = cusWhyThisAdView;
                cusWhyThisAdView.setOnCloseCallBack(new f(this));
                this.L.addView(this.E);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.E.getLayoutParams());
                layoutParams.addRule(13);
                this.E.setLayoutParams(layoutParams);
            } else {
                ex.Code("PPSBannerView", "SDK-banner cusWhyView is not null");
            }
            ex.Code("PPSBannerView", "initChoicesView start");
            if (this.D == null) {
                ChoicesView choicesView = new ChoicesView(getContext());
                this.D = choicesView;
                choicesView.setId(R.id.hiad_choice_view);
                this.L.addView(this.D);
            }
            this.D.setOnClickListener(new e(this));
            if (bVar == getBannerSize()) {
                this.D.V();
                this.D.Code(R.dimen.hiad_banner_choice_view_size);
            }
            if (this.R != null) {
                ex.V("PPSBannerView", "init compliance activity");
                this.R.setOnClickListener(new com.huawei.openalliance.ad.views.d(this));
            }
        } else {
            ImageView imageView = (ImageView) findViewById(R.id.hiad_banner_close_button);
            this.F = imageView;
            imageView.setOnClickListener(new com.huawei.openalliance.ad.views.b(this));
        }
        PPSNativeView pPSNativeView = this.f23786z;
        pPSNativeView.setOnNativeAdImpressionListener(new com.huawei.openalliance.ad.views.c(this, pPSNativeView));
        PPSNativeView pPSNativeView2 = this.A;
        pPSNativeView2.setOnNativeAdImpressionListener(new com.huawei.openalliance.ad.views.c(this, pPSNativeView2));
    }

    public static long a(com.huawei.openalliance.ad.inter.data.e eVar) {
        long j10 = 0;
        if (eVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long f = eVar.f();
            if (currentTimeMillis < f) {
                j10 = f - currentTimeMillis;
            }
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("calcAdLeftTime,currentTime:", currentTimeMillis, ",expireTime:");
            k10.append(f);
            k10.append(",leftTime:");
            k10.append(j10);
            ex.Code("PPSBannerView", k10.toString());
        }
        return j10;
    }

    public static boolean f(String str, List list) {
        ex.Code("PPSBannerView", "invalidcontentIds is %s", list);
        ex.Code("PPSBannerView", "currentContentId is %s", str);
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty() && list.contains(str)) {
            return true;
        }
        return false;
    }

    private d getAdLoadState() {
        d dVar;
        synchronized (this.S) {
            dVar = this.V;
        }
        return dVar;
    }

    private int getBannerVisibility() {
        int i10;
        synchronized (this.S) {
            i10 = this.f23768c0;
        }
        return i10;
    }

    public static void l(PPSBannerView pPSBannerView) {
        CusWhyThisAdView cusWhyThisAdView = pPSBannerView.E;
        if (cusWhyThisAdView != null) {
            ViewGroup viewGroup = (ViewGroup) cusWhyThisAdView.getParent();
            if (viewGroup != null) {
                pPSBannerView.setChildrenViewsInVisible(viewGroup);
            }
            pPSBannerView.E.setVisibility(0);
        }
        AutoScaleSizeRelativeLayout autoScaleSizeRelativeLayout = pPSBannerView.L;
        if (autoScaleSizeRelativeLayout != null) {
            autoScaleSizeRelativeLayout.setBackgroundColor(pPSBannerView.getResources().getColor(R.color.hiad_whythisad_root_bg));
        }
    }

    private void setAdLoadState(d dVar) {
        synchronized (this.S) {
            this.V = dVar;
        }
    }

    private void setAdViewParam(Context context) {
        AutoScaleSizeRelativeLayout autoScaleSizeRelativeLayout = this.L;
        if (autoScaleSizeRelativeLayout != null && this.y != null && context != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) autoScaleSizeRelativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.L.setLayoutParams(layoutParams);
            AutoScaleSizeRelativeLayout autoScaleSizeRelativeLayout2 = this.L;
            com.huawei.openalliance.ad.inter.data.b bVar = this.y;
            autoScaleSizeRelativeLayout2.setRatio(Float.valueOf((bVar.f22256a * 1.0f) / bVar.f22257b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerVisibility(int i10) {
        synchronized (this.S) {
            this.f23768c0 = i10;
        }
    }

    private void setChildrenViewsInVisible(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                viewGroup.getChildAt(i10).setVisibility(4);
            }
        }
    }

    private void setChoiceViewPosition(int i10) {
        ex.Code("PPSBannerView", "bannerView option = %s", Integer.valueOf(i10));
        if (this.D != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.D.getLayoutParams());
            Resources resources = getResources();
            int i11 = R.dimen.hiad_banner_choice_custom_margin;
            int dimensionPixelOffset = resources.getDimensionPixelOffset(i11);
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(i11);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(21);
                            layoutParams.setMargins(0, dimensionPixelOffset2, dimensionPixelOffset, 0);
                        } else {
                            this.D.setVisibility(8);
                            this.D.setLayoutParams(layoutParams);
                            this.D.bringToFront();
                            return;
                        }
                    } else {
                        layoutParams.addRule(12);
                        layoutParams.addRule(20);
                        layoutParams.setMargins(dimensionPixelOffset, 0, 0, dimensionPixelOffset2);
                    }
                } else {
                    layoutParams.addRule(12);
                    layoutParams.addRule(21);
                    layoutParams.setMargins(0, 0, dimensionPixelOffset, dimensionPixelOffset2);
                }
                layoutParams.setMarginEnd(dimensionPixelOffset);
                this.D.setLayoutParams(layoutParams);
                this.D.bringToFront();
                return;
            }
            layoutParams.addRule(10);
            layoutParams.addRule(20);
            layoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset2, 0, 0);
            layoutParams.setMarginStart(dimensionPixelOffset);
            this.D.setLayoutParams(layoutParams);
            this.D.bringToFront();
            return;
        }
        ex.Code("PPSBannerView", "choicesView is null, error");
    }

    @Override // com.huawei.hms.ads.jv
    public final void B() {
        String str;
        com.huawei.openalliance.ad.inter.data.e eVar = this.M;
        if (eVar instanceof com.huawei.openalliance.ad.inter.data.j) {
            str = ((com.huawei.openalliance.ad.inter.data.j) eVar).i_();
        } else {
            str = "";
        }
        cz.Code(getContext(), str, this.f23783v, 8, 499, "Fail to display ad because of missing presentation material");
    }

    public final boolean C() {
        if (getAdLoadState() == d.LOADING) {
            return true;
        }
        return false;
    }

    @Override // com.huawei.hms.ads.jv
    public final void Code(int i10) {
        ex.Code("PPSBannerView", "onReqAdFail ");
        if (f(this.f23770e0, this.f23769d0)) {
            d(2, this.M, null);
            c(1, ag.R, false);
        } else {
            c(1, i10, m());
        }
        setAdLoadState(d.IDLE);
    }

    public final void S() {
        PPSNativeView pPSNativeView = this.f23786z;
        if (pPSNativeView != null) {
            pPSNativeView.S();
        }
        PPSNativeView pPSNativeView2 = this.A;
        if (pPSNativeView2 != null) {
            pPSNativeView2.S();
        }
    }

    public final void b() {
        int i10 = 1;
        if (!this.f23780s.C()) {
            c(1, 1001, m());
            return;
        }
        if (getAdLoadState() == d.IDLE) {
            setAdLoadState(d.LOADING);
            ArrayList arrayList = new ArrayList();
            String str = this.f23770e0;
            if (str != null && !str.isEmpty()) {
                arrayList.add(this.f23770e0);
            } else {
                arrayList = null;
            }
            this.f23780s.Code(this.f23773h0);
            this.f23780s.Code(this.f23772g0);
            this.f23780s.Code(this.f23774i0);
            this.f23780s.Code(this.f23775j0);
            this.f23780s.V(Integer.valueOf(this.y.f22256a));
            this.f23780s.I(Integer.valueOf(this.y.f22257b));
            this.f23780s.V(this.U);
            if (this.f23781t == 0) {
                i10 = 0;
            }
            this.f23780s.Code(this.f23783v, 8, arrayList, i10);
            j();
            return;
        }
        ex.I("PPSBannerView", "ad is loading now!");
        c(1, ag.N, m());
    }

    public final void c(int i10, int i11, boolean z10) {
        ex.Code("PPSBannerView", "notifyResult isRefreshAd:%s,resultType:%s", Boolean.valueOf(z10), Integer.valueOf(i10));
        ga.c cVar = this.f23784w;
        if (cVar != null) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        cVar.b();
                    }
                } else {
                    cVar.Code(i11);
                }
            } else {
                cVar.F();
            }
        }
        if (!z10) {
            k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        r4.Code(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r4, com.huawei.openalliance.ad.inter.data.e r5, java.util.ArrayList r6) {
        /*
            r3 = this;
            com.huawei.openalliance.ad.views.AutoScaleSizeRelativeLayout r0 = r3.L
            if (r0 == 0) goto L72
            r1 = 2
            r2 = 1
            if (r4 == 0) goto L41
            java.lang.String r6 = "PPSBannerView"
            if (r4 == r2) goto L24
            if (r4 == r1) goto Lf
            goto L53
        Lf:
            com.huawei.hms.ads.ia r4 = r3.f23780s
            if (r4 == 0) goto L53
            if (r5 == 0) goto L53
            java.lang.String r4 = "reportAdCancelled"
            com.huawei.hms.ads.ex.Code(r6, r4)
            com.huawei.hms.ads.ia r4 = r3.f23780s
            java.lang.String r6 = "49"
            r0 = 0
            r4.Code(r6, r5, r0)
            goto L53
        L24:
            int r4 = r0.getVisibility()
            if (r4 != 0) goto L53
            com.huawei.hms.ads.ia r4 = r3.f23780s
            if (r4 == 0) goto L53
            if (r5 == 0) goto L53
            java.lang.String r4 = "reportAdExpire"
            com.huawei.hms.ads.ex.Code(r6, r4)
            com.huawei.hms.ads.ia r4 = r3.f23780s
            long r0 = r5.f()
            java.lang.String r6 = "48"
            r4.Code(r6, r5, r0)
            goto L53
        L41:
            int r4 = r3.O
            int r4 = r4 - r2
            int r4 = r4 % r1
            if (r4 != 0) goto L4c
            com.huawei.openalliance.ad.views.PPSNativeView r4 = r3.f23786z
            if (r4 == 0) goto L53
            goto L50
        L4c:
            com.huawei.openalliance.ad.views.PPSNativeView r4 = r3.A
            if (r4 == 0) goto L53
        L50:
            r4.Code(r6)
        L53:
            com.huawei.openalliance.ad.views.PPSNativeView r4 = r3.f23786z
            r5 = 8
            if (r4 == 0) goto L5c
            r4.setVisibility(r5)
        L5c:
            com.huawei.openalliance.ad.views.PPSNativeView r4 = r3.A
            if (r4 == 0) goto L63
            r4.setVisibility(r5)
        L63:
            com.huawei.openalliance.ad.views.AutoScaleSizeRelativeLayout r4 = r3.L
            r4.setVisibility(r5)
            com.huawei.openalliance.ad.views.PPSBannerView$a r4 = r3.f23778m0
            if (r4 == 0) goto L6f
            r4.onGlobalLayout()
        L6f:
            r3.S()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.PPSBannerView.d(int, com.huawei.openalliance.ad.inter.data.e, java.util.ArrayList):void");
    }

    public final void g(long j10) {
        b bVar = this.f23779n0;
        if (bVar == null) {
            return;
        }
        if (bVar.hasMessages(1000)) {
            this.f23779n0.removeMessages(1000);
        }
        if (getBannerVisibility() != 4 && getBannerState() != c.PAUSED && getBannerState() != c.DESTROYED) {
            if (0 != j10) {
                ex.V("PPSBannerView", "start refreshAd ad will be refreshed in %s", Long.valueOf(j10));
                this.f23779n0.sendEmptyMessageDelayed(1000, j10 * 1000);
                return;
            }
            return;
        }
        ex.V("PPSBannerView", "stopRefreshAd");
    }

    public String getAdId() {
        return this.f23783v;
    }

    public long getBannerRefresh() {
        return this.f23781t;
    }

    public com.huawei.openalliance.ad.inter.data.b getBannerSize() {
        return this.y;
    }

    public c getBannerState() {
        c cVar;
        synchronized (this.S) {
            cVar = this.W;
        }
        return cVar;
    }

    public Integer getIsSmart() {
        return this.f23775j0;
    }

    public Location getLocation() {
        return this.f23773h0;
    }

    public RequestOptions getRequestOptions() {
        return this.f23772g0;
    }

    public final long h(long j10) {
        ec ecVar;
        if (0 == j10 || (ecVar = this.P) == null) {
            return 0L;
        }
        long n10 = ecVar.n();
        long p10 = this.P.p();
        if (ex.Code()) {
            ex.Code("PPSBannerView", "setBannerRefresh,minInterval:%s,maxInterval:%s", Long.valueOf(n10), Long.valueOf(p10));
        }
        if (n10 > p10) {
            return 0L;
        }
        if (j10 >= n10) {
            return Math.min(j10, p10);
        }
        return n10;
    }

    public final void i(PPSNativeView pPSNativeView) {
        hl adSessionAgent = pPSNativeView.getAdSessionAgent();
        if (adSessionAgent != null) {
            adSessionAgent.Code(this.F, hk.CLOSE_AD, null);
            PPSLabelView pPSLabelView = this.J;
            hk hkVar = hk.OTHER;
            adSessionAgent.Code(pPSLabelView, hkVar, null);
            adSessionAgent.Code(this.K, hkVar, null);
            adSessionAgent.Code(this.D, hkVar, null);
            adSessionAgent.Code(this.E, hkVar, null);
        }
    }

    public final void j() {
        long j10 = this.f23781t;
        if (j10 == 0) {
            j10 = this.f23782u;
        }
        g(j10);
    }

    public final void k() {
        b bVar = this.f23779n0;
        if (bVar != null && bVar.hasMessages(1000)) {
            ex.V("PPSBannerView", "stopRefreshAd");
            this.f23779n0.removeMessages(1000);
        }
    }

    public final boolean m() {
        if (this.f23781t <= 0 && this.f23782u <= 0) {
            return false;
        }
        return true;
    }

    public final void n() {
        if (this.f23779n0 != null && this.M != null && !m()) {
            if (this.f23779n0.hasMessages(1001)) {
                this.f23779n0.removeMessages(1001);
            }
            ex.Code("PPSBannerView", "start closeAdWhenExpire");
            this.f23779n0.sendEmptyMessageDelayed(1001, a(this.M));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f23778m0;
        if (aVar != null) {
            aVar.D();
        }
        je.Code(getContext()).V(getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f23778m0;
        if (aVar != null) {
            aVar.L();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        a aVar = this.f23778m0;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setAdContainerSizeMatched(boolean z10) {
        this.T = z10;
    }

    public void setAdId(String str) {
        this.f23783v = str;
    }

    public void setAdListener(ga.c cVar) {
        this.f23784w = cVar;
    }

    public void setBannerRefresh(long j10) {
        long h10 = h(j10);
        this.f23781t = h10;
        ex.V("PPSBannerView", "setBannerRefresh:%s", Long.valueOf(h10));
    }

    public void setBannerSize(com.huawei.openalliance.ad.inter.data.b bVar) {
        this.y = bVar;
        setAdViewParam(getContext());
    }

    public void setBannerState(c cVar) {
        synchronized (this.S) {
            this.W = cVar;
        }
    }

    public void setContentBundle(String str) {
        this.U = str;
    }

    public void setIsSmart(Integer num) {
        this.f23775j0 = num;
    }

    public void setLocation(Location location) {
        this.f23773h0 = location;
    }

    public void setOnBannerAdStatusTrackingListener(ga.k kVar) {
        this.f23785x = kVar;
    }

    public void setRequestOptions(RequestOptions requestOptions) {
        this.f23772g0 = requestOptions;
    }

    public void setRewardVerifyConfig(RewardVerifyConfig rewardVerifyConfig) {
        this.f23777l0 = rewardVerifyConfig;
    }

    public void setTargetingInfo(com.huawei.openalliance.ad.inter.data.n nVar) {
        this.f23774i0 = nVar;
    }

    /* loaded from: classes2.dex */
    public class a extends fx {
        public a(View view) {
            super(view);
        }

        @Override // com.huawei.hms.ads.fx
        public final void Code() {
            ex.Code("PPSBannerView", "onViewShowStart");
            PPSBannerView pPSBannerView = PPSBannerView.this;
            pPSBannerView.setBannerVisibility(0);
            pPSBannerView.j();
            pPSBannerView.n();
        }

        @Override // com.huawei.hms.ads.fx
        public final void Code(long j10, int i10) {
            ex.Code("PPSBannerView", "onViewShowEnd");
            PPSBannerView pPSBannerView = PPSBannerView.this;
            pPSBannerView.setBannerVisibility(4);
            pPSBannerView.k();
            b bVar = pPSBannerView.f23779n0;
            if (bVar == null || !bVar.hasMessages(1001)) {
                return;
            }
            ex.Code("PPSBannerView", "stopCloseAdWhenExpire");
            pPSBannerView.f23779n0.removeMessages(1001);
        }
    }

    @Override // com.huawei.hms.ads.jv
    public final void Code(long j10) {
        this.f23782u = h(j10);
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    @Override // com.huawei.hms.ads.jv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Code(android.graphics.drawable.Drawable r12, com.huawei.openalliance.ad.inter.data.e r13) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.PPSBannerView.Code(android.graphics.drawable.Drawable, com.huawei.openalliance.ad.inter.data.e):void");
    }

    @Override // com.huawei.hms.ads.jv
    public final void Code(List<String> list) {
        this.f23769d0 = list;
    }

    @Override // com.huawei.hms.ads.gk
    public View getOpenMeasureView() {
        return this;
    }
}
