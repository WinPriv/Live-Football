package com.huawei.openalliance.ad.ppskit.utils;

import android.annotation.SuppressLint;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.google.android.gms.stats.CodePackage;
import java.security.Key;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import ka.n7;

/* loaded from: classes2.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f22929a = new HashMap();

    public static String a(String str) {
        if (!TextUtils.isEmpty("BFE_KS_ALIAS") && !TextUtils.isEmpty(str)) {
            try {
                return androidx.transition.n.w(b(str.getBytes("UTF-8")));
            } catch (Throwable th) {
                n7.j("GCMKS", "encrypt ex: %s", th.getClass().getSimpleName());
                return "";
            }
        }
        n7.i("GCMKS", "alias or encrypt content is null");
        return "";
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty("BFE_KS_ALIAS") && bArr != null) {
            SecretKey c10 = c();
            byte[] bArr3 = new byte[0];
            if (c10 == null) {
                n7.i("GCMKS", "secret key is null");
            } else {
                try {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(1, c10);
                    byte[] doFinal = cipher.doFinal(bArr);
                    byte[] iv = cipher.getIV();
                    if (iv != null && iv.length == 12) {
                        bArr3 = Arrays.copyOf(iv, iv.length + doFinal.length);
                        System.arraycopy(doFinal, 0, bArr3, iv.length, doFinal.length);
                    }
                    n7.i("GCMKS", "IV is invalid.");
                } catch (Throwable th) {
                    n7.j("GCMKS", "encrypt ex: %s", th.getClass().getSimpleName());
                }
            }
            return bArr3;
        }
        n7.i("GCMKS", "alias or encrypt content is null");
        return bArr2;
    }

    @SuppressLint({"NewApi"})
    public static SecretKey c() {
        SecretKey secretKey = null;
        if (TextUtils.isEmpty("BFE_KS_ALIAS")) {
            return null;
        }
        HashMap hashMap = f22929a;
        if (hashMap.get("BFE_KS_ALIAS") == null) {
            n7.e("GCMKS", "load key");
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                Key key = keyStore.getKey("BFE_KS_ALIAS", null);
                if (key instanceof SecretKey) {
                    secretKey = (SecretKey) key;
                } else {
                    n7.e("GCMKS", "generate key");
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(new KeyGenParameterSpec.Builder("BFE_KS_ALIAS", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build());
                    secretKey = keyGenerator.generateKey();
                }
            } catch (Throwable th) {
                n7.j("GCMKS", "generateKey ex %s: ", th.getClass().getSimpleName());
            }
            hashMap.put("BFE_KS_ALIAS", secretKey);
        }
        return (SecretKey) hashMap.get("BFE_KS_ALIAS");
    }

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty("BFE_KS_ALIAS")) {
            String str = "Decrypt source data is invalid.";
            if (bArr.length <= 12) {
                n7.i("GCMKS", "Decrypt source data is invalid.");
                return bArr2;
            }
            SecretKey c10 = c();
            byte[] bArr3 = new byte[0];
            if (c10 == null) {
                str = "Decrypt secret key is null";
            } else if (bArr.length > 12) {
                byte[] copyOf = Arrays.copyOf(bArr, 12);
                try {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(2, c10, new GCMParameterSpec(128, copyOf));
                    return cipher.doFinal(bArr, 12, bArr.length - 12);
                } catch (Throwable th) {
                    n7.j("GCMKS", "decrypt ex:%s", th.getClass().getSimpleName());
                    return bArr3;
                }
            }
            n7.i("GCMKS", str);
            return bArr3;
        }
        n7.i("GCMKS", "alias or encrypt content is null");
        return bArr2;
    }
}
