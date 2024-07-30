package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class NS {
    public static NR A00(final NV nv, @Nullable Bundle bundle, boolean z10) {
        NR c1185Re;
        C1B A0O = nv.A04().A0O();
        double A00 = NQ.A00(A0O);
        boolean A0N = nv.A04().A0O().A0N();
        final boolean A05 = NQ.A05(nv.A00(), nv.A01(), A00);
        AbstractC05230f A002 = C05240g.A00(nv.A05(), nv.A06(), "", KM.A00(nv.A04().A0O().A0F().A05()), new HashMap());
        boolean z11 = !TextUtils.isEmpty(A0O.A0D().A08());
        if (ID.A1K(nv.A05())) {
            nv.A05().A09().AFD(nv.A02(), nv.A04().A0U(), z11);
        }
        if (A0N && (A002 instanceof C0866En)) {
            c1185Re = new RX(nv);
        } else if (z11) {
            c1185Re = new C07348w(nv);
        } else if (!z11 && ID.A1s(nv.A05())) {
            c1185Re = new AbstractC1188Rh(nv, A05) { // from class: com.facebook.ads.redexgen.X.8x
                public static final int A02 = Resources.getSystem().getDisplayMetrics().widthPixels;
                public final View A00;
                public final boolean A01;

                {
                    super(nv, true);
                    this.A01 = A05;
                    this.A00 = nv.A02();
                    A0f();
                    if (this.A01) {
                        addView(nv.A02(), new RelativeLayout.LayoutParams(-1, -1));
                    } else {
                        FrameLayout frameLayout = new FrameLayout(nv.A05());
                        RelativeLayout.LayoutParams insideContainerParams = new RelativeLayout.LayoutParams(-1, -1);
                        insideContainerParams.addRule(2, getAdDetailsView().getId());
                        frameLayout.setLayoutParams(insideContainerParams);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 17;
                        layoutParams.setMargins(NR.A08, 0, NR.A08, 0);
                        frameLayout.addView(this.A00, layoutParams);
                        addView(frameLayout);
                    }
                    getAdDetailsView().bringToFront();
                }

                @Override // com.facebook.ads.redexgen.X.NR
                public final boolean A02() {
                    return this.A01 && super.A02();
                }

                @Override // com.facebook.ads.redexgen.X.NR
                public final boolean A0B() {
                    return this.A01 && super.A02();
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC1188Rh, com.facebook.ads.redexgen.X.NR
                public final void A0b(C1B c1b, String str, double d10, @Nullable Bundle bundle2) {
                    super.A0b(c1b, str, d10, bundle2);
                    if (!this.A01 && d10 > 0.0d) {
                        int mediaHeight = (int) ((A02 - (NR.A08 * 2)) / d10);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mediaHeight);
                        layoutParams.gravity = 17;
                        int i10 = NR.A08;
                        int mediaHeight2 = NR.A08;
                        layoutParams.setMargins(i10, 0, mediaHeight2, 0);
                        this.A00.setLayoutParams(layoutParams);
                    }
                }

                @Override // com.facebook.ads.redexgen.X.NR
                public final boolean A0c() {
                    return this.A01;
                }
            };
        } else if (A05) {
            c1185Re = new C1187Rg(nv, nv.A00() == 2);
        } else {
            c1185Re = new C1185Re(nv, NQ.A03(A00));
        }
        if (z10) {
            c1185Re.A0b(A0O, nv.A04().A0U(), A00, bundle);
        }
        return c1185Re;
    }
}
