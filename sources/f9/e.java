package f9;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/* compiled from: ScoresViewPagerAdapter.java */
/* loaded from: classes2.dex */
public final class e extends FragmentStateAdapter {
    public e(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new a9.b();
            }
            return new a9.a();
        }
        return new a9.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        return 3;
    }
}
