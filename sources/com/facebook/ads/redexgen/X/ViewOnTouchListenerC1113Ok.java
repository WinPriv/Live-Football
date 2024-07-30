package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ok, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1113Ok implements View.OnTouchListener {
    public final /* synthetic */ P1 A00;

    public ViewOnTouchListenerC1113Ok(P1 p12) {
        this.A00 = p12;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C8N c8n;
        c8n = this.A00.A0B;
        c8n.A02(new C0982Jd(view, motionEvent));
        return false;
    }
}
