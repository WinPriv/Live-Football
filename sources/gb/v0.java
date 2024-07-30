package gb;

import android.content.Context;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public final class v0 implements RemoteCallResultCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SourceParam f28639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28640b;

    public v0(SourceParam sourceParam, Context context) {
        this.f28639a = sourceParam;
        this.f28640b = context;
    }

    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
    public final void onRemoteCallResult(String str, CallResult<String> callResult) {
        Context applicationContext;
        int i10;
        String str2;
        String data = callResult.getData();
        ex.V("ImageUtil", "get drawable from net, errorCode: %s filePath: %s", Integer.valueOf(callResult.getCode()), androidx.transition.n.e(data));
        Context context = this.f28640b;
        SourceParam sourceParam = this.f28639a;
        if (data == null) {
            w0.a(sourceParam.a());
            applicationContext = context.getApplicationContext();
            i10 = 3;
            str2 = "filepath is null";
        } else if (!w0.i(context.getApplicationContext(), sourceParam, sourceParam.a(), data)) {
            w0.a(sourceParam.a());
            applicationContext = context.getApplicationContext();
            i10 = 4;
            str2 = "image not download";
        } else {
            return;
        }
        w0.m(applicationContext, i10, sourceParam, str2);
    }
}
