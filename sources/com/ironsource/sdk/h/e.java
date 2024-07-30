package com.ironsource.sdk.h;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f26526a;

    public e(JSONObject jSONObject) {
        this.f26526a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final boolean a() {
        return this.f26526a.optBoolean("useCacheDir", false);
    }
}
