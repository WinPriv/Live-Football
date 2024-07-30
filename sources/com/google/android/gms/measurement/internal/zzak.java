package com.google.android.gms.measurement.internal;

import a3.k;
import a3.l;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzak extends zzku {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzaj zzj;
    private final zzkq zzk;

    public zzak(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzk = new zzkq(this.zzt.zzax());
        this.zzt.zzf();
        this.zzj = new zzaj(this, this.zzt.zzaw(), "google_app_measurement.db");
    }

    public static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put("value", (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzh().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaa(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzh().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j11 = cursor.getLong(0);
                    cursor.close();
                    return j11;
                }
                cursor.close();
                return j10;
            } catch (SQLiteException e10) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzd("Error deleting user property. appId", zzet.zzn(str), this.zzt.zzj().zzf(str2), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0237, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e1, code lost:
    
        r0 = r23.zzt.zzaA().zzk();
        r9 = com.google.android.gms.measurement.internal.zzet.zzn(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f9, code lost:
    
        if (r12.zzp() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fb, code lost:
    
        r20 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0208, code lost:
    
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0206, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0299, code lost:
    
        r21 = r7;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02a7, code lost:
    
        if (r0.hasNext() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a9, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzet) r0.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c3, code lost:
    
        if (r3.zze().isEmpty() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02f2, code lost:
    
        r7 = r3.zzbx();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0309, code lost:
    
        if (r3.zzj() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030b, code lost:
    
        r12 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0315, code lost:
    
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0327, code lost:
    
        if (r3.zzk() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0329, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0333, code lost:
    
        r11.put("session_scoped", r0);
        r11.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0347, code lost:
    
        if (zzh().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x035d, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0349, code lost:
    
        r23.zzt.zzaA().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzet.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0361, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0362, code lost:
    
        r23.zzt.zzaA().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzet.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0332, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0314, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c5, code lost:
    
        r0 = r23.zzt.zzaA().zzk();
        r8 = com.google.android.gms.measurement.internal.zzet.zzn(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02dd, code lost:
    
        if (r3.zzj() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02df, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e9, code lost:
    
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e8, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03ac, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017a, code lost:
    
        r11 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
    
        if (r11.hasNext() == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0192, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzet) r11.next()).zzj() != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0194, code lost:
    
        r23.zzt.zzaA().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzet.zzn(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ad, code lost:
    
        r11 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c3, code lost:
    
        if (r11.hasNext() == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.zzek) r11.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01df, code lost:
    
        if (r12.zzg().isEmpty() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0213, code lost:
    
        r3 = r12.zzbx();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022c, code lost:
    
        if (r12.zzp() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022e, code lost:
    
        r9 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0238, code lost:
    
        r7.put("filter_id", r9);
        r7.put("event_name", r12.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0248, code lost:
    
        if (r12.zzq() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024a, code lost:
    
        r9 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0254, code lost:
    
        r7.put("session_scoped", r9);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0268, code lost:
    
        if (zzh().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x026a, code lost:
    
        r23.zzt.zzaA().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzet.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027d, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0283, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0284, code lost:
    
        r23.zzt.zzaA().zzd().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzet.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0375, code lost:
    
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = zzh();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0253, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzB(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzB(java.lang.String, java.util.List):void");
    }

    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    public final void zzD(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzW();
        String zzv = zzhVar.zzv();
        Preconditions.checkNotNull(zzv);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzv);
        contentValues.put("app_instance_id", zzhVar.zzw());
        contentValues.put("gmp_app_id", zzhVar.zzA());
        contentValues.put("resettable_device_id_hash", zzhVar.zzC());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("app_version", zzhVar.zzy());
        contentValues.put("app_store", zzhVar.zzx());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzan()));
        contentValues.put("day", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzb()));
        contentValues.put("firebase_instance_id", zzhVar.zzz());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("health_monitor_sample", zzhVar.zzB());
        zzhVar.zza();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzam()));
        contentValues.put("admob_app_id", zzhVar.zzt());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzk()));
        contentValues.put("session_stitching_token", zzhVar.zzD());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzap()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzr()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzq()));
        List zzE = zzhVar.zzE();
        if (zzE != null) {
            if (zzE.isEmpty()) {
                this.zzt.zzaA().zzk().zzb("Safelisted events should not be an empty list. appId", zzv);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzE));
            }
        }
        zzop.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzak) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase zzh2 = zzh();
            if (zzh2.update("apps", contentValues, "app_id = ?", new String[]{zzv}) == 0 && zzh2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update app (got -1). appId", zzet.zzn(zzv));
            }
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzc("Error storing app. appId", zzet.zzn(zzv), e10);
        }
    }

    public final void zzE(zzaq zzaqVar) {
        Long l10;
        Preconditions.checkNotNull(zzaqVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzaqVar.zza);
        contentValues.put("name", zzaqVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzaqVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzaqVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzaqVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzaqVar.zzg));
        contentValues.put("last_bundled_day", zzaqVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzaqVar.zzi);
        contentValues.put("last_sampling_rate", zzaqVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzaqVar.zze));
        Boolean bool = zzaqVar.zzk;
        if (bool != null && bool.booleanValue()) {
            l10 = 1L;
        } else {
            l10 = null;
        }
        contentValues.put("last_exempt_from_sampling", l10);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzet.zzn(zzaqVar.zza));
            }
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzc("Error storing event aggregates. appId", zzet.zzn(zzaqVar.zza), e10);
        }
    }

    public final boolean zzF() {
        if (zzZ("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzG() {
        if (zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzH() {
        if (zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzI() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l10, long j10, com.google.android.gms.internal.measurement.zzft zzftVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzftVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l10);
        byte[] zzbx = zzftVar.zzbx();
        this.zzt.zzaA().zzj().zzc("Saving complex main event, appId, data size", this.zzt.zzj().zzd(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzbx);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert complex main event (got -1). appId", zzet.zzn(str));
                return false;
            }
            return true;
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzc("Error storing complex main event. appId", zzet.zzn(str), e10);
            return false;
        }
    }

    public final boolean zzK(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zzW();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzacVar.zzc.zzb) == null) {
            long zzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzt.zzf();
            if (zzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zzb);
        zzV(contentValues, "value", Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.zzt.zzv().zzap(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.zzt.zzv().zzap(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.zzt.zzv().zzap(zzacVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzet.zzn(str));
            }
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzc("Error storing conditional user property", zzet.zzn(str), e10);
        }
        return true;
    }

    public final boolean zzL(zzlm zzlmVar) {
        Preconditions.checkNotNull(zzlmVar);
        zzg();
        zzW();
        if (zzp(zzlmVar.zza, zzlmVar.zzc) == null) {
            if (zzlp.zzak(zzlmVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzlmVar.zza}) >= this.zzt.zzf().zzf(zzlmVar.zza, zzeg.zzG, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzlmVar.zzc)) {
                long zzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzlmVar.zza, zzlmVar.zzb});
                this.zzt.zzf();
                if (zzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzlmVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzlmVar.zzb);
        contentValues.put("name", zzlmVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzlmVar.zzd));
        zzV(contentValues, "value", zzlmVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update user property (got -1). appId", zzet.zzn(zzlmVar.zza));
            }
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzc("Error storing user property. appId", zzet.zzn(zzlmVar.zza), e10);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020f  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzU(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.zzle r26) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzU(java.lang.String, long, long, com.google.android.gms.measurement.internal.zzle):void");
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzd("Error deleting conditional property", zzet.zzn(str), this.zzt.zzj().zzf(str2), e10);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        return false;
    }

    public final long zzc(String str, String str2) {
        long j10;
        SQLiteException e10;
        ContentValues contentValues;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        try {
            try {
                j10 = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (j10 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (zzh2.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.zzt.zzaA().zzd().zzc("Failed to insert column (got -1). appId", zzet.zzn(str), "first_open_count");
                        return -1L;
                    }
                    j10 = 0;
                }
                try {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + j10));
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.zzt.zzaA().zzd().zzd("Error inserting column. appId", zzet.zzn(str), "first_open_count", e10);
                    return j10;
                }
            } finally {
                zzh2.endTransaction();
            }
        } catch (SQLiteException e12) {
            j10 = 0;
            e10 = e12;
        }
        if (zzh2.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
            this.zzt.zzaA().zzd().zzc("Failed to update column (got 0). appId", zzet.zzn(str), "first_open_count");
            return -1L;
        }
        zzh2.setTransactionSuccessful();
        return j10;
    }

    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzk().zzb("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:215), block:B:57:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zzi(java.lang.String r8) {
        /*
            r7 = this;
            r7.zzg()
            r7.zzW()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.zzh()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r2 != 0) goto L30
            com.google.android.gms.measurement.internal.zzgd r8 = r7.zzt     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzet r8 = r8.zzaA()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzer r8 = r8.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r2 = "Default event parameters not found"
            r8.zza(r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        L30:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfs r3 = com.google.android.gms.internal.measurement.zzft.zze()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzmh r2 = com.google.android.gms.measurement.internal.zzlj.zzm(r3, r2)     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzlb r2 = r2.zzaD()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzft r2 = (com.google.android.gms.internal.measurement.zzft) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzlh r8 = r7.zzf     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r8.zzu()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.List r8 = r2.zzi()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
        L56:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfx r3 = (com.google.android.gms.internal.measurement.zzfx) r3     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            boolean r5 = r3.zzu()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L74
            double r5 = r3.zza()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L74:
            boolean r5 = r3.zzv()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L82
            float r3 = r3.zzb()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L82:
            boolean r5 = r3.zzy()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L90
            java.lang.String r3 = r3.zzh()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L90:
            boolean r5 = r3.zzw()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L56
            long r5 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L9e:
            r1.close()
            return r2
        La2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgd r3 = r7.zzt     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzet.zzn(r8)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r3.zzc(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        Lba:
            r8 = move-exception
            goto Lc0
        Lbc:
            r8 = move-exception
            goto Ld7
        Lbe:
            r8 = move-exception
            r1 = r0
        Lc0:
            com.google.android.gms.measurement.internal.zzgd r2 = r7.zzt     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzet r2 = r2.zzaA()     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzer r2 = r2.zzd()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zzb(r3, r8)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Ld4
            r1.close()
        Ld4:
            return r0
        Ld5:
            r8 = move-exception
            r0 = r1
        Ld7:
            if (r0 == 0) goto Ldc
            r0.close()
        Ldc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzi(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0256: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:599), block:B:68:0x0256 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0187 A[Catch: SQLiteException -> 0x0236, all -> 0x0255, TryCatch #1 {all -> 0x0255, blocks: (B:5:0x0067, B:10:0x0071, B:12:0x00d4, B:16:0x00de, B:19:0x0128, B:21:0x0157, B:25:0x0161, B:28:0x017c, B:30:0x0187, B:31:0x0199, B:33:0x01aa, B:35:0x01c1, B:37:0x01d2, B:39:0x01da, B:42:0x01e2, B:44:0x01e5, B:46:0x01f6, B:47:0x01ff, B:49:0x020d, B:50:0x0216, B:52:0x021f, B:56:0x01b8, B:57:0x0178, B:59:0x0123, B:62:0x023c), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01aa A[Catch: SQLiteException -> 0x0236, all -> 0x0255, TryCatch #1 {all -> 0x0255, blocks: (B:5:0x0067, B:10:0x0071, B:12:0x00d4, B:16:0x00de, B:19:0x0128, B:21:0x0157, B:25:0x0161, B:28:0x017c, B:30:0x0187, B:31:0x0199, B:33:0x01aa, B:35:0x01c1, B:37:0x01d2, B:39:0x01da, B:42:0x01e2, B:44:0x01e5, B:46:0x01f6, B:47:0x01ff, B:49:0x020d, B:50:0x0216, B:52:0x021f, B:56:0x01b8, B:57:0x0178, B:59:0x0123, B:62:0x023c), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d2 A[Catch: SQLiteException -> 0x0236, all -> 0x0255, TryCatch #1 {all -> 0x0255, blocks: (B:5:0x0067, B:10:0x0071, B:12:0x00d4, B:16:0x00de, B:19:0x0128, B:21:0x0157, B:25:0x0161, B:28:0x017c, B:30:0x0187, B:31:0x0199, B:33:0x01aa, B:35:0x01c1, B:37:0x01d2, B:39:0x01da, B:42:0x01e2, B:44:0x01e5, B:46:0x01f6, B:47:0x01ff, B:49:0x020d, B:50:0x0216, B:52:0x021f, B:56:0x01b8, B:57:0x0178, B:59:0x0123, B:62:0x023c), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f6 A[Catch: SQLiteException -> 0x0236, all -> 0x0255, TryCatch #1 {all -> 0x0255, blocks: (B:5:0x0067, B:10:0x0071, B:12:0x00d4, B:16:0x00de, B:19:0x0128, B:21:0x0157, B:25:0x0161, B:28:0x017c, B:30:0x0187, B:31:0x0199, B:33:0x01aa, B:35:0x01c1, B:37:0x01d2, B:39:0x01da, B:42:0x01e2, B:44:0x01e5, B:46:0x01f6, B:47:0x01ff, B:49:0x020d, B:50:0x0216, B:52:0x021f, B:56:0x01b8, B:57:0x0178, B:59:0x0123, B:62:0x023c), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020d A[Catch: SQLiteException -> 0x0236, all -> 0x0255, TryCatch #1 {all -> 0x0255, blocks: (B:5:0x0067, B:10:0x0071, B:12:0x00d4, B:16:0x00de, B:19:0x0128, B:21:0x0157, B:25:0x0161, B:28:0x017c, B:30:0x0187, B:31:0x0199, B:33:0x01aa, B:35:0x01c1, B:37:0x01d2, B:39:0x01da, B:42:0x01e2, B:44:0x01e5, B:46:0x01f6, B:47:0x01ff, B:49:0x020d, B:50:0x0216, B:52:0x021f, B:56:0x01b8, B:57:0x0178, B:59:0x0123, B:62:0x023c), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021f A[Catch: SQLiteException -> 0x0236, all -> 0x0255, TRY_LEAVE, TryCatch #1 {all -> 0x0255, blocks: (B:5:0x0067, B:10:0x0071, B:12:0x00d4, B:16:0x00de, B:19:0x0128, B:21:0x0157, B:25:0x0161, B:28:0x017c, B:30:0x0187, B:31:0x0199, B:33:0x01aa, B:35:0x01c1, B:37:0x01d2, B:39:0x01da, B:42:0x01e2, B:44:0x01e5, B:46:0x01f6, B:47:0x01ff, B:49:0x020d, B:50:0x0216, B:52:0x021f, B:56:0x01b8, B:57:0x0178, B:59:0x0123, B:62:0x023c), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0178 A[Catch: SQLiteException -> 0x0236, all -> 0x0255, TryCatch #1 {all -> 0x0255, blocks: (B:5:0x0067, B:10:0x0071, B:12:0x00d4, B:16:0x00de, B:19:0x0128, B:21:0x0157, B:25:0x0161, B:28:0x017c, B:30:0x0187, B:31:0x0199, B:33:0x01aa, B:35:0x01c1, B:37:0x01d2, B:39:0x01da, B:42:0x01e2, B:44:0x01e5, B:46:0x01f6, B:47:0x01ff, B:49:0x020d, B:50:0x0216, B:52:0x021f, B:56:0x01b8, B:57:0x0178, B:59:0x0123, B:62:0x023c), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123 A[Catch: SQLiteException -> 0x0236, all -> 0x0255, TryCatch #1 {all -> 0x0255, blocks: (B:5:0x0067, B:10:0x0071, B:12:0x00d4, B:16:0x00de, B:19:0x0128, B:21:0x0157, B:25:0x0161, B:28:0x017c, B:30:0x0187, B:31:0x0199, B:33:0x01aa, B:35:0x01c1, B:37:0x01d2, B:39:0x01da, B:42:0x01e2, B:44:0x01e5, B:46:0x01f6, B:47:0x01ff, B:49:0x020d, B:50:0x0216, B:52:0x021f, B:56:0x01b8, B:57:0x0178, B:59:0x0123, B:62:0x023c), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzh zzj(java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzh");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:292), block:B:30:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzac zzk(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzk(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    public final zzai zzl(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return zzm(j10, str, 1L, false, false, z12, false, z14);
    }

    public final zzai zzm(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzai zzaiVar = new zzai();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                Cursor query = zzh2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.zzt.zzaA().zzk().zzb("Not updating daily counts, app is not known. appId", zzet.zzn(str));
                    query.close();
                    return zzaiVar;
                }
                if (query.getLong(0) == j10) {
                    zzaiVar.zzb = query.getLong(1);
                    zzaiVar.zza = query.getLong(2);
                    zzaiVar.zzc = query.getLong(3);
                    zzaiVar.zzd = query.getLong(4);
                    zzaiVar.zze = query.getLong(5);
                }
                if (z10) {
                    zzaiVar.zzb += j11;
                }
                if (z11) {
                    zzaiVar.zza += j11;
                }
                if (z12) {
                    zzaiVar.zzc += j11;
                }
                if (z13) {
                    zzaiVar.zzd += j11;
                }
                if (z14) {
                    zzaiVar.zze += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(zzaiVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzaiVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzaiVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzaiVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzaiVar.zze));
                zzh2.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return zzaiVar;
            } catch (SQLiteException e10) {
                this.zzt.zzaA().zzd().zzc("Error updating daily counts. appId", zzet.zzn(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return zzaiVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzaq zzn(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzn(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzaq");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:164), block:B:27:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzlm zzp(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r21)
            r19.zzg()
            r19.zzW()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.zzh()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r12 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r14 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r4 != 0) goto L40
            r11.close()
            return r10
        L40:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.Object r8 = r1.zzq(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r8 != 0) goto L4e
            r11.close()
            return r10
        L4e:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzlm r0 = new com.google.android.gms.measurement.internal.zzlm     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r2 == 0) goto L75
            com.google.android.gms.measurement.internal.zzgd r2 = r1.zzt     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzet r2 = r2.zzaA()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzer r2 = r2.zzd()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzet.zzn(r20)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2.zzb(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
        L75:
            r11.close()
            return r0
        L79:
            r0 = move-exception
            goto L7f
        L7b:
            r0 = move-exception
            goto La4
        L7d:
            r0 = move-exception
            r11 = r10
        L7f:
            com.google.android.gms.measurement.internal.zzgd r2 = r1.zzt     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzet r2 = r2.zzaA()     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzer r2 = r2.zzd()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzet.zzn(r20)     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzgd r5 = r1.zzt     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzeo r5 = r5.zzj()     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r5.zzf(r9)     // Catch: java.lang.Throwable -> La2
            r2.zzd(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> La2
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r10
        La2:
            r0 = move-exception
            r10 = r11
        La4:
            if (r10 == 0) goto La9
            r10.close()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzp(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzlm");
    }

    public final Object zzq(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            this.zzt.zzaA().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        l.x(this.zzt, "Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i10);
                }
                return Double.valueOf(cursor.getDouble(i10));
            }
            return Long.valueOf(cursor.getLong(i10));
        }
        l.x(this.zzt, "Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzr() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.zzh()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            com.google.android.gms.measurement.internal.zzgd r3 = r6.zzt     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzd()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zzb(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzr():java.lang.String");
    }

    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return zzt(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r2 = r27.zzt.zzaA().zzd();
        r27.zzt.zzf();
        r2.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzt(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzt(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.zzt.zzf();
                cursor = zzh().query("user_attributes", new String[]{"name", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object zzq = zzq(cursor, 3);
                    if (zzq == null) {
                        this.zzt.zzaA().zzd().zzb("Read invalid user property value, ignoring it. appId", zzet.zzn(str));
                    } else {
                        arrayList.add(new zzlm(str, str2, string, j10, zzq));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                this.zzt.zzaA().zzd().zzc("Error querying user properties. appId", zzet.zzn(str), e10);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        r0 = r17.zzt.zzaA().zzd();
        r17.zzt.zzf();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzv(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzv(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    public final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (!zzI()) {
            return;
        }
        String l10 = k.l("(", TextUtils.join(",", list), ")");
        if (zzZ(k.l("SELECT COUNT(1) FROM queue WHERE rowid IN ", l10, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
            k.q(this.zzt, "The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + l10 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzb("Error incrementing retry count. error", e10);
        }
    }

    public final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long zza2 = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzt.zzf();
            if (abs > ((Long) zzeg.zzy.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase zzh2 = zzh();
                    this.zzt.zzf();
                    int delete = zzh2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.zzt.zzax().currentTimeMillis()), String.valueOf(zzag.zzA())});
                    if (delete > 0) {
                        this.zzt.zzaA().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
