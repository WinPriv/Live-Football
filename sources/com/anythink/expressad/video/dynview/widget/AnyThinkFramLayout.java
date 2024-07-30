package com.anythink.expressad.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class AnyThinkFramLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private AnimatorSet f11605a;

    public AnyThinkFramLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f11605a;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f11605a;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f11605a = animatorSet;
    }

    public AnyThinkFramLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkFramLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
