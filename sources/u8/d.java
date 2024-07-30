package u8;

import android.widget.FrameLayout;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.hamkho.livefoot.Activities.MainActivity;

/* compiled from: MainActivity.java */
/* loaded from: classes2.dex */
public final class d extends MaxNativeAdListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f35794s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MainActivity f35795t;

    public d(MainActivity mainActivity, FrameLayout frameLayout) {
        this.f35795t = mainActivity;
        this.f35794s = frameLayout;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoadFailed(String str, MaxError maxError) {
        MainActivity mainActivity = this.f35795t;
        mainActivity.f21464s.f32992e.b();
        mainActivity.f21464s.f32992e.setVisibility(8);
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        MainActivity mainActivity = this.f35795t;
        MaxAd maxAd2 = mainActivity.f21469x;
        if (maxAd2 != null) {
            mainActivity.f21468w.destroy(maxAd2);
        }
        mainActivity.f21469x = maxAd;
        mainActivity.f21464s.f32992e.b();
        mainActivity.f21464s.f32992e.setVisibility(8);
        FrameLayout frameLayout = this.f35794s;
        frameLayout.removeAllViews();
        frameLayout.addView(maxNativeAdView);
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public final void onNativeAdClicked(MaxAd maxAd) {
    }
}
