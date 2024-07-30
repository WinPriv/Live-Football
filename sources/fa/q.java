package fa;

import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q implements RemoteCallResultCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f28291a;

    public q(s sVar) {
        this.f28291a = sVar;
    }

    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
    public final void onRemoteCallResult(String str, CallResult<String> callResult) {
        int code;
        long currentTimeMillis = System.currentTimeMillis();
        s sVar = this.f28291a;
        sVar.f28306n = currentTimeMillis;
        if (callResult.getCode() == 200) {
            Map map = (Map) gb.b.o(Map.class, callResult.getData(), List.class, AdContentData.class);
            if (map != null && map.size() > 0) {
                HashMap hashMap = new HashMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List<AdContentData> list = (List) entry.getValue();
                    if (list != null) {
                        ArrayList arrayList = new ArrayList(list.size());
                        for (AdContentData adContentData : list) {
                            if (sVar.f28303k == null) {
                                sVar.f28303k = adContentData.E();
                            }
                            arrayList.add(new com.huawei.openalliance.ad.inter.data.k(adContentData));
                        }
                        hashMap.put(str2, arrayList);
                    }
                }
                if (!a0.a.r(hashMap)) {
                    ex.V("PlacementAdLoader", "onAdsLoaded, size:" + hashMap.size());
                    if (sVar.f28297d != null) {
                        w.b(new r(sVar, hashMap));
                    }
                    sVar.f28294a = 1;
                }
            }
            code = 204;
        } else {
            code = callResult.getCode();
        }
        sVar.b(code);
        sVar.f28294a = 1;
    }
}
