package com.anythink.expressad.foundation.g.d;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class e {
    public static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }

    private static boolean b(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    private static String c(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    private static String d(String str) {
        if (b(str)) {
            return str;
        }
        char charAt = str.charAt(0);
        if (Character.isLetter(charAt) && !Character.isUpperCase(charAt)) {
            StringBuilder sb2 = new StringBuilder(str.length());
            sb2.append(Character.toUpperCase(charAt));
            sb2.append(str.substring(1));
            return sb2.toString();
        }
        return str;
    }

    private static String e(String str) {
        if (!b(str) && str.getBytes().length != str.length()) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UnsupportedEncodingException occurred. ", e10);
            }
        }
        return str;
    }

    private static String f(String str) {
        if (b(str)) {
            return "";
        }
        Matcher matcher = Pattern.compile(".*<[\\s]*a[\\s]*.*>(.+?)<[\\s]*/a[\\s]*>.*", 2).matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    private static String g(String str) {
        if (b(str)) {
            return str;
        }
        return str.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&amp;", ContainerUtils.FIELD_DELIMITER).replaceAll("&quot;", "\"");
    }

    private static String h(String str) {
        if (b(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c10 = charArray[i10];
            if (c10 == 12288) {
                charArray[i10] = ' ';
            } else if (c10 >= 65281 && c10 <= 65374) {
                charArray[i10] = (char) (c10 - 65248);
            } else {
                charArray[i10] = c10;
            }
        }
        return new String(charArray);
    }

    private static String i(String str) {
        if (b(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c10 = charArray[i10];
            if (c10 == ' ') {
                charArray[i10] = 12288;
            } else if (c10 >= '!' && c10 <= '~') {
                charArray[i10] = (char) (c10 + 65248);
            } else {
                charArray[i10] = c10;
            }
        }
        return new String(charArray);
    }

    private static String a(String str, String str2) {
        if (b(str) || str.getBytes().length == str.length()) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str2;
        }
    }

    private static String a(long j10) {
        if (j10 <= 0) {
            return "0M";
        }
        return String.format("%.1f", Float.valueOf((((float) j10) / 1024.0f) / 1024.0f)) + "M";
    }
}
