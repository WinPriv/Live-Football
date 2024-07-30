package t8;

import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.anythink.banner.api.ATBannerListener;
import com.anythink.banner.api.ATBannerView;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;

/* compiled from: AdsManager.java */
/* loaded from: classes2.dex */
public final class b implements ATBannerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f35577a;

    public b(LinearLayout linearLayout) {
        this.f35577a = linearLayout;
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public final void onBannerAutoRefreshFail(AdError adError) {
        Log.e("TAG", "onBannerAutoRefreshFail:" + adError.getFullErrorInfo());
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public final void onBannerClose(ATAdInfo aTAdInfo) {
        ATBannerView aTBannerView = a.f35560g;
        if (aTBannerView != null && aTBannerView.getParent() != null) {
            ((ViewGroup) a.f35560g.getParent()).removeView(a.f35560g);
        }
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public final void onBannerFailed(AdError adError) {
        Log.e("TAG", "onBannerFailed:" + adError.getFullErrorInfo());
        this.f35577a.removeAllViews();
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public final void onBannerLoaded() {
        LinearLayout linearLayout = this.f35577a;
        linearLayout.removeAllViews();
        linearLayout.addView(a.f35560g);
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public final void onBannerAutoRefreshed(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public final void onBannerClicked(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public final void onBannerShow(ATAdInfo aTAdInfo) {
    }
}
