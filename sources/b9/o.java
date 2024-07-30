package b9;

import android.widget.FrameLayout;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.hamkho.livefoot.Activities.SoccerLive.EventDetailActivity;

/* compiled from: EventDetailActivity.java */
/* loaded from: classes2.dex */
public final class o extends MaxNativeAdListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f3157s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ EventDetailActivity f3158t;

    public o(EventDetailActivity eventDetailActivity, FrameLayout frameLayout) {
        this.f3158t = eventDetailActivity;
        this.f3157s = frameLayout;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoadFailed(String str, MaxError maxError) {
        EventDetailActivity eventDetailActivity = this.f3158t;
        eventDetailActivity.f21481s.f32964e.b();
        eventDetailActivity.f21481s.f32964e.setVisibility(8);
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        EventDetailActivity eventDetailActivity = this.f3158t;
        MaxAd maxAd2 = eventDetailActivity.f21487z;
        if (maxAd2 != null) {
            eventDetailActivity.y.destroy(maxAd2);
        }
        eventDetailActivity.f21487z = maxAd;
        eventDetailActivity.f21481s.f32964e.b();
        eventDetailActivity.f21481s.f32964e.setVisibility(8);
        FrameLayout frameLayout = this.f3157s;
        frameLayout.removeAllViews();
        frameLayout.addView(maxNativeAdView);
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdClicked(MaxAd maxAd) {
    }
}
