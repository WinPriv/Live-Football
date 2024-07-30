package t8;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;

/* compiled from: AdsManager.java */
/* loaded from: classes2.dex */
public final class c implements BannerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f35578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout.LayoutParams f35579b;

    public c(LinearLayout linearLayout, FrameLayout.LayoutParams layoutParams) {
        this.f35578a = linearLayout;
        this.f35579b = layoutParams;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        this.f35578a.removeAllViews();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerListener
    public final void onBannerAdLoaded() {
        LinearLayout linearLayout = this.f35578a;
        linearLayout.removeAllViews();
        linearLayout.addView(a.f35555a, 0, this.f35579b);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerListener
    public final void onBannerAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerListener
    public final void onBannerAdLeftApplication() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerListener
    public final void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerListener
    public final void onBannerAdScreenPresented() {
    }
}
