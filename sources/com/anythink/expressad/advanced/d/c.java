package com.anythink.expressad.advanced.d;

import android.content.Context;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.anythink.core.common.a.g;
import com.anythink.core.common.b.n;
import com.anythink.expressad.advanced.c.c;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.advanced.view.ATOutNativeAdvancedViewGroup;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.out.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6857a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6858b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6859c = 3;

    /* renamed from: g, reason: collision with root package name */
    private static String f6860g = "NativeAdvancedProvider";
    private JSONObject C;
    private ATOutNativeAdvancedViewGroup E;
    private boolean F;
    private boolean G;
    private boolean H;

    /* renamed from: e, reason: collision with root package name */
    boolean f6862e;
    com.anythink.expressad.foundation.d.d f;

    /* renamed from: h, reason: collision with root package name */
    private String f6863h;

    /* renamed from: i, reason: collision with root package name */
    private String f6864i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.expressad.advanced.c.a f6865j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.expressad.advanced.c.b f6866k;

    /* renamed from: l, reason: collision with root package name */
    private b f6867l;

    /* renamed from: m, reason: collision with root package name */
    private o f6868m;

    /* renamed from: n, reason: collision with root package name */
    private d f6869n;
    private ATNativeAdvancedView o;

    /* renamed from: p, reason: collision with root package name */
    private ATNativeAdvancedWebview f6870p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.expressad.advanced.view.a f6871q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.expressad.d.c f6872r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6873s;

    /* renamed from: t, reason: collision with root package name */
    private int f6874t = -1;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6875u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f6876v = 0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6877w = false;

    /* renamed from: x, reason: collision with root package name */
    private int f6878x = 0;
    private boolean y = false;

    /* renamed from: z, reason: collision with root package name */
    private int f6879z = 0;
    private int A = 0;
    private Object B = new Object();
    private boolean D = false;
    private boolean I = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6861d = false;
    private ViewTreeObserver.OnScrollChangedListener J = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.anythink.expressad.advanced.d.c.1
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            if (c.this.I) {
                c.this.I = false;
                if (c.this.E != null) {
                    c.this.E.postDelayed(new Runnable() { // from class: com.anythink.expressad.advanced.d.c.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.this.I = true;
                        }
                    }, 1000L);
                }
                try {
                    c.this.j();
                } catch (Throwable unused) {
                }
            }
        }
    };

    public c(String str, String str2, Context context) {
        com.anythink.expressad.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        this.f6864i = str;
        this.f6863h = str2;
        if (this.f6866k == null) {
            com.anythink.expressad.advanced.c.b bVar = new com.anythink.expressad.advanced.c.b(n.a().g(), this.f6864i, this.f6863h);
            this.f6866k = bVar;
            bVar.a(this);
        }
        if (this.f6870p == null) {
            try {
                this.f6870p = new ATNativeAdvancedWebview(n.a().g());
            } catch (Throwable unused) {
            }
            if (this.f6871q == null) {
                try {
                    this.f6871q = new com.anythink.expressad.advanced.view.a(this.f6863h, this.f6866k.b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6870p;
            if (aTNativeAdvancedWebview != null && (aVar = this.f6871q) != null) {
                aTNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.o == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.o = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.f6870p);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f6870p;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.o.addView(this.f6870p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.E == null) {
            this.E = new ATOutNativeAdvancedViewGroup(n.a().g());
            if (this.f6879z != 0 && this.A != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f6879z, this.A);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.E.setLayoutParams(layoutParams);
            this.E.setProvider(this);
            this.E.addView(this.o);
            this.E.getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
    }

    private void g(int i10) {
        if (this.f6875u) {
            this.f6874t = i10;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6870p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            int i11 = this.f6874t;
            if (i11 == 1) {
                this.f6866k.a(true);
                NativeAdvancedJsUtils.sendThirdToH5(this.f6870p, NativeAdvancedJsUtils.f, "", null);
            } else if (i11 == 0) {
                this.f6866k.a(false);
                NativeAdvancedJsUtils.sendThirdToH5(this.f6870p, NativeAdvancedJsUtils.f6917g, "", null);
            }
        }
    }

    private void h(int i10) {
        if (this.f6877w) {
            this.f6876v = i10;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6870p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f6870p, NativeAdvancedJsUtils.f6918h, "mute", Integer.valueOf(i10));
        }
    }

    private void i(int i10) {
        if (this.y) {
            this.f6878x = i10;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6870p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f6870p, NativeAdvancedJsUtils.f6920j, NativeAdvancedJsUtils.f6921k, Integer.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.F && this.G && this.H && !y.a(this.o.getAdvancedNativeWebview()) && this.E.getAlpha() >= 0.5f && this.E.getVisibility() == 0) {
            com.anythink.expressad.advanced.c.b bVar = this.f6866k;
            if (bVar != null) {
                bVar.d();
            }
            g();
        }
    }

    private void k() {
        com.anythink.expressad.advanced.c.b bVar = this.f6866k;
        if (bVar != null) {
            bVar.e();
        }
    }

    public final int d() {
        return this.f6874t;
    }

    public final void e(int i10) {
        if (i10 == 1) {
            this.F = false;
        } else if (i10 == 2) {
            this.G = false;
        } else if (i10 == 3) {
            this.H = false;
        }
        com.anythink.expressad.advanced.c.b bVar = this.f6866k;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // com.anythink.core.common.a.g
    public boolean isReady() {
        return false;
    }

    private void f(int i10) {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6870p;
        if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
            return;
        }
        try {
            if (this.f6870p != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f6923m, i10);
                j.a();
                j.a((WebView) this.f6870p, NativeAdvancedJsUtils.f6922l, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.a(f6860g, th.getMessage());
        }
    }

    public final void b() {
        this.f6873s = false;
    }

    public final ATOutNativeAdvancedViewGroup c() {
        return this.E;
    }

    public final void d(int i10) {
        if (i10 == 1) {
            this.F = true;
        } else if (i10 == 2) {
            this.G = true;
        } else if (i10 == 3) {
            this.H = true;
        }
        try {
            j();
        } catch (Throwable unused) {
        }
    }

    private void b(JSONObject jSONObject) {
        if (this.D) {
            this.C = jSONObject;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6870p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f6870p, NativeAdvancedJsUtils.f6915d, "", jSONObject);
        }
    }

    public final boolean a() {
        return this.f6873s;
    }

    public final void c(int i10) {
        this.y = true;
        i(i10);
    }

    private void a(JSONObject jSONObject) {
        this.D = true;
        b(jSONObject);
    }

    private String h() {
        if (this.f6861d) {
            com.anythink.expressad.advanced.c.b bVar = this.f6866k;
            return bVar != null ? bVar.a() : "";
        }
        com.anythink.expressad.advanced.c.a aVar = this.f6865j;
        return aVar != null ? aVar.a() : "";
    }

    private void i() {
        g(this.f6874t);
        h(this.f6876v);
        i(this.f6878x);
        b(this.C);
        n.a().g();
        f(k.a());
    }

    public final void a(o oVar) {
        this.f6868m = oVar;
    }

    public final void e() {
        if (this.f6868m != null) {
            this.f6868m = null;
        }
        if (this.f6867l != null) {
            this.f6867l = null;
        }
        if (this.f6869n != null) {
            this.f6869n = null;
        }
        com.anythink.expressad.advanced.c.a aVar = this.f6865j;
        if (aVar != null) {
            aVar.a((ATNativeAdvancedView) null);
            this.f6865j.b();
        }
        com.anythink.expressad.advanced.c.b bVar = this.f6866k;
        if (bVar != null) {
            bVar.c();
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.o;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.destroy();
        }
        com.anythink.expressad.advanced.a.a.c(this.f.f());
        com.anythink.expressad.advanced.view.a aVar2 = this.f6871q;
        if (aVar2 != null) {
            aVar2.a();
        }
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.E;
        if (aTOutNativeAdvancedViewGroup != null) {
            aTOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.J);
            this.E.removeAllViews();
            this.E = null;
        }
    }

    public final void a(int i10) {
        this.f6875u = true;
        g(i10);
    }

    public final void b(int i10) {
        this.f6877w = true;
        h(i10);
    }

    private void a(com.anythink.expressad.foundation.d.c cVar) {
        this.f6866k.a(this.f6869n);
        com.anythink.expressad.foundation.h.o.d(f6860g, "start show process");
        this.f6866k.a(cVar, this.o, true);
    }

    private void b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.A = i10;
        this.f6879z = i11;
        this.E.setLayoutParams(new ViewGroup.LayoutParams(i11, i10));
    }

    private void g() {
        final com.anythink.expressad.foundation.d.c[] cVarArr = new com.anythink.expressad.foundation.d.c[1];
        com.anythink.expressad.advanced.c.a aVar = this.f6865j;
        if (aVar != null) {
            cVarArr[0] = aVar.c();
        }
        if (cVarArr[0] != null) {
            if (this.f6872r == null) {
                com.anythink.expressad.d.b.a();
                this.f6872r = com.anythink.expressad.d.b.b(com.anythink.expressad.foundation.b.a.b().e(), this.f6863h);
            }
            this.f6869n = new d(this, this.f6868m, this.f6872r.a(), cVarArr[0]);
            if (this.f6862e) {
                return;
            }
            this.f6862e = true;
            com.anythink.expressad.advanced.c.c.a(this.o, cVarArr[0], this.f6864i, this.f6863h, this.f6874t, new c.a() { // from class: com.anythink.expressad.advanced.d.c.2
                @Override // com.anythink.expressad.advanced.c.c.a
                public final void a() {
                    com.anythink.expressad.foundation.h.o.a(c.f6860g, "show start");
                    c.this.a(cVarArr[0], false);
                }

                @Override // com.anythink.expressad.advanced.c.c.a
                public final void b() {
                    c.this.f6862e = false;
                }
            });
        }
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        this.f = dVar;
        this.I = true;
        this.f6873s = true;
        this.o.clearResStateAndRemoveClose();
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.d.c d10 = com.anythink.expressad.d.b.d(com.anythink.expressad.foundation.b.a.b().e(), this.f6863h);
        this.f6872r = d10;
        if (d10 == null) {
            this.f6872r = com.anythink.expressad.d.c.y();
        }
        b bVar = new b(this);
        this.f6867l = bVar;
        bVar.a(this.f6868m);
        if (this.f6865j == null) {
            this.f6865j = new com.anythink.expressad.advanced.c.a(this.f6864i, this.f6863h);
        }
        b bVar2 = this.f6867l;
        if (bVar2 != null) {
            this.f6865j.a(bVar2);
        }
        this.o.resetLoadState();
        this.f6865j.a(this.o);
        this.f6865j.a(this.f6872r);
        this.f6865j.a(this.f6879z, this.A);
        this.f6865j.a(this.f6874t);
        this.f6865j.a(dVar);
    }

    private void a(Context context) {
        com.anythink.expressad.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        if (this.f6866k == null) {
            com.anythink.expressad.advanced.c.b bVar = new com.anythink.expressad.advanced.c.b(n.a().g(), this.f6864i, this.f6863h);
            this.f6866k = bVar;
            bVar.a(this);
        }
        if (this.f6870p == null) {
            try {
                this.f6870p = new ATNativeAdvancedWebview(n.a().g());
            } catch (Throwable unused) {
            }
            if (this.f6871q == null) {
                try {
                    this.f6871q = new com.anythink.expressad.advanced.view.a(this.f6863h, this.f6866k.b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6870p;
            if (aTNativeAdvancedWebview != null && (aVar = this.f6871q) != null) {
                aTNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.o == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.o = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.f6870p);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f6870p;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.o.addView(this.f6870p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.E == null) {
            this.E = new ATOutNativeAdvancedViewGroup(n.a().g());
            if (this.f6879z != 0 && this.A != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f6879z, this.A);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.E.setLayoutParams(layoutParams);
            this.E.setProvider(this);
            this.E.addView(this.o);
            this.E.getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
    }

    public final String a(String str) {
        com.anythink.expressad.advanced.c.a aVar = this.f6865j;
        return aVar != null ? aVar.a(str) : "";
    }

    public final void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.A = i10;
        this.f6879z = i11;
        this.E.setLayoutParams(new ViewGroup.LayoutParams(i11, i10));
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar, boolean z10) {
        g(this.f6874t);
        h(this.f6876v);
        i(this.f6878x);
        b(this.C);
        n.a().g();
        f(k.a());
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.E;
        if (aTOutNativeAdvancedViewGroup == null || aTOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (cVar != null && z10) {
            if (this.f6872r == null) {
                com.anythink.expressad.d.b.a();
                this.f6872r = com.anythink.expressad.d.b.b(com.anythink.expressad.foundation.b.a.b().e(), this.f6863h);
            }
            this.f6869n = new d(this, this.f6868m, this.f6872r.a(), cVar);
        }
        if (this.f6866k == null) {
            com.anythink.expressad.advanced.c.b bVar = new com.anythink.expressad.advanced.c.b(n.a().g(), this.f6864i, this.f6863h);
            this.f6866k = bVar;
            bVar.a(this);
        }
        this.f6866k.a(this.f6869n);
        com.anythink.expressad.foundation.h.o.d(f6860g, "start show process");
        this.f6866k.a(cVar, this.o, true);
    }
}
