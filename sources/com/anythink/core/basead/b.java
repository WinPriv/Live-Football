package com.anythink.core.basead;

import android.content.Context;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.p;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f4689a;

    private b() {
    }

    public static b a() {
        if (f4689a == null) {
            synchronized (b.class) {
                if (f4689a == null) {
                    f4689a = new b();
                }
            }
        }
        return f4689a;
    }

    public static void b(Context context, String str) {
        p.a(context, g.f5014v, str);
    }

    public static void a(Context context, String str, String str2) {
        p.a(context, g.f5014v, str, str2);
    }

    public static String a(Context context, String str) {
        return p.b(context, g.f5014v, str, "");
    }

    public static String a(j jVar) {
        return jVar == null ? "" : a(jVar.f5654b, jVar.f5655c, jVar.f);
    }

    public static String a(String str, String str2, int i10) {
        return str + "_" + str2 + "_" + i10;
    }
}
