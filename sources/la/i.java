package la;

import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;
import com.huawei.openalliance.ad.ppskit.views.AppDownloadButton;
import com.huawei.openalliance.ad.ppskit.views.PPSExpandButtonDetailView;
import ka.n7;

/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSActivity f32573s;

    public i(PPSActivity pPSActivity) {
        this.f32573s = pPSActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppDownloadButton appDownloadButton;
        PPSActivity pPSActivity = this.f32573s;
        try {
            PPSExpandButtonDetailView pPSExpandButtonDetailView = pPSActivity.G;
            if (pPSExpandButtonDetailView != null && pPSExpandButtonDetailView.getVisibility() == 0 && (appDownloadButton = pPSActivity.G.getAppDownloadButton()) != null) {
                n7.b("PPSActivity", "reSetButtonWidth");
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) appDownloadButton.getLayoutParams();
                layoutParams.width = -1;
                appDownloadButton.setLayoutParamsSkipSizeReset(layoutParams);
            }
        } catch (Throwable th) {
            n7.j("PPSActivity", "resetButtonWidth exception: %s", th.getClass().getSimpleName());
        }
    }
}
