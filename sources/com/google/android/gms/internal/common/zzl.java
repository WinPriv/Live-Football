package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
final class zzl extends zzk {
    private final char zza;

    public zzl(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
        int i10 = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c10) {
        if (c10 == this.zza) {
            return true;
        }
        return false;
    }
}
