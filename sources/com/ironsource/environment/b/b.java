package com.ironsource.environment.b;

import com.ironsource.mediationsdk.C1428r;
import java.util.ArrayList;
import org.json.JSONObject;
import zc.d;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<String> f24640a = new ArrayList<>(new a().f24639a);

    /* renamed from: b, reason: collision with root package name */
    public final C1428r f24641b = new C1428r();

    public final JSONObject a() {
        JSONObject a10 = this.f24641b.a(this.f24640a);
        d.c(a10, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return a10;
    }
}
