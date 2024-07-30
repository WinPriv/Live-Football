package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2536s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f2537t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f2538u;

    public a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, f fVar) {
        this.f2538u = fragmentStateAdapter;
        this.f2536s = frameLayout;
        this.f2537t = fVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        FrameLayout frameLayout = this.f2536s;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.f2538u.h(this.f2537t);
        }
    }
}
