package ka;

import android.content.Context;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.beans.inner.PlacementAdReqParam;
import com.huawei.openalliance.ad.ppskit.beans.metadata.App;
import com.huawei.openalliance.ad.ppskit.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j1 extends d0 {

    /* loaded from: classes2.dex */
    public static class a implements og {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f31314a;

        /* renamed from: b, reason: collision with root package name */
        public final com.huawei.android.hms.ppskit.a f31315b;

        /* renamed from: c, reason: collision with root package name */
        public final String f31316c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f31317d;

        /* renamed from: e, reason: collision with root package name */
        public final String f31318e;
        public final Context f;

        public a(Context context, String str, boolean z10, com.huawei.android.hms.ppskit.a aVar, String str2, boolean z11) {
            this.f = context;
            this.f31318e = str;
            this.f31314a = z10;
            this.f31315b = aVar;
            this.f31316c = str2;
            this.f31317d = z11;
        }

        @Override // ka.og
        public final void a(int i10) {
            y.d(this.f31315b, this.f31316c, i10, "");
        }

        @Override // ka.og
        public final void a(HashMap hashMap, HashMap hashMap2) {
            ConcurrentHashMap concurrentHashMap = d0.f31074c;
            concurrentHashMap.clear();
            if (hashMap != null) {
                concurrentHashMap.putAll(hashMap);
            }
            ConcurrentHashMap concurrentHashMap2 = d0.f31075d;
            concurrentHashMap2.clear();
            concurrentHashMap2.putAll(hashMap2);
            y.d(this.f31315b, this.f31316c, 200, this.f31314a ? com.huawei.openalliance.ad.ppskit.utils.y0.q(null, hashMap2) : com.huawei.openalliance.ad.ppskit.utils.y0.q(null, hashMap));
            if (this.f31317d || d0.f31076e) {
                Context context = this.f;
                String str = this.f31318e;
                Integer num = p5.j(context).f;
                d0.i(context, str, num != null ? num.intValue() : 0, hashMap, hashMap2);
                d0.f31076e = false;
            }
        }
    }

    public j1() {
        super("reqPlaceAd");
    }

    @Override // ka.c0
    public final void h(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        xd efVar;
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString(com.huawei.openalliance.ad.constant.ba.I);
        String string2 = jSONObject.getString("content");
        List<String> list = null;
        AdSlotParam adSlotParam = (AdSlotParam) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, string, AdSlotParam.class, new Class[0]);
        PlacementAdReqParam placementAdReqParam = (PlacementAdReqParam) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, string2, PlacementAdReqParam.class, new Class[0]);
        Pair c02 = androidx.activity.n.c0(context, str);
        if (c02 != null) {
            adSlotParam.C((String) c02.first);
            adSlotParam.D(((Boolean) c02.second).booleanValue());
        }
        d0.l();
        ad adVar = new ad(context);
        DelayInfo delayInfo = adVar.f30939g;
        c0.g(delayInfo, placementAdReqParam.a(), jSONObject.optLong(com.huawei.openalliance.ad.constant.ba.K), this.f31013b);
        adVar.f = str2;
        String b10 = placementAdReqParam.b();
        adVar.i(str);
        if (adSlotParam != null) {
            list = adSlotParam.v();
        }
        ArrayList D = com.huawei.openalliance.ad.ppskit.handlers.e0.D(adVar.f30935b.C(str, 60, list));
        App a10 = adVar.a(adSlotParam, str);
        if (a10 == null) {
            a10 = new App(adVar.f30934a, str);
        }
        a10.h(b10);
        adSlotParam.x(a10);
        AdContentRsp d10 = adVar.d(str, 60, adSlotParam, D, null, false);
        a aVar2 = new a(context, str, adSlotParam.R(), aVar, this.f32203a, placementAdReqParam.c());
        if (adSlotParam.R()) {
            efVar = new ff(context, aVar2);
        } else {
            efVar = new ef(context, aVar2);
        }
        efVar.f32191d = str2;
        delayInfo.E().j(System.currentTimeMillis());
        efVar.a(d10, str);
        f(aVar, d10);
    }
}
