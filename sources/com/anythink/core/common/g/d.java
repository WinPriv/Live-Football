package com.anythink.core.common.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5893a = "custom";

    /* renamed from: e, reason: collision with root package name */
    private static final String f5894e = "d";

    /* renamed from: b, reason: collision with root package name */
    long f5895b;

    /* renamed from: c, reason: collision with root package name */
    long f5896c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f5897d = n.a().m();
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private String f5898g;

    /* renamed from: h, reason: collision with root package name */
    private Context f5899h;

    public d(Context context, String str, String str2) {
        this.f = str;
        this.f5898g = str2;
        this.f5899h = context;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.b();
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
        int i10;
        JSONObject e10 = super.e();
        try {
            e10.put("app_id", this.f);
            e10.put("nw_ver", com.anythink.core.common.k.d.h());
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
            JSONObject b10 = c.b();
            if (b10 != null) {
                e10.put("custom", b10);
            }
            if (n.a().b() != null) {
                e10.put("deny", com.anythink.core.common.k.d.o(n.a().g()));
            }
            if (n.a().H()) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            e10.put(c.R, i10);
            if (n.a().v()) {
                e10.put("is_test", 1);
            }
            e10.put(c.ap, com.anythink.core.common.n.a().c());
            com.anythink.core.common.n.a();
            e10.put("pil_offset", com.anythink.core.common.n.b());
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
        return this.f;
    }

    @Override // com.anythink.core.common.g.a
    public final Context i() {
        return this.f5899h;
    }

    @Override // com.anythink.core.common.g.a
    public final String j() {
        return this.f5898g;
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
        com.anythink.core.common.j.c.a("app", adError.getPlatformCode(), adError.getPlatformMSG(), (String) null, "", "", "");
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(int i10, i iVar) {
        this.f5895b = System.currentTimeMillis();
        this.f5896c = SystemClock.elapsedRealtime();
        super.a(i10, iVar);
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        String trim = str.trim();
        try {
            JSONObject jSONObject = new JSONObject(trim);
            if (this.f5897d != null) {
                jSONObject.put("custom", new JSONObject(this.f5897d));
            }
            trim = jSONObject.toString();
        } catch (Exception unused) {
        }
        com.anythink.core.common.j.c.a("app", (String) null, this.f5895b, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f5896c);
        return trim;
    }
}
