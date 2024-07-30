package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24324a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0309a> f24325b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24326c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24327d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24328e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24329g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f24330h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f24331i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0309a {

        /* renamed from: a, reason: collision with root package name */
        private final e f24332a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24333b = new ArrayList<>();

        public C0309a(e eVar, String str) {
            this.f24332a = eVar;
            a(str);
        }

        public e a() {
            return this.f24332a;
        }

        public ArrayList<String> b() {
            return this.f24333b;
        }

        public void a(String str) {
            this.f24333b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f24330h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f24330h.containsKey(view)) {
            return this.f24330h.get(view);
        }
        Map<View, Boolean> map = this.f24330h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f24326c.get(str);
    }

    public C0309a c(View view) {
        C0309a c0309a = this.f24325b.get(view);
        if (c0309a != null) {
            this.f24325b.remove(view);
        }
        return c0309a;
    }

    public String d(View view) {
        if (this.f24324a.size() == 0) {
            return null;
        }
        String str = this.f24324a.get(view);
        if (str != null) {
            this.f24324a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f24327d.contains(view) ? c.PARENT_VIEW : this.f24331i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (this.f24330h.containsKey(view)) {
            this.f24330h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a10 = h.a(view);
            if (a10 != null) {
                return a10;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f24327d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f24329g.get(str);
    }

    public HashSet<String> c() {
        return this.f24328e;
    }

    public void d() {
        this.f24331i = true;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c c10 = com.iab.omid.library.applovin.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : c10.a()) {
                View c11 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c11 != null) {
                        String a10 = a(c11);
                        if (a10 == null) {
                            this.f24328e.add(adSessionId);
                            this.f24324a.put(c11, adSessionId);
                            a(aVar);
                        } else if (a10 != "noWindowFocus") {
                            this.f.add(adSessionId);
                            this.f24326c.put(adSessionId, c11);
                            this.f24329g.put(adSessionId, a10);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.f24329g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f24324a.clear();
        this.f24325b.clear();
        this.f24326c.clear();
        this.f24327d.clear();
        this.f24328e.clear();
        this.f.clear();
        this.f24329g.clear();
        this.f24331i = false;
    }

    public HashSet<String> b() {
        return this.f;
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0309a c0309a = this.f24325b.get(view);
        if (c0309a != null) {
            c0309a.a(aVar.getAdSessionId());
        } else {
            this.f24325b.put(view, new C0309a(eVar, aVar.getAdSessionId()));
        }
    }
}
