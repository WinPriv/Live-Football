package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import android.util.Base64;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10094a = "ebmclXzZOhtU2sRlZxGL8A";

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f10095b = new byte[32];

    /* renamed from: c, reason: collision with root package name */
    private static byte[] f10096c = new byte[16];

    /* renamed from: com.anythink.expressad.foundation.h.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0124a extends Provider {
        public C0124a() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

    static {
        if (!TextUtils.isEmpty(f10094a)) {
            try {
                byte[] digest = MessageDigest.getInstance("sha-384").digest(f10094a.getBytes());
                System.arraycopy(digest, 0, f10095b, 0, 32);
                System.arraycopy(digest, 32, f10096c, 0, 16);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static String a(String str) {
        return a(str, f10095b, f10096c);
    }

    private static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            byte[] digest = MessageDigest.getInstance("sha-384").digest(str.getBytes());
            System.arraycopy(digest, 0, f10095b, 0, 32);
            System.arraycopy(digest, 32, f10096c, 0, 16);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static String c(String str) {
        return b(str, f10095b, f10096c);
    }

    private static byte[] d(String str) {
        String upperCase = str.trim().replace(" ", "").toUpperCase(Locale.US);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            bArr[i10] = (byte) (Integer.decode("0x" + upperCase.substring(i11, i12) + upperCase.substring(i12, i12 + 1)).intValue() & com.anythink.expressad.exoplayer.k.p.f9095b);
        }
        return bArr;
    }

    private static String a(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Security.addProvider(new C0124a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return new String(Base64.encode(cipher.doFinal(str.getBytes()), 0));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static String b(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str, 0)));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static String a(byte[] bArr) {
        String str = "";
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & DefaultClassResolver.NAME);
            if (hexString.length() == 1) {
                str = e0.i.f(str, "0", hexString);
            } else {
                str = com.ironsource.adapters.facebook.a.h(str, hexString);
            }
        }
        return str;
    }
}
