package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Og, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1109Og extends C8O<C06826r> {
    public final /* synthetic */ C06856y A00;

    public C1109Og(C06856y c06856y) {
        this.A00 = c06856y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C06826r c06826r) {
        P1 p12;
        P1 p13;
        int A00 = c06826r.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            p12 = this.A00.A0B;
            int currentPositionMS2 = p12.getDuration();
            if (A00 == currentPositionMS2) {
                p13 = this.A00.A0B;
                int duration = p13.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        this.A00.A0e(A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8O
    public final Class<C06826r> A01() {
        return C06826r.class;
    }
}
