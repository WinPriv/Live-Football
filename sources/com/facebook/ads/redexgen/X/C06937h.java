package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.7h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C06937h extends AbstractC1042Lp {
    public final /* synthetic */ C7C A00;

    public C06937h(C7C c7c) {
        this.A00 = c7c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1043Lq c1043Lq) {
        new Handler(Looper.getMainLooper()).post(new OE(this));
    }
}
