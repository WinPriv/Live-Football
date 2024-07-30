package fa;

import com.huawei.hms.ads.cz;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m implements RemoteCallResultCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f28256a;

    public m(o oVar) {
        this.f28256a = oVar;
    }

    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
    public final void onRemoteCallResult(String str, CallResult<String> callResult) {
        boolean z10;
        long currentTimeMillis = System.currentTimeMillis();
        o oVar = this.f28256a;
        oVar.B = currentTimeMillis;
        DelayInfo delayInfo = oVar.I;
        delayInfo.b0().s(oVar.B);
        boolean z11 = false;
        if (callResult.getCode() == 200) {
            Map map = (Map) gb.b.o(Map.class, callResult.getData(), List.class, AdContentData.class);
            if (map != null && map.size() > 0) {
                HashMap hashMap = new HashMap(map.size());
                boolean z12 = false;
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List<AdContentData> list = (List) entry.getValue();
                    if (list != null) {
                        ArrayList arrayList = new ArrayList(list.size());
                        for (AdContentData adContentData : list) {
                            if (oVar.C == null) {
                                oVar.C = adContentData.E();
                            }
                            com.huawei.openalliance.ad.inter.data.j jVar = new com.huawei.openalliance.ad.inter.data.j(adContentData);
                            jVar.J = oVar.y;
                            arrayList.add(jVar);
                            if (!z12) {
                                z12 = adContentData.n0();
                            }
                        }
                        hashMap.put(str2, arrayList);
                    }
                }
                ex.V("o", "onAdsLoaded, size:" + Integer.valueOf(hashMap.size()) + ", listener:" + oVar.f28265e + " innerlistener: " + oVar.f);
                long currentTimeMillis2 = System.currentTimeMillis();
                delayInfo.b0().m(currentTimeMillis2);
                if (!oVar.H) {
                    w.b(new n(oVar, currentTimeMillis2, hashMap, z12));
                    z10 = z12;
                } else {
                    delayInfo.F(currentTimeMillis2);
                    ex.V("o", "onAdsLoaded thread");
                    ga.j jVar2 = oVar.f28265e;
                    if (jVar2 != null) {
                        jVar2.Code(hashMap);
                    }
                    ga.h hVar = oVar.f;
                    if (hVar != null) {
                        hVar.Code(hashMap, z12);
                    }
                    z10 = z12;
                    cz.Code(oVar.f28271l, 200, oVar.C, oVar.f28272m, hashMap, oVar.f28283z, currentTimeMillis2, oVar.B);
                }
                z11 = z10;
            } else {
                oVar.b(204, true);
            }
        } else if (callResult.getCode() == 602) {
            List<String> list2 = (List) gb.b.o(List.class, callResult.getMsg(), new Class[0]);
            if (oVar.f28262b != null && list2 != null) {
                int i10 = o.J;
                ex.Code("o", "InValidContentIdsGot: %s", list2.toString());
                oVar.f28262b.Code(list2);
            }
        } else {
            z11 = Boolean.valueOf(callResult.getMsg()).booleanValue();
            if (-10 != callResult.getCode()) {
                oVar.b(callResult.getCode(), z11);
            }
        }
        if (z11) {
            oVar.f28263c = 1;
        }
    }
}
