package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10131a = "j";

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f10132b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f10133c;

    /* renamed from: d, reason: collision with root package name */
    private static char[] f10134d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f10135e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    static {
        HashMap hashMap = new HashMap();
        f10133c = hashMap;
        hashMap.put('v', 'A');
        f10133c.put('S', 'B');
        f10133c.put('o', 'C');
        f10133c.put('a', 'D');
        f10133c.put('j', 'E');
        f10133c.put('c', 'F');
        f10133c.put('7', 'G');
        f10133c.put('d', 'H');
        f10133c.put('R', 'I');
        f10133c.put('z', 'J');
        f10133c.put('p', 'K');
        f10133c.put('W', 'L');
        f10133c.put('i', 'M');
        f10133c.put('f', 'N');
        f10133c.put('G', 'O');
        f10133c.put('y', 'P');
        f10133c.put('N', 'Q');
        f10133c.put('x', 'R');
        f10133c.put('Z', 'S');
        f10133c.put('n', 'T');
        f10133c.put('V', 'U');
        f10133c.put('5', 'V');
        f10133c.put('k', 'W');
        f10133c.put('+', 'X');
        f10133c.put('D', 'Y');
        f10133c.put('H', 'Z');
        f10133c.put('L', 'a');
        f10133c.put('Y', 'b');
        f10133c.put('h', 'c');
        f10133c.put('J', 'd');
        f10133c.put('4', 'e');
        f10133c.put('6', 'f');
        f10133c.put('l', 'g');
        f10133c.put('t', 'h');
        f10133c.put('0', 'i');
        f10133c.put('U', 'j');
        f10133c.put('3', 'k');
        f10133c.put('Q', 'l');
        f10133c.put('r', 'm');
        f10133c.put('g', 'n');
        f10133c.put('E', 'o');
        f10133c.put('u', 'p');
        f10133c.put('q', 'q');
        f10133c.put('8', 'r');
        f10133c.put('s', 's');
        f10133c.put('w', 't');
        f10133c.put('/', 'u');
        f10133c.put('X', 'v');
        f10133c.put('M', 'w');
        f10133c.put('e', 'x');
        f10133c.put('B', 'y');
        f10133c.put('A', 'z');
        f10133c.put('T', '0');
        f10133c.put('2', '1');
        f10133c.put('F', '2');
        f10133c.put('b', '3');
        f10133c.put('9', '4');
        f10133c.put('P', '5');
        f10133c.put('1', '6');
        f10133c.put('O', '7');
        f10133c.put('I', '8');
        f10133c.put('K', '9');
        f10133c.put('m', '+');
        f10133c.put('C', '/');
        HashMap hashMap2 = new HashMap();
        f10132b = hashMap2;
        hashMap2.put('A', 'v');
        f10132b.put('B', 'S');
        f10132b.put('C', 'o');
        f10132b.put('D', 'a');
        f10132b.put('E', 'j');
        f10132b.put('F', 'c');
        f10132b.put('G', '7');
        f10132b.put('H', 'd');
        f10132b.put('I', 'R');
        f10132b.put('J', 'z');
        f10132b.put('K', 'p');
        f10132b.put('L', 'W');
        f10132b.put('M', 'i');
        f10132b.put('N', 'f');
        f10132b.put('O', 'G');
        f10132b.put('P', 'y');
        f10132b.put('Q', 'N');
        f10132b.put('R', 'x');
        f10132b.put('S', 'Z');
        f10132b.put('T', 'n');
        f10132b.put('U', 'V');
        f10132b.put('V', '5');
        f10132b.put('W', 'k');
        f10132b.put('X', '+');
        f10132b.put('Y', 'D');
        f10132b.put('Z', 'H');
        f10132b.put('a', 'L');
        f10132b.put('b', 'Y');
        f10132b.put('c', 'h');
        f10132b.put('d', 'J');
        f10132b.put('e', '4');
        f10132b.put('f', '6');
        f10132b.put('g', 'l');
        f10132b.put('h', 't');
        f10132b.put('i', '0');
        f10132b.put('j', 'U');
        f10132b.put('k', '3');
        f10132b.put('l', 'Q');
        f10132b.put('m', 'r');
        f10132b.put('n', 'g');
        f10132b.put('o', 'E');
        f10132b.put('p', 'u');
        f10132b.put('q', 'q');
        f10132b.put('r', '8');
        f10132b.put('s', 's');
        f10132b.put('t', 'w');
        f10132b.put('u', '/');
        f10132b.put('v', 'X');
        f10132b.put('w', 'M');
        f10132b.put('x', 'e');
        f10132b.put('y', 'B');
        f10132b.put('z', 'A');
        f10132b.put('0', 'T');
        f10132b.put('1', '2');
        f10132b.put('2', 'F');
        f10132b.put('3', 'b');
        f10132b.put('4', '9');
        f10132b.put('5', 'P');
        f10132b.put('6', '1');
        f10132b.put('7', 'O');
        f10132b.put('8', 'I');
        f10132b.put('9', 'K');
        f10132b.put('+', 'm');
        f10132b.put('/', 'C');
    }

    private j() {
    }

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            int i11 = i10 + 1;
            int i12 = bArr[i10] & DefaultClassResolver.NAME;
            if (i11 == length) {
                stringBuffer.append(f10134d[i12 >>> 2]);
                stringBuffer.append(f10134d[(i12 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i13 = i11 + 1;
            int i14 = bArr[i11] & DefaultClassResolver.NAME;
            if (i13 == length) {
                stringBuffer.append(f10134d[i12 >>> 2]);
                stringBuffer.append(f10134d[((i12 & 3) << 4) | ((i14 & 240) >>> 4)]);
                stringBuffer.append(f10134d[(i14 & 15) << 2]);
                stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                break;
            }
            int i15 = i13 + 1;
            int i16 = bArr[i13] & DefaultClassResolver.NAME;
            stringBuffer.append(f10134d[i12 >>> 2]);
            stringBuffer.append(f10134d[((i12 & 3) << 4) | ((i14 & 240) >>> 4)]);
            stringBuffer.append(f10134d[((i14 & 15) << 2) | ((i16 & 192) >>> 6)]);
            stringBuffer.append(f10134d[i16 & 63]);
            i10 = i15;
        }
        return stringBuffer.toString();
    }

    public static String b(String str) {
        return q.a(str);
    }

    private static byte[] c(String str) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        int i12;
        byte b12;
        int i13;
        byte b13;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i14 = 0;
        while (i14 < length) {
            while (true) {
                i10 = i14 + 1;
                b10 = f10135e[bytes[i14]];
                if (i10 >= length || b10 != -1) {
                    break;
                }
                i14 = i10;
            }
            if (b10 == -1) {
                break;
            }
            while (true) {
                i11 = i10 + 1;
                b11 = f10135e[bytes[i10]];
                if (i11 >= length || b11 != -1) {
                    break;
                }
                i10 = i11;
            }
            if (b11 == -1) {
                break;
            }
            byteArrayOutputStream.write((b10 << 2) | ((b11 & 48) >>> 4));
            while (true) {
                i12 = i11 + 1;
                byte b14 = bytes[i11];
                if (b14 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b12 = f10135e[b14];
                if (i12 >= length || b12 != -1) {
                    break;
                }
                i11 = i12;
            }
            if (b12 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b11 & Ascii.SI) << 4) | ((b12 & 60) >>> 2));
            while (true) {
                i13 = i12 + 1;
                byte b15 = bytes[i12];
                if (b15 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b13 = f10135e[b15];
                if (i13 >= length || b13 != -1) {
                    break;
                }
                i12 = i13;
            }
            if (b13 == -1) {
                break;
            }
            byteArrayOutputStream.write(b13 | ((b12 & 3) << 6));
            i14 = i13;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String a(String str) {
        return TextUtils.isEmpty(str) ? "" : q.b(str);
    }
}
