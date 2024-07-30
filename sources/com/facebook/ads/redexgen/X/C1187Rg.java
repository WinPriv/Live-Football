package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Rg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1187Rg extends NR {
    public C1187Rg(NV nv, boolean z10) {
        super(nv, true);
        RelativeLayout relativeLayout = new RelativeLayout(nv.A05());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        LE.A0R(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(nv.A05());
        linearLayout.setOrientation(!z10 ? 1 : 0);
        linearLayout.setGravity(80);
        LE.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(NR.A08, 0, NR.A08, NR.A08);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z10 ? -2 : -1, -2);
        layoutParams3.setMargins(z10 ? NR.A08 : 0, z10 ? 0 : NR.A08, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z10 ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams4);
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        addView(nv.A02(), new RelativeLayout.LayoutParams(-1, -1));
        addView(relativeLayout, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void A0b(C1B c1b, String str, double d10, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d10, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0c() {
        return true;
    }
}
