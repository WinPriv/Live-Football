package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1336Xd implements C4N {
    public static String[] A01 = {"IP6gXu3Aic9rrZpr", "DSm6OHbiM4aoMyjFh2wy7Spd3inn5axc", "lJd94ygIcpnkIi9oYNWqXg3HQV8t0X4Q", "337I3pVrWHOBtYrFGcdtPHZp8Kpz9VIJ", "vd5lczoeg9gY82TvyWngHoQKFpNC9gt0", "CefcuhKyPhUbDvzsvxPUhaoMgi2Xy5FO", "Qia1n7qQgpdEP2KZeQvga8Xzcvoo51Ij", "UfDKqgBAky8ekVpIbdpaQQPTuf6RISL4"};
    public final /* synthetic */ C0849Dw A00;

    public C1336Xd(C0849Dw c0849Dw) {
        this.A00 = c0849Dw;
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    public final void A9t(AbstractC06294l abstractC06294l) {
        boolean A0A;
        abstractC06294l.A0Z(true);
        if (abstractC06294l.A06 != null && abstractC06294l.A07 == null) {
            abstractC06294l.A06 = null;
        }
        abstractC06294l.A07 = null;
        A0A = abstractC06294l.A0A();
        if (!A0A && !this.A00.A1z(abstractC06294l.A0H) && abstractC06294l.A0e()) {
            C0849Dw c0849Dw = this.A00;
            if (A01[6].charAt(16) != 'e') {
                throw new RuntimeException();
            }
            A01[0] = "BbBTSQcWyeSpGVnm";
            c0849Dw.removeDetachedView(abstractC06294l.A0H, false);
        }
    }
}
