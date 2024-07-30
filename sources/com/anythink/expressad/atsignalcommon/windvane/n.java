package com.anythink.expressad.atsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.d.c;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f7077a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f7078b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f7079c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f7080d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f7081e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static Map<String, String> f = new HashMap();

    static {
        for (h hVar : h.values()) {
            f.put(hVar.a(), hVar.b());
        }
    }

    public static boolean a(String str) {
        for (String str2 : f7077a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Pattern b(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f7081e;
        }
        if ("mraid:".equals(str)) {
            return f7079c;
        }
        if ("ssp:".equals(str)) {
            return f7080d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f7081e;
        }
        return null;
    }

    public static String c(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            boolean z10 = true;
            if (charAt > 255) {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(charAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(charAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 < 2) {
                        if (cArr[i11] == charAt) {
                            stringBuffer.append("\\".concat(String.valueOf(charAt)));
                            break;
                        }
                        i11++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    stringBuffer.append(charAt);
                }
            }
        }
        return new String(stringBuffer);
    }

    public static boolean d(String str) {
        return e(str).startsWith(c.C0119c.f9528e);
    }

    public static String e(String str) {
        String str2 = f.get(f(str));
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    private static String f(String str) {
        String path;
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (lastIndexOf = path.lastIndexOf(".")) == -1) {
            return "";
        }
        return path.substring(lastIndexOf + 1);
    }
}
