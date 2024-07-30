package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ys, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1375Ys extends AnonymousClass18 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772011L;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{72, 79, 85, 68, 83, 82, 85, 72, 85, 72, 64, 77};
    }

    public C1375Ys(List<C1B> list) {
        super(list);
    }

    public static C1375Ys A01(JSONObject jSONObject, C1316Wj c1316Wj) {
        C1375Ys c1375Ys = new C1375Ys(AnonymousClass18.A02(jSONObject, c1316Wj, new C1376Yt()));
        c1375Ys.A0l(jSONObject);
        c1375Ys.A0j(A03(0, 12, 67));
        return c1375Ys;
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
