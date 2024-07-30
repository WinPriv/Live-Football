package com.onesignal;

import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: OSPermissionState.java */
/* loaded from: classes2.dex */
public final class m2 implements Cloneable {

    /* renamed from: s, reason: collision with root package name */
    public final d2<Object, m2> f26923s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f26924t;

    public m2() {
        d2<Object, m2> d2Var = new d2<>("changed", false);
        this.f26923s = d2Var;
        ArrayList arrayList = e3.f26746a;
        boolean a10 = OSUtils.a();
        boolean z10 = this.f26924t != a10;
        this.f26924t = a10;
        if (z10) {
            d2Var.a(this);
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("areNotificationsEnabled", this.f26924t);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String toString() {
        return a().toString();
    }
}
