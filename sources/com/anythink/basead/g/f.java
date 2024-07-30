package com.anythink.basead.g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.o;
import com.anythink.core.common.i;
import com.anythink.core.common.u;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes.dex */
public final class f extends com.anythink.core.common.g.a {

    /* renamed from: a, reason: collision with root package name */
    String f4038a;

    /* renamed from: b, reason: collision with root package name */
    JSONObject f4039b;

    /* renamed from: c, reason: collision with root package name */
    int f4040c;

    /* renamed from: d, reason: collision with root package name */
    String f4041d;

    /* renamed from: e, reason: collision with root package name */
    aa f4042e;
    Map<String, Object> f;

    public f(int i10, aa aaVar, String str, Map<String, Object> map) {
        this.f4040c = i10;
        this.f4042e = aaVar;
        this.f = map;
        this.f4041d = str;
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
        k k10;
        HashMap hashMap = new HashMap();
        hashMap.put(HttpConnection.CONTENT_ENCODING, com.anythink.expressad.foundation.g.f.g.c.f10012d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        aa aaVar = this.f4042e;
        if (aaVar != null && (k10 = aaVar.k()) != null && com.anythink.basead.a.b.a(this.f4040c, k10)) {
            String i10 = com.anythink.core.common.k.d.i();
            if (!TextUtils.isEmpty(i10)) {
                hashMap.put("User-Agent", i10);
            }
        }
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        return com.anythink.core.common.g.a.c(this.f4039b.toString());
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
    public final Object a(String str) {
        return null;
    }

    public final void b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f4039b.put("scenario", str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
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
        JSONObject jSONObject3 = this.f4039b;
        String jSONObject4 = jSONObject3 != null ? jSONObject3.toString() : "";
        u.a().a(1, b(), jSONObject2, jSONObject4, o.a(1000));
        com.anythink.core.common.j.c.a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), this.f4038a, "", "1", "");
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        try {
            if (!TextUtils.isEmpty(this.f4041d)) {
                this.f4039b = new JSONObject(this.f4041d);
                for (Map.Entry<String, Object> entry : this.f.entrySet()) {
                    this.f4039b.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        i.a();
        String g6 = i.g();
        this.f4038a = g6;
        return g6;
    }
}
