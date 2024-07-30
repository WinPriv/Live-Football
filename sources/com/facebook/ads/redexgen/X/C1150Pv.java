package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.huawei.openalliance.ad.constant.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1150Pv {
    public static byte[] A07;
    public InterfaceC1141Pm A05;
    public int A04 = w.f22171t;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{49, Ascii.GS, 4, Ascii.NAK, 17, 9, 17, 92, Ascii.SO, Ascii.EM, 8, Ascii.SO, Ascii.NAK, Ascii.EM, Ascii.SI, 92, 17, 9, Ascii.SI, 8, 92, Ascii.RS, Ascii.EM, 92, Ascii.RS, Ascii.EM, 8, Ascii.VT, Ascii.EM, Ascii.EM, Ascii.DC2, 92, 77, 92, Ascii.GS, Ascii.DC2, Ascii.CAN, 92, 77, 68};
    }

    public final C1150Pv A02(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1150Pv A03(int i10) {
        if (i10 >= 1 && i10 <= 18) {
            this.A01 = i10;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 56));
    }

    public final C1150Pv A04(int i10) {
        this.A02 = i10;
        return this;
    }

    public final C1150Pv A05(int i10) {
        this.A03 = i10;
        return this;
    }

    public final C1150Pv A06(int i10) {
        this.A04 = i10;
        return this;
    }

    public final C1150Pv A07(InterfaceC1141Pm interfaceC1141Pm) {
        this.A05 = interfaceC1141Pm;
        return this;
    }

    public final C1150Pv A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final C1151Pw A09() {
        return new C1151Pw(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
