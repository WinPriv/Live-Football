package d9;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import w8.c;

/* compiled from: CricketViewPagerAdapter.java */
/* loaded from: classes2.dex */
public final class a extends FragmentStateAdapter {
    public a(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new c();
            }
            return new w8.b();
        }
        return new w8.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        return 3;
    }
}
