package gb;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import com.huawei.openalliance.ad.constant.bw;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class a0 implements RemoteCallResultCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f28546a;

    public a0(Context context) {
        this.f28546a = new WeakReference<>(context);
    }

    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
    public final void onRemoteCallResult(String str, CallResult<String> callResult) {
        String data = callResult.getData();
        Context context = this.f28546a.get();
        if (context != null && !TextUtils.isEmpty(data) && data.startsWith(bw.CONTENT.toString())) {
            SourceParam sourceParam = new SourceParam();
            sourceParam.l(false);
            sourceParam.h();
            sourceParam.i(data);
            byte[] bArr = w0.f28642a;
            w0.f(context.getApplicationContext(), sourceParam, null, null, null);
        }
    }
}
