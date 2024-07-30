package com.ironsource.mediationsdk.sdk;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static e f25812b;

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f25813a = new JSONObject();

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (f25812b == null) {
                f25812b = new e();
            }
            eVar = f25812b;
        }
        return eVar;
    }

    public final synchronized JSONObject b() {
        return this.f25813a;
    }

    public final synchronized String a(String str) {
        return this.f25813a.optString(str);
    }

    public final synchronized void a(String str, Object obj) {
        try {
            this.f25813a.put(str, obj);
        } catch (Exception unused) {
        }
    }

    public final synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }
}
