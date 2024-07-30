package com.anythink.core.c;

import android.text.TextUtils;
import com.anythink.core.common.k.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: m, reason: collision with root package name */
    private static String f4793m = "ofm_logger";

    /* renamed from: n, reason: collision with root package name */
    private static String f4794n = "ofm_tk_sw";
    private static String o = "ofm_da_sw";

    /* renamed from: p, reason: collision with root package name */
    private static String f4795p = "tk_address";

    /* renamed from: q, reason: collision with root package name */
    private static String f4796q = "tk_max_amount";

    /* renamed from: r, reason: collision with root package name */
    private static String f4797r = "tk_interval";

    /* renamed from: s, reason: collision with root package name */
    private static String f4798s = "da_rt_keys_ft";

    /* renamed from: t, reason: collision with root package name */
    private static String f4799t = "tk_no_t_ft";

    /* renamed from: u, reason: collision with root package name */
    private static String f4800u = "da_not_keys_ft";

    /* renamed from: v, reason: collision with root package name */
    private static String f4801v = "ofm_system";

    /* renamed from: w, reason: collision with root package name */
    private static String f4802w = "ofm_tid";

    /* renamed from: x, reason: collision with root package name */
    private static String f4803x = "ofm_firm_info";
    private static String y = "ofm_st_vt";

    /* renamed from: a, reason: collision with root package name */
    String f4804a = String.valueOf(hashCode());

    /* renamed from: b, reason: collision with root package name */
    public Map<String, Object> f4805b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4806c;

    /* renamed from: d, reason: collision with root package name */
    private int f4807d;

    /* renamed from: e, reason: collision with root package name */
    private int f4808e;
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private int f4809g;

    /* renamed from: h, reason: collision with root package name */
    private int f4810h;

    /* renamed from: i, reason: collision with root package name */
    private String f4811i;

    /* renamed from: j, reason: collision with root package name */
    private int f4812j;

    /* renamed from: k, reason: collision with root package name */
    private long f4813k;

    /* renamed from: l, reason: collision with root package name */
    private Map<String, String> f4814l;

    private Map<String, Object> b(String str) {
        try {
            Map<String, Object> map = this.f4805b;
            if (map != null) {
                return h.c(map.get(str).toString());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private int c() {
        return this.f4808e;
    }

    private int d() {
        return this.f4809g;
    }

    private int e() {
        return this.f4810h;
    }

    private String f() {
        return this.f4811i;
    }

    private int g() {
        return this.f4812j;
    }

    private long h() {
        return this.f4813k;
    }

    private Map<String, String> i() {
        return this.f4814l;
    }

    private String j() {
        return this.f4804a;
    }

    private boolean k() {
        return this.f4806c;
    }

    public final long a() {
        return this.f;
    }

    public static c a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            c cVar = new c();
            JSONObject jSONObject = new JSONObject(str);
            cVar.f4807d = jSONObject.optInt(f4801v);
            cVar.f4808e = jSONObject.optInt(f4802w);
            cVar.f = jSONObject.optLong(y);
            cVar.f4805b = h.c(jSONObject.optString(f4803x));
            JSONObject optJSONObject = jSONObject.optJSONObject(f4793m);
            if (optJSONObject != null) {
                cVar.f4809g = optJSONObject.optInt(f4794n);
                cVar.f4810h = optJSONObject.optInt(o);
                cVar.f4811i = optJSONObject.optString(f4795p);
                cVar.f4812j = optJSONObject.optInt(f4796q);
                cVar.f4813k = optJSONObject.optLong(f4797r);
                try {
                    JSONObject jSONObject2 = new JSONObject(optJSONObject.optString(f4799t));
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.optString(next));
                    }
                    cVar.f4814l = hashMap;
                } catch (Throwable unused) {
                }
            }
            return cVar;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static c c(String str) {
        try {
            c cVar = new c();
            JSONObject jSONObject = new JSONObject(str);
            cVar.f4806c = true;
            cVar.f4807d = jSONObject.optInt(f4801v);
            cVar.f4805b = h.c(jSONObject.optString(f4803x));
            cVar.f4809g = 1;
            cVar.f4810h = 1;
            return cVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private int b() {
        return this.f4807d;
    }
}
