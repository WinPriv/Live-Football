package com.anythink.core.common.e;

import com.anythink.core.api.ATAdInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class ad {

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.core.common.f f5451b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Object> f5452c;

    /* renamed from: d, reason: collision with root package name */
    private d f5453d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f5454e;
    private boolean f;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f5456h;

    /* renamed from: g, reason: collision with root package name */
    private String f5455g = "";

    /* renamed from: a, reason: collision with root package name */
    final Object f5450a = new Object();

    public final Object a() {
        return this.f5450a;
    }

    public final com.anythink.core.common.f b() {
        return this.f5451b;
    }

    public final Map<String, Object> c() {
        return this.f5452c;
    }

    public final d d() {
        return this.f5453d;
    }

    public final boolean e() {
        return this.f;
    }

    public final String f() {
        return this.f5455g;
    }

    public final void a(com.anythink.core.common.f fVar) {
        this.f5451b = fVar;
    }

    public final void b(String str, String str2) {
        if (this.f5456h == null) {
            this.f5456h = new ConcurrentHashMap(2);
        }
        this.f5456h.put(str, str2);
    }

    public final void a(Map<String, Object> map) {
        this.f5452c = map;
    }

    public final void a(String str, Object obj) {
        if (this.f5452c == null) {
            this.f5452c = new ConcurrentHashMap(2);
        }
        this.f5452c.put(str, obj);
    }

    public final String b(String str) {
        Map<String, String> map = this.f5456h;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final void a(ATAdInfo aTAdInfo) {
        if (aTAdInfo != null) {
            this.f5453d = new d(aTAdInfo.getAdsourceId(), aTAdInfo.getShowId(), aTAdInfo.getNetworkFirmId());
        } else {
            this.f5453d = null;
        }
    }

    public final String a(String str) {
        if (this.f5454e == null) {
            this.f5454e = new ConcurrentHashMap(2);
        }
        return this.f5454e.remove(str);
    }

    public final void a(String str, String str2) {
        if (this.f5454e == null) {
            this.f5454e = new ConcurrentHashMap(2);
        }
        this.f5454e.put(str, str2);
    }

    public final void a(boolean z10) {
        this.f = z10;
    }

    public final void a(Object[] objArr) {
        this.f5455g = com.anythink.core.common.k.h.a(objArr);
    }
}
