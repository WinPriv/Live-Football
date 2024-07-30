package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: com.facebook.ads.redexgen.X.3i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06013i {
    public static final C06003h A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C1346Xn();
        } else {
            A00 = new C06003h();
        }
    }

    public static void A00(EdgeEffect edgeEffect, float f, float f10) {
        A00.A00(edgeEffect, f, f10);
    }
}
