package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OW implements View.OnTouchListener {
    public final /* synthetic */ OX A00;

    public OW(OX ox) {
        this.A00 = ox;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        IT it;
        AnonymousClass18 anonymousClass18;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            OX.A00(this.A00);
            it = this.A00.A06;
            anonymousClass18 = this.A00.A03;
            it.A95(anonymousClass18.A0U(), new N2().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
