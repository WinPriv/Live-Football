package com.anythink.expressad.video.dynview.b;

import android.view.View;
import com.anythink.expressad.video.dynview.c;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f11412a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (f11412a == null) {
            synchronized (b.class) {
                if (f11412a == null) {
                    f11412a = new b();
                }
                bVar = f11412a;
            }
            return bVar;
        }
        return f11412a;
    }

    private static void b(View view, c cVar) {
        new com.anythink.expressad.video.dynview.j.b().a(view, cVar);
    }

    private static void c() {
        new com.anythink.expressad.video.dynview.j.b();
    }

    private static void d(View view, c cVar) {
        new com.anythink.expressad.video.dynview.j.b().c(view, cVar);
    }

    public static void b() {
        if (f11412a != null) {
            f11412a = null;
        }
    }

    private static void c(View view, c cVar) {
        new com.anythink.expressad.video.dynview.j.b().b(view, cVar);
    }

    public static void a(View view, c cVar) {
        if (cVar == null) {
            return;
        }
        int h10 = cVar.h();
        if (h10 == 1) {
            new com.anythink.expressad.video.dynview.j.b().a(view);
            return;
        }
        if (h10 == 102 || h10 == 202 || h10 == 302 || h10 == 802 || h10 == 904) {
            new com.anythink.expressad.video.dynview.j.b().a(view, cVar);
            return;
        }
        if (h10 == 3) {
            new com.anythink.expressad.video.dynview.j.b().b(view, cVar);
        } else if (h10 == 4) {
            new com.anythink.expressad.video.dynview.j.b().c(view, cVar);
        } else {
            if (h10 != 5) {
                return;
            }
            new com.anythink.expressad.video.dynview.j.b();
        }
    }

    private static void a(View view) {
        new com.anythink.expressad.video.dynview.j.b().a(view);
    }
}
