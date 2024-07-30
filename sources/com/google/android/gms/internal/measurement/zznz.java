package com.google.android.gms.internal.measurement;

import com.applovin.exoplayer2.common.base.Ascii;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zznz {
    public static final /* synthetic */ int zza = 0;
    private static final zznw zzb;

    static {
        if (zznu.zzx() && zznu.zzy()) {
            int i10 = zzjm.zza;
        }
        zzb = new zznx();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    byte b11 = bArr[i10];
                    byte b12 = bArr[i10 + 1];
                    if (b10 <= -12 && b11 <= -65 && b12 <= -65) {
                        return ((b11 << 8) ^ b10) ^ (b12 << Ascii.DLE);
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                byte b13 = bArr[i10];
                if (b10 <= -12 && b13 <= -65) {
                    return b10 ^ (b13 << 8);
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fc, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzb(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznz.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new zzny(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    public static boolean zzd(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    public static boolean zze(byte[] bArr, int i10, int i11) {
        return zzb.zzb(bArr, i10, i11);
    }
}
