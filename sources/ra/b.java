package ra;

import android.widget.Toast;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppDownloadTask f34941s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f34942t;

    public b(f fVar, AppDownloadTask appDownloadTask) {
        this.f34942t = fVar;
        this.f34941s = appDownloadTask;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String appName = this.f34941s.f0().getAppName();
        f fVar = this.f34942t;
        Toast.makeText(fVar.f34947a, fVar.f34947a.getString(R.string.hiad_download_retry_toast_content, appName), 0).show();
    }
}
