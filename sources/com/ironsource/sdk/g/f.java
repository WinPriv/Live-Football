package com.ironsource.sdk.g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f26517d;

    public f() {
        this.f26517d = new JSONObject();
    }

    public final int a(String str, int i10) {
        return this.f26517d.optInt(str, 0);
    }

    public final Object b(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (!(obj instanceof JSONObject)) {
            return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
        }
        JSONObject jSONObject = (JSONObject) obj;
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, b(jSONObject.get(next)));
        }
        return hashMap;
    }

    public final Object c(String str) {
        try {
            return this.f26517d.get(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String d(String str) {
        try {
            return this.f26517d.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean e(String str) {
        try {
            return this.f26517d.getBoolean(str);
        } catch (JSONException unused) {
            return false;
        }
    }

    public String toString() {
        JSONObject jSONObject = this.f26517d;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toString();
    }

    public f(String str) {
        try {
            this.f26517d = new JSONObject(str);
        } catch (Exception unused) {
            this.f26517d = new JSONObject();
        }
    }

    public final List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(b(jSONArray.get(i10)));
        }
        return arrayList;
    }

    public final void a(String str, String str2) {
        try {
            this.f26517d.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public final boolean b(String str) {
        return this.f26517d.isNull(str);
    }

    public final void a(String str, JSONObject jSONObject) {
        try {
            this.f26517d.put(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    public final boolean a(String str) {
        return this.f26517d.has(str);
    }
}
