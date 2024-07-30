package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class YZ implements InterfaceC05400x {
    public static byte[] A02;
    public static String[] A03 = {"CodBKn6Rx4Nd2NCJ9VlYeJoUvBmT0K9p", "5Rf8WjvcJZOUdeEvkpnEyeT6h0OK8cqO", "9H9umRBAwWbsUQsHVAjP1GvoefoGWKiv", "nqryT6E7", "BkgpBj4q", "vUmBCwuwnOwC6wDkIlhiKnb32h6Srhe1", "47HB5bdSxtP74yDXUEGozfNjn4WOkRGN", "xids5JFtyjlo4uGEh5DI8Wwgi7h0jVQM"};
    public final /* synthetic */ EC A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] ^ i12) ^ 34;
            String[] strArr = A03;
            if (strArr[5].charAt(5) == strArr[1].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "sVZQ6Ml9fBzEITS5ybXWTtwXQoWqWbAN";
            strArr2[1] = "MwEMOJFXQFuJpU8zWQ85tYeWswvxAO3B";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{99, 61, 57, 58, 62, 111, 99, Ascii.SI, 42, 47, 62, 58, 43, 60, 110, 39, 61, 110, 32, 59, 34, 34, 110, 33, 32, 110, 34, 33, 47, 42, 7, 32, 58, 43, 60, 61, 58, 39, 58, 39, 47, 34, Ascii.SI, 42, 93, 122, 96, 113, 102, 103, 96, 125, 96, 125, 117, 120, 52, 125, 121, 100, 102, 113, 103, 103, 125, 123, 122, 52, 114, 125, 102, 113, 112, 106, 101, 84, 106, 104, Ascii.DEL, 98, 125, 98, Ascii.DEL, 114, 47, 32, 42, 60, 33, 39, 42, 96, 39, 32, 58, 43, 32, 58, 96, 47, 45, 58, 39, 33, 32, 96, Ascii.CAN, 7, Ascii.VT, Ascii.EM, 110, Ascii.DEL, 102, Ascii.VT, 10, 45, 10, Ascii.DLE, 1, Ascii.SYN, Ascii.ETB, Ascii.DLE, Ascii.CR, Ascii.DLE, Ascii.CR, 5, 8, 40, Ascii.VT, 3, 3, Ascii.CR, 10, 3, 45, 9, Ascii.DC4, Ascii.SYN, 1, Ascii.ETB, Ascii.ETB, Ascii.CR, Ascii.VT, 10};
    }

    static {
        A01();
    }

    public YZ(EC ec2, Runnable runnable) {
        this.A00 = ec2;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05400x
    public final void AAv(ZB zb2, String str, boolean z10) {
        this.A00.A06.A0C();
        boolean z11 = !TextUtils.isEmpty(str);
        if (z10 && z11) {
            try {
                Intent intent = new Intent(A00(84, 26, 108));
                intent.setData(KM.A00(str));
                K9.A0B(this.A00.A0B, intent);
            } catch (K7 e10) {
                Throwable cause = e10.getCause();
                Throwable th = e10;
                if (cause != null) {
                    th = e10.getCause();
                }
                this.A00.A0B.A06().A8u(A00(73, 11, 41), C06977l.A04, new C06987m(th));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05400x
    public final void AAw(ZB zb2) {
        this.A00.A06.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05400x
    public final void AAx(ZB zb2) {
        this.A00.A06.A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05400x
    public final void AAy(ZB zb2) {
        if (zb2 != this.A00.A00) {
            return;
        }
        if (zb2 == null) {
            this.A00.A0B.A06().A8u(A00(110, 3, 45), C06977l.A0X, new C06987m(A00(7, 37, 108)));
            AAz(zb2, AdError.internalError(2004));
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        EC ec2 = this.A00;
        ec2.A01 = zb2;
        ec2.A0F();
        this.A00.A06.A0F(zb2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05400x
    public final void AAz(ZB zb2, AdError adError) {
        if (zb2 != this.A00.A00) {
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        this.A00.A0K(zb2);
        this.A00.A0B.A0D().A4Z(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A06.A0G(new J3(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05400x
    public final void AB0(ZB zb2) {
        JH.A05(A00(113, 31, 70), A00(44, 29, 54), A00(0, 7, 121));
        this.A00.A06.A0D();
        this.A00.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05400x
    public final void AB1() {
        this.A00.A06.A08();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05400x
    public final void AB2() {
        this.A00.A06.A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05400x
    public final void AB3() {
        this.A00.A06.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05400x
    public final void onInterstitialActivityDestroyed() {
        this.A00.A06.A02();
    }
}
