package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class NQ {
    public static final int A00 = Kd.A03.heightPixels;
    public static final int A01 = Kd.A03.widthPixels;

    public static float A00(C1B c1b) {
        int height = c1b.A0D().A01();
        int width = c1b.A0D().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d10) {
        int availableWidth = (int) ((A01 - (NR.A08 * 2)) / d10);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = LE.A01(16);
        int ctaTextHeight = NC.A0A;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = NR.A08;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = A00;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static boolean A03(double d10) {
        return d10 < 0.9d;
    }

    public static boolean A04(double d10, int i10) {
        return A02(i10) < A01(d10);
    }

    public static boolean A05(int i10, int i11, double d10) {
        return i10 == 2 || A04(d10, i11);
    }
}
