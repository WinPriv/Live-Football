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
public final class t implements RemoteCallResultCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f28318a;

    public t(v vVar) {
        this.f28318a = vVar;
    }

    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
    public final void onRemoteCallResult(String str, CallResult<String> callResult) {
        int code;
        long currentTimeMillis = System.currentTimeMillis();
        v vVar = this.f28318a;
        vVar.f28333n = currentTimeMillis;
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
                            if (vVar.f28330k == null) {
                                vVar.f28330k = adContentData.E();
                            }
                            arrayList.add(new com.huawei.openalliance.ad.inter.data.m(adContentData));
                        }
                        hashMap.put(str2, arrayList);
                    }
                }
                if (!a0.a.r(hashMap)) {
                    ex.V("RewardAdLoader", "onAdsLoaded, size:" + Integer.valueOf(hashMap.size()) + ", listener:" + vVar.f28324d);
                    if (vVar.f28324d != null) {
                        w.b(new u(vVar, hashMap));
                    }
                    vVar.f28323c = 1;
                }
            }
            code = 204;
        } else {
            code = callResult.getCode();
        }
        vVar.b(code);
        vVar.f28323c = 1;
    }
}
