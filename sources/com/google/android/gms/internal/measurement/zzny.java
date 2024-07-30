package com.google.android.gms.internal.measurement;

import a3.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzny extends IllegalArgumentException {
    public zzny(int i10, int i11) {
        super(k.j("Unpaired surrogate at index ", i10, " of ", i11));
    }
}
