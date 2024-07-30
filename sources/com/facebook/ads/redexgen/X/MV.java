package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MV implements View.OnClickListener {
    public static String[] A02 = {"9sVCZE1JzKyNlgcXamStOEuF7vpp11q7", "2ezkH3kSqCf8dvr0XQnySHd1TgVVvlpb", "j6uQAgvGWfRMr40VSzlVsWkcoISldlVB", "dNEMzbO6BFzdIEcJ0MNYA8UShcXW2fNX", "CiFQ7cnsU8a2IY039", "of093nELJxDtvmpwlx40Sj96vTqfYWfZ", "89mnR6KKQKsitukE0pK0FSEAWYYgI9MC", "iqJuIXwOIBXLoaWKOF5L6veUHjclhPcL"};
    public final /* synthetic */ MD A00;
    public final /* synthetic */ S1 A01;

    public MV(S1 s12, MD md2) {
        this.A01 = s12;
        this.A00 = md2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.A8i();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
            String[] strArr = A02;
            if (strArr[7].charAt(23) == strArr[1].charAt(23)) {
                throw new RuntimeException();
            }
            A02[3] = "erh4HILEwUj6GeiKdMF57q4cd8pDAg7o";
        }
    }
}
