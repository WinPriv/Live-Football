package com.huawei.openalliance.ad.ppskit.utils;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class m2 {
    public static String a(String str, byte[] bArr) {
        if (!y1.h(str) && bArr != null && bArr.length != 0) {
            try {
                return e(str, bArr);
            } catch (Exception e10) {
                n7.g("Aes128", "fail to cipher: ".concat(e10.getClass().getSimpleName()));
                n7.a();
                return "";
            }
        }
        return "";
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length >= 16 && bArr3.length >= 12) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr3));
                return cipher.doFinal(bArr);
            } catch (GeneralSecurityException e10) {
                n7.i("Aes128", "GCM encrypt data error" + e10.getMessage());
            }
        } else {
            n7.e("Aes128", "gcm encrypt param is not right");
        }
        return new byte[0];
    }

    public static String c(String str, byte[] bArr) {
        if (!y1.h(str) && str.length() >= 32 && bArr != null && bArr.length != 0) {
            try {
                return f(str, bArr);
            } catch (Exception e10) {
                n7.g("Aes128", "fail to decrypt: ".concat(e10.getClass().getSimpleName()));
                n7.c("Aes128", "input: %s", y1.j(androidx.transition.n.w(bArr)));
                n7.a();
                return "";
            } catch (Throwable th) {
                e0.i.p(th, "fail to decrypt: ", "Aes128");
                n7.c("Aes128", "input: %s", y1.j(androidx.transition.n.w(bArr)));
                n7.a();
                return "";
            }
        }
        return "";
    }

    public static String d(String str, byte[] bArr) {
        if (!y1.h(str) && str.length() >= 32 && bArr != null && bArr.length != 0) {
            return f(str, bArr);
        }
        return "";
    }

    public static String e(String str, byte[] bArr) {
        byte[] bArr2;
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length >= 16) {
            byte[] bArr3 = new byte[12];
            u1.j().nextBytes(bArr3);
            if (!TextUtils.isEmpty(str) && bArr.length >= 16) {
                try {
                    bArr2 = b(str.getBytes("UTF-8"), bArr, bArr3);
                } catch (UnsupportedEncodingException e10) {
                    n7.i("Aes128", "GCM encrypt data error" + e10.getMessage());
                }
                if (bArr2 == null && bArr2.length != 0) {
                    return com.ironsource.adapters.facebook.a.h(androidx.transition.n.w(bArr3), androidx.transition.n.w(bArr2));
                }
            }
            n7.e("Aes128", "gcm encrypt param is not right");
            bArr2 = new byte[0];
            return bArr2 == null ? "" : "";
        }
        return "";
    }

    public static String f(String str, byte[] bArr) {
        String str2;
        String str3;
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length >= 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                if (!TextUtils.isEmpty(str) && str.length() >= 24) {
                    str2 = str.substring(0, 24);
                } else {
                    n7.e("Aes128", "IV is invalid.");
                    str2 = "";
                }
                if (TextUtils.isEmpty(str) || str.length() < 24) {
                    str3 = "";
                } else {
                    str3 = str.substring(24);
                }
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    cipher.init(2, secretKeySpec, new GCMParameterSpec(128, androidx.transition.n.O(str2)));
                    return new String(cipher.doFinal(androidx.transition.n.O(str3)), "UTF-8");
                }
                n7.e("Aes128", "ivParameter or encrypedWord is null");
                return "";
            } catch (UnsupportedEncodingException e10) {
                e = e10;
                n7.i("Aes128", "GCM decrypt data exception: " + e.getMessage());
                return "";
            } catch (GeneralSecurityException e11) {
                e = e11;
                n7.i("Aes128", "GCM decrypt data exception: " + e.getMessage());
                return "";
            }
        }
        return "";
    }
}
