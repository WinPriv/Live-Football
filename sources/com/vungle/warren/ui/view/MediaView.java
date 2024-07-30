package com.vungle.warren.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: classes2.dex */
public class MediaView extends RelativeLayout {
    private ImageView imageView;

    public MediaView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        this.imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.imageView.setLayoutParams(layoutParams);
        this.imageView.setAdjustViewBounds(true);
        addView(this.imageView);
        requestLayout();
    }

    public void destroy() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setImageDrawable(null);
            if (this.imageView.getParent() != null) {
                ((ViewGroup) this.imageView.getParent()).removeView(this.imageView);
            }
            this.imageView = null;
        }
    }

    public ImageView getMainImage() {
        if (this.imageView == null) {
            initView(getContext());
        }
        return this.imageView;
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }
}
