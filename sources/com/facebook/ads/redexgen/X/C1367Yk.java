package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1367Yk implements AnonymousClass68 {
    public static String[] A03 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ C05461d A00;
    public final /* synthetic */ C1316Wj A01;
    public final /* synthetic */ boolean A02;

    public C1367Yk(C05461d c05461d, C1316Wj c1316Wj, boolean z10) {
        this.A00 = c05461d;
        this.A01 = c1316Wj;
        this.A02 = z10;
    }

    private void A00(boolean z10) {
        InterfaceC05451c interfaceC05451c;
        InterfaceC05451c interfaceC05451c2;
        C1375Ys c1375Ys;
        if (!z10) {
            interfaceC05451c = this.A00.A04;
            String[] strArr = A03;
            if (strArr[7].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "3TR1ccuSepVqqTAhPt5x";
            strArr2[3] = "2nf30Z9fIqCCPDXuu277";
            interfaceC05451c.A9o(AdError.CACHE_ERROR);
            return;
        }
        if (ID.A1C(this.A01)) {
            boolean z11 = this.A02;
            String[] strArr3 = A03;
            if (strArr3[7].length() == strArr3[0].length()) {
                throw new RuntimeException();
            }
            A03[4] = "td5rO8fwqS2g7pt7eIgv7CCFkrrD";
            if (z11) {
                C05461d c05461d = this.A00;
                C1316Wj c1316Wj = this.A01;
                c1375Ys = c05461d.A03;
                c05461d.A02 = C1100Nx.A01(c1316Wj, c1375Ys, 1, new C1368Yl(this));
                return;
            }
        }
        interfaceC05451c2 = this.A00.A04;
        interfaceC05451c2.A9p();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAB() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAI() {
        A00(true);
    }
}
