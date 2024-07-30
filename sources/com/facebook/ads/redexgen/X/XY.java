package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class XY extends C05802m {
    public static String[] A01 = {"Aypyv0FACfsPQTq8B8UFxLSJIGYFzsCC", "O7nTze5knL3NcSr2rovnk7vqxWhLtUKF", "w8KDuB7m9FBYOy6hiJzio9ilRX5MSLSp", "Kqe5H6YPSeJrA9PRZ2BXFN4qonyjjTB9", "VPpNE9vsyh3HxU94PoFE47DnBqUfoC5Y", "VSW3ZMLcugYKNhiURlJ0g5uJ7Smp29SS", "AB", "JpT6Sbfy0irMNtnKFHDBnJ8tZotKHb"};
    public final XX A00;

    public XY(XX xx) {
        this.A00 = xx;
    }

    @Override // com.facebook.ads.redexgen.X.C05802m
    public final void A08(View view, C3X c3x) {
        super.A08(view, c3x);
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            this.A00.A01.getLayoutManager().A1C(view, c3x);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C05802m
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            if (A01[2].charAt(3) == 'j') {
                throw new RuntimeException();
            }
            A01[6] = "SRS22nAnXgHfwC2qheyHP9Kgc2YZ";
            return true;
        }
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            return this.A00.A01.getLayoutManager().A1b(view, i10, bundle);
        }
        return false;
    }
}
