package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public final class r extends s {
    public r(RecyclerView.o oVar) {
        super(oVar);
    }

    @Override // androidx.recyclerview.widget.s
    public final int b(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.f2377a.getClass();
        return RecyclerView.o.u(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.f2377a.getClass();
        Rect rect = ((RecyclerView.p) view.getLayoutParams()).f2171b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int d(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.f2377a.getClass();
        Rect rect = ((RecyclerView.p) view.getLayoutParams()).f2171b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int e(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.f2377a.getClass();
        return (view.getTop() - RecyclerView.o.J(view)) - ((ViewGroup.MarginLayoutParams) pVar).topMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int f() {
        return this.f2377a.o;
    }

    @Override // androidx.recyclerview.widget.s
    public final int g() {
        RecyclerView.o oVar = this.f2377a;
        return oVar.o - oVar.B();
    }

    @Override // androidx.recyclerview.widget.s
    public final int h() {
        return this.f2377a.B();
    }

    @Override // androidx.recyclerview.widget.s
    public final int i() {
        return this.f2377a.f2162m;
    }

    @Override // androidx.recyclerview.widget.s
    public final int j() {
        return this.f2377a.f2161l;
    }

    @Override // androidx.recyclerview.widget.s
    public final int k() {
        return this.f2377a.E();
    }

    @Override // androidx.recyclerview.widget.s
    public final int l() {
        RecyclerView.o oVar = this.f2377a;
        return (oVar.o - oVar.E()) - oVar.B();
    }

    @Override // androidx.recyclerview.widget.s
    public final int m(View view) {
        RecyclerView.o oVar = this.f2377a;
        Rect rect = this.f2379c;
        oVar.K(view, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.s
    public final int n(View view) {
        RecyclerView.o oVar = this.f2377a;
        Rect rect = this.f2379c;
        oVar.K(view, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.s
    public final void o(int i10) {
        this.f2377a.P(i10);
    }
}
