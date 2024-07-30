package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1285Ve implements BR {
    public static byte[] A06;
    public static final Constructor<? extends BO> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 75);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{4, 51, 51, 46, 51, 97, 40, 47, 50, 53, 32, 47, 53, 40, 32, 53, 40, 47, 38, 97, 7, Ascii.CR, 0, 2, 97, 36, 57, 53, 36, 47, 50, 40, 46, 47, 37, Ascii.RS, Ascii.NAK, 8, 0, Ascii.NAK, 19, 4, Ascii.NAK, Ascii.DC4, 80, Ascii.NAK, 2, 2, Ascii.US, 2, 80, 19, 2, Ascii.NAK, 17, 4, Ascii.EM, Ascii.RS, Ascii.ETB, 80, 54, 60, 49, 51, 80, Ascii.NAK, 8, 4, 2, 17, 19, 4, Ascii.US, 2, 98, 110, 108, 47, 103, 96, 98, 100, 99, 110, 110, 106, 47, 96, 101, 114, 47, 104, 111, 117, 100, 115, 111, 96, 109, 47, 100, 121, 110, 113, 109, 96, 120, 100, 115, 51, 47, 100, 121, 117, 47, 103, 109, 96, 98, 47, 71, 109, 96, 98, 68, 121, 117, 115, 96, 98, 117, 110, 115};
    }

    static {
        A01();
        Constructor<? extends BO> constructor = null;
        try {
            constructor = Class.forName(A00(74, 59, 74)).asSubclass(BO.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException(A00(0, 34, 10), e10);
        }
        A07 = constructor;
    }

    @Override // com.facebook.ads.redexgen.X.BR
    public final synchronized BO[] A4I() {
        BO[] boArr;
        boArr = new BO[A07 == null ? 12 : 13];
        boArr[0] = new VP(this.A01);
        boArr[1] = new VF(this.A00);
        boArr[2] = new VD(this.A03);
        boArr[3] = new VM(this.A02);
        boArr[4] = new C1280Uz();
        boArr[5] = new V2();
        boArr[6] = new C1264Ug(this.A05, this.A04);
        boArr[7] = new VW();
        boArr[8] = new V7();
        boArr[9] = new C1270Um();
        boArr[10] = new C1262Ue();
        boArr[11] = new VZ();
        if (A07 != null) {
            try {
                boArr[12] = A07.newInstance(new Object[0]);
            } catch (Exception e10) {
                throw new IllegalStateException(A00(34, 40, 59), e10);
            }
        }
        return boArr;
    }
}
