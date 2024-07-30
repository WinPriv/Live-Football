package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ic, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnAttachStateChangeListenerC0955Ic implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC0953Ia A00;
    public final /* synthetic */ C0954Ib A01;

    public ViewOnAttachStateChangeListenerC0955Ic(C0954Ib c0954Ib, EnumC0953Ia enumC0953Ia) {
        this.A01 = c0954Ib;
        this.A00 = enumC0953Ia;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A02(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
