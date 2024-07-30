package com.anythink.core.common.k;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    static HashMap<Character, Character> f6140a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final String f6141b = "c";

    /* renamed from: e, reason: collision with root package name */
    private static final String f6144e = "ZE1XbmhiZXlLcjBKSXZMTk94M0JGa0V1bWw5Mlk1ZmpTcUdUN1I4cFpWY2lQSEFzdEM0VVhhNlFEdzFnb3orLw==";

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f6142c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f6143d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};
    private static String f = "";

    private c() {
    }

    public static String a(String str) {
        return TextUtils.isEmpty(str) ? "" : a(str.getBytes());
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(d(str));
    }

    public static String c(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            char[] charArray = str.toCharArray();
            if (charArray != null && charArray.length > 0) {
                char[] cArr = new char[charArray.length];
                for (int i10 = 0; i10 < charArray.length; i10++) {
                    cArr[i10] = a(charArray[i10]).charValue();
                }
                str2 = new String(cArr);
            }
            return new String(d(str2));
        } catch (Exception e10) {
            e10.printStackTrace();
            return str2;
        }
    }

    private static byte[] d(String str) {
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
                b10 = f6143d[bytes[i14]];
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
                b11 = f6143d[bytes[i10]];
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
                b12 = f6143d[b14];
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
                b13 = f6143d[b15];
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

    public static String a(byte[] bArr) {
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
                char[] cArr = f6142c;
                stringBuffer.append(cArr[i12 >>> 2]);
                stringBuffer.append(cArr[(i12 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i13 = i11 + 1;
            int i14 = bArr[i11] & DefaultClassResolver.NAME;
            if (i13 == length) {
                char[] cArr2 = f6142c;
                stringBuffer.append(cArr2[i12 >>> 2]);
                stringBuffer.append(cArr2[((i12 & 3) << 4) | ((i14 & 240) >>> 4)]);
                stringBuffer.append(cArr2[(i14 & 15) << 2]);
                stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                break;
            }
            int i15 = i13 + 1;
            int i16 = bArr[i13] & DefaultClassResolver.NAME;
            char[] cArr3 = f6142c;
            stringBuffer.append(cArr3[i12 >>> 2]);
            stringBuffer.append(cArr3[((i12 & 3) << 4) | ((i14 & 240) >>> 4)]);
            stringBuffer.append(cArr3[((i14 & 15) << 2) | ((i16 & 192) >>> 6)]);
            stringBuffer.append(cArr3[i16 & 63]);
            i10 = i15;
        }
        return stringBuffer.toString();
    }

    private static synchronized Character a(char c10) {
        synchronized (c.class) {
            if (TextUtils.isEmpty(f)) {
                f = b(f6144e);
            }
            if (f6140a == null) {
                f6140a = new HashMap<>();
                int i10 = 0;
                while (true) {
                    char[] cArr = f6142c;
                    if (i10 >= cArr.length) {
                        break;
                    }
                    f6140a.put(Character.valueOf(f.charAt(i10)), Character.valueOf(cArr[i10]));
                    i10++;
                }
            }
            if (f6140a.containsKey(Character.valueOf(c10))) {
                return f6140a.get(Character.valueOf(c10));
            }
            return Character.valueOf(c10);
        }
    }
}
