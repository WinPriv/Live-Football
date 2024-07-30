package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class WR implements InterfaceC1141Pm {
    public static byte[] A01;
    public final C1315Wi A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, Ascii.NAK, Ascii.NAK, Ascii.DC2, -45, -8, Ascii.NAK, Ascii.ESC, Ascii.SUB, Ascii.SI, Ascii.DC4, Ascii.CR, -45, -6, Ascii.NAK, 17, Ascii.VT, Ascii.DC4, 102, 100, 86, 99, Ascii.RS, 82, 88, 86, 95, 101};
    }

    public WR(C1315Wi c1315Wi) {
        this.A00 = c1315Wi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1141Pm
    public final Map<String, String> A5U(boolean z10) {
        HashMap hashMap = new HashMap();
        if (!C06625s.A00().A04()) {
            hashMap.put(A00(0, 23, 39), C8G.A00().A01(this.A00, true).A7W());
        }
        hashMap.put(A00(23, 10, 114), C8K.A06(new C07077v(this.A00), this.A00, z10));
        return hashMap;
    }
}
