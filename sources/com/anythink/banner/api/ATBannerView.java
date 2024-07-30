package com.anythink.banner.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.banner.a.d;
import com.anythink.banner.a.e;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.a;
import com.anythink.core.common.b.b;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.j;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.a.c;
import com.anythink.core.common.k.a.f;
import com.anythink.core.common.k.g;
import com.anythink.core.common.k.s;
import com.anythink.core.common.v;
import com.anythink.core.common.w;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ATBannerView extends FrameLayout implements d {
    private final String TAG;
    a adLoadListener;
    private boolean canRenderBanner;
    boolean hasTouchWindow;
    c impressionTracker;
    private com.anythink.banner.a.a mAdLoadManager;
    b mAdSourceEventListener;
    private com.anythink.banner.b.a mBannerRefreshTimer;
    CustomBannerAdapter mCustomBannerAd;
    ATAdSourceStatusListener mDeveloperStatusListener;
    ATEventInterface mDownloadListener;
    private e mInnerBannerListener;
    boolean mIsRefresh;
    private ATBannerListener mListener;
    private String mPlacementId;
    private String mScenario;
    Map<String, Object> mTKExtraMap;
    f.b visibilityChecker;

    public ATBannerView(Context context) {
        super(context);
        this.TAG = "ATBannerView";
        this.mScenario = "";
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mInnerBannerListener = new e() { // from class: com.anythink.banner.api.ATBannerView.1
            @Override // com.anythink.banner.a.e
            public void onBannerClicked(final CustomBannerAdapter customBannerAdapter) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClicked(j.a(customBannerAdapter));
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public void onBannerClose(final CustomBannerAdapter customBannerAdapter) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClose(j.a(customBannerAdapter));
                        }
                    }
                });
                ATBannerView.this.canRenderBanner = true;
                ATBannerView.this.loadAd(1);
            }

            @Override // com.anythink.banner.a.e
            public void onBannerShow(final CustomBannerAdapter customBannerAdapter, final boolean z10) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            if (customBannerAdapter != null && z10) {
                                ATBannerView.this.mListener.onBannerAutoRefreshed(j.a(customBannerAdapter));
                            } else {
                                ATBannerView.this.mListener.onBannerShow(j.a(customBannerAdapter));
                            }
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public void onDeeplinkCallback(final CustomBannerAdapter customBannerAdapter, final boolean z10) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null && (ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            ((ATBannerExListener) ATBannerView.this.mListener).onDeeplinkCallback(ATBannerView.this.mIsRefresh, j.a(customBannerAdapter), z10);
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public void onDownloadConfirm(final Context context2, final CustomBannerAdapter customBannerAdapter, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null && (ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            ((ATBannerExListener) ATBannerView.this.mListener).onDownloadConfirm(context2, j.a(customBannerAdapter), aTNetworkConfirmInfo);
                        }
                    }
                });
            }
        };
        this.adLoadListener = new a() { // from class: com.anythink.banner.api.ATBannerView.2
            @Override // com.anythink.core.common.b.a
            public void onAdLoadFail(final AdError adError) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null && ATBannerView.this.canRenderBanner) {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (aTBannerView.mIsRefresh) {
                                aTBannerView.mListener.onBannerAutoRefreshFail(adError);
                            } else {
                                aTBannerView.mListener.onBannerFailed(adError);
                            }
                        }
                    }
                });
                if (ATBannerView.this.mAdLoadManager != null && ATBannerView.this.isInView() && !ATBannerView.this.mBannerRefreshTimer.a()) {
                    String unused = ATBannerView.this.TAG;
                    ATBannerView.this.mBannerRefreshTimer.b();
                }
            }

            @Override // com.anythink.core.common.b.a
            public void onAdLoaded() {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (!aTBannerView.mIsRefresh) {
                                aTBannerView.mListener.onBannerLoaded();
                            }
                        }
                        ATBannerView.this.controlShow();
                    }
                });
            }
        };
        this.mBannerRefreshTimer = new com.anythink.banner.b.a(this);
    }

    private boolean checkVisibilityPercent() {
        if (this.visibilityChecker == null) {
            this.visibilityChecker = new f.b();
        }
        if (getParent() == null) {
            return false;
        }
        return this.visibilityChecker.a((View) getParent(), this, 80, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.anythink.core.common.e.b getBannerCache() {
        return com.anythink.core.common.a.a().a(getContext(), this.mPlacementId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInView() {
        if (this.hasTouchWindow && isShown()) {
            if (this.mCustomBannerAd == null || checkVisibilityPercent()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isRefreshOpen() {
        com.anythink.core.c.d a10 = com.anythink.core.c.e.a(getContext().getApplicationContext()).a(this.mPlacementId);
        if (a10 != null && a10.V() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBannerImpression(final Context context, final ATBaseAdAdapter aTBaseAdAdapter, final boolean z10) {
        final com.anythink.core.common.e.e trackingInfo = aTBaseAdAdapter.getTrackingInfo();
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.6
            @Override // java.lang.Runnable
            public void run() {
                g.a(trackingInfo, g.i.f5076c, g.i.f, "");
                com.anythink.core.common.j.a.a(context).a(4, trackingInfo, aTBaseAdAdapter.getUnitGroupInfo());
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                            if (aTBaseAdAdapter != null && z10) {
                                ATBannerView.this.mListener.onBannerAutoRefreshed(j.a(aTBaseAdAdapter));
                            } else {
                                ATBannerView.this.mListener.onBannerShow(j.a(aTBaseAdAdapter));
                            }
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBannerShow(final Context context, final com.anythink.core.common.e.b bVar, final boolean z10) {
        final ATBaseAdAdapter e10 = bVar.e();
        final com.anythink.core.common.e.e trackingInfo = e10.getTrackingInfo();
        trackingInfo.f5600v = w.a().b(trackingInfo.W());
        final long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(trackingInfo.l())) {
            trackingInfo.h(com.anythink.core.common.k.g.a(trackingInfo.X(), trackingInfo.x(), currentTimeMillis));
        }
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (trackingInfo != null) {
                    s.a(ATBannerView.this.getContext(), trackingInfo);
                    com.anythink.core.common.a.a().a(context.getApplicationContext(), bVar);
                    com.anythink.core.common.j.a.a(context).a(13, trackingInfo, e10.getUnitGroupInfo(), currentTimeMillis);
                    if (!e10.supportImpressionCallback()) {
                        ATBannerView.this.notifyBannerImpression(context, e10, z10);
                    }
                }
            }
        });
    }

    private void registerDelayShow(final Context context, final com.anythink.core.common.e.b bVar, CustomBannerAdapter customBannerAdapter, final boolean z10) {
        View bannerView = customBannerAdapter.getBannerView();
        if (bannerView == null) {
            bannerView = this;
        }
        c cVar = this.impressionTracker;
        if (cVar != null) {
            cVar.a(bannerView, new com.anythink.core.common.k.a.a() { // from class: com.anythink.banner.api.ATBannerView.3
                @Override // com.anythink.core.common.k.a.a, com.anythink.core.common.k.a.b
                public final int getImpressionMinPercentageViewed() {
                    return 50;
                }

                @Override // com.anythink.core.common.k.a.a, com.anythink.core.common.k.a.b
                public final int getImpressionMinTimeViewed() {
                    return 0;
                }

                @Override // com.anythink.core.common.k.a.a, com.anythink.core.common.k.a.b
                public final void recordImpression(View view) {
                    ATBannerView.this.notifyBannerShow(context, bVar, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderBannerView(com.anythink.core.common.e.b bVar, boolean z10) {
        CustomBannerAdapter customBannerAdapter;
        int i10;
        if (bVar != null && (bVar.e() instanceof CustomBannerAdapter)) {
            customBannerAdapter = (CustomBannerAdapter) bVar.e();
        } else {
            customBannerAdapter = null;
        }
        if (customBannerAdapter != null) {
            CustomBannerAdapter customBannerAdapter2 = this.mCustomBannerAd;
            if (customBannerAdapter2 != null) {
                customBannerAdapter2.destory();
            }
            View bannerView = customBannerAdapter.getBannerView();
            if (bannerView != null && bannerView.getParent() != null && bannerView.getParent() != this) {
                ((ViewGroup) bannerView.getParent()).removeView(bannerView);
            }
            this.mCustomBannerAd = customBannerAdapter;
            if (bannerView != null) {
                com.anythink.core.common.e.e trackingInfo = customBannerAdapter.getTrackingInfo();
                trackingInfo.C = this.mScenario;
                s.a(this.mTKExtraMap, trackingInfo);
                customBannerAdapter.setAdEventListener(new com.anythink.banner.a.b(this.mInnerBannerListener, customBannerAdapter, z10));
                if (!isInView()) {
                    registerDelayShow(getContext().getApplicationContext(), bVar, customBannerAdapter, z10);
                } else {
                    notifyBannerShow(getContext().getApplicationContext(), bVar, z10);
                }
                IExHandler b10 = n.a().b();
                if (b10 != null) {
                    customBannerAdapter.setAdDownloadListener(b10.createDownloadListener(customBannerAdapter, null, this.mDownloadListener));
                }
                removeAllViews();
                int i11 = 0;
                if (bannerView.getLayoutParams() != null) {
                    i10 = bannerView.getLayoutParams().width;
                } else {
                    i10 = 0;
                }
                int i12 = -2;
                if (i10 == 0) {
                    i10 = -2;
                }
                if (bannerView.getLayoutParams() != null) {
                    i11 = bannerView.getLayoutParams().height;
                }
                if (i11 > 0) {
                    i12 = i11;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i12);
                layoutParams.gravity = 17;
                bannerView.setLayoutParams(layoutParams);
                if (bannerView.getParent() instanceof ViewGroup) {
                    ((ViewGroup) bannerView.getParent()).removeView(bannerView);
                }
                addView(bannerView, layoutParams);
            } else {
                Log.e(this.TAG, "Network's banner view = null. Did you call destroy()?");
            }
            this.mAdLoadManager.a(bVar);
            this.mBannerRefreshTimer.b();
            if (isRefreshOpen()) {
                loadAd(1);
            }
        }
    }

    public ATAdStatusInfo checkAdStatus() {
        if (n.a().g() != null && !TextUtils.isEmpty(n.a().p()) && !TextUtils.isEmpty(n.a().q())) {
            com.anythink.banner.a.a aVar = this.mAdLoadManager;
            if (aVar == null) {
                Log.e(this.TAG, "PlacementId is empty!");
                return new ATAdStatusInfo(false, false, null);
            }
            ATAdStatusInfo a10 = aVar.a(getContext(), this.mTKExtraMap);
            com.anythink.core.common.k.n.b(this.mPlacementId, g.i.f5081i, g.i.f5092u, a10.toString(), "");
            return a10;
        }
        Log.e(this.TAG, "SDK init error!");
        return new ATAdStatusInfo(false, false, null);
    }

    public List<ATAdInfo> checkValidAdCaches() {
        com.anythink.banner.a.a aVar = this.mAdLoadManager;
        if (aVar != null) {
            return aVar.a(getContext());
        }
        return null;
    }

    public void controlShow() {
        if (this.mAdLoadManager == null) {
            return;
        }
        final boolean z10 = this.mIsRefresh;
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.4
            @Override // java.lang.Runnable
            public void run() {
                synchronized (ATBannerView.this.mAdLoadManager) {
                    if (ATBannerView.this.canRenderBanner) {
                        final com.anythink.core.common.e.b bannerCache = ATBannerView.this.getBannerCache();
                        boolean z11 = false;
                        if (bannerCache != null) {
                            if (ATBannerView.this.isInView()) {
                                bannerCache.a(bannerCache.d() + 1);
                                ATBannerView.this.canRenderBanner = false;
                                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.4.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                        ATBannerView.this.renderBannerView(bannerCache, z10);
                                    }
                                });
                            } else {
                                ATBannerView aTBannerView = ATBannerView.this;
                                if (aTBannerView.hasTouchWindow && aTBannerView.isShown()) {
                                    z11 = true;
                                    String unused = ATBannerView.this.TAG;
                                }
                                ATBannerView.this.mBannerRefreshTimer.d();
                                String unused2 = ATBannerView.this.TAG;
                            }
                        } else if (ATBannerView.this.isRefreshOpen() && ATBannerView.this.mAdLoadManager != null && !ATBannerView.this.mAdLoadManager.e()) {
                            ATBannerView.this.loadAd(1);
                            ATBannerView aTBannerView2 = ATBannerView.this;
                            if (aTBannerView2.hasTouchWindow && aTBannerView2.isShown()) {
                                z11 = true;
                            }
                        }
                        if (z11 && ATBannerView.this.mBannerRefreshTimer != null && ATBannerView.this.mBannerRefreshTimer.c()) {
                            ATBannerView.this.mBannerRefreshTimer.b();
                        }
                        return;
                    }
                    String unused3 = ATBannerView.this.TAG;
                }
            }
        });
    }

    public void destroy() {
        removeAllViews();
        CustomBannerAdapter customBannerAdapter = this.mCustomBannerAd;
        if (customBannerAdapter != null) {
            customBannerAdapter.destory();
        }
        com.anythink.banner.b.a aVar = this.mBannerRefreshTimer;
        if (aVar != null) {
            aVar.d();
        }
        c cVar = this.impressionTracker;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void loadAd() {
        loadAd(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.hasTouchWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.hasTouchWindow = false;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            controlShow();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            controlShow();
        }
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        IExHandler b10;
        this.mDownloadListener = aTEventInterface;
        if (this.mCustomBannerAd != null && (b10 = n.a().b()) != null) {
            CustomBannerAdapter customBannerAdapter = this.mCustomBannerAd;
            customBannerAdapter.setAdDownloadListener(b10.createDownloadListener(customBannerAdapter, null, this.mDownloadListener));
        }
    }

    public void setAdSourceStatusListener(ATAdSourceStatusListener aTAdSourceStatusListener) {
        if (this.mAdSourceEventListener == null) {
            this.mAdSourceEventListener = new b();
        }
        this.mDeveloperStatusListener = aTAdSourceStatusListener;
        this.mAdSourceEventListener.a(aTAdSourceStatusListener);
    }

    public void setBannerAdListener(ATBannerListener aTBannerListener) {
        this.mListener = aTBannerListener;
    }

    public void setLocalExtra(Map<String, Object> map) {
        if (TextUtils.isEmpty(this.mPlacementId)) {
            Log.e(this.TAG, "You must set unit Id first.");
        } else {
            v.a().a(this.mPlacementId, map);
        }
    }

    public void setPlacementId(String str) {
        this.mAdLoadManager = com.anythink.banner.a.a.a(getContext(), str);
        this.mPlacementId = str;
        this.mBannerRefreshTimer.a(str);
        if (this.impressionTracker == null) {
            getContext();
            this.impressionTracker = new c(50);
        }
    }

    public void setScenario(String str) {
        if (com.anythink.core.common.k.g.c(str)) {
            this.mScenario = str;
        }
    }

    public void setTKExtra(Map<String, Object> map) {
        if (this.mTKExtraMap == null) {
            this.mTKExtraMap = new ConcurrentHashMap();
        }
        this.mTKExtraMap.clear();
        this.mTKExtraMap.putAll(map);
    }

    @Override // com.anythink.banner.a.d
    public void timeUpRefreshView() {
        this.canRenderBanner = true;
        controlShow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAd(int i10) {
        com.anythink.core.common.k.n.a(this.mPlacementId, g.i.f5081i, g.i.f5088q, g.i.f5080h, "", true);
        this.mIsRefresh = i10 == 1;
        if (i10 == 0) {
            this.canRenderBanner = true;
        }
        com.anythink.banner.a.a aVar = this.mAdLoadManager;
        if (aVar != null) {
            aVar.a(getContext(), i10, this.adLoadListener, this.mAdSourceEventListener, this.mTKExtraMap);
        } else {
            this.adLoadListener.onAdLoadFail(ErrorCode.getErrorCode(ErrorCode.placeStrategyError, "", ""));
        }
    }

    public ATBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "ATBannerView";
        this.mScenario = "";
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mInnerBannerListener = new e() { // from class: com.anythink.banner.api.ATBannerView.1
            @Override // com.anythink.banner.a.e
            public void onBannerClicked(final CustomBannerAdapter customBannerAdapter) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClicked(j.a(customBannerAdapter));
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public void onBannerClose(final CustomBannerAdapter customBannerAdapter) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClose(j.a(customBannerAdapter));
                        }
                    }
                });
                ATBannerView.this.canRenderBanner = true;
                ATBannerView.this.loadAd(1);
            }

            @Override // com.anythink.banner.a.e
            public void onBannerShow(final CustomBannerAdapter customBannerAdapter, final boolean z10) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            if (customBannerAdapter != null && z10) {
                                ATBannerView.this.mListener.onBannerAutoRefreshed(j.a(customBannerAdapter));
                            } else {
                                ATBannerView.this.mListener.onBannerShow(j.a(customBannerAdapter));
                            }
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public void onDeeplinkCallback(final CustomBannerAdapter customBannerAdapter, final boolean z10) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null && (ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            ((ATBannerExListener) ATBannerView.this.mListener).onDeeplinkCallback(ATBannerView.this.mIsRefresh, j.a(customBannerAdapter), z10);
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public void onDownloadConfirm(final Context context2, final CustomBannerAdapter customBannerAdapter, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null && (ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            ((ATBannerExListener) ATBannerView.this.mListener).onDownloadConfirm(context2, j.a(customBannerAdapter), aTNetworkConfirmInfo);
                        }
                    }
                });
            }
        };
        this.adLoadListener = new a() { // from class: com.anythink.banner.api.ATBannerView.2
            @Override // com.anythink.core.common.b.a
            public void onAdLoadFail(final AdError adError) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null && ATBannerView.this.canRenderBanner) {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (aTBannerView.mIsRefresh) {
                                aTBannerView.mListener.onBannerAutoRefreshFail(adError);
                            } else {
                                aTBannerView.mListener.onBannerFailed(adError);
                            }
                        }
                    }
                });
                if (ATBannerView.this.mAdLoadManager != null && ATBannerView.this.isInView() && !ATBannerView.this.mBannerRefreshTimer.a()) {
                    String unused = ATBannerView.this.TAG;
                    ATBannerView.this.mBannerRefreshTimer.b();
                }
            }

            @Override // com.anythink.core.common.b.a
            public void onAdLoaded() {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (!aTBannerView.mIsRefresh) {
                                aTBannerView.mListener.onBannerLoaded();
                            }
                        }
                        ATBannerView.this.controlShow();
                    }
                });
            }
        };
        this.mBannerRefreshTimer = new com.anythink.banner.b.a(this);
    }

    public ATBannerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.TAG = "ATBannerView";
        this.mScenario = "";
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mInnerBannerListener = new e() { // from class: com.anythink.banner.api.ATBannerView.1
            @Override // com.anythink.banner.a.e
            public void onBannerClicked(final CustomBannerAdapter customBannerAdapter) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClicked(j.a(customBannerAdapter));
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public void onBannerClose(final CustomBannerAdapter customBannerAdapter) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClose(j.a(customBannerAdapter));
                        }
                    }
                });
                ATBannerView.this.canRenderBanner = true;
                ATBannerView.this.loadAd(1);
            }

            @Override // com.anythink.banner.a.e
            public void onBannerShow(final CustomBannerAdapter customBannerAdapter, final boolean z10) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            if (customBannerAdapter != null && z10) {
                                ATBannerView.this.mListener.onBannerAutoRefreshed(j.a(customBannerAdapter));
                            } else {
                                ATBannerView.this.mListener.onBannerShow(j.a(customBannerAdapter));
                            }
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public void onDeeplinkCallback(final CustomBannerAdapter customBannerAdapter, final boolean z10) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null && (ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            ((ATBannerExListener) ATBannerView.this.mListener).onDeeplinkCallback(ATBannerView.this.mIsRefresh, j.a(customBannerAdapter), z10);
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public void onDownloadConfirm(final Context context2, final CustomBannerAdapter customBannerAdapter, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null && (ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            ((ATBannerExListener) ATBannerView.this.mListener).onDownloadConfirm(context2, j.a(customBannerAdapter), aTNetworkConfirmInfo);
                        }
                    }
                });
            }
        };
        this.adLoadListener = new a() { // from class: com.anythink.banner.api.ATBannerView.2
            @Override // com.anythink.core.common.b.a
            public void onAdLoadFail(final AdError adError) {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null && ATBannerView.this.canRenderBanner) {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (aTBannerView.mIsRefresh) {
                                aTBannerView.mListener.onBannerAutoRefreshFail(adError);
                            } else {
                                aTBannerView.mListener.onBannerFailed(adError);
                            }
                        }
                    }
                });
                if (ATBannerView.this.mAdLoadManager != null && ATBannerView.this.isInView() && !ATBannerView.this.mBannerRefreshTimer.a()) {
                    String unused = ATBannerView.this.TAG;
                    ATBannerView.this.mBannerRefreshTimer.b();
                }
            }

            @Override // com.anythink.core.common.b.a
            public void onAdLoaded() {
                n.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (!aTBannerView.mIsRefresh) {
                                aTBannerView.mListener.onBannerLoaded();
                            }
                        }
                        ATBannerView.this.controlShow();
                    }
                });
            }
        };
        this.mBannerRefreshTimer = new com.anythink.banner.b.a(this);
    }
}
