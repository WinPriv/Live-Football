package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.Az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0788Az extends Exception {
    public static byte[] A00;
    public static String[] A01 = {"jybu9AmlZPNYJFO5CETURgZbL9", "roja0bhL1B9gUBQhWiTEX", "WMiIg6bDBi41NZoApBFo0", "", "oT4iuMPk3LT2VVBhdE9cDO7Myr", "ruzB4PX8Fu4D5Uvu", "vAhBirgpsYGDvsbxec1VAyH2PJeSZTTh", "yf8hg5uJFg3VA494hRWQ5mGXrAA"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 119);
            if (A01[6].charAt(20) != 'A') {
                throw new RuntimeException();
            }
            A01[3] = "o3d2o9ikgoxA5z1";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-15, 9, 8, Ascii.CR, 5, -60, 8, 19, 9, Ascii.ETB, -60, Ascii.DC2, 19, Ascii.CAN, -60, Ascii.ETB, Ascii.EM, Ascii.DC4, Ascii.DC4, 19, Ascii.SYN, Ascii.CAN, -60, Ascii.EM, Ascii.EM, Ascii.CR, 8, -34, -60};
    }

    static {
        A01();
    }

    public C0788Az(UUID uuid) {
        super(A00(0, 29, 45) + uuid);
    }
}
