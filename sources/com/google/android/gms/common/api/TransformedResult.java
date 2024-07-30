package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class TransformedResult<R extends Result> {
    public abstract void andFinally(ResultCallbacks<? super R> resultCallbacks);

    public abstract <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform);
}
