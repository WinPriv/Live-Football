package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Trace;

/* renamed from: com.facebook.ads.redexgen.X.Hi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0937Hi {
    public static void A00() {
        if (C0940Hl.A02 >= 18) {
            A01();
        }
    }

    @TargetApi(18)
    public static void A01() {
        Trace.endSection();
    }

    public static void A02(String str) {
        if (C0940Hl.A02 >= 18) {
            A03(str);
        }
    }

    @TargetApi(18)
    public static void A03(String str) {
        Trace.beginSection(str);
    }
}
