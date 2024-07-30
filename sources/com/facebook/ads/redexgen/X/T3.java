package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T3 implements AnonymousClass68 {
    public static byte[] A03;
    public static String[] A04 = {"WE91vPqiHLcyJwrbQHRJcIvZwn5D9l", "3LK2x46Pp3Ld9onr8DyN9Ggm", "60IU9PqapOW3gkaytJRkZEg3", "UqNMzTGRyBNLAx", "QjYmXRpW4", "DeQ01HErfJf7NLfnuVX6corDAbYDzPur", "bhlqPTI7mETXQlgoFXHPJBBhjQPpzoup", "oYTMQ3SHL"};
    public final /* synthetic */ Z9 A00;
    public final /* synthetic */ C1228Sw A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-16, Ascii.VT, 19, Ascii.SYN, Ascii.SI, Ascii.SO, -54, Ascii.RS, Ascii.EM, -54, Ascii.SO, Ascii.EM, 33, Ascii.CAN, Ascii.SYN, Ascii.EM, Ascii.VT, Ascii.SO, -54, Ascii.VT, -54, Ascii.ETB, Ascii.SI, Ascii.SO, 19, Ascii.VT, -40};
    }

    static {
        A01();
    }

    public T3(C1228Sw c1228Sw, Z9 z92, boolean z10) {
        this.A01 = c1228Sw;
        this.A00 = z92;
        this.A02 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAB() {
        C1316Wj c1316Wj;
        long j10;
        InterfaceC1227Sv interfaceC1227Sv;
        InterfaceC1227Sv interfaceC1227Sv2;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 110);
        c1316Wj = this.A01.A0c;
        C0R A0D = c1316Wj.A0D();
        j10 = this.A01.A00;
        A0D.A2a(L5.A01(j10), adErrorType.getErrorCode(), A00);
        interfaceC1227Sv = this.A01.A0G;
        if (interfaceC1227Sv != null) {
            C1228Sw c1228Sw = this.A01;
            String[] strArr = A04;
            String errorMessage = strArr[4];
            if (errorMessage.length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[6] = "7cQ3648pyLFx7h83cxUuTBVDS0jRS450";
            interfaceC1227Sv2 = c1228Sw.A0G;
            interfaceC1227Sv2.AAc(J3.A01(adErrorType, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAI() {
        InterfaceC1227Sv interfaceC1227Sv;
        EnumC0964Il enumC0964Il;
        C1316Wj c1316Wj;
        InterfaceC1227Sv interfaceC1227Sv2;
        C1316Wj c1316Wj2;
        boolean A0q;
        InterfaceC1227Sv interfaceC1227Sv3;
        EB eb2;
        EB eb3;
        C1228Sw c1228Sw = this.A01;
        c1228Sw.A0a = this.A00;
        if (this.A02) {
            eb2 = c1228Sw.A0A;
            if (eb2 != null) {
                eb3 = this.A01.A0A;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[4] = "vb7V14ygc";
                strArr2[7] = "eJXYUqUMt";
                eb3.A0F();
            }
        }
        interfaceC1227Sv = this.A01.A0G;
        if (interfaceC1227Sv != null) {
            enumC0964Il = this.A01.A0E;
            if (enumC0964Il.equals(EnumC0964Il.A04)) {
                A0q = this.A01.A0q();
                if (!A0q) {
                    interfaceC1227Sv3 = this.A01.A0G;
                    interfaceC1227Sv3.ABN();
                }
            }
            if (this.A02) {
                c1316Wj = this.A01.A0c;
                if (!ID.A1E(c1316Wj) || this.A01.A0z() == null || !this.A01.A0z().A0r()) {
                    interfaceC1227Sv2 = this.A01.A0G;
                    interfaceC1227Sv2.A9q();
                } else {
                    C1228Sw c1228Sw2 = this.A01;
                    c1316Wj2 = c1228Sw2.A0c;
                    c1228Sw2.A0M = C1100Nx.A01(c1316Wj2, this.A01.A0z(), 4, new T4(this));
                }
            }
        }
    }
}
