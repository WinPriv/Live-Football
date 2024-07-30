package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Qd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1158Qd implements Q7 {
    public static String[] A01 = {"uB1RC", "E7rLPB8klTW5J9FjuULp7NzB4AWE19Zm", "BGfRoGqubHgomR1aknLAm7BQoVqY9Rjo", "2aqRDajB7mkFiu8JUeuEjEkcXKsGj4gd", "YPIu8FWl8tmTV", "O2dNNTCX3dr0fdBVB7HhwqWACslxe6aK", "WKmspm9NaQlidgYEldSczPSkp8W1cJlS", "CDbKVWoo3Luj5aOlcVCk0HC1kDrFWNgV"};
    public final /* synthetic */ C1106Od A00;

    public C1158Qd(C1106Od c1106Od) {
        this.A00 = c1106Od;
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void ADF() {
        InterfaceC1029Lc interfaceC1029Lc;
        InterfaceC1029Lc interfaceC1029Lc2;
        M4 m42;
        interfaceC1029Lc = this.A00.A02;
        if (interfaceC1029Lc != null) {
            C1106Od c1106Od = this.A00;
            if (A01[3].charAt(8) == 'm') {
                throw new RuntimeException();
            }
            A01[3] = "G62o5XZ8JRlbj2NUyH9KkdSeUCUXeXTA";
            interfaceC1029Lc2 = c1106Od.A02;
            m42 = this.A00.A03;
            interfaceC1029Lc2.A3s(m42.A7P());
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void ADH(Q9 q92) {
        InterfaceC1029Lc interfaceC1029Lc;
        InterfaceC1029Lc interfaceC1029Lc2;
        M4 m42;
        InterfaceC1029Lc interfaceC1029Lc3;
        M4 m43;
        interfaceC1029Lc = this.A00.A02;
        if (interfaceC1029Lc == null) {
            return;
        }
        if (q92 == null || !q92.A00()) {
            interfaceC1029Lc2 = this.A00.A02;
            m42 = this.A00.A03;
            interfaceC1029Lc2.A3s(m42.A7P());
            return;
        }
        interfaceC1029Lc3 = this.A00.A02;
        C1106Od c1106Od = this.A00;
        if (A01[5].length() == 14) {
            throw new RuntimeException();
        }
        A01[1] = "MYgqySdSEunU6EGhIZ8lv2VKjJmAUpiH";
        m43 = c1106Od.A03;
        interfaceC1029Lc3.A3s(m43.A7Q());
    }
}
