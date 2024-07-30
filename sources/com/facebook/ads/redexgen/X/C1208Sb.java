package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1208Sb implements InterfaceC1021Ku {
    public final Collection<String> A00;

    public C1208Sb() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1021Ku
    public final void ADD(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1021Ku
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.A00.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
