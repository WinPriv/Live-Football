package com.google.android.gms.common.util;

import com.anythink.expressad.exoplayer.k.p;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] bArr, int i10, int i11, int i12) {
        int i13 = (i11 & (-4)) + i10;
        while (i10 < i13) {
            int i14 = ((bArr[i10] & p.f9095b) | ((bArr[i10 + 1] & p.f9095b) << 8) | ((bArr[i10 + 2] & p.f9095b) << 16) | (bArr[i10 + 3] << 24)) * (-862048943);
            int i15 = i12 ^ (((i14 << 15) | (i14 >>> 17)) * 461845907);
            i12 = (((i15 >>> 19) | (i15 << 13)) * 5) - 430675100;
            i10 += 4;
        }
        int i16 = i11 & 3;
        int i17 = 0;
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    i17 = (bArr[i13 + 2] & p.f9095b) << 16;
                }
                int i18 = i12 ^ i11;
                int i19 = (i18 ^ (i18 >>> 16)) * (-2048144789);
                int i20 = (i19 ^ (i19 >>> 13)) * (-1028477387);
                return i20 ^ (i20 >>> 16);
            }
            i17 |= (bArr[i13 + 1] & p.f9095b) << 8;
        }
        int i21 = ((bArr[i13] & p.f9095b) | i17) * (-862048943);
        i12 ^= ((i21 >>> 17) | (i21 << 15)) * 461845907;
        int i182 = i12 ^ i11;
        int i192 = (i182 ^ (i182 >>> 16)) * (-2048144789);
        int i202 = (i192 ^ (i192 >>> 13)) * (-1028477387);
        return i202 ^ (i202 >>> 16);
    }
}
