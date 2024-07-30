package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class WU extends AbstractRunnableC0997Ju {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ AudienceNetworkAds.InitResult A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{113, 102, 105, 2, 75, 76, 75, 86, 75, 67, 78, 75, 88, 67, 86, 75, 77, 76, 2, 65, 77, 79, 82, 78, 71, 86, 71, 105, 108, 52, 104, 62, 60, 60, 69, 66, 89, 100, 86, 81, 82};
    }

    public WU(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        this.A00 = initListener;
        this.A01 = initResult;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        JH.A05(A00(34, 7, 113), A00(0, 27, 100), A00(27, 7, 75));
        this.A00.onInitialized(this.A01);
    }
}
