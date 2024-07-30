package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public c f26539a;

    public b(Context context, JSONObject jSONObject) {
        c eVar;
        if (jSONObject.optInt("connectivityStrategy") == 1) {
            eVar = new a(this);
        } else if (!com.ironsource.environment.c.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            eVar = new a(this);
        } else {
            eVar = new e(this);
        }
        this.f26539a = eVar;
        Logger.i("b", "created ConnectivityAdapter with strategy ".concat(eVar.getClass().getSimpleName()));
    }

    @Override // com.ironsource.sdk.service.Connectivity.d
    public void a() {
    }

    @Override // com.ironsource.sdk.service.Connectivity.d
    public void a(String str) {
    }

    @Override // com.ironsource.sdk.service.Connectivity.d
    public void a(String str, JSONObject jSONObject) {
    }
}
