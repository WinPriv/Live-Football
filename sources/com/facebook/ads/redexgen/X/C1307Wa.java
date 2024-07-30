package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1307Wa extends AbstractRunnableC0997Ju {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7G A01;
    public final /* synthetic */ InterfaceC06907e A02;
    public final /* synthetic */ C06987m A03;
    public final /* synthetic */ String A04;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-37, -3, Ascii.RS, Ascii.ESC, 46, 32, -39, Ascii.FS, 43, Ascii.SUB, 44, 33, -39, Ascii.ESC, Ascii.RS, Ascii.FS, Ascii.SUB, 46, 44, Ascii.RS, -39, 44, -2, 39, 47, 34, 43, 40, 39, 38, Ascii.RS, 39, 45, -3, Ascii.SUB, 45, Ascii.SUB, 9, 43, 40, 47, 34, Ascii.GS, Ascii.RS, 43, -39, 39, 40, 45, -39, 34, 39, 35, Ascii.RS, Ascii.FS, 45, Ascii.RS, Ascii.GS, -46, -24, -19, -22, -97, -24, -14, -97, -19, -12, -21, -21, -96, Ascii.RS, 33, 33, 38, 49, 38, 44, 43, Ascii.RS, 41, Ascii.FS, 38, 43, 35, 44, 45, 66, 45, 53, 56, 45, 46, 56, 49, 43, 48, 53, 63, 55, 43, 63, 60, 45, 47, 49, 62, 60, 62, 67, 64, 104, 91, 89, 101, 104, 90, 85, 90, 87, 106, 87, 88, 87, 105, 91, -18, -31, -19, -15, -31, -17, -16, -37, -27, -32, 44, 46, Ascii.ESC, 45, 50, 41, Ascii.RS, 49, 51, 32, 50, 55, 46, 35, Ascii.GS, 33, 45, 34, 35};
    }

    public C1307Wa(C7G c7g, String str, int i10, C06987m c06987m, InterfaceC06907e interfaceC06907e) {
        this.A01 = c7g;
        this.A04 = str;
        this.A00 = i10;
        this.A03 = c06987m;
        this.A02 = interfaceC06907e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        if (r2.equals(r1) != false) goto L18;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1307Wa.A06():void");
    }
}
