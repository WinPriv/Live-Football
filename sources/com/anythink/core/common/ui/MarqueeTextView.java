package com.anythink.core.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class MarqueeTextView extends TextView {
    public MarqueeTextView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
