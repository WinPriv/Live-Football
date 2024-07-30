package com.anythink.basead.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.a.a;
import com.anythink.basead.a.c;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class BaseAdView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.basead.a.a f4117a;

    /* renamed from: b, reason: collision with root package name */
    String f4118b;

    /* renamed from: c, reason: collision with root package name */
    j f4119c;

    /* renamed from: d, reason: collision with root package name */
    i f4120d;

    /* renamed from: e, reason: collision with root package name */
    com.anythink.core.common.k.a.c f4121e;
    com.anythink.basead.a.c f;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f4122g;

    /* renamed from: h, reason: collision with root package name */
    boolean f4123h;

    /* renamed from: i, reason: collision with root package name */
    int f4124i;

    /* renamed from: j, reason: collision with root package name */
    int f4125j;

    /* renamed from: k, reason: collision with root package name */
    int f4126k;

    /* renamed from: l, reason: collision with root package name */
    int f4127l;

    /* renamed from: m, reason: collision with root package name */
    int f4128m;

    /* renamed from: n, reason: collision with root package name */
    int f4129n;
    int o;

    /* renamed from: p, reason: collision with root package name */
    int f4130p;

    /* renamed from: q, reason: collision with root package name */
    String f4131q;

    /* renamed from: r, reason: collision with root package name */
    List<View> f4132r;

    /* renamed from: s, reason: collision with root package name */
    View f4133s;

    public BaseAdView(Context context, j jVar, i iVar, String str) {
        super(context);
        this.f4118b = "BaseAdView";
        this.f4119c = jVar;
        this.f4120d = iVar;
        this.f4131q = str;
        this.f4132r = new ArrayList();
        if (!this.f4120d.L() && this.f4119c.f5664m.F() != 1) {
            this.f4117a = new com.anythink.basead.a.a(this, this.f4119c, new a.InterfaceC0048a() { // from class: com.anythink.basead.ui.BaseAdView.1
                @Override // com.anythink.basead.a.a.InterfaceC0048a
                public final void a(int i10) {
                    BaseAdView baseAdView = BaseAdView.this;
                    View view = baseAdView.f4133s;
                    if (view != null) {
                        baseAdView.a(view);
                    } else {
                        baseAdView.a(baseAdView);
                    }
                    BaseAdView.this.b(i10);
                }
            });
        }
        d();
        a();
        setFocusable(true);
        setClickable(true);
    }

    private void c() {
        i iVar = this.f4120d;
        if ((iVar instanceof aa) && this.f4119c.f == 67) {
            if (((aa) iVar).a(true, false)) {
                com.anythink.core.common.d.c.a(getContext()).a(this.f4120d.p(), 1, 0);
            }
            if (((aa) this.f4120d).a(false, false)) {
                com.anythink.core.common.d.b.a(getContext()).a(this.f4120d.q(), 1, 0);
            }
        }
    }

    private void o() {
        com.anythink.basead.a.a aVar = this.f4117a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public abstract void a();

    public abstract void a(int i10);

    public final void a(final int i10, final Runnable runnable) {
        if (i10 > 0) {
            getContext();
            this.f4121e = new com.anythink.core.common.k.a.c(i10);
        } else {
            getContext();
            this.f4121e = new com.anythink.core.common.k.a.c();
        }
        this.f4121e.a(this, new com.anythink.core.common.k.a.a() { // from class: com.anythink.basead.ui.BaseAdView.3
            @Override // com.anythink.core.common.k.a.a, com.anythink.core.common.k.a.b
            public final int getImpressionMinTimeViewed() {
                int i11 = i10;
                if (i11 > 0) {
                    return i11;
                }
                return 50;
            }

            @Override // com.anythink.core.common.k.a.a, com.anythink.core.common.k.a.b
            public final void recordImpression(View view) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    public abstract void a(boolean z10);

    public void b(final int i10) {
        b();
        k();
        if (this.f == null) {
            this.f = new com.anythink.basead.a.c(getContext(), this.f4119c, this.f4120d);
        }
        if (this.f.a()) {
            return;
        }
        this.f.a(new c.b() { // from class: com.anythink.basead.ui.BaseAdView.2
            @Override // com.anythink.basead.a.c.b
            public final void a() {
                BaseAdView.this.a(i10);
                BaseAdView.this.f();
                BaseAdView baseAdView = BaseAdView.this;
                i iVar = baseAdView.f4120d;
                if ((iVar instanceof aa) && baseAdView.f4119c.f == 67) {
                    if (((aa) iVar).a(true, false)) {
                        com.anythink.core.common.d.c.a(baseAdView.getContext()).a(baseAdView.f4120d.p(), 1, 0);
                    }
                    if (((aa) baseAdView.f4120d).a(false, false)) {
                        com.anythink.core.common.d.b.a(baseAdView.getContext()).a(baseAdView.f4120d.q(), 1, 0);
                    }
                }
            }

            @Override // com.anythink.basead.a.c.b
            public final void b() {
                BaseAdView.this.g();
            }

            @Override // com.anythink.basead.a.c.b
            public final void a(boolean z10) {
                BaseAdView.this.a(z10);
            }
        });
        com.anythink.basead.c.i i11 = i();
        i11.f3788g = j();
        this.f.a(i11);
    }

    public void destroy() {
        k();
        com.anythink.basead.a.c cVar = this.f;
        if (cVar != null) {
            cVar.d();
        }
        com.anythink.core.common.k.a.c cVar2 = this.f4121e;
        if (cVar2 != null) {
            cVar2.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.f4126k = (int) motionEvent.getRawX();
                this.f4127l = (int) motionEvent.getRawY();
                this.o = (int) motionEvent.getX();
                this.f4130p = (int) motionEvent.getY();
            }
        } else {
            this.f4124i = (int) motionEvent.getRawX();
            this.f4125j = (int) motionEvent.getRawY();
            this.f4128m = (int) motionEvent.getX();
            this.f4129n = (int) motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract void e();

    public synchronized void h() {
        b();
    }

    public com.anythink.basead.c.i i() {
        com.anythink.basead.c.i iVar = new com.anythink.basead.c.i(this.f4119c.f5656d, "");
        iVar.f3787e = getWidth();
        iVar.f = getHeight();
        return iVar;
    }

    public final com.anythink.basead.c.a j() {
        com.anythink.basead.c.a aVar = new com.anythink.basead.c.a();
        aVar.f3725a = this.f4124i;
        aVar.f3726b = this.f4125j;
        aVar.f3727c = this.f4126k;
        aVar.f3728d = this.f4127l;
        aVar.f3729e = this.f4128m;
        aVar.f = this.f4129n;
        aVar.f3730g = this.o;
        aVar.f3731h = this.f4130p;
        return aVar;
    }

    public final void k() {
        com.anythink.basead.a.a aVar = this.f4117a;
        if (aVar != null) {
            aVar.b();
            this.f4117a = null;
        }
    }

    public final void l() {
        com.anythink.basead.a.a aVar = this.f4117a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public boolean m() {
        j jVar;
        k kVar;
        if (com.anythink.expressad.shake.a.a().b() && (jVar = this.f4119c) != null && (kVar = jVar.f5664m) != null && kVar.M() == 1) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        i iVar = this.f4120d;
        if (iVar != null && iVar.g()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    public final void a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        int c10 = c(width);
        int c11 = c(height);
        int i12 = i10 + c10;
        this.f4124i = i12;
        this.f4125j = i11 + c11;
        this.f4128m = c10;
        this.f4129n = c11;
        this.f4126k = i12 + ((int) (Math.random() * 15.0d));
        int random = c10 + i11 + ((int) (Math.random() * 15.0d));
        this.f4127l = random;
        this.o = this.f4126k - i10;
        this.f4130p = random - i11;
    }

    private static int c(int i10) {
        Random random = new Random();
        if (i10 <= 0) {
            return 0;
        }
        double d10 = i10;
        int i11 = (int) (0.1d * d10);
        return random.nextInt((((int) (d10 * 0.9d)) - i11) + 1) + i11;
    }

    private void b() {
        if (this.f4122g) {
            return;
        }
        this.f4122g = true;
        i iVar = this.f4120d;
        if (iVar instanceof s) {
            com.anythink.basead.f.a.b.a(getContext()).a((s) this.f4120d);
        } else if (iVar instanceof aa) {
            com.anythink.basead.d.c.c a10 = com.anythink.basead.d.c.c.a();
            Context context = getContext();
            j jVar = this.f4119c;
            a10.a(context, com.anythink.basead.d.c.c.a(jVar.f5654b, jVar.f5655c), this.f4120d, this.f4119c.f5664m);
        }
        i iVar2 = this.f4120d;
        if ((iVar2 instanceof aa) && this.f4119c.f == 67) {
            if (((aa) iVar2).a(true, true)) {
                com.anythink.core.common.d.c.a(getContext()).a(this.f4120d.p(), 0, 1);
            }
            if (((aa) this.f4120d).a(false, true)) {
                com.anythink.core.common.d.b.a(getContext()).a(this.f4120d.q(), 0, 1);
            }
        }
        e();
        o();
    }

    public BaseAdView(Context context, j jVar, i iVar) {
        this(context, jVar, iVar, "");
    }

    public BaseAdView(Context context) {
        super(context);
        this.f4118b = "BaseAdView";
    }

    public float a(a aVar, int i10) {
        float f;
        float f10 = 1.0f;
        if (aVar != null) {
            if (i10 == 2) {
                f = 1.5f;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    f = 0.5f;
                }
                aVar.setClickAreaScaleFactor(f10);
            } else {
                f = 0.75f;
            }
            f10 = f;
            aVar.setClickAreaScaleFactor(f10);
        }
        return f10;
    }

    private void b(View view) {
        this.f4133s = view;
    }

    public void d() {
    }

    public void f() {
    }

    public void g() {
    }
}
