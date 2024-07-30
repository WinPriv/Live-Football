package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import gb.r0;

/* loaded from: classes2.dex */
public class AutoSizeTextView extends TextView {
    public AutoSizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int lineCount = getLineCount();
        int b10 = r0.b(getContext(), getTextSize());
        if (lineCount > 1 && b10 > 10) {
            setTextSize(1, b10 - 1);
        }
    }
}
