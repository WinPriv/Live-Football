package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Tj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1241Tj extends C0903Ga {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{101, 82, 68, 71, 88, 89, 68, 82, Ascii.ETB, 84, 88, 83, 82, Ascii.CR, Ascii.ETB};
    }

    public C1241Tj(int i10, Map<String, List<String>> map, GU gu) {
        super(A00(0, 15, 69) + i10, gu, 1);
        this.A00 = i10;
        this.A01 = map;
    }
}
