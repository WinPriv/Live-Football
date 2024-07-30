package androidx.viewpager2.adapter;

import androidx.viewpager2.adapter.FragmentStateAdapter;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class e extends FragmentStateAdapter.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter.b f2544b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FragmentStateAdapter.b bVar) {
        super(0);
        this.f2544b = bVar;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter.a, androidx.recyclerview.widget.RecyclerView.i
    public final void onChanged() {
        this.f2544b.b(true);
    }
}
