package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0864El extends AbstractC1200Rt {
    public static byte[] A02;
    public final /* synthetic */ ZC A00;
    public final /* synthetic */ Z3 A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, 2, -2, -3, 0};
    }

    public C0864El(ZC zc2, Z3 z32) {
        this.A00 = zc2;
        this.A01 = z32;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1073Mv
    public final void A9x() {
        boolean z10;
        this.A00.A0E = true;
        z10 = this.A00.A0F;
        if (!z10) {
            return;
        }
        this.A00.A09();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1200Rt, com.facebook.ads.redexgen.X.InterfaceC1073Mv
    public final void AAD(String str, Map<String, String> extraData) {
        DY dy;
        DY dy2;
        IT it;
        String str2;
        DY dy3;
        InterfaceC05380v interfaceC05380v;
        InterfaceC05380v interfaceC05380v2;
        dy = this.A00.A03;
        dy.A0D().A3Y();
        Uri A00 = KM.A00(str);
        if (A00(22, 4, 82).equals(A00.getScheme()) && C05240g.A04(A00.getAuthority())) {
            interfaceC05380v = this.A00.A00;
            if (interfaceC05380v != null) {
                interfaceC05380v2 = this.A00.A00;
                interfaceC05380v2.AA6(this.A00);
            }
        }
        dy2 = this.A00.A03;
        it = this.A00.A04;
        AbstractC05230f adAction = C05240g.A00(dy2, it, this.A01.A63(), A00, extraData);
        if (adAction == null) {
            return;
        }
        try {
            dy3 = this.A00.A03;
            dy3.A0D().A3V();
            adAction.A0C();
        } catch (Exception e10) {
            str2 = ZC.A0I;
            Log.e(str2, A00(0, 22, 0), e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1200Rt, com.facebook.ads.redexgen.X.InterfaceC1073Mv
    public final void AAt() {
        DY dy;
        Z1 z12;
        Z1 z13;
        Z1 z14;
        dy = this.A00.A03;
        ZU A0D = dy.A0D();
        z12 = this.A00.A01;
        A0D.A3Z(z12 != null);
        z13 = this.A00.A01;
        if (z13 == null) {
            return;
        }
        z14 = this.A00.A01;
        z14.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1200Rt, com.facebook.ads.redexgen.X.InterfaceC1073Mv
    public final void ABb() {
        DY dy;
        Z1 z12;
        dy = this.A00.A03;
        dy.A0D().A3b();
        z12 = this.A00.A01;
        z12.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1073Mv
    public final void ACo() {
    }
}
