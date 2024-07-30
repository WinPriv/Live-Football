package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import q.b;
import q.h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public class AvailabilityException extends Exception {
    private final b<ApiKey<?>, ConnectionResult> zaa;

    public AvailabilityException(b<ApiKey<?>, ConnectionResult> bVar) {
        this.zaa = bVar;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z10 = this.zaa.getOrDefault(apiKey, null) != null;
        String zab = apiKey.zab();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zab).length() + 58);
        sb2.append("The given API (");
        sb2.append(zab);
        sb2.append(") was not part of the availability request.");
        Preconditions.checkArgument(z10, sb2.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((h.c) this.zaa.keySet()).iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            ApiKey apiKey = (ApiKey) it.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
            z10 &= !connectionResult.isSuccess();
            String zab = apiKey.zab();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb2 = new StringBuilder(String.valueOf(zab).length() + 2 + valueOf.length());
            sb2.append(zab);
            sb2.append(": ");
            sb2.append(valueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }

    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z10 = this.zaa.getOrDefault(apiKey, null) != null;
        String zab = apiKey.zab();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zab).length() + 58);
        sb2.append("The given API (");
        sb2.append(zab);
        sb2.append(") was not part of the availability request.");
        Preconditions.checkArgument(z10, sb2.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
    }
}
