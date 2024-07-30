package com.anythink.basead.g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.j;
import com.anythink.core.common.g.g;
import com.anythink.core.common.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes.dex */
public final class d extends com.anythink.core.common.g.a {

    /* renamed from: a, reason: collision with root package name */
    String f4022a;

    /* renamed from: b, reason: collision with root package name */
    String f4023b;

    /* renamed from: c, reason: collision with root package name */
    String f4024c;

    /* renamed from: d, reason: collision with root package name */
    int f4025d;

    /* renamed from: e, reason: collision with root package name */
    int f4026e;
    int f;

    /* renamed from: g, reason: collision with root package name */
    int f4027g;

    /* renamed from: h, reason: collision with root package name */
    String[] f4028h;

    /* renamed from: i, reason: collision with root package name */
    int f4029i;

    /* renamed from: j, reason: collision with root package name */
    int f4030j;

    /* renamed from: k, reason: collision with root package name */
    String f4031k;

    /* renamed from: l, reason: collision with root package name */
    String f4032l = "OnlineOfferLoader";

    public d(j jVar, int i10, int i11, String[] strArr, String str) {
        this.f4022a = jVar.f5656d;
        this.f4023b = jVar.f5654b;
        this.f4024c = jVar.f5655c;
        this.f4029i = jVar.f5657e;
        this.f = i10;
        this.f4027g = i11;
        this.f4028h = strArr;
        this.f4025d = jVar.f5659h;
        this.f4026e = jVar.f5660i;
        this.f4030j = jVar.f5661j;
        this.f4031k = str;
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
            e10.put("pl_id", this.f4023b);
            e10.put(com.anythink.expressad.foundation.g.a.bt, n.a().g(this.f4023b));
            e10.put("t_g_id", this.f4025d);
            e10.put("gro_id", this.f4026e);
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
            e10.put(com.anythink.core.common.g.c.ap, com.anythink.core.common.n.a().c());
            JSONObject a10 = com.anythink.core.common.g.c.a(this.f4023b);
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
        String a10 = com.anythink.core.common.k.c.a(e().toString());
        String a11 = com.anythink.core.common.k.c.a(f().toString());
        hashMap.put(com.anythink.core.common.g.c.W, a10);
        hashMap.put(com.anythink.core.common.g.c.X, a11);
        hashMap.put("request_id", this.f4022a);
        hashMap.put("ad_source_id", Integer.valueOf(Integer.parseInt(this.f4024c)));
        hashMap.put(com.anythink.expressad.a.f6561g, Integer.valueOf(this.f4029i));
        String[] strArr = this.f4028h;
        char c10 = 0;
        if (strArr != null && strArr.length > 0) {
            JSONArray jSONArray = new JSONArray();
            for (String str : this.f4028h) {
                jSONArray.put(str);
            }
            hashMap.put("exclude_offers", jSONArray);
        }
        if (n.a().l() != null) {
            hashMap.put(com.anythink.core.b.a.a.f4548c, com.anythink.core.common.k.c.a(n.a().l().toString()));
        }
        int i10 = this.f;
        if (i10 > 0 && this.f4027g > 0) {
            hashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, Integer.valueOf(i10));
            hashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, Integer.valueOf(this.f4027g));
        }
        JSONObject jSONObject = new JSONObject(hashMap);
        try {
            String valueOf = String.valueOf(this.f4030j);
            switch (valueOf.hashCode()) {
                case 49:
                    if (valueOf.equals("1")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 50:
                    if (valueOf.equals("2")) {
                        break;
                    }
                    c10 = 65535;
                    break;
                case 51:
                    if (valueOf.equals("3")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 52:
                    if (valueOf.equals("4")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 == 0 || c10 == 1 || c10 == 2 || c10 == 3) {
                jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ADP_ACCEPT_TYPE, new JSONArray(ATAdConst.AD_SUPPORT_TYPE_ARRAY));
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
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
        i.a();
        return i.h();
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
                a(i10, g.f5914k, obj.toString(), ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
            } else {
                super.a(i10, obj);
            }
        } catch (Throwable unused) {
            a(i10, g.f5915l, obj.toString(), ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
        }
    }
}
