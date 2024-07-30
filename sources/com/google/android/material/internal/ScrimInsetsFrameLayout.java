package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public Drawable f20822s;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        getWidth();
        getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f20822s;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f20822s;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f20822s = drawable;
    }

    public void setDrawBottomInsetForeground(boolean z10) {
    }

    public void setDrawLeftInsetForeground(boolean z10) {
    }

    public void setDrawRightInsetForeground(boolean z10) {
    }

    public void setDrawTopInsetForeground(boolean z10) {
    }
}
