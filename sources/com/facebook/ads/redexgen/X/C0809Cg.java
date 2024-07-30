package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0809Cg {
    public final int A00;
    public final String A01;
    public final List<C0808Cf> A02;
    public final byte[] A03;

    public C0809Cg(int i10, String str, List<C0808Cf> list, byte[] bArr) {
        List<C0808Cf> unmodifiableList;
        this.A00 = i10;
        this.A01 = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A03 = bArr;
    }
}
