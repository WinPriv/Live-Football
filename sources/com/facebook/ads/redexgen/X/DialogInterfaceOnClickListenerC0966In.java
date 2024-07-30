package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.In, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0966In implements DialogInterface.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ ViewOnClickListenerC1230Sy A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{7, 17, -3, Ascii.DC2, Ascii.NAK, Ascii.CR, -3, 17, Ascii.DC2, 3, Ascii.SO, -12, -14, -11, -27};
    }

    public DialogInterfaceOnClickListenerC0966In(ViewOnClickListenerC1230Sy viewOnClickListenerC1230Sy) {
        this.A00 = viewOnClickListenerC1230Sy;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Map A012;
        A012 = this.A00.A01();
        A012.put(A00(0, 11, 119), A00(11, 4, 89));
        this.A00.A05(A012);
    }
}
