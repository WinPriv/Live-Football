package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0794Bq {
    public static byte[] A09;
    public static String[] A0A = {"fT4", "9XJ", "BdT8ugCih1Mpz00LrHVoF8KqNvgOr8AQ", "ItU4Mc5lT2NsoQYD", "XQJ1SNvFfokPp3KD", "IGCc23FH28N7ANBVj9k1dGnz4ha0U", "1lzK38hIt0", "A8GyDlY1o0KAgmQELzlat0ZxMGcgz"};
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final HV A06;
    public final HV A07;
    public final boolean A08;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{Ascii.ESC, Ascii.DC4, Ascii.SI, Ascii.SO, 9, 34, Ascii.RS, Ascii.NAK, 8, 19, Ascii.SYN, 93, Ascii.DLE, 8, Ascii.SO, 9, 93, Ascii.US, Ascii.CAN, 93, 76};
    }

    static {
        A01();
    }

    public C0794Bq(HV hv, HV hv2, boolean z10) {
        this.A07 = hv;
        this.A06 = hv2;
        this.A08 = z10;
        hv2.A0Y(12);
        this.A05 = hv2.A0H();
        hv.A0Y(12);
        this.A04 = hv.A0H();
        H6.A06(hv.A08() == 1, A00(0, 21, 44));
        this.A00 = -1;
    }

    public final boolean A02() {
        long A0M;
        int i10;
        int i11 = this.A00 + 1;
        this.A00 = i11;
        if (i11 == this.A05) {
            if (A0A[6].length() == 19) {
                throw new RuntimeException();
            }
            A0A[2] = "dfpT2dt5bGn60gbEA6wBElGJneIfVZr3";
            return false;
        }
        if (this.A08) {
            A0M = this.A06.A0N();
        } else {
            A0M = this.A06.A0M();
        }
        this.A02 = A0M;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0H();
            this.A07.A0Z(4);
            int i12 = this.A04 - 1;
            this.A04 = i12;
            if (i12 > 0) {
                HV hv = this.A07;
                String[] strArr = A0A;
                if (strArr[0].length() != strArr[1].length()) {
                    i10 = hv.A0H() - 1;
                } else {
                    A0A[2] = "DxoiDv7jb7q87sjQbqIMGefCzqS86q5Y";
                    i10 = hv.A0H() - 1;
                }
            } else {
                i10 = -1;
            }
            this.A03 = i10;
        }
        return true;
    }
}
