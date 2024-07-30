package com.anythink.basead.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ScanningAnimTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    ValueAnimator f4418a;

    public ScanningAnimTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnimation();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (isShown() && i10 == 0) {
            startAnimation();
        } else {
            stopAnimation();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (isShown() && i10 == 0) {
            startAnimation();
        } else {
            stopAnimation();
        }
    }

    public void startAnimation() {
        if (this.f4418a == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.95f);
            this.f4418a = ofFloat;
            ofFloat.setDuration(500L);
            this.f4418a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.ScanningAnimTextView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    ScanningAnimTextView.this.setScaleX(floatValue);
                    ScanningAnimTextView.this.setScaleY(floatValue);
                }
            });
            this.f4418a.setRepeatMode(2);
            this.f4418a.setRepeatCount(-1);
        }
        if (!this.f4418a.isStarted()) {
            this.f4418a.start();
        }
    }

    public void stopAnimation() {
        ValueAnimator valueAnimator = this.f4418a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public ScanningAnimTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void a() {
    }
}
