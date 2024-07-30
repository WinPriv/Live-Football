package com.iab.omid.library.applovin.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f24265c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f24266a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f24267b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f24265c;
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f24267b);
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f24266a);
    }

    public boolean d() {
        if (this.f24267b.size() > 0) {
            return true;
        }
        return false;
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.f24266a.add(aVar);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d10 = d();
        this.f24266a.remove(aVar);
        this.f24267b.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        h.c().e();
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d10 = d();
        this.f24267b.add(aVar);
        if (d10) {
            return;
        }
        h.c().d();
    }
}
