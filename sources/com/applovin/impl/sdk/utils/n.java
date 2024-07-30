package com.applovin.impl.sdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.huawei.openalliance.ad.constant.w;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class n {
    public static String a(String str, String str2, long j10) {
        return a(str, str2, j10, new byte[]{-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77});
    }

    private static String b(byte[] bArr) throws UnsupportedEncodingException {
        return c(Base64.encode(bArr, 2));
    }

    private static String c(byte[] bArr) throws UnsupportedEncodingException {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace('=', '*');
    }

    private static String b(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', '=');
    }

    private static String a(String str, String str2, long j10, byte[] bArr) {
        if (str2 != null) {
            if (str2.length() < 80) {
                throw new IllegalArgumentException("SDK key is too short");
            }
            if (bArr != null) {
                char c10 = ' ';
                if (bArr.length >= 32) {
                    if (str == null || str.isEmpty()) {
                        return str;
                    }
                    try {
                        String substring = str2.substring(32);
                        String substring2 = str2.substring(0, 32);
                        byte[] bytes = str.getBytes("UTF-8");
                        byte[] a10 = a(substring2, bArr);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(((byte) ((j10 >> 0) & 255)) ^ a10[0]);
                        byteArrayOutputStream.write(((byte) ((j10 >> 8) & 255)) ^ a10[1]);
                        byteArrayOutputStream.write(((byte) ((j10 >> 16) & 255)) ^ a10[2]);
                        byteArrayOutputStream.write(((byte) ((j10 >> 24) & 255)) ^ a10[3]);
                        byteArrayOutputStream.write(((byte) ((j10 >> 32) & 255)) ^ a10[4]);
                        byteArrayOutputStream.write(((byte) ((j10 >> 40) & 255)) ^ a10[5]);
                        byteArrayOutputStream.write(((byte) ((j10 >> 48) & 255)) ^ a10[6]);
                        byteArrayOutputStream.write(((byte) ((j10 >> 56) & 255)) ^ a10[7]);
                        int i10 = 0;
                        while (i10 < bytes.length) {
                            long j11 = j10 + i10;
                            long j12 = (j11 ^ (j11 >> 33)) * (-4417276706812531889L);
                            long j13 = (j12 ^ (j12 >> 29)) * (-8796714831421723037L);
                            long j14 = j13 ^ (j13 >> c10);
                            byteArrayOutputStream.write((byte) (((i10 + 0 >= bytes.length ? (byte) 0 : bytes[r15]) ^ a10[r15 % a10.length]) ^ ((j14 >> 0) & 255)));
                            byteArrayOutputStream.write((byte) ((a10[r5 % a10.length] ^ (i10 + 1 >= bytes.length ? (byte) 0 : bytes[r5])) ^ ((j14 >> 8) & 255)));
                            byteArrayOutputStream.write((byte) ((a10[r8 % a10.length] ^ (i10 + 2 >= bytes.length ? (byte) 0 : bytes[r8])) ^ ((j14 >> 16) & 255)));
                            byteArrayOutputStream.write((byte) ((a10[r8 % a10.length] ^ (i10 + 3 >= bytes.length ? (byte) 0 : bytes[r8])) ^ ((j14 >> 24) & 255)));
                            byteArrayOutputStream.write((byte) ((a10[r8 % a10.length] ^ (i10 + 4 >= bytes.length ? (byte) 0 : bytes[r8])) ^ ((j14 >> 32) & 255)));
                            byteArrayOutputStream.write((byte) ((a10[r8 % a10.length] ^ (i10 + 5 >= bytes.length ? (byte) 0 : bytes[r8])) ^ ((j14 >> 40) & 255)));
                            byteArrayOutputStream.write((byte) ((a10[r8 % a10.length] ^ (i10 + 6 >= bytes.length ? (byte) 0 : bytes[r8])) ^ ((j14 >> 48) & 255)));
                            byteArrayOutputStream.write((byte) ((a10[r8 % a10.length] ^ (i10 + 7 >= bytes.length ? (byte) 0 : bytes[r8])) ^ ((j14 >> 56) & 255)));
                            i10 += 8;
                            c10 = ' ';
                        }
                        String b10 = b(byteArrayOutputStream.toByteArray());
                        return "1:" + a(bArr) + w.bE + substring + w.bE + b10;
                    } catch (IOException unused) {
                        return null;
                    }
                }
                throw new IllegalArgumentException("Salt is too short");
            }
            throw new IllegalArgumentException("No salt specified");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    public static String a(String str, String str2) {
        return a(str, str2, new byte[]{-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77});
    }

    private static String a(String str, String str2, byte[] bArr) {
        if (str2 != null) {
            if (str2.length() < 80) {
                throw new IllegalArgumentException("SDK key is too short");
            }
            if (bArr != null) {
                char c10 = ' ';
                if (bArr.length >= 32) {
                    if (TextUtils.isEmpty(str) || str.trim().startsWith("{")) {
                        return str;
                    }
                    String[] split = str.split(w.bE);
                    char c11 = 0;
                    try {
                        if (!"1".equals(split[0]) || split.length != 4) {
                            return null;
                        }
                        char c12 = 1;
                        String str3 = split[1];
                        String str4 = split[2];
                        byte[] a10 = a(split[3]);
                        if (str2.endsWith(str4) && a(bArr).equals(str3)) {
                            byte[] a11 = a(str2.substring(0, 32), bArr);
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a10);
                            char c13 = '\b';
                            try {
                                long read = (((byteArrayInputStream.read() ^ a11[5]) & com.anythink.expressad.exoplayer.k.p.f9095b) << 40) | (((byteArrayInputStream.read() ^ a11[0]) & com.anythink.expressad.exoplayer.k.p.f9095b) << 0) | (((byteArrayInputStream.read() ^ a11[1]) & com.anythink.expressad.exoplayer.k.p.f9095b) << 8) | (((byteArrayInputStream.read() ^ a11[2]) & com.anythink.expressad.exoplayer.k.p.f9095b) << 16) | (((byteArrayInputStream.read() ^ a11[3]) & com.anythink.expressad.exoplayer.k.p.f9095b) << 24) | (((byteArrayInputStream.read() ^ a11[4]) & com.anythink.expressad.exoplayer.k.p.f9095b) << 32) | (((byteArrayInputStream.read() ^ a11[6]) & com.anythink.expressad.exoplayer.k.p.f9095b) << 48) | (((byteArrayInputStream.read() ^ a11[7]) & com.anythink.expressad.exoplayer.k.p.f9095b) << 56);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr2 = new byte[8];
                                int read2 = byteArrayInputStream.read(bArr2);
                                int i10 = 0;
                                while (read2 >= 0) {
                                    long j10 = i10 + read;
                                    long j11 = (j10 ^ (j10 >> 33)) * (-4417276706812531889L);
                                    long j12 = (j11 ^ (j11 >> 29)) * (-8796714831421723037L);
                                    long j13 = j12 ^ (j12 >> c10);
                                    byteArrayOutputStream.write((byte) ((bArr2[c11] ^ a11[(i10 + 0) % a11.length]) ^ ((j13 >> c11) & 255)));
                                    byteArrayOutputStream.write((byte) ((bArr2[c12] ^ a11[(i10 + 1) % a11.length]) ^ ((j13 >> c13) & 255)));
                                    byteArrayOutputStream.write((byte) ((a11[(i10 + 2) % a11.length] ^ bArr2[2]) ^ ((j13 >> 16) & 255)));
                                    byteArrayOutputStream.write((byte) ((bArr2[3] ^ a11[(i10 + 3) % a11.length]) ^ ((j13 >> 24) & 255)));
                                    byteArrayOutputStream.write((byte) ((a11[(i10 + 4) % a11.length] ^ bArr2[4]) ^ ((j13 >> c10) & 255)));
                                    byteArrayOutputStream.write((byte) ((bArr2[5] ^ a11[(i10 + 5) % a11.length]) ^ ((j13 >> 40) & 255)));
                                    byteArrayOutputStream.write((byte) ((a11[(i10 + 6) % a11.length] ^ bArr2[6]) ^ ((j13 >> 48) & 255)));
                                    byteArrayOutputStream.write((byte) ((a11[(i10 + 7) % a11.length] ^ bArr2[7]) ^ ((j13 >> 56) & 255)));
                                    i10 += 8;
                                    read2 = byteArrayInputStream.read(bArr2);
                                    read = read;
                                    c13 = '\b';
                                    c11 = 0;
                                    c10 = ' ';
                                    c12 = 1;
                                }
                                return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                            } catch (IOException unused) {
                                return null;
                            }
                        }
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
                throw new IllegalArgumentException("Salt is too short");
            }
            throw new IllegalArgumentException("No salt specified");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static byte[] a(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 encoding not found", e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException("SHA-1 algorithm not found", e11);
        }
    }

    private static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("SHA-1 algorithm not found", e10);
        }
    }

    private static byte[] a(String str) {
        return Base64.decode(b(str), 0);
    }
}
