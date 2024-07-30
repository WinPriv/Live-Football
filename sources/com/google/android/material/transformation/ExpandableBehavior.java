package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a, reason: collision with root package name */
    public int f21236a;

    /* loaded from: classes2.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ View f21237s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f21238t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u6.a f21239u;

        public a(View view, int i10, u6.a aVar) {
            this.f21237s = view;
            this.f21238t = i10;
            this.f21239u = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f21237s;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f21236a == this.f21238t) {
                u6.a aVar = this.f21239u;
                expandableBehavior.s((View) aVar, view, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f21236a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z10;
        int i10;
        u6.a aVar = (u6.a) view2;
        int i11 = 2;
        if (!aVar.a() ? this.f21236a != 1 : (i10 = this.f21236a) != 0 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        if (aVar.a()) {
            i11 = 1;
        }
        this.f21236a = i11;
        s((View) aVar, view, aVar.a(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        u6.a aVar;
        boolean z10;
        int i11;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (!c0.g.c(view)) {
            ArrayList f = coordinatorLayout.f(view);
            int size = f.size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    View view2 = (View) f.get(i12);
                    if (b(view, view2)) {
                        aVar = (u6.a) view2;
                        break;
                    }
                    i12++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                int i13 = 2;
                if (!aVar.a() ? this.f21236a != 1 : (i11 = this.f21236a) != 0 && i11 != 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (aVar.a()) {
                        i13 = 1;
                    }
                    this.f21236a = i13;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i13, aVar));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z10, boolean z11);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21236a = 0;
    }
}
