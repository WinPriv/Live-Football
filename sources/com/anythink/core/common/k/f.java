package com.anythink.core.common.k;

import com.applovin.exoplayer2.common.base.Ascii;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6176a = "MD5";

    /* renamed from: b, reason: collision with root package name */
    private static char[] f6177b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str) {
        try {
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

    public static String b(String str) {
        try {
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

    public static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder(digest.length * 2);
            for (int i10 = 0; i10 < digest.length; i10++) {
                sb2.append(f6177b[(digest[i10] & 240) >>> 4]);
                sb2.append(f6177b[digest[i10] & Ascii.SI]);
            }
            return sb2.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(f6177b[(bArr[i10] & 240) >>> 4]);
            sb2.append(f6177b[bArr[i10] & Ascii.SI]);
        }
        return sb2.toString();
    }

    private static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(Integer.toHexString((b10 & 240) >>> 4));
            sb2.append(Integer.toHexString(b10 & Ascii.SI));
        }
        return sb2.toString().toLowerCase(Locale.US);
    }

    private static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(Integer.toHexString((b10 & 240) >>> 4));
            sb2.append(Integer.toHexString(b10 & Ascii.SI));
        }
        return sb2.toString().toUpperCase(Locale.US);
    }
}
