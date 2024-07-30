package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.VisibleForTesting;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8G {
    public static C8G A00 = new C8G();

    @VisibleForTesting
    public C8G() {
    }

    public static C8G A00() {
        return A00;
    }

    @SuppressLint({"InstanceMethodCanBeStatic"})
    public final C8F A01(C7G c7g, boolean z10) {
        return new WE(c7g, z10, new AnonymousClass66());
    }

    @SuppressLint({"CatchGeneralException"})
    public final Map<String, String> A02(C7G c7g) {
        try {
            return A01(c7g, false).A6U();
        } catch (Throwable th) {
            c7g.A06().A3R(th);
            return C8C.A01(c7g);
        }
    }
}
