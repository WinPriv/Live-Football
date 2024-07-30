package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.6m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C06786m extends AbstractC0980Jb {
    public final /* synthetic */ JK A00;

    public C06786m(JK jk) {
        this.A00 = jk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0982Jd c0982Jd) {
        P1 p12;
        boolean z10;
        Handler handler;
        boolean A0D;
        boolean z11;
        Handler handler2;
        int i10;
        p12 = this.A00.A01;
        if (p12 == null) {
            return;
        }
        z10 = this.A00.A03;
        if (z10 || c0982Jd.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A05;
        handler.removeCallbacksAndMessages(null);
        A0D = this.A00.A0D(PE.A05);
        if (A0D) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        z11 = this.A00.A02;
        if (!z11) {
            return;
        }
        handler2 = this.A00.A05;
        JL jl = new JL(this);
        i10 = this.A00.A00;
        handler2.postDelayed(jl, i10);
    }
}
