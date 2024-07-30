package com.anythink.expressad.foundation.c.a;

import com.anythink.expressad.foundation.g.a.d;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private d f9423a;

    /* renamed from: com.anythink.expressad.foundation.c.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0118a {

        /* renamed from: a, reason: collision with root package name */
        private static a f9424a = new a(0);

        private C0118a() {
        }
    }

    public /* synthetic */ a(byte b10) {
        this();
    }

    public static a a() {
        return C0118a.f9424a;
    }

    private JSONArray b() {
        return new JSONArray((Collection) this.f9423a.a());
    }

    private a() {
        this.f9423a = new d();
    }

    public final JSONObject a(String str) {
        JSONObject b10 = this.f9423a.b(str);
        if (b10 != null) {
            return b10;
        }
        return null;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.f9423a.a(next, jSONObject.optJSONObject(next));
            }
        }
    }
}
