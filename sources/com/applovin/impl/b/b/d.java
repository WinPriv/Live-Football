package com.applovin.impl.b.b;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class d extends FrameLayout {
    public d(Context context) {
        super(context);
    }

    public void a() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.applovin_sdk_consentFlowGdprControlsViewHeight);
        ViewGroup.LayoutParams layoutParams = getControlsView().getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        getControlsView().setLayoutParams(layoutParams);
        ScrollView scrollView = getScrollView();
        if (scrollView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) scrollView.getLayoutParams();
        layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, dimensionPixelSize);
    }

    public ViewGroup getControlsView() {
        return null;
    }

    public ScrollView getScrollView() {
        return null;
    }
}
