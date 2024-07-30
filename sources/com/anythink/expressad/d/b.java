package com.anythink.expressad.d;

import android.content.Context;
import android.text.TextUtils;
import e0.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7185a = "b";

    /* renamed from: b, reason: collision with root package name */
    public static final int f7186b = 500;

    /* renamed from: c, reason: collision with root package name */
    public static final String f7187c = "anythink";

    /* renamed from: d, reason: collision with root package name */
    private static volatile b f7188d;

    /* renamed from: e, reason: collision with root package name */
    private static HashMap<String, c> f7189e = new HashMap<>();
    private static a f = null;

    private b() {
    }

    private static void a(String str, String str2, String str3) {
        String f10 = i.f(str, "_", str2);
        com.anythink.expressad.foundation.a.a.a.a().a(f10, str3);
        f7189e.put(f10, c.b(str3));
    }

    public static a b() {
        if (f == null) {
            f = c();
        }
        return f;
    }

    public static c c(String str, String str2) {
        c g6 = g(str, str2);
        if (g6 != null && g6.k() == 0) {
            g6.l();
        }
        return g6;
    }

    public static c d(String str, String str2) {
        return g(str, str2);
    }

    public static void e(String str, String str2) {
        com.anythink.expressad.foundation.a.a.a.a().a("ivreward_".concat(String.valueOf(str)), str2);
    }

    private static void f(String str, String str2) {
        com.anythink.expressad.foundation.a.a.a.a().a(str, str2);
        a b10 = a.b(str2);
        f = b10;
        if (b10 != null) {
            b10.G();
        }
    }

    private static c g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.anythink.expressad.foundation.b.a.b().e();
        }
        String f10 = i.f(str, "_", str2);
        if (f7189e.containsKey(f10)) {
            return f7189e.get(f10);
        }
        c cVar = null;
        try {
            cVar = c.b(com.anythink.expressad.foundation.a.a.a.a().a(f10));
            f7189e.put(f10, cVar);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return cVar;
    }

    private static c d(String str) {
        c cVar = new c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        cVar.v();
        cVar.u();
        cVar.a(str);
        cVar.a(arrayList);
        cVar.b(arrayList2);
        cVar.p();
        cVar.r();
        cVar.q();
        cVar.o();
        cVar.n();
        cVar.j();
        cVar.l();
        cVar.c(100);
        cVar.d(0);
        cVar.h();
        cVar.e();
        cVar.c();
        cVar.w();
        cVar.x();
        return cVar;
    }

    public static String b(String str) {
        return com.anythink.expressad.foundation.a.a.a.a().a("ivreward_".concat(String.valueOf(str)));
    }

    public static void c(String str) {
        com.anythink.expressad.foundation.a.a.a.a().b("ivreward_".concat(String.valueOf(str)));
    }

    public static c b(String str, String str2) {
        c g6 = g(str, str2);
        return g6 == null ? new c() : g6;
    }

    public static a c() {
        a aVar = new a();
        aVar.A();
        aVar.B();
        aVar.y();
        aVar.z();
        aVar.w();
        aVar.u();
        aVar.m();
        aVar.a("anythink");
        aVar.j();
        aVar.p();
        aVar.o();
        aVar.s();
        aVar.e();
        aVar.d();
        aVar.f();
        aVar.g();
        aVar.h();
        aVar.i();
        aVar.c();
        aVar.c(com.anythink.expressad.d.a.b.df);
        aVar.a(120);
        aVar.O();
        aVar.N();
        aVar.a(100);
        aVar.Q();
        aVar.e(com.anythink.expressad.foundation.g.a.cH);
        aVar.d(com.anythink.expressad.foundation.g.a.cJ);
        aVar.c(com.anythink.expressad.foundation.g.a.cI);
        aVar.a();
        aVar.f(com.anythink.expressad.foundation.g.a.cO);
        aVar.b(10);
        return aVar;
    }

    public static b a() {
        if (f7188d == null) {
            synchronized (b.class) {
                if (f7188d == null) {
                    f7188d = new b();
                }
            }
        }
        return f7188d;
    }

    public static String a(String str) {
        return str == null ? "" : b().R();
    }

    private static void a(Context context, String str) {
        try {
            Map<String, ?> all = context.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0).getAll();
            for (String str2 : all.keySet()) {
                if (str2.startsWith(str + "_")) {
                    f7189e.put(str2, c.b((String) all.get(str2)));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static c a(String str, String str2) {
        c c10 = c(str, str2);
        return c10 == null ? new c() : c10;
    }
}
