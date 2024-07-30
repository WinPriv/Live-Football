package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Qr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1172Qr implements AnonymousClass57 {
    public final /* synthetic */ AnonymousClass59 A00;
    public final /* synthetic */ AnonymousClass79 A01;

    public C1172Qr(AnonymousClass79 anonymousClass79, AnonymousClass59 anonymousClass59) {
        this.A01 = anonymousClass79;
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
