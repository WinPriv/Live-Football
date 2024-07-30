package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ZF implements InterfaceC1089Nl {
    public final /* synthetic */ ZC A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1089Nl
    public final void A8f() {
        C1377Yu c1377Yu;
        DY dy;
        c1377Yu = this.A00.A02;
        String A00 = c1377Yu.A0R().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        KL kl = new KL();
        dy = this.A00.A03;
        KL.A0E(kl, dy, KM.A00(A00), this.A00.A63());
    }

    public ZF(ZC zc2) {
        this.A00 = zc2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1089Nl
    public final void AAZ(C07268o c07268o) {
        new Handler(Looper.getMainLooper()).postDelayed(new ZG(this, c07268o), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1089Nl
    public final void AAn() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1089Nl
    public final void ACR(View view, MotionEvent motionEvent) {
    }
}
