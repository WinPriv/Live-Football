package com.anythink.basead.g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.n;
import com.anythink.core.common.c.k;
import com.anythink.core.common.e.j;
import com.anythink.core.common.g.g;
import com.anythink.core.common.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes.dex */
public final class a extends com.anythink.core.common.g.a {

    /* renamed from: a, reason: collision with root package name */
    String f4012a;

    /* renamed from: b, reason: collision with root package name */
    String f4013b;

    /* renamed from: c, reason: collision with root package name */
    String f4014c;

    /* renamed from: d, reason: collision with root package name */
    int f4015d;

    /* renamed from: e, reason: collision with root package name */
    int f4016e;
    String f;

    /* renamed from: g, reason: collision with root package name */
    String f4017g;

    public a(j jVar) {
        this.f4012a = jVar.f5653a;
        this.f4013b = jVar.f5656d;
        this.f4014c = jVar.f5654b;
        this.f4015d = jVar.f5659h;
        this.f4016e = jVar.f5660i;
        this.f = jVar.f5662k;
        this.f4017g = jVar.f5663l;
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
        try {
            return g().getBytes(com.anythink.expressad.foundation.g.a.bN);
        } catch (Exception unused) {
            return g().getBytes();
        }
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject e() {
        JSONObject e10 = super.e();
        try {
            e10.put("app_id", n.a().p());
            e10.put("pl_id", this.f4014c);
            e10.put(com.anythink.expressad.foundation.g.a.bt, n.a().g(this.f4014c));
            e10.put("t_g_id", this.f4015d);
            e10.put("gro_id", this.f4016e);
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
            JSONObject a10 = com.anythink.core.common.g.c.a(this.f4014c);
            if (a10 != null) {
                e10.put("customs", a10);
            }
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
        String a10 = com.anythink.core.common.k.c.a(e().toString());
        String a11 = com.anythink.core.common.k.c.a(f().toString());
        hashMap.put(com.anythink.core.common.g.c.W, a10);
        hashMap.put(com.anythink.core.common.g.c.X, a11);
        hashMap.put("request_id", this.f4013b);
        hashMap.put(k.a.f5344b, this.f4012a);
        return new JSONObject(hashMap).toString();
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
    public final Object a(String str) {
        return str;
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        if (!TextUtils.isEmpty(this.f4017g)) {
            return this.f4017g;
        }
        i.a();
        return i.f();
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(int i10, Object obj) {
        if (obj == null) {
            a(i10, g.f5913j, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", ""));
            return;
        }
        try {
            if (TextUtils.isEmpty(new JSONObject(obj.toString()).optString("data"))) {
                a(i10, g.f5914k, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
            } else {
                super.a(i10, obj);
            }
        } catch (Throwable unused) {
            a(i10, g.f5915l, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
        }
    }
}
