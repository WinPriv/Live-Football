package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class CC {
    public static String[] A0J = {"0EwfBQL8WgkraFIT5", "yqBIkqshgk6o8aGC7JXOfAcvQBpSEoIE", "Pb3yD9oBE", "Sy7y64hwk", "hrTCG", "uTsL", "1ofsGt0E1HxH4l7d5", "0"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C0799Bv A07;
    public CB A08;
    public HV A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public int[] A0D;
    public int[] A0E;
    public long[] A0F;
    public long[] A0G;
    public boolean[] A0H;
    public boolean[] A0I;

    public final long A00(int i10) {
        return this.A0F[i10] + this.A0C[i10];
    }

    public final void A01() {
        this.A02 = 0;
        this.A06 = 0L;
        this.A0A = false;
        this.A0B = false;
        this.A08 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r3 < r5) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(int r5) {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.HV r0 = r4.A09
            if (r0 == 0) goto L1e
            int r3 = r0.A07()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.CC.A0J
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 21
            if (r1 == r0) goto L42
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.CC.A0J
            java.lang.String r1 = "O7sbivaH"
            r0 = 3
            r2[r0] = r1
            if (r3 >= r5) goto L25
        L1e:
            com.facebook.ads.redexgen.X.HV r0 = new com.facebook.ads.redexgen.X.HV
            r0.<init>(r5)
            r4.A09 = r0
        L25:
            r4.A01 = r5
            r0 = 1
            r4.A0A = r0
            r4.A0B = r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.CC.A0J
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 20
            if (r1 == r0) goto L41
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.CC.A0J
            java.lang.String r1 = "ZqBRFK04oxBzllTVeb4xO6w8kHwYHjDg"
            r0 = 1
            r2[r0] = r1
            return
        L41:
            return
        L42:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CC.A02(int):void");
    }

    public final void A03(int i10, int i11) {
        this.A02 = i10;
        this.A00 = i11;
        int[] iArr = this.A0E;
        if (iArr == null || iArr.length < i10) {
            this.A0G = new long[i10];
            this.A0E = new int[i10];
        }
        int[] iArr2 = this.A0D;
        if (iArr2 == null || iArr2.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.A0D = new int[i12];
            this.A0C = new int[i12];
            this.A0F = new long[i12];
            this.A0I = new boolean[i12];
            this.A0H = new boolean[i12];
        }
    }

    public final void A04(BP bp) throws IOException, InterruptedException {
        bp.readFully(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }

    public final void A05(HV hv) {
        hv.A0c(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }
}
