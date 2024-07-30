package com.anythink.core.common.h;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f5994a;

    /* renamed from: b, reason: collision with root package name */
    private static char[] f5995b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: c, reason: collision with root package name */
    private static char[] f5996c = {'5', 'P', 'V', 'u', '3', 'J', 'j', 'l', 'e', 'Q', 'b', 'H', '9', 'A', 'v', 'h', 't', 's', 'g', 'W', 'I', 'C', 'U', 'i', 'F', '2', 'a', 'd', 'M', '8', 'D', 'y', 'Z', 'O', 'N', 'k', '/', '4', 'R', '7', '0', 'f', 'n', '+', 'z', 'G', 'Y', 'L', 'X', 'p', 'm', '1', 'E', 'K', 'S', 'T', 'o', 'x', '6', 'q', 'w', 'r', 'c', 'B'};

    /* renamed from: d, reason: collision with root package name */
    private static byte[] f5997d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static b a(String str, String str2) {
        byte[] doFinal;
        b bVar = new b();
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 2)));
            int bitLength = generatePublic instanceof RSAPublicKey ? ((RSAPublicKey) generatePublic).getModulus().bitLength() : 0;
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, generatePublic);
            int i10 = (bitLength / 8) - 11;
            if (i10 > 0) {
                doFinal = a(cipher, str2.getBytes(), i10);
            } else {
                doFinal = cipher.doFinal(str2.getBytes());
            }
            bVar.a(new String(Base64.encode(doFinal, 2)));
        } catch (Throwable th) {
            bVar.b(th.getMessage());
        }
        return bVar;
    }

    private static byte[] b(String str) {
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
                b10 = f5997d[bytes[i14]];
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
                b11 = f5997d[bytes[i10]];
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
                b12 = f5997d[b14];
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
                b13 = f5997d[b15];
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

    private static byte[] a(Cipher cipher, byte[] bArr, int i10) {
        byte[] doFinal;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = length - i11;
            if (i13 > 0) {
                if (i13 > i10) {
                    doFinal = cipher.doFinal(bArr, i11, i10);
                } else {
                    doFinal = cipher.doFinal(bArr, i11, i13);
                }
                byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                i12++;
                i11 = i12 * i10;
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
        }
    }

    public static String a(String str) {
        Character valueOf;
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            char[] charArray = str.toCharArray();
            if (charArray != null && charArray.length > 0) {
                char[] cArr = new char[charArray.length];
                for (int i10 = 0; i10 < charArray.length; i10++) {
                    char c10 = charArray[i10];
                    if (f5994a == null) {
                        f5994a = new HashMap();
                        for (int i11 = 0; i11 < f5995b.length; i11++) {
                            f5994a.put(Character.valueOf(f5996c[i11]), Character.valueOf(f5995b[i11]));
                        }
                    }
                    if (f5994a.containsKey(Character.valueOf(c10))) {
                        valueOf = f5994a.get(Character.valueOf(c10));
                    } else {
                        valueOf = Character.valueOf(c10);
                    }
                    cArr[i10] = valueOf.charValue();
                }
                str2 = new String(cArr);
            }
            return new String(b(str2));
        } catch (Exception e10) {
            e10.printStackTrace();
            return str2;
        }
    }

    private static Character a(char c10) {
        if (f5994a == null) {
            f5994a = new HashMap();
            for (int i10 = 0; i10 < f5995b.length; i10++) {
                f5994a.put(Character.valueOf(f5996c[i10]), Character.valueOf(f5995b[i10]));
            }
        }
        if (f5994a.containsKey(Character.valueOf(c10))) {
            return f5994a.get(Character.valueOf(c10));
        }
        return Character.valueOf(c10);
    }
}
