package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewVideoRenderer;

/* renamed from: com.facebook.ads.redexgen.X.Dp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0844Dp extends K6 {
    public final /* synthetic */ C5L A00;

    public C0844Dp(C5L c5l) {
        this.A00 = c5l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(KV kv) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            C1228Sw.A0L(this.A00.A08.getInternalNativeAd()).A1c(true, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPlayed();
    }
}
