package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class i implements RecyclerView.q {
    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) pVar).width == -1 && ((ViewGroup.MarginLayoutParams) pVar).height == -1) {
        } else {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a() {
    }
}
