package com.google.android.gms.internal.measurement;

import a3.k;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str != null) {
            this.zza = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return false;
        }
        return this.zza.equals(((zzat) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return k.l("\"", this.zza, "\"");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02f9, code lost:
    
        if (r1[r7].isEmpty() == false) goto L138;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0163. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0266  */
    @Override // com.google.android.gms.internal.measurement.zzap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzap zzbU(java.lang.String r19, com.google.android.gms.internal.measurement.zzg r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 1724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzat.zzbU(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
