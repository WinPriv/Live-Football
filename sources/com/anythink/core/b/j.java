package com.anythink.core.b;

import com.anythink.core.common.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j implements Comparable<j> {

    /* renamed from: a, reason: collision with root package name */
    int f4666a;

    /* renamed from: b, reason: collision with root package name */
    String f4667b;

    /* renamed from: c, reason: collision with root package name */
    double f4668c;

    /* renamed from: d, reason: collision with root package name */
    String f4669d;

    private double a() {
        return this.f4668c;
    }

    private String b() {
        return this.f4667b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(j jVar) {
        if (this.f4666a < jVar.f4666a) {
            return -1;
        }
        return 1;
    }

    private void a(double d10) {
        this.f4668c = d10;
    }

    public static j a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            j jVar = new j();
            jVar.f4666a = jSONObject.optInt("prority");
            jVar.f4667b = jSONObject.optString("ad_source_id");
            if (jSONObject.has(l.am)) {
                jVar.f4668c = jSONObject.optDouble(l.am);
            } else if (jSONObject.has("price")) {
                jVar.f4668c = jSONObject.optDouble("price");
            } else {
                jVar.f4668c = 0.0d;
            }
            jVar.f4669d = jSONObject.optString("tp_bid_id");
            return jVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private int a(j jVar) {
        return this.f4666a < jVar.f4666a ? -1 : 1;
    }
}
