package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1088Nk implements View.OnTouchListener {
    public final /* synthetic */ C07278p A00;

    public ViewOnTouchListenerC1088Nk(C07278p c07278p) {
        this.A00 = c07278p;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1092No c1092No;
        c1092No = this.A00.A0E;
        c1092No.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
