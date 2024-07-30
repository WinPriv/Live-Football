package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class FB implements InterfaceC1411a7 {
    public final List<InterfaceC1412a8> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.X.InterfaceC1411a7
    public final InterfaceC1412a8 A5W(int i10) {
        return this.A00.get(i10);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1412a8> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1411a7
    public final int size() {
        return this.A00.size();
    }
}
