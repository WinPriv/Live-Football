package com.anythink.expressad.foundation.g.f.h;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.o;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f10026a = "a";

    /* renamed from: b, reason: collision with root package name */
    public static String f10027b = "d";

    /* renamed from: c, reason: collision with root package name */
    public static String f10028c = "e";

    /* renamed from: d, reason: collision with root package name */
    private static final String f10029d = "b";

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f10030e = new LinkedHashMap();
    private Map<String, com.anythink.expressad.foundation.g.f.c.b> f = new LinkedHashMap();

    public b() {
    }

    private JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f10030e.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.anythink.expressad.foundation.g.f.c.b> entry2 : this.f.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), "UTF-8"), URLEncoder.encode("FILE_NAME_" + entry2.getValue().b().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e10) {
            o.d(f10029d, e10.getMessage());
        }
        return jSONObject;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f10030e.put(str, str2);
    }

    public final Map<String, String> b() {
        return this.f10030e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f10030e.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append('=');
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.anythink.expressad.foundation.g.f.c.b> entry2 : this.f.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry2.getKey(), "UTF-8"));
                sb2.append('=');
                sb2.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().b().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e10) {
            o.d(f10029d, e10.getMessage());
        }
        return sb2.toString();
    }

    private void a(String str, File file, String str2, String str3) {
        if (file != null && file.exists()) {
            if (TextUtils.isEmpty(str2)) {
                str2 = file.getName();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f.put(str, new com.anythink.expressad.foundation.g.f.c.b(str2, file, str2, str3));
            return;
        }
        throw new FileNotFoundException();
    }

    private b(String str, String str2) {
        this.f10030e.put(str, str2);
    }

    private b(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        }
    }

    private void a(Map<String, ?> map) {
        if (map != null) {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    a(entry.getKey(), (String) entry.getValue());
                } else if (value instanceof File) {
                    String key = entry.getKey();
                    File file = (File) entry.getValue();
                    if (file != null && file.exists()) {
                        String name = TextUtils.isEmpty(null) ? file.getName() : null;
                        if (!TextUtils.isEmpty(key)) {
                            this.f.put(key, new com.anythink.expressad.foundation.g.f.c.b(name, file, name, null));
                        }
                    } else {
                        throw new FileNotFoundException();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private b(String... strArr) {
        int length = strArr.length;
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Supplied arguments must be even");
        }
        for (int i10 = 0; i10 < length; i10 += 2) {
            a(strArr[i10], strArr[i10 + 1]);
        }
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f10030e.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return sb2.toString();
    }

    private void a(String str) {
        this.f10030e.remove(str);
        this.f.remove(str);
    }

    private void a(String str, File file) {
        if (file != null && file.exists()) {
            String name = TextUtils.isEmpty(null) ? file.getName() : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f.put(str, new com.anythink.expressad.foundation.g.f.c.b(name, file, name, null));
            return;
        }
        throw new FileNotFoundException();
    }

    private void a(String str, File file, String str2) {
        if (file != null && file.exists()) {
            if (TextUtils.isEmpty(str2)) {
                str2 = file.getName();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f.put(str, new com.anythink.expressad.foundation.g.f.c.b(str2, file, str2, null));
            return;
        }
        throw new FileNotFoundException();
    }
}
