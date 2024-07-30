package com.anythink.nativead.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomVideo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.j;
import com.anythink.core.common.b.l;
import com.anythink.core.common.e.b;
import com.anythink.core.common.e.e;
import com.anythink.core.common.f;
import com.anythink.core.common.k.n;
import com.anythink.core.common.k.s;
import com.anythink.core.common.v;
import com.anythink.core.common.w;
import com.anythink.nativead.unitgroup.a;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;

/* loaded from: classes.dex */
public class NativeAd {
    private boolean hasSetShowTkDetail;
    private b mAdCacheInfo;
    protected a mBaseNativeAd;
    DownloadConfirmListener mConfirmListener;
    private Context mContext;
    private ATNativeDislikeListener mDislikeListener;
    ATEventInterface mEventInterface;
    private boolean mIsDestroyed;
    private ATNativeEventListener mNativeEventListener;
    ATNativeAdView mNativeView;
    private String mPlacementId;
    private boolean mRecordedImpression;
    private boolean mRecordedShow;
    ATNativeMaterial nativeMaterial;
    private final String TAG = getClass().getSimpleName();
    View.OnClickListener mDefaultCloseViewListener = new View.OnClickListener() { // from class: com.anythink.nativead.api.NativeAd.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = NativeAd.this.mBaseNativeAd;
            if (aVar != null) {
                aVar.notifyAdDislikeClick();
            }
        }
    };
    boolean isManualImpressionTrack = false;

    /* loaded from: classes.dex */
    public interface DownloadConfirmListener {
        void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo);
    }

    /* loaded from: classes.dex */
    public interface ImpressionEventListener {
        void onImpression();
    }

    public NativeAd(Context context, String str, b bVar) {
        this.mContext = context.getApplicationContext();
        this.mPlacementId = str;
        this.mAdCacheInfo = bVar;
        a aVar = (a) bVar.f();
        this.mBaseNativeAd = aVar;
        aVar.setNativeEventListener(new l() { // from class: com.anythink.nativead.api.NativeAd.1
            @Override // com.anythink.core.common.b.l
            public final void onAdClicked(View view) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleClick(nativeAd.mNativeView, view);
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdDislikeButtonClick() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleAdDislikeButtonClick(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdImpressed() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleImpression(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdVideoEnd() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoEnd(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdVideoProgress(int i10) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoProgress(nativeAd.mNativeView, i10);
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdVideoStart() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoStart(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.b.l
            public final void onDeeplinkCallback(boolean z10) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleDeeplinkCallback(nativeAd.mNativeView, z10);
            }

            @Override // com.anythink.core.common.b.l
            public final void onDownloadConfirmCallback(Context context2, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                NativeAd.this.handleDownloadConfirm(context2, view, aTNetworkConfirmInfo);
            }
        });
        a aVar2 = this.mBaseNativeAd;
        if (aVar2 instanceof CustomNativeAd) {
            this.nativeMaterial = new com.anythink.nativead.a.b((CustomNativeAd) aVar2);
        }
    }

    private void bindListener() {
        ATNativePrepareInfo nativePrepareInfo;
        View closeView;
        a aVar = this.mBaseNativeAd;
        if (aVar instanceof CustomNativeAd) {
            CustomNativeAd customNativeAd = (CustomNativeAd) aVar;
            if (!customNativeAd.checkHasCloseViewListener() && (nativePrepareInfo = customNativeAd.getNativePrepareInfo()) != null && (closeView = nativePrepareInfo.getCloseView()) != null) {
                closeView.setOnClickListener(this.mDefaultCloseViewListener);
            }
        }
    }

    private void checkBindView(ATNativePrepareInfo aTNativePrepareInfo) {
        if (aTNativePrepareInfo == null) {
            return;
        }
        if (aTNativePrepareInfo.getTitleView() == null) {
            printNotSetViewLog("titleView");
        }
        if (aTNativePrepareInfo.getCtaView() == null) {
            printNotSetViewLog("ctaView");
        }
        if (aTNativePrepareInfo.getDescView() == null) {
            printNotSetViewLog("descView");
        }
        if (aTNativePrepareInfo.getIconView() == null) {
            printNotSetViewLog("iconView");
        }
        if (aTNativePrepareInfo.getMainImageView() == null) {
            printNotSetViewLog("mainImageView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void fillShowTrackingInfo(e eVar) {
        if (!this.hasSetShowTkDetail) {
            String b10 = w.a().b(this.mPlacementId);
            this.hasSetShowTkDetail = true;
            if (eVar != null) {
                eVar.f5600v = b10;
                s.a(this.mContext, eVar);
            }
        }
    }

    private void printNotSetViewLog(String str) {
        Log.w(this.TAG, "The " + str + " is not set, it may cause the ad to not be clicked normally.");
    }

    private void renderViewToWindow(View view) {
        n.b(this.mPlacementId, g.i.f5084l, g.i.f5090s, g.i.f5080h, "");
        ViewGroup customAdContainer = this.mBaseNativeAd.getCustomAdContainer();
        int hashCode = hashCode();
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (customAdContainer != null) {
            if (customAdContainer.getParent() != null) {
                ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
            }
            customAdContainer.addView(view);
        }
        if (customAdContainer != null) {
            view = customAdContainer;
        }
        this.mNativeView.renderView(hashCode, view, new ImpressionEventListener() { // from class: com.anythink.nativead.api.NativeAd.3
            @Override // com.anythink.nativead.api.NativeAd.ImpressionEventListener
            public final void onImpression() {
                e eVar;
                long currentTimeMillis = System.currentTimeMillis();
                a aVar = NativeAd.this.mBaseNativeAd;
                if (aVar != null) {
                    eVar = aVar.getDetail();
                } else {
                    eVar = null;
                }
                if (eVar != null && TextUtils.isEmpty(eVar.l())) {
                    eVar.h(com.anythink.core.common.k.g.a(eVar.X(), eVar.x(), currentTimeMillis));
                }
                a aVar2 = NativeAd.this.mBaseNativeAd;
                if (aVar2 instanceof CustomNativeAd) {
                    ((CustomNativeAd) aVar2).setShowId(eVar.l());
                }
                NativeAd nativeAd = NativeAd.this;
                nativeAd.recordShow(nativeAd.mNativeView);
            }
        });
    }

    public synchronized void clear(ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        try {
            a aVar = this.mBaseNativeAd;
            if (aVar != null) {
                aVar.clear(this.mNativeView);
            }
        } catch (Throwable unused) {
        }
        ATNativeAdView aTNativeAdView2 = this.mNativeView;
        if (aTNativeAdView2 != null) {
            aTNativeAdView2.clearImpressionListener(hashCode());
            this.mNativeView = null;
        }
    }

    public synchronized void destory() {
        if (this.mIsDestroyed) {
            return;
        }
        clear(this.mNativeView);
        this.mIsDestroyed = true;
        this.mNativeEventListener = null;
        this.mDislikeListener = null;
        this.mDefaultCloseViewListener = null;
        this.mNativeView = null;
        a aVar = this.mBaseNativeAd;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    public ATAdInfo getAdInfo() {
        return j.a(this.mBaseNativeAd);
    }

    public int getAdInteractionType() {
        a aVar = this.mBaseNativeAd;
        if (aVar != null && (aVar instanceof CustomNativeAd)) {
            return ((CustomNativeAd) aVar).getNativeAdInteractionType();
        }
        return 0;
    }

    public ATNativeMaterial getAdMaterial() {
        return this.nativeMaterial;
    }

    @Deprecated
    public ATCustomVideo getCustomVideo() {
        a aVar = this.mBaseNativeAd;
        if (aVar != null && (aVar instanceof CustomNativeAd)) {
            return ((CustomNativeAd) aVar).getNativeCustomVideo();
        }
        return null;
    }

    public int getNativeType() {
        a aVar = this.mBaseNativeAd;
        if (aVar != null && (aVar instanceof CustomNativeAd)) {
            return ((CustomNativeAd) aVar).getNativeType();
        }
        return 0;
    }

    public double getVideoDuration() {
        a aVar = this.mBaseNativeAd;
        if (aVar != null && (aVar instanceof CustomNativeAd)) {
            return ((CustomNativeAd) aVar).getVideoDuration();
        }
        return 0.0d;
    }

    public double getVideoProgress() {
        a aVar = this.mBaseNativeAd;
        if (aVar != null && (aVar instanceof CustomNativeAd)) {
            return ((CustomNativeAd) aVar).getVideoProgress();
        }
        return 0.0d;
    }

    public synchronized void handleAdDislikeButtonClick(final ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        com.anythink.core.common.b.n.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.9
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mDislikeListener != null) {
                    NativeAd.this.mDislikeListener.onAdCloseButtonClick(aTNativeAdView, j.a(NativeAd.this.mBaseNativeAd));
                }
            }
        });
    }

    public synchronized void handleClick(final ATNativeAdView aTNativeAdView, View view) {
        if (this.mIsDestroyed) {
            return;
        }
        a aVar = this.mBaseNativeAd;
        if (aVar != null) {
            e detail = aVar.getDetail();
            com.anythink.core.common.k.g.a(detail, g.i.f5077d, g.i.f, "");
            com.anythink.core.common.j.a.a(this.mContext.getApplicationContext()).a(6, detail);
        }
        com.anythink.core.common.b.n.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.7
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdClicked(aTNativeAdView, j.a(NativeAd.this.mBaseNativeAd));
                }
            }
        });
    }

    public synchronized void handleDeeplinkCallback(ATNativeAdView aTNativeAdView, boolean z10) {
        if (this.mIsDestroyed) {
            return;
        }
        ATNativeEventListener aTNativeEventListener = this.mNativeEventListener;
        if (aTNativeEventListener != null && (aTNativeEventListener instanceof ATNativeEventExListener)) {
            ((ATNativeEventExListener) aTNativeEventListener).onDeeplinkCallback(aTNativeAdView, j.a(this.mBaseNativeAd), z10);
        }
    }

    public synchronized void handleDownloadConfirm(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        a aVar;
        if (this.mIsDestroyed) {
            return;
        }
        DownloadConfirmListener downloadConfirmListener = this.mConfirmListener;
        if (downloadConfirmListener != null && (aVar = this.mBaseNativeAd) != null) {
            if (context == null) {
                context = this.mContext;
            }
            downloadConfirmListener.onDownloadConfirm(context, j.a(aVar), view, aTNetworkConfirmInfo);
        }
    }

    public synchronized void handleImpression(final ATNativeAdView aTNativeAdView) {
        if (!this.mRecordedImpression && !this.mIsDestroyed) {
            this.mRecordedImpression = true;
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.6
                @Override // java.lang.Runnable
                public void run() {
                    if (NativeAd.this.mIsDestroyed) {
                        return;
                    }
                    try {
                        a aVar = NativeAd.this.mBaseNativeAd;
                        if (aVar != null) {
                            e detail = aVar.getDetail();
                            com.anythink.core.common.k.g.a(detail, g.i.f5076c, g.i.f, "");
                            NativeAd.this.fillShowTrackingInfo(detail);
                            com.anythink.core.common.j.a.a(NativeAd.this.mContext.getApplicationContext()).a(4, detail, NativeAd.this.mAdCacheInfo.e().getUnitGroupInfo());
                            com.anythink.core.common.b.n.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.6.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (NativeAd.this.mNativeEventListener != null) {
                                        ATNativeEventListener aTNativeEventListener = NativeAd.this.mNativeEventListener;
                                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                        aTNativeEventListener.onAdImpressed(aTNativeAdView, j.a(NativeAd.this.mBaseNativeAd));
                                    }
                                }
                            });
                        }
                    } catch (Exception unused) {
                        Log.e("NativeAd", "BaseNativeAd has been destotyed.");
                    }
                }
            });
        }
    }

    public synchronized void handleVideoEnd(final ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        a aVar = this.mBaseNativeAd;
        if (aVar != null) {
            e detail = aVar.getDetail();
            detail.f5598t = 100;
            com.anythink.core.common.j.a.a(this.mContext.getApplicationContext()).a(9, detail);
        }
        com.anythink.core.common.b.n.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.10
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdVideoEnd(aTNativeAdView);
                }
            }
        });
    }

    public synchronized void handleVideoProgress(final ATNativeAdView aTNativeAdView, final int i10) {
        if (this.mIsDestroyed) {
            return;
        }
        com.anythink.core.common.b.n.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.2
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdVideoProgress(aTNativeAdView, i10);
                }
            }
        });
    }

    public synchronized void handleVideoStart(final ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        a aVar = this.mBaseNativeAd;
        if (aVar != null) {
            e detail = aVar.getDetail();
            detail.f5598t = 0;
            com.anythink.core.common.j.a.a(this.mContext.getApplicationContext()).a(8, detail);
        }
        com.anythink.core.common.b.n.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.8
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdVideoStart(aTNativeAdView);
                }
            }
        });
    }

    public boolean isNativeExpress() {
        a aVar = this.mBaseNativeAd;
        if (aVar != null && (aVar instanceof CustomNativeAd)) {
            return ((CustomNativeAd) aVar).isNativeExpress();
        }
        return false;
    }

    public void manualImpressionTrack() {
        ATBaseAdAdapter aTBaseAdAdapter;
        if (this.mIsDestroyed) {
            Log.e(this.TAG, "NativeAd had been destroyed.");
            return;
        }
        if (!this.isManualImpressionTrack) {
            if (com.anythink.core.common.b.n.a().A()) {
                Log.e(this.TAG, "Must call \"setManualImpressionTrack(true);\" first.");
                return;
            }
            return;
        }
        ATNativeAdView aTNativeAdView = this.mNativeView;
        b bVar = this.mAdCacheInfo;
        if (bVar != null) {
            aTBaseAdAdapter = bVar.e();
        } else {
            aTBaseAdAdapter = null;
        }
        if (aTBaseAdAdapter != null && aTBaseAdAdapter.supportImpressionCallback()) {
            if (com.anythink.core.common.b.n.a().A()) {
                Log.e(this.TAG, "This NativeAd don't support tracking impressions manually.");
                return;
            }
            return;
        }
        if (aTNativeAdView == null) {
            if (com.anythink.core.common.b.n.a().A()) {
                Log.e(this.TAG, "NativeAd don't call render.");
                return;
            }
            return;
        }
        if (!aTNativeAdView.isShown()) {
            if (com.anythink.core.common.b.n.a().A()) {
                Log.e(this.TAG, "ATNativeAdView isn't visible.");
            }
        } else if (!aTNativeAdView.isAttachedToWindow()) {
            if (com.anythink.core.common.b.n.a().A()) {
                Log.e(this.TAG, "ATNativeAdView don't attach window.");
            }
        } else {
            if (com.anythink.core.common.b.n.a().A()) {
                Log.i(this.TAG, "try to track impression manually.");
            }
            a aVar = this.mBaseNativeAd;
            if (aVar instanceof CustomNativeAd) {
                ((CustomNativeAd) aVar).impressionTrack(aTNativeAdView);
            }
        }
    }

    public void onPause() {
        a aVar;
        if (!this.mIsDestroyed && (aVar = this.mBaseNativeAd) != null) {
            aVar.onPause();
        }
    }

    public void onResume() {
        a aVar;
        if (!this.mIsDestroyed && (aVar = this.mBaseNativeAd) != null) {
            aVar.onResume();
        }
    }

    public void pauseVideo() {
        a aVar;
        if (!this.mIsDestroyed && (aVar = this.mBaseNativeAd) != null) {
            aVar.pauseVideo();
        }
    }

    public synchronized void prepare(ATNativeAdView aTNativeAdView, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.mIsDestroyed) {
            return;
        }
        if (aTNativeAdView != null) {
            if (aTNativePrepareInfo == null) {
                aTNativePrepareInfo = new ATNativePrepareInfo();
            }
            this.mBaseNativeAd.setNativePrepareInfo(aTNativePrepareInfo);
            this.mBaseNativeAd.prepare(aTNativeAdView, aTNativePrepareInfo);
            bindListener();
            if (!this.mBaseNativeAd.isNativeExpress()) {
                checkBindView(aTNativePrepareInfo);
            }
        }
    }

    public synchronized void recordShow(ATNativeAdView aTNativeAdView) {
        if (!this.mRecordedShow) {
            final e detail = this.mBaseNativeAd.getDetail();
            this.mRecordedShow = true;
            b bVar = this.mAdCacheInfo;
            if (bVar != null) {
                bVar.a(bVar.d() + 1);
                f b10 = v.a().b(this.mPlacementId);
                if (b10 != null) {
                    b10.a(this.mAdCacheInfo);
                    b10.f();
                }
            }
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (!NativeAd.this.mIsDestroyed && NativeAd.this.mAdCacheInfo != null) {
                        NativeAd.this.fillShowTrackingInfo(detail);
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            currentTimeMillis = Long.parseLong(detail.l().split("_")[r2.length - 1]);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        long j10 = currentTimeMillis;
                        a aVar = NativeAd.this.mBaseNativeAd;
                        if (aVar != null && (aVar instanceof CustomNativeAd)) {
                            ((CustomNativeAd) aVar).setShowId(detail.l());
                        }
                        com.anythink.core.common.a.a().a(NativeAd.this.mContext.getApplicationContext(), NativeAd.this.mAdCacheInfo);
                        com.anythink.core.common.j.a.a(NativeAd.this.mContext).a(13, detail, NativeAd.this.mAdCacheInfo.e().getUnitGroupInfo(), j10);
                    }
                }
            });
        }
    }

    public synchronized void renderAdContainer(ATNativeAdView aTNativeAdView, View view) {
        if (this.mIsDestroyed) {
            return;
        }
        if (aTNativeAdView != null) {
            aTNativeAdView.clear();
        }
        if (isNativeExpress()) {
            a aVar = this.mBaseNativeAd;
            if (aVar != null) {
                if (aTNativeAdView == null) {
                    Log.e("anythink", "renderAdContainer: ATNativeAdView cannot be null for template-rendering ads!");
                    return;
                }
                view = aVar.getAdMediaView(aTNativeAdView, Integer.valueOf(aTNativeAdView.getWidth()));
                if (view == null) {
                    Log.e("anythink", "renderAdContainer: getAdMediaView() cannot be null for template-rendering ads!");
                    return;
                }
            } else {
                view = null;
            }
        } else if (view == null) {
            Log.e("anythink", "renderAdContainer: selfRenderView cannot be null for self-rendering ads!");
            return;
        }
        this.mNativeView = aTNativeAdView;
        if (aTNativeAdView != null) {
            aTNativeAdView.attachNativeAd(this);
        }
        if (view != null) {
            view.setVisibility(0);
            renderViewToWindow(view);
        }
    }

    public void resumeVideo() {
        a aVar;
        if (!this.mIsDestroyed && (aVar = this.mBaseNativeAd) != null) {
            aVar.resumeVideo();
        }
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        this.mEventInterface = aTEventInterface;
        IExHandler b10 = com.anythink.core.common.b.n.a().b();
        if (b10 != null) {
            if (aTEventInterface != null) {
                this.mBaseNativeAd.setDownloadListener(b10.createDownloadListener(this.mAdCacheInfo.e(), this.mBaseNativeAd, aTEventInterface));
                return;
            } else {
                this.mBaseNativeAd.setDownloadListener(null);
                return;
            }
        }
        this.mBaseNativeAd.setDownloadListener(null);
        Log.e(this.TAG, "This method is not supported in this version");
    }

    public void setDislikeCallbackListener(ATNativeDislikeListener aTNativeDislikeListener) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mDislikeListener = aTNativeDislikeListener;
    }

    public void setDownloadConfirmListener(DownloadConfirmListener downloadConfirmListener) {
        if (downloadConfirmListener != null) {
            a aVar = this.mBaseNativeAd;
            if (aVar instanceof CustomNativeAd) {
                ((CustomNativeAd) aVar).registerDownloadConfirmListener();
            }
        } else {
            a aVar2 = this.mBaseNativeAd;
            if (aVar2 instanceof CustomNativeAd) {
                ((CustomNativeAd) aVar2).unregeisterDownloadConfirmListener();
            }
        }
        this.mConfirmListener = downloadConfirmListener;
    }

    public void setManualImpressionTrack(boolean z10) {
        this.isManualImpressionTrack = z10;
    }

    public void setNativeEventListener(ATNativeEventListener aTNativeEventListener) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mNativeEventListener = aTNativeEventListener;
    }

    public void setVideoMute(boolean z10) {
        a aVar;
        if (!this.mIsDestroyed && (aVar = this.mBaseNativeAd) != null) {
            aVar.setVideoMute(z10);
        }
    }
}
