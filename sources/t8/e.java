package t8;

import android.widget.FrameLayout;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;

/* compiled from: AdsManager.java */
/* loaded from: classes2.dex */
public final class e extends MaxNativeAdListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f35581s;

    public e(FrameLayout frameLayout) {
        this.f35581s = frameLayout;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        MaxAd maxAd2 = a.f35565l;
        if (maxAd2 != null) {
            a.f35564k.destroy(maxAd2);
        }
        a.f35565l = maxAd;
        FrameLayout frameLayout = this.f35581s;
        frameLayout.removeAllViews();
        frameLayout.addView(maxNativeAdView);
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdClicked(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoadFailed(String str, MaxError maxError) {
    }
}
