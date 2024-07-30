package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class y extends RecyclerView.r {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f2388a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2389b = new a();

    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.t {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2390a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0 && this.f2390a) {
                this.f2390a = false;
                y.this.d();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0 || i11 != 0) {
                this.f2390a = true;
            }
        }
    }

    public final void a(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f2388a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.f2389b;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(aVar);
            this.f2388a.setOnFlingListener(null);
        }
        this.f2388a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() == null) {
                this.f2388a.addOnScrollListener(aVar);
                this.f2388a.setOnFlingListener(this);
                new Scroller(this.f2388a.getContext(), new DecelerateInterpolator());
                d();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.o oVar, View view);

    public abstract View c(RecyclerView.o oVar);

    public final void d() {
        RecyclerView.o layoutManager;
        View c10;
        RecyclerView recyclerView = this.f2388a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c10 = c(layoutManager)) == null) {
            return;
        }
        int[] b10 = b(layoutManager, c10);
        int i10 = b10[0];
        if (i10 != 0 || b10[1] != 0) {
            this.f2388a.smoothScrollBy(i10, b10[1]);
        }
    }
}
