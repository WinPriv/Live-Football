package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import n0.c0;

/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final View f1136a;

    /* renamed from: d, reason: collision with root package name */
    public k0 f1139d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f1140e;
    public k0 f;

    /* renamed from: c, reason: collision with root package name */
    public int f1138c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final f f1137b = f.a();

    public c(View view) {
        this.f1136a = view;
    }

    public final void a() {
        boolean z10;
        View view = this.f1136a;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z11 = false;
            if (this.f1139d != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f == null) {
                    this.f = new k0();
                }
                k0 k0Var = this.f;
                k0Var.f1196a = null;
                k0Var.f1199d = false;
                k0Var.f1197b = null;
                k0Var.f1198c = false;
                WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
                ColorStateList g6 = c0.i.g(view);
                if (g6 != null) {
                    k0Var.f1199d = true;
                    k0Var.f1196a = g6;
                }
                PorterDuff.Mode h10 = c0.i.h(view);
                if (h10 != null) {
                    k0Var.f1198c = true;
                    k0Var.f1197b = h10;
                }
                if (k0Var.f1199d || k0Var.f1198c) {
                    f.e(background, k0Var, view.getDrawableState());
                    z11 = true;
                }
                if (z11) {
                    return;
                }
            }
            k0 k0Var2 = this.f1140e;
            if (k0Var2 != null) {
                f.e(background, k0Var2, view.getDrawableState());
                return;
            }
            k0 k0Var3 = this.f1139d;
            if (k0Var3 != null) {
                f.e(background, k0Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        k0 k0Var = this.f1140e;
        if (k0Var != null) {
            return k0Var.f1196a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        k0 k0Var = this.f1140e;
        if (k0Var != null) {
            return k0Var.f1197b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        ColorStateList h10;
        View view = this.f1136a;
        Context context = view.getContext();
        int[] iArr = a0.a.f7d0;
        m0 m10 = m0.m(context, attributeSet, iArr, i10);
        View view2 = this.f1136a;
        n0.c0.k(view2, view2.getContext(), iArr, attributeSet, m10.f1206b, i10);
        try {
            if (m10.l(0)) {
                this.f1138c = m10.i(0, -1);
                f fVar = this.f1137b;
                Context context2 = view.getContext();
                int i11 = this.f1138c;
                synchronized (fVar) {
                    h10 = fVar.f1160a.h(i11, context2);
                }
                if (h10 != null) {
                    g(h10);
                }
            }
            if (m10.l(1)) {
                c0.i.q(view, m10.b(1));
            }
            if (m10.l(2)) {
                c0.i.r(view, x.c(m10.h(2, -1), null));
            }
        } finally {
            m10.n();
        }
    }

    public final void e() {
        this.f1138c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.f1138c = i10;
        f fVar = this.f1137b;
        if (fVar != null) {
            Context context = this.f1136a.getContext();
            synchronized (fVar) {
                colorStateList = fVar.f1160a.h(i10, context);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1139d == null) {
                this.f1139d = new k0();
            }
            k0 k0Var = this.f1139d;
            k0Var.f1196a = colorStateList;
            k0Var.f1199d = true;
        } else {
            this.f1139d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f1140e == null) {
            this.f1140e = new k0();
        }
        k0 k0Var = this.f1140e;
        k0Var.f1196a = colorStateList;
        k0Var.f1199d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f1140e == null) {
            this.f1140e = new k0();
        }
        k0 k0Var = this.f1140e;
        k0Var.f1197b = mode;
        k0Var.f1198c = true;
        a();
    }
}
