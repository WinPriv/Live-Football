package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: assets/audience_network.dex */
public class Y4<K, V> extends AbstractC05722d<K, V> {
    public final /* synthetic */ Y3 A00;

    public Y4(Y3 y32) {
        this.A00 = y32;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05722d
    public final int A04() {
        return ((C05752g) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05722d
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05722d
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05722d
    public final Object A07(int i10, int i11) {
        return this.A00.A02[(i10 << 1) + i11];
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05722d
    public final V A08(int i10, V value) {
        return this.A00.A0C(i10, value);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05722d
    public final Map<K, V> A0A() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05722d
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05722d
    public final void A0E(int i10) {
        this.A00.A0A(i10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05722d
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
