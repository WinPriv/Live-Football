package t8;

import android.widget.LinearLayout;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;

/* compiled from: AdsManager.java */
/* loaded from: classes2.dex */
public final class k implements MaxAdViewAdListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f35589s;

    public k(LinearLayout linearLayout) {
        this.f35589s = linearLayout;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f35589s.removeAllViews();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        LinearLayout linearLayout = this.f35589s;
        linearLayout.removeAllViews();
        linearLayout.addView(a.f35556b);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public final void onAdCollapsed(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public final void onAdExpanded(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String str, MaxError maxError) {
    }
}
