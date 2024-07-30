package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public enum QN {
    A04(A01(37, 3, 86)),
    A05(A01(40, 7, 117));

    public static byte[] A01;
    public static String[] A02 = {"kIaQKGqX2ZTqEjvfJkZOl1WwOBoH9uFY", "x", "Fa9eXDyIy4elyWfec912IKE0nqoR5HQV", "", "DfNaQJeOEpNPwVx", "9", "0vF5Kqqkw0y14nBhXHX4F0aBgr7OScbz", ""};
    public String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{Ascii.NAK, Ascii.ETB, Ascii.US, -34, 3, Ascii.VT, -10, 1, -2, -7, -75, 8, -6, 7, Ascii.VT, -6, 7, -75, 7, -6, 8, 5, 4, 3, 8, -6, -49, -75, -70, 8, -6, -13, -16, -13, -12, -4, -13, Ascii.GS, Ascii.US, 39, 80, 73, 70, 73, 74, 82, 73};
    }

    static {
        A02();
    }

    QN(String str) {
        this.A00 = str;
    }

    public static QN A00(String str) {
        for (QN qn : valuesCustom()) {
            if (qn.A00.equals(str)) {
                return qn;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(3, 27, 47), str));
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static QN[] valuesCustom() {
        QN[] qnArr = (QN[]) values().clone();
        String[] strArr = A02;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = "";
        strArr2[3] = "";
        return qnArr;
    }
}
