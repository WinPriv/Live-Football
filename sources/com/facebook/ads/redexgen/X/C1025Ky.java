package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.StringTokenizer;

/* renamed from: com.facebook.ads.redexgen.X.Ky, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1025Ky {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Ascii.EM, 65, 65, 65};
    }

    public static String A01(String str) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, A00(0, 1, 88), true);
            int i10 = 0;
            int maxLength = str.length();
            if (maxLength > 90) {
                int tokenLength = str.length();
                String A002 = A00(1, 3, 14);
                if (tokenLength > 93 || !str.endsWith(A002)) {
                    while (stringTokenizer.hasMoreTokens()) {
                        int length = stringTokenizer.nextToken().length();
                        int maxLength2 = i10 + length;
                        if (maxLength2 < 90) {
                            i10 += length;
                        }
                    }
                    if (i10 == 0) {
                        return str.substring(0, 90) + A002;
                    }
                    return str.substring(0, i10) + A002;
                }
                return str;
            }
            return str;
        }
        return str;
    }
}
