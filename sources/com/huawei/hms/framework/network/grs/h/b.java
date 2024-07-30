package com.huawei.hms.framework.network.grs.h;

import android.text.TextUtils;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.framework.common.Logger;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21916a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f21917b = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    public static String a(String str) {
        return a(str, "SHA-256");
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i10 = 1;
        if (str.length() == 1) {
            return "*";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < str.length(); i11++) {
            String str2 = str.charAt(i11) + "";
            if (f21917b.matcher(str2).matches()) {
                if (i10 % 2 == 0) {
                    str2 = "*";
                }
                i10++;
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    private static String a(String str, String str2) {
        String str3;
        String str4;
        try {
            try {
                return a(MessageDigest.getInstance(str2).digest(str.getBytes("UTF-8")));
            } catch (NoSuchAlgorithmException unused) {
                str3 = f21916a;
                str4 = "encrypt NoSuchAlgorithmException";
                Logger.w(str3, str4);
                return null;
            }
        } catch (UnsupportedEncodingException unused2) {
            str3 = f21916a;
            str4 = "encrypt UnsupportedEncodingException";
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & DefaultClassResolver.NAME);
            if (hexString.length() == 1) {
                sb2.append("0");
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }
}
