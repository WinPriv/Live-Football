package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public NetworkSettings f25630a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f25631b;

    /* renamed from: c, reason: collision with root package name */
    public IronSource.AD_UNIT f25632c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25633d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25634e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f25635g;

    public a(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        boolean z10;
        this.f25630a = networkSettings;
        this.f25631b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f = optInt;
        if (optInt == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25633d = z10;
        this.f25634e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f25635g = jSONObject.optInt("maxAdsPerSession", 99);
        this.f25632c = ad_unit;
    }
}
