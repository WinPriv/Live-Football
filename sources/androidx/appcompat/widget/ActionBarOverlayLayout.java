package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.app.AppCompatDelegateImpl;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import java.util.WeakHashMap;
import n0.c0;
import n0.q0;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements v, n0.p, n0.q {
    public static final int[] T = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final Rect F;
    public final Rect G;
    public final Rect H;
    public n0.q0 I;
    public n0.q0 J;
    public n0.q0 K;
    public n0.q0 L;
    public d M;
    public OverScroller N;
    public ViewPropertyAnimator O;
    public final a P;
    public final b Q;
    public final c R;
    public final n0.r S;

    /* renamed from: s, reason: collision with root package name */
    public int f907s;

    /* renamed from: t, reason: collision with root package name */
    public int f908t;

    /* renamed from: u, reason: collision with root package name */
    public ContentFrameLayout f909u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContainer f910v;

    /* renamed from: w, reason: collision with root package name */
    public w f911w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f912x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f913z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.O = null;
            actionBarOverlayLayout.C = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.O = null;
            actionBarOverlayLayout.C = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.O = actionBarOverlayLayout.f910v.animate().translationY(gl.Code).setListener(actionBarOverlayLayout.P);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.O = actionBarOverlayLayout.f910v.animate().translationY(-actionBarOverlayLayout.f910v.getHeight()).setListener(actionBarOverlayLayout.P);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e() {
            super(-1, -1);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f908t = 0;
        this.F = new Rect();
        this.G = new Rect();
        this.H = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        n0.q0 q0Var = n0.q0.f33098b;
        this.I = q0Var;
        this.J = q0Var;
        this.K = q0Var;
        this.L = q0Var;
        this.P = new a();
        this.Q = new b();
        this.R = new c();
        r(context);
        this.S = new n0.r();
    }

    public static boolean p(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // androidx.appcompat.widget.v
    public final boolean a() {
        s();
        return this.f911w.a();
    }

    @Override // androidx.appcompat.widget.v
    public final void b() {
        s();
        this.f911w.b();
    }

    @Override // androidx.appcompat.widget.v
    public final boolean c() {
        s();
        return this.f911w.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.v
    public final boolean d() {
        s();
        return this.f911w.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f912x != null && !this.y) {
            if (this.f910v.getVisibility() == 0) {
                i10 = (int) (this.f910v.getTranslationY() + this.f910v.getBottom() + 0.5f);
            } else {
                i10 = 0;
            }
            this.f912x.setBounds(0, i10, getWidth(), this.f912x.getIntrinsicHeight() + i10);
            this.f912x.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.v
    public final void e(androidx.appcompat.view.menu.h hVar, AppCompatDelegateImpl.d dVar) {
        s();
        this.f911w.e(hVar, dVar);
    }

    @Override // androidx.appcompat.widget.v
    public final boolean f() {
        s();
        return this.f911w.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.v
    public final boolean g() {
        s();
        return this.f911w.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f910v;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n0.r rVar = this.S;
        return rVar.f33126b | rVar.f33125a;
    }

    public CharSequence getTitle() {
        s();
        return this.f911w.getTitle();
    }

    @Override // androidx.appcompat.widget.v
    public final void h(int i10) {
        s();
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.f911w.r();
            return;
        }
        this.f911w.q();
    }

    @Override // androidx.appcompat.widget.v
    public final void i() {
        s();
        this.f911w.h();
    }

    @Override // n0.p
    public final void j(int i10, View view) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // n0.q
    public final void k(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        l(view, i10, i11, i12, i13, i14);
    }

    @Override // n0.p
    public final void l(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // n0.p
    public final boolean m(View view, View view2, int i10, int i11) {
        if (i11 == 0 && onStartNestedScroll(view, view2, i10)) {
            return true;
        }
        return false;
    }

    @Override // n0.p
    public final void n(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // n0.p
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        n0.q0 g6 = n0.q0.g(windowInsets, this);
        boolean p10 = p(this.f910v, new Rect(g6.b(), g6.d(), g6.c(), g6.a()), false);
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        Rect rect = this.F;
        c0.i.b(this, g6, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        q0.k kVar = g6.f33099a;
        n0.q0 l10 = kVar.l(i10, i11, i12, i13);
        this.I = l10;
        boolean z10 = true;
        if (!this.J.equals(l10)) {
            this.J = this.I;
            p10 = true;
        }
        Rect rect2 = this.G;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z10 = p10;
        }
        if (z10) {
            requestLayout();
        }
        return kVar.a().f33099a.c().f33099a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        c0.h.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int measuredHeight;
        q0.e bVar;
        s();
        measureChildWithMargins(this.f910v, i10, 0, i11, 0);
        e eVar = (e) this.f910v.getLayoutParams();
        int max = Math.max(0, this.f910v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f910v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f910v.getMeasuredState());
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        if ((c0.d.g(this) & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measuredHeight = this.f907s;
            if (this.A && this.f910v.getTabContainer() != null) {
                measuredHeight += this.f907s;
            }
        } else {
            measuredHeight = this.f910v.getVisibility() != 8 ? this.f910v.getMeasuredHeight() : 0;
        }
        Rect rect = this.F;
        Rect rect2 = this.H;
        rect2.set(rect);
        n0.q0 q0Var = this.I;
        this.K = q0Var;
        if (!this.f913z && !z10) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            this.K = q0Var.f33099a.l(0, measuredHeight, 0, 0);
        } else {
            f0.b a10 = f0.b.a(q0Var.b(), this.K.d() + measuredHeight, this.K.c(), this.K.a() + 0);
            n0.q0 q0Var2 = this.K;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                bVar = new q0.d(q0Var2);
            } else if (i12 >= 29) {
                bVar = new q0.c(q0Var2);
            } else {
                bVar = new q0.b(q0Var2);
            }
            bVar.d(a10);
            this.K = bVar.b();
        }
        p(this.f909u, rect2, true);
        if (!this.L.equals(this.K)) {
            n0.q0 q0Var3 = this.K;
            this.L = q0Var3;
            ContentFrameLayout contentFrameLayout = this.f909u;
            WindowInsets f = q0Var3.f();
            if (f != null) {
                WindowInsets a11 = c0.h.a(contentFrameLayout, f);
                if (!a11.equals(f)) {
                    n0.q0.g(a11, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.f909u, i10, 0, i11, 0);
        e eVar2 = (e) this.f909u.getLayoutParams();
        int max3 = Math.max(max, this.f909u.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f909u.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f909u.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f10, boolean z10) {
        boolean z11 = false;
        if (!this.B || !z10) {
            return false;
        }
        this.N.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.N.getFinalY() > this.f910v.getHeight()) {
            z11 = true;
        }
        if (z11) {
            q();
            this.R.run();
        } else {
            q();
            this.Q.run();
        }
        this.C = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.D + i11;
        this.D = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        androidx.appcompat.app.w wVar;
        i.g gVar;
        this.S.f33125a = i10;
        this.D = getActionBarHideOffset();
        q();
        d dVar = this.M;
        if (dVar != null && (gVar = (wVar = (androidx.appcompat.app.w) dVar).f732t) != null) {
            gVar.a();
            wVar.f732t = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) != 0 && this.f910v.getVisibility() == 0) {
            return this.B;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.B && !this.C) {
            if (this.D <= this.f910v.getHeight()) {
                q();
                postDelayed(this.Q, 600L);
            } else {
                q();
                postDelayed(this.R, 600L);
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i10);
        s();
        int i11 = this.E ^ i10;
        this.E = i10;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d dVar = this.M;
        if (dVar != null) {
            ((androidx.appcompat.app.w) dVar).f728p = !z11;
            if (!z10 && z11) {
                androidx.appcompat.app.w wVar = (androidx.appcompat.app.w) dVar;
                if (!wVar.f729q) {
                    wVar.f729q = true;
                    wVar.s(true);
                }
            } else {
                androidx.appcompat.app.w wVar2 = (androidx.appcompat.app.w) dVar;
                if (wVar2.f729q) {
                    wVar2.f729q = false;
                    wVar2.s(true);
                }
            }
        }
        if ((i11 & 256) != 0 && this.M != null) {
            WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
            c0.h.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f908t = i10;
        d dVar = this.M;
        if (dVar != null) {
            ((androidx.appcompat.app.w) dVar).o = i10;
        }
    }

    public final void q() {
        removeCallbacks(this.Q);
        removeCallbacks(this.R);
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        boolean z10;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(T);
        boolean z11 = false;
        this.f907s = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f912x = drawable;
        if (drawable == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        }
        this.y = z11;
        this.N = new OverScroller(context);
    }

    public final void s() {
        w wrapper;
        if (this.f909u == null) {
            this.f909u = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f910v = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof w) {
                wrapper = (w) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f911w = wrapper;
        }
    }

    public void setActionBarHideOffset(int i10) {
        q();
        this.f910v.setTranslationY(-Math.max(0, Math.min(i10, this.f910v.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.M = dVar;
        if (getWindowToken() != null) {
            ((androidx.appcompat.app.w) this.M).o = this.f908t;
            int i10 = this.E;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
                c0.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.A = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.B) {
            this.B = z10;
            if (!z10) {
                q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        s();
        this.f911w.setIcon(i10);
    }

    public void setLogo(int i10) {
        s();
        this.f911w.m(i10);
    }

    public void setOverlayMode(boolean z10) {
        boolean z11;
        this.f913z = z10;
        if (z10 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.y = z11;
    }

    @Override // androidx.appcompat.widget.v
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f911w.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.v
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f911w.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f911w.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }
}
