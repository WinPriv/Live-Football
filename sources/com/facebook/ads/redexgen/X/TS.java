package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class TS implements QF {
    public static byte[] A02;
    public final /* synthetic */ C1315Wi A00;
    public final /* synthetic */ QD A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public TS(QD qd, C1315Wi c1315Wi) {
        this.A01 = qd;
        this.A00 = c1315Wi;
    }

    @Override // com.facebook.ads.redexgen.X.QF
    public final void A3u() {
        try {
            ID.A0P(this.A00).A2F(this.A01.A6H().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e10) {
            this.A00.A06().A3R(e10);
        }
    }
}
