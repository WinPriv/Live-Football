package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements Comparable<a> {

    /* renamed from: a, reason: collision with root package name */
    private final String f17925a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17926b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f17927c;

    /* renamed from: d, reason: collision with root package name */
    private final c f17928d;

    /* renamed from: e, reason: collision with root package name */
    private final List<c> f17929e;

    public a(JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.b.c.b> map, p pVar) {
        this.f17925a = JsonUtils.getString(jSONObject, "name", "");
        this.f17926b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f17927c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f17929e = new ArrayList(jSONArray.length());
        c cVar = null;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                c cVar2 = new c(jSONObject2, map, this.f17927c, pVar);
                this.f17929e.add(cVar2);
                if (cVar == null && cVar2.c()) {
                    cVar = cVar2;
                }
            }
        }
        this.f17928d = cVar;
    }

    private c g() {
        if (!this.f17929e.isEmpty()) {
            return this.f17929e.get(0);
        }
        return null;
    }

    public String a() {
        return this.f17925a;
    }

    public String b() {
        return this.f17926b;
    }

    public String c() {
        MaxAdFormat maxAdFormat = this.f17927c;
        if (maxAdFormat != null) {
            return maxAdFormat.getLabel();
        }
        return "Unknown";
    }

    public MaxAdFormat d() {
        return this.f17927c;
    }

    public c e() {
        c cVar = this.f17928d;
        if (cVar == null) {
            return g();
        }
        return cVar;
    }

    public String f() {
        return "\n---------- " + this.f17926b + " ----------\nIdentifier - " + this.f17925a + "\nFormat     - " + c();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return this.f17926b.compareToIgnoreCase(aVar.f17926b);
    }
}
