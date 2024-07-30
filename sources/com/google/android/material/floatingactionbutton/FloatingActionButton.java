package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import d7.j;
import d7.n;
import h6.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k6.b;
import k6.e;
import n0.c0;
import n0.l0;

/* loaded from: classes2.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements u6.a, n, CoordinatorLayout.b {
    public int A;
    public boolean B;
    public v6.c C;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f20753t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f20754u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f20755v;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuff.Mode f20756w;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f20757x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f20758z;

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements c7.b {
        public b() {
        }
    }

    /* loaded from: classes2.dex */
    public class c<T extends FloatingActionButton> implements d.f {
        public c(FloatingActionButton floatingActionButton) {
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private d getImpl() {
        if (this.C == null) {
            this.C = new v6.c(this, new b());
        }
        return this.C;
    }

    @Override // u6.a
    public final boolean a() {
        throw null;
    }

    public final void c() {
        d impl = getImpl();
        if (impl.o == null) {
            impl.o = new ArrayList<>();
        }
        impl.o.add(null);
    }

    public final void d(e eVar) {
        d impl = getImpl();
        if (impl.f20785n == null) {
            impl.f20785n = new ArrayList<>();
        }
        impl.f20785n.add(eVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().i(getDrawableState());
    }

    public final void e() {
        d impl = getImpl();
        c cVar = new c(this);
        if (impl.f20786p == null) {
            impl.f20786p = new ArrayList<>();
        }
        impl.f20786p.add(cVar);
    }

    public final int f(int i10) {
        int i11 = this.f20758z;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            if (i10 != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return f(1);
        }
        return f(0);
    }

    public final void g(k6.b bVar, boolean z10) {
        com.google.android.material.floatingactionbutton.a aVar;
        boolean z11;
        int i10;
        AnimatorSet c10;
        d impl = getImpl();
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = new com.google.android.material.floatingactionbutton.a(this, bVar);
        }
        boolean z12 = true;
        if (impl.f20787q.getVisibility() != 0 ? impl.f20784m != 2 : impl.f20784m == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            Animator animator = impl.f20778g;
            if (animator != null) {
                animator.cancel();
            }
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            FloatingActionButton floatingActionButton = impl.f20787q;
            if (!c0.g.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z12 = false;
            }
            if (z12) {
                g gVar = impl.f20780i;
                if (gVar != null) {
                    c10 = impl.b(gVar, gl.Code, gl.Code, gl.Code);
                } else {
                    c10 = impl.c(gl.Code, 0.4f, 0.4f, d.A, d.B);
                }
                c10.addListener(new com.google.android.material.floatingactionbutton.b(impl, z10, aVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.o;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c10.addListener(it.next());
                    }
                }
                c10.start();
                return;
            }
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            floatingActionButton.b(i10, z10);
            if (aVar != null) {
                aVar.f20762a.a(aVar.f20763b);
            }
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f20753t;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f20754u;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f20777e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.f20758z;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public g getHideMotionSpec() {
        return getImpl().f20780i;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f20757x;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f20757x;
    }

    public j getShapeAppearanceModel() {
        j jVar = getImpl().f20773a;
        jVar.getClass();
        return jVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f20779h;
    }

    public int getSize() {
        return this.y;
    }

    public int getSizeDimension() {
        return f(this.y);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f20755v;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f20756w;
    }

    public boolean getUseCompatPadding() {
        return this.B;
    }

    public final boolean h() {
        d impl = getImpl();
        if (impl.f20787q.getVisibility() == 0) {
            if (impl.f20784m != 1) {
                return false;
            }
        } else if (impl.f20784m == 2) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        d impl = getImpl();
        if (impl.f20787q.getVisibility() != 0) {
            if (impl.f20784m != 2) {
                return false;
            }
        } else if (impl.f20784m == 1) {
            return false;
        }
        return true;
    }

    public final void j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f20755v;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f20756w;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(f.c(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().g();
    }

    public final void k(b.a aVar, boolean z10) {
        com.google.android.material.floatingactionbutton.a aVar2;
        boolean z11;
        boolean z12;
        AnimatorSet c10;
        float f;
        float f10;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new com.google.android.material.floatingactionbutton.a(this, aVar);
        }
        boolean z13 = true;
        if (impl.f20787q.getVisibility() == 0 ? impl.f20784m != 1 : impl.f20784m == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            Animator animator = impl.f20778g;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.f20779h == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            FloatingActionButton floatingActionButton = impl.f20787q;
            if (!c0.g.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z13 = false;
            }
            Matrix matrix = impl.f20792v;
            if (z13) {
                if (floatingActionButton.getVisibility() != 0) {
                    float f11 = gl.Code;
                    floatingActionButton.setAlpha(gl.Code);
                    if (z12) {
                        f = 0.4f;
                    } else {
                        f = 0.0f;
                    }
                    floatingActionButton.setScaleY(f);
                    if (z12) {
                        f10 = 0.4f;
                    } else {
                        f10 = 0.0f;
                    }
                    floatingActionButton.setScaleX(f10);
                    if (z12) {
                        f11 = 0.4f;
                    }
                    impl.f20782k = f11;
                    impl.a(f11, matrix);
                    floatingActionButton.setImageMatrix(matrix);
                }
                g gVar = impl.f20779h;
                if (gVar != null) {
                    c10 = impl.b(gVar, 1.0f, 1.0f, 1.0f);
                } else {
                    c10 = impl.c(1.0f, 1.0f, 1.0f, d.y, d.f20772z);
                }
                c10.addListener(new com.google.android.material.floatingactionbutton.c(impl, z10, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f20785n;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c10.addListener(it.next());
                    }
                }
                c10.start();
                return;
            }
            floatingActionButton.b(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f20782k = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.f20762a.b();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        impl.getClass();
        if (!(impl instanceof v6.c)) {
            ViewTreeObserver viewTreeObserver = impl.f20787q.getViewTreeObserver();
            if (impl.f20793w == null) {
                impl.f20793w = new v6.b(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f20793w);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f20787q.getViewTreeObserver();
        v6.b bVar = impl.f20793w;
        if (bVar != null) {
            viewTreeObserver.removeOnPreDrawListener(bVar);
            impl.f20793w = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = (getSizeDimension() - this.A) / 2;
        getImpl().n();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f1595s);
        extendableSavedState.f21014u.getOrDefault("expandableWidgetHelper", null).getClass();
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new ExtendableSavedState(onSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if (c0.g.c(this)) {
                getWidth();
                getHeight();
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f20753t != colorStateList) {
            this.f20753t = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f20754u != mode) {
            this.f20754u = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f) {
        d impl = getImpl();
        if (impl.f20776d != f) {
            impl.f20776d = f;
            impl.j(f, impl.f20777e, impl.f);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.f20777e != f) {
            impl.f20777e = f;
            impl.j(impl.f20776d, f, impl.f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.f != f) {
            impl.f = f;
            impl.j(impl.f20776d, impl.f20777e, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 >= 0) {
            if (i10 != this.f20758z) {
                this.f20758z = i10;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f20774b) {
            getImpl().f20774b = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f20780i = gVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.a(i10, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            float f = impl.f20782k;
            impl.f20782k = f;
            Matrix matrix = impl.f20792v;
            impl.a(f, matrix);
            impl.f20787q.setImageMatrix(matrix);
            if (this.f20755v != null) {
                j();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        throw null;
    }

    public void setMaxImageSize(int i10) {
        this.A = i10;
        d impl = getImpl();
        if (impl.f20783l != i10) {
            impl.f20783l = i10;
            float f = impl.f20782k;
            impl.f20782k = f;
            Matrix matrix = impl.f20792v;
            impl.a(f, matrix);
            impl.f20787q.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<d.f> arrayList = getImpl().f20786p;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<d.f> arrayList = getImpl().f20786p;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        d impl = getImpl();
        impl.f20775c = z10;
        impl.n();
        throw null;
    }

    @Override // d7.n
    public void setShapeAppearanceModel(j jVar) {
        getImpl().f20773a = jVar;
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f20779h = gVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.a(i10, getContext()));
    }

    public void setSize(int i10) {
        this.f20758z = 0;
        if (i10 != this.y) {
            this.y = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f20755v != colorStateList) {
            this.f20755v = colorStateList;
            j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f20756w != mode) {
            this.f20756w = mode;
            j();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().k();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().k();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().k();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            getImpl().h();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f20759a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20760b;

        public BaseBehavior() {
            this.f20760b = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f1536h == 0) {
                fVar.f1536h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z10 = ((CoordinatorLayout.f) layoutParams).f1530a instanceof BottomSheetBehavior;
                } else {
                    z10 = false;
                }
                if (z10) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList f = coordinatorLayout.f(floatingActionButton);
            int size = f.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) f.get(i11);
                if (view2 instanceof AppBarLayout) {
                    if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z10 = ((CoordinatorLayout.f) layoutParams).f1530a instanceof BottomSheetBehavior;
                    } else {
                        z10 = false;
                    }
                    if (z10 && u(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.s(i10, floatingActionButton);
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.f20760b || fVar.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            return true;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f20759a == null) {
                this.f20759a = new Rect();
            }
            Rect rect = this.f20759a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.k(null, false);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (!s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.k(null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.activity.n.V);
            this.f20760b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f20757x != colorStateList) {
            this.f20757x = colorStateList;
            getImpl().l();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class a {
        public void b() {
        }

        public void a(FloatingActionButton floatingActionButton) {
        }
    }
}
