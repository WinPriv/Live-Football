package androidx.viewpager2.adapter;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f2542s;

    public c(FragmentStateAdapter fragmentStateAdapter) {
        this.f2542s = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f2542s;
        fragmentStateAdapter.o = false;
        fragmentStateAdapter.f();
    }
}
