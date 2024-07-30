package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC06585o {
    A04(A01(16, 5, 50)),
    A06(A01(27, 5, 29)),
    A05(A01(21, 6, 93));

    public static byte[] A01;
    public static String[] A02 = {"k9IbPcfog7a2vud71ZD1yiSptuKC", "7LgXLJxVBX0dpNGH2cpdo2FqGbwHr2dh", "LRipwKypnEKMqg6PamR7G8YuQckBwe", "JMyIsM6N3mQ5xBBSQQoIEfTakpln9APf", "n5EonvV2d0ynVphuWIfrU3PhJk0DBM6W", "TLMtZWSWcMyBHKhNGVy3rrDPFywR", "JEnYl3ig6b1G3QZnd7pVPdvbWtuLiuax", "SOFQxOre1ZQqrgpFIrPfi6IMKTKD0s"};
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[3].charAt(7) != 'N') {
                throw new RuntimeException();
            }
            A02[4] = "tSWii36WTWypzTcQeixtwPDDv3BIvAiF";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 119);
            i13++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-51, -47, -59, -53, -55, Ascii.VT, -1, Ascii.DLE, 9, 19, Ascii.SO, Ascii.EM, Ascii.FF, 7, 8, Ascii.DC2, Ascii.DC2, Ascii.SYN, 10, Ascii.DLE, Ascii.SO, 65, 53, 70, 63, 73, 68, 10, -3, -8, -7, 3};
    }

    static {
        A02();
    }

    EnumC06585o(String str) {
        this.A00 = str;
    }

    @Nullable
    public static EnumC06585o A00(@Nullable String str) {
        for (EnumC06585o enumC06585o : values()) {
            if (enumC06585o.A00.equals(str)) {
                return enumC06585o;
            }
        }
        return null;
    }
}
