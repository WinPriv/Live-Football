package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum IV {
    A05(0),
    A04(1);

    public static byte[] A01;
    public static String[] A02 = {"oiwcgQDD2Kh2jNi2Ca2cNMgwHOvPe1SO", "yCbh3JWABSPWXJzi8IqNfGSw4JUwRc1Z", "TDKikcySDZ1IILIigFVmatsXCwa", "mxQFgn0FH0MMkOxHpkkDQyVpPhA2Zhda", "dru3glT9ekJ0g4QSSusKvICYyzfTBGaa", "dAZiojPQaZCECwqg1LvdEmP9Ue6", "ejQSO991EpDhDVu4zMofsruN7P1", "5bejy9B"};
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 117;
            String[] strArr = A02;
            if (strArr[0].charAt(4) != strArr[4].charAt(4)) {
                throw new RuntimeException();
            }
            A02[3] = "h3cU3OwhzzGY5RqiQjzUPbB5XZb13N8z";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-62, -61, -60, -61, -48, -48, -61, -62, -7, -3, -3, -11, -12, -7, -15, 4, -11};
    }

    static {
        A01();
    }

    IV(int i10) {
        this.A00 = i10;
    }
}
