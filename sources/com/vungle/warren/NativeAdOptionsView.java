package com.vungle.warren;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.warren.AdConfig;
import com.vungle.warren.utility.ViewUtility;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class NativeAdOptionsView extends FrameLayout {
    private static final int AD_OPTIONS_VIEW_SIZE = 20;
    private ImageView icon;

    public NativeAdOptionsView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        this.icon = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.icon.setLayoutParams(layoutParams);
        addView(this.icon);
    }

    public void destroy() {
        removeAllViews();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    public void renderTo(NativeAd nativeAd, FrameLayout frameLayout, @AdConfig.AdOptionsPosition int i10) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        frameLayout.addView(this);
        nativeAd.displayImage(nativeAd.getPrivacyIconUrl(), this.icon);
        nativeAd.registerClickEvent(this, 2);
        int dpToPixels = ViewUtility.dpToPixels(getContext(), 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPixels, dpToPixels);
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    layoutParams.gravity = 8388661;
                } else {
                    layoutParams.gravity = 8388693;
                }
            } else {
                layoutParams.gravity = 8388691;
            }
        } else {
            layoutParams.gravity = 8388659;
        }
        setLayoutParams(layoutParams);
        frameLayout.requestLayout();
    }

    public NativeAdOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public NativeAdOptionsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }
}
