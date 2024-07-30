package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class WS implements K0 {
    public static byte[] A01;
    public final /* synthetic */ C1315Wi A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{68, 64, 67, 119, 102, 107, 103, 108, 97, 103, 76, 103, 118, 117, 109, 112, 105, Ascii.SI, 52, 63, 34, 42, 63, 57, 46, 63, 62, 122, 63, 40, 40, 53, 40, 116, 121, 104, 123, 105, 114, 69, 105, 114, 115, Ascii.DEL, 118, 126};
    }

    public WS(C1315Wi c1315Wi) {
        this.A00 = c1315Wi;
    }

    @Override // com.facebook.ads.redexgen.X.K0
    public final void A8m(int i10, Throwable th) {
        Log.e(A00(0, 17, 13), A00(17, 17, 85), th);
        this.A00.A06().A8u(A00(34, 12, 21), i10, new C06987m(th));
    }
}
