package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class p implements com.anythink.expressad.e.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10181a = "MD5";

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            o.a("MD5", str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder(digest.length * 2);
            for (byte b10 : digest) {
                sb2.append(Integer.toHexString((b10 & 240) >>> 4));
                sb2.append(Integer.toHexString(b10 & Ascii.SI));
            }
            return sb2.toString().toLowerCase(Locale.US);
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private static String b(String str) {
        try {
            o.a("MD5", str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder(digest.length * 2);
            for (byte b10 : digest) {
                sb2.append(Integer.toHexString((b10 & 240) >>> 4));
                sb2.append(Integer.toHexString(b10 & Ascii.SI));
            }
            return sb2.toString().toUpperCase(Locale.US);
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private static String c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(Integer.toHexString((b10 & 240) >>> 4));
            sb2.append(Integer.toHexString(b10 & Ascii.SI));
        }
        return sb2.toString().toUpperCase(Locale.US);
    }

    private static byte[] d(String str) {
        int length = str.length();
        byte[] bytes = str.getBytes("UTF-16LE");
        o.b(com.anythink.expressad.exoplayer.g.b.i.f8075a, "b = " + a(bytes));
        byte[] bArr = new byte[length];
        int i10 = 0;
        for (int i11 = 0; i11 < bytes.length; i11 += 2) {
            byte b10 = bytes[i11];
            if (b10 != -1 && b10 != -2) {
                bArr[i10] = b10;
                i10++;
                if (i10 == length) {
                    break;
                }
            }
        }
        o.b(com.anythink.expressad.exoplayer.g.b.i.f8075a, "source = " + a(bArr));
        return bArr;
    }

    private static String c(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-16LE");
            o.b(com.anythink.expressad.exoplayer.g.b.i.f8075a, "b = " + a(bytes));
            byte[] bArr = new byte[length];
            int i10 = 0;
            for (int i11 = 0; i11 < bytes.length; i11 += 2) {
                byte b10 = bytes[i11];
                if (b10 != -1 && b10 != -2) {
                    bArr[i10] = b10;
                    i10++;
                    if (i10 == length) {
                        break;
                    }
                }
            }
            o.b(com.anythink.expressad.exoplayer.g.b.i.f8075a, "source = " + a(bArr));
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i12 = 0;
            for (byte b11 : digest) {
                int i13 = i12 + 1;
                cArr2[i12] = cArr[(b11 >>> 4) & 15];
                i12 = i13 + 1;
                cArr2[i13] = cArr[b11 & Ascii.SI];
            }
            return new String(cArr2);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(Integer.toHexString((b10 & 240) >>> 4));
            sb2.append(Integer.toHexString(b10 & Ascii.SI));
        }
        return sb2.toString().toLowerCase(Locale.US);
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        int length = bArr.length * 2;
        byte[] bArr2 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = 48;
        }
        byte[] bArr3 = new byte[bArr.length + 1];
        bArr3[0] = 0;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        byte[] bytes = new BigInteger(bArr3).toString(16).getBytes();
        System.arraycopy(bytes, 0, bArr2, length - bytes.length, bytes.length);
        return new String(bArr2);
    }
}
