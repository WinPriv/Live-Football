package com.google.android.material.floatingactionbutton;

import a3.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import h6.g;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* loaded from: classes2.dex */
    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, ContentRecord.WIDTH);
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends Property<View, Float> {
        public b() {
            super(Float.class, ContentRecord.HEIGHT);
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends Property<View, Float> {
        public c() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            return Float.valueOf(c0.e.f(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            int intValue = f.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.e.k(view2, intValue, paddingTop, c0.e.e(view2), view2.getPaddingBottom());
        }
    }

    /* loaded from: classes2.dex */
    public class d extends Property<View, Float> {
        public d() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            return Float.valueOf(c0.e.e(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.e.k(view2, c0.e.f(view2), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new a();
        new b();
        new c();
        new d();
    }

    public static void e(ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(l.i("Unknown strategy type: ", i10));
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(g.a(i10, getContext()));
    }

    public void setExtended(boolean z10) {
        if (!z10) {
        } else {
            throw null;
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.a(i10, getContext()));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.a(i10, getContext()));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(g.a(i10, getContext()));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        getTextColors();
    }

    /* loaded from: classes2.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f20750a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20751b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f20752c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f20751b = false;
            this.f20752c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ boolean a(View view) {
            return false;
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
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z10 = ((CoordinatorLayout.f) layoutParams).f1530a instanceof BottomSheetBehavior;
                } else {
                    z10 = false;
                }
                if (z10) {
                    t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z10;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList f = coordinatorLayout.f(extendedFloatingActionButton);
            int size = f.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) f.get(i11);
                if (view2 instanceof AppBarLayout) {
                    s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z10 = ((CoordinatorLayout.f) layoutParams).f1530a instanceof BottomSheetBehavior;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.s(i10, extendedFloatingActionButton);
            return true;
        }

        public final void s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z11 = this.f20751b;
            int i10 = 1;
            int i11 = 0;
            boolean z12 = this.f20752c;
            if ((!z11 && !z12) || fVar.f != appBarLayout.getId()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return;
            }
            if (this.f20750a == null) {
                this.f20750a = new Rect();
            }
            Rect rect = this.f20750a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (z12) {
                    i10 = 2;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
                throw null;
            }
            if (z12) {
                i11 = 3;
            }
            ExtendedFloatingActionButton.e(extendedFloatingActionButton, i11);
            throw null;
        }

        public final void t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z11 = this.f20751b;
            int i10 = 1;
            int i11 = 0;
            boolean z12 = this.f20752c;
            if ((!z11 && !z12) || fVar.f != view.getId()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (z12) {
                    i10 = 2;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
                throw null;
            }
            if (z12) {
                i11 = 3;
            }
            ExtendedFloatingActionButton.e(extendedFloatingActionButton, i11);
            throw null;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.U);
            this.f20751b = obtainStyledAttributes.getBoolean(0, false);
            this.f20752c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
    }
}
