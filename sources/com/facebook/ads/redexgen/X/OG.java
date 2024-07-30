package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class OG {
    public final int[] A00(View view, int i10, int i11) {
        C4U c4u = (C4U) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i10, view.getPaddingLeft() + view.getPaddingRight(), c4u.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i11, childWidthSpec + view.getPaddingBottom(), c4u.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c4u.leftMargin + c4u.rightMargin, childWidthSpec3 + c4u.bottomMargin + c4u.topMargin};
    }
}
