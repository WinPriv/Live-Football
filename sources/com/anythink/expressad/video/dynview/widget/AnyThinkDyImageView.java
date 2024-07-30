package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.h.o;

/* loaded from: classes.dex */
public class AnyThinkDyImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11604a = "AnyThinkDyImageView";

    public AnyThinkDyImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            o.d(f11604a, th.getMessage());
        }
    }

    public AnyThinkDyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkDyImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
