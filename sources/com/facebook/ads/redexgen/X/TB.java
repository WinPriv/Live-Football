package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class TB implements N1 {
    public static String[] A01 = {"PnhhxO44eyGR", "6RYeLXmAClA1SiGKn201px", "WqNcg2MFF", "kFMGwY5yNNV", "mQRpAL1oxGJgw", "Eqf6jMIzeI3tCjJb", "9imsVe3tjkVzhTosgYrmf1lKW7QE2MSM", "NRYl8cTHkwcGHXULnCD2cakkWnkUWd4e"};
    public final /* synthetic */ T8 A00;

    public TB(T8 t82) {
        this.A00 = t82;
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void AAr(boolean z10) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        InterfaceC0963Ik interfaceC0963Ik;
        InterfaceC0963Ik interfaceC0963Ik2;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(z10);
        atomicBoolean2 = this.A00.A0E;
        if (atomicBoolean2.get()) {
            interfaceC0963Ik = this.A00.A02;
            if (interfaceC0963Ik != null) {
                T8 t82 = this.A00;
                String[] strArr = A01;
                if (strArr[5].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                A01[2] = "moHDWw2Q1";
                interfaceC0963Ik2 = t82.A02;
                interfaceC0963Ik2.ABe(z10);
            }
        }
    }
}
