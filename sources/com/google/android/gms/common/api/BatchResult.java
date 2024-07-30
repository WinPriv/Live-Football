package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class BatchResult implements Result {
    private final Status zaa;
    private final PendingResult<?>[] zab;

    public BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.zaa = status;
        this.zab = pendingResultArr;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zaa;
    }

    public <R extends Result> R take(BatchResultToken<R> batchResultToken) {
        boolean z10;
        if (batchResultToken.mId < this.zab.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "The result token does not belong to this batch");
        return (R) this.zab[batchResultToken.mId].await(0L, TimeUnit.MILLISECONDS);
    }
}
