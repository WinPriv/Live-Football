package com.google.android.gms.internal.measurement;

import a3.l;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzjd {
    public static Object zza(@CheckForNull Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(l.i("at index ", i10));
    }

    public static Object[] zzb(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zza(objArr[i11], i11);
        }
        return objArr;
    }
}
