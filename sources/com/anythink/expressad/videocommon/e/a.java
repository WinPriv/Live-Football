package com.anythink.expressad.videocommon.e;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12422a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12423b = 1000;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Integer> f12424c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, com.anythink.expressad.videocommon.c.c> f12425d;

    /* renamed from: e, reason: collision with root package name */
    private long f12426e;
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private long f12427g;

    /* renamed from: h, reason: collision with root package name */
    private long f12428h;

    /* renamed from: i, reason: collision with root package name */
    private long f12429i;

    /* renamed from: j, reason: collision with root package name */
    private long f12430j;

    private long l() {
        return this.f12426e * 1000;
    }

    private long m() {
        return this.f * 1000;
    }

    private long n() {
        return this.f12430j;
    }

    private static a o() {
        a aVar = new a();
        HashMap hashMap = new HashMap(5);
        hashMap.put("1", 1000);
        hashMap.put("9", 1000);
        hashMap.put("8", 1000);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("1", new com.anythink.expressad.videocommon.c.c("Virtual Item", 1));
        aVar.f12424c = hashMap;
        aVar.f12425d = hashMap2;
        aVar.f12426e = 43200L;
        aVar.f = 5400L;
        aVar.f12427g = com.anythink.expressad.d.a.b.P;
        aVar.f12428h = com.anythink.expressad.d.a.b.P;
        aVar.f12429i = 5L;
        return aVar;
    }

    public final void a() {
        this.f12426e = 43200L;
    }

    public final void b() {
        this.f = 5400L;
    }

    public final long c() {
        return this.f12427g * 1000;
    }

    public final void d() {
        this.f12427g = com.anythink.expressad.d.a.b.P;
    }

    public final long e() {
        return this.f12428h;
    }

    public final void f() {
        this.f12428h = com.anythink.expressad.d.a.b.P;
    }

    public final long g() {
        return this.f12429i;
    }

    public final void h() {
        this.f12429i = 5L;
    }

    public final Map<String, Integer> i() {
        if (this.f12424c == null) {
            HashMap hashMap = new HashMap();
            this.f12424c = hashMap;
            hashMap.put("1", 1000);
            this.f12424c.put("9", 1000);
            this.f12424c.put("8", 1000);
        }
        return this.f12424c;
    }

    public final Map<String, com.anythink.expressad.videocommon.c.c> j() {
        return this.f12425d;
    }

    public final JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f12424c;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f12424c.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put(b.f12431a, jSONObject2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            Map<String, com.anythink.expressad.videocommon.c.c> map2 = this.f12425d;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.anythink.expressad.videocommon.c.c> entry2 : this.f12425d.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.anythink.expressad.videocommon.c.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.a());
                            jSONObject3.put("amount", value.b());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f12426e);
            jSONObject.put(b.f12456x, this.f);
            jSONObject.put("plct", this.f12427g);
            jSONObject.put("dlct", this.f12428h);
            jSONObject.put(b.A, this.f12429i);
            jSONObject.put("current_time", this.f12430j);
            return jSONObject;
        } catch (Exception e12) {
            e12.printStackTrace();
            return jSONObject;
        }
    }

    private void a(long j10) {
        this.f12430j = j10;
    }

    public final void b(Map<String, com.anythink.expressad.videocommon.c.c> map) {
        this.f12425d = map;
    }

    public final void a(Map<String, Integer> map) {
        this.f12424c = map;
    }

    private static a a(String str) {
        a aVar;
        a aVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                aVar = new a();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject(b.f12431a);
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        int optInt = optJSONObject.optInt(next, 1000);
                        if (!TextUtils.isEmpty(next)) {
                            if (!TextUtils.isEmpty(next) && optInt == 0) {
                                hashMap.put(next, 1000);
                            } else {
                                hashMap.put(next, Integer.valueOf(optInt));
                            }
                        }
                    }
                    aVar.f12424c = hashMap;
                }
                aVar.f12425d = com.anythink.expressad.videocommon.c.c.a(jSONObject.optJSONArray("reward"));
                aVar.f12426e = jSONObject.optLong("getpf", 43200L);
                aVar.f = jSONObject.optLong(b.f12456x, 5400L);
                aVar.f12427g = jSONObject.optLong("plct", com.anythink.expressad.d.a.b.P);
                aVar.f12428h = jSONObject.optLong("dlct", com.anythink.expressad.d.a.b.P);
                aVar.f12429i = jSONObject.optLong(b.A, 5L);
                aVar.f12430j = jSONObject.optLong("current_time");
                return aVar;
            } catch (Exception e11) {
                e = e11;
                aVar2 = aVar;
                e.printStackTrace();
                return aVar2;
            }
        }
        return aVar2;
    }
}
