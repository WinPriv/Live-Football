package com.iab.omid.library.ironsrc.processor;

import android.view.View;
import com.iab.omid.library.ironsrc.processor.a;
import com.iab.omid.library.ironsrc.utils.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f24405a;

    public c(a aVar) {
        this.f24405a = aVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.ironsrc.internal.c c10 = com.iab.omid.library.ironsrc.internal.c.c();
        if (c10 != null) {
            Collection<com.iab.omid.library.ironsrc.adsession.a> a10 = c10.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a10.size() * 2) + 3);
            Iterator<com.iab.omid.library.ironsrc.adsession.a> it = a10.iterator();
            while (it.hasNext()) {
                View c11 = it.next().c();
                if (c11 != null && h.e(c11) && (rootView = c11.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c12 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c(arrayList.get(size - 1)) > c12) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public JSONObject a(View view) {
        JSONObject a10 = com.iab.omid.library.ironsrc.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.ironsrc.utils.c.a(a10, e.a());
        return a10;
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0311a interfaceC0311a, boolean z10, boolean z11) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0311a.a(it.next(), this.f24405a, jSONObject, z11);
        }
    }
}
