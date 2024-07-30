package com.huawei.openalliance.ad.ppskit.net.http;

import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f22749a = new HashMap();

    public static String c(Map<String, List<String>> map) {
        if (map != null && map.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                sb2.append("{");
                sb2.append(entry.getKey());
                sb2.append(w.bE);
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    sb2.append(it.next());
                    sb2.append(com.anythink.expressad.foundation.g.a.bQ);
                }
                y1.g(sb2, '|');
                sb2.append("}");
            }
            return sb2.toString();
        }
        return "";
    }

    public final HashMap a() {
        return new HashMap(this.f22749a);
    }

    public final void b(String str, String str2) {
        if (str != null && str2 != null) {
            this.f22749a.put(str, str2);
        }
    }
}
