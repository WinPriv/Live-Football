package com.anythink.core.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.c.d;
import com.anythink.core.common.b.g;
import com.anythink.core.common.k.p;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f4509c;

    /* renamed from: a, reason: collision with root package name */
    final String f4510a = "b";

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, com.anythink.core.common.e.c> f4511b = new ConcurrentHashMap<>();

    public static b a() {
        if (f4509c == null) {
            synchronized (b.class) {
                if (f4509c == null) {
                    f4509c = new b();
                }
            }
        }
        return f4509c;
    }

    public final void b(Context context, String str, d dVar) {
        com.anythink.core.common.e.c cVar = this.f4511b.get(str);
        if (cVar == null) {
            String b10 = p.b(context, g.f5011s, str, "");
            com.anythink.core.common.e.c cVar2 = new com.anythink.core.common.e.c();
            if (!TextUtils.isEmpty(b10)) {
                cVar2.a(b10);
            }
            this.f4511b.put(str, cVar2);
            cVar = cVar2;
        }
        if (System.currentTimeMillis() - cVar.f5573b > dVar.al()) {
            cVar.f5573b = System.currentTimeMillis();
            cVar.f5572a = 0;
        }
        cVar.f5572a++;
        cVar.toString();
        p.a(context, g.f5011s, str, cVar.toString());
    }

    public final boolean a(Context context, String str, d dVar) {
        if (dVar.ak() <= 0) {
            return false;
        }
        com.anythink.core.common.e.c cVar = this.f4511b.get(str);
        if (cVar == null) {
            String b10 = p.b(context, g.f5011s, str, "");
            cVar = new com.anythink.core.common.e.c();
            if (!TextUtils.isEmpty(b10)) {
                cVar.a(b10);
            }
            this.f4511b.put(str, cVar);
        }
        cVar.toString();
        return cVar.f5572a >= dVar.ak() && System.currentTimeMillis() - cVar.f5573b <= dVar.al();
    }
}
