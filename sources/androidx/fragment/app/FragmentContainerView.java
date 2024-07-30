package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.hamkho.livefoot.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.c0;
import n0.q0;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public ArrayList<View> f1720s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<View> f1721t;

    /* renamed from: u, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1722u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1723v;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        this.f1723v = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.M);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException(e0.i.g("FragmentContainerView must be within a FragmentActivity to use ", str, "=\"", classAttribute, "\""));
            }
        }
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.f1721t;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f1720s == null) {
                this.f1720s = new ArrayList<>();
            }
            this.f1720s.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        Fragment fragment;
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            fragment = (Fragment) tag;
        } else {
            fragment = null;
        }
        if (fragment != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        Fragment fragment;
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            fragment = (Fragment) tag;
        } else {
            fragment = null;
        }
        if (fragment != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        q0 q0Var;
        q0 g6 = q0.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1722u;
        if (onApplyWindowInsetsListener != null) {
            q0Var = q0.g(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), null);
        } else {
            WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
            WindowInsets f = g6.f();
            if (f != null) {
                WindowInsets b10 = c0.h.b(this, f);
                if (!b10.equals(f)) {
                    g6 = q0.g(b10, this);
                }
            }
            q0Var = g6;
        }
        if (!q0Var.f33099a.m()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                WeakHashMap<View, n0.l0> weakHashMap2 = n0.c0.f33054a;
                WindowInsets f10 = q0Var.f();
                if (f10 != null) {
                    WindowInsets a10 = c0.h.a(childAt, f10);
                    if (!a10.equals(f10)) {
                        q0.g(a10, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f1723v && this.f1720s != null) {
            for (int i10 = 0; i10 < this.f1720s.size(); i10++) {
                super.drawChild(canvas, this.f1720s.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList<View> arrayList;
        if (this.f1723v && (arrayList = this.f1720s) != null && arrayList.size() > 0 && this.f1720s.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1721t;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1720s;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1723v = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        if (z10) {
            a(view);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    public void setDrawDisappearingViewsLast(boolean z10) {
        this.f1723v = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1722u = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1721t == null) {
                this.f1721t = new ArrayList<>();
            }
            this.f1721t.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        View view;
        this.f1723v = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.M);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment A = fragmentManager.A(id2);
        if (classAttribute != null && A == null) {
            if (id2 <= 0) {
                throw new IllegalStateException(a3.k.l("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            p E = fragmentManager.E();
            context.getClassLoader();
            Fragment instantiate = Fragment.instantiate(FragmentManager.this.f1737p.f1865t, classAttribute, null);
            instantiate.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(fragmentManager);
            aVar.o = true;
            instantiate.mContainer = this;
            aVar.c(getId(), instantiate, string, 1);
            if (!aVar.f1895g) {
                aVar.f1776p.x(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fragmentManager.f1726c.d().iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            Fragment fragment = wVar.f1883c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                wVar.b();
            }
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }
}
