package com.anythink.core.common.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.s;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5916a = "sdk_custom";

    /* renamed from: d, reason: collision with root package name */
    private static final String f5917d = "j";

    /* renamed from: b, reason: collision with root package name */
    long f5918b;

    /* renamed from: c, reason: collision with root package name */
    long f5919c;

    /* renamed from: e, reason: collision with root package name */
    private String f5920e = n.a().r();
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private String f5921g;

    /* renamed from: h, reason: collision with root package name */
    private Context f5922h;

    /* renamed from: i, reason: collision with root package name */
    private String f5923i;

    /* renamed from: j, reason: collision with root package name */
    private String f5924j;

    /* renamed from: k, reason: collision with root package name */
    private String f5925k;

    /* renamed from: l, reason: collision with root package name */
    private Map<String, Object> f5926l;

    /* renamed from: p, reason: collision with root package name */
    private JSONObject f5927p;

    /* renamed from: q, reason: collision with root package name */
    private Map<String, Object> f5928q;

    public j(Context context, String str, String str2, String str3, String str4, Map<String, Object> map, Map<String, Object> map2) {
        this.f5923i = str;
        this.f5924j = str2;
        this.f5922h = context;
        this.f5921g = str3;
        this.f = n.a().g(str3);
        this.f5925k = str4;
        this.f5926l = map;
        this.f5928q = map2;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.c();
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.c.f10012d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        try {
            return g().getBytes(com.anythink.expressad.foundation.g.a.bN);
        } catch (Exception unused) {
            return g().getBytes();
        }
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject e() {
        Object obj;
        JSONObject e10 = super.e();
        try {
            e10.put("app_id", this.f5923i);
            e10.put("pl_id", this.f5921g);
            e10.put(com.anythink.expressad.foundation.g.a.bt, this.f);
            e10.put("nw_ver", com.anythink.core.common.k.d.h());
            e10.put("exclude_myofferid", s.a().a(this.f5922h));
            if (n.a().l() != null) {
                e10.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.EXCLUDE_OFFER, n.a().l());
            }
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
            JSONObject a10 = c.a(this.f5926l);
            if (a10 != null) {
                e10.put("custom", a10);
            }
            if (n.a().b() != null) {
                e10.put("deny", com.anythink.core.common.k.d.o(n.a().g()));
            }
            if (n.a().v()) {
                n.a().w().fillRequestParam(e10);
            }
            e10.put(c.ap, com.anythink.core.common.n.a().c());
            Map<String, Object> map = this.f5928q;
            if (map != null && (obj = map.get(ATAdConst.KEY.CP_PLACEMENT_ID)) != null) {
                e10.put(c.am, obj.toString());
            }
        } catch (JSONException unused) {
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
    public final String h() {
        return this.f5923i;
    }

    @Override // com.anythink.core.common.g.a
    public final Context i() {
        return this.f5922h;
    }

    @Override // com.anythink.core.common.g.a
    public final String j() {
        return this.f5924j;
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
        return 3;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean n() {
        return true;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
        com.anythink.core.common.j.c.a("placement", adError.getPlatformCode(), adError.getPlatformMSG(), (String) null, this.f5921g, "", "");
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(int i10, i iVar) {
        this.f5918b = System.currentTimeMillis();
        this.f5919c = SystemClock.elapsedRealtime();
        super.a(i10, iVar);
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        String trim = str.trim();
        try {
            JSONObject jSONObject = new JSONObject(trim);
            if (this.f5926l != null) {
                jSONObject.put(f5916a, new JSONObject(this.f5926l));
            }
            trim = jSONObject.toString();
        } catch (Exception unused) {
        }
        com.anythink.core.common.j.c.a("placement", this.f5921g, this.f5918b, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f5919c);
        return trim;
    }
}
