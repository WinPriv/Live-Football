package com.huawei.openalliance.ad.ppskit.views.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class WrapContentHeightGalleryView extends PPSGalleryView {
    public WrapContentHeightGalleryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.viewpager.PPSGalleryView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            i12 = Math.max(childAt.getMeasuredHeight(), i12);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
    }
}
