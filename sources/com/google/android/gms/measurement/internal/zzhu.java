package com.google.android.gms.measurement.internal;

import a3.l;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhu implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzik zzb;

    public zzhu(zzik zzikVar, Bundle bundle) {
        this.zzb = zzikVar;
        this.zza = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar = this.zzb;
        Bundle bundle = this.zza;
        zzikVar.zzg();
        zzikVar.zza();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!zzikVar.zzt.zzJ()) {
            l.A(zzikVar.zzt, "Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzikVar.zzt.zzt().zzE(new zzac(bundle.getString("app_id"), "", new zzlk(checkNotEmpty, 0L, null, ""), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzikVar.zzt.zzv().zzz(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
