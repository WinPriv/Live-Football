package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.common.b.g;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile i f6015a;

    private i() {
    }

    private static String a(String str) {
        return str;
    }

    public static String b() {
        return m() ? g.c.f5050s : g.c.f5039g;
    }

    public static String c() {
        if (m()) {
            return g.c.f5051t;
        }
        return g.c.f5040h;
    }

    public static String d() {
        if (m()) {
            return g.c.f5054w;
        }
        return g.c.f5043k;
    }

    public static String e() {
        if (m()) {
            return g.c.C;
        }
        return g.c.f5049r;
    }

    public static String f() {
        String str;
        com.anythink.core.common.e.n r10 = a3.k.e().b(com.anythink.core.common.b.n.a().p()).r();
        if (m()) {
            str = g.c.y;
        } else {
            str = g.c.f5045m;
        }
        if (r10 != null) {
            return a(r10.b(), str);
        }
        return str;
    }

    public static String g() {
        String str;
        com.anythink.core.common.e.n r10 = a3.k.e().b(com.anythink.core.common.b.n.a().p()).r();
        if (m()) {
            str = g.c.f5056z;
        } else {
            str = g.c.f5046n;
        }
        if (r10 != null) {
            return a(r10.d(), str);
        }
        return str;
    }

    public static String h() {
        String str;
        com.anythink.core.common.e.n r10 = a3.k.e().b(com.anythink.core.common.b.n.a().p()).r();
        if (m()) {
            str = g.c.A;
        } else {
            str = g.c.o;
        }
        if (r10 != null) {
            return a(r10.a(), str);
        }
        return str;
    }

    public static String i() {
        String str;
        com.anythink.core.c.a h10 = a3.l.h(a3.k.e());
        if (m()) {
            str = g.c.B;
        } else {
            str = g.c.f5048q;
        }
        if (h10 != null) {
            return a(h10.o(), str);
        }
        return str;
    }

    public static String j() {
        String str;
        com.anythink.core.c.a h10 = a3.l.h(a3.k.e());
        if (m()) {
            str = g.c.f5053v;
        } else {
            str = g.c.f5042j;
        }
        if (h10 != null) {
            return a(h10.X(), str);
        }
        return str;
    }

    public static String k() {
        String str;
        com.anythink.core.c.a h10 = a3.l.h(a3.k.e());
        if (m()) {
            str = g.c.f5052u;
        } else {
            str = g.c.f5041i;
        }
        if (h10 != null) {
            return a(h10.ac(), str);
        }
        return str;
    }

    public static String l() {
        com.anythink.core.c.a h10 = a3.l.h(a3.k.e());
        if (h10 != null) {
            return a(h10.T(), g.q.f5148a);
        }
        return g.q.f5148a;
    }

    private static boolean m() {
        if (com.anythink.core.common.b.n.a().D() && com.anythink.core.common.b.n.a().C()) {
            return true;
        }
        return false;
    }

    public static i a() {
        if (f6015a == null) {
            synchronized (i.class) {
                if (f6015a == null) {
                    f6015a = new i();
                }
            }
        }
        return f6015a;
    }

    public static String b(com.anythink.core.c.d dVar) {
        return dVar.q();
    }

    public static String a(com.anythink.core.c.d dVar, boolean z10) {
        if (z10) {
            String v3 = dVar.v();
            dVar.an();
            if (!TextUtils.isEmpty(v3)) {
                return v3;
            }
        }
        com.anythink.core.common.e.n r10 = a3.k.e().b(com.anythink.core.common.b.n.a().p()).r();
        String str = m() ? g.c.f5055x : g.c.f5044l;
        return r10 != null ? a(r10.c(), str) : str;
    }

    public static String a(com.anythink.core.c.d dVar) {
        String r10 = dVar.r();
        return TextUtils.isEmpty(r10) ? "" : r10;
    }

    private static String a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }
}
