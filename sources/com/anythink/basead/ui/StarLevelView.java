package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.core.common.k.h;
import com.anythink.expressad.foundation.h.i;

/* loaded from: classes.dex */
public class StarLevelView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    Context f4472a;

    public StarLevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f4472a = context;
    }

    public void setState(boolean z10) {
        if (z10) {
            setImageResource(h.a(getContext(), "myoffer_splash_star", i.f10125c));
        } else {
            setImageResource(h.a(getContext(), "myoffer_splash_star_gray", i.f10125c));
        }
    }

    public StarLevelView(Context context) {
        this(context, null);
        this.f4472a = context;
    }

    public StarLevelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4472a = context;
    }
}
