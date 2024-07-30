package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import q.b;
import q.h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zal {
    private int zad;
    private final b<ApiKey<?>, String> zab = new b<>();
    private final TaskCompletionSource<Map<ApiKey<?>, String>> zac = new TaskCompletionSource<>();
    private boolean zae = false;
    private final b<ApiKey<?>, ConnectionResult> zaa = new b<>();

    public zal(Iterable<? extends HasApiKey<?>> iterable) {
        Iterator<? extends HasApiKey<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(it.next().getApiKey(), null);
        }
        this.zad = ((h.c) this.zaa.keySet()).size();
    }

    public final Task<Map<ApiKey<?>, String>> zaa() {
        return this.zac.getTask();
    }

    public final Set<ApiKey<?>> zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey<?> apiKey, ConnectionResult connectionResult, String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (this.zae) {
                this.zac.setException(new AvailabilityException(this.zaa));
            } else {
                this.zac.setResult(this.zab);
            }
        }
    }
}
