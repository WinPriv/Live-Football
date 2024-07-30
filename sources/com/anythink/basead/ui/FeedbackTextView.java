package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.anythink.core.common.k.h;
import com.anythink.expressad.foundation.h.i;

/* loaded from: classes.dex */
public class FeedbackTextView extends AutoResizeTextView {
    public FeedbackTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(h.a(context, "myoffer_bg_feedback_textview", i.f10125c));
    }

    private void a(Context context) {
        setBackgroundResource(h.a(context, "myoffer_bg_feedback_textview", i.f10125c));
    }
}
