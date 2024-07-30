package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Arrays;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.0e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC05220e {
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-25, -27, -14, -14, -13, -8, 3, -13, -12, -23, -14, -6, -8, 5, 5, 6, Ascii.VT, Ascii.SYN, Ascii.VT, 9, -8, -6, 2};
    }

    static {
        A01();
    }

    public static boolean A02(@Nullable EnumC05220e enumC05220e) {
        return A02.equals(enumC05220e) || A03.equals(enumC05220e);
    }
}
