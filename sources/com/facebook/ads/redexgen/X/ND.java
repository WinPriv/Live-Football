package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ND implements View.OnClickListener {
    public final /* synthetic */ NG A00;

    public ND(NG ng) {
        this.A00 = ng;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NF nf;
        AbstractC1028Lb abstractC1028Lb;
        View[] viewArr;
        P1 p12;
        P1 p13;
        P1 p14;
        AbstractC1028Lb abstractC1028Lb2;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            nf = this.A00.A04;
            nf.ABJ();
            abstractC1028Lb = this.A00.A00;
            if (abstractC1028Lb != null) {
                abstractC1028Lb2 = this.A00.A00;
                LE.A0L(abstractC1028Lb2);
            }
            viewArr = this.A00.A06;
            for (View view2 : viewArr) {
                LE.A0N(view2, 0);
            }
            LE.A0J(this.A00);
            p12 = this.A00.A05;
            if (p12 == null) {
                return;
            }
            p13 = this.A00.A05;
            LE.A0N(p13, 0);
            p14 = this.A00.A05;
            p14.A0b(EnumC1121Os.A02, 14);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
