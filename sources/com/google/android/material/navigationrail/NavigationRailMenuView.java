package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

/* loaded from: classes2.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {

    /* renamed from: c0, reason: collision with root package name */
    public int f20935c0;

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public final NavigationBarItemView e(Context context) {
        return new NavigationRailItemView(context);
    }

    public final int g(View view, int i10, int i11, int i12) {
        int makeMeasureSpec;
        int i13;
        if (view == null) {
            int max = i11 / Math.max(1, i12);
            int i14 = this.f20935c0;
            if (i14 == -1) {
                i14 = View.MeasureSpec.getSize(i10);
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i14, max), 0);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i10, makeMeasureSpec);
                    i13 = childAt.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                i15 += i13;
            }
        }
        return i15;
    }

    public int getItemMinimumHeight() {
        return this.f20935c0;
    }

    public int getMenuGravity() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                childAt.layout(0, i15, i14, measuredHeight);
                i15 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int g6;
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = getMenu().l().size();
        if (size2 > 1 && NavigationBarMenuView.f(getLabelVisibilityMode(), size2)) {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int max = size / Math.max(1, size2);
                int i13 = this.f20935c0;
                if (i13 == -1) {
                    i13 = View.MeasureSpec.getSize(i10);
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i13, max), 0);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i10, makeMeasureSpec);
                    i12 = childAt.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                size -= i12;
                size2--;
            } else {
                i12 = 0;
            }
            g6 = g(childAt, i10, size, size2) + i12;
        } else {
            g6 = g(null, i10, size, size2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.resolveSizeAndState(g6, i11, 0));
    }

    public void setItemMinimumHeight(int i10) {
        if (this.f20935c0 != i10) {
            this.f20935c0 = i10;
            requestLayout();
        }
    }

    public void setMenuGravity(int i10) {
        throw null;
    }
}
