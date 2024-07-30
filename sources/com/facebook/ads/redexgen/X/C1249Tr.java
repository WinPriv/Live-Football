package com.facebook.ads.redexgen.X;

import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.Tr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1249Tr implements GP {
    public final Context A00;
    public final GP A01;
    public final InterfaceC0915Gm<? super GQ> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C1249Tr(Context context, InterfaceC0915Gm<? super GQ> interfaceC0915Gm, GP gp) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC0915Gm;
        this.A01 = gp;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C1249Tr(Context context, String str, InterfaceC0915Gm<? super GQ> interfaceC0915Gm) {
        this(context, interfaceC0915Gm, new C2N(str, interfaceC0915Gm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.GP
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1250Ts A4E() {
        return new C1250Ts(this.A00, this.A02, this.A01.A4E());
    }
}
