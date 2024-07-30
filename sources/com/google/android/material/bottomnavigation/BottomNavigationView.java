package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.activity.n;
import androidx.appcompat.widget.m0;
import com.google.android.material.internal.k;
import com.google.android.material.navigation.NavigationBarView;
import com.hamkho.livefoot.R;

/* loaded from: classes2.dex */
public class BottomNavigationView extends NavigationBarView {

    @Deprecated
    /* loaded from: classes2.dex */
    public interface a extends NavigationBarView.a {
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface b extends NavigationBarView.b {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m0 e10 = k.e(getContext(), attributeSet, n.N, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        setItemHorizontalTranslationEnabled(e10.a(2, true));
        if (e10.l(0)) {
            setMinimumHeight(e10.d(0, 0));
        }
        e10.a(1, true);
        e10.n();
        com.google.android.material.internal.n.a(this, new l6.a());
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) != 1073741824 && suggestedMinimumHeight > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.f20533g0 != z10) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z10);
            getPresenter().c(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(b bVar) {
        setOnItemSelectedListener(bVar);
    }
}
