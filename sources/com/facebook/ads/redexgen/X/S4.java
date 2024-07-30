package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class S4 implements MB {
    public static byte[] A01;
    public static String[] A02 = {"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    public final /* synthetic */ M9 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -31, -28, -14, -27, -16, -17, -14, -12, -23, -18, -25, -82, -58, -55, -50, -55, -45, -56, -33, -63, -60, -33, -46, -59, -48, -49, -46, -44, -55, -50, -57, -33, -58, -52, -49, -41};
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A02[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
    }

    static {
        A01();
    }

    public S4(M9 m92) {
        this.A00 = m92;
    }

    @Override // com.facebook.ads.redexgen.X.MB
    public final void A42() {
        InterfaceC1029Lc interfaceC1029Lc;
        InterfaceC1029Lc interfaceC1029Lc2;
        interfaceC1029Lc = this.A00.A07;
        if (interfaceC1029Lc != null) {
            interfaceC1029Lc2 = this.A00.A07;
            interfaceC1029Lc2.A3s(A00(0, 53, 17));
        }
    }

    @Override // com.facebook.ads.redexgen.X.MB
    public final void A43() {
        InterfaceC1030Ld interfaceC1030Ld;
        InterfaceC1030Ld interfaceC1030Ld2;
        this.A00.A0M();
        interfaceC1030Ld = this.A00.A08;
        if (interfaceC1030Ld != null) {
            interfaceC1030Ld2 = this.A00.A08;
            interfaceC1030Ld2.AC2(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.MB
    public final void A7r() {
        C2H c2h;
        C2H c2h2;
        C2H c2h3;
        C1316Wj c1316Wj;
        c2h = this.A00.A03;
        if (c2h == null) {
            A43();
            return;
        }
        M9.A01(this.A00);
        c2h2 = this.A00.A03;
        if (c2h2.A02() == null) {
            M9 m92 = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            A02[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            m92.A0C();
        } else {
            M9 m93 = this.A00;
            c2h3 = m93.A03;
            m93.A0E(c2h3.A02());
        }
        if (Build.VERSION.SDK_INT >= 16) {
            c1316Wj = this.A00.A05;
            if (ID.A1m(c1316Wj)) {
                this.A00.performAccessibilityAction(128, null);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MB
    public final void A8h() {
        C2D c2d;
        C2G c2g;
        C1316Wj c1316Wj;
        C2D c2d2;
        String str;
        c2d = this.A00.A04;
        if (!TextUtils.isEmpty(c2d.A0I())) {
            KL kl = new KL();
            c1316Wj = this.A00.A05;
            c2d2 = this.A00.A04;
            Uri A00 = KM.A00(c2d2.A0I());
            str = this.A00.A09;
            KL.A0E(kl, c1316Wj, A00, str);
        }
        c2g = this.A00.A02;
        c2g.A04();
    }

    @Override // com.facebook.ads.redexgen.X.MB
    public final void A8i() {
        InterfaceC1030Ld interfaceC1030Ld;
        C2D c2d;
        C2G c2g;
        C1316Wj c1316Wj;
        C2D c2d2;
        String str;
        InterfaceC1030Ld interfaceC1030Ld2;
        this.A00.A0M();
        interfaceC1030Ld = this.A00.A08;
        if (interfaceC1030Ld != null) {
            interfaceC1030Ld2 = this.A00.A08;
            interfaceC1030Ld2.AC2(true);
        }
        c2d = this.A00.A04;
        if (!TextUtils.isEmpty(c2d.A0C())) {
            KL kl = new KL();
            c1316Wj = this.A00.A05;
            c2d2 = this.A00.A04;
            Uri A00 = KM.A00(c2d2.A0C());
            str = this.A00.A09;
            KL.A0E(kl, c1316Wj, A00, str);
        }
        c2g = this.A00.A02;
        c2g.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.MB
    public final void ABQ(C2F c2f) {
        C2F c2f2;
        C2D c2d;
        C2H A0B;
        C2D c2d2;
        M9.A00(this.A00);
        this.A00.A01 = c2f;
        c2f2 = this.A00.A01;
        if (c2f2 == C2F.A03) {
            c2d2 = this.A00.A04;
            A0B = c2d2.A0A();
        } else {
            c2d = this.A00.A04;
            A0B = c2d.A0B();
        }
        this.A00.A0E(A0B);
    }

    @Override // com.facebook.ads.redexgen.X.MB
    public final void ABZ(C2H c2h) {
        C2G c2g;
        M9.A00(this.A00);
        c2g = this.A00.A02;
        c2g.A07(c2h.A01());
        if (!c2h.A05().isEmpty()) {
            this.A00.A0E(c2h);
        } else {
            this.A00.A0D(c2h);
        }
    }
}
