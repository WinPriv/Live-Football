package com.anythink.expressad.video.dynview.j;

import android.content.Context;
import android.view.View;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.dynview.c;
import com.anythink.expressad.videocommon.e.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11553a = "ViewOptionWrapper";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11554b = "\\.xml";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11555c = "\\/xml";

    private static String a(int i10) {
        return i10 != 3 ? i10 != 302 ? i10 != 802 ? i10 != 904 ? "anythink_reward_layer_floor" : com.anythink.expressad.video.dynview.a.a.f11385g : com.anythink.expressad.video.dynview.a.a.f : com.anythink.expressad.video.dynview.a.a.f11384e : com.anythink.expressad.video.dynview.a.a.f11386h;
    }

    public static com.anythink.expressad.video.dynview.c b(View view, com.anythink.expressad.foundation.d.c cVar) {
        if (cVar == null) {
            return null;
        }
        try {
            String K = cVar.K();
            String a10 = a(3);
            d a11 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), K, false);
            int h10 = a11 != null ? a11.h() : 0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            return new c.a().a(a10).a(3).a(arrayList).a(view.getContext()).a(view).c(h10).b(k.b(view.getContext())).d(3).a();
        } catch (Exception e10) {
            o.d(f11553a, e10.getMessage());
            return null;
        }
    }

    public static com.anythink.expressad.video.dynview.c a(Context context, List<com.anythink.expressad.foundation.d.c> list) {
        int i10;
        if (list == null) {
            return null;
        }
        try {
            float f = t.f(n.a().g());
            float e10 = t.e(n.a().g());
            if (list.size() <= 0 || list.get(0) == null) {
                i10 = 1;
            } else {
                com.anythink.expressad.foundation.d.c cVar = list.get(0);
                i10 = (cVar == null || cVar.M() == null) ? 1 : cVar.M().c();
                list.get(0).as();
                list.get(0).aq();
            }
            String str = com.anythink.expressad.video.dynview.a.a.f11388j;
            if (i10 != 1) {
                if (i10 == 2) {
                    str = com.anythink.expressad.video.dynview.a.a.f11387i;
                } else if (com.anythink.expressad.video.dynview.i.c.a(context)) {
                    str = com.anythink.expressad.video.dynview.a.a.f11387i;
                    i10 = 2;
                } else {
                    i10 = 1;
                }
            }
            return new c.a().a(context).a(str).a(1).a(e10).b(f).a(list).b(i10).b("").a();
        } catch (Exception e11) {
            o.d(f11553a, e11.getMessage());
            return null;
        }
    }

    public static com.anythink.expressad.video.dynview.c b(Context context, List<com.anythink.expressad.foundation.d.c> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        try {
            float f = t.f(n.a().g());
            float e10 = t.e(n.a().g());
            int i10 = 0;
            if (list.get(0) != null) {
                int k10 = list.get(0).k();
                list.get(0).as();
                list.get(0).aq();
                i10 = k10;
            }
            int b10 = k.b(context);
            return new c.a().a(b10 == 1 ? com.anythink.expressad.video.dynview.a.a.f11389k : com.anythink.expressad.video.dynview.a.a.f11390l).a(5).a(context).a(e10).b(f).a(list).b(b10).b("").e(i10).d(i10).a();
        } catch (Exception e11) {
            o.d(f11553a, e11.getMessage());
            return null;
        }
    }

    public static com.anythink.expressad.video.dynview.c a(View view, com.anythink.expressad.foundation.d.c cVar) {
        int i10;
        String str;
        if (cVar == null) {
            return null;
        }
        try {
            String K = cVar.K();
            if (cVar.M() != null) {
                i10 = cVar.M().b();
                str = cVar.M().e();
            } else {
                i10 = 102;
                str = "";
            }
            String a10 = a(i10);
            boolean a11 = com.anythink.expressad.video.dynview.i.c.a(str);
            d a12 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), K, false);
            int h10 = a12 != null ? a12.h() : 0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            return new c.a().a(a10).a(i10).a(arrayList).a(view.getContext()).a(view).c(h10).b(k.b(view.getContext())).d(i10).a(a11).b("").e(cVar.k()).a();
        } catch (Exception e10) {
            o.d(f11553a, e10.getMessage());
            return null;
        }
    }

    public static com.anythink.expressad.video.dynview.c a(Context context, com.anythink.expressad.foundation.d.c cVar, int i10) {
        if (cVar == null) {
            return null;
        }
        try {
            return new c.a().a(k.b(context) == 1 ? com.anythink.expressad.video.dynview.a.a.f11381b : com.anythink.expressad.video.dynview.a.a.f11376a).a(4).a(context).b(k.b(context)).b("").e(cVar.k()).d(i10).a();
        } catch (Exception e10) {
            o.d(f11553a, e10.getMessage());
            return null;
        }
    }
}
