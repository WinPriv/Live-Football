package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class TQ extends AbstractC1405a1 implements View.OnAttachStateChangeListener {
    public final View A00;

    public TQ(View view) {
        this.A00 = view;
        this.A00.addOnAttachStateChangeListener(this);
        if (A04()) {
            A00();
        }
    }

    public final void A03() {
        A00();
    }

    public final boolean A04() {
        return AnonymousClass38.A0H(this.A00);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        A00();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        A01();
    }
}
