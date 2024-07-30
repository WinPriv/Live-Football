package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.c;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, Boolean> f12384b = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Boolean> f12385a;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Boolean> f12386c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f12387d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Boolean> f12388e;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static l f12389a = new l(0);

        private a() {
        }
    }

    public /* synthetic */ l(byte b10) {
        this();
    }

    public static l a() {
        return a.f12389a;
    }

    public static void c(String str) {
        if (f12384b == null) {
            f12384b = new HashMap();
        }
        f12384b.put(str, Boolean.TRUE);
    }

    private void e(String str) {
        if (this.f12387d == null) {
            this.f12387d = new HashMap();
        }
        this.f12387d.put(str, Boolean.FALSE);
    }

    private void f(String str) {
        if (this.f12388e.containsKey(str)) {
            this.f12388e.remove(str);
        }
    }

    private static boolean g(String str) {
        boolean a10 = a(f12384b, str);
        if (a10 || com.anythink.expressad.foundation.g.d.b.a(com.anythink.expressad.foundation.b.a.b().d()).b(str)) {
            return true;
        }
        return a10;
    }

    private static boolean h(String str) {
        String d10 = com.anythink.expressad.foundation.h.m.d(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_VC));
        File file = new File(a3.l.p(sb2, File.separator, d10));
        try {
            if (!file.exists() || !file.isFile()) {
                return false;
            }
            if (!file.canRead()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f6552a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    public final boolean b(String str) {
        if (this.f12386c == null || TextUtils.isEmpty(str) || !this.f12386c.containsKey(str)) {
            return false;
        }
        return this.f12386c.get(str).booleanValue();
    }

    public final boolean d(String str) {
        if (TextUtils.isEmpty(str) || !this.f12388e.containsKey(str)) {
            return false;
        }
        return this.f12388e.get(str).booleanValue();
    }

    private l() {
        this.f12385a = new HashMap();
        this.f12386c = new HashMap();
        this.f12387d = new HashMap();
        this.f12388e = new HashMap();
    }

    public final boolean a(String str) {
        if (this.f12385a == null || TextUtils.isEmpty(str) || !this.f12385a.containsKey(str)) {
            return false;
        }
        return this.f12385a.get(str).booleanValue();
    }

    public final void b(String str, boolean z10) {
        if (this.f12386c == null) {
            this.f12386c = new HashMap();
        }
        this.f12386c.put(str, Boolean.valueOf(z10));
    }

    public final void a(List<com.anythink.expressad.foundation.d.c> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (com.anythink.expressad.foundation.d.c cVar : list) {
            if (cVar != null) {
                b(cVar);
                e(cVar.aZ());
            }
        }
    }

    public final void c(String str, boolean z10) {
        if (this.f12388e == null) {
            this.f12388e = new HashMap();
        }
        this.f12388e.put(str, Boolean.valueOf(z10));
    }

    private void b(com.anythink.expressad.foundation.d.c cVar) {
        List<c.C0119c.a> f;
        if (cVar != null) {
            String S = cVar.S();
            Map<String, Boolean> map = this.f12385a;
            if (map != null && !map.containsKey(S)) {
                this.f12385a.put(S, Boolean.FALSE);
            }
            String I = cVar.I();
            Map<String, Boolean> map2 = this.f12386c;
            if (map2 != null && !map2.containsKey(I)) {
                this.f12386c.put(I, Boolean.FALSE);
            }
            c.C0119c M = cVar.M();
            if (M == null || (f = M.f()) == null) {
                return;
            }
            for (c.C0119c.a aVar : f) {
                if (aVar != null) {
                    b(aVar.f9536b);
                }
            }
        }
    }

    private void a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            b(cVar);
            e(cVar.aZ());
        }
    }

    public final void a(String str, boolean z10) {
        if (this.f12385a == null) {
            this.f12385a = new HashMap();
        }
        this.f12385a.put(str, Boolean.valueOf(z10));
    }

    private static boolean a(Map<String, Boolean> map, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (map != null) {
            if (map.containsKey(str)) {
                return map.get(str).booleanValue();
            }
            map.put(str, Boolean.FALSE);
            return false;
        }
        new HashMap().put(str, Boolean.FALSE);
        return false;
    }

    private static void b(List<String> list) {
        Map<String, Boolean> map;
        if (list == null || list.size() == 0) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && (map = f12384b) != null && !map.containsKey(str)) {
                f12384b.put(str, Boolean.valueOf(com.anythink.expressad.foundation.g.d.b.a(com.anythink.expressad.foundation.b.a.b().d()).b(str)));
            }
        }
    }

    private boolean a(boolean z10, String str) {
        boolean a10 = a(this.f12386c, str);
        if (a10 || !z10 || TextUtils.isEmpty(i.a().c(str))) {
            return a10;
        }
        this.f12386c.put(str, Boolean.TRUE);
        return true;
    }

    private static boolean a(c.C0119c c0119c) {
        List<c.C0119c.a> f;
        List<String> list;
        if (c0119c != null && (f = c0119c.f()) != null) {
            for (c.C0119c.a aVar : f) {
                if (aVar != null && (list = aVar.f9536b) != null) {
                    for (String str : list) {
                        boolean a10 = a(f12384b, str);
                        if (a10 || com.anythink.expressad.foundation.g.d.b.a(com.anythink.expressad.foundation.b.a.b().d()).b(str)) {
                            a10 = true;
                        }
                        if (!a10) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
