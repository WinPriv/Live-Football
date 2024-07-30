package com.anythink.core.common.g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.o;
import com.anythink.core.common.u;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    Context f5860a;

    /* renamed from: b, reason: collision with root package name */
    int f5861b;

    /* renamed from: e, reason: collision with root package name */
    List<String> f5864e;
    int f;

    /* renamed from: g, reason: collision with root package name */
    boolean f5865g = false;

    /* renamed from: c, reason: collision with root package name */
    String f5862c = n.a().p();

    /* renamed from: d, reason: collision with root package name */
    String f5863d = n.a().q();

    public b(Context context, int i10, List<String> list) {
        this.f5860a = context;
        this.f5864e = list;
        this.f5861b = list.size();
        this.f = i10;
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
        if (e10 != null) {
            try {
                e10.put("app_id", this.f5862c);
                e10.put("nw_ver", com.anythink.core.common.k.d.h());
                Map<String, Object> m10 = n.a().m();
                if (m10 != null) {
                    try {
                        if (m10.size() > 0) {
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
                }
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.f5864e;
                if (list != null && list.size() > 0) {
                    for (String str2 : this.f5864e) {
                        if (!TextUtils.isEmpty(str2)) {
                            jSONArray.put(new JSONObject(str2));
                        }
                    }
                }
                e10.put("data", jSONArray);
            } catch (Exception unused2) {
            }
        }
        return e10;
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject f() {
        JSONObject f = super.f();
        if (f != null) {
            try {
                f.put(c.T, this.f);
            } catch (Exception unused) {
            }
        }
        return f;
    }

    @Override // com.anythink.core.common.g.a
    public final String h() {
        return this.f5862c;
    }

    @Override // com.anythink.core.common.g.a
    public final Context i() {
        return this.f5860a;
    }

    @Override // com.anythink.core.common.g.a
    public final String j() {
        return this.f5863d;
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
    public final boolean o() {
        return true;
    }

    public final void p() {
        this.f5865g = true;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.k();
    }

    private static String b(String str) {
        try {
            return URLEncoder.encode(str, com.anythink.expressad.foundation.g.a.bN);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Override // com.anythink.core.common.g.a
    public final void a(int i10, i iVar) {
        if (!TextUtils.isEmpty(b())) {
            super.a(i10, iVar);
        } else if (iVar != null) {
            iVar.onLoadFinish(i10, Integer.valueOf(this.f5861b));
        }
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        return Integer.valueOf(this.f5861b);
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
        if (this.f5865g) {
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
            String g6 = g();
            u.a().a(1, b(), jSONObject2, g6, o.a(1001));
        }
    }
}
