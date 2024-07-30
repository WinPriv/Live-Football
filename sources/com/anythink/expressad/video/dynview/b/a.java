package com.anythink.expressad.video.dynview.b;

import android.view.View;
import com.anythink.expressad.video.dynview.c;
import com.anythink.expressad.video.dynview.f.e;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f11410b;

    /* renamed from: a, reason: collision with root package name */
    public com.anythink.expressad.video.dynview.e.a f11411a;

    private a() {
    }

    public static a a() {
        a aVar;
        if (f11410b == null) {
            synchronized (a.class) {
                if (f11410b == null) {
                    f11410b = new a();
                }
                aVar = f11410b;
            }
            return aVar;
        }
        return f11410b;
    }

    private static void b(c cVar, View view, Map map, e eVar) {
        new com.anythink.expressad.video.dynview.j.a().b(cVar, view, map, eVar);
    }

    private static void c(c cVar, View view, Map map, e eVar) {
        new com.anythink.expressad.video.dynview.j.a().c(cVar, view, map, eVar);
    }

    private void e() {
        com.anythink.expressad.video.dynview.e.a aVar = this.f11411a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public static void b() {
        if (f11410b != null) {
            f11410b = null;
        }
    }

    private void c() {
        com.anythink.expressad.video.dynview.e.a aVar = this.f11411a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void a(View view, c cVar, Map map, e eVar) {
        int h10 = cVar.h();
        if (h10 == 1) {
            com.anythink.expressad.video.dynview.j.a aVar = new com.anythink.expressad.video.dynview.j.a();
            aVar.a(cVar, view, map, eVar);
            this.f11411a = aVar.f11492b;
        } else {
            if (h10 == 102 || h10 == 202 || h10 == 302 || h10 == 802 || h10 == 904) {
                new com.anythink.expressad.video.dynview.j.a().b(cVar, view, map, eVar);
                return;
            }
            if (h10 == 4) {
                new com.anythink.expressad.video.dynview.j.a().a(cVar, view, eVar);
            } else if (h10 != 5) {
                eVar.a(view, new ArrayList());
            } else {
                new com.anythink.expressad.video.dynview.j.a().c(cVar, view, map, eVar);
            }
        }
    }

    private void a(c cVar, View view, Map map, e eVar) {
        com.anythink.expressad.video.dynview.j.a aVar = new com.anythink.expressad.video.dynview.j.a();
        aVar.a(cVar, view, map, eVar);
        this.f11411a = aVar.f11492b;
    }

    private static void a(c cVar, View view, e eVar) {
        new com.anythink.expressad.video.dynview.j.a().a(cVar, view, eVar);
    }

    private static void d() {
    }
}
