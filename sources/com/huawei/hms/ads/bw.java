package com.huawei.hms.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.ads.nativead.DislikeAdListener;
import com.huawei.hms.ads.nativead.DislikeAdReason;
import com.huawei.hms.ads.nativead.IUnityNativeAdPresenter;
import com.huawei.hms.ads.nativead.MediaContent;
import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.hms.ads.nativead.NativeAdConfiguration;
import com.huawei.hms.ads.nativead.NativeAdMonitor;
import com.huawei.hms.ads.nativead.NativeView;
import com.huawei.hms.ads.nativead.c;
import com.huawei.hms.ads.reward.RewardVerifyConfig;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.views.PPSNativeView;
import gb.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bw extends NativeAd implements IUnityNativeAdPresenter, PPSNativeView.j, PPSNativeView.m {
    private VideoOperator D;
    private NativeView I;
    private DislikeAdListener L;
    private Image S;
    private com.huawei.openalliance.ad.inter.data.j V;
    private NativeAdMonitor Z;

    /* renamed from: a, reason: collision with root package name */
    private boolean f21569a;

    /* renamed from: b, reason: collision with root package name */
    private AdListener f21570b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21571c;

    /* renamed from: d, reason: collision with root package name */
    private String f21572d;

    /* renamed from: e, reason: collision with root package name */
    private Context f21573e;
    private AdFeedbackListener f;
    private List<DislikeAdReason> B = new ArrayList();
    private List<Image> C = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private DislikeAdListener f21574g = new DislikeAdListener() { // from class: com.huawei.hms.ads.bw.1
        @Override // com.huawei.hms.ads.nativead.DislikeAdListener
        public void onAdDisliked() {
            if (bw.this.L != null) {
                bw.this.L.onAdDisliked();
            }
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private AdFeedbackListener f21575h = new AdFeedbackListener() { // from class: com.huawei.hms.ads.bw.2
        @Override // com.huawei.hms.ads.AdFeedbackListener
        public void onAdDisliked() {
            if (bw.this.f != null) {
                bw.this.f.onAdDisliked();
            }
        }

        @Override // com.huawei.hms.ads.AdFeedbackListener
        public void onAdFeedbackShowFailed() {
            if (bw.this.f != null) {
                bw.this.f.onAdFeedbackShowFailed();
            }
        }

        @Override // com.huawei.hms.ads.AdFeedbackListener
        public void onAdLiked() {
            if (bw.this.f != null) {
                bw.this.f.onAdLiked();
            }
        }
    };

    public bw(Context context, com.huawei.openalliance.ad.inter.data.e eVar) {
        this.f21573e = context;
        if (eVar != null && (eVar instanceof com.huawei.openalliance.ad.inter.data.j)) {
            com.huawei.openalliance.ad.inter.data.j jVar = (com.huawei.openalliance.ad.inter.data.j) eVar;
            this.V = jVar;
            this.f21572d = jVar.L();
        }
    }

    private boolean C() {
        NativeAdConfiguration nativeAdConfiguration;
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null && (nativeAdConfiguration = jVar.J) != null) {
            return nativeAdConfiguration.isReturnUrlsForImages();
        }
        return false;
    }

    private Context S() {
        NativeView nativeView = this.I;
        if (nativeView != null) {
            return nativeView.getContext();
        }
        return this.f21573e;
    }

    @Override // com.huawei.openalliance.ad.views.PPSNativeView.m
    public void B() {
        AdListener adListener = this.f21570b;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSNativeView.m
    public void I() {
        AdListener adListener = this.f21570b;
        if (adListener != null) {
            adListener.onAdLeave();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSNativeView.m
    public void Z() {
        AdListener adListener = this.f21570b;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public void destroy() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null) {
            jVar.getClass();
        }
        this.I = null;
        this.Z = null;
        this.L = null;
        this.f = null;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public void dislikeAd(DislikeAdReason dislikeAdReason) {
        if (!isCustomDislikeThisAdEnabled()) {
            return;
        }
        NativeView nativeView = this.I;
        if (nativeView != null) {
            if (dislikeAdReason == null) {
                nativeView.F();
            } else {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(dislikeAdReason.getDescription())) {
                    arrayList.add(dislikeAdReason.getDescription());
                }
                this.I.Code(arrayList);
            }
        }
        NativeAdMonitor nativeAdMonitor = this.Z;
        if (nativeAdMonitor != null) {
            if (dislikeAdReason == null) {
                nativeAdMonitor.Z();
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!TextUtils.isEmpty(dislikeAdReason.getDescription())) {
                arrayList2.add(dislikeAdReason.getDescription());
            }
            this.Z.Code(arrayList2);
        }
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getAbilityDetailInfo() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        return jVar.P();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getAdSign() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return "2";
        }
        return jVar.a();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getAdSource() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        return jVar.d();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public List<AdvertiserInfo> getAdvertiserInfo() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        return jVar.E();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public AppInfo getAppInfo() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        return new AppInfo(jVar.w());
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getCallToAction() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        return ch.Code(this.f21573e, jVar.w(), this.V.D());
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public NativeAd.ChoicesInfo getChoicesInfo() {
        return new a();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public int getCreativeType() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return -1;
        }
        return jVar.b();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getDescription() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        return jVar.F();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public List<DislikeAdReason> getDislikeAdReasons() {
        if (this.V != null && isCustomDislikeThisAdEnabled()) {
            if (androidx.transition.n.h(this.B)) {
                this.B = new ArrayList();
                List<String> l10 = this.V.l();
                if (androidx.transition.n.h(l10)) {
                    return new ArrayList();
                }
                for (String str : l10) {
                    if (!TextUtils.isEmpty(str)) {
                        this.B.add(new bu(str));
                    }
                }
            }
            return this.B;
        }
        return new ArrayList();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getDspLogo() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        return jVar.N();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getDspName() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        return jVar.M();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public Map<String, String> getExt() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        return jVar.c0();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public Bundle getExtraBundle() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return new Bundle();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getHwChannelId() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        return jVar.Q();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public Image getIcon() {
        com.huawei.openalliance.ad.inter.data.h I;
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        if (this.S == null && (I = jVar.I()) != null) {
            u uVar = new u(I, C());
            this.S = uVar;
            uVar.Code(this.f21572d);
        }
        return this.S;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public List<Image> getImages() {
        if (this.V == null) {
            return new ArrayList();
        }
        if (androidx.transition.n.h(this.C)) {
            this.C = new ArrayList();
            List<com.huawei.openalliance.ad.inter.data.h> Z = this.V.Z();
            if (androidx.transition.n.h(Z)) {
                return new ArrayList();
            }
            boolean C = C();
            for (com.huawei.openalliance.ad.inter.data.h hVar : Z) {
                if (hVar != null) {
                    u uVar = new u(hVar, C);
                    uVar.Code(this.f21572d);
                    this.C.add(uVar);
                }
            }
        }
        return this.C;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getMarket() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public MediaContent getMediaContent() {
        VideoOperator videoOperator = getVideoOperator();
        if (videoOperator instanceof c) {
            return ((c) videoOperator).Code();
        }
        return null;
    }

    @Override // com.huawei.hms.ads.nativead.IUnityNativeAdPresenter
    public int getMinEffectiveShowRatio() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null && jVar.y()) {
            return this.V.t();
        }
        return 0;
    }

    @Override // com.huawei.hms.ads.nativead.IUnityNativeAdPresenter
    public long getMinEffectiveShowTime() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null && jVar.y()) {
            return this.V.s();
        }
        return 0L;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getPrice() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public Double getRating() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getTitle() {
        MetaData h_;
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        if (jVar.f22272s == null && (h_ = jVar.h_()) != null) {
            jVar.f22272s = gb.p.j(h_.A());
        }
        return jVar.f22272s;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getUniqueId() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return null;
        }
        return jVar.v();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public Video getVideo() {
        com.huawei.openalliance.ad.inter.data.p B;
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null || (B = jVar.B()) == null) {
            return null;
        }
        return new w(B);
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public VideoOperator getVideoOperator() {
        if (this.D == null) {
            this.D = new c(new bx(this));
        }
        return this.D;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public String getWhyThisAd() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return com.huawei.openalliance.ad.constant.w.al;
        }
        return jVar.h();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public void gotoWhyThisAdPage(Context context) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return;
        }
        jVar.Code(context);
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public boolean hasAdvertiserInfo() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return false;
        }
        return jVar.b0();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public boolean isAutoDownloadApp() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return false;
        }
        return jVar.l_();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public boolean isCustomClickAllowed() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null && jVar.y() && this.f21571c) {
            return true;
        }
        return false;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public boolean isCustomDislikeThisAdEnabled() {
        return this.f21569a;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public boolean isShowAppElement() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return false;
        }
        return jVar.T();
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public void onAdClose(Context context, List<String> list) {
        com.huawei.openalliance.ad.inter.data.j jVar;
        if (context != null && (jVar = this.V) != null) {
            if (context != null) {
                if (jVar.y()) {
                    new h(context, jVar).Code(list);
                    return;
                }
                return;
            }
            jVar.getClass();
        }
    }

    @Override // com.huawei.hms.ads.nativead.IUnityNativeAdPresenter
    public boolean onUnityAdClick() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null && jVar.y()) {
            fb.m k10 = androidx.activity.n.k(this.f21573e, this.V.m(), this.V.X());
            if (k10.a()) {
                new h(this.f21573e, this.V).Code(k10.c(), a0.a.l(this.I));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.huawei.hms.ads.nativead.IUnityNativeAdPresenter
    public void onUnityAdClose(List<String> list) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null && jVar.y()) {
            new h(this.f21573e, this.V).V(list);
        }
    }

    @Override // com.huawei.hms.ads.nativead.IUnityNativeAdPresenter
    public void onUnityAdPhyShow(long j10, int i10) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null && jVar.y()) {
            new h(this.f21573e, this.V).Code(j10, i10);
        }
    }

    @Override // com.huawei.hms.ads.nativead.IUnityNativeAdPresenter
    public void onUnityAdShow(Long l10, Integer num, Integer num2) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null && jVar.y()) {
            new h(this.f21573e, this.V).Code(l10, num, num2, a0.a.l(this.I));
        }
    }

    @Override // com.huawei.hms.ads.nativead.IUnityNativeAdPresenter
    public void onUnityAdShowStart() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null && jVar.y()) {
            new h(this.f21573e, this.V).Code();
        }
    }

    @Override // com.huawei.hms.ads.nativead.IUnityNativeAdPresenter
    public void onUnityGoWhyShowThis() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null && jVar.y()) {
            if (cl.Code(this.f21573e).V()) {
                ex.I("NativeAdImpl", "china rom should not call gotoWhyThisAdPage method");
            } else {
                r0.l(this.f21573e, this.V.h());
            }
        }
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public void recordClickEvent() {
        if (isCustomClickAllowed()) {
            new h(this.f21573e, this.V).Code(a0.a.l(this.I));
        }
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public boolean recordImpressionEvent(Bundle bundle) {
        Context S;
        String jSONObject;
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null && (S = S()) != null && jVar.y()) {
            ex.V("INativeAd", "api adShow called.");
            long min = Math.min(System.currentTimeMillis() - jVar.K, jVar.s());
            AdContentData m10 = jVar.m();
            if (bundle == null) {
                jSONObject = null;
            } else {
                jSONObject = gb.p.k(bundle).toString();
            }
            jh.Code(S, m10, jSONObject, Long.valueOf(min), Integer.valueOf(jVar.t()), (Integer) 7, a0.a.k(S));
            return true;
        }
        return false;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public boolean recordShowStartEvent(Bundle bundle) {
        Context S;
        String jSONObject;
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null || (S = S()) == null || !jVar.y()) {
            return false;
        }
        jVar.K = System.currentTimeMillis();
        jVar.l(String.valueOf(System.currentTimeMillis()));
        jVar.S(jVar.K);
        ex.V("INativeAd", "api report adShowStart event.");
        if (bundle == null) {
            jSONObject = null;
        } else {
            jSONObject = gb.p.k(bundle).toString();
        }
        jh.Code(S, jVar.m(), jSONObject);
        return true;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public void recordTouchEvent(Bundle bundle) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public void setAdFeedbackListener(AdFeedbackListener adFeedbackListener) {
        this.f = adFeedbackListener;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public void setAllowCustomClick() {
        this.f21571c = true;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public void setAutoDownloadApp(boolean z10) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return;
        }
        jVar.I(z10);
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public void setDislikeAdListener(DislikeAdListener dislikeAdListener) {
        this.L = dislikeAdListener;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public void setRewardVerifyConfig(RewardVerifyConfig rewardVerifyConfig) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return;
        }
        jVar.Code(rewardVerifyConfig);
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public void showAppDetailPage(Context context) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return;
        }
        jVar.V(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.huawei.hms.ads.nativead.NativeAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void triggerClick(android.os.Bundle r4) {
        /*
            r3 = this;
            com.huawei.openalliance.ad.inter.data.j r0 = r3.V
            if (r0 == 0) goto L21
            android.content.Context r1 = r3.S()
            if (r1 == 0) goto L15
            boolean r2 = r0.y()
            if (r2 == 0) goto L18
            boolean r4 = r0.o(r1, r4)
            goto L19
        L15:
            r0.getClass()
        L18:
            r4 = 0
        L19:
            if (r4 == 0) goto L21
            r3.V()
            r3.I()
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.bw.triggerClick(android.os.Bundle):void");
    }

    @Override // com.huawei.hms.ads.nativead.IUnityNativeAdPresenter
    public void updateContent() {
        String valueOf = String.valueOf(System.currentTimeMillis());
        AdContentData m10 = this.V.m();
        if (m10 != null) {
            m10.y(valueOf);
        }
    }

    public com.huawei.openalliance.ad.inter.data.e Code() {
        return this.V;
    }

    @Override // com.huawei.openalliance.ad.views.PPSNativeView.m
    public void V() {
        AdListener adListener = this.f21570b;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd
    public boolean recordClickEvent(Bundle bundle) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            return false;
        }
        Context S = S();
        if (S != null) {
            if (jVar.y()) {
                jVar.r(S, com.huawei.openalliance.ad.constant.v.D, bundle);
                return true;
            }
        } else {
            jVar.getClass();
        }
        ex.V("INativeAd", "record click event failed.");
        return false;
    }

    @Override // com.huawei.openalliance.ad.views.PPSNativeView.j
    public void Code(View view) {
        AdListener adListener = this.f21570b;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    public void Code(AdListener adListener) {
        this.f21570b = adListener;
    }

    public void Code(NativeAdConfiguration nativeAdConfiguration) {
        if (nativeAdConfiguration == null) {
            return;
        }
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null) {
            jVar.J = nativeAdConfiguration;
        }
        Code(nativeAdConfiguration.Code());
    }

    public void Code(NativeAdMonitor nativeAdMonitor) {
        this.Z = nativeAdMonitor;
        if (nativeAdMonitor != null) {
            nativeAdMonitor.Code((PPSNativeView.m) this);
            this.Z.Code((PPSNativeView.j) this);
            this.Z.Code(this.f21574g);
        }
    }

    public void Code(NativeView nativeView) {
        this.I = nativeView;
        if (nativeView != null) {
            nativeView.setOnNativeAdStatusTrackingListener(this);
            this.I.setOnNativeAdClickListener(this);
            this.I.setDislikeAdListener(this.f21574g);
            this.I.setAdFeedbackListener(this.f21575h);
        }
    }

    public void Code(boolean z10) {
        this.f21569a = z10;
    }
}
