package com.anythink.expressad.videocommon.c;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f12415a;

    /* renamed from: b, reason: collision with root package name */
    private String f12416b;

    private a(String str, String str2) {
        this.f12415a = str;
        this.f12416b = str2;
    }

    private String a() {
        return this.f12415a;
    }

    private String b() {
        return this.f12416b;
    }

    private void a(String str) {
        this.f12415a = str;
    }

    private void b(String str) {
        this.f12416b = str;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
