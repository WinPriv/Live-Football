package tb;

import com.ironsource.mediationsdk.C1416d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.e;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f35594s;

    public b(e eVar) {
        this.f35594s = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        String str;
        JSONObject jSONObject = new JSONObject();
        e eVar = this.f35594s;
        eVar.f25203h = jSONObject;
        d dVar = eVar.f25213s;
        dVar.f25162d.a();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        com.ironsource.mediationsdk.adunit.c.a aVar = eVar.o;
        Iterator<NetworkSettings> it = aVar.f25177c.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            z10 = eVar.f25219z;
            if (!hasNext) {
                break;
            }
            NetworkSettings next = it.next();
            if (!eVar.f25207l.b(new m(next.getProviderInstanceName(), next.getMaxAdsPerSession(aVar.f25175a))) && eVar.j(next)) {
                IronSource.AD_UNIT ad_unit = aVar.f25175a;
                if (next.isBidder(ad_unit)) {
                    AdapterBaseInterface a10 = C1416d.a().a(next, ad_unit);
                    if (a10 instanceof AdapterBidderInterface) {
                        if (z10) {
                            arrayList2.add(new com.ironsource.mediationsdk.bidding.a(next.getInstanceType(ad_unit), next.getProviderInstanceName(), null, (AdapterBidderInterface) a10));
                        } else {
                            try {
                                Map<String, Object> biddingData = ((AdapterBidderInterface) a10).getBiddingData(null);
                                if (biddingData != null) {
                                    hashMap.put(next.getProviderInstanceName(), biddingData);
                                    sb2.append(next.getInstanceType(ad_unit) + next.getProviderInstanceName() + ",");
                                } else {
                                    dVar.f.a(eVar.e(a10, next), "Missing bidding data");
                                }
                            } catch (Exception e10) {
                                dVar.f.m("exception while calling networkAdapter.getBiddingData - " + e10);
                            }
                        }
                    } else {
                        if (a10 == null) {
                            str = "could not load network adapter";
                        } else {
                            str = "network adapter does not implementing AdapterBidderInterface";
                        }
                        dVar.f.a(str);
                    }
                } else {
                    arrayList.add(next.getProviderInstanceName());
                    sb2.append(next.getInstanceType(ad_unit) + next.getProviderInstanceName() + ",");
                }
            }
        }
        if (z10) {
            if (arrayList2.isEmpty()) {
                eVar.k(sb2.toString(), arrayList, hashMap);
                return;
            }
            com.ironsource.mediationsdk.bidding.b bVar = new com.ironsource.mediationsdk.bidding.b();
            e.c cVar = new e.c(hashMap, sb2, arrayList);
            dVar.f25161c.a();
            bVar.a(arrayList2, cVar, eVar.A, TimeUnit.MILLISECONDS);
            return;
        }
        eVar.k(sb2.toString(), arrayList, hashMap);
    }
}
