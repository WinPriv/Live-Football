package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ly, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1050Ly implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ S7 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, -31, -34, -40, -32};
    }

    public ViewOnClickListenerC1050Ly(S7 s72) {
        this.A00 = s72;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1029Lc interfaceC1029Lc;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            interfaceC1029Lc = this.A00.A05;
            interfaceC1029Lc.A3s(A00(0, 15, 9));
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
