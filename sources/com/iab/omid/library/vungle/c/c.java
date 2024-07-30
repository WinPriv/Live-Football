package com.iab.omid.library.vungle.c;

import android.view.View;
import com.iab.omid.library.vungle.c.a;
import com.iab.omid.library.vungle.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f24518a;

    public c(a aVar) {
        this.f24518a = aVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.vungle.b.a a10 = com.iab.omid.library.vungle.b.a.a();
        if (a10 != null) {
            Collection<com.iab.omid.library.vungle.adsession.a> c10 = a10.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c10.size() * 2) + 3);
            Iterator<com.iab.omid.library.vungle.adsession.a> it = c10.iterator();
            while (it.hasNext()) {
                View d10 = it.next().d();
                if (d10 != null && f.c(d10) && (rootView = d10.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a11 = f.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && f.a(arrayList.get(size - 1)) > a11) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.vungle.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.vungle.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.vungle.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0314a interfaceC0314a, boolean z10) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0314a.a(it.next(), this.f24518a, jSONObject);
        }
    }
}
