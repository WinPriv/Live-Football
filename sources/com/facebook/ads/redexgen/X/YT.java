package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class YT implements AnonymousClass14 {
    public static byte[] A02;
    public static String[] A03 = {"gOGPE1XGqnroAJihU7XGAfTAdWa21jWC", "Kcs30m2Uc1eFMAQARd2pOhOOSRswugkg", "xkwB", "vFLx4ryI8nKhSFQKGVnAMH5qObxMihWN", "NnwKyO2XMzRH0BXfVduboZ9DAJ5a5svW", "U3uRLxNZuwH", "U9y6Wp3Jad2LD1", "sOAhAPVwmiqriGnbgM61Uai8lTIQh97W"};
    public final /* synthetic */ E8 A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{81, 84, 2, 82, 82, 81, 86, 87, 112, 71, 85, 67, 80, 70, 71, 70, 2, 116, 75, 70, 71, 77, 2, 75, 79, 82, 80, 71, 81, 81, 75, 77, 76, 2, 68, 75, 80, 71, 70, 70, 71, 123, 76, 94, 72, 91, 77, 76, 77, Ascii.DEL, 64, 77, 76, 70, 104, 77, 101, 70, 78, 78, 64, 71, 78, 96, 68, 89, 91, 76, 90, 90, 64, 70, 71};
    }

    static {
        A01();
    }

    public YT(E8 e82, Runnable runnable) {
        this.A00 = e82;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void AC3(AbstractC1382Yz abstractC1382Yz) {
        this.A00.A06.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void AC4(AbstractC1382Yz abstractC1382Yz) {
        this.A00.A06.A07();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void AC5(AbstractC1382Yz abstractC1382Yz) {
        this.A00.A06.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void AC6(AbstractC1382Yz abstractC1382Yz) {
        this.A00.A0C().removeCallbacks(this.A01);
        E8 e82 = this.A00;
        e82.A01 = abstractC1382Yz;
        e82.A0F();
        this.A00.A06.A0F(abstractC1382Yz);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void AC7(AbstractC1382Yz abstractC1382Yz) {
        JH.A05(A00(39, 34, 72), A00(8, 31, 67), A00(0, 8, 7));
        this.A00.A06.A0D();
        this.A00.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void AC8(AbstractC1382Yz abstractC1382Yz) {
        this.A00.A06.A08();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void AC9(AbstractC1382Yz abstractC1382Yz, AdError adError) {
        this.A00.A0C().removeCallbacks(this.A01);
        this.A00.A0B.A0D().A4Z(adError.getErrorCode(), adError.getErrorMessage());
        if (AdError.AD_PRESENTATION_ERROR.equals(adError) && ID.A1J(this.A00.A0B)) {
            this.A00.A06.A0G(J3.A00(AdErrorType.AD_PRESENTATION_ERROR));
        } else {
            E8 e82 = this.A00;
            if (A03[2].length() != 4) {
                throw new RuntimeException();
            }
            A03[2] = "s57s";
            e82.A06.A0G(J3.A00(AdErrorType.INTERNAL_ERROR));
        }
        this.A00.A0K(abstractC1382Yz);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void onRewardedVideoActivityDestroyed() {
        this.A00.A06.A09();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void onRewardedVideoClosed() {
        this.A00.A06.A0A();
    }
}
