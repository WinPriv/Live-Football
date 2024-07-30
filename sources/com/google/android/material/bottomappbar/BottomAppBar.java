package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import g0.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k6.b;
import k6.c;
import k6.d;
import k6.e;
import k6.f;
import n0.c0;
import n0.l0;
import q.i;

/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int D0 = 0;
    public int A0;
    public boolean B0;
    public Behavior C0;

    /* renamed from: r0, reason: collision with root package name */
    public Integer f20510r0;

    /* renamed from: s0, reason: collision with root package name */
    public Animator f20511s0;

    /* renamed from: t0, reason: collision with root package name */
    public Animator f20512t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f20513u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f20514v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f20515w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f20516x0;
    public int y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f20517z0;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public int f20523u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f20524v;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Toolbar.SavedState savedState) {
            super(savedState);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeInt(this.f20523u);
            parcel.writeInt(this.f20524v ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f20523u = parcel.readInt();
            this.f20524v = parcel.readInt() != 0;
        }
    }

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f20525s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f20526t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f20527u;

        public a(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f20525s = actionMenuView;
            this.f20526t = i10;
            this.f20527u = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f20526t;
            boolean z10 = this.f20527u;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            this.f20525s.setTranslationX(bottomAppBar.x(r3, i10, z10));
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return w6.a.c(getContext(), R.attr.motionDurationLong2, 300);
    }

    private float getFabTranslationX() {
        return y(this.f20513u0);
    }

    private float getFabTranslationY() {
        if (this.f20515w0 == 1) {
            return -getTopEdgeTreatment().f30886u;
        }
        return gl.Code;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private f getTopEdgeTreatment() {
        throw null;
    }

    public final void A() {
        f topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.B0) {
            z();
        }
        throw null;
    }

    public final void B(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        a aVar = new a(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f30886u;
    }

    public int getFabAlignmentMode() {
        return this.f20513u0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f20516x0;
    }

    public int getFabAnchorMode() {
        return this.f20515w0;
    }

    public int getFabAnimationMode() {
        return this.f20514v0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f30885t;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f30884s;
    }

    public boolean getHideOnScroll() {
        return this.f20517z0;
    }

    public int getMenuAlignmentMode() {
        return this.y0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n.L0(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Animator animator = this.f20512t0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f20511s0;
            if (animator2 != null) {
                animator2.cancel();
            }
            A();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f20512t0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!z()) {
                B(actionMenuView, 0, false, false);
            } else {
                B(actionMenuView, this.f20513u0, this.B0, false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1595s);
        this.f20513u0 = savedState.f20523u;
        this.B0 = savedState.f20524v;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState((Toolbar.SavedState) super.onSaveInstanceState());
        savedState.f20523u = this.f20513u0;
        savedState.f20524v = this.B0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.b.h(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            f topEdgeTreatment = getTopEdgeTreatment();
            if (f >= gl.Code) {
                topEdgeTreatment.f30886u = f;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i10) {
        int i11;
        this.A0 = 0;
        boolean z10 = this.B0;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (!c0.g.c(this)) {
            int i12 = this.A0;
            if (i12 != 0) {
                this.A0 = 0;
                getMenu().clear();
                k(i12);
            }
        } else {
            Animator animator = this.f20512t0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!z()) {
                z10 = false;
                i11 = 0;
            } else {
                i11 = i10;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                ofFloat.setDuration(0.8f * fabAlignmentAnimationDuration);
                if (Math.abs(actionMenuView.getTranslationX() - x(actionMenuView, i11, z10)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", gl.Code);
                    ofFloat2.setDuration(fabAlignmentAnimationDuration * 0.2f);
                    ofFloat2.addListener(new d(this, actionMenuView, i11, z10));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f20512t0 = animatorSet2;
            animatorSet2.addListener(new c(this));
            this.f20512t0.start();
        }
        if (this.f20513u0 != i10 && c0.g.c(this)) {
            Animator animator2 = this.f20511s0;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            FloatingActionButton floatingActionButton = null;
            if (this.f20514v0 == 1) {
                View w10 = w();
                if (w10 instanceof FloatingActionButton) {
                    floatingActionButton = (FloatingActionButton) w10;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, "translationX", y(i10));
                ofFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(ofFloat3);
            } else {
                View w11 = w();
                if (w11 instanceof FloatingActionButton) {
                    floatingActionButton = (FloatingActionButton) w11;
                }
                if (floatingActionButton != null && !floatingActionButton.h()) {
                    floatingActionButton.g(new b(this, i10), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            animatorSet3.setInterpolator(w6.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, h6.a.f28768a));
            this.f20511s0 = animatorSet3;
            animatorSet3.addListener(new k6.a(this));
            this.f20511s0.start();
        }
        this.f20513u0 = i10;
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f20516x0 == i10) {
            return;
        }
        this.f20516x0 = i10;
        A();
        throw null;
    }

    public void setFabAnchorMode(int i10) {
        this.f20515w0 = i10;
        A();
        throw null;
    }

    public void setFabAnimationMode(int i10) {
        this.f20514v0 = i10;
    }

    public void setFabCornerSize(float f) {
        if (f == getTopEdgeTreatment().f30887v) {
            return;
        }
        getTopEdgeTreatment().f30887v = f;
        throw null;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f30885t = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f30884s = f;
        throw null;
    }

    public void setHideOnScroll(boolean z10) {
        this.f20517z0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.y0 != i10) {
            this.y0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                B(actionMenuView, this.f20513u0, z(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f20510r0 != null) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.f20510r0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f20510r0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public final View w() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((i) coordinatorLayout.f1521t.f32646t).getOrDefault(this, null);
        ArrayList arrayList = coordinatorLayout.f1523v;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int x(ActionMenuView actionMenuView, int i10, boolean z10) {
        int i11;
        int left;
        int i12;
        boolean z11;
        if (this.y0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean e10 = com.google.android.material.internal.n.e(this);
        if (e10) {
            i11 = getMeasuredWidth();
        } else {
            i11 = 0;
        }
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f643a & 8388615) == 8388611) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (e10) {
                    i11 = Math.min(i11, childAt.getLeft());
                } else {
                    i11 = Math.max(i11, childAt.getRight());
                }
            }
        }
        if (e10) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        if (getNavigationIcon() == null) {
            i12 = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!e10) {
                i12 = -i12;
            }
        } else {
            i12 = 0;
        }
        return i11 - ((left + 0) + i12);
    }

    public final float y(int i10) {
        boolean e10 = com.google.android.material.internal.n.e(this);
        int i11 = 1;
        if (i10 == 1) {
            View w10 = w();
            int i12 = 0;
            if (this.f20516x0 != -1 && w10 != null) {
                i12 = 0 + (w10.getMeasuredWidth() / 2) + this.f20516x0;
            }
            int measuredWidth = (getMeasuredWidth() / 2) - i12;
            if (e10) {
                i11 = -1;
            }
            return measuredWidth * i11;
        }
        return gl.Code;
    }

    public final boolean z() {
        FloatingActionButton floatingActionButton;
        View w10 = w();
        if (w10 instanceof FloatingActionButton) {
            floatingActionButton = (FloatingActionButton) w10;
        } else {
            floatingActionButton = null;
        }
        if (floatingActionButton != null && floatingActionButton.i()) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.C0 == null) {
            this.C0 = new Behavior();
        }
        return this.C0;
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: j, reason: collision with root package name */
        public final Rect f20518j;

        /* renamed from: k, reason: collision with root package name */
        public WeakReference<BottomAppBar> f20519k;

        /* renamed from: l, reason: collision with root package name */
        public int f20520l;

        /* renamed from: m, reason: collision with root package name */
        public final a f20521m;

        /* loaded from: classes2.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f20519k.get();
                if (bottomAppBar != null && ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    int height = view.getHeight();
                    if (!(view instanceof FloatingActionButton)) {
                        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                        if (behavior.f20520l == 0) {
                            int measuredHeight = (view.getMeasuredHeight() - height) / 2;
                            int i18 = bottomAppBar.f20515w0;
                            if (i18 == 1) {
                                ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight);
                            } else if (i18 == 0) {
                                ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = ((bottomAppBar.getBottomInset() + bottomAppBar.getMeasuredHeight()) - view.getMeasuredHeight()) / 2;
                            }
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                            if (com.google.android.material.internal.n.e(view)) {
                                ((ViewGroup.MarginLayoutParams) fVar).leftMargin += 0;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) fVar).rightMargin += 0;
                                return;
                            }
                        }
                        return;
                    }
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    behavior.f20518j.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f20521m = new a();
            this.f20518j = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f20519k = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.D0;
            View w10 = bottomAppBar.w();
            if (w10 != null) {
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                if (!c0.g.c(w10)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) w10.getLayoutParams();
                    fVar.f1533d = 17;
                    int i12 = bottomAppBar.f20515w0;
                    if (i12 == 1) {
                        fVar.f1533d = 49;
                    }
                    if (i12 == 0) {
                        fVar.f1533d |= 80;
                    }
                    this.f20520l = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) w10.getLayoutParams())).bottomMargin;
                    if (w10 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) w10;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.c();
                        floatingActionButton.d(new e(bottomAppBar));
                        floatingActionButton.e();
                    }
                    w10.addOnLayoutChangeListener(this.f20521m);
                    bottomAppBar.A();
                    throw null;
                }
            }
            coordinatorLayout.s(i10, bottomAppBar);
            super.h(coordinatorLayout, bottomAppBar, i10);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i10, i11)) {
                return true;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20521m = new a();
            this.f20518j = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
