package com.anythink.core.b.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.c.d;
import com.anythink.core.c.e;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.c;
import com.anythink.core.common.p;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends com.anythink.core.common.g.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4546a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f4547b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final String f4548c = "ex_pkg";

    /* renamed from: d, reason: collision with root package name */
    public static final String f4549d = "unit_ids";

    /* renamed from: e, reason: collision with root package name */
    String f4550e;
    String f;

    /* renamed from: g, reason: collision with root package name */
    String f4551g;

    /* renamed from: h, reason: collision with root package name */
    String f4552h;

    /* renamed from: i, reason: collision with root package name */
    String f4553i;

    /* renamed from: j, reason: collision with root package name */
    String f4554j;

    /* renamed from: k, reason: collision with root package name */
    String f4555k;

    /* renamed from: l, reason: collision with root package name */
    int f4556l;

    /* renamed from: p, reason: collision with root package name */
    int f4557p;

    /* renamed from: q, reason: collision with root package name */
    int f4558q;

    /* renamed from: r, reason: collision with root package name */
    String f4559r;

    /* renamed from: s, reason: collision with root package name */
    String f4560s;

    /* renamed from: t, reason: collision with root package name */
    String f4561t;

    /* renamed from: u, reason: collision with root package name */
    private int f4562u;

    /* renamed from: v, reason: collision with root package name */
    private final String f4563v = d.a.f4854j;

    /* renamed from: w, reason: collision with root package name */
    private final String f4564w = "request_id";

    /* renamed from: x, reason: collision with root package name */
    private final String f4565x = "ch_info";
    private final String y = "wf";

    /* renamed from: z, reason: collision with root package name */
    private final String f4566z = "np";
    private final String A = "hb_size";
    private final String B = "last_wf";
    private final String C = "co";
    private final String D = d.a.T;
    private final String E = "debug";

    public a(String str, String str2, String str3, List<JSONObject> list, int i10) {
        this.f4550e = str3;
        this.f4552h = str;
        this.f4553i = str2;
        this.f4562u = i10;
        JSONArray jSONArray = new JSONArray();
        Iterator<JSONObject> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.f = c.a(jSONArray.toString().getBytes());
        d a10 = e.a(n.a().g()).a(str2);
        if (a10 != null) {
            this.f4556l = a10.O();
            this.f4557p = a10.ae();
        }
    }

    private void d(int i10) {
        this.f4558q = i10;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        if (this.f4562u == 0) {
            hashMap.put("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.c.f10012d);
        }
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject e() {
        JSONObject e10 = super.e();
        try {
            e10.put("app_id", n.a().p());
            e10.put("pl_id", this.f4553i);
            e10.put(com.anythink.expressad.foundation.g.a.bt, n.a().g(this.f4553i));
            e10.put("t_g_id", this.f4556l);
            e10.put("gro_id", this.f4557p);
            String y = n.a().y();
            if (!TextUtils.isEmpty(y)) {
                e10.put("sy_id", y);
            }
            String z10 = n.a().z();
            if (!TextUtils.isEmpty(z10)) {
                e10.put("bk_id", z10);
            } else {
                n.a().j(n.a().x());
                e10.put("bk_id", n.a().x());
            }
            if (n.a().b() != null) {
                e10.put("deny", com.anythink.core.common.k.d.o(n.a().g()));
            }
            if (this.f4562u == 0) {
                e10.put("misk_spt", p.a().c());
                p.a();
                e10.put("misk_pt_det", p.b());
            }
            e10.put(com.anythink.core.common.g.c.ap, com.anythink.core.common.n.a().c());
            JSONObject a10 = com.anythink.core.common.g.c.a(this.f4553i);
            if (a10 != null) {
                e10.put("customs", a10);
            }
            com.anythink.core.common.g.c.a(e10);
        } catch (Exception unused) {
        }
        return e10;
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject f() {
        JSONObject f = super.f();
        try {
            if (n.a().b() != null) {
                f.put("btts", com.anythink.core.common.k.d.g());
            }
        } catch (JSONException unused) {
        }
        return f;
    }

    @Override // com.anythink.core.common.g.a
    public final String g() {
        HashMap hashMap = new HashMap();
        String a10 = c.a(e().toString());
        String a11 = c.a(f().toString());
        hashMap.put(com.anythink.core.common.g.c.W, a10);
        hashMap.put(com.anythink.core.common.g.c.X, a11);
        hashMap.put(d.a.f4854j, this.f);
        hashMap.put("request_id", this.f4550e);
        int i10 = this.f4558q;
        if (i10 > 0) {
            hashMap.put("hb_size", Integer.valueOf(i10));
        }
        if (this.f4562u == 0) {
            if (!TextUtils.isEmpty(this.f4551g)) {
                hashMap.put("ch_info", this.f4551g);
            }
            if (!TextUtils.isEmpty(this.f4554j)) {
                hashMap.put("wf", this.f4554j);
            }
            if (!TextUtils.isEmpty(this.f4555k)) {
                hashMap.put("np", this.f4555k);
            }
            if (!TextUtils.isEmpty(this.f4559r)) {
                hashMap.put("last_wf", this.f4559r);
            }
            if (!TextUtils.isEmpty(this.f4560s)) {
                hashMap.put("co", this.f4560s);
            }
            hashMap.put(d.a.T, this.f4561t);
            if (n.a().l() != null) {
                hashMap.put(f4548c, c.a(n.a().l().toString()));
            }
            if (n.a().A() && n.a().u()) {
                hashMap.put("debug", 1);
            }
        }
        Set<String> keySet = hashMap.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : keySet) {
                jSONObject.put(str, hashMap.get(str));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    @Override // com.anythink.core.common.g.a
    public final String h() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String j() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return null;
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
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        return this.f4552h;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        return g().getBytes();
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }

    private void a(String str, String str2, String str3) {
        if (str != null) {
            this.f4551g = c.a(str.getBytes());
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(ContentRecord.XRINFOLIST_NULL, str2)) {
            this.f4554j = c.a(str2.getBytes());
        }
        if (TextUtils.isEmpty(str3) || TextUtils.equals(ContentRecord.XRINFOLIST_NULL, str3)) {
            return;
        }
        this.f4555k = c.a(str3.getBytes());
    }

    public final void a(b bVar) {
        String str = bVar.f4567a;
        if (str != null) {
            this.f4551g = c.a(str.getBytes());
        }
        this.f4558q = bVar.f;
        if (!TextUtils.isEmpty(bVar.f4568b) && !TextUtils.equals(ContentRecord.XRINFOLIST_NULL, bVar.f4568b)) {
            this.f4554j = c.a(bVar.f4568b.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f4569c) && !TextUtils.equals(ContentRecord.XRINFOLIST_NULL, bVar.f4569c)) {
            this.f4555k = c.a(bVar.f4569c.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f4570d) && !TextUtils.equals(ContentRecord.XRINFOLIST_NULL, bVar.f4570d)) {
            this.f4559r = c.a(bVar.f4570d.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f4571e) && !TextUtils.equals(ContentRecord.XRINFOLIST_NULL, bVar.f4571e)) {
            this.f4560s = c.a(bVar.f4571e.getBytes());
        }
        this.f4561t = "";
        if (TextUtils.isEmpty(bVar.f4572g)) {
            return;
        }
        this.f4561t = c.a(bVar.f4572g.getBytes());
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
