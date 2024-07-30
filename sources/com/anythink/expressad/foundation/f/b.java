package com.anythink.expressad.foundation.f;

import a3.l;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.f.a.a;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.widget.FeedBackButton;
import com.anythink.expressad.widget.a.c;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f9756a = -2;

    /* renamed from: b, reason: collision with root package name */
    public static int f9757b = -2;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f9758c = false;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.anythink.expressad.foundation.f.a.a> f9759d;

    /* renamed from: e, reason: collision with root package name */
    private final RelativeLayout.LayoutParams f9760e;
    private com.anythink.expressad.d.a f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f9761a = new b(0);
    }

    public /* synthetic */ b(byte b10) {
        this();
    }

    public static b a() {
        return a.f9761a;
    }

    private static boolean b(Context context, c cVar) {
        Activity a10 = a(context);
        if (a10 == null || cVar == null || a10.isDestroyed()) {
            return false;
        }
        try {
            if (cVar.isShowing() || a10.isFinishing()) {
                return false;
            }
            cVar.show();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private void c(String str, int i10) {
        com.anythink.expressad.foundation.f.a.a a10 = a(str);
        if (i10 == 1) {
            a10.b();
        } else {
            a10.a();
        }
    }

    private com.anythink.expressad.foundation.f.a.a d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.anythink.expressad.foundation.b.a.b().e();
        }
        if (this.f9759d.containsKey(str)) {
            return this.f9759d.get(str);
        }
        return null;
    }

    private void e(String str) {
        a(str).e();
    }

    private b() {
        this.f9759d = new ConcurrentHashMap<>();
        this.f9760e = new RelativeLayout.LayoutParams(f9756a, f9757b);
    }

    public static Activity a(Context context) {
        Activity activity;
        Context g6 = com.anythink.expressad.foundation.b.a.b().g();
        Activity activity2 = null;
        try {
            activity = g6 instanceof Activity ? (Activity) g6 : null;
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                activity = (Activity) context;
            }
            if (activity == null || activity.isFinishing()) {
                return null;
            }
            if (activity.isDestroyed()) {
                return null;
            }
            return activity;
        } catch (Exception e11) {
            e = e11;
            activity2 = activity;
            e.printStackTrace();
            return activity2;
        }
    }

    public final void c(String str) {
        try {
            String e10 = TextUtils.isEmpty(str) ? com.anythink.expressad.foundation.b.a.b().e() : str;
            com.anythink.expressad.foundation.f.a.a aVar = this.f9759d.containsKey(e10) ? this.f9759d.get(e10) : null;
            if (aVar != null) {
                aVar.d();
            }
            this.f9759d.remove(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final boolean b() {
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.d.a c10 = com.anythink.expressad.d.b.c();
        this.f = c10;
        return c10.K() != 0;
    }

    public final void b(String str, int i10) {
        a(str).c(i10);
    }

    public static boolean a(Context context, c cVar) {
        if (cVar == null) {
            o.b("", "mbAlertDialog  is null");
            return false;
        }
        return b(context, cVar);
    }

    public final FeedBackButton b(String str) {
        return a(str).c();
    }

    private void a(String str, int i10, ViewGroup viewGroup) {
        com.anythink.expressad.foundation.f.a.a a10 = a(str);
        if (a10.c() != null) {
            a10.a(i10);
            if (i10 == 0) {
                a(str, n.a().g(), viewGroup, null, null);
            }
        }
    }

    private void a(String str, int i10, int i11, int i12, float f, float f10, float f11, String str2, String str3) {
        com.anythink.expressad.foundation.f.a.a a10 = a(str);
        Context g6 = n.a().g();
        a10.a(t.b(g6, f), t.b(g6, f10), t.b(g6, i10), t.b(g6, i11), t.b(g6, i12), f11, str2, str3);
    }

    private void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        a(str, context, viewGroup, layoutParams, null);
    }

    public final void a(String str, com.anythink.expressad.foundation.f.a aVar) {
        a(str).a(new a.C0120a(str, aVar));
    }

    public final void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.anythink.expressad.foundation.f.a aVar) {
        if (b()) {
            com.anythink.expressad.foundation.f.a.a a10 = a(str);
            if (aVar != null) {
                a10.a(new a.C0120a(str, aVar));
            }
            FeedBackButton c10 = a10.c();
            if (c10 != null) {
                if (layoutParams == null) {
                    int f = l.f(10.0f);
                    this.f9760e.setMargins(f, f, f, f);
                    layoutParams = this.f9760e;
                }
                ViewGroup viewGroup2 = (ViewGroup) c10.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(c10);
                }
                Activity a11 = a(context);
                if (a11 != null && viewGroup == null) {
                    viewGroup = (ViewGroup) a11.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(c10);
                    viewGroup.addView(c10, layoutParams);
                }
            }
        }
    }

    public final void a(String str, com.anythink.expressad.foundation.d.c cVar) {
        a(str).a(cVar);
    }

    public final void a(String str, int i10) {
        a(str).b(i10);
    }

    public final com.anythink.expressad.foundation.f.a.a a(String str) {
        com.anythink.expressad.foundation.f.a.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = com.anythink.expressad.foundation.b.a.b().e();
        }
        if (!this.f9759d.containsKey(str)) {
            aVar = new com.anythink.expressad.foundation.f.a.a(str);
            this.f9759d.put(str, aVar);
        } else {
            aVar = this.f9759d.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        com.anythink.expressad.foundation.f.a.a aVar2 = new com.anythink.expressad.foundation.f.a.a(str);
        this.f9759d.put(str, aVar2);
        return aVar2;
    }

    public final void a(String str, FeedBackButton feedBackButton) {
        a(str).a(feedBackButton);
    }
}
