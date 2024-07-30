package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class ZB implements InterfaceC05300n, InterfaceC05451c {
    public static byte[] A0B;
    public static String[] A0C = {"PgLDGrk3t3a26fQCrT3IpIrRB5PMNBKm", "uls9HIPpriPjzjIXJVTR7HWmS4IMGzWu", "f2YRmtND2fanruA3kJYGXgN9aGwgjawI", "EZdssni07U2TMPMup9RmA63S0tAhTBNo", "xilKUxawUAlWzUTJOedtCKHAHwNBDRxA", "SxIuirRfQS0L7ik0LzQXw", "dF8CYh", "NQmOIXzIEfwTEqDrM9Z7TuMEUTKSiMNX"};
    public long A00;
    public RewardData A01;
    public InterfaceC05400x A02;
    public C05410y A03;
    public C05461d A04;
    public C1316Wj A05;
    public String A06;

    @Nullable
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {78, 108, 99, 42, 121, 45, 126, 121, 108, Ascii.DEL, 121, 45, 76, 120, 105, 100, 104, 99, 110, 104, 67, 104, 121, 122, 98, Ascii.DEL, 102, 76, 110, 121, 100, 123, 100, 121, 116, 35, 45, 64, 108, 102, 104, 45, 126, 120, Ascii.DEL, 104, 45, 121, 101, 108, 121, 45, 100, 121, 42, 126, 45, 100, 99, 45, 116, 98, 120, Ascii.DEL, 45, 76, 99, 105, Ascii.DEL, 98, 100, 105, 64, 108, 99, 100, 107, 104, 126, 121, 35, 117, 96, 97, 45, 107, 100, 97, 104, 35, 73, 77, 78, 122, 107, 102, 106, 97, 108, 106, 65, 106, 123, 120, 96, 125, 100, 68, 37, 42, Ascii.ESC, 37, 39, 48, 45, 50, 45, 48, 61, 93, 82, 87, 91, 80, 74, 106, 81, 85, 91, 80, 17, Ascii.EM, Ascii.CAN, Ascii.NAK, Ascii.GS, 8, Ascii.NAK, 19, Ascii.DC2, 56, Ascii.GS, 8, Ascii.GS, 52, 40, 37, 39, 33, 41, 33, 42, 48, Ascii.CR, 32, 4, 6, 17, Ascii.DLE, 17, Ascii.DC2, Ascii.GS, Ascii.SUB, 17, Ascii.DLE, 59, 6, Ascii.GS, 17, Ascii.SUB, 0, Ascii.NAK, 0, Ascii.GS, Ascii.ESC, Ascii.SUB, 63, 17, Ascii.CR, 117, 98, 118, 114, 98, 116, 115, 83, 110, 106, 98, Ascii.GS, 6, 1, Ascii.EM, Ascii.GS, Ascii.CR, 33, Ascii.FF, 38, 57, 53, 39, 4, 41, 32, 53, 80, 78, 73, 67, 72, 80};
        if (A0C[1].charAt(29) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "6qgGoSyjmuhDFT94hunOHzgd3UUS7LMQ";
        strArr[0] = "q1PjRK7gg6WFD8n4pAFO870HLaNMi7ir";
        A0B = bArr;
    }

    static {
        A05();
    }

    private int A00() {
        WindowManager windowManager = (WindowManager) this.A05.getSystemService(A03(205, 6, 47));
        int rotation = windowManager.getDefaultDisplay().getRotation();
        N3 adOrientation = A02();
        if (adOrientation == N3.A06) {
            return -1;
        }
        if (adOrientation == N3.A04) {
            if (rotation != 2 && rotation != 3) {
                return 0;
            }
            int rotation2 = A0C[1].charAt(29);
            if (rotation2 == 103) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "WCZdwi0h9oyTFk4ywD5LtkOxTOpQ29Yc";
            strArr[7] = "4yy96Y2PoNFTEE84mLwUlYETryPZgGhE";
            return 8;
        }
        if (rotation != 2) {
            return 1;
        }
        return 9;
    }

    private final EnumC0981Jc A01() {
        return this.A04.A0C();
    }

    private N3 A02() {
        return this.A04.A0D();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        C05461d c05461d = this.A04;
        RewardData rewardData = this.A01;
        c05461d.A0G(intent, rewardData, C1106Od.A03(rewardData, this.A0A, this.A06));
    }

    private final void A07(C1316Wj c1316Wj, InterfaceC05400x interfaceC05400x, C05591q c05591q, EnumSet<CacheFlag> cacheFlags, @Nullable String str) {
        this.A04 = new C05461d(c1316Wj, c05591q, this, str);
        this.A04.A0H(c1316Wj, cacheFlags);
    }

    private void A08(EnumC0981Jc enumC0981Jc) {
        if (enumC0981Jc.equals(EnumC0981Jc.A07)) {
            this.A05.A0D().AEb(EnumC05200c.A03);
            return;
        }
        if (enumC0981Jc.equals(EnumC0981Jc.A08)) {
            this.A05.A0D().AEb(EnumC05200c.A07);
            return;
        }
        if (enumC0981Jc.equals(EnumC0981Jc.A0A)) {
            this.A05.A0D().AEb(EnumC05200c.A09);
            return;
        }
        if (enumC0981Jc.equals(EnumC0981Jc.A09)) {
            this.A05.A0D().AEb(EnumC05200c.A08);
            return;
        }
        if (!enumC0981Jc.equals(EnumC0981Jc.A03)) {
            return;
        }
        if (this.A04.A0J()) {
            C0R A0D = this.A05.A0D();
            String[] strArr = A0C;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0C[2] = "SZ1DhKHJxqFOmux8c4F7iNiG5ZFRRvjL";
            A0D.AEb(EnumC05200c.A04);
            return;
        }
        if (this.A04.A0I()) {
            this.A05.A0D().AEb(EnumC05200c.A06);
        } else {
            this.A05.A0D().AEb(EnumC05200c.A05);
        }
    }

    public final AnonymousClass18 A09() {
        return this.A04.A0B();
    }

    public final void A0A(C1316Wj c1316Wj, InterfaceC05400x interfaceC05400x, C05591q c05591q, EnumSet<CacheFlag> enumSet, @Nullable String str, @Nullable String str2, @Nullable RewardData rewardData) {
        this.A05 = c1316Wj;
        this.A02 = interfaceC05400x;
        this.A08 = c05591q.A02();
        String str3 = this.A08;
        this.A06 = str3 != null ? str3.split(A03(107, 1, 19))[0] : A03(0, 0, 5);
        this.A00 = c05591q.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c1316Wj, interfaceC05400x, c05591q, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            InterfaceC05400x interfaceC05400x = this.A02;
            if (interfaceC05400x != null) {
                interfaceC05400x.AAz(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent A04 = K9.A04(this.A05);
        A04.putExtra(A03(154, 24, 124), A00());
        A04.putExtra(A03(189, 8, 96), this.A0A);
        A04.putExtra(A03(143, 11, 76), this.A08);
        A04.putExtra(A03(178, 11, 15), this.A00);
        EnumC0981Jc A01 = A01();
        A08(A01);
        A04.putExtra(A03(197, 8, 88), A01);
        String str = this.A07;
        if (str != null) {
            A04.putExtra(A03(130, 13, 116), str);
        }
        A06(A04);
        A04.addFlags(268435456);
        A04.putExtra(A03(119, 11, 54), this.A04.A0E());
        try {
            ActivityUtils.A03(this.A05);
            K9.A09(this.A05, A04);
            return true;
        } catch (K7 e10) {
            Throwable cause = e10.getCause();
            Throwable th = e10;
            if (cause != null) {
                th = e10.getCause();
            }
            this.A05.A06().A8u(A03(108, 11, 76), C06977l.A0D, new C06987m(th));
            Log.e(A03(90, 17, 7), A03(0, 90, 5), th);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05300n
    @Nullable
    public final String A63() {
        return this.A04.A0E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05300n
    public final AdPlacementType A79() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05451c
    public final void A9o(AdError adError) {
        InterfaceC05400x interfaceC05400x = this.A02;
        if (interfaceC05400x != null) {
            interfaceC05400x.AAz(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05451c
    public final void A9p() {
        A04();
        this.A02.AAy(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05451c
    public final void ADc() {
        this.A03 = new C05410y(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05451c
    public final void AF6() {
        C05410y c05410y = this.A03;
        if (c05410y != null) {
            c05410y.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05300n
    public final void onDestroy() {
        C05461d c05461d = this.A04;
        if (c05461d != null) {
            c05461d.A0F();
        }
    }
}
