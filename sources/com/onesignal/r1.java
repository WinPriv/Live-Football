package com.onesignal;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OSInAppMessageTag.java */
/* loaded from: classes2.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27004a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27005b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27006c;

    public r1(JSONObject jSONObject) {
        this.f27005b = jSONObject.has("adds") ? jSONObject.getJSONObject("adds") : null;
        this.f27006c = jSONObject.has("removes") ? jSONObject.getJSONArray("removes") : null;
    }

    public final String toString() {
        switch (this.f27004a) {
            case 0:
                return "OSInAppMessageTag{adds=" + ((JSONObject) this.f27005b) + ", removes=" + ((JSONArray) this.f27006c) + '}';
            default:
                return super.toString();
        }
    }

    public r1(Context context, String str) {
        this.f27005b = context;
        this.f27006c = str;
    }
}
