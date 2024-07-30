package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f24442a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0312a> f24443b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f24444c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f24445d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f24446e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f24447g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f24448h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f24449i;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0312a {

        /* renamed from: a, reason: collision with root package name */
        private final e f24450a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f24451b = new ArrayList<>();

        public C0312a(e eVar, String str) {
            this.f24450a = eVar;
            a(str);
        }

        public e a() {
            return this.f24450a;
        }

        public ArrayList<String> b() {
            return this.f24451b;
        }

        public void a(String str) {
            this.f24451b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f24448h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f24448h.containsKey(view)) {
            return this.f24448h.get(view);
        }
        Map<View, Boolean> map = this.f24448h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f24444c.get(str);
    }

    public C0312a c(View view) {
        C0312a c0312a = this.f24443b.get(view);
        if (c0312a != null) {
            this.f24443b.remove(view);
        }
        return c0312a;
    }

    public String d(View view) {
        if (this.f24442a.size() == 0) {
            return null;
        }
        String str = this.f24442a.get(view);
        if (str != null) {
            this.f24442a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f24445d.contains(view) ? c.PARENT_VIEW : this.f24449i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (this.f24448h.containsKey(view)) {
            this.f24448h.put(view, Boolean.TRUE);
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
        this.f24445d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f24447g.get(str);
    }

    public HashSet<String> c() {
        return this.f24446e;
    }

    public void d() {
        this.f24449i = true;
    }

    public void e() {
        com.iab.omid.library.ironsrc.internal.c c10 = com.iab.omid.library.ironsrc.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : c10.a()) {
                View c11 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c11 != null) {
                        String a10 = a(c11);
                        if (a10 == null) {
                            this.f24446e.add(adSessionId);
                            this.f24442a.put(c11, adSessionId);
                            a(aVar);
                        } else if (a10 != "noWindowFocus") {
                            this.f.add(adSessionId);
                            this.f24444c.put(adSessionId, c11);
                            this.f24447g.put(adSessionId, a10);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.f24447g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f24442a.clear();
        this.f24443b.clear();
        this.f24444c.clear();
        this.f24445d.clear();
        this.f24446e.clear();
        this.f.clear();
        this.f24447g.clear();
        this.f24449i = false;
    }

    public HashSet<String> b() {
        return this.f;
    }

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0312a c0312a = this.f24443b.get(view);
        if (c0312a != null) {
            c0312a.a(aVar.getAdSessionId());
        } else {
            this.f24443b.put(view, new C0312a(eVar, aVar.getAdSessionId()));
        }
    }
}
