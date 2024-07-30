package com.applovin.impl.mediation.debugger.ui.testmode;

import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final p f18229a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18230b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18231c;

    /* renamed from: d, reason: collision with root package name */
    private String f18232d;

    public c(p pVar) {
        this.f18229a = pVar;
        d<String> dVar = d.J;
        this.f18232d = (String) pVar.b((d<d<String>>) dVar, (d<String>) null);
        pVar.b(dVar);
        if (StringUtils.isValidString(this.f18232d)) {
            this.f18231c = true;
        }
        d<Boolean> dVar2 = d.K;
        this.f18230b = ((Boolean) pVar.b((d<d<Boolean>>) dVar2, (d<Boolean>) Boolean.FALSE)).booleanValue();
        pVar.b(dVar2);
    }

    public boolean a() {
        return this.f18230b;
    }

    public boolean b() {
        return this.f18231c;
    }

    public String c() {
        return this.f18232d;
    }

    public void d() {
        this.f18229a.a((d<d<Boolean>>) d.K, (d<Boolean>) Boolean.TRUE);
    }

    public void a(boolean z10) {
        this.f18231c = z10;
    }

    public void a(String str) {
        this.f18232d = str;
    }

    public void a(JSONObject jSONObject) {
        String b10;
        boolean g6;
        if (this.f18230b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        if (this.f18229a.S() != null) {
            b10 = this.f18229a.Q().d().b();
            g6 = this.f18229a.Q().D();
        } else {
            b10 = this.f18229a.R().k().b();
            g6 = this.f18229a.R().g();
        }
        this.f18230b = JsonUtils.containsCaseInsensitiveString(b10, jSONArray) || g6 || AppLovinSdkUtils.isEmulator();
    }
}
