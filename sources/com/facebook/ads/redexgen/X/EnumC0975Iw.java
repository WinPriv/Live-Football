package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Iw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0975Iw {
    A03,
    A05,
    A04;

    public static byte[] A00;
    public static String[] A01 = {"Gjwy6cOcQ9K2s9TECvKSb1UBI6p92tWs", "MkJKTqDYMAzsSL3ogCclj8aQMOEn3Zaf", "eTpSOjZOB", "ux", "6lFNHDDwy35cZQ5ctUwn46ZPa5FkYtAF", "2ZxEJa2ax0wS4G", "Utm", "f4eG1TG9uZ10lRPR3hza"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-57, -56, -55, -60, -40, -49, -41, -11, -20, -20, Ascii.SYN, Ascii.NAK};
    }

    static {
        A02();
    }

    public static VideoAutoplayBehavior A00(EnumC0975Iw enumC0975Iw) {
        if (enumC0975Iw == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        int i10 = C0974Iv.A00[enumC0975Iw.ordinal()];
        if (i10 == 1) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        if (A01[1].charAt(9) == 'M') {
            throw new RuntimeException();
        }
        A01[5] = "KWBYg9gUO";
        if (i10 == 2) {
            return VideoAutoplayBehavior.ON;
        }
        if (i10 != 3) {
            VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
            String[] strArr = A01;
            if (strArr[0].charAt(5) == strArr[4].charAt(5)) {
                A01[2] = "D4DDJWMfk";
                return videoAutoplayBehavior;
            }
            String[] strArr2 = A01;
            strArr2[0] = "jNXTJSXFaHaCK7i5lqJo4GmnkgAhCocQ";
            strArr2[4] = "apiAoBnIaWOp8nG5E1dZaMbzfZqR1u59";
            return videoAutoplayBehavior;
        }
        return VideoAutoplayBehavior.OFF;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0975Iw[] valuesCustom() {
        EnumC0975Iw[] valuesCustom = values();
        if (A01[1].charAt(9) == 'M') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "qrA";
        strArr[3] = "mB";
        return (EnumC0975Iw[]) valuesCustom.clone();
    }
}
