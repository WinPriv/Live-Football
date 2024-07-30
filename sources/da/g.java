package da;

import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public final class g implements RemoteCallResultCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppDownloadTask f27550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.huawei.openalliance.ad.download.app.a f27551b;

    public g(com.huawei.openalliance.ad.download.app.a aVar, AppDownloadTask appDownloadTask) {
        this.f27551b = aVar;
        this.f27550a = appDownloadTask;
    }

    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
    public final void onRemoteCallResult(String str, CallResult<String> callResult) {
        if (callResult.getCode() != -1) {
            this.f27551b.b(this.f27550a);
        }
    }
}
