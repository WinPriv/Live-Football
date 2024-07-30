package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Qk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1165Qk implements AnonymousClass57 {
    public final /* synthetic */ AnonymousClass59 A00;
    public final /* synthetic */ AnonymousClass77 A01;

    public C1165Qk(AnonymousClass77 anonymousClass77, AnonymousClass59 anonymousClass59) {
        this.A01 = anonymousClass77;
        this.A00 = anonymousClass59;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass57
    public final boolean A8K() {
        boolean A0Y;
        boolean A0Z;
        if (!this.A01.A0X()) {
            A0Y = this.A01.A0Y();
            if (A0Y) {
                return true;
            }
            A0Z = this.A01.A0Z();
            return A0Z;
        }
        this.A01.A0W(this.A00);
        return true;
    }
}
