package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* loaded from: assets/audience_network.dex */
public class XH implements InterfaceC1089Nl {
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ XC A01;
    public final /* synthetic */ C1228Sw A02;

    public XH(XC xc2, C1228Sw c1228Sw, NativeAd nativeAd) {
        this.A01 = xc2;
        this.A02 = c1228Sw;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1089Nl
    public final void A8f() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1089Nl
    public final void AAZ(C07268o c07268o) {
        new Handler(Looper.getMainLooper()).postDelayed(new XI(this, c07268o), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1089Nl
    public final void AAn() {
        C07268o c07268o;
        C07268o c07268o2;
        c07268o = this.A01.A0A;
        if (c07268o != null) {
            c07268o2 = this.A01.A0A;
            c07268o2.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1089Nl
    public final void ACR(View view, MotionEvent motionEvent) {
        C1316Wj c1316Wj;
        boolean A0J;
        L6 A19 = this.A02.A19();
        c1316Wj = this.A01.A07;
        A19.A06(c1316Wj, motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0J = this.A01.A0J(this.A00);
            if (!A0J && this.A02.A12() != null) {
                this.A02.A12().onClick(view);
            }
        }
    }
}
