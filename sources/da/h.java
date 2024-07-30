package da;

import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public final class h implements RemoteCallResultCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppDownloadTask f27552a;

    public h(AppDownloadTask appDownloadTask) {
        this.f27552a = appDownloadTask;
    }

    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
    public final void onRemoteCallResult(String str, CallResult<String> callResult) {
        if (callResult.getCode() != -1) {
            ex.V("ApDnMgr", " resume task is success:" + this.f27552a.h());
        }
    }
}
