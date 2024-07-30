package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.Zl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1389Zl {
    public final C1400Zw A00;
    public final C1398Zu A01;

    public C1389Zl(AbstractC1405a1 abstractC1405a1, C1398Zu c1398Zu, C1400Zw c1400Zw) {
        this.A00 = c1400Zw;
        this.A01 = c1398Zu;
        abstractC1405a1.A02(new F7(c1398Zu));
    }

    public static C1389Zl A00(AbstractC1405a1 abstractC1405a1, InterfaceC1409a5 interfaceC1409a5, F9 f92) {
        C1400Zw c1400Zw = new C1400Zw();
        C1398Zu viewpointScanner = new C1398Zu(interfaceC1409a5, new FC(), f92, c1400Zw, new Handler());
        return new C1389Zl(abstractC1405a1, viewpointScanner, c1400Zw);
    }

    public final void A01(View view) {
        this.A00.A01(view);
    }

    public final void A02(View view, C1407a3 c1407a3) {
        this.A00.A02(view, c1407a3);
    }

    public final void A03(@Nullable InterfaceC1404a0 interfaceC1404a0) {
        this.A01.A0B(interfaceC1404a0);
    }

    public final void A04(@Nullable InterfaceC1402Zy interfaceC1402Zy) {
        this.A01.A0C(interfaceC1402Zy);
    }
}
