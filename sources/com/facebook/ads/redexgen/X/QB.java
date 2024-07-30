package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: assets/audience_network.dex */
public abstract class QB {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ QB[] A02;
    public static final QB A03;
    public static final QB A04;
    public static final QB A05;
    public static final QB A06;
    public static final QB A07;
    public static final QB A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, Ascii.DEL, -92, -86, 101, 120, Byte.MIN_VALUE, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public abstract boolean A04(JSONArray jSONArray, int i10);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i10);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final int i10 = 0;
        final String A022 = A02(0, 5, 105);
        A03 = new QB(A022, i10) { // from class: com.facebook.ads.redexgen.X.G6
            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A04(JSONArray jSONArray, int i11) {
                return jSONArray.optJSONArray(i11) != null;
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i11) {
                return QC.A01(jSONArray.optJSONArray(i11), jSONArray2.optJSONArray(i11));
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return QC.A01(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        final int i11 = 1;
        final String A023 = A02(5, 7, 40);
        A04 = new QB(A023, i11) { // from class: com.facebook.ads.redexgen.X.G1
            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A04(JSONArray jSONArray, int i12) {
                return jSONArray.optBoolean(i12, true) == jSONArray.optBoolean(i12, false);
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i12) {
                return jSONArray.optBoolean(i12) == jSONArray2.optBoolean(i12);
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        final int i12 = 2;
        final String A024 = A02(12, 6, 81);
        A05 = new QB(A024, i12) { // from class: com.facebook.ads.redexgen.X.Fr
            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A04(JSONArray jSONArray, int i13) {
                return jSONArray.optInt(i13, 0) == jSONArray.optInt(i13, 1) && jSONArray.optDouble(i13, 0.0d) == jSONArray.optDouble(i13, 1.0d) && ((double) jSONArray.optInt(i13, 0)) != jSONArray.optDouble(i13, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i13) {
                return jSONArray.optDouble(i13) == jSONArray2.optDouble(i13);
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        final int i13 = 3;
        final String A025 = A02(18, 3, 50);
        A06 = new QB(A025, i13) { // from class: com.facebook.ads.redexgen.X.Fq
            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A04(JSONArray jSONArray, int i14) {
                return jSONArray.optInt(i14, 0) == jSONArray.optInt(i14, 1) && jSONArray.optDouble(i14, 0.0d) == jSONArray.optDouble(i14, 1.0d) && ((double) jSONArray.optInt(i14, 0)) == jSONArray.optDouble(i14, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i14) {
                return jSONArray.optInt(i14) == jSONArray2.optInt(i14);
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        final int i14 = 4;
        final String A026 = A02(21, 6, 18);
        A07 = new QB(A026, i14) { // from class: com.facebook.ads.redexgen.X.Fp
            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A04(JSONArray jSONArray, int i15) {
                return jSONArray.optJSONObject(i15) != null;
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i15) {
                return QC.A02(jSONArray.optJSONObject(i15), jSONArray2.optJSONObject(i15));
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return QC.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        final int i15 = 5;
        final String A027 = A02(27, 6, 36);
        A08 = new QB(A027, i15) { // from class: com.facebook.ads.redexgen.X.Fm
            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A04(JSONArray jSONArray, int i16) {
                return jSONArray.optString(i16) != null;
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i16) {
                return jSONArray.optString(i16).equals(jSONArray2.optString(i16));
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.QB
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A02 = new QB[]{A03, A04, A05, A06, A07, A08};
    }

    public QB(String str, int i10) {
    }

    public static QB A00(JSONArray jSONArray, int i10) {
        for (QB type : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (type.A04(jSONArray, i10)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static QB A01(JSONObject jSONObject, String str) {
        for (QB qb2 : values()) {
            boolean A062 = qb2.A06(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (A062) {
                return qb2;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static QB valueOf(String str) {
        return (QB) Enum.valueOf(QB.class, str);
    }

    public static QB[] values() {
        return (QB[]) A02.clone();
    }
}
