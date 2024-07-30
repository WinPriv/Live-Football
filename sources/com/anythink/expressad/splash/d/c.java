package com.anythink.expressad.splash.d;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.core.common.a.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.u;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.out.e;
import com.anythink.expressad.out.t;
import com.anythink.expressad.splash.view.ATSplashPopView;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.ATSplashWebview;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: b, reason: collision with root package name */
    private static String f11021b = "SplashProvider";
    private Context A;
    private boolean B;
    private com.anythink.expressad.foundation.d.c C;
    private ATSplashPopView D;

    /* renamed from: c, reason: collision with root package name */
    private String f11023c;

    /* renamed from: d, reason: collision with root package name */
    private String f11024d;
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private int f11026g;

    /* renamed from: h, reason: collision with root package name */
    private int f11027h;

    /* renamed from: i, reason: collision with root package name */
    private com.anythink.expressad.splash.c.c f11028i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.expressad.splash.c.d f11029j;

    /* renamed from: k, reason: collision with root package name */
    private b f11030k;

    /* renamed from: l, reason: collision with root package name */
    private e f11031l;

    /* renamed from: m, reason: collision with root package name */
    private d f11032m;

    /* renamed from: n, reason: collision with root package name */
    private ATSplashView f11033n;
    private ATSplashWebview o;

    /* renamed from: p, reason: collision with root package name */
    private ViewGroup f11034p;

    /* renamed from: q, reason: collision with root package name */
    private View f11035q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.expressad.d.c f11036r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f11037s;

    /* renamed from: t, reason: collision with root package name */
    private ViewGroup f11038t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f11039u;

    /* renamed from: w, reason: collision with root package name */
    private int f11041w;

    /* renamed from: x, reason: collision with root package name */
    private int f11042x;

    /* renamed from: e, reason: collision with root package name */
    private int f11025e = 5;

    /* renamed from: v, reason: collision with root package name */
    private int f11040v = 1;
    private Object y = new Object();

    /* renamed from: z, reason: collision with root package name */
    private Object f11043z = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f11022a = false;
    private boolean E = false;
    private boolean F = false;

    public c(Context context, String str, String str2) {
        this.f11041w = k.e(n.a().g());
        this.f11042x = k.f(n.a().g());
        this.f11041w = context.getResources().getDisplayMetrics().widthPixels;
        this.f11042x = context.getResources().getDisplayMetrics().heightPixels;
        this.f11024d = str;
        this.f11023c = str2;
        this.A = context;
        if (this.f11029j == null) {
            this.f11029j = new com.anythink.expressad.splash.c.d(context, str, str2);
        }
        if (this.o == null) {
            try {
                this.o = new ATSplashWebview(context);
            } catch (Exception unused) {
            }
            ATSplashWebview aTSplashWebview = this.o;
            if (aTSplashWebview != null) {
                aTSplashWebview.setWebViewClient(new com.anythink.expressad.splash.view.b(this.f11023c, this.f11029j.a()));
            }
        }
        if (this.f11033n == null) {
            ATSplashView aTSplashView = new ATSplashView(context);
            this.f11033n = aTSplashView;
            aTSplashView.setSplashWebview(this.o);
        }
    }

    private void b(ViewGroup viewGroup) {
        this.f11038t = viewGroup;
    }

    private String h() {
        if (!this.f11022a) {
            com.anythink.expressad.splash.c.c cVar = this.f11028i;
            if (cVar != null) {
                return cVar.a();
            }
            return "";
        }
        com.anythink.expressad.splash.c.d dVar = this.f11029j;
        if (dVar != null) {
            return dVar.b();
        }
        return "";
    }

    private void i() {
        this.E = true;
        ATSplashPopView aTSplashPopView = this.D;
        if (aTSplashPopView != null) {
            aTSplashPopView.startCountDown();
        }
    }

    private void j() {
        this.E = false;
        ATSplashPopView aTSplashPopView = this.D;
        if (aTSplashPopView != null) {
            aTSplashPopView.release();
        }
    }

    private void k() {
        com.anythink.expressad.splash.c.d dVar = this.f11029j;
        if (dVar != null) {
            dVar.d();
        }
        ATSplashPopView aTSplashPopView = this.D;
        if (aTSplashPopView != null && this.E) {
            aTSplashPopView.reStartCountDown();
        }
    }

    private void l() {
        ATSplashWebview aTSplashWebview = this.o;
        if (aTSplashWebview != null) {
            aTSplashWebview.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.splash.d.c.2

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f11048a = true;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!this.f11048a) {
                        return true;
                    }
                    return false;
                }
            });
        }
        ATSplashView aTSplashView = this.f11033n;
        if (aTSplashView != null) {
            aTSplashView.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.splash.d.c.3

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f11050a = true;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!this.f11050a) {
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    private void m() {
        com.anythink.expressad.splash.c.d dVar = this.f11029j;
        if (dVar != null) {
            dVar.e();
        }
        ATSplashPopView aTSplashPopView = this.D;
        if (aTSplashPopView != null && this.E) {
            aTSplashPopView.pauseCountDown();
        }
    }

    public final long c() {
        return this.f;
    }

    public final boolean d() {
        return this.f11039u;
    }

    public final int e() {
        return this.f11025e;
    }

    public final void f() {
        a(100, 100);
    }

    public final void g() {
        this.C = null;
        if (this.f11031l != null) {
            this.f11031l = null;
        }
        if (this.f11030k != null) {
            this.f11030k = null;
        }
        if (this.f11032m != null) {
            this.f11032m = null;
        }
        com.anythink.expressad.splash.c.c cVar = this.f11028i;
        if (cVar != null) {
            cVar.b();
        }
        com.anythink.expressad.splash.c.d dVar = this.f11029j;
        if (dVar != null) {
            dVar.c();
        }
        if (this.A != null) {
            this.A = null;
        }
    }

    @Override // com.anythink.core.common.a.g
    public final boolean isReady() {
        if (this.f11028i.c() != null && com.anythink.expressad.splash.c.b.a(this.f11033n, this.f11028i.c())) {
            return true;
        }
        return false;
    }

    private void c(boolean z10) {
        this.B = z10;
    }

    public final boolean a() {
        return this.f11037s;
    }

    public final void b() {
        this.f11037s = false;
    }

    private void a(long j10) {
        this.f = j10;
    }

    private void b(int i10) {
        this.f11040v = i10;
    }

    public final void a(boolean z10) {
        this.F = z10;
    }

    public final void b(boolean z10) {
        this.f11039u = z10;
    }

    public final void a(com.anythink.expressad.out.d dVar) {
        if (this.f11030k == null) {
            this.f11030k = new b(this);
        }
        this.f11030k.a(dVar);
    }

    public final void a(e eVar) {
        this.f11031l = eVar;
    }

    public final void a(int i10) {
        this.f11025e = i10;
    }

    private void a(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            e eVar = this.f11031l;
            if (eVar != null) {
                eVar.a("token is null or empty");
                return;
            }
            return;
        }
        a(viewGroup);
    }

    public final void a(ViewGroup viewGroup) {
        this.f11034p = viewGroup;
        ATSplashView aTSplashView = this.f11033n;
        if (aTSplashView != null) {
            aTSplashView.setDevContainer(viewGroup);
        }
        com.anythink.expressad.splash.c.c cVar = this.f11028i;
        com.anythink.expressad.foundation.d.c c10 = cVar != null ? cVar.c() : null;
        if (c10 != null) {
            if (this.f11036r == null) {
                com.anythink.expressad.d.b.a();
                this.f11036r = com.anythink.expressad.d.b.a(com.anythink.expressad.foundation.b.a.b().e(), this.f11023c);
            }
            this.f11032m = new d(this, this.f11031l, this.f11036r.a(), c10);
            o.a(f11021b, "show start");
            int i10 = this.f11025e;
            if (i10 < 2 || i10 > 10) {
                this.f11025e = 5;
            }
            a(c10, false);
            return;
        }
        e eVar = this.f11031l;
        if (eVar != null) {
            eVar.a("campaignEx is vali");
        }
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar, boolean z10) {
        if (cVar != null && z10) {
            if (this.f11036r == null) {
                com.anythink.expressad.d.b.a();
                this.f11036r = com.anythink.expressad.d.b.a(com.anythink.expressad.foundation.b.a.b().e(), this.f11023c);
            }
            this.f11032m = new d(this, this.f11031l, this.f11036r.a(), cVar);
        }
        this.C = cVar;
        ViewGroup viewGroup = this.f11034p;
        if (viewGroup == null) {
            d dVar = this.f11032m;
            if (dVar != null) {
                dVar.a("container is null");
                return;
            }
            return;
        }
        if (this.f11029j == null) {
            this.f11029j = new com.anythink.expressad.splash.c.d(viewGroup.getContext(), this.f11024d, this.f11023c);
        }
        a(cVar, 0, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.anythink.expressad.foundation.d.c cVar, final int i10, final boolean z10) {
        if (!com.anythink.expressad.splash.c.b.a(this.f11033n, cVar)) {
            if (i10 > 0) {
                this.f11029j.f10974a.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.d.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.a(cVar, i10 - 1, z10);
                    }
                }, 1L);
                return;
            }
            d dVar = this.f11032m;
            if (dVar != null) {
                dVar.a("campaignEx is not ready");
                return;
            }
            return;
        }
        l();
        this.f11029j.a(this.f11025e);
        this.f11029j.a(this.f11038t);
        this.f11029j.a(this.f11032m);
        o.d(f11021b, "start show process");
        ViewGroup viewGroup = this.f11034p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            u.a(this.f11033n);
            this.f11034p.addView(this.f11033n, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f11029j.a(this.f11039u);
        this.f11029j.a(cVar, this.f11033n);
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        synchronized (this.y) {
            if (this.f11037s) {
                b bVar = this.f11030k;
                if (bVar != null) {
                    bVar.a("current unit is loading");
                    this.f11037s = true;
                }
                return;
            }
            this.f11037s = true;
            this.f11033n.clearResState();
            this.f11036r = new com.anythink.expressad.d.c();
            if (this.f11028i == null) {
                this.f11028i = new com.anythink.expressad.splash.c.c(this.f11024d, this.f11023c, this.f * 1000);
            }
            b bVar2 = this.f11030k;
            if (bVar2 != null) {
                bVar2.b("");
                this.f11028i.a(this.f11030k);
            }
            this.f11033n.resetLoadState();
            this.f11028i.b(this.f11025e);
            this.f11028i.a(this.f11033n);
            this.f11028i.a(this.f11036r);
            this.f11028i.a(this.f11041w, this.f11042x);
            this.f11028i.b(this.f11039u);
            this.f11028i.a(this.F);
            this.f11028i.a(this.f11040v);
            this.f11028i.a(dVar);
        }
    }

    private void a(Context context) {
        if (this.f11029j == null) {
            if (context != null) {
                this.f11029j = new com.anythink.expressad.splash.c.d(context, this.f11024d, this.f11023c);
            } else {
                this.f11029j = new com.anythink.expressad.splash.c.d(n.a().g(), this.f11024d, this.f11023c);
            }
        }
        if (this.o == null) {
            try {
                if (context != null) {
                    this.o = new ATSplashWebview(context);
                } else {
                    this.o = new ATSplashWebview(n.a().g());
                }
            } catch (Exception unused) {
            }
            ATSplashWebview aTSplashWebview = this.o;
            if (aTSplashWebview != null) {
                aTSplashWebview.setWebViewClient(new com.anythink.expressad.splash.view.b(this.f11023c, this.f11029j.a()));
            }
        }
        if (this.f11033n == null) {
            if (context != null) {
                this.f11033n = new ATSplashView(context);
            } else {
                this.f11033n = new ATSplashView(n.a().g());
            }
            this.f11033n.setSplashWebview(this.o);
        }
    }

    private void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f11035q = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            ATSplashView aTSplashView = this.f11033n;
            if (aTSplashView != null) {
                aTSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    private ViewGroup a(t tVar) {
        ATSplashPopView aTSplashPopView = new ATSplashPopView(n.a().g(), new ATSplashPopView.a(this.f11024d, this.f11023c, tVar.a(), this.C), this.f11032m);
        this.D = aTSplashPopView;
        return aTSplashPopView;
    }

    private void a(int i10, int i11) {
        int e10 = k.e(n.a().g());
        int f = k.f(n.a().g());
        int i12 = this.f11040v;
        if (i12 == 1) {
            if (f >= i11 * 4) {
                this.f11042x = f - i11;
                this.f11041w = e10;
                return;
            } else {
                this.f11042x = 0;
                this.f11041w = 0;
                return;
            }
        }
        if (i12 == 2) {
            if (e10 >= i10 * 4) {
                this.f11041w = e10 - i10;
                this.f11042x = f;
            } else {
                this.f11042x = 0;
                this.f11041w = 0;
            }
        }
    }
}
