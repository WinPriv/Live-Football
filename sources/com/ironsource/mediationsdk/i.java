package com.ironsource.mediationsdk;

import android.content.Context;
import com.huawei.hms.ads.ep;
import com.huawei.openalliance.ad.constant.bj;
import com.ironsource.mediationsdk.C1420h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.URL;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.ironsource.mediationsdk.utils.c f25458a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25459b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25460c;

    public i(com.ironsource.mediationsdk.utils.c cVar, boolean z10, String str) {
        zc.d.d(cVar, "settings");
        zc.d.d(str, "sessionId");
        this.f25458a = cVar;
        this.f25459b = z10;
        this.f25460c = str;
    }

    public final C1420h.a a(Context context, C1422k c1422k, InterfaceC1419g interfaceC1419g) {
        JSONObject c10;
        zc.d.d(context, bj.f.o);
        zc.d.d(c1422k, "auctionParams");
        zc.d.d(interfaceC1419g, "auctionListener");
        new JSONObject();
        new JSONObject();
        HashMap hashMap = c1422k.f25546d;
        boolean z10 = this.f25459b;
        C1418f a10 = C1418f.a();
        if (z10) {
            c10 = a10.f(c1422k.f25543a, c1422k.f25545c, hashMap, c1422k.f25547e, null, c1422k.f, c1422k.f25549h, null);
        } else {
            c10 = a10.c(context, hashMap, c1422k.f25547e, null, c1422k.f, this.f25460c, this.f25458a, c1422k.f25549h, null);
            c10.put("adunit", c1422k.f25543a);
            c10.put("doNotEncryptResponse", c1422k.f25545c ? ep.V : ep.Code);
        }
        JSONObject jSONObject = c10;
        if (c1422k.f25550i) {
            jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        }
        if (c1422k.f25544b) {
            jSONObject.put("isOneFlow", 1);
        }
        boolean z11 = c1422k.f25550i;
        com.ironsource.mediationsdk.utils.c cVar = this.f25458a;
        return new C1420h.a(interfaceC1419g, new URL(z11 ? cVar.f25892e : cVar.f25891d), jSONObject, c1422k.f25545c, cVar.f, cVar.f25895i, cVar.f25902q, cVar.f25903r, cVar.f25904s);
    }

    public final boolean a() {
        return this.f25458a.f > 0;
    }
}
