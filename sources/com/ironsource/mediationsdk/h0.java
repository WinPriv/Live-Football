package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.bidding.a;
import com.ironsource.mediationsdk.i0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class h0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0 f25457s;

    public h0(i0 i0Var) {
        this.f25457s = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        StringBuilder sb2;
        i0 i0Var = this.f25457s;
        i0Var.f25468m = "";
        i0Var.f25469n = null;
        long e10 = i0Var.f25477w - (e0.i.e() - i0Var.f25476v);
        if (e10 > 0) {
            IronLog.INTERNAL.verbose("delaying auction by " + e10);
            com.ironsource.environment.e.c.b(new i0.b(), e10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        i0Var.f(2000, null, false);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Y> it = i0Var.f25462g.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            z11 = i0Var.f25471q;
            if (!hasNext) {
                break;
            }
            Y next = it.next();
            if (!i0Var.f25461e.b(next)) {
                if (next.g()) {
                    if (z11) {
                        arrayList2.add(new a(next.i(), next.k(), null, next));
                    } else {
                        Map<String, Object> biddingData = next.getBiddingData(null);
                        if (biddingData != null) {
                            hashMap.put(next.k(), biddingData);
                            sb2 = new StringBuilder();
                        } else {
                            i0Var.e(IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, next, new Object[][]{new Object[]{"reason", "Missing bidding data"}}, false);
                        }
                    }
                } else {
                    arrayList.add(next.k());
                    sb2 = new StringBuilder();
                }
                sb2.append(next.i());
                sb2.append(next.k());
                sb2.append(",");
                sb3.append(sb2.toString());
            }
        }
        if (z11) {
            if (arrayList2.isEmpty()) {
                i0Var.j(sb3.toString(), arrayList, hashMap);
                return;
            }
            com.ironsource.mediationsdk.bidding.b bVar = new com.ironsource.mediationsdk.bidding.b();
            i0.a aVar = new i0.a(hashMap, sb3, arrayList);
            i0Var.f(IronSourceConstants.IS_COLLECT_TOKENS, null, false);
            bVar.a(arrayList2, aVar, i0Var.f25472r, TimeUnit.MILLISECONDS);
            return;
        }
        i0Var.j(sb3.toString(), arrayList, hashMap);
    }
}
