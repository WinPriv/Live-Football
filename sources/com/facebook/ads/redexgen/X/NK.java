package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public final class NK extends LinearLayout {
    public static final int A06 = (int) (Kd.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1316Wj A04;
    public final NL[] A05;

    public NK(C1316Wj c1316Wj, int i10, int i11, int i12, int i13) {
        super(c1316Wj);
        this.A00 = A06;
        this.A04 = c1316Wj;
        setOrientation(0);
        this.A03 = i10;
        this.A01 = i12;
        this.A02 = i13;
        this.A05 = new NL[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.A05[i14] = A00();
            addView(this.A05[i14]);
        }
        A01();
    }

    private NL A00() {
        NL nl = new NL(this.A04, this.A01, this.A02);
        int i10 = this.A03;
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(i10, i10);
        starRatingViewParams.gravity = 16;
        nl.setLayoutParams(starRatingViewParams);
        return nl;
    }

    private void A01() {
        int i10 = 0;
        while (true) {
            NL[] nlArr = this.A05;
            int i11 = nlArr.length;
            if (i10 < i11) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nlArr[i10].getLayoutParams();
                int i12 = i10 == 0 ? 0 : this.A00;
                layoutParams.leftMargin = i12;
                i10++;
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(float r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.NL[] r0 = r3.A05
            int r0 = r0.length
            if (r2 >= r0) goto L1f
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = (float) r2
            float r0 = r4 - r0
            float r1 = java.lang.Math.min(r1, r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L15
            r1 = 0
        L15:
            com.facebook.ads.redexgen.X.NL[] r0 = r3.A05
            r0 = r0[r2]
            r0.setFillRatio(r1)
            int r2 = r2 + 1
            goto L1
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.NK.A02(float):void");
    }

    public void setItemSpacing(int i10) {
        this.A00 = i10;
        A01();
    }

    public void setRating(float f) {
        A02(f);
    }
}
