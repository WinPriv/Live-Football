package com.google.android.gms.internal.measurement;

import android.net.Uri;
import q.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhq {
    private static final b zza = new b();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        synchronized (zzhq.class) {
            b bVar = zza;
            Uri uri = (Uri) bVar.getOrDefault("com.google.android.gms.measurement", null);
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                bVar.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
