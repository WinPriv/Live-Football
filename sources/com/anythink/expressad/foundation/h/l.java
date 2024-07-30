package com.anythink.expressad.foundation.h;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    protected static char[] f10153a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    protected static MessageDigest f10154b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f10155c = "SameFileMD5";

    static {
        f10154b = null;
        try {
            f10154b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e10) {
            System.err.println(l.class.getName().concat("初始化失败，MessageDigest不支持MD5Util."));
            e10.printStackTrace();
        }
    }

    private static String a(String str) {
        return a(new File(str));
    }

    public static String a(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            f10154b.update(fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length()));
            byte[] digest = f10154b.digest();
            String a10 = a(digest, digest.length);
            fileInputStream.close();
            return a10;
        } catch (Exception e11) {
            e = e11;
            fileInputStream2 = fileInputStream;
            o.b(f10155c, "FILE EXCEPTION", e);
            if (fileInputStream2 == null) {
                return "";
            }
            fileInputStream2.close();
            return "";
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    private static String a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static String a(byte[] bArr, int i10) {
        StringBuffer stringBuffer = new StringBuffer(i10 * 2);
        int i11 = i10 + 0;
        for (int i12 = 0; i12 < i11; i12++) {
            a(bArr[i12], stringBuffer);
        }
        return stringBuffer.toString();
    }

    private static void a(byte b10, StringBuffer stringBuffer) {
        char[] cArr = f10153a;
        char c10 = cArr[(b10 & 240) >> 4];
        char c11 = cArr[b10 & Ascii.SI];
        stringBuffer.append(c10);
        stringBuffer.append(c11);
    }
}
