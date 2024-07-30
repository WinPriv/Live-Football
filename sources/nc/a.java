package nc;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import nc.h;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f33492a = JSONObject.class.getName();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String i(String str, String str2, String str3, JSONObject jSONObject) {
        char c10;
        switch (str2.hashCode()) {
            case -1852354744:
                if (str2.equals("html_play")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1851164744:
                if (str2.equals("html_unknow")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -1747666366:
                if (str2.equals("html_background")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1052935859:
                if (str2.equals("naitve")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -336860305:
                if (str2.equals("html_css")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -336842123:
                if (str2.equals("html_x3d")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3213227:
                if (str2.equals("html")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 45377598:
                if (str2.equals("html_doctype_write")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 562203614:
                if (str2.equals("html_doctype")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return m(jSONObject.optJSONObject(str3).optString("0"), str);
            case 1:
                return m(jSONObject.optJSONObject(str3).optString("1"), str);
            case 2:
                return m(jSONObject.optJSONObject(str3).optString("2"), str);
            case 3:
                return m(jSONObject.optJSONObject(str3).optString("5"), str);
            case 4:
                return m(jSONObject.optJSONObject(str3).optString("7"), str);
            case 5:
                String optString = jSONObject.optString("3");
                String optString2 = jSONObject.optString("4");
                String a10 = h.b.a(str, optString);
                if (!TextUtils.isEmpty(a10)) {
                    try {
                        a10 = URLDecoder.decode(a10.replaceAll("%(?![0-9a-fA-F]{2})", "%25"), "UTF-8");
                    } catch (UnsupportedEncodingException e10) {
                        e10.printStackTrace();
                    }
                    return m(jSONObject.optJSONObject(str3).optString("3"), a10);
                }
                return m(jSONObject.optJSONObject(str3).optString("4"), h.b.a(str, optString2));
            case 6:
                String a11 = h.b.a(str, jSONObject.optString("6"));
                if (!TextUtils.isEmpty(a11)) {
                    try {
                        a11 = URLDecoder.decode(a11.replaceAll("%(?![0-9a-fA-F]{2})", "%25"), "UTF-8");
                    } catch (UnsupportedEncodingException e11) {
                        e11.printStackTrace();
                    }
                    return m(jSONObject.optJSONObject(str3).optString("3"), a11);
                }
                return "";
            case 7:
                return m(jSONObject.optJSONObject(str3).optString("2"), h.b.a(str, jSONObject.optString("8")));
            default:
                return m(jSONObject.optJSONObject(str3).optString("9"), str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[Catch: all -> 0x022b, TRY_ENTER, TryCatch #4 {all -> 0x022b, blocks: (B:16:0x003d, B:22:0x0067, B:24:0x006f, B:26:0x007b, B:28:0x0085, B:30:0x008d, B:34:0x00ea, B:35:0x00f1, B:66:0x01a2, B:68:0x01ad, B:70:0x01b3, B:72:0x01bd, B:78:0x01df, B:80:0x01e5, B:81:0x01e9, B:83:0x01f3, B:91:0x01f8, B:93:0x01fe, B:94:0x020d, B:98:0x0212, B:99:0x021c, B:101:0x009c, B:103:0x00a4, B:106:0x00af, B:108:0x00b7, B:111:0x00c2, B:113:0x00ca, B:116:0x00d5, B:118:0x00dd, B:124:0x013c, B:126:0x014c, B:127:0x0153, B:159:0x0052), top: B:15:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ad A[Catch: all -> 0x022b, TryCatch #4 {all -> 0x022b, blocks: (B:16:0x003d, B:22:0x0067, B:24:0x006f, B:26:0x007b, B:28:0x0085, B:30:0x008d, B:34:0x00ea, B:35:0x00f1, B:66:0x01a2, B:68:0x01ad, B:70:0x01b3, B:72:0x01bd, B:78:0x01df, B:80:0x01e5, B:81:0x01e9, B:83:0x01f3, B:91:0x01f8, B:93:0x01fe, B:94:0x020d, B:98:0x0212, B:99:0x021c, B:101:0x009c, B:103:0x00a4, B:106:0x00af, B:108:0x00b7, B:111:0x00c2, B:113:0x00ca, B:116:0x00d5, B:118:0x00dd, B:124:0x013c, B:126:0x014c, B:127:0x0153, B:159:0x0052), top: B:15:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static lc.a j(org.json.JSONObject r17, lc.b r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.a.j(org.json.JSONObject, lc.b, java.lang.String, java.lang.String):lc.a");
    }

    public static JSONObject k(Object obj, HashSet hashSet, String str, String str2) {
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            Class<?> cls = obj.getClass();
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
                cls = cls.getSuperclass();
            } while (cls.getName().startsWith(str2));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                field.setAccessible(true);
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        if (!field.getType().getName().equals("interface") && !obj2.getClass().getName().startsWith(str2)) {
                            if (field.getType().getName().equals(f33492a)) {
                                JSONObject jSONObject = (JSONObject) obj2;
                                if (jSONObject.has(str)) {
                                    return jSONObject;
                                }
                            } else {
                                continue;
                            }
                        }
                        JSONObject k10 = k(obj2, hashSet, str, str2);
                        if (k10 != null) {
                            return k10;
                        }
                    }
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static String l(String str, String str2) {
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -1852354744:
                if (str2.equals("html_play")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1052935859:
                if (str2.equals("naitve")) {
                    c10 = 1;
                    break;
                }
                break;
            case -336842123:
                if (str2.equals("html_x3d")) {
                    c10 = 2;
                    break;
                }
                break;
            case 45377598:
                if (str2.equals("html_doctype_write")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 2:
                return n(h.h(str.replace("\\\\\\\\x", "%").replaceAll("\\\\x", "%").replaceAll("\\\\n", "")));
            case 1:
                return str.replace("\\/", "/");
            case 3:
                return n(h.h(str.replace("x22", "\"").replace("x26", ContainerUtils.FIELD_DELIMITER).replace("x27", "'").replace("x3c", "<").replace("x3d", ContainerUtils.KEY_VALUE_DELIMITER).replace("x3e", ">")));
            default:
                return n(h.h(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = ""
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L7c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L7c
            r6 = 0
            r2 = r0
        L9:
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L7c
            if (r6 >= r3) goto L7c
            org.json.JSONObject r3 = r1.optJSONObject(r6)     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L79
            java.lang.String r4 = "action"
            r5 = -1
            int r4 = r3.optInt(r4, r5)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r5 = "param"
            java.lang.String r3 = r3.optString(r5, r0)     // Catch: java.lang.Throwable -> L7c
            r5 = 11
            if (r4 == r5) goto L68
            r5 = 13
            if (r4 == r5) goto L5d
            r5 = 101(0x65, float:1.42E-43)
            if (r4 == r5) goto L52
            r5 = 102(0x66, float:1.43E-43)
            if (r4 == r5) goto L33
            goto L72
        L33:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7c
            if (r4 != 0) goto L79
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = "'"
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "'\\s*:\\s*'(.*?)'"
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            r3 = 1
            java.lang.String r2 = nc.h.f(r3, r7, r2)     // Catch: java.lang.Throwable -> L7c
            goto L72
        L52:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7c
            if (r4 != 0) goto L79
            java.lang.String r2 = nc.h.b.a(r7, r3)     // Catch: java.lang.Throwable -> L7c
            goto L72
        L5d:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7c
            if (r4 != 0) goto L79
            java.lang.String r2 = nc.h.d.b(r7, r3)     // Catch: java.lang.Throwable -> L7c
            goto L72
        L68:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7c
            if (r4 != 0) goto L79
            java.lang.String r2 = nc.h.d.a(r7, r3)     // Catch: java.lang.Throwable -> L7c
        L72:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L79
            return r2
        L79:
            int r6 = r6 + 1
            goto L9
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.a.m(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String n(String str) {
        return str.replaceAll("&amp;", ContainerUtils.FIELD_DELIMITER).replaceAll("&quot;", "\"");
    }
}
