package com.applovin.impl.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends d {

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f17287c;

    public g(JSONObject jSONObject, p pVar) {
        super(jSONObject, pVar);
    }

    public void a(Map<String, String> map) {
        this.f17287c = map;
    }

    public String e() {
        return JsonUtils.getString(this.f17273b, "name", null);
    }

    public Map<String, String> f() {
        return this.f17287c;
    }

    @Override // com.applovin.impl.b.a.d
    public String toString() {
        return "ConsentFlowState{id=" + a() + "type=" + b() + "isInitialState=" + c() + "name=" + e() + "}";
    }
}
