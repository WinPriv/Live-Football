package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public final class q extends s {
    public q(RecyclerView.o oVar) {
        super(oVar);
    }

    @Override // androidx.recyclerview.widget.s
    public final int b(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.f2377a.getClass();
        return RecyclerView.o.H(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.f2377a.getClass();
        Rect rect = ((RecyclerView.p) view.getLayoutParams()).f2171b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int d(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.f2377a.getClass();
        Rect rect = ((RecyclerView.p) view.getLayoutParams()).f2171b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int e(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.f2377a.getClass();
        return (view.getLeft() - RecyclerView.o.A(view)) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int f() {
        return this.f2377a.f2163n;
    }

    @Override // androidx.recyclerview.widget.s
    public final int g() {
        RecyclerView.o oVar = this.f2377a;
        return oVar.f2163n - oVar.D();
    }

    @Override // androidx.recyclerview.widget.s
    public final int h() {
        return this.f2377a.D();
    }

    @Override // androidx.recyclerview.widget.s
    public final int i() {
        return this.f2377a.f2161l;
    }

    @Override // androidx.recyclerview.widget.s
    public final int j() {
        return this.f2377a.f2162m;
    }

    @Override // androidx.recyclerview.widget.s
    public final int k() {
        return this.f2377a.C();
    }

    @Override // androidx.recyclerview.widget.s
    public final int l() {
        RecyclerView.o oVar = this.f2377a;
        return (oVar.f2163n - oVar.C()) - oVar.D();
    }

    @Override // androidx.recyclerview.widget.s
    public final int m(View view) {
        RecyclerView.o oVar = this.f2377a;
        Rect rect = this.f2379c;
        oVar.K(view, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.s
    public final int n(View view) {
        RecyclerView.o oVar = this.f2377a;
        Rect rect = this.f2379c;
        oVar.K(view, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.s
    public final void o(int i10) {
        this.f2377a.O(i10);
    }
}
