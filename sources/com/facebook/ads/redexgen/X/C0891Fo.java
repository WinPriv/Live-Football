package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Fo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0891Fo {
    public static byte[] A02;
    public static String[] A03 = {"5moU6oTWlMaw1sDVAQ0KQ9vMfu", "p49r3ReMaXkyq3mZFz3vXo8SK9LaCwKA", "zB3eTtV", "qmKjW68jdxdUPQHo", "qXdLPSjDEI4OIDX4GQuIV", "", "iFy7tRn7HMov4f4CYUKnyhY2lj6xewaE", "7WU313Gqg3541KnskWJgurkNM7"};
    public static final Pattern A04;
    public final HV A00 = new HV();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[3].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "WbeGi2EdgzwyYonzf4wPzmwNCcWtg9MW";
            strArr[6] = "HcL7UN1N9oazqVf2QAldqbU1hHC9CZ0b";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            byte b10 = copyOfRange[i13];
            String[] strArr2 = A03;
            if (strArr2[7].length() != strArr2[0].length()) {
                String[] strArr3 = A03;
                strArr3[4] = "JF2Fp1R2vbvas833wDrB0";
                strArr3[5] = "";
                copyOfRange[i13] = (byte) ((b10 - i12) - 66);
                i13 += 0;
            } else {
                String[] strArr4 = A03;
                strArr4[1] = "nmNaQjGJyPE7mmPpZpQG0xjHlUJrvUW4";
                strArr4[6] = "jsP66PUWr33y4hLthtnL6xZSYxJtrhjf";
                copyOfRange[i13] = (byte) ((b10 - i12) - 86);
                i13++;
            }
        }
    }

    public static void A07() {
        A02 = new byte[]{-10, -76, -18, -81, -81, -40, -22, -38, -9, Ascii.FF, -34, -38, -39, -12, -19, -25, -31, -29, -69, -96, -90, -39, -36, -96, -37, -88, -89, -96, -38, -37, Ascii.CR, Ascii.FF, Ascii.SO, Ascii.SYN, Ascii.DC2, Ascii.GS, Ascii.SUB, 32, Ascii.EM, Ascii.SI, -40, Ascii.SO, Ascii.SUB, Ascii.ETB, Ascii.SUB, Ascii.GS, -72, -59, -62, -70, 53, 65, 62, 65, 68, 33, 42, 41, 47, -24, 33, Ascii.FS, 40, 36, 39, 52, -36, -27, -28, -22, -93, -23, -22, -17, -30, -37, -31, -22, -23, -17, -88, -14, -32, -28, -30, -29, -17, -15, -4, -23, -12, -15, -21, -5, -20, -1, -5, -76, -21, -20, -22, -10, -7, -24, -5, -16, -10, -11, 58, 51, 41, 42, 55, 49, 46, 51, 42, -34, -17};
    }

    static {
        A07();
        A04 = Pattern.compile(A01(11, 19, 40));
    }

    public static char A00(HV hv, int i10) {
        return (char) hv.A00[i10];
    }

    public static String A02(HV hv) {
        int limit = hv.A06();
        int A07 = hv.A07();
        char c10 = 0;
        while (limit < A07 && c10 == 0) {
            int i10 = limit + 1;
            int position = hv.A00[limit];
            int limit2 = (char) position;
            c10 = limit2 == 41 ? (char) 1 : (char) 0;
            limit = i10;
        }
        int position2 = hv.A06();
        return hv.A0S((limit - 1) - position2).trim();
    }

    public static String A03(HV hv, StringBuilder sb2) {
        sb2.setLength(0);
        int A06 = hv.A06();
        int A07 = hv.A07();
        boolean z10 = false;
        while (A06 < A07 && !z10) {
            int position = hv.A00[A06];
            char c10 = (char) position;
            if ((c10 >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || ((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                A06++;
                sb2.append(c10);
            } else {
                z10 = true;
            }
        }
        int position2 = hv.A06();
        hv.A0Z(A06 - position2);
        return sb2.toString();
    }

    public static String A04(HV hv, StringBuilder sb2) {
        A0A(hv);
        if (hv.A04() == 0) {
            return null;
        }
        String A032 = A03(hv, sb2);
        String A01 = A01(0, 0, 21);
        if (!A01.equals(A032)) {
            return A032;
        }
        String identifier = A01 + ((char) hv.A0E());
        return identifier;
    }

    public static String A05(HV hv, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int A06 = hv.A06();
            String token = A04(hv, sb2);
            if (token == null) {
                return null;
            }
            if (A01(118, 1, 28).equals(token) || A01(8, 1, 102).equals(token)) {
                hv.A0Y(A06);
                z10 = true;
            } else {
                sb3.append(token);
            }
        }
        String token2 = sb3.toString();
        String[] strArr = A03;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A03[2] = "Zajsfk5";
        return token2;
    }

    public static String A06(HV hv, StringBuilder sb2) {
        A0A(hv);
        if (hv.A04() < 5) {
            return null;
        }
        String A0S = hv.A0S(5);
        String cueSelector = A01(3, 5, 31);
        if (!cueSelector.equals(A0S)) {
            return null;
        }
        int A06 = hv.A06();
        String token = A04(hv, sb2);
        if (token == null) {
            return null;
        }
        String cueSelector2 = A01(117, 1, 13);
        if (cueSelector2.equals(token)) {
            hv.A0Y(A06);
            String cueSelector3 = A01(0, 0, 21);
            return cueSelector3;
        }
        String target = null;
        String cueSelector4 = A01(0, 1, 120);
        if (cueSelector4.equals(token)) {
            target = A02(hv);
        }
        String token2 = A04(hv, sb2);
        String cueSelector5 = A01(1, 1, 53);
        if (!cueSelector5.equals(token2) || token2 == null) {
            return null;
        }
        return target;
    }

    private void A08(C0895Fs c0895Fs, String str) {
        if (A01(0, 0, 21).equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Pattern pattern = A04;
            String[] strArr = A03;
            String str2 = strArr[4];
            String str3 = strArr[5];
            int length = str2.length();
            int voiceStartIndex = str3.length();
            if (length == voiceStartIndex) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "I8JZnIR9egwAM0HwkjEQFl8l1n";
            strArr2[0] = "OMVURqNL7mUYh9I5H6Apgp30fA";
            Matcher matcher = pattern.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c0895Fs.A0K(matcher.group(1));
            }
            str = str.substring(0, indexOf);
        }
        String[] A0l = C0940Hl.A0l(str, A01(9, 2, 90));
        String str4 = A0l[0];
        int indexOf2 = str4.indexOf(35);
        if (indexOf2 != -1) {
            c0895Fs.A0J(str4.substring(0, indexOf2));
            int voiceStartIndex2 = indexOf2 + 1;
            c0895Fs.A0I(str4.substring(voiceStartIndex2));
        } else {
            c0895Fs.A0J(str4);
        }
        int voiceStartIndex3 = A0l.length;
        if (voiceStartIndex3 > 1) {
            int voiceStartIndex4 = A0l.length;
            c0895Fs.A0L((String[]) Arrays.copyOfRange(A0l, 1, voiceStartIndex4));
        }
    }

    public static void A09(HV hv) {
        String line;
        do {
            line = hv.A0P();
        } while (!TextUtils.isEmpty(line));
    }

    public static void A0A(HV hv) {
        boolean skipping = true;
        while (hv.A04() > 0 && skipping) {
            boolean skipping2 = A0D(hv);
            if (!skipping2) {
                boolean A0C = A0C(hv);
                String[] strArr = A03;
                if (strArr[4].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[7] = "hJK3qjOtPloIxgY8vJytqI0HGH";
                strArr2[0] = "GkPADoSnbvIPHM1na4c3lEMD25";
                if (!A0C) {
                    skipping = false;
                }
            }
            skipping = true;
        }
    }

    public static void A0B(HV hv, C0895Fs c0895Fs, StringBuilder sb2) {
        A0A(hv);
        String A032 = A03(hv, sb2);
        String A01 = A01(0, 0, 21);
        if (A01.equals(A032)) {
            return;
        }
        String A042 = A04(hv, sb2);
        String property = A01(2, 1, 94);
        if (!property.equals(A042)) {
            return;
        }
        A0A(hv);
        String token = A05(hv, sb2);
        if (token == null || A01.equals(token)) {
            return;
        }
        int A06 = hv.A06();
        String A043 = A04(hv, sb2);
        String property2 = A01(8, 1, 102);
        if (!property2.equals(A043)) {
            String property3 = A01(118, 1, 28);
            if (property3.equals(A043)) {
                hv.A0Y(A06);
            } else {
                return;
            }
        }
        String property4 = A01(50, 5, 124);
        if (property4.equals(A032)) {
            c0895Fs.A0C(HB.A02(token));
            return;
        }
        String property5 = A01(30, 16, 85);
        if (property5.equals(A032)) {
            c0895Fs.A0B(HB.A02(token));
            return;
        }
        String property6 = A01(93, 15, 49);
        if (property6.equals(A032)) {
            String property7 = A01(108, 9, 111);
            if (!property7.equals(token)) {
                return;
            }
            c0895Fs.A0G(true);
            return;
        }
        String property8 = A01(55, 11, 101);
        if (property8.equals(A032)) {
            c0895Fs.A0D(token);
            return;
        }
        String property9 = A01(76, 11, 37);
        if (property9.equals(A032)) {
            String property10 = A01(46, 4, 0);
            if (!property10.equals(token)) {
                return;
            }
            c0895Fs.A0E(true);
            return;
        }
        String property11 = A01(66, 10, 32);
        if (!property11.equals(A032)) {
            return;
        }
        String property12 = A01(87, 6, 50);
        if (!property12.equals(token)) {
            return;
        }
        c0895Fs.A0F(true);
    }

    public static boolean A0C(HV hv) {
        int A06 = hv.A06();
        int position = hv.A07();
        byte[] bArr = hv.A00;
        if (A06 + 2 > position) {
            return false;
        }
        int limit = A06 + 1;
        if (bArr[A06] != 47) {
            return false;
        }
        int i10 = limit + 1;
        if (bArr[limit] == 42) {
            while (i10 + 1 < position) {
                int limit2 = i10 + 1;
                char skippedChar = (char) bArr[i10];
                if (skippedChar == '*') {
                    char skippedChar2 = (char) bArr[limit2];
                    if (skippedChar2 == '/') {
                        position = limit2 + 1;
                        String[] strArr = A03;
                        if (strArr[4].length() == strArr[5].length()) {
                            throw new RuntimeException();
                        }
                        A03[3] = "JvQuY0ttidF2MFD";
                        i10 = position;
                    }
                }
                i10 = limit2;
            }
            hv.A0Z(position - hv.A06());
            return true;
        }
        return false;
    }

    public static boolean A0D(HV hv) {
        char A00 = A00(hv, hv.A06());
        if (A00 != '\t' && A00 != '\n' && A00 != '\f' && A00 != '\r') {
            String[] strArr = A03;
            if (strArr[1].charAt(8) == strArr[6].charAt(8)) {
                throw new RuntimeException();
            }
            A03[2] = "XdMJqir";
            if (A00 != ' ') {
                return false;
            }
        }
        hv.A0Z(1);
        String[] strArr2 = A03;
        if (strArr2[1].charAt(8) == strArr2[6].charAt(8)) {
            A03[3] = "JQij4b";
            return true;
        }
        String[] strArr3 = A03;
        strArr3[7] = "YUo1DIFuEN1uIrNP3uzwlzTLm0";
        strArr3[0] = "TeHQYLZm1GheElXx48zfUEG6q3";
        return true;
    }

    public final C0895Fs A0E(HV hv) {
        this.A01.setLength(0);
        int A06 = hv.A06();
        A09(hv);
        HV hv2 = this.A00;
        byte[] bArr = hv.A00;
        int initialInputPosition = hv.A06();
        hv2.A0b(bArr, initialInputPosition);
        this.A00.A0Y(A06);
        String A062 = A06(this.A00, this.A01);
        if (A062 != null) {
            if (A01(117, 1, 13).equals(A04(this.A00, this.A01))) {
                C0895Fs style = new C0895Fs();
                A08(style, A062);
                String str = null;
                boolean z10 = false;
                while (true) {
                    String token = A01(118, 1, 28);
                    if (!z10) {
                        HV hv3 = this.A00;
                        if (A03[2].length() != 7) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[7] = "P2Yqf81YsUpWwfjUTZqElTDCCY";
                        strArr[0] = "xGmVLGcPrtNhIWRwMqh3QWIima";
                        int A063 = hv3.A06();
                        str = A04(this.A00, this.A01);
                        z10 = str == null || token.equals(str);
                        if (!z10) {
                            this.A00.A0Y(A063);
                            A0B(this.A00, style, this.A01);
                        }
                    } else {
                        if (token.equals(str)) {
                            return style;
                        }
                        return null;
                    }
                }
            }
        }
        return null;
    }
}
