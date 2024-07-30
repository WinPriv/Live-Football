package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7F {
    public static final AtomicReference<C1315Wi> A00 = new AtomicReference<>();

    @Nullable
    public static C1315Wi A00() {
        return A00.get();
    }

    public static void A01(C1315Wi c1315Wi) {
        if (c1315Wi == null) {
            return;
        }
        A00.compareAndSet(null, c1315Wi);
    }
}
