package androidx.appcompat.app;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.huawei.hms.ads.gl;
import i.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.n0;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public final class w extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {

    /* renamed from: a, reason: collision with root package name */
    public Context f715a;

    /* renamed from: b, reason: collision with root package name */
    public Context f716b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f717c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f718d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.appcompat.widget.w f719e;
    public ActionBarContextView f;

    /* renamed from: g, reason: collision with root package name */
    public final View f720g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f721h;

    /* renamed from: i, reason: collision with root package name */
    public d f722i;

    /* renamed from: j, reason: collision with root package name */
    public d f723j;

    /* renamed from: k, reason: collision with root package name */
    public a.InterfaceC0394a f724k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f725l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<a.b> f726m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f727n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f728p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f729q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f730r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f731s;

    /* renamed from: t, reason: collision with root package name */
    public i.g f732t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f733u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f734v;

    /* renamed from: w, reason: collision with root package name */
    public final a f735w;

    /* renamed from: x, reason: collision with root package name */
    public final b f736x;
    public final c y;

    /* renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f714z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class a extends a0.a {
        public a() {
        }

        @Override // n0.m0
        public final void a() {
            View view;
            w wVar = w.this;
            if (wVar.f728p && (view = wVar.f720g) != null) {
                view.setTranslationY(gl.Code);
                wVar.f718d.setTranslationY(gl.Code);
            }
            wVar.f718d.setVisibility(8);
            wVar.f718d.setTransitioning(false);
            wVar.f732t = null;
            a.InterfaceC0394a interfaceC0394a = wVar.f724k;
            if (interfaceC0394a != null) {
                interfaceC0394a.b(wVar.f723j);
                wVar.f723j = null;
                wVar.f724k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = wVar.f717c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.h.c(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class b extends a0.a {
        public b() {
        }

        @Override // n0.m0
        public final void a() {
            w wVar = w.this;
            wVar.f732t = null;
            wVar.f718d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class c implements n0 {
        public c() {
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class d extends i.a implements h.a {

        /* renamed from: u, reason: collision with root package name */
        public final Context f738u;

        /* renamed from: v, reason: collision with root package name */
        public final androidx.appcompat.view.menu.h f739v;

        /* renamed from: w, reason: collision with root package name */
        public a.InterfaceC0394a f740w;

        /* renamed from: x, reason: collision with root package name */
        public WeakReference<View> f741x;

        public d(Context context, AppCompatDelegateImpl.e eVar) {
            this.f738u = context;
            this.f740w = eVar;
            androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
            hVar.f826l = 1;
            this.f739v = hVar;
            hVar.f820e = this;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            a.InterfaceC0394a interfaceC0394a = this.f740w;
            if (interfaceC0394a != null) {
                return interfaceC0394a.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void b(androidx.appcompat.view.menu.h hVar) {
            if (this.f740w == null) {
                return;
            }
            i();
            w.this.f.i();
        }

        @Override // i.a
        public final void c() {
            w wVar = w.this;
            if (wVar.f722i != this) {
                return;
            }
            if (!(!wVar.f729q)) {
                wVar.f723j = this;
                wVar.f724k = this.f740w;
            } else {
                this.f740w.b(this);
            }
            this.f740w = null;
            wVar.p(false);
            ActionBarContextView actionBarContextView = wVar.f;
            if (actionBarContextView.C == null) {
                actionBarContextView.g();
            }
            wVar.f717c.setHideOnContentScrollEnabled(wVar.f734v);
            wVar.f722i = null;
        }

        @Override // i.a
        public final View d() {
            WeakReference<View> weakReference = this.f741x;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // i.a
        public final androidx.appcompat.view.menu.h e() {
            return this.f739v;
        }

        @Override // i.a
        public final MenuInflater f() {
            return new i.f(this.f738u);
        }

        @Override // i.a
        public final CharSequence g() {
            return w.this.f.getSubtitle();
        }

        @Override // i.a
        public final CharSequence h() {
            return w.this.f.getTitle();
        }

        @Override // i.a
        public final void i() {
            if (w.this.f722i != this) {
                return;
            }
            androidx.appcompat.view.menu.h hVar = this.f739v;
            hVar.w();
            try {
                this.f740w.c(this, hVar);
            } finally {
                hVar.v();
            }
        }

        @Override // i.a
        public final boolean j() {
            return w.this.f.K;
        }

        @Override // i.a
        public final void k(View view) {
            w.this.f.setCustomView(view);
            this.f741x = new WeakReference<>(view);
        }

        @Override // i.a
        public final void l(int i10) {
            m(w.this.f715a.getResources().getString(i10));
        }

        @Override // i.a
        public final void m(CharSequence charSequence) {
            w.this.f.setSubtitle(charSequence);
        }

        @Override // i.a
        public final void n(int i10) {
            o(w.this.f715a.getResources().getString(i10));
        }

        @Override // i.a
        public final void o(CharSequence charSequence) {
            w.this.f.setTitle(charSequence);
        }

        @Override // i.a
        public final void p(boolean z10) {
            this.f28973t = z10;
            w.this.f.setTitleOptional(z10);
        }
    }

    public w(Activity activity, boolean z10) {
        new ArrayList();
        this.f726m = new ArrayList<>();
        this.o = 0;
        this.f728p = true;
        this.f731s = true;
        this.f735w = new a();
        this.f736x = new b();
        this.y = new c();
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (z10) {
            return;
        }
        this.f720g = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.a
    public final boolean b() {
        androidx.appcompat.widget.w wVar = this.f719e;
        if (wVar != null && wVar.j()) {
            this.f719e.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public final void c(boolean z10) {
        if (z10 == this.f725l) {
            return;
        }
        this.f725l = z10;
        ArrayList<a.b> arrayList = this.f726m;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a();
        }
    }

    @Override // androidx.appcompat.app.a
    public final int d() {
        return this.f719e.p();
    }

    @Override // androidx.appcompat.app.a
    public final Context e() {
        if (this.f716b == null) {
            TypedValue typedValue = new TypedValue();
            this.f715a.getTheme().resolveAttribute(com.hamkho.livefoot.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f716b = new ContextThemeWrapper(this.f715a, i10);
            } else {
                this.f716b = this.f715a;
            }
        }
        return this.f716b;
    }

    @Override // androidx.appcompat.app.a
    public final void g() {
        r(this.f715a.getResources().getBoolean(com.hamkho.livefoot.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.a
    public final boolean i(int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.h hVar;
        int i11;
        d dVar = this.f722i;
        if (dVar == null || (hVar = dVar.f739v) == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z10 = false;
        }
        hVar.setQwertyMode(z10);
        return hVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public final void l(boolean z10) {
        int i10;
        if (!this.f721h) {
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            int p10 = this.f719e.p();
            this.f721h = true;
            this.f719e.k((i10 & 4) | (p10 & (-5)));
        }
    }

    @Override // androidx.appcompat.app.a
    public final void m(boolean z10) {
        i.g gVar;
        this.f733u = z10;
        if (!z10 && (gVar = this.f732t) != null) {
            gVar.a();
        }
    }

    @Override // androidx.appcompat.app.a
    public final void n(CharSequence charSequence) {
        this.f719e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public final i.a o(AppCompatDelegateImpl.e eVar) {
        d dVar = this.f722i;
        if (dVar != null) {
            dVar.c();
        }
        this.f717c.setHideOnContentScrollEnabled(false);
        this.f.g();
        d dVar2 = new d(this.f.getContext(), eVar);
        androidx.appcompat.view.menu.h hVar = dVar2.f739v;
        hVar.w();
        try {
            if (dVar2.f740w.d(dVar2, hVar)) {
                this.f722i = dVar2;
                dVar2.i();
                this.f.e(dVar2);
                p(true);
                return dVar2;
            }
            return null;
        } finally {
            hVar.v();
        }
    }

    public final void p(boolean z10) {
        l0 o;
        l0 h10;
        long j10;
        if (z10) {
            if (!this.f730r) {
                this.f730r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f717c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                s(false);
            }
        } else if (this.f730r) {
            this.f730r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f717c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            s(false);
        }
        ActionBarContainer actionBarContainer = this.f718d;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.g.c(actionBarContainer)) {
            if (z10) {
                h10 = this.f719e.o(4, 100L);
                o = this.f.h(0, 200L);
            } else {
                o = this.f719e.o(0, 200L);
                h10 = this.f.h(8, 100L);
            }
            i.g gVar = new i.g();
            ArrayList<l0> arrayList = gVar.f29021a;
            arrayList.add(h10);
            View view = h10.f33092a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = o.f33092a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(o);
            gVar.b();
            return;
        }
        if (z10) {
            this.f719e.setVisibility(4);
            this.f.setVisibility(0);
        } else {
            this.f719e.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    public final void q(View view) {
        String str;
        androidx.appcompat.widget.w wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.hamkho.livefoot.R.id.decor_content_parent);
        this.f717c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.hamkho.livefoot.R.id.action_bar);
        if (findViewById instanceof androidx.appcompat.widget.w) {
            wrapper = (androidx.appcompat.widget.w) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f719e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.hamkho.livefoot.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.hamkho.livefoot.R.id.action_bar_container);
        this.f718d = actionBarContainer;
        androidx.appcompat.widget.w wVar = this.f719e;
        if (wVar != null && this.f != null && actionBarContainer != null) {
            this.f715a = wVar.getContext();
            if ((this.f719e.p() & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f721h = true;
            }
            Context context = this.f715a;
            if (context.getApplicationInfo().targetSdkVersion < 14) {
            }
            this.f719e.i();
            r(context.getResources().getBoolean(com.hamkho.livefoot.R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f715a.obtainStyledAttributes(null, a0.a.C, com.hamkho.livefoot.R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f717c;
                if (actionBarOverlayLayout2.f913z) {
                    this.f734v = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f718d;
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.i.s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(w.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void r(boolean z10) {
        this.f727n = z10;
        if (!z10) {
            this.f719e.l();
            this.f718d.setTabContainer(null);
        } else {
            this.f718d.setTabContainer(null);
            this.f719e.l();
        }
        this.f719e.n();
        androidx.appcompat.widget.w wVar = this.f719e;
        boolean z11 = this.f727n;
        wVar.s(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f717c;
        boolean z12 = this.f727n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void s(boolean z10) {
        boolean z11;
        boolean z12 = this.f729q;
        if (this.f730r || !z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        View view = this.f720g;
        final c cVar = this.y;
        if (z11) {
            if (!this.f731s) {
                this.f731s = true;
                i.g gVar = this.f732t;
                if (gVar != null) {
                    gVar.a();
                }
                this.f718d.setVisibility(0);
                int i10 = this.o;
                b bVar = this.f736x;
                if (i10 == 0 && (this.f733u || z10)) {
                    this.f718d.setTranslationY(gl.Code);
                    float f = -this.f718d.getHeight();
                    if (z10) {
                        this.f718d.getLocationInWindow(new int[]{0, 0});
                        f -= r12[1];
                    }
                    this.f718d.setTranslationY(f);
                    i.g gVar2 = new i.g();
                    l0 a10 = c0.a(this.f718d);
                    a10.e(gl.Code);
                    final View view2 = a10.f33092a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(cVar, view2) { // from class: n0.j0

                                /* renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ n0 f33089a;

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) androidx.appcompat.app.w.this.f718d.getParent()).invalidate();
                                }
                            };
                        }
                        l0.a.a(view2.animate(), animatorUpdateListener);
                    }
                    boolean z13 = gVar2.f29025e;
                    ArrayList<l0> arrayList = gVar2.f29021a;
                    if (!z13) {
                        arrayList.add(a10);
                    }
                    if (this.f728p && view != null) {
                        view.setTranslationY(f);
                        l0 a11 = c0.a(view);
                        a11.e(gl.Code);
                        if (!gVar2.f29025e) {
                            arrayList.add(a11);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = A;
                    boolean z14 = gVar2.f29025e;
                    if (!z14) {
                        gVar2.f29023c = decelerateInterpolator;
                    }
                    if (!z14) {
                        gVar2.f29022b = 250L;
                    }
                    if (!z14) {
                        gVar2.f29024d = bVar;
                    }
                    this.f732t = gVar2;
                    gVar2.b();
                } else {
                    this.f718d.setAlpha(1.0f);
                    this.f718d.setTranslationY(gl.Code);
                    if (this.f728p && view != null) {
                        view.setTranslationY(gl.Code);
                    }
                    bVar.a();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f717c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    c0.h.c(actionBarOverlayLayout);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f731s) {
            this.f731s = false;
            i.g gVar3 = this.f732t;
            if (gVar3 != null) {
                gVar3.a();
            }
            int i11 = this.o;
            a aVar = this.f735w;
            if (i11 == 0 && (this.f733u || z10)) {
                this.f718d.setAlpha(1.0f);
                this.f718d.setTransitioning(true);
                i.g gVar4 = new i.g();
                float f10 = -this.f718d.getHeight();
                if (z10) {
                    this.f718d.getLocationInWindow(new int[]{0, 0});
                    f10 -= r12[1];
                }
                l0 a12 = c0.a(this.f718d);
                a12.e(f10);
                final View view3 = a12.f33092a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(cVar, view3) { // from class: n0.j0

                            /* renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ n0 f33089a;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ((View) androidx.appcompat.app.w.this.f718d.getParent()).invalidate();
                            }
                        };
                    }
                    l0.a.a(view3.animate(), animatorUpdateListener);
                }
                boolean z15 = gVar4.f29025e;
                ArrayList<l0> arrayList2 = gVar4.f29021a;
                if (!z15) {
                    arrayList2.add(a12);
                }
                if (this.f728p && view != null) {
                    l0 a13 = c0.a(view);
                    a13.e(f10);
                    if (!gVar4.f29025e) {
                        arrayList2.add(a13);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f714z;
                boolean z16 = gVar4.f29025e;
                if (!z16) {
                    gVar4.f29023c = accelerateInterpolator;
                }
                if (!z16) {
                    gVar4.f29022b = 250L;
                }
                if (!z16) {
                    gVar4.f29024d = aVar;
                }
                this.f732t = gVar4;
                gVar4.b();
                return;
            }
            aVar.a();
        }
    }

    public w(Dialog dialog) {
        new ArrayList();
        this.f726m = new ArrayList<>();
        this.o = 0;
        this.f728p = true;
        this.f731s = true;
        this.f735w = new a();
        this.f736x = new b();
        this.y = new c();
        q(dialog.getWindow().getDecorView());
    }
}
