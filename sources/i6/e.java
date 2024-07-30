package i6;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.q0;

/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes2.dex */
public abstract class e extends f<View> {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f29186c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f29187d;

    /* renamed from: e, reason: collision with root package name */
    public int f29188e;
    public int f;

    public e() {
        this.f29186c = new Rect();
        this.f29187d = new Rect();
        this.f29188e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout u2;
        int i13;
        q0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 == -1 || i14 == -2) && (u2 = u(coordinatorLayout.f(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                if (c0.d.b(u2) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.a() + lastWindowInsets.d();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int w10 = w(u2) + size;
            int measuredHeight = u2.getMeasuredHeight();
            if (this instanceof SearchBar.ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(gl.Code);
                w10 -= measuredHeight;
            }
            if (i14 == -1) {
                i13 = 1073741824;
            } else {
                i13 = Integer.MIN_VALUE;
            }
            coordinatorLayout.t(view, i10, i11, View.MeasureSpec.makeMeasureSpec(w10, i13));
            return true;
        }
        return false;
    }

    @Override // i6.f
    public final void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout u2 = u(coordinatorLayout.f(view));
        int i11 = 0;
        if (u2 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
            int bottom = u2.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
            int bottom2 = ((u2.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
            Rect rect = this.f29186c;
            rect.set(paddingLeft, bottom, width, bottom2);
            q0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                if (c0.d.b(coordinatorLayout) && !c0.d.b(view)) {
                    rect.left = lastWindowInsets.b() + rect.left;
                    rect.right -= lastWindowInsets.c();
                }
            }
            Rect rect2 = this.f29187d;
            int i12 = fVar.f1532c;
            if (i12 == 0) {
                i12 = 8388659;
            }
            n0.e.b(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            if (this.f != 0) {
                float v3 = v(u2);
                int i13 = this.f;
                i11 = a0.a.B0((int) (v3 * i13), 0, i13);
            }
            view.layout(rect2.left, rect2.top - i11, rect2.right, rect2.bottom - i11);
            this.f29188e = rect2.top - u2.getBottom();
            return;
        }
        coordinatorLayout.s(i10, view);
        this.f29188e = 0;
    }

    public abstract AppBarLayout u(ArrayList arrayList);

    public float v(View view) {
        return 1.0f;
    }

    public int w(View view) {
        return view.getMeasuredHeight();
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29186c = new Rect();
        this.f29187d = new Rect();
        this.f29188e = 0;
    }
}
