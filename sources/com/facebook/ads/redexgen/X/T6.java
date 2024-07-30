package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T6 extends AbstractC05310o {
    public static byte[] A01;
    public final /* synthetic */ C1228Sw A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.ETB, 42, 61, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public T6(C1228Sw c1228Sw) {
        this.A00 = c1228Sw;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0B(Z9 z92) {
        this.A00.A1T(z92);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0C() {
        InterfaceC1227Sv interfaceC1227Sv;
        InterfaceC1227Sv interfaceC1227Sv2;
        interfaceC1227Sv = this.A00.A0G;
        if (interfaceC1227Sv != null) {
            interfaceC1227Sv2 = this.A00.A0G;
            interfaceC1227Sv2.A9m();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0F(InterfaceC05300n interfaceC05300n) {
        EB eb2;
        EB eb3;
        eb2 = this.A00.A0A;
        if (eb2 != null) {
            eb3 = this.A00.A0A;
            eb3.A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0G(J3 j32) {
        long j10;
        InterfaceC1227Sv interfaceC1227Sv;
        InterfaceC1227Sv interfaceC1227Sv2;
        C0R A0D = this.A00.A11().A0D();
        j10 = this.A00.A00;
        A0D.A2a(L5.A01(j10), j32.A03().getErrorCode(), j32.A04());
        interfaceC1227Sv = this.A00.A0G;
        if (interfaceC1227Sv != null) {
            interfaceC1227Sv2 = this.A00.A0G;
            interfaceC1227Sv2.AAc(j32);
        }
    }
}
