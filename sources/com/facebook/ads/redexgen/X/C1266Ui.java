package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Ui, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1266Ui implements InterfaceC0805Cc {
    public final HU A00 = new HU(new byte[4]);
    public final /* synthetic */ C1264Ug A01;

    public C1266Ui(C1264Ug c1264Ug) {
        this.A01 = c1264Ug;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0805Cc
    public final void A48(HV hv) {
        int programCount;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        int tableId = hv.A0E();
        if (tableId != 0) {
            return;
        }
        hv.A0Z(7);
        int A04 = hv.A04() / 4;
        for (int programNumber = 0; programNumber < A04; programNumber++) {
            hv.A0a(this.A00, 4);
            int A042 = this.A00.A04(16);
            this.A00.A08(3);
            if (A042 == 0) {
                this.A00.A08(13);
            } else {
                int i10 = this.A00.A04(13);
                sparseArray2 = this.A01.A06;
                sparseArray2.put(i10, new C1269Ul(new C1265Uh(this.A01, i10)));
                C1264Ug.A01(this.A01);
            }
        }
        programCount = this.A01.A05;
        if (programCount != 2) {
            sparseArray = this.A01.A06;
            sparseArray.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0805Cc
    public final void A8I(C0936Hh c0936Hh, BQ bq, C0811Ci c0811Ci) {
    }
}
