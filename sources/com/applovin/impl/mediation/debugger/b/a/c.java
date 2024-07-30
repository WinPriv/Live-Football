package com.applovin.impl.mediation.debugger.b.a;

import com.anythink.core.common.l;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f17933a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17934b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b> f17935c;

    /* renamed from: d, reason: collision with root package name */
    private final List<b> f17936d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17937e = false;

    public c(JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.b.c.b> map, MaxAdFormat maxAdFormat, p pVar) {
        this.f17933a = JsonUtils.getString(jSONObject, "name", "");
        this.f17934b = JsonUtils.getBoolean(jSONObject, CallMraidJS.f, Boolean.FALSE).booleanValue();
        this.f17935c = a("bidders", jSONObject, map, maxAdFormat, pVar);
        this.f17936d = a("waterfall", jSONObject, map, maxAdFormat, pVar);
    }

    public List<b> a() {
        return this.f17935c;
    }

    public List<b> b() {
        return this.f17936d;
    }

    public boolean c() {
        return this.f17934b;
    }

    public boolean d() {
        return this.f17937e;
    }

    private List<b> a(String str, JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.b.c.b> map, MaxAdFormat maxAdFormat, p pVar) {
        com.applovin.impl.mediation.debugger.b.c.b bVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null && (bVar = map.get(JsonUtils.getString(jSONObject2, l.f6263z, ""))) != null) {
                if (bVar.A()) {
                    this.f17937e = true;
                }
                arrayList.add(new b(jSONObject2, maxAdFormat, bVar, pVar));
            }
        }
        return arrayList;
    }
}
