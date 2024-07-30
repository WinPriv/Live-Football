package com.huawei.openalliance.ad.ipc;

import com.huawei.hms.ads.annotation.AllApi;

@AllApi
/* loaded from: classes2.dex */
public interface RemoteCallResultCallback<T> {
    void onRemoteCallResult(String str, CallResult<T> callResult);
}
