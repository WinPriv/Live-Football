package com.ironsource.sdk.a;

import android.util.Log;
import com.ironsource.sdk.a.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static d f25990b;

    /* renamed from: a, reason: collision with root package name */
    public com.ironsource.a.b f25991a;

    private d() {
    }

    public static void a(com.ironsource.a.a aVar, b bVar) {
        if (aVar != null) {
            try {
                if (f25990b == null) {
                    f25990b = new d();
                }
                f25990b.f25991a = new com.ironsource.a.b(aVar, bVar);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(f.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(f.a aVar, Map<String, Object> map) {
        if (f25990b == null) {
            f25990b = new d();
        }
        com.ironsource.a.b bVar = f25990b.f25991a;
        if (bVar == null) {
            Log.d("sdk5Events", "logEvent failed eventsTracker doesn't exist");
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f26019b));
        }
        bVar.a(aVar.f26018a, map);
    }
}
