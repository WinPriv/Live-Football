package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SB implements KW {
    public static byte[] A01;
    public static String[] A02 = {"XQ6pDaA1rZEM", "XoeGOYiSv0w2M1U1qXC2kK0WxpTFbq6C", "goNPtYs5sZFfNSJyOgs171oDuCl7t69H", "IBRmsKraW8ihcuaNuynFKjmRlH", "udOMyB", "k9bLdXox5SSCuqwZoRmzAy5kJm", "rLCACxpviKCtWgunDsmekf59Ef0kXw8R", "IiDilnQTvcIperbA6lCpmy3utrrmGEhT"};
    public final /* synthetic */ S9 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-32, -8, -22, -24, -8, -30};
    }

    static {
        A01();
    }

    public SB(S9 s92) {
        this.A00 = s92;
    }

    public /* synthetic */ SB(S9 s92, SG sg) {
        this(s92);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    @Override // com.facebook.ads.redexgen.X.KW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AAH() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.S9 r0 = r5.A00
            com.facebook.ads.redexgen.X.Lb r3 = r0.A0V
            r2 = 0
            r1 = 0
            r0 = 7
            java.lang.String r0 = A00(r2, r1, r0)
            r3.setToolbarActionMessage(r0)
            com.facebook.ads.redexgen.X.S9 r0 = r5.A00
            com.facebook.ads.redexgen.X.S9.A0S(r0)
            com.facebook.ads.redexgen.X.S9 r0 = r5.A00
            boolean r0 = com.facebook.ads.redexgen.X.S9.A0b(r0)
            r3 = 0
            if (r0 == 0) goto L44
            com.facebook.ads.redexgen.X.S9 r0 = r5.A00
            boolean r0 = com.facebook.ads.redexgen.X.S9.A0g(r0)
            if (r0 == 0) goto L44
            com.facebook.ads.redexgen.X.S9 r0 = r5.A00
            com.facebook.ads.redexgen.X.Lb r1 = r0.A0V
            r0 = 1
            r1.setToolbarActionMode(r0)
        L2c:
            com.facebook.ads.redexgen.X.S9 r0 = r5.A00
            boolean r4 = com.facebook.ads.redexgen.X.S9.A0f(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.SB.A02
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 6
            if (r1 == r0) goto L4c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L44:
            com.facebook.ads.redexgen.X.S9 r0 = r5.A00
            com.facebook.ads.redexgen.X.Lb r0 = r0.A0V
            r0.setToolbarActionMode(r3)
            goto L2c
        L4c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.SB.A02
            java.lang.String r1 = "RNuzR8"
            r0 = 4
            r2[r0] = r1
            if (r4 != 0) goto L6d
            com.facebook.ads.redexgen.X.S9 r1 = r5.A00
            r0 = 500(0x1f4, float:7.0E-43)
            com.facebook.ads.redexgen.X.LE.A0U(r1, r0)
            com.facebook.ads.redexgen.X.S9 r0 = r5.A00
            com.facebook.ads.redexgen.X.Rm r0 = com.facebook.ads.redexgen.X.S9.A0A(r0)
            if (r0 == 0) goto L6d
            com.facebook.ads.redexgen.X.S9 r0 = r5.A00
            com.facebook.ads.redexgen.X.Rm r0 = com.facebook.ads.redexgen.X.S9.A0A(r0)
            com.facebook.ads.redexgen.X.LE.A0N(r0, r3)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.SB.AAH():void");
    }

    @Override // com.facebook.ads.redexgen.X.KW
    public final void ABs(float f) {
        boolean z10;
        C1W c1w;
        boolean z11;
        AnonymousClass18 anonymousClass18;
        float A03;
        AnonymousClass18 anonymousClass182;
        AnonymousClass18 anonymousClass183;
        boolean z12;
        AnonymousClass18 anonymousClass184;
        boolean z13;
        AnonymousClass18 anonymousClass185;
        this.A00.A0Q((int) f);
        z10 = this.A00.A0U;
        if (!z10) {
            c1w = this.A00.A0E;
            float percentage = 1.0f - (f / c1w.A07());
            this.A00.A0V.setProgress(100.0f * percentage);
            return;
        }
        z11 = this.A00.A09;
        if (z11) {
            anonymousClass184 = this.A00.A0D;
            A03 = 1.0f - (f / anonymousClass184.A0O().A0D().A02());
            z13 = this.A00.A0C;
            if (z13 || A03 < 1.0f) {
                this.A00.A0C = false;
                anonymousClass185 = this.A00.A0D;
                String A00 = anonymousClass185.A0S().A00();
                String[] strArr = A02;
                if (strArr[1].charAt(20) != strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "16sMGD3KF8iI";
                strArr2[5] = "yItCOMUcMHVXea4ql8lykvs7qx";
                String rewardMessage = A00.replace(A00(0, 6, 65), String.valueOf((int) f));
                this.A00.A0V.setToolbarActionMessage(rewardMessage);
            } else {
                this.A00.A0C = true;
                this.A00.A0V.setToolbarActionMessage(A00(0, 0, 7));
            }
        } else {
            anonymousClass18 = this.A00.A0D;
            A03 = 1.0f - (f / anonymousClass18.A0O().A0D().A03());
        }
        this.A00.A0V.setProgress(100.0f * A03);
        anonymousClass182 = this.A00.A0D;
        float A022 = anonymousClass182.A0O().A0D().A02() - f;
        anonymousClass183 = this.A00.A0D;
        float percentageOfReward = anonymousClass183.A0O().A0D().A03();
        boolean z14 = A022 >= percentageOfReward;
        z12 = this.A00.A0C;
        if (!z12 && z14) {
            this.A00.A0V.setToolbarActionMode(1);
        }
    }
}
