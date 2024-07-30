package f9;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/* compiled from: LeaguesDetailsViewPagerAdapter.java */
/* loaded from: classes2.dex */
public final class d extends FragmentStateAdapter {
    public d(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new y8.d();
            }
            return new y8.a();
        }
        return new y8.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        return 3;
    }
}
