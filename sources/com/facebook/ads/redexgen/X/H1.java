package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class H1 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-40, -21, -30, -46, -33, -40, -31, -10, 9, 0, -16, 3, -10, -11, -6, 3};
    }

    public static long A00(H0 h02) {
        return h02.A5V(A02(0, 7, 27), -1L);
    }

    @Nullable
    public static Uri A01(H0 h02) {
        String A5X = h02.A5X(A02(7, 9, 57), (String) null);
        if (A5X == null) {
            return null;
        }
        return Uri.parse(A5X);
    }

    public static void A04(H2 h22) {
        h22.A01(A02(7, 9, 57));
    }

    public static void A05(H2 h22, long j10) {
        h22.A02(A02(0, 7, 27), j10);
    }

    public static void A06(H2 h22, Uri uri) {
        h22.A03(A02(7, 9, 57), uri.toString());
    }
}
