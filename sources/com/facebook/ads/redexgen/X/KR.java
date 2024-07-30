package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class KR {
    public static byte[] A00;
    public static String[] A01 = {"gFe3mTVqEc", "o3XICwck3thy8t5khkuFfgIyTYcE10rb", "CXZamXhEArpjjLRWzP01hTJHhdHKIPhL", "oFEH5ENhqq8Jzm18l75xaKQx7AXJNwzV", "R1QKRY6v8stJjzPTGoE1sFm3d511QSKK", "fRlItu1oZcW1vgjv2TfsauDW1x1gg146", "rMZj8KW6uJSswCV0wJ61u4oJuHgPLcpr", "VRcOG4k1oxgWu574CIBxVkEWQ"};
    public static final Map<J6, J8> A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{125, 95, 80, Ascii.EM, 74, Ascii.RS, 93, 76, 91, 95, 74, 91, Ascii.RS, Ascii.DEL, 90, 109, 87, 68, 91, Ascii.RS, 75, 77, 87, 80, 89, Ascii.RS, 74, 86, 87, 77, Ascii.RS, 73, 87, 90, 74, 86, Ascii.RS, 95, 80, 90, Ascii.RS, 86, 91, 87, 89, 86, 74, Ascii.DLE, 115, 72, 77, 72, 73, 81, 72, 6, 103, 66, 117, 79, 92, 67, 6, 82, 95, 86, 67, 8};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(J6.A08, J8.A0C);
        A02.put(J6.A06, J8.A0E);
        A02.put(J6.A05, J8.A0D);
    }

    public static AdSize A00(J6 j62) {
        return AdSize.fromWidthAndHeight(j62.A03(), j62.A02());
    }

    public static AdSize A01(J8 j82) {
        for (Map.Entry<J6, J8> entry : A02.entrySet()) {
            if (entry.getValue() == j82) {
                return A00(entry.getKey());
            }
        }
        AdSize adSize = AdSize.BANNER_320_50;
        if (A01[2].charAt(13) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "8yxIcOBY3dyXYw8tx9RnPYEelWv3PiEU";
        strArr[5] = "RuT7gwLbx9UlwnZGushHq4GsGVsr9kdh";
        return adSize;
    }

    public static J6 A02(int i10) {
        if (i10 == 4) {
            return J6.A04;
        }
        if (i10 == 5) {
            return J6.A05;
        }
        if (i10 == 6) {
            return J6.A06;
        }
        if (i10 == 7) {
            return J6.A08;
        }
        if (i10 == 100) {
            return J6.A07;
        }
        throw new IllegalArgumentException(A06(48, 20, 63));
    }

    public static J6 A03(int i10, int i11) {
        if (J6.A07.A02() == i11 && J6.A07.A03() == i10) {
            J6 j62 = J6.A07;
            if (A01[2].charAt(13) != 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "oPyqycdUDaMLkpnFUSD1lOVVut5Ak4ux";
            strArr[6] = "t44MnsVi8idfM7jbHI01veBsrnLqKP4H";
            return j62;
        }
        if (J6.A04.A02() == i11 && J6.A04.A03() == i10) {
            return J6.A04;
        }
        if (J6.A05.A02() == i11 && J6.A05.A03() == i10) {
            J6 j63 = J6.A05;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "zTuOoFSTcjvo6siKnZ91TQqR6FN8Kxgy";
            strArr2[6] = "bIxUq8CGRMwo1zGvdui1T5X5wsDAfXTH";
            return j63;
        }
        if (J6.A06.A02() == i11 && J6.A06.A03() == i10) {
            return J6.A06;
        }
        if (J6.A08.A02() == i11 && J6.A08.A03() == i10) {
            return J6.A08;
        }
        throw new IllegalArgumentException(A06(0, 48, 39));
    }

    public static J6 A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static J8 A05(J6 j62) {
        J8 adTemplate = A02.get(j62);
        if (adTemplate == null) {
            J8 j82 = J8.A0F;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "UG6JCyDXDBzWMb76AfK0hQ3l3bgkgswO";
            strArr[5] = "9YhmwLNWXnVy8pTRO5fFllqJZ4ALiPvn";
            return j82;
        }
        return adTemplate;
    }
}
