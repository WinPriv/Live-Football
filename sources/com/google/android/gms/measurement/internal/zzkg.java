package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkg {
    private final Context zza;

    public zzkg(Context context) {
        Preconditions.checkNotNull(context);
        this.zza = context;
    }

    private final zzet zzk() {
        return zzgd.zzp(this.zza, null, null).zzaA();
    }

    public final int zza(final Intent intent, int i10, final int i11) {
        zzgd zzp = zzgd.zzp(this.zza, null, null);
        final zzet zzaA = zzp.zzaA();
        if (intent == null) {
            zzaA.zzk().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzp.zzay();
        zzaA.zzj().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkd
                @Override // java.lang.Runnable
                public final void run() {
                    zzkg.this.zzc(i11, zzaA, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder zzb(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgv(zzlh.zzt(this.zza), null);
        }
        zzk().zzk().zzb("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void zzc(int i10, zzet zzetVar, Intent intent) {
        if (((zzkf) this.zza).zzc(i10)) {
            zzetVar.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            zzk().zzj().zza("Completed wakeful intent.");
            ((zzkf) this.zza).zza(intent);
        }
    }

    public final /* synthetic */ void zzd(zzet zzetVar, JobParameters jobParameters) {
        zzetVar.zzj().zza("AppMeasurementJobService processed last upload request.");
        ((zzkf) this.zza).zzb(jobParameters, false);
    }

    public final void zze() {
        zzgd zzp = zzgd.zzp(this.zza, null, null);
        zzet zzaA = zzp.zzaA();
        zzp.zzay();
        zzaA.zzj().zza("Local AppMeasurementService is starting up");
    }

    public final void zzf() {
        zzgd zzp = zzgd.zzp(this.zza, null, null);
        zzet zzaA = zzp.zzaA();
        zzp.zzay();
        zzaA.zzj().zza("Local AppMeasurementService is shutting down");
    }

    public final void zzg(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onRebind called with null intent");
        } else {
            zzk().zzj().zzb("onRebind called. action", intent.getAction());
        }
    }

    public final void zzh(Runnable runnable) {
        zzlh zzt = zzlh.zzt(this.zza);
        zzt.zzaB().zzp(new zzke(this, zzt, runnable));
    }

    @TargetApi(24)
    public final boolean zzi(final JobParameters jobParameters) {
        zzgd zzp = zzgd.zzp(this.zza, null, null);
        final zzet zzaA = zzp.zzaA();
        String string = jobParameters.getExtras().getString("action");
        zzp.zzay();
        zzaA.zzj().zzb("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkc
                @Override // java.lang.Runnable
                public final void run() {
                    zzkg.this.zzd(zzaA, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    public final boolean zzj(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onUnbind called with null intent");
            return true;
        }
        zzk().zzj().zzb("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
