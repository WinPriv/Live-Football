package com.anythink.core.common.e;

import android.text.TextUtils;
import com.anythink.core.c.d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends q {
    public String A;
    public String B;
    public String C;
    public String D;

    /* renamed from: a, reason: collision with root package name */
    public String f5609a;

    /* renamed from: b, reason: collision with root package name */
    public String f5610b;

    /* renamed from: c, reason: collision with root package name */
    public String f5611c;

    /* renamed from: d, reason: collision with root package name */
    public String f5612d;

    /* renamed from: e, reason: collision with root package name */
    public String f5613e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f5614g;

    /* renamed from: h, reason: collision with root package name */
    public String f5615h;

    /* renamed from: i, reason: collision with root package name */
    public String f5616i;

    /* renamed from: j, reason: collision with root package name */
    public String f5617j;

    /* renamed from: k, reason: collision with root package name */
    public String f5618k;

    /* renamed from: l, reason: collision with root package name */
    public String f5619l;

    /* renamed from: m, reason: collision with root package name */
    public String f5620m;

    /* renamed from: n, reason: collision with root package name */
    public String f5621n;
    public String o;

    /* renamed from: p, reason: collision with root package name */
    public String f5622p;

    /* renamed from: q, reason: collision with root package name */
    public String f5623q;

    /* renamed from: r, reason: collision with root package name */
    public String f5624r;

    /* renamed from: s, reason: collision with root package name */
    public String f5625s;

    /* renamed from: t, reason: collision with root package name */
    public String f5626t;

    /* renamed from: u, reason: collision with root package name */
    public String f5627u;

    /* renamed from: v, reason: collision with root package name */
    public String f5628v;

    /* renamed from: w, reason: collision with root package name */
    public String f5629w;

    /* renamed from: x, reason: collision with root package name */
    public String f5630x;
    public String y;

    /* renamed from: z, reason: collision with root package name */
    public String f5631z;

    private h() {
    }

    @Override // com.anythink.core.common.e.q
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", this.f5609a);
            jSONObject.put("requestid", this.f5610b);
            jSONObject.put("unitid", this.f5612d);
            jSONObject.put(com.anythink.core.common.b.e.f4977c, this.f5613e);
            jSONObject.put("sessionid", this.f);
            jSONObject.put("groupid", this.f5614g);
            jSONObject.put("unitgroupid", this.f5615h);
            jSONObject.put("timestamp", this.f5616i);
            jSONObject.put("asid", this.f5617j);
            jSONObject.put("refresh", this.f5618k);
            jSONObject.put("traffic_group_id", this.f5619l);
            jSONObject.put("msg", this.f5620m);
            jSONObject.put("msg1", this.f5621n);
            jSONObject.put("msg2", this.o);
            jSONObject.put("msg3", this.f5622p);
            jSONObject.put("msg4", this.f5623q);
            jSONObject.put("msg5", this.f5624r);
            jSONObject.put("msg6", this.f5625s);
            jSONObject.put("msg7", this.f5626t);
            jSONObject.put("msg8", this.f5627u);
            jSONObject.put("msg9", this.f5628v);
            jSONObject.put("msg10", this.f5629w);
            jSONObject.put("msg11", this.f5630x);
            jSONObject.put("msg12", this.y);
            jSONObject.put("msg13", this.f5631z);
            jSONObject.put(d.a.U, this.C);
            jSONObject.put(com.anythink.core.common.g.c.am, this.D);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public h(String str, String str2) {
        this.A = str;
        this.B = str2;
    }

    public static h a(String str) {
        h hVar = new h();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("key")) {
                    hVar.f5609a = jSONObject.optString("key", "");
                }
                if (jSONObject.has("requestid")) {
                    hVar.f5610b = jSONObject.optString("requestid", "");
                }
                if (jSONObject.has("unitid")) {
                    hVar.f5612d = jSONObject.optString("unitid", "");
                }
                if (jSONObject.has(com.anythink.core.common.b.e.f4977c)) {
                    hVar.f5613e = jSONObject.optString(com.anythink.core.common.b.e.f4977c, "");
                }
                if (jSONObject.has("sessionid")) {
                    hVar.f = jSONObject.optString("sessionid", "");
                }
                if (jSONObject.has("groupid")) {
                    hVar.f5614g = jSONObject.optString("groupid", "");
                }
                if (jSONObject.has("unitgroupid")) {
                    hVar.f5615h = jSONObject.optString("unitgroupid", "");
                }
                if (jSONObject.has("timestamp")) {
                    hVar.f5616i = jSONObject.optString("timestamp", "");
                }
                if (jSONObject.has("asid")) {
                    hVar.f5617j = jSONObject.optString("asid", "");
                }
                if (jSONObject.has("refresh")) {
                    hVar.f5618k = jSONObject.optString("refresh", "");
                }
                if (jSONObject.has("traffic_group_id")) {
                    hVar.f5619l = jSONObject.optString("traffic_group_id", "");
                }
                if (jSONObject.has("msg")) {
                    hVar.f5620m = jSONObject.optString("msg", "");
                }
                if (jSONObject.has("msg1")) {
                    hVar.f5621n = jSONObject.optString("msg1", "");
                }
                if (jSONObject.has("msg2")) {
                    hVar.o = jSONObject.optString("msg2", "");
                }
                if (jSONObject.has("msg3")) {
                    hVar.f5622p = jSONObject.optString("msg3", "");
                }
                if (jSONObject.has("msg4")) {
                    hVar.f5623q = jSONObject.optString("msg4", "");
                }
                if (jSONObject.has("msg5")) {
                    hVar.f5624r = jSONObject.optString("msg5", "");
                }
                if (jSONObject.has("msg6")) {
                    hVar.f5625s = jSONObject.optString("msg6", "");
                }
                if (jSONObject.has("msg7")) {
                    hVar.f5626t = jSONObject.optString("msg7", "");
                }
                if (jSONObject.has("msg8")) {
                    hVar.f5627u = jSONObject.optString("msg8", "");
                }
                if (jSONObject.has("msg9")) {
                    hVar.f5628v = jSONObject.optString("msg9", "");
                }
                if (jSONObject.has("msg10")) {
                    hVar.f5629w = jSONObject.optString("msg10", "");
                }
                if (jSONObject.has("msg11")) {
                    hVar.f5630x = jSONObject.optString("msg11", "");
                }
                if (jSONObject.has("msg12")) {
                    hVar.y = jSONObject.optString("msg12", "");
                }
                if (jSONObject.has("msg13")) {
                    hVar.f5631z = jSONObject.optString("msg13", "");
                }
                if (jSONObject.has(d.a.U)) {
                    hVar.C = jSONObject.optString(d.a.U, "");
                }
                if (jSONObject.has(com.anythink.core.common.g.c.am)) {
                    hVar.D = jSONObject.optString(com.anythink.core.common.g.c.am, "");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return hVar;
    }
}
