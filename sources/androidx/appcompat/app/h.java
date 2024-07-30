package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.u0;
import com.hamkho.livefoot.R;
import d0.a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.q0;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class h implements n0.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f657a;

    public h(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f657a = appCompatDelegateImpl;
    }

    @Override // n0.s
    public final q0 a(View view, q0 q0Var) {
        boolean z10;
        q0 q0Var2;
        q0.e bVar;
        boolean z11;
        int b10;
        int c10;
        boolean z12;
        boolean z13;
        int a10;
        int d10 = q0Var.d();
        AppCompatDelegateImpl appCompatDelegateImpl = this.f657a;
        appCompatDelegateImpl.getClass();
        int d11 = q0Var.d();
        ActionBarContextView actionBarContextView = appCompatDelegateImpl.N;
        int i10 = 0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.N.getLayoutParams();
            if (appCompatDelegateImpl.N.isShown()) {
                if (appCompatDelegateImpl.f609x0 == null) {
                    appCompatDelegateImpl.f609x0 = new Rect();
                    appCompatDelegateImpl.y0 = new Rect();
                }
                Rect rect = appCompatDelegateImpl.f609x0;
                Rect rect2 = appCompatDelegateImpl.y0;
                rect.set(q0Var.b(), q0Var.d(), q0Var.c(), q0Var.a());
                ViewGroup viewGroup = appCompatDelegateImpl.T;
                Method method = u0.f1273a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                ViewGroup viewGroup2 = appCompatDelegateImpl.T;
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                q0 a11 = c0.j.a(viewGroup2);
                if (a11 == null) {
                    b10 = 0;
                } else {
                    b10 = a11.b();
                }
                if (a11 == null) {
                    c10 = 0;
                } else {
                    c10 = a11.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z12 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z12 = true;
                }
                Context context = appCompatDelegateImpl.C;
                if (i11 > 0 && appCompatDelegateImpl.V == null) {
                    View view2 = new View(context);
                    appCompatDelegateImpl.V = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    appCompatDelegateImpl.T.addView(appCompatDelegateImpl.V, -1, layoutParams);
                } else {
                    View view3 = appCompatDelegateImpl.V;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            appCompatDelegateImpl.V.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = appCompatDelegateImpl.V;
                if (view4 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && view4.getVisibility() != 0) {
                    View view5 = appCompatDelegateImpl.V;
                    if ((c0.d.g(view5) & 8192) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        Object obj = d0.a.f27248a;
                        a10 = a.d.a(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        Object obj2 = d0.a.f27248a;
                        a10 = a.d.a(context, R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(a10);
                }
                if (!appCompatDelegateImpl.f588c0 && z10) {
                    d11 = 0;
                }
                z11 = z12;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            if (z11) {
                appCompatDelegateImpl.N.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = appCompatDelegateImpl.V;
        if (view6 != null) {
            if (!z10) {
                i10 = 8;
            }
            view6.setVisibility(i10);
        }
        if (d10 != d11) {
            int b11 = q0Var.b();
            int c11 = q0Var.c();
            int a12 = q0Var.a();
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 30) {
                bVar = new q0.d(q0Var);
            } else if (i16 >= 29) {
                bVar = new q0.c(q0Var);
            } else {
                bVar = new q0.b(q0Var);
            }
            bVar.d(f0.b.a(b11, d11, c11, a12));
            q0Var2 = bVar.b();
        } else {
            q0Var2 = q0Var;
        }
        WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
        WindowInsets f = q0Var2.f();
        if (f != null) {
            WindowInsets b12 = c0.h.b(view, f);
            if (!b12.equals(f)) {
                return q0.g(b12, view);
            }
            return q0Var2;
        }
        return q0Var2;
    }
}
