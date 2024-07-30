package com.iab.omid.library.ironsrc.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f24383c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.ironsrc.adsession.a> f24384a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.ironsrc.adsession.a> f24385b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f24383c;
    }

    public Collection<com.iab.omid.library.ironsrc.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f24385b);
    }

    public Collection<com.iab.omid.library.ironsrc.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f24384a);
    }

    public boolean d() {
        if (this.f24385b.size() > 0) {
            return true;
        }
        return false;
    }

    public void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        this.f24384a.add(aVar);
    }

    public void b(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean d10 = d();
        this.f24384a.remove(aVar);
        this.f24385b.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        h.c().e();
    }

    public void c(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean d10 = d();
        this.f24385b.add(aVar);
        if (d10) {
            return;
        }
        h.c().d();
    }
}
