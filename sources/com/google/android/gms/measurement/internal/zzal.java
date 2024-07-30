package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzal {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zza(com.google.android.gms.measurement.internal.zzet r15, android.database.sqlite.SQLiteDatabase r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String[] r20) throws android.database.sqlite.SQLiteException {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(com.google.android.gms.measurement.internal.zzet, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void zzb(zzet zzetVar, SQLiteDatabase sQLiteDatabase) {
        if (zzetVar != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                zzetVar.zzk().zza("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzetVar.zzk().zza("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzetVar.zzk().zza("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                zzetVar.zzk().zza("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
