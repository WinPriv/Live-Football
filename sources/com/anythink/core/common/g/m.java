package com.anythink.core.common.g;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.o;
import com.anythink.core.common.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes.dex */
public class m extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5932a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5933b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5934c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5935d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5936e = 5;
    public static final int f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5937g = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5938h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5939i = 9;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5940j = 10;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5941k = 11;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5942l = 12;

    /* renamed from: p, reason: collision with root package name */
    public static final int f5943p = 13;

    /* renamed from: q, reason: collision with root package name */
    public static final int f5944q = 15;

    /* renamed from: r, reason: collision with root package name */
    public static final int f5945r = 16;

    /* renamed from: s, reason: collision with root package name */
    public static final int f5946s = 18;

    /* renamed from: t, reason: collision with root package name */
    public static final int f5947t = 19;

    /* renamed from: u, reason: collision with root package name */
    public static final int f5948u = 20;

    /* renamed from: v, reason: collision with root package name */
    public static final int f5949v = 21;

    /* renamed from: x, reason: collision with root package name */
    private static final String f5950x = "m";
    private List<com.anythink.core.common.e.f> B;
    private com.anythink.core.common.e.f C;
    private int D;
    private Context y;

    /* renamed from: w, reason: collision with root package name */
    boolean f5951w = false;

    /* renamed from: z, reason: collision with root package name */
    private String f5952z = n.a().p();
    private String A = n.a().q();

    public m(Context context, int i10, List<com.anythink.core.common.e.f> list) {
        this.y = context;
        this.D = i10;
        this.B = list;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        com.anythink.core.common.e.f fVar = this.C;
        if (fVar != null) {
            return fVar.f5605b.ao;
        }
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.j();
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpConnection.CONTENT_ENCODING, com.anythink.expressad.foundation.g.f.g.c.f10012d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        return a.c(g());
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject e() {
        JSONObject e10 = super.e();
        JSONObject f10 = super.f();
        try {
            e10.put("app_id", this.f5952z);
            e10.put(c.T, this.D);
            Iterator<String> keys = f10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                e10.put(next, f10.opt(next));
            }
            Map<String, Object> m10 = n.a().m();
            if (m10 != null && m10.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (String str : m10.keySet()) {
                    Object obj = m10.get(str);
                    if (obj != null) {
                        jSONObject.put(str, obj.toString());
                    }
                }
                e10.put("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
        return e10;
    }

    @Override // com.anythink.core.common.g.a
    public final String g() {
        JSONObject jSONObject = new JSONObject();
        String a10 = com.anythink.core.common.k.c.a(e().toString());
        JSONArray jSONArray = new JSONArray();
        List<com.anythink.core.common.e.f> list = this.B;
        if (list != null) {
            Iterator<com.anythink.core.common.e.f> it = list.iterator();
            while (it.hasNext()) {
                JSONObject a11 = it.next().a();
                a(a11);
                jSONArray.put(a11);
            }
        } else {
            com.anythink.core.common.e.f fVar = this.C;
            if (fVar != null) {
                JSONObject a12 = fVar.a();
                a(a12);
                jSONArray.put(a12);
            }
        }
        String a13 = com.anythink.core.common.k.c.a(jSONArray.toString());
        StringBuilder sb2 = new StringBuilder();
        e0.i.o(sb2, this.A, "api_ver=1.0&common=", a10, "&data=");
        sb2.append(a13);
        String c10 = com.anythink.core.common.k.f.c(sb2.toString());
        try {
            jSONObject.put(c.Z, a10);
            jSONObject.put("data", a13);
            jSONObject.put(c.O, g.c.f5034a);
            jSONObject.put("sign", c10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.g.a
    public final String h() {
        return this.f5952z;
    }

    @Override // com.anythink.core.common.g.a
    public final Context i() {
        return this.y;
    }

    @Override // com.anythink.core.common.g.a
    public final String j() {
        return this.A;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return g.c.f5034a;
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, Object> l() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final int m() {
        return 2;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean o() {
        return true;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }

    private void a(JSONObject jSONObject) {
        if (!this.f5951w || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(c.U, 1);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
        List<com.anythink.core.common.e.f> list = this.B;
        com.anythink.core.common.j.c.a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), b(), (String) null, String.valueOf(list != null ? list.size() : 1), "0");
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        return str.trim();
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> c10 = c();
        if (c10 != null) {
            try {
                for (String str : c10.keySet()) {
                    jSONObject.put(str, c10.get(str));
                }
            } catch (Exception unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        this.f5951w = true;
        String g6 = g();
        this.f5951w = false;
        u.a().a(1, b(), jSONObject2, g6, o.a(1000));
    }
}
