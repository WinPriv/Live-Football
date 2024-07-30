package sa;

import com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask;
import ka.d7;
import ka.n7;
import ka.y6;

/* loaded from: classes2.dex */
public final class c implements d7<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppLocalDownloadTask f35302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f35303b;

    public c(b bVar, AppLocalDownloadTask appLocalDownloadTask) {
        this.f35303b = bVar;
        this.f35302a = appLocalDownloadTask;
    }

    @Override // ka.d7
    public final void a(y6 y6Var) {
        if (y6Var.f32210b == 200 && String.valueOf(Boolean.TRUE).equals(y6Var.f32211c)) {
            b bVar = this.f35303b;
            AppLocalDownloadTask appLocalDownloadTask = this.f35302a;
            bVar.j(appLocalDownloadTask);
            n7.e("ApDnMgr", " removeTask task is success:" + appLocalDownloadTask.g());
        }
    }
}
