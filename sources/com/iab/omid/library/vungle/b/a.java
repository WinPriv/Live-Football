package com.iab.omid.library.vungle.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f24488a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.vungle.adsession.a> f24489b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.vungle.adsession.a> f24490c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f24488a;
    }

    public Collection<com.iab.omid.library.vungle.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f24489b);
    }

    public Collection<com.iab.omid.library.vungle.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f24490c);
    }

    public boolean d() {
        if (this.f24490c.size() > 0) {
            return true;
        }
        return false;
    }

    public void a(com.iab.omid.library.vungle.adsession.a aVar) {
        this.f24489b.add(aVar);
    }

    public void b(com.iab.omid.library.vungle.adsession.a aVar) {
        boolean d10 = d();
        this.f24490c.add(aVar);
        if (d10) {
            return;
        }
        f.a().b();
    }

    public void c(com.iab.omid.library.vungle.adsession.a aVar) {
        boolean d10 = d();
        this.f24489b.remove(aVar);
        this.f24490c.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        f.a().c();
    }
}
