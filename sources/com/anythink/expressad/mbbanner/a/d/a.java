package com.anythink.expressad.mbbanner.a.d;

import android.content.Context;
import android.os.Handler;
import com.anythink.core.common.b.n;
import com.anythink.expressad.mbbanner.a.b.d;
import com.anythink.expressad.mbbanner.a.b.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10340a = "a";

    /* renamed from: h, reason: collision with root package name */
    private static volatile a f10341h;

    /* renamed from: b, reason: collision with root package name */
    private Context f10342b = n.a().g();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.e.a f10343c = new com.anythink.expressad.mbbanner.a.e.a();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, e> f10344d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Boolean> f10345e = new ConcurrentHashMap();
    private Map<String, Handler> f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Integer> f10346g = new ConcurrentHashMap();

    private a() {
    }

    private e b(String str) {
        if (this.f10344d.containsKey(str)) {
            return this.f10344d.get(str);
        }
        String e10 = com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.d.c c10 = com.anythink.expressad.d.b.c(e10, str);
        if (c10 == null) {
            c10 = com.anythink.expressad.d.c.c(str);
        }
        e eVar = new e(str, "", c10.t() * 1);
        this.f10344d.put(str, eVar);
        return eVar;
    }

    public static a a() {
        if (f10341h == null) {
            synchronized (a.class) {
                if (f10341h == null) {
                    f10341h = new a();
                }
            }
        }
        return f10341h;
    }

    private void a(String str, d dVar, com.anythink.expressad.mbbanner.a.c.b bVar) {
        if (this.f10342b == null) {
            this.f10343c.a(bVar, "Banner Context == null!", str);
            return;
        }
        if (dVar != null && bVar != null) {
            Map<String, Boolean> map = this.f10345e;
            if (map != null && map.containsKey(str) && this.f10345e.get(str).booleanValue()) {
                this.f10343c.a(bVar, "Current unit is loading!", str);
                return;
            }
            this.f10345e.put(str, Boolean.TRUE);
            new b(this.f10342b, b(str), bVar, this.f10343c);
            return;
        }
        this.f10343c.a(bVar, "Banner request parameters or callback empty!", str);
    }

    public final void b() {
        Map<String, e> map = this.f10344d;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f10345e;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f.clear();
        }
        Map<String, Integer> map4 = this.f10346g;
        if (map4 != null) {
            map4.clear();
        }
    }

    public final void a(String str, com.anythink.expressad.foundation.d.d dVar, com.anythink.expressad.mbbanner.a.c.b bVar) {
        synchronized (a()) {
            Map<String, Boolean> map = this.f10345e;
            if (map != null && map.containsKey(str) && this.f10345e.get(str).booleanValue()) {
                this.f10343c.a(bVar, "Current unit is loading!", str);
                return;
            }
            this.f10345e.put(str, Boolean.TRUE);
            new b(this.f10342b, b(str), bVar, this.f10343c).a(str, dVar, new com.anythink.expressad.mbbanner.a.c.d() { // from class: com.anythink.expressad.mbbanner.a.d.a.1
                @Override // com.anythink.expressad.mbbanner.a.c.d
                public final void a(String str2) {
                    synchronized (a.a()) {
                        a.this.f10345e.put(str2, Boolean.FALSE);
                    }
                }
            });
        }
    }

    public final void a(String str) {
        if (this.f.containsKey(str)) {
            this.f.get(str).removeCallbacksAndMessages(null);
            this.f.remove(str);
        }
    }

    public final void a(int i10, String str) {
        int intValue = this.f10346g.containsKey(str) ? this.f10346g.get(str).intValue() : 0;
        if (i10 == 1) {
            if (this.f.containsKey(str)) {
                this.f.get(str).removeCallbacksAndMessages(null);
            }
            this.f10346g.put(str, Integer.valueOf(i10));
            return;
        }
        if (i10 == 2) {
            if (intValue == 1) {
                if (this.f.containsKey(str)) {
                    this.f.get(str).removeCallbacksAndMessages(null);
                }
                this.f10346g.put(str, Integer.valueOf(i10));
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (intValue == 2 || intValue == 4) {
                this.f10346g.put(str, 1);
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        if (intValue == 0) {
            this.f10346g.put(str, 0);
            return;
        }
        if (this.f.containsKey(str)) {
            this.f.get(str).removeCallbacksAndMessages(null);
        }
        this.f10346g.put(str, Integer.valueOf(i10));
    }
}
