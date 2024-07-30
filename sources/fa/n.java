package fa;

import com.huawei.hms.ads.cz;
import com.huawei.hms.ads.ex;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class n implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f28257s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Map f28258t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f28259u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f28260v;

    public n(o oVar, long j10, HashMap hashMap, boolean z10) {
        this.f28260v = oVar;
        this.f28257s = j10;
        this.f28258t = hashMap;
        this.f28259u = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f28260v;
        ga.j jVar = oVar.f28265e;
        oVar.A = System.currentTimeMillis();
        oVar.I.b0().q(oVar.A);
        long j10 = oVar.A - this.f28257s;
        oVar.I.w(j10);
        int i10 = o.J;
        ex.V("o", "onAdsLoaded main thread switch: %s ms", Long.valueOf(j10));
        Map<String, List<com.huawei.openalliance.ad.inter.data.e>> map = this.f28258t;
        if (jVar != null) {
            jVar.Code(map);
        }
        ga.h hVar = oVar.f;
        if (hVar != null) {
            hVar.Code(map, this.f28259u);
        }
        cz.Code(oVar.f28271l, 200, oVar.C, oVar.f28272m, this.f28258t, oVar.A - oVar.f28283z, oVar.I);
    }
}
