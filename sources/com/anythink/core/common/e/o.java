package com.anythink.core.common.e;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: h, reason: collision with root package name */
    public static final String f5720h = "business_type";

    /* renamed from: i, reason: collision with root package name */
    public static final int f5721i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5722j = 1001;

    /* renamed from: a, reason: collision with root package name */
    public String f5723a;

    /* renamed from: b, reason: collision with root package name */
    public int f5724b;

    /* renamed from: c, reason: collision with root package name */
    public String f5725c;

    /* renamed from: d, reason: collision with root package name */
    public String f5726d;

    /* renamed from: e, reason: collision with root package name */
    public String f5727e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public String f5728g;

    public static String a(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f5720h, i10);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    public final String a() {
        return this.f5726d + "--extra: " + this.f5728g + "--requestType: " + this.f5724b + "--content:" + this.f5727e;
    }
}
