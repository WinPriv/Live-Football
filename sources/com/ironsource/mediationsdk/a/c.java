package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import org.json.JSONException;
import org.json.JSONObject;
import rb.a;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f25064a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25065b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f25066c;

    public c(int i10, long j10, JSONObject jSONObject) {
        this.f25065b = -1L;
        this.f25064a = i10;
        this.f25065b = j10;
        this.f25066c = jSONObject;
    }

    public static a b(int i10, String str) {
        if ("ironbeast".equals(str)) {
            return new rb.b(i10);
        }
        if ("outcome".equals(str)) {
            return new rb.c(i10);
        }
        if (i10 == 2) {
            return new rb.b(i10);
        }
        if (i10 == 3) {
            return new rb.c(i10);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i10 + ")", 2);
        return null;
    }

    public int a() {
        return this.f25064a;
    }

    public String c() {
        return this.f25066c.toString();
    }

    public JSONObject d() {
        return this.f25066c;
    }

    public c(int i10, JSONObject jSONObject) {
        this.f25065b = -1L;
        this.f25064a = i10;
        this.f25065b = System.currentTimeMillis();
        if (jSONObject == null) {
            this.f25066c = new JSONObject();
        } else {
            this.f25066c = jSONObject;
        }
    }

    public void a(int i10) {
        this.f25064a = i10;
    }

    public long b() {
        return this.f25065b;
    }

    public void a(String str, Object obj) {
        try {
            this.f25066c.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
