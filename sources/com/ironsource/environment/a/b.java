package com.ironsource.environment.a;

import com.ironsource.mediationsdk.C1428r;
import java.util.ArrayList;
import org.json.JSONObject;
import zc.d;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<String> f24637a = new ArrayList<>(new a().f24635a);

    /* renamed from: b, reason: collision with root package name */
    public final C1428r f24638b = new C1428r();

    public final JSONObject a() {
        JSONObject a10 = this.f24638b.a(this.f24637a);
        d.c(a10, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        JSONObject a11 = com.ironsource.environment.c.b.a(a10.optJSONObject("md"));
        if (a11 != null) {
            a10.put("md", a11);
        }
        return a10;
    }
}
