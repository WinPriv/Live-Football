package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1V, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1V {
    public static byte[] A00;
    public static String[] A01 = {"supQtyS8W3onVuHqEhPkAVSqBybkIcHU", "ff4vqjx7fpIi29JjE6r", "RJO08Ilt3bxePyobo0aBvpyFdtgNFIs", "R3lU2DY6GPkOKTyjngiZTwzyGAILDPw1", "PTr0crZaDt8NiWq0Xd4", "se", "v6JOSQzBecuGYHkCCuEqCb8OFKq6lcaT", "KM7IQOG2bb6CTRDJ7wtiRs"};

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[3].charAt(30) != 'w') {
                break;
            }
            A01[0] = "2ucutjIi0db0Y5lwkQhEiYj5DZ";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 90);
            if (A01[5].length() == 26) {
                break;
            }
            String[] strArr = A01;
            strArr[7] = "yFgBEeCsPvrqNYYpqLUckp";
            strArr[2] = "OqUlVlD6dU1uZ6pPsuYDm2OxFFgTM2s";
            i13++;
        }
        throw new RuntimeException();
    }

    public static void A0A() {
        A00 = new byte[]{Ascii.VT, 52, 55, 59, 45, -24, 9, 44, Ascii.VT, 55, 54, 60, 49, 54, 61, 45, -24, Ascii.US, 41, 60, 43, 48, 49, 54, 47, 2, 46, 45, 51, 40, 45, 52, 36, -33, 54, 32, 51, 34, 39, 40, 45, 38, -33, 51, 46, -33, 49, 36, 34, 36, 40, 53, 36, -33, 32, 45, -33, 40, 45, -20, 38, 32, 44, 36, -33, 49, 36, 54, 32, 49, 35, -2, 42, 41, 47, 36, 41, 48, 32, -37, 50, Ascii.FS, 47, Ascii.RS, 35, 36, 41, 34, -37, 47, 42, -37, 45, 32, Ascii.RS, 32, 36, 49, 32, -37, 54, 44, 48, Ascii.FS, 41, 47, 36, 47, 52, 56, 54, Ascii.RS, 48, 45, 45, 32, 41, Ascii.RS, 52, 56, -83, -64, -46, -68, -51, -65, 123, -60, -55, 123, -74, -50, -64, -66, -50, -72, -50, -6, Ascii.DC2, Ascii.DLE, Ascii.ETB, -31, -2, -3, -4, 1, -3, 0, -13, -14, Ascii.ETB, 32, 35, 39, Ascii.EM, 19, Ascii.NAK, Ascii.CAN, Ascii.CAN, 36, 35, 41, Ascii.RS, 35, 42, Ascii.SUB, Ascii.DC4, 44, Ascii.SYN, 41, Ascii.CAN, Ascii.GS, Ascii.RS, 35, Ascii.FS, -49, -37, -38, -32, -43, -38, -31, -47, -53, -29, -51, -32, -49, -44, -43, -38, -45, -53, -46, -37, -34, -53, -34, -47, -29, -51, -34, -48, 58, 56, 65, 56, 69, 60, 54, 50, 69, 56, 74, 52, 69, 55, -1, -3, 6, -3, 10, 1, -5, -9, Ascii.FF, -3, Ascii.DLE, Ascii.FF, 36, Ascii.ETB, 41, 19, 36, Ascii.SYN, 17, Ascii.ESC, 32, 17, 42, 70, 62, 60, 67, -21, -24, -25, -26, -21, -25, -22, -35, -36};
    }

    static {
        A0A();
    }

    public static C1R A00(JSONObject jSONObject) {
        return new C1Q().A06(A06(jSONObject)).A07(A05(jSONObject)).A05(A07(jSONObject)).A04(A04(jSONObject)).A08();
    }

    public static C05441b A01(JSONObject jSONObject) {
        return new C05431a().A02(A08(jSONObject)).A03(A09(jSONObject)).A04();
    }

    public static String A03(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(217, 12, 62));
        String A02 = A02(141, 9, 52);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(244, 9, 30), A02);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(217, 12, 62));
        String A02 = A02(0, 8, 110);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 8, 90), A02);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(217, 12, 62));
        String A02 = A02(71, 49, 97);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(175, 28, 18), A02);
    }

    public static String A06(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(217, 12, 62));
        String A02 = A02(25, 46, 101);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(203, 14, 121), A02);
    }

    public static String A07(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(217, 12, 62));
        String A02 = A02(8, 17, 110);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(158, 17, 91), A02);
    }

    public static String A08(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(217, 12, 62));
        String A02 = A02(120, 17, 1);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(229, 11, 88), A02);
    }

    public static String A09(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(217, 12, 62));
        String A02 = A02(137, 4, 77);
        if (optJSONObject == null) {
            return A02;
        }
        if (A01[5].length() == 26) {
            throw new RuntimeException();
        }
        A01[6] = "TCZjzw6sPrB30puBIiA7RO8MkqmMxMbX";
        return optJSONObject.optString(A02(240, 4, 121), A02);
    }
}
