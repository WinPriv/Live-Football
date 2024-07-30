package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TF implements InterfaceC1144Pp {
    public static byte[] A01;
    public static String[] A02 = {"XEdsDf1ZbmPdObC9OTEW2z8", "P58GYLlTlw8ULSmid4", "Mge4MDnEmweXwYPX4YofvB", "Ml9Qgu3DLJEhAVMYvCD1k2vZQtwOfhBB", "E1ltw8QxIeAvk6pflmFLXm8YnaEq6i", "JKuYCHjaj2TXENBLxEiyXLq9QhlooG47", "FRLGU9mx00WiiljPewQioxO6UtPhxOrA", "0cr7cMD0TGsotYn7hqiGPP2awzQMRhBn"};
    public final /* synthetic */ C7G A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 117;
            String[] strArr = A02;
            if (strArr[3].charAt(0) == strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "sKECfnlovjgTE3hUnC6hiyxfwSx6iZYU";
            strArr2[6] = "FWGh7KUlNSgjRKrBTTVWdRGVuB2lw617";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-12, Ascii.DC2, Ascii.US, -40, 37, -47, Ascii.NAK, Ascii.SUB, 36, 33, Ascii.DC2, 37, Ascii.DC4, Ascii.EM, -47, Ascii.DC4, 32, 38, Ascii.US, 37, Ascii.SYN, 35, 36, -33, 1, 38, 48, 45, Ascii.RS, 49, 32, 37, 34, 33, -35, 32, 44, 50, 43, 49, 34, 47, 48, -21, -35, Ascii.SI, 34, 48, 45, 44, 43, 48, 34, -9, -35};
    }

    static {
        A01();
    }

    public TF(C7G c7g) {
        this.A00 = c7g;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1144Pp
    public final void AAG(InterfaceC1142Pn interfaceC1142Pn) {
        if (this.A00.A03().A8N() && interfaceC1142Pn != null) {
            String str = A00(24, 31, 72) + interfaceC1142Pn.A5n();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1144Pp
    public final void AAd(Exception exc) {
        if (this.A00.A03().A8N()) {
            Log.e(C0957Ie.A00(), A00(0, 24, 60), exc);
        }
    }
}
