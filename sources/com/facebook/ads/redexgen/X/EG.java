package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EG {
    public static byte[] A03;
    public static String[] A04 = {"bxXiKI", "1uDei3qzNnKNtNYr8Y2Djp0HGajvtEV5", "mOXymc7srnaPPj6rkYKERyI3NxuvjHfL", "eLJeQSRGsG8qXjpz5HdRmaYCfpHE06ps", "tIHnpnFG5Gy9TDLwgByCKCMlkPhTptnY", "feqrkYPgdz0GJjq4", "3AbGJoGZCQZs42EqNNbBdZ7jf", "CWkuEW"};
    public BO A00;
    public final BQ A01;
    public final BO[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
            String[] strArr = A04;
            if (strArr[1].charAt(6) == strArr[3].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "mNEvNMISV2TsjErCZLDNSt4mIeKbSMWU";
            strArr2[2] = "pkwADRIgEHU8NI8rqtSVQew0tEayD06s";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{94, 87, Ascii.DC4, Ascii.CAN, 2, Ascii.ESC, 19, 87, 5, Ascii.DC2, Ascii.SYN, 19, 87, 3, Ascii.US, Ascii.DC2, 87, 4, 3, 5, Ascii.DC2, Ascii.SYN, Ascii.SUB, 89, 65, 96, 97, 106, 47, 96, 105, 47, 123, 103, 106, 47, 110, 121, 110, 102, 99, 110, 109, 99, 106, 47, 106, 119, 123, 125, 110, 108, 123, 96, 125, 124, 47, 39};
    }

    static {
        A01();
    }

    public EG(BO[] boArr, BQ bq) {
        this.A02 = boArr;
        this.A01 = bq;
    }

    public final BO A02(BP bp, Uri uri) throws IOException, InterruptedException {
        BO bo = this.A00;
        if (bo != null) {
            return bo;
        }
        BO[] boArr = this.A02;
        int length = boArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            BO bo2 = boArr[i10];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                bp.AE3();
                throw th;
            }
            if (bo2.AEm(bp)) {
                this.A00 = bo2;
                bp.AE3();
                break;
            }
            continue;
            bp.AE3();
            i10++;
        }
        BO bo3 = this.A00;
        if (A04[6].length() == 13) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[0] = "fQ5Ua6";
        strArr[7] = "HZXGBz";
        if (bo3 != null) {
            bo3.A8G(this.A01);
            return this.A00;
        }
        throw new UE(A00(24, 34, 125) + C0940Hl.A0S(this.A02) + A00(0, 24, 5), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
