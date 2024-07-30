package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MT implements View.OnClickListener {
    public static String[] A02 = {"0jbDV4SqpRnuIwDLdLhaSwFsy", "4CrQo2YdoWcqlYT3QJHt1izZuISw0o1a", "L1hOW0A7sRjLAVrGrG7yuKVrDUUFxwrZ", "r8z", "jBR", "EADx", "Dw2r3KoKizw7HI548vOXrftmgV6TcaYT", "JzZVJSkZeh7kJVI6l2oDTz"};
    public final /* synthetic */ MD A00;
    public final /* synthetic */ S1 A01;

    public MT(S1 s12, MD md2) {
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
            this.A01.A0B.ABQ(C2F.A03);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
            if (A02[7].length() == 1) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "wzs";
            strArr[0] = "95EfxSbyIArn9raLN6CoppC7A";
        }
    }
}
