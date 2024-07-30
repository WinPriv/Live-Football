package com.facebook.ads.redexgen.X;

import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class YL extends AbstractC05310o {
    public static byte[] A01;
    public static String[] A02 = {"", "lR4UvBki6PSdVcLREjEHAbqRd1OmLUQf", "DjKPGQUWmMf7x", "ODfaPUPPzX7KhktdCz15RADFZIjUcUTH", "SOtQhTlfKwNvvZXzwoqU2I3z2iEV30z7", "BHtVd6ktyCMEATMZK8J5wjGrCvXYI9tG", "P8UTzFKpwpJ94", "IxNcf87J3g"};
    public final /* synthetic */ YJ A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{99, 114, 107, Ascii.GS, 17, Ascii.DLE, 10, Ascii.FF, 17, Ascii.DC2, Ascii.DC2, Ascii.ESC, Ascii.FF, 94, Ascii.ETB, Ascii.CR, 94, Ascii.DLE, Ascii.VT, Ascii.DC2, Ascii.DC2};
    }

    static {
        A01();
    }

    public YL(YJ yj) {
        this.A00 = yj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A06 = false;
            interstitialAdExtendedListener = this.A00.A09;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        EC ec2;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        L6 l62;
        EC ec3;
        EC ec4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A06 = false;
        ec2 = this.A00.A03;
        if (ec2 != null) {
            ec3 = this.A00.A03;
            ec3.A0M(new YM(this));
            ec4 = this.A00.A03;
            ec4.A0H();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onInterstitialDismissed(anonymousClass20.A01());
        l62 = this.A00.A05;
        l62.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onInterstitialDisplayed(anonymousClass20.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        this.A00.A08.A0D().A2X();
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onAdClicked(anonymousClass20.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onLoggingImpression(anonymousClass20.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0E(View view) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0092, code lost:
    
        if (r4 > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        r5 = new com.facebook.ads.redexgen.X.KN();
        r3 = r6.A00.A08;
        r0 = r6.A00.A0A;
        r1 = r0.A07();
        r0 = r6.A00.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b5, code lost:
    
        if (r5.A09(r3, r1, r0.A0G()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
    
        r5.A08(r6.A00.A08, true);
        r4 = r6.A00;
        r3 = r4.A08;
        r0 = r6.A00.A0A;
        r1 = r0.A09();
        r0 = r6.A00.A0A;
        r4.A01 = r5.A06(r3, r1, r0.A07());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x013f, code lost:
    
        r5.A08(r6.A00.A08, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0148, code lost:
    
        if (r4 > 0) goto L16;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(com.facebook.ads.redexgen.X.InterfaceC05300n r7) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.YL.A0F(com.facebook.ads.redexgen.X.0n):void");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05310o
    public final void A0G(J3 j32) {
        long j10;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        C0R A0D = this.A00.A08.A0D();
        j10 = this.A00.A00;
        A0D.A2a(L5.A01(j10), j32.A03().getErrorCode(), j32.A04());
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onError(anonymousClass20.A01(), KP.A00(j32));
    }
}
