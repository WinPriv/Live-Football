package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class NA {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.2L] */
    public static C2L A00(final NV nv, final C1228Sw c1228Sw, final String str, final AnonymousClass96 anonymousClass96) {
        final boolean z10 = true;
        return new C07368y(nv, c1228Sw, z10, str, anonymousClass96) { // from class: com.facebook.ads.redexgen.X.2L

            @Nullable
            public ViewOnClickListenerC1193Rm A00;

            @Nullable
            public OM A01;
            public final IT A02 = this.A0I.A05().A00().A08();
            public final C1228Sw A03;
            public final AnonymousClass96 A04;
            public final String A05;
            public static final int A07 = (int) (Kd.A02 * (-4.0f));
            public static final int A06 = (int) (Kd.A02 * 6.0f);

            {
                this.A03 = c1228Sw;
                this.A05 = str;
                this.A04 = anonymousClass96;
                this.A03.A1K(this);
            }

            @Override // com.facebook.ads.redexgen.X.RW
            public void setupNativeCtaExtension(OM om) {
                this.A01 = om;
                int A0L = ID.A0L(this.A0I.A05());
                C1K A01 = this.A03.A0z().A0N().A01();
                this.A00 = new ViewOnClickListenerC1193Rm(this.A0I.A05(), this.A03.A0z().A0T(), A01, this.A02, C1068Mq.getDummyListener(), this.A04.A0c(), this.A03.A19());
                this.A00.setCta(om.A03().A0F(), this.A05, new HashMap());
                this.A03.A1K(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (A0L == 1) {
                    layoutParams.addRule(12);
                    ViewOnClickListenerC1193Rm viewOnClickListenerC1193Rm = this.A00;
                    int i10 = A06;
                    int extensionVariant = A01.A09(false);
                    LE.A0P(viewOnClickListenerC1193Rm, i10, 5, extensionVariant);
                    ((C07368y) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (A0L != 2) {
                    return;
                }
                int extensionVariant2 = ((C07368y) this).A06.getId();
                layoutParams.addRule(3, extensionVariant2);
                int extensionVariant3 = A07;
                layoutParams.setMargins(0, extensionVariant3, 0, 0);
                addView(this.A00, 0, layoutParams);
                ((C07368y) this).A06.bringToFront();
            }
        };
    }

    public static C07368y A01(NV nv, String str, C1176Qv c1176Qv) {
        return new C07368y(nv, true, str, c1176Qv);
    }
}
