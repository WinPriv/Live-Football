package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import java.util.HashMap;
import java.util.Map;
import ka.n1;

/* loaded from: classes2.dex */
public final class ff extends xd {
    public ff(Context context, og ogVar) {
        super(context, ogVar);
    }

    @Override // ka.xd
    public final void c(AdContentRsp adContentRsp, String str) {
        long j10;
        long j11;
        int i10;
        if (adContentRsp == null) {
            this.f32190c.a(499);
            n7.g("PlacementPreloadProcessor", "response is null");
            return;
        }
        HashMap b10 = b(str, adContentRsp.A());
        Integer num = null;
        if (b10.isEmpty()) {
            this.f32190c.a(800);
        } else {
            this.f32190c.a(null, b10);
        }
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f32189b);
        synchronized (d10.f22585a) {
            j10 = 0;
            j11 = d10.G(str).getLong("last_preload_placement_time", 0L);
        }
        Long valueOf = Long.valueOf(j11);
        synchronized (d10.f22585a) {
            i10 = 0;
            Map<String, String> K = d10.K(str, false);
            if (!a0.a.e0(K)) {
                num = com.huawei.openalliance.ad.ppskit.utils.y1.q(K.get("preloadPlacementArInterval"));
            }
            if (num != null && num.intValue() >= 0) {
                i10 = num.intValue();
            }
        }
        long j12 = i10 * 60000;
        if (valueOf != null) {
            j10 = valueOf.longValue();
        }
        if (System.currentTimeMillis() - j10 < j12) {
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("AR Preload request time limit, timeInter=", j12, ", lastTime=");
            k10.append(j10);
            k10.append(" callerPkg: ");
            k10.append(str);
            n7.e("PlacementPreloadProcessor", k10.toString());
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (d10.f22585a) {
            d10.G(str).edit().putLong("last_preload_placement_time", currentTimeMillis).commit();
        }
        ad adVar = new ad(this.f32189b);
        String str2 = this.f32191d;
        adVar.f = str2;
        adVar.g(str, adContentRsp, new n1.a(str2), 60, currentTimeMillis, true);
    }
}
