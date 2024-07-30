package com.anythink.expressad.videocommon.c;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f12417a;

    /* renamed from: b, reason: collision with root package name */
    private int f12418b;

    /* renamed from: c, reason: collision with root package name */
    private a f12419c;

    public b(int i10, int i11, a aVar) {
        this.f12417a = i10;
        this.f12418b = i11;
        this.f12419c = aVar;
    }

    private a c() {
        return this.f12419c;
    }

    public final int a() {
        return this.f12417a;
    }

    public final int b() {
        return this.f12418b;
    }

    private void a(int i10) {
        this.f12417a = i10;
    }

    private void b(int i10) {
        this.f12418b = i10;
    }

    private void a(a aVar) {
        this.f12419c = aVar;
    }

    public static List<b> a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    int optInt = optJSONObject.optInt("id");
                    int optInt2 = optJSONObject.optInt("timeout");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                    arrayList.add(new b(optInt, optInt2, optJSONObject2 != null ? a.a(optJSONObject2) : null));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}
