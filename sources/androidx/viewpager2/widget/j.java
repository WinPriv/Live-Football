package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class j extends ViewPager2.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2.f f2589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ViewPager2.f fVar) {
        super(0);
        this.f2589b = fVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.c, androidx.recyclerview.widget.RecyclerView.i
    public final void onChanged() {
        this.f2589b.b();
    }
}
