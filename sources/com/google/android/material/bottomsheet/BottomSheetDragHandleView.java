package com.google.android.material.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import o0.g;

/* loaded from: classes2.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: v, reason: collision with root package name */
    public BottomSheetBehavior<?> f20576v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20577w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20578x;
    public boolean y;

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f20576v;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.X.remove((Object) null);
            this.f20576v.A(null);
        }
        this.f20576v = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A(this);
            int i10 = this.f20576v.L;
            if (i10 == 4) {
                this.y = true;
            } else if (i10 == 3) {
                this.y = false;
            }
            c0.j(this, g.a.f33524e, new b(this, 10));
            ArrayList<BottomSheetBehavior.c> arrayList = this.f20576v.X;
            if (!arrayList.contains(null)) {
                arrayList.add(null);
            }
        }
        c();
    }

    public final void c() {
        boolean z10;
        int i10 = 1;
        if (this.f20577w && this.f20576v != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20578x = z10;
        if (this.f20576v == null) {
            i10 = 2;
        }
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.s(this, i10);
        setClickable(this.f20578x);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z10) {
        this.f20577w = z10;
        c();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f1530a;
                if (cVar instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) cVar;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }
}
