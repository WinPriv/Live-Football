package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public final class LA {
    public static EnumC1121Os A00(VideoStartReason videoStartReason) {
        int i10 = L9.A00[videoStartReason.ordinal()];
        if (i10 == 1) {
            return EnumC1121Os.A02;
        }
        if (i10 == 2) {
            return EnumC1121Os.A03;
        }
        if (i10 != 3) {
            return EnumC1121Os.A03;
        }
        return EnumC1121Os.A04;
    }
}
