package da;

import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class p extends TimerTask {

    /* renamed from: s, reason: collision with root package name */
    public final AppDownloadTask f27573s;

    public p(AppDownloadTask appDownloadTask) {
        this.f27573s = appDownloadTask;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ex.Code("TaskDelTimer", "del task");
        com.huawei.openalliance.ad.download.app.a.t().e(this.f27573s);
    }
}
