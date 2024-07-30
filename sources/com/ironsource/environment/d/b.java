package com.ironsource.environment.d;

import com.ironsource.mediationsdk.C1428r;
import java.util.ArrayList;
import org.json.JSONObject;
import zc.d;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<String> f24651a = new ArrayList<>(new a().f24650a);

    /* renamed from: b, reason: collision with root package name */
    public final C1428r f24652b = new C1428r();

    public final JSONObject a() {
        JSONObject a10 = this.f24652b.a(this.f24651a);
        d.c(a10, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return a10;
    }
}
