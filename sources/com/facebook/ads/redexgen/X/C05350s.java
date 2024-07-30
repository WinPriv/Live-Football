package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05350s {
    public static InterfaceC05300n A00;

    @Nullable
    public final InterfaceC05300n A00(C1316Wj c1316Wj, AdPlacementType adPlacementType) {
        InterfaceC05300n interfaceC05300n = A00;
        if (interfaceC05300n != null) {
            return interfaceC05300n;
        }
        int i10 = C05340r.A00[adPlacementType.ordinal()];
        if (i10 == 1) {
            return new ZC();
        }
        if (i10 == 2) {
            return new ZB();
        }
        if (i10 == 3) {
            return new Z9(c1316Wj);
        }
        if (i10 == 4) {
            return new C0863Ek(c1316Wj);
        }
        if (i10 != 5) {
            return null;
        }
        return new C0854Eb();
    }
}
