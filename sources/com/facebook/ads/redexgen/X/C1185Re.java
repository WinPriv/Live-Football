package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Re, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1185Re extends NR {
    public static final int A01 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final C1078Na A00;

    public C1185Re(NV nv, boolean z10) {
        super(nv, z10);
        this.A00 = new C1078Na(nv.A05(), nv.A02());
        this.A00.A01(getTitleDescContainer(), z10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(NR.A08, NR.A08, NR.A08, NR.A08);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(nv.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(NR.A08, 0, NR.A08, 0);
        frameLayout.addView(this.A00, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void A0b(C1B c1b, String str, double d10, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d10, bundle);
        if (d10 > 0.0d) {
            int mediaHeight = (int) ((A01 - (NR.A08 * 2)) / d10);
            this.A00.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0c() {
        return false;
    }
}
