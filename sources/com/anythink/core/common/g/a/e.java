package com.anythink.core.common.g.a;

import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.f;
import com.anythink.core.common.e.o;
import com.anythink.core.common.u;
import com.huawei.openalliance.ad.constant.w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    List<f> f5857a;

    /* renamed from: b, reason: collision with root package name */
    boolean f5858b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5859c = com.anythink.core.c.e.f4869a;

    public e(List<f> list) {
        this.f5857a = list;
    }

    @Override // com.anythink.core.common.g.a.c
    public final void a(String str, String str2, String str3, int i10) {
        if (this.f5858b) {
            return;
        }
        String str4 = str3 + w.bE + i10;
        List<f> list = this.f5857a;
        com.anythink.core.common.j.c.a("tk", str, str2, str4, (String) null, String.valueOf(list != null ? list.size() : 0), "1");
        u.a().a(3, "", "", a(true), o.a(1000));
    }

    @Override // com.anythink.core.common.g.a.c
    public final int c() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a.c
    public final int d() {
        return 3;
    }

    @Override // com.anythink.core.common.g.a.c
    public final byte[] e() {
        List<f> list = this.f5857a;
        if (list != null && list.size() > 0) {
            return c.a(a(false));
        }
        return new byte[0];
    }

    @Override // com.anythink.core.common.g.a.c
    public final boolean f() {
        return this.f5858b;
    }

    @Override // com.anythink.core.common.g.a.c
    public final int h() {
        return 2;
    }

    private String a(boolean z10) {
        JSONObject jSONObject = new JSONObject();
        JSONObject g6 = super.g();
        JSONObject a10 = com.anythink.core.common.g.c.a();
        try {
            g6.put("app_id", n.a().p());
            g6.put(com.anythink.core.common.g.c.T, this.f5843i);
            g6.put(com.anythink.core.common.g.c.V, this.f5844j);
            Iterator<String> keys = a10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                g6.put(next, a10.opt(next));
            }
            Map<String, Object> m10 = n.a().m();
            if (m10 != null && m10.size() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                for (String str : m10.keySet()) {
                    Object obj = m10.get(str);
                    if (obj != null) {
                        jSONObject2.put(str, obj.toString());
                    }
                }
                g6.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        String a11 = com.anythink.core.common.k.c.a(g6.toString());
        JSONArray jSONArray = new JSONArray();
        List<f> list = this.f5857a;
        if (list != null) {
            Iterator<f> it = list.iterator();
            while (it.hasNext()) {
                JSONObject a12 = it.next().a();
                if (z10 && a12 != null) {
                    try {
                        a12.put(com.anythink.core.common.g.c.U, 1);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
                jSONArray.put(a12);
            }
        }
        String a13 = com.anythink.core.common.k.c.a(jSONArray.toString());
        String c10 = com.anythink.core.common.k.f.c(n.a().q() + "api_ver=1.0&common=" + a11 + "&data=" + a13);
        try {
            jSONObject.put(com.anythink.core.common.g.c.Z, a11);
            jSONObject.put("data", a13);
            jSONObject.put(com.anythink.core.common.g.c.O, g.c.f5034a);
            jSONObject.put("sign", c10);
        } catch (Exception unused2) {
        }
        return jSONObject.toString();
    }
}
