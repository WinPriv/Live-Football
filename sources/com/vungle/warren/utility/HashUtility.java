package com.vungle.warren.utility;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public class HashUtility {
    public static int getHashCode(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String sha256(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder(digest.length);
            for (byte b10 : digest) {
                String hexString = Integer.toHexString(b10 & DefaultClassResolver.NAME);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
