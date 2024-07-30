package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final d f17930a;

    /* renamed from: b, reason: collision with root package name */
    private final e f17931b;

    /* renamed from: c, reason: collision with root package name */
    private final List<e> f17932c;

    public b(JSONObject jSONObject, MaxAdFormat maxAdFormat, com.applovin.impl.mediation.debugger.b.c.b bVar, p pVar) {
        boolean z10;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f17931b = new e(jSONObject2, pVar);
        } else {
            this.f17931b = null;
        }
        String string = JsonUtils.getString(jSONObject, "name", "");
        String string2 = JsonUtils.getString(jSONObject, "display_name", "");
        if (jSONObject2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17930a = new d(string, string2, z10, bVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f17932c = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f17932c.add(new e(jSONObject3, pVar));
            }
        }
    }

    public d a() {
        return this.f17930a;
    }

    public e b() {
        return this.f17931b;
    }

    public boolean c() {
        if (this.f17931b != null) {
            return true;
        }
        return false;
    }

    public List<e> d() {
        return this.f17932c;
    }
}
