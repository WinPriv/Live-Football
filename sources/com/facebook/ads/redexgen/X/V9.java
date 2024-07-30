package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class V9 extends CK {
    public static byte[] A02;
    public static String[] A03 = {"RjYCDLb2NANzCnedRKoQM0GQ", "QX5lqyT5r1TYXy6sq6A", "sDmzmZu2Epi", "QleORMZQxcHxPLUcnR0aaEPVJ", "tBrVRsKa63H7cOEQm0uGMqa5cwtrVWSW", "PEwzIbtLaNn1pzRcppb", "zVqUyH", "ZIYCsXe3luBjtUiXTHmKPLmA"};
    public VA A00;
    public HI A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{6, Ascii.DC2, 3, Ascii.SO, 8, 72, 1, Ascii.VT, 6, 4};
    }

    static {
        A03();
    }

    private int A00(HV hv) {
        int i10 = (hv.A00[2] & DefaultClassResolver.NAME) >> 4;
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                int blockSizeCode = i10 - 2;
                return 576 << blockSizeCode;
            case 6:
            case 7:
                hv.A0Z(4);
                hv.A0O();
                int value = i10 == 6 ? hv.A0E() : hv.A0I();
                hv.A0Y(0);
                int blockSizeCode2 = value + 1;
                return blockSizeCode2;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                int blockSizeCode3 = i10 - 8;
                int value2 = 256 << blockSizeCode3;
                return value2;
            default:
                return -1;
        }
    }

    public static boolean A04(HV hv) {
        return hv.A04() >= 5 && hv.A0E() == 127 && hv.A0M() == 1179402563;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final long A07(HV hv) {
        if (!A05(hv.A00)) {
            return -1L;
        }
        int A00 = A00(hv);
        String[] strArr = A03;
        if (strArr[2].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[2] = "M0DKrSciZtY";
        strArr2[0] = "bwyyvFLni8GVBC8P6VU38e20";
        return A00;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final boolean A0A(HV hv, long j10, CJ cj) throws IOException, InterruptedException {
        byte[] bArr = hv.A00;
        if (this.A01 == null) {
            this.A01 = new HI(bArr, 17);
            byte[] data = Arrays.copyOfRange(bArr, 9, hv.A07());
            data[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(data);
            cj.A00 = Format.A07(null, A02(0, 10, 95), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, singletonList, null, 0, null);
            return true;
        }
        if ((bArr[0] & Ascii.DEL) == 3) {
            this.A00 = new VA(this);
            this.A00.A01(hv);
            return true;
        }
        if (!A05(bArr)) {
            return true;
        }
        VA va2 = this.A00;
        if (va2 != null) {
            va2.A00(j10);
            cj.A01 = this.A00;
        }
        return false;
    }
}
