package com.anythink.expressad.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class AnyThinkRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11643a;

    /* renamed from: b, reason: collision with root package name */
    private AnimatorSet f11644b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11645c;

    public AnyThinkRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f11644b;
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
        if (!this.f11643a) {
            this.f11643a = true;
        }
        AnimatorSet animatorSet = this.f11644b;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f11644b = animatorSet;
    }

    public AnyThinkRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
