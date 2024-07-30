package com.anythink.expressad.out;

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class k implements com.anythink.expressad.e.b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10491a = 6;

    /* renamed from: b, reason: collision with root package name */
    public static final int f10492b = 7;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10493c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static String f10494d = "CustomInfoManager";

    /* renamed from: e, reason: collision with root package name */
    private static volatile k f10495e;
    private ConcurrentHashMap<String, String> f = new ConcurrentHashMap<>();

    private k() {
    }

    public static k a() {
        if (f10495e == null) {
            synchronized (k.class) {
                if (f10495e == null) {
                    f10495e = new k();
                }
            }
        }
        return f10495e;
    }

    private void a(String str, int i10, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        String a10 = com.anythink.expressad.foundation.h.j.a(str2);
        if (i10 == 6) {
            this.f.put(str + "_bid", a10);
            return;
        }
        if (i10 != 7) {
            if (i10 != 8) {
                return;
            }
            this.f.put(str, a10);
        } else {
            this.f.put(str + "_bidload", a10);
        }
    }

    private String a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (i10 == 6) {
            return this.f.get(str + "_bid");
        }
        if (i10 != 7) {
            return i10 != 8 ? "" : this.f.get(str);
        }
        return this.f.get(str + "_bidload");
    }

    public final String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str2);
            if (parse != null) {
                String host = parse.getHost();
                String path = parse.getPath();
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("bid")) {
                    return a(str, 6);
                }
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("load")) {
                    return a(str, 7);
                }
                if (!TextUtils.isEmpty(path) && path.contains(com.anythink.expressad.foundation.g.a.f9783j)) {
                    return a(str, 8);
                }
            }
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.b(f10494d, "Exception", th);
        }
        return "";
    }
}
