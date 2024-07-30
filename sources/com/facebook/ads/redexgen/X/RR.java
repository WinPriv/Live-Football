package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class RR implements InterfaceC1091Nn {
    public static byte[] A01;
    public final /* synthetic */ C07278p A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-49, -53, -64, -40};
    }

    public RR(C07278p c07278p) {
        this.A00 = c07278p;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1091Nn
    public final void ACd(String str, JSONObject jSONObject) {
        C1099Nw c1099Nw;
        C1316Wj c1316Wj;
        C1316Wj c1316Wj2;
        if (str.equals(A00(0, 4, 72))) {
            this.A00.AEt();
            c1316Wj = this.A00.A07;
            if (ID.A1K(c1316Wj)) {
                c1316Wj2 = this.A00.A07;
                c1316Wj2.A09().AAN();
            }
        }
        c1099Nw = this.A00.A0F;
        c1099Nw.A0h(str, jSONObject);
    }
}
