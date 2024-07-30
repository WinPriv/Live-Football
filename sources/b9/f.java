package b9;

import android.widget.FrameLayout;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelDetailActivity;

/* compiled from: ChannelDetailActivity.java */
/* loaded from: classes2.dex */
public final class f extends MaxNativeAdListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f3141s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ChannelDetailActivity f3142t;

    public f(ChannelDetailActivity channelDetailActivity, FrameLayout frameLayout) {
        this.f3142t = channelDetailActivity;
        this.f3141s = frameLayout;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoadFailed(String str, MaxError maxError) {
        ChannelDetailActivity channelDetailActivity = this.f3142t;
        channelDetailActivity.f21470s.f32955g.b();
        channelDetailActivity.f21470s.f32955g.setVisibility(8);
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        ChannelDetailActivity channelDetailActivity = this.f3142t;
        MaxAd maxAd2 = channelDetailActivity.f21476z;
        if (maxAd2 != null) {
            channelDetailActivity.y.destroy(maxAd2);
        }
        channelDetailActivity.f21476z = maxAd;
        channelDetailActivity.f21470s.f32955g.b();
        channelDetailActivity.f21470s.f32955g.setVisibility(8);
        FrameLayout frameLayout = this.f3141s;
        frameLayout.removeAllViews();
        frameLayout.addView(maxNativeAdView);
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdClicked(MaxAd maxAd) {
    }
}
