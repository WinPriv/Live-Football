package com.anythink.expressad.video.dynview.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class AnyThinkTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private ObjectAnimator f11658a;

    public AnyThinkTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f11658a;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f11658a;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f11658a = objectAnimator;
    }

    public AnyThinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
