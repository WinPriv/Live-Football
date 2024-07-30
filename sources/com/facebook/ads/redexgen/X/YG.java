package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YG implements InterfaceC05661x {
    public static byte[] A0D;
    public static String[] A0E = {"gd6Snq8TqC5qGLc", "5Vo8FrFWo5Fl4YG5W1yHT6ZfMsOXSACT", "HYpFHiAeuVvng5d4eXQK0awgijL0SEef", "zgL9OdntC9Jt", "c4pha1QVXZPHNWU", "oPtBq8V8zceab2K03f0YSkruz1vfGvQp", "tGZii7gSURWSZ1CI0FSKqsks", "YmWpveYB3lCv"};
    public static final String A0F;
    public long A02;

    @Nullable
    public RewardedVideoAd A03;

    @Nullable
    public AnonymousClass18 A04;

    @Nullable
    public E8 A05;

    @Nullable
    public XT A06;

    @Nullable
    public String A08;
    public final C1316Wj A0A;
    public final S2SRewardedVideoAdExtendedListener A0B;
    public final AnonymousClass24 A0C;
    public int A00 = 0;
    public boolean A09 = false;
    public long A01 = -1;
    public L6 A07 = new L6();

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0D = new byte[]{120, 87, Ascii.EM, 88, 93, Ascii.EM, 85, 86, 88, 93, Ascii.EM, 80, 74, Ascii.EM, 88, 85, 75, 92, 88, 93, 64, Ascii.EM, 80, 87, Ascii.EM, 73, 75, 86, 94, 75, 92, 74, 74, Ascii.ETB, Ascii.EM, 96, 86, 76, Ascii.EM, 74, 81, 86, 76, 85, 93, Ascii.EM, 78, 88, 80, 77, Ascii.EM, 95, 86, 75, Ascii.EM, 88, 93, 117, 86, 88, 93, 92, 93, 17, Ascii.DLE, Ascii.EM, 77, 86, Ascii.EM, 91, 92, Ascii.EM, 90, 88, 85, 85, 92, 93, 47, Ascii.CAN, Ascii.CAN, 5, Ascii.CAN, 74, 6, 5, Ascii.VT, Ascii.SO, 3, 4, Ascii.CR, 74, Ascii.CAN, Ascii.SI, Ascii.GS, Ascii.VT, Ascii.CAN, Ascii.SO, Ascii.SI, Ascii.SO, 74, Ascii.FS, 3, Ascii.SO, Ascii.SI, 5, 74, Ascii.VT, Ascii.SO, 92, 77, 84};
        if (A0E[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[4] = "OGOVhUIoezz1oHK";
        strArr[0] = "xl2MkcRK0CWEWUY";
    }

    static {
        A0C();
        A0F = YG.class.getSimpleName();
    }

    public YG(AnonymousClass24 anonymousClass24, AnonymousClass27 anonymousClass27, String str) {
        this.A0C = anonymousClass24;
        this.A0A = anonymousClass24.A0B;
        this.A0B = new Y9(str, anonymousClass27, this, anonymousClass24);
    }

    private void A0E(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z10) {
        String A02;
        if (!this.A09 && this.A05 != null) {
            Log.w(A0F, A0A(0, 78, 100));
        }
        A0F(false);
        this.A09 = false;
        C05581p c05581p = new C05581p(this.A0C.A0C, J8.A06, AdPlacementType.REWARDED_VIDEO, J6.A07, 1);
        c05581p.A08(z10);
        if (ID.A1q(this.A0A) && (A02 = KN.A02(this.A0A, this.A0C.A06)) != null) {
            AnonymousClass24 anonymousClass24 = this.A0C;
            String[] strArr = A0E;
            String extraHints = strArr[2];
            if (extraHints.charAt(28) != strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            A0E[6] = "NRWBzlFLQPOGySbiiYXSLDN6";
            anonymousClass24.A06 = A02;
        }
        c05581p.A06(this.A0C.A06);
        c05581p.A07(this.A0C.A07);
        this.A05 = new E8(this.A0C.A0B, c05581p);
        this.A05.A0M(new YI(this));
        this.A05.A0Q(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(boolean z10) {
        E8 e82 = this.A05;
        if (e82 != null) {
            e82.A0M(new YH(this));
            this.A05.A0R(z10);
            this.A05 = null;
        }
    }

    public final long A0H() {
        E8 e82 = this.A05;
        if (e82 != null) {
            return e82.A0B();
        }
        return -1L;
    }

    public final void A0I() {
        A0F(true);
    }

    public final void A0J() {
        XT xt = this.A06;
        if (xt != null) {
            xt.A02();
        }
    }

    public final void A0K(RewardData rewardData) {
        E8 e82;
        this.A0C.A03 = rewardData;
        if (this.A09 && (e82 = this.A05) != null) {
            e82.A0U(rewardData);
        }
    }

    public final void A0L(AdCompanionView adCompanionView) {
        AnonymousClass18 anonymousClass18;
        this.A06 = (XT) adCompanionView.getAdCompanionViewApi();
        C1316Wj c1316Wj = this.A0A;
        if (c1316Wj != null && (anonymousClass18 = this.A04) != null) {
            this.A06.A03(c1316Wj, anonymousClass18);
        }
    }

    public final void A0M(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z10) {
        this.A01 = System.currentTimeMillis();
        try {
            A0E(str, adExperienceType, z10);
        } catch (Exception e10) {
            Log.e(A0F, A0A(78, 31, 55), e10);
            this.A0C.A0B.A06().A8u(A0A(109, 3, 96), C06977l.A0b, new C06987m(e10));
            AdError internalError = AdError.internalError(2004);
            this.A0C.A0B.A0D().A2a(L5.A01(this.A01), internalError.getErrorCode(), internalError.getErrorMessage());
            this.A0B.onError(this.A0C.A00(), internalError);
        }
    }

    public final boolean A0N() {
        E8 e82 = this.A05;
        return e82 == null || e82.A0S();
    }

    public final boolean A0O() {
        return this.A09;
    }

    public final boolean A0P(int i10, long j10) {
        if (!this.A09) {
            this.A0B.onError(this.A0C.A00(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        }
        if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A07.A02(i10);
            this.A05.A07.A03(j10);
            this.A05.A0G();
            this.A09 = false;
            return true;
        }
        this.A09 = false;
        return false;
    }
}
