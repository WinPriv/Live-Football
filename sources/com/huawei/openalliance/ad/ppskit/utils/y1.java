package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f23070a = Pattern.compile("[0-9]*");

    public static long a(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            return j10;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            n7.g("StringUtils", "parseIntOrDefault exception: ".concat(e10.getClass().getSimpleName()));
            return j10;
        }
    }

    public static String b(Context context) {
        InputStream open = context.getAssets().open("openmeasure/omsdk-v1.js");
        StringBuilder sb2 = new StringBuilder();
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, "UTF-8"));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine + "\n");
                }
            } catch (IOException e10) {
                n7.i("StringUtils", "getStringFromAsset, " + e10.getClass().getSimpleName());
            }
            open.close();
            return sb2.toString();
        } catch (Throwable th) {
            open.close();
            throw th;
        }
    }

    public static String c(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            Resources resources = context.getResources();
            try {
                return resources.getString(resources.getIdentifier(str, com.anythink.expressad.foundation.h.i.f10128g, context.getPackageName()));
            } catch (Throwable th) {
                n7.j("StringUtils", "getStringResource exception %s ", th.getClass().getSimpleName());
            }
        }
        return "";
    }

    public static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public static String e(List list) {
        StringBuilder sb2 = new StringBuilder();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!z10) {
                    sb2.append(",");
                }
                sb2.append(str);
                z10 = false;
            }
        }
        return sb2.toString();
    }

    public static String f(byte[] bArr) {
        Closeable closeable;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        String str = null;
        try {
            if (bArr == null) {
                return null;
            }
            try {
            } catch (IOException e10) {
                e = e10;
                byteArrayOutputStream = null;
                byteArrayInputStream = null;
            } catch (Throwable th) {
                th = th;
                closeable = null;
                androidx.transition.n.D(byteArrayOutputStream2);
                androidx.transition.n.D(closeable);
                throw th;
            }
            if (bArr.length == 0) {
                return null;
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    byte[] bArr2 = new byte[256];
                    while (true) {
                        int read = gZIPInputStream.read(bArr2);
                        if (read < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    str = byteArrayOutputStream.toString("UTF-8");
                } catch (IOException e11) {
                    e = e11;
                    n7.i("gzip compress error.", e.getMessage());
                    androidx.transition.n.D(byteArrayOutputStream);
                    androidx.transition.n.D(byteArrayInputStream);
                    return str;
                }
            } catch (IOException e12) {
                e = e12;
                byteArrayInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                androidx.transition.n.D(byteArrayOutputStream2);
                androidx.transition.n.D(closeable);
                throw th;
            }
            androidx.transition.n.D(byteArrayOutputStream);
            androidx.transition.n.D(byteArrayInputStream);
            return str;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void g(StringBuilder sb2, char c10) {
        if (sb2.lastIndexOf(String.valueOf(c10)) == sb2.length() - 1) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
    }

    public static boolean h(String str) {
        if (str != null && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    public static String i(Context context) {
        if (context == null || !h.a(context).c()) {
            return "";
        }
        return "Tv";
    }

    public static String j(String str) {
        int i10;
        String substring;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        boolean contains = str.contains("://");
        String str2 = com.huawei.openalliance.ad.constant.w.f22174w;
        if (contains) {
            StringBuilder sb2 = new StringBuilder();
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme != null) {
                sb2.append(scheme);
                sb2.append("://");
            }
            String lastPathSegment = parse.getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = parse.getHost();
            } else {
                sb2.append("******/");
            }
            if (lastPathSegment != null) {
                int length = lastPathSegment.length();
                if (length <= 3) {
                    if (length > 1) {
                        substring = lastPathSegment.substring(0, length - 1);
                    }
                } else {
                    substring = lastPathSegment.substring(0, 3);
                }
                sb2.append(substring);
            }
            sb2.append(com.huawei.openalliance.ad.constant.w.f22174w);
            return sb2.toString();
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf >= 0 && (i10 = lastIndexOf + 1) < str.length()) {
            str = str.substring(i10);
        }
        int length2 = str.length();
        if (length2 <= 3) {
            if (length2 > 1) {
                str2 = str.substring(0, length2 - 1) + com.huawei.openalliance.ad.constant.w.f22174w;
            }
        } else {
            str2 = str.substring(0, 3) + com.huawei.openalliance.ad.constant.w.f22174w;
        }
        return str2;
    }

    public static String k(String str) {
        if (!TextUtils.isEmpty(str) && str.lastIndexOf("/") == str.length() - 1) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static int l(int i10, String str) {
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            n7.g("StringUtils", "parseIntOrDefault exception: ".concat(e10.getClass().getSimpleName()));
            return i10;
        }
    }

    public static boolean m(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
            String[] split = str2.split(",");
            String u2 = u(str);
            n7.e("StringUtils", "host:" + u2);
            if (!TextUtils.isEmpty(u2)) {
                return Arrays.asList(split).contains(u2);
            }
        }
        return false;
    }

    public static String n(String str) {
        if (h(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable th) {
            n7.j("StringUtils", "unsupport encoding, err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public static boolean o(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return TextUtils.equals(str, str2);
        }
        return false;
    }

    public static String p(String str) {
        if (h(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable th) {
            n7.j("StringUtils", "unsupport decoding, err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public static Integer q(String str) {
        if (h(str)) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e10) {
            n7.i("StringUtils", "toInteger NumberFormatException:".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    public static Integer r(String str) {
        try {
            return Integer.valueOf((int) Double.parseDouble(str));
        } catch (Exception e10) {
            n7.i("StringUtils", "parseStringToInt ex:".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    public static Long s(String str) {
        if (h(str)) {
            return null;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException e10) {
            n7.i("StringUtils", "toLong NumberFormatException:".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    public static boolean t(String str) {
        if (str != null && (str.startsWith("http://") || str.startsWith("https://"))) {
            return true;
        }
        return false;
    }

    public static String u(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (!URLUtil.isNetworkUrl(str)) {
                n7.g("StringUtils", "url don't starts with http or https");
                return null;
            }
            if (str.contains("{")) {
                str = str.replaceAll("\\{", "");
            }
            if (str.contains("}")) {
                str = str.replaceAll("\\}", "");
            }
            return new URI(str).getHost();
        } catch (URISyntaxException e10) {
            n7.i("StringUtils", "getHostByURI error : ".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    public static String v(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.toUpperCase(Locale.ENGLISH);
    }

    public static String w(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        if (length <= 3) {
            if (length > 1) {
                str = str.substring(0, length - 1);
            }
            sb2.append(str);
            sb2.append(com.huawei.openalliance.ad.constant.w.f22174w);
        } else {
            int i10 = (length / 5) + 1;
            String substring = str.substring(0, Math.min(3, i10));
            String substring2 = str.substring(length - Math.min(3, i10));
            sb2.append(substring);
            sb2.append(com.huawei.openalliance.ad.constant.w.f22174w);
            sb2.append(substring2);
        }
        return sb2.toString();
    }

    public static String x(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return r2.a(str.getBytes("UTF-8"));
        } catch (Throwable th) {
            n7.h("StringUtils", "base64Encode Exception: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public static String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.length() > 100) {
                str = str.substring(0, 100);
            }
            return r2.a(str.getBytes("UTF-8"));
        } catch (Throwable th) {
            n7.h("StringUtils", "formatInput Exception: %s", th.getClass().getSimpleName());
            return "";
        }
    }

    public static String z(String str) {
        String str2;
        if (h(str)) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split.length > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(split[0]);
            for (int i10 = 1; i10 < split.length; i10++) {
                if (i10 < 3 && split[i10].length() == 1) {
                    sb2.append("0");
                    str2 = split[i10];
                } else {
                    str2 = split[i10];
                }
                sb2.append(str2);
            }
            return sb2.toString();
        }
        return str;
    }
}
