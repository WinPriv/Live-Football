package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Nx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1100Nx {
    public static final Map<String, WeakReference<C1099Nw>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static C1099Nw A01(C1316Wj c1316Wj, AnonymousClass18 anonymousClass18, int i10, InterfaceC1097Nu interfaceC1097Nu) {
        C1099Nw c1099Nw = new C1099Nw(c1316Wj, anonymousClass18, c1316Wj.A00().A08(), i10);
        c1099Nw.A0b(interfaceC1097Nu);
        c1099Nw.A0X();
        A00.put(anonymousClass18.A0Z(), new WeakReference<>(c1099Nw));
        return c1099Nw;
    }

    @Nullable
    public static C1099Nw A02(String str) {
        WeakReference<C1099Nw> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AnonymousClass18 anonymousClass18, C1099Nw c1099Nw) {
        A00.put(anonymousClass18.A0Z(), new WeakReference<>(c1099Nw));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
