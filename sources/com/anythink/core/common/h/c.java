package com.anythink.core.common.h;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.e;
import com.anythink.core.common.i;
import com.anythink.core.common.k.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes.dex */
public final class c extends com.anythink.core.common.g.a {

    /* renamed from: b, reason: collision with root package name */
    private Context f6001b;

    /* renamed from: c, reason: collision with root package name */
    private int f6002c;
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private e f6005g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.core.c.d f6006h;

    /* renamed from: a, reason: collision with root package name */
    boolean f6000a = false;

    /* renamed from: d, reason: collision with root package name */
    private String f6003d = n.a().p();

    /* renamed from: e, reason: collision with root package name */
    private String f6004e = n.a().q();

    public c(Context context, int i10, String str, e eVar, com.anythink.core.c.d dVar) {
        this.f6001b = context;
        this.f6002c = i10;
        this.f6005g = eVar;
        this.f6006h = dVar;
        this.f = str;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        i.a();
        return i.i();
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
        return com.anythink.core.common.g.a.c(g());
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject e() {
        JSONObject e10 = super.e();
        JSONObject f = super.f();
        try {
            e10.put("app_id", this.f6003d);
            Iterator<String> keys = f.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                e10.put(next, f.opt(next));
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
        StringBuilder sb2 = new StringBuilder();
        e0.i.o(sb2, this.f6004e, "api_ver=1.0&common=", a10, "&data=");
        sb2.append(this.f);
        sb2.append("&ss_a=");
        sb2.append(this.f6002c);
        String c10 = f.c(sb2.toString());
        try {
            jSONObject.put(com.anythink.core.common.g.c.Z, a10);
            jSONObject.put("ss_a", this.f6002c);
            jSONObject.put("data", this.f);
            jSONObject.put(com.anythink.core.common.g.c.O, g.c.f5034a);
            jSONObject.put("sign", c10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.g.a
    public final String h() {
        return this.f6003d;
    }

    @Override // com.anythink.core.common.g.a
    public final Context i() {
        return this.f6001b;
    }

    @Override // com.anythink.core.common.g.a
    public final String j() {
        return this.f6004e;
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
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
        try {
            if (!ErrorCode.httpStatuException.equals(adError.getCode())) {
                if (this.f6000a) {
                    com.anythink.core.common.j.c.a(this.f6005g, this.f6006h, adError.getPlatformCode(), adError.getPlatformMSG());
                    return;
                } else {
                    this.f6000a = true;
                    com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.h.c.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c cVar = c.this;
                            cVar.a(0, ((com.anythink.core.common.g.a) cVar).f5823m);
                        }
                    }, com.anythink.expressad.exoplayer.f.f7962a);
                    return;
                }
            }
            com.anythink.core.common.j.c.a(this.f6005g, this.f6006h, adError.getPlatformCode(), adError.getPlatformMSG());
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        return str.trim();
    }
}
