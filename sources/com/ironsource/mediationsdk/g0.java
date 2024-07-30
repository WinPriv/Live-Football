package com.ironsource.mediationsdk;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1421j;
import com.ironsource.mediationsdk.T;
import com.ironsource.mediationsdk.bidding.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ T f25444s;

    public g0(T t10) {
        this.f25444s = t10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        StringBuilder sb2;
        T t10 = this.f25444s;
        if (!t10.f24968w.isEmpty()) {
            C1421j c1421j = t10.f24966u;
            ConcurrentHashMap<String, C1421j.a> concurrentHashMap = t10.f24968w;
            c1421j.a(concurrentHashMap);
            concurrentHashMap.clear();
        }
        long d10 = t10.f24952e.d() - (new Date().getTime() - t10.f24969x);
        if (d10 > 0) {
            IronLog.INTERNAL.verbose("waiting before auction - timeToWaitBeforeAuction = " + d10);
            new Timer().schedule(new T.e(), d10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        t10.e(IronSourceConstants.BN_AUCTION_REQUEST, null);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        IronSourceBannerLayout ironSourceBannerLayout = t10.f24954h;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.BANNER_LAYOUT, ironSourceBannerLayout);
        } catch (JSONException e10) {
            IronLog.INTERNAL.error("Exception while trying to bannerAdData, exception =  " + e10.getLocalizedMessage());
        }
        boolean b10 = com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), t10.q());
        boolean z11 = t10.A;
        if (!b10) {
            for (V v3 : t10.f24959m.values()) {
                if (v3.g()) {
                    if (z11) {
                        arrayList2.add(new a(v3.i(), v3.k(), jSONObject, v3));
                    } else {
                        Map<String, Object> biddingData = v3.getBiddingData(jSONObject);
                        if (biddingData != null) {
                            hashMap.put(v3.k(), biddingData);
                            sb2 = new StringBuilder();
                            sb2.append(v3.i());
                            sb2.append(v3.k());
                            sb2.append(",");
                            sb3.append(sb2.toString());
                        } else {
                            v3.a(IronSourceConstants.TROUBLESHOOTING_BN_BIDDING_DATA_MISSING, new Object[][]{new Object[]{"reason", "Missing bidding data"}});
                        }
                    }
                } else if (!v3.g()) {
                    arrayList.add(v3.k());
                    sb2 = new StringBuilder();
                    sb2.append(v3.i());
                    sb2.append(v3.k());
                    sb2.append(",");
                    sb3.append(sb2.toString());
                }
            }
        }
        if (z11) {
            if (arrayList2.isEmpty()) {
                t10.i(hashMap, arrayList, sb3);
                return;
            }
            com.ironsource.mediationsdk.bidding.b bVar = new com.ironsource.mediationsdk.bidding.b();
            T.d dVar = new T.d(sb3, arrayList, hashMap);
            t10.e(IronSourceConstants.BN_COLLECT_TOKENS, null);
            bVar.a(arrayList2, dVar, t10.B, TimeUnit.MILLISECONDS);
            return;
        }
        t10.i(hashMap, arrayList, sb3);
    }
}
