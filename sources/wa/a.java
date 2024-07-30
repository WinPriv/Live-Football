package wa;

import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import com.huawei.openalliance.ad.ppskit.linked.view.LinkedAppDetailView;
import com.huawei.openalliance.ad.ppskit.views.AppDownloadButton;
import ka.fj;
import ka.wi;

/* loaded from: classes2.dex */
public final class a implements fj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedAppDetailView f36183a;

    public a(LinkedAppDetailView linkedAppDetailView) {
        this.f36183a = linkedAppDetailView;
    }

    @Override // ka.fj
    public final void a(AppDownloadButton appDownloadButton) {
        String str;
        LinkedAppDetailView linkedAppDetailView = this.f36183a;
        if (linkedAppDetailView.C != null) {
            if (AppStatus.INSTALLED == appDownloadButton.getStatus()) {
                str = "app";
            } else {
                str = "";
            }
            linkedAppDetailView.A.g(0, 0, linkedAppDetailView.y);
            linkedAppDetailView.C.a(new wi(str, linkedAppDetailView.B, true));
        }
    }

    @Override // ka.fj
    public final void b(AppDownloadButton appDownloadButton) {
        String str;
        LinkedAppDetailView linkedAppDetailView = this.f36183a;
        if (linkedAppDetailView.C != null) {
            if (AppStatus.INSTALLED == appDownloadButton.getStatus()) {
                str = "app";
            } else {
                str = "";
            }
            linkedAppDetailView.C.a(new wi(str, linkedAppDetailView.B, false));
        }
    }
}
