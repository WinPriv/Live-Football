package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zacv extends TaskApiCall {
    final /* synthetic */ TaskApiCall.Builder zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacv(TaskApiCall.Builder builder, Feature[] featureArr, boolean z10, int i10) {
        super(featureArr, z10, i10);
        this.zaa = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        RemoteCall remoteCall;
        remoteCall = this.zaa.zaa;
        remoteCall.accept(anyClient, taskCompletionSource);
    }
}
