package la;

import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity;
import com.huawei.openalliance.ad.ppskit.views.AppDownloadButton;
import com.huawei.openalliance.ad.ppskit.views.PPSExpandButtonDetailView;
import com.huawei.openalliance.ad.ppskit.views.PPSRewardView;
import ka.n7;

/* loaded from: classes2.dex */
public final class x implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSRewardActivity f32590s;

    public x(PPSRewardActivity pPSRewardActivity) {
        this.f32590s = pPSRewardActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppDownloadButton appDownloadButton;
        PPSRewardActivity pPSRewardActivity = this.f32590s;
        try {
            PPSRewardView pPSRewardView = pPSRewardActivity.f22398u;
            if (pPSRewardView != null && pPSRewardView.getAppDetailView() != null && (pPSRewardActivity.f22398u.getAppDetailView() instanceof PPSExpandButtonDetailView) && (appDownloadButton = pPSRewardActivity.f22398u.getAppDetailView().getAppDownloadButton()) != null) {
                n7.b("PPSRewardActivity", "reSetButtonWidth");
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) appDownloadButton.getLayoutParams();
                layoutParams.width = -1;
                appDownloadButton.setLayoutParamsSkipSizeReset(layoutParams);
            }
        } catch (Throwable th) {
            n7.j("PPSRewardActivity", "resetButtonWidth exception: %s", th.getClass().getSimpleName());
        }
    }
}
