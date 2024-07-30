package com.iab.omid.library.vungle.walking;

import android.view.View;
import com.iab.omid.library.vungle.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24551a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0315a> f24552b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24553c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24554d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24555e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24556g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f24557h;

    /* renamed from: com.iab.omid.library.vungle.walking.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0315a {

        /* renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.vungle.b.c f24558a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24559b = new ArrayList<>();

        public C0315a(com.iab.omid.library.vungle.b.c cVar, String str) {
            this.f24558a = cVar;
            a(str);
        }

        public com.iab.omid.library.vungle.b.c a() {
            return this.f24558a;
        }

        public ArrayList<String> b() {
            return this.f24559b;
        }

        public void a(String str) {
            this.f24559b.add(str);
        }
    }

    private String d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e10 = f.e(view);
            if (e10 != null) {
                return e10;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f24554d.addAll(hashSet);
        return null;
    }

    public String a(View view) {
        if (this.f24551a.size() == 0) {
            return null;
        }
        String str = this.f24551a.get(view);
        if (str != null) {
            this.f24551a.remove(view);
        }
        return str;
    }

    public View b(String str) {
        return this.f24553c.get(str);
    }

    public c c(View view) {
        return this.f24554d.contains(view) ? c.PARENT_VIEW : this.f24557h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        this.f24557h = true;
    }

    public String a(String str) {
        return this.f24556g.get(str);
    }

    public C0315a b(View view) {
        C0315a c0315a = this.f24552b.get(view);
        if (c0315a != null) {
            this.f24552b.remove(view);
        }
        return c0315a;
    }

    public void c() {
        com.iab.omid.library.vungle.b.a a10 = com.iab.omid.library.vungle.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : a10.c()) {
                View d10 = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (d10 != null) {
                        String d11 = d(d10);
                        if (d11 == null) {
                            this.f24555e.add(adSessionId);
                            this.f24551a.put(d10, adSessionId);
                            a(aVar);
                        } else {
                            this.f.add(adSessionId);
                            this.f24553c.put(adSessionId, d10);
                            this.f24556g.put(adSessionId, d11);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.f24556g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f24551a.clear();
        this.f24552b.clear();
        this.f24553c.clear();
        this.f24554d.clear();
        this.f24555e.clear();
        this.f.clear();
        this.f24556g.clear();
        this.f24557h = false;
    }

    public HashSet<String> a() {
        return this.f24555e;
    }

    public HashSet<String> b() {
        return this.f;
    }

    private void a(com.iab.omid.library.vungle.adsession.a aVar) {
        Iterator<com.iab.omid.library.vungle.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.vungle.b.c cVar, com.iab.omid.library.vungle.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0315a c0315a = this.f24552b.get(view);
        if (c0315a != null) {
            c0315a.a(aVar.getAdSessionId());
        } else {
            this.f24552b.put(view, new C0315a(cVar, aVar.getAdSessionId()));
        }
    }
}
