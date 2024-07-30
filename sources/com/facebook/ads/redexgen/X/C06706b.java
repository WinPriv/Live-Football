package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.6b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C06706b extends AbstractC0980Jb {
    public final /* synthetic */ JG A00;

    public C06706b(JG jg) {
        this.A00 = jg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0982Jd c0982Jd) {
        P1 p12;
        Handler handler;
        p12 = this.A00.A01;
        if (p12 == null || c0982Jd.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new P3(this));
    }
}
