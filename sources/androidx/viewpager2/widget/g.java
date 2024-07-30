package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class g extends ViewPager2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f2587a;

    public g(ViewPager2 viewPager2) {
        this.f2587a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void a(int i10) {
        if (i10 == 0) {
            this.f2587a.d();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i10) {
        ViewPager2 viewPager2 = this.f2587a;
        if (viewPager2.f2549v != i10) {
            viewPager2.f2549v = i10;
            viewPager2.L.b();
        }
    }
}
