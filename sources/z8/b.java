package z8;

import android.widget.FrameLayout;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.hamkho.livefoot.Activities.FootballScores.AllScores.MatchDetails;

/* compiled from: MatchDetails.java */
/* loaded from: classes2.dex */
public final class b extends MaxNativeAdListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f37331s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MatchDetails f37332t;

    public b(MatchDetails matchDetails, FrameLayout frameLayout) {
        this.f37332t = matchDetails;
        this.f37331s = frameLayout;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoadFailed(String str, MaxError maxError) {
        MatchDetails matchDetails = this.f37332t;
        matchDetails.f21452s.f33003i.b();
        matchDetails.f21452s.f33003i.setVisibility(8);
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        MatchDetails matchDetails = this.f37332t;
        MaxAd maxAd2 = matchDetails.G;
        if (maxAd2 != null) {
            matchDetails.F.destroy(maxAd2);
        }
        matchDetails.G = maxAd;
        matchDetails.f21452s.f33003i.b();
        matchDetails.f21452s.f33003i.setVisibility(8);
        FrameLayout frameLayout = this.f37331s;
        frameLayout.removeAllViews();
        frameLayout.addView(maxNativeAdView);
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdClicked(MaxAd maxAd) {
    }
}
