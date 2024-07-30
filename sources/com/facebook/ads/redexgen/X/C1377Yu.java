package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Yu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1377Yu extends AnonymousClass18 {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-123, -124, -111, -111, -120, -107};
    }

    public C1377Yu(List<C1B> list) {
        super(list);
    }

    public static C1377Yu A01(JSONObject jSONObject, C1316Wj c1316Wj) {
        C1377Yu c1377Yu = new C1377Yu(AnonymousClass18.A02(jSONObject, c1316Wj, new C1378Yv()));
        c1377Yu.A0l(jSONObject);
        c1377Yu.A0j(A03(0, 6, 27));
        return c1377Yu;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass18
    public final int A0J() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass18
    public final int A0K() {
        return 0;
    }
}
