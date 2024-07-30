package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.e.al;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class x {

    /* renamed from: c, reason: collision with root package name */
    private static final String f6548c = "x";

    /* renamed from: d, reason: collision with root package name */
    private static volatile x f6549d;

    /* renamed from: a, reason: collision with root package name */
    Map<String, al> f6550a;

    /* renamed from: b, reason: collision with root package name */
    Context f6551b;

    private x(Context context) {
        this.f6551b = context.getApplicationContext();
        a();
    }

    public static x a(Context context) {
        if (f6549d == null) {
            synchronized (x.class) {
                if (f6549d == null) {
                    f6549d = new x(context);
                }
            }
        }
        return f6549d;
    }

    private static void b() {
    }

    private al b(String str) {
        Map<String, al> map = this.f6550a;
        if (map != null) {
            return map.remove(str);
        }
        return null;
    }

    private void a() {
        if (this.f6550a == null) {
            this.f6550a = new ConcurrentHashMap(5);
            try {
                Map<String, ?> a10 = com.anythink.core.common.k.p.a(this.f6551b, com.anythink.core.common.b.g.B);
                if (a10 != null) {
                    for (Map.Entry<String, ?> entry : a10.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            this.f6550a.put(key, al.a((String) value));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(String str, String str2, al.a aVar, al.a aVar2) {
        Map<String, al> map = this.f6550a;
        if (map == null) {
            return;
        }
        al alVar = map.get(str);
        if (alVar == null) {
            synchronized (this) {
                alVar = this.f6550a.get(str);
                if (alVar == null) {
                    alVar = new al();
                    alVar.b(str2);
                    this.f6550a.put(str, alVar);
                }
            }
        }
        if (TextUtils.equals(str2, alVar.b())) {
            if (aVar != null) {
                alVar.a(aVar);
                alVar.a(System.currentTimeMillis());
            }
            if (aVar2 != null) {
                alVar.b(aVar2);
            }
        }
    }

    public final void a(String str) {
        Map<String, al> map = this.f6550a;
        if (map == null) {
            return;
        }
        try {
            al alVar = map.get(str);
            if (alVar != null) {
                com.anythink.core.common.k.p.a(this.f6551b, com.anythink.core.common.b.g.B, str, alVar.a().toString());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
