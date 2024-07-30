package com.anythink.core.common;

import com.anythink.core.common.b.g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class n {

    /* renamed from: c, reason: collision with root package name */
    private static volatile n f6353c;

    /* renamed from: a, reason: collision with root package name */
    com.anythink.core.common.c.h f6354a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6355b = getClass().getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f6356d = new ConcurrentHashMap<>(3);

    public n() {
        com.anythink.core.common.c.h a10 = com.anythink.core.common.c.h.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.n.a().g()));
        this.f6354a = a10;
        List<com.anythink.core.common.e.p> d10 = a10.d();
        if (d10 != null) {
            Iterator<com.anythink.core.common.e.p> it = d10.iterator();
            while (it.hasNext()) {
                this.f6356d.put(it.next().a(), "1");
            }
        }
    }

    public static n a() {
        if (f6353c == null) {
            synchronized (n.class) {
                if (f6353c == null) {
                    f6353c = new n();
                }
            }
        }
        return f6353c;
    }

    public static int b() {
        return com.anythink.core.common.k.p.b(com.anythink.core.common.b.n.a().g(), com.anythink.core.common.b.g.o, g.o.f5147p, 0);
    }

    public final JSONArray c() {
        Iterator<Map.Entry<String, String>> it = this.f6356d.entrySet().iterator();
        JSONArray jSONArray = new JSONArray();
        while (it.hasNext()) {
            try {
                jSONArray.put(Long.parseLong(it.next().getKey()));
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    public final void a(String str) {
        Map<String, Object> c10 = com.anythink.core.common.k.h.c(com.anythink.core.common.k.c.c(str));
        if (c10.size() == 0) {
            com.anythink.core.common.k.p.a(com.anythink.core.common.b.n.a().g(), com.anythink.core.common.b.g.o, g.o.f5147p, 0);
            return;
        }
        for (Map.Entry<String, Object> entry : c10.entrySet()) {
            try {
                if (com.anythink.core.common.k.h.a(com.anythink.core.common.b.n.a().g(), entry.getValue().toString())) {
                    this.f6356d.put(entry.getKey(), "1");
                    this.f6354a.a(entry.getKey());
                }
            } catch (Throwable unused) {
            }
        }
        com.anythink.core.common.k.p.a(com.anythink.core.common.b.n.a().g(), com.anythink.core.common.b.g.o, g.o.f5147p, c10.size() + b());
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.n.1
            @Override // java.lang.Runnable
            public final void run() {
                n.this.f6354a.c();
            }
        });
    }
}
