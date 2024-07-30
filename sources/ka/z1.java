package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.CachedContentTplate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z1 extends y {
    public z1() {
        super(com.huawei.openalliance.ad.constant.s.A);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        com.huawei.openalliance.ad.ppskit.handlers.e eVar;
        String string;
        ArrayList arrayList;
        n7.b("CmdTriggerQueryCachedContent", "process query");
        synchronized (com.huawei.openalliance.ad.ppskit.handlers.e.f22526c) {
            try {
                if (com.huawei.openalliance.ad.ppskit.handlers.e.f22527d == null) {
                    com.huawei.openalliance.ad.ppskit.handlers.e.f22527d = new com.huawei.openalliance.ad.ppskit.handlers.e(context);
                }
                eVar = com.huawei.openalliance.ad.ppskit.handlers.e.f22527d;
            } finally {
            }
        }
        synchronized (eVar.f22528a) {
            string = eVar.f22529b.getString("splashPreloadMode", "");
        }
        Map map = (Map) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, string, Map.class, new Class[0]);
        if (a0.a.e0(map)) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                String str5 = (String) entry.getValue();
                if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(str4) && !com.huawei.openalliance.ad.ppskit.utils.y1.h(str5) && 1 != Integer.parseInt(str5) && Integer.parseInt(str5) != 0) {
                    arrayList.add(str4);
                }
            }
        }
        if (androidx.transition.n.M(arrayList)) {
            n7.b("CmdTriggerQueryCachedContent", "no need prepare cached contentId");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adIds", com.huawei.openalliance.ad.ppskit.utils.y0.q(null, arrayList));
            jSONObject.put("adType", 1);
            y6 c10 = w6.b(context).c(String.class, "queryCachedContent", jSONObject.toString(), true);
            if (200 == c10.f32210b) {
                JSONObject jSONObject2 = new JSONObject((String) c10.f32211c);
                String optString = jSONObject2.optString("cachedContentId");
                String optString2 = jSONObject2.optString("cachedTemplate");
                n7.f("CmdTriggerQueryCachedContent", "query kit cached content success: %s", Integer.valueOf(jSONObject2.optInt("resultCode")));
                if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(optString)) {
                    n7.b("CmdTriggerQueryCachedContent", "parse kit cached content id");
                    List<String> list = (List) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, optString, List.class, String.class);
                    if (!androidx.transition.n.M(list)) {
                        synchronized (r4.f31738c) {
                            if (androidx.transition.n.M(list)) {
                                n7.b("GlobalDataShare", "set kit cached contentIds null");
                            } else {
                                r4.f31737b = list;
                            }
                        }
                    }
                }
                if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(optString2)) {
                    n7.b("CmdTriggerQueryCachedContent", "parse kit cached template");
                    Map map2 = (Map) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, optString2, Map.class, new Class[0]);
                    HashMap hashMap = new HashMap();
                    if (!a0.a.e0(map2)) {
                        for (Map.Entry entry2 : map2.entrySet()) {
                            hashMap.put(entry2.getKey(), (List) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, (String) entry2.getValue(), List.class, CachedContentTplate.class));
                        }
                    }
                    if (!a0.a.e0(hashMap)) {
                        synchronized (r4.f31738c) {
                            if (a0.a.e0(hashMap)) {
                                n7.b("GlobalDataShare", "set kit cached templateIds null");
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            n7.h("CmdTriggerQueryCachedContent", "prepare cached contentId error: %s", th.getClass().getSimpleName());
        }
    }
}
