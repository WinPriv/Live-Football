package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.h;
import com.anythink.expressad.foundation.h.i;

/* loaded from: classes.dex */
public class ShakeBorderThumbView extends BaseShakeView {
    public ShakeBorderThumbView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public final void a() {
        setOrientation(0);
        setGravity(17);
        setBackgroundResource(h.a(n.a().g(), "myoffer_bg_shake_border_thumb", i.f10125c));
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_shake_border_thumb", "layout"), (ViewGroup) this, true);
        int a10 = h.a(getContext(), 10.0f);
        int a11 = h.a(getContext(), 12.0f);
        int a12 = h.a(getContext(), 6.0f);
        setPadding(a10, a12, a11, a12);
    }

    public ShakeBorderThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeBorderThumbView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public ShakeBorderThumbView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
