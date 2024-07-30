package com.anythink.expressad.foundation.h;

import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10182a = 256;

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f10183b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f10184c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f10185d;

    /* renamed from: e, reason: collision with root package name */
    private static char[] f10186e = null;
    private static final char f = '=';

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f10187g;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        f10185d = cArr;
        HashMap hashMap = new HashMap();
        f10183b = hashMap;
        hashMap.put('A', 'v');
        f10183b.put('B', 'S');
        f10183b.put('C', 'o');
        f10183b.put('D', 'a');
        f10183b.put('E', 'j');
        f10183b.put('F', 'c');
        f10183b.put('G', '7');
        f10183b.put('H', 'd');
        f10183b.put('I', 'R');
        f10183b.put('J', 'z');
        f10183b.put('K', 'p');
        f10183b.put('L', 'W');
        f10183b.put('M', 'i');
        f10183b.put('N', 'f');
        f10183b.put('O', 'G');
        f10183b.put('P', 'y');
        f10183b.put('Q', 'N');
        f10183b.put('R', 'x');
        f10183b.put('S', 'Z');
        f10183b.put('T', 'n');
        f10183b.put('U', 'V');
        f10183b.put('V', '5');
        f10183b.put('W', 'k');
        f10183b.put('X', '+');
        f10183b.put('Y', 'D');
        f10183b.put('Z', 'H');
        f10183b.put('a', 'L');
        f10183b.put('b', 'Y');
        f10183b.put('c', 'h');
        f10183b.put('d', 'J');
        f10183b.put('e', '4');
        f10183b.put('f', '6');
        f10183b.put('g', 'l');
        f10183b.put('h', 't');
        f10183b.put('i', '0');
        f10183b.put('j', 'U');
        f10183b.put('k', '3');
        f10183b.put('l', 'Q');
        f10183b.put('m', 'r');
        f10183b.put('n', 'g');
        f10183b.put('o', 'E');
        f10183b.put('p', 'u');
        f10183b.put('q', 'q');
        f10183b.put('r', '8');
        f10183b.put('s', 's');
        f10183b.put('t', 'w');
        f10183b.put('u', '/');
        f10183b.put('v', 'X');
        f10183b.put('w', 'M');
        f10183b.put('x', 'e');
        f10183b.put('y', 'B');
        f10183b.put('z', 'A');
        f10183b.put('0', 'T');
        f10183b.put('1', '2');
        f10183b.put('2', 'F');
        f10183b.put('3', 'b');
        f10183b.put('4', '9');
        f10183b.put('5', 'P');
        f10183b.put('6', '1');
        f10183b.put('7', 'O');
        f10183b.put('8', 'I');
        f10183b.put('9', 'K');
        f10183b.put('+', 'm');
        f10183b.put('/', 'C');
        f10186e = new char[cArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char[] cArr2 = f10185d;
            if (i11 >= cArr2.length) {
                break;
            }
            f10186e[i11] = f10183b.get(Character.valueOf(cArr2[i11])).charValue();
            i11++;
        }
        f10187g = new byte[128];
        int i12 = 0;
        while (true) {
            byte[] bArr = f10187g;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = Ascii.DEL;
            i12++;
        }
        while (true) {
            char[] cArr3 = f10186e;
            if (i10 < cArr3.length) {
                f10187g[cArr3[i10]] = (byte) i10;
                i10++;
            } else {
                return;
            }
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i10) {
        try {
            char c10 = cArr[3];
            char c11 = c10 == '=' ? (char) 2 : (char) 3;
            char c12 = cArr[2];
            if (c12 == '=') {
                c11 = 1;
            }
            byte[] bArr2 = f10187g;
            byte b10 = bArr2[cArr[0]];
            byte b11 = bArr2[cArr[1]];
            byte b12 = bArr2[c12];
            byte b13 = bArr2[c10];
            if (c11 == 2) {
                bArr[i10] = (byte) ((3 & (b11 >> 4)) | ((b10 << 2) & 252));
                bArr[i10 + 1] = (byte) (((b11 << 4) & 240) | ((b12 >> 2) & 15));
                return 2;
            }
            if (c11 != 3) {
                bArr[i10] = (byte) (((b11 >> 4) & 3) | ((b10 << 2) & 252));
                return 1;
            }
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((b10 << 2) & 252) | ((b11 >> 4) & 3));
            bArr[i11] = (byte) (((b11 << 4) & 240) | ((b12 >> 2) & 15));
            bArr[i11 + 1] = (byte) (((b12 << 6) & 192) | (b13 & 63));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(String str) {
        byte[] bytes = str.getBytes();
        return a(bytes, bytes.length);
    }

    private static byte[] c(String str) {
        int i10;
        try {
            int length = str.length();
            int i11 = 259;
            if (length < 259) {
                i11 = length;
            }
            char[] cArr = new char[i11];
            int i12 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i12];
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < length) {
                int i16 = i13 + 256;
                if (i16 <= length) {
                    str.getChars(i13, i16, cArr, i15);
                    i10 = i15 + 256;
                } else {
                    str.getChars(i13, length, cArr, i15);
                    i10 = (length - i13) + i15;
                }
                int i17 = i15;
                while (i15 < i10) {
                    char c10 = cArr[i15];
                    if (c10 != '=') {
                        byte[] bArr2 = f10187g;
                        if (c10 < bArr2.length) {
                            if (bArr2[c10] == Byte.MAX_VALUE) {
                            }
                        }
                        i15++;
                    }
                    int i18 = i17 + 1;
                    cArr[i17] = c10;
                    if (i18 == 4) {
                        i14 += a(cArr, bArr, i14);
                        i17 = 0;
                    } else {
                        i17 = i18;
                    }
                    i15++;
                }
                i13 = i16;
                i15 = i17;
            }
            if (i14 == i12) {
                return bArr;
            }
            byte[] bArr3 = new byte[i14];
            System.arraycopy(bArr, 0, bArr3, 0, i14);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] a(char[] cArr, int i10, int i11) {
        try {
            char[] cArr2 = new char[4];
            int i12 = ((i11 >> 2) * 3) + 3;
            byte[] bArr = new byte[i12];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = i10; i15 < i10 + i11; i15++) {
                char c10 = cArr[i15];
                if (c10 != '=') {
                    byte[] bArr2 = f10187g;
                    if (c10 < bArr2.length) {
                        if (bArr2[c10] == Byte.MAX_VALUE) {
                        }
                    }
                }
                int i16 = i14 + 1;
                cArr2[i14] = c10;
                if (i16 == 4) {
                    i13 += a(cArr2, bArr, i13);
                    i14 = 0;
                } else {
                    i14 = i16;
                }
            }
            if (i13 == i12) {
                return bArr;
            }
            byte[] bArr3 = new byte[i13];
            System.arraycopy(bArr, 0, bArr3, 0, i13);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str) {
        byte[] c10 = c(str);
        if (c10 == null || c10.length <= 0) {
            return null;
        }
        return new String(c10);
    }

    private static String a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static String a(byte[] bArr, int i10) {
        if (i10 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i10 / 3) << 2) + 4];
            int i11 = 0;
            int i12 = 0;
            while (i10 >= 3) {
                int i13 = ((bArr[i11] & DefaultClassResolver.NAME) << 16) + ((bArr[i11 + 1] & DefaultClassResolver.NAME) << 8) + (bArr[i11 + 2] & DefaultClassResolver.NAME);
                int i14 = i12 + 1;
                char[] cArr2 = f10186e;
                cArr[i12] = cArr2[i13 >> 18];
                int i15 = i14 + 1;
                cArr[i14] = cArr2[(i13 >> 12) & 63];
                int i16 = i15 + 1;
                cArr[i15] = cArr2[(i13 >> 6) & 63];
                i12 = i16 + 1;
                cArr[i16] = cArr2[i13 & 63];
                i11 += 3;
                i10 -= 3;
            }
            if (i10 == 1) {
                int i17 = bArr[i11] & DefaultClassResolver.NAME;
                int i18 = i12 + 1;
                char[] cArr3 = f10186e;
                cArr[i12] = cArr3[i17 >> 2];
                int i19 = i18 + 1;
                cArr[i18] = cArr3[(i17 << 4) & 63];
                int i20 = i19 + 1;
                cArr[i19] = f;
                i12 = i20 + 1;
                cArr[i20] = f;
            } else if (i10 == 2) {
                int i21 = ((bArr[i11] & DefaultClassResolver.NAME) << 8) + (bArr[i11 + 1] & DefaultClassResolver.NAME);
                int i22 = i12 + 1;
                char[] cArr4 = f10186e;
                cArr[i12] = cArr4[i21 >> 10];
                int i23 = i22 + 1;
                cArr[i22] = cArr4[(i21 >> 4) & 63];
                int i24 = i23 + 1;
                cArr[i23] = cArr4[(i21 << 2) & 63];
                i12 = i24 + 1;
                cArr[i24] = f;
            }
            return new String(cArr, 0, i12);
        } catch (Exception unused) {
            return null;
        }
    }
}
