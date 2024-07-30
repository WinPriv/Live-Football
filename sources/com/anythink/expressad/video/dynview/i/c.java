package com.anythink.expressad.video.dynview.i;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.k.d;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    private static boolean a(List<com.anythink.expressad.foundation.d.c> list) {
        com.anythink.expressad.foundation.d.c cVar;
        if (list == null || list.size() <= 0 || (cVar = list.get(0)) == null) {
            return false;
        }
        return cVar.j();
    }

    private static int b(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null && cVar.M() != null) {
            return cVar.M().c();
        }
        return 1;
    }

    private static void a(com.anythink.expressad.foundation.d.c cVar, Activity activity) {
        if (cVar == null || cVar.M() == null) {
            return;
        }
        int c10 = cVar.M().c();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (c10 == 1) {
            activity.setRequestedOrientation(7);
            return;
        }
        if (c10 != 2) {
            if (a((Context) activity)) {
                activity.setRequestedOrientation(6);
                return;
            } else {
                activity.setRequestedOrientation(7);
                return;
            }
        }
        activity.setRequestedOrientation(6);
    }

    private static void a(Activity activity) {
        if (a((Context) activity)) {
            activity.setRequestedOrientation(6);
        } else {
            activity.setRequestedOrientation(7);
        }
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private static String a(long j10, Context context) {
        String f = d.f(context);
        if (f.startsWith(com.anythink.expressad.video.dynview.a.a.V)) {
            if (!f.contains(com.anythink.expressad.video.dynview.a.a.f11380ad) && !f.contains(com.anythink.expressad.video.dynview.a.a.ae)) {
                return j10 + com.anythink.expressad.video.dynview.a.a.F;
            }
            return j10 + com.anythink.expressad.video.dynview.a.a.G;
        }
        if (f.startsWith(com.anythink.expressad.video.dynview.a.a.W)) {
            return j10 + com.anythink.expressad.video.dynview.a.a.I;
        }
        if (f.startsWith(com.anythink.expressad.video.dynview.a.a.X)) {
            return l.k(com.anythink.expressad.video.dynview.a.a.J, j10, " Sekunden");
        }
        if (f.startsWith(com.anythink.expressad.video.dynview.a.a.Y)) {
            return j10 + com.anythink.expressad.video.dynview.a.a.K;
        }
        if (f.startsWith(com.anythink.expressad.video.dynview.a.a.Z)) {
            return l.k(com.anythink.expressad.video.dynview.a.a.L, j10, " secondes");
        }
        if (f.startsWith(com.anythink.expressad.video.dynview.a.a.f11377aa)) {
            return l.k(" ثوان", j10, com.anythink.expressad.video.dynview.a.a.M);
        }
        if (f.startsWith(com.anythink.expressad.video.dynview.a.a.f11378ab)) {
            return l.k(com.anythink.expressad.video.dynview.a.a.N, j10, " секунд");
        }
        return l.k(com.anythink.expressad.video.dynview.a.a.H, j10, " s");
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter(com.anythink.expressad.video.dynview.a.a.Q);
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("1");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null && cVar.M() != null) {
            int b10 = cVar.M().b();
            if (b10 == 302 || b10 == 802) {
                return -3;
            }
            if (b10 == 904) {
                return !a(cVar.M().e()) ? -1 : -3;
            }
        }
        return 100;
    }
}
