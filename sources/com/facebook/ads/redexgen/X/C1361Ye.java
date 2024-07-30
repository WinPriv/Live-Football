package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ye, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1361Ye extends AbstractRunnableC0997Ju {
    public static byte[] A03;
    public final /* synthetic */ ZC A00;
    public final /* synthetic */ C05591q A01;
    public final /* synthetic */ ED A02;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{32, 5, 0, 17, Ascii.NAK, 4, 19, 65, Ascii.NAK, 8, Ascii.FF, 4, Ascii.SO, Ascii.DC4, Ascii.NAK, 79};
    }

    public C1361Ye(ED ed2, C05591q c05591q, ZC zc2) {
        this.A02 = ed2;
        this.A01 = c05591q;
        this.A00 = zc2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.AAc(new J3(AdErrorType.NETWORK_ERROR, A00(0, 16, 43)));
    }
}
