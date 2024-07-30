package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1360Yd implements InterfaceC05380v {
    public static byte[] A02;
    public static String[] A03 = {"7FIKHU9lgq27", "AgQqvAltXhi1bYF8zppFCZ", "CRAmwsbXNtyv0vmCJJ9qOPCwxUiND3E6", "ItQqdqoRYHMWKQzbVRTeHzNwEAi", "W2szVhKnaW", "HNVKE5hkEvipBMdeuLWXlSQ07SgK2Jmi", "9NOG2BA2dnlUEqMWgY53wMXC47FXKBrl", "EneshuO9jiHnlHF2bjWwp7WA0EKVaMOF"};
    public final /* synthetic */ ED A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] - i12) - 16);
            if (A03[2].charAt(4) == 'y') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "2VG06oAYTcRzKBDE7gWFCU36hzL5px1b";
            strArr[7] = "j1xG2z3v9jq0UO66H2WqYNbpklLAu6IG";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{115, 112, 119, -93, 117, -92, 115, -94, -124, -93, -80, -80, -89, -76, 98, -85, -81, -78, -76, -89, -75, -75, -85, -79, -80, 98, -88, -85, -76, -89, -90, -118, -119, 93, 124, -119, -119, Byte.MIN_VALUE, -115, 103, -118, -126, -126, -124, -119, -126, 100, -120, -117, -115, Byte.MIN_VALUE, -114, -114, -124, -118, -119};
    }

    static {
        A01();
    }

    public C1360Yd(ED ed2, Runnable runnable) {
        this.A00 = ed2;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05380v
    public final void AA6(ZC zc2) {
        DY dy;
        dy = this.A00.A01;
        dy.A0D().A3j();
        this.A00.A06.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05380v
    public final void AA7(ZC zc2, View view) {
        DY dy;
        dy = this.A00.A01;
        dy.A0D().A3i(zc2 == ((AbstractC1358Yb) this.A00).A00);
        if (zc2 != ((AbstractC1358Yb) this.A00).A00) {
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        InterfaceC05300n interfaceC05300n = ((AbstractC1358Yb) this.A00).A01;
        ED ed2 = this.A00;
        ((AbstractC1358Yb) ed2).A01 = zc2;
        ed2.A00 = view;
        if (!this.A00.A0C) {
            this.A00.A06.A0F(zc2);
        } else {
            this.A00.A06.A0E(view);
            this.A00.A0K(interfaceC05300n);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05380v
    public final void AA8(ZC zc2) {
        DY dy;
        JH.A05(A00(31, 25, 11), A00(8, 23, 50), A00(0, 8, 46));
        dy = this.A00.A01;
        dy.A0D().A3l();
        this.A00.A06.A0D();
        this.A00.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05380v
    public final void AB6(ZC zc2, J3 j32) {
        DY dy;
        dy = this.A00.A01;
        dy.A0D().A3k(zc2 == ((AbstractC1358Yb) this.A00).A00, j32.A03().getErrorCode());
        if (zc2 != ((AbstractC1358Yb) this.A00).A00) {
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        this.A00.A0K(zc2);
        this.A00.AAc(j32);
    }
}
