package com.anythink.expressad.videocommon.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.anythink.expressad.widget.ATImageView;

/* loaded from: classes.dex */
public class MyImageView extends ATImageView {
    public MyImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.anythink.expressad.widget.ATImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception unused) {
        }
    }

    public MyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyImageView(Context context) {
        super(context);
    }
}
