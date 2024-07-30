package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CF {
    public static String[] A05 = {"YmqCfQGeJdZscNiSsRHgK8Xqwc4qCDQV", "BEVC1cuwi5mxHrGOZ29iGldY3rFRULVC", "DSPc42zLHxXdWx97yn92wynUTyNm", "qbq", "Vn6wbfa2hXyYQug1oukzP6oQFgTa", "a4c", "hss", "EwoauNNUoRbyLKR"};
    public int A01;
    public boolean A02;
    public final CG A03 = new CG();
    public final HV A04 = new HV(new byte[65025], 0);
    public int A00 = -1;

    /* JADX WARN: Incorrect condition in loop: B:3:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00(int r5) {
        /*
            r4 = this;
            r0 = 0
            r4.A01 = r0
            r3 = 0
        L4:
            int r1 = r4.A01
            int r1 = r1 + r5
            com.facebook.ads.redexgen.X.CG r0 = r4.A03
            int r0 = r0.A02
            if (r1 >= r0) goto L1f
            com.facebook.ads.redexgen.X.CG r0 = r4.A03
            int[] r2 = r0.A09
            int r1 = r4.A01
            int r0 = r1 + 1
            r4.A01 = r0
            int r1 = r1 + r5
            r1 = r2[r1]
            int r3 = r3 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L4
        L1f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CF.A00(int):int");
    }

    public final CG A01() {
        return this.A03;
    }

    public final HV A02() {
        return this.A04;
    }

    public final void A03() {
        this.A03.A02();
        this.A04.A0V();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        HV hv = this.A04;
        hv.A00 = Arrays.copyOf(hv.A00, Math.max(65025, this.A04.A07()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        if (r7.A03.A09[r3 - 1] != 5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ee, code lost:
    
        if (r7.A03.A09[r3 - 1] != 255) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(com.facebook.ads.redexgen.X.BP r8) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CF.A05(com.facebook.ads.redexgen.X.BP):boolean");
    }
}
