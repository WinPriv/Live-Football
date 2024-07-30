package da;

import android.content.DialogInterface;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import da.m;

/* loaded from: classes2.dex */
public final class l implements DialogInterface.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m.a f27559s;

    public l(AppDownloadButton.j jVar) {
        this.f27559s = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        AppDownloadButton appDownloadButton = AppDownloadButton.this;
        appDownloadButton.setNeedShowConfirmDialog(false);
        appDownloadButton.Code(false);
    }
}
