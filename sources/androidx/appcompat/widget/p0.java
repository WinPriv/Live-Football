package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public final class p0 implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f1230a;

    /* renamed from: b, reason: collision with root package name */
    public int f1231b;

    /* renamed from: c, reason: collision with root package name */
    public ScrollingTabContainerView f1232c;

    /* renamed from: d, reason: collision with root package name */
    public View f1233d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1234e;
    public Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f1235g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1236h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f1237i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1238j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1239k;

    /* renamed from: l, reason: collision with root package name */
    public Window.Callback f1240l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1241m;

    /* renamed from: n, reason: collision with root package name */
    public ActionMenuPresenter f1242n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f1243p;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    public class a extends a0.a {
        public boolean I0 = false;
        public final /* synthetic */ int J0;

        public a(int i10) {
            this.J0 = i10;
        }

        @Override // n0.m0
        public final void a() {
            if (!this.I0) {
                p0.this.f1230a.setVisibility(this.J0);
            }
        }

        @Override // a0.a, n0.m0
        public final void b(View view) {
            this.I0 = true;
        }

        @Override // a0.a, n0.m0
        public final void c() {
            p0.this.f1230a.setVisibility(0);
        }
    }

    public p0(Toolbar toolbar, boolean z10) {
        boolean z11;
        Drawable drawable;
        this.o = 0;
        this.f1230a = toolbar;
        this.f1237i = toolbar.getTitle();
        this.f1238j = toolbar.getSubtitle();
        if (this.f1237i != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f1236h = z11;
        this.f1235g = toolbar.getNavigationIcon();
        m0 m10 = m0.m(toolbar.getContext(), null, a0.a.C, R.attr.actionBarStyle);
        int i10 = 15;
        this.f1243p = m10.e(15);
        if (z10) {
            CharSequence k10 = m10.k(27);
            if (!TextUtils.isEmpty(k10)) {
                this.f1236h = true;
                this.f1237i = k10;
                if ((this.f1231b & 8) != 0) {
                    toolbar.setTitle(k10);
                    if (this.f1236h) {
                        n0.c0.m(toolbar.getRootView(), k10);
                    }
                }
            }
            CharSequence k11 = m10.k(25);
            if (!TextUtils.isEmpty(k11)) {
                this.f1238j = k11;
                if ((this.f1231b & 8) != 0) {
                    toolbar.setSubtitle(k11);
                }
            }
            Drawable e10 = m10.e(20);
            if (e10 != null) {
                this.f = e10;
                t();
            }
            Drawable e11 = m10.e(17);
            if (e11 != null) {
                setIcon(e11);
            }
            if (this.f1235g == null && (drawable = this.f1243p) != null) {
                this.f1235g = drawable;
                if ((this.f1231b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            k(m10.h(10, 0));
            int i11 = m10.i(9, 0);
            if (i11 != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i11, (ViewGroup) toolbar, false);
                View view = this.f1233d;
                if (view != null && (this.f1231b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f1233d = inflate;
                if (inflate != null && (this.f1231b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                k(this.f1231b | 16);
            }
            int layoutDimension = m10.f1206b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int c10 = m10.c(7, -1);
            int c11 = m10.c(3, -1);
            if (c10 >= 0 || c11 >= 0) {
                int max = Math.max(c10, 0);
                int max2 = Math.max(c11, 0);
                if (toolbar.L == null) {
                    toolbar.L = new f0();
                }
                toolbar.L.a(max, max2);
            }
            int i12 = m10.i(28, 0);
            if (i12 != 0) {
                Context context = toolbar.getContext();
                toolbar.D = i12;
                AppCompatTextView appCompatTextView = toolbar.f1102t;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, i12);
                }
            }
            int i13 = m10.i(26, 0);
            if (i13 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.E = i13;
                AppCompatTextView appCompatTextView2 = toolbar.f1103u;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, i13);
                }
            }
            int i14 = m10.i(22, 0);
            if (i14 != 0) {
                toolbar.setPopupTheme(i14);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f1243p = toolbar.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f1231b = i10;
        }
        m10.n();
        if (R.string.abc_action_bar_up_description != this.o) {
            this.o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i15 = this.o;
                String string = i15 != 0 ? getContext().getString(i15) : null;
                this.f1239k = string;
                if ((this.f1231b & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1239k);
                    }
                }
            }
        }
        this.f1239k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new o0(this));
    }

    @Override // androidx.appcompat.widget.w
    public final boolean a() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1230a.f1101s;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.L;
        if (actionMenuPresenter != null && actionMenuPresenter.m()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.w
    public final void b() {
        this.f1241m = true;
    }

    @Override // androidx.appcompat.widget.w
    public final boolean c() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f1230a;
        if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1101s) != null && actionMenuView.K) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.w
    public final void collapseActionView() {
        androidx.appcompat.view.menu.j jVar;
        Toolbar.f fVar = this.f1230a.f1093j0;
        if (fVar == null) {
            jVar = null;
        } else {
            jVar = fVar.f1115t;
        }
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f1230a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1101s
            r1 = 0
            if (r0 == 0) goto L22
            androidx.appcompat.widget.ActionMenuPresenter r0 = r0.L
            r2 = 1
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.ActionMenuPresenter$c r3 = r0.N
            if (r3 != 0) goto L19
            boolean r0 = r0.m()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 == 0) goto L1e
            r0 = r2
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 == 0) goto L22
            r1 = r2
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p0.d():boolean");
    }

    @Override // androidx.appcompat.widget.w
    public final void e(androidx.appcompat.view.menu.h hVar, AppCompatDelegateImpl.d dVar) {
        ActionMenuPresenter actionMenuPresenter = this.f1242n;
        Toolbar toolbar = this.f1230a;
        if (actionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(toolbar.getContext());
            this.f1242n = actionMenuPresenter2;
            actionMenuPresenter2.A = R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter3 = this.f1242n;
        actionMenuPresenter3.f780w = dVar;
        if (hVar != null || toolbar.f1101s != null) {
            toolbar.e();
            androidx.appcompat.view.menu.h hVar2 = toolbar.f1101s.H;
            if (hVar2 != hVar) {
                if (hVar2 != null) {
                    hVar2.r(toolbar.f1092i0);
                    hVar2.r(toolbar.f1093j0);
                }
                if (toolbar.f1093j0 == null) {
                    toolbar.f1093j0 = new Toolbar.f();
                }
                actionMenuPresenter3.J = true;
                if (hVar != null) {
                    hVar.b(actionMenuPresenter3, toolbar.B);
                    hVar.b(toolbar.f1093j0, toolbar.B);
                } else {
                    actionMenuPresenter3.g(toolbar.B, null);
                    toolbar.f1093j0.g(toolbar.B, null);
                    actionMenuPresenter3.c(true);
                    toolbar.f1093j0.c(true);
                }
                toolbar.f1101s.setPopupTheme(toolbar.C);
                toolbar.f1101s.setPresenter(actionMenuPresenter3);
                toolbar.f1092i0 = actionMenuPresenter3;
                toolbar.s();
            }
        }
    }

    @Override // androidx.appcompat.widget.w
    public final boolean f() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1230a.f1101s;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.L;
        if (actionMenuPresenter != null && actionMenuPresenter.i()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.w
    public final boolean g() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1230a.f1101s;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.L;
        if (actionMenuPresenter != null && actionMenuPresenter.n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.w
    public final Context getContext() {
        return this.f1230a.getContext();
    }

    @Override // androidx.appcompat.widget.w
    public final CharSequence getTitle() {
        return this.f1230a.getTitle();
    }

    @Override // androidx.appcompat.widget.w
    public final void h() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f1230a.f1101s;
        if (actionMenuView != null && (actionMenuPresenter = actionMenuView.L) != null) {
            actionMenuPresenter.i();
            ActionMenuPresenter.a aVar = actionMenuPresenter.M;
            if (aVar != null && aVar.b()) {
                aVar.f874j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.w
    public final boolean j() {
        Toolbar.f fVar = this.f1230a.f1093j0;
        if (fVar != null && fVar.f1115t != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.w
    public final void k(int i10) {
        View view;
        int i11 = this.f1231b ^ i10;
        this.f1231b = i10;
        if (i11 != 0) {
            int i12 = i11 & 4;
            Toolbar toolbar = this.f1230a;
            if (i12 != 0) {
                if ((i10 & 4) != 0 && (i10 & 4) != 0) {
                    if (TextUtils.isEmpty(this.f1239k)) {
                        toolbar.setNavigationContentDescription(this.o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1239k);
                    }
                }
                if ((this.f1231b & 4) != 0) {
                    Drawable drawable = this.f1235g;
                    if (drawable == null) {
                        drawable = this.f1243p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                t();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f1237i);
                    toolbar.setSubtitle(this.f1238j);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f1233d) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.w
    public final void l() {
        ScrollingTabContainerView scrollingTabContainerView = this.f1232c;
        if (scrollingTabContainerView != null) {
            ViewParent parent = scrollingTabContainerView.getParent();
            Toolbar toolbar = this.f1230a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1232c);
            }
        }
        this.f1232c = null;
    }

    @Override // androidx.appcompat.widget.w
    public final void m(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = g.a.a(getContext(), i10);
        } else {
            drawable = null;
        }
        this.f = drawable;
        t();
    }

    @Override // androidx.appcompat.widget.w
    public final n0.l0 o(int i10, long j10) {
        float f;
        n0.l0 a10 = n0.c0.a(this.f1230a);
        if (i10 == 0) {
            f = 1.0f;
        } else {
            f = gl.Code;
        }
        a10.a(f);
        a10.c(j10);
        a10.d(new a(i10));
        return a10;
    }

    @Override // androidx.appcompat.widget.w
    public final int p() {
        return this.f1231b;
    }

    @Override // androidx.appcompat.widget.w
    public final void q() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.w
    public final void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.w
    public final void s(boolean z10) {
        this.f1230a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.w
    public final void setIcon(int i10) {
        setIcon(i10 != 0 ? g.a.a(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.w
    public final void setVisibility(int i10) {
        this.f1230a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.w
    public final void setWindowCallback(Window.Callback callback) {
        this.f1240l = callback;
    }

    @Override // androidx.appcompat.widget.w
    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f1236h) {
            this.f1237i = charSequence;
            if ((this.f1231b & 8) != 0) {
                Toolbar toolbar = this.f1230a;
                toolbar.setTitle(charSequence);
                if (this.f1236h) {
                    n0.c0.m(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final void t() {
        Drawable drawable;
        int i10 = this.f1231b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f;
                if (drawable == null) {
                    drawable = this.f1234e;
                }
            } else {
                drawable = this.f1234e;
            }
        } else {
            drawable = null;
        }
        this.f1230a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.w
    public final void setIcon(Drawable drawable) {
        this.f1234e = drawable;
        t();
    }

    @Override // androidx.appcompat.widget.w
    public final void i() {
    }

    @Override // androidx.appcompat.widget.w
    public final void n() {
    }
}
