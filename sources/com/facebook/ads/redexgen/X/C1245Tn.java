package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1245Tn implements GP {
    public final InterfaceC0915Gm<? super C1246To> A00;

    public C1245Tn() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C1245Tn(InterfaceC0915Gm<? super C1246To> interfaceC0915Gm) {
        this.A00 = interfaceC0915Gm;
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final GQ A4E() {
        return new C1246To(this.A00);
    }
}
