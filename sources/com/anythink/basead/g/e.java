package com.anythink.basead.g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.k;
import com.anythink.core.common.t;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.anythink.core.common.g.a {
    private static String f = "e";

    /* renamed from: a, reason: collision with root package name */
    int f4033a;

    /* renamed from: b, reason: collision with root package name */
    String f4034b;

    /* renamed from: c, reason: collision with root package name */
    aa f4035c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f4036d;

    /* renamed from: e, reason: collision with root package name */
    boolean f4037e = false;

    public e(int i10, String str, aa aaVar, Map<String, Object> map) {
        this.f4033a = i10;
        this.f4034b = str;
        this.f4035c = aaVar;
        this.f4036d = map;
    }

    private void p() {
        String jSONObject;
        try {
            jSONObject = new JSONObject(c()).toString();
        } catch (Throwable unused) {
            jSONObject = new JSONObject().toString();
        }
        t.a().a(this.o, jSONObject, this.f4035c.O());
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 2;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        if (this.f4035c != null) {
            HashMap hashMap = new HashMap();
            k k10 = this.f4035c.k();
            if (k10 != null && com.anythink.basead.a.b.a(this.f4033a, k10)) {
                String i10 = com.anythink.core.common.k.d.i();
                if (!TextUtils.isEmpty(i10)) {
                    hashMap.put("User-Agent", i10);
                }
            }
            return hashMap;
        }
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        return new byte[0];
    }

    @Override // com.anythink.core.common.g.a
    public final String g() {
        return "";
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

    @Override // com.anythink.core.common.g.a
    public final String b() {
        if (this.f4036d != null && !TextUtils.isEmpty(this.f4034b)) {
            try {
                for (Map.Entry<String, Object> entry : this.f4036d.entrySet()) {
                    String key = entry.getKey();
                    this.f4034b = this.f4034b.replaceAll("\\{" + key + "\\}", (String) entry.getValue());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this.f4034b;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }

    public final void a(boolean z10) {
        this.f4037e = z10;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(int i10) {
        String jSONObject;
        if (this.f4037e) {
            t.a();
            if (t.a(i10)) {
                try {
                    jSONObject = new JSONObject(c()).toString();
                } catch (Throwable unused) {
                    jSONObject = new JSONObject().toString();
                }
                t.a().a(this.o, jSONObject, this.f4035c.O());
            }
        }
    }
}
