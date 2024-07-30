package vc;

import j7.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: _MapsJvm.kt */
/* loaded from: classes2.dex */
public class h extends r {
    public static final Map L(ArrayList arrayList) {
        e eVar = e.f36007s;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(r.F(arrayList.size()));
                M(arrayList, linkedHashMap);
                return linkedHashMap;
            }
            uc.b bVar = (uc.b) arrayList.get(0);
            zc.d.d(bVar, "pair");
            Map singletonMap = Collections.singletonMap(bVar.f35845s, bVar.f35846t);
            zc.d.c(singletonMap, "singletonMap(pair.first, pair.second)");
            return singletonMap;
        }
        return eVar;
    }

    public static final void M(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uc.b bVar = (uc.b) it.next();
            linkedHashMap.put(bVar.f35845s, bVar.f35846t);
        }
    }
}
