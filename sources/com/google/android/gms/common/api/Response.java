package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(T t10) {
        this.zza = t10;
    }

    public Response(T t10) {
        this.zza = t10;
    }
}
