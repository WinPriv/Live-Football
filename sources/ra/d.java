package ra;

import android.widget.Toast;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;

/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppDownloadTask f34944s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f34945t;

    public d(f fVar, AppDownloadTask appDownloadTask) {
        this.f34945t = fVar;
        this.f34944s = appDownloadTask;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String appName = this.f34944s.f0().getAppName();
        f fVar = this.f34945t;
        Toast.makeText(fVar.f34947a, fVar.f34947a.getString(R.string.hiad_download_failed_toast_content, appName), 0).show();
    }
}
