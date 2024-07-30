package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.anythink.core.common.k.h;

/* loaded from: classes.dex */
public class ShakeTextHintWhiteView extends BaseShakeView {
    public ShakeTextHintWhiteView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public final void a() {
        setOrientation(0);
        setGravity(17);
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_shake_text_hint_white", "layout"), (ViewGroup) this, true);
        int a10 = h.a(getContext(), 4.0f);
        setPadding(a10, a10, a10, a10);
    }

    public ShakeTextHintWhiteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeTextHintWhiteView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public ShakeTextHintWhiteView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
