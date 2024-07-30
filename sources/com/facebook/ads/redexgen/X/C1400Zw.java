package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.Zw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1400Zw {
    public final Map<View, C1407a3> A00 = new WeakHashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized C1407a3 A00(View view) {
        C1407a3 c1407a3 = this.A00.get(view);
        if (c1407a3 != null) {
            return c1407a3;
        }
        return C1407a3.A06;
    }

    public final synchronized void A01(View view) {
        this.A00.remove(view);
    }

    public final synchronized void A02(View view, C1407a3 c1407a3) {
        this.A00.put(view, c1407a3);
    }

    public final synchronized void A03(Collection<View> result) {
        Iterator<View> it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            result.add(it.next());
        }
    }
}
