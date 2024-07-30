package com.anythink.expressad.splash.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class MBNoRecycledCrashImageView extends ImageView {
    public MBNoRecycledCrashImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        }
    }

    public MBNoRecycledCrashImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBNoRecycledCrashImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public MBNoRecycledCrashImageView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
