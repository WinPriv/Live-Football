package com.anythink.core.common;

import com.anythink.core.api.ATAdInfo;
import com.anythink.core.common.e.ad;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static volatile v f6536a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, ad> f6537b = new ConcurrentHashMap<>(4);

    private v() {
    }

    public static v a() {
        if (f6536a == null) {
            synchronized (v.class) {
                if (f6536a == null) {
                    f6536a = new v();
                }
            }
        }
        return f6536a;
    }

    private synchronized ad h(String str) {
        ad adVar;
        adVar = this.f6537b.get(str);
        if (adVar == null) {
            adVar = new ad();
            this.f6537b.put(str, adVar);
        }
        return adVar;
    }

    public final f b(String str) {
        return h(str).b();
    }

    public final synchronized Map<String, Object> c(String str) {
        HashMap hashMap;
        hashMap = new HashMap(2);
        Map<String, Object> c10 = h(str).c();
        if (c10 != null) {
            hashMap.putAll(c10);
        }
        return hashMap;
    }

    public final com.anythink.core.common.e.d d(String str) {
        return h(str).d();
    }

    public final void e(String str) {
        h(str).a((ATAdInfo) null);
    }

    public final boolean f(String str) {
        return h(str).e();
    }

    public final String g(String str) {
        return h(str).f();
    }

    public final Object a(String str) {
        return h(str).a();
    }

    public final void a(String str, f fVar) {
        h(str).a(fVar);
    }

    public final synchronized void a(String str, Map<String, Object> map) {
        ConcurrentHashMap concurrentHashMap = null;
        if (map != null) {
            try {
                concurrentHashMap = new ConcurrentHashMap(map);
            } catch (Throwable unused) {
            }
        }
        h(str).a(concurrentHashMap);
    }

    private synchronized void a(String str, String str2, Object obj) {
        h(str).a(str2, obj);
    }

    public final void a(String str, ATAdInfo aTAdInfo) {
        h(str).a(aTAdInfo);
    }

    public final void a(String str, String str2, String str3) {
        h(str).a(str2, str3);
    }

    public final String a(String str, String str2) {
        return h(str).a(str2);
    }

    public final void a(String str, boolean z10) {
        h(str).a(z10);
    }

    public final void a(String str, Object[] objArr) {
        h(str).a(objArr);
    }

    public final void a(String str, int i10, String str2) {
        h(str).b(String.valueOf(i10), str2);
    }

    public final String a(String str, int i10) {
        return h(str).b(String.valueOf(i10));
    }
}
