package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class WF implements C8D {
    public final /* synthetic */ String[] A00;

    public WF(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.X.C8D
    public final boolean A2N(String str) {
        for (String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
