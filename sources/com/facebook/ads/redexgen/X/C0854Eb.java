package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Eb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0854Eb extends AbstractC1382Yz {
    public static byte[] A0D;
    public static String[] A0E = {"YJVWhBFSVFKs7NrWmWULGh", "0GvTyPfIpVaCupDTXIuhVv", "vKmpQ0k2zgunQxdAFsx7Wlk6dmYtSCUc", "dqRYVPDeGy45RCRFCWIUPRHRtp9NBigI", "NSweCua6lZ8ChPFZ3cKnaOBscLcsrWLc", "HenZyTRrHhMHTWT00jKprDJGPW9d4C4V", "lvvcgtkpn6JHhS0LrJ19j3FN0lJsZZOv", "GmBDkEWrzwPugE8SLtTHysECIxUFQGpg"};
    public long A00;
    public AnonymousClass14 A01;
    public AnonymousClass15 A02;
    public AnonymousClass18 A03;
    public C1316Wj A04;
    public C0954Ib A05;
    public EnumC0981Jc A06;

    @Nullable
    @DoNotStrip
    public C1099Nw A07;
    public String A08;

    @Nullable
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{56, 52, 54, 54, 48, 57, 48, 39, 58, 56, 48, 33, 48, 39, 10, 39, 58, 33, 52, 33, 60, 58, 59, 108, 99, 82, 108, 110, 121, 100, 123, 100, 121, 116, 9, 6, 3, Ascii.SI, 4, Ascii.RS, 62, 5, 1, Ascii.SI, 4, 68, 76, 77, 64, 72, 93, 64, 70, 71, 109, 72, 93, 72, Ascii.FF, Ascii.DLE, Ascii.GS, Ascii.US, Ascii.EM, 17, Ascii.EM, Ascii.DC2, 8, 53, Ascii.CAN, 87, 85, 66, 67, 66, 65, 78, 73, 66, 67, 104, 85, 78, 66, 73, 83, 70, 83, 78, 72, 73, 108, 66, 94, 4, 19, 7, 3, 19, 5, 2, 34, Ascii.US, Ascii.ESC, 19, 104, Ascii.DEL, 109, 123, 104, 126, 73, Ascii.DEL, 104, 108, Ascii.DEL, 104, 79, 72, 86, Ascii.EM, Ascii.SO, Ascii.FS, 10, Ascii.EM, Ascii.SI, Ascii.SO, Ascii.SI, 61, 2, Ascii.SI, Ascii.SO, 4, 42, Ascii.SI, 47, 10, Ascii.US, 10, 41, Ascii.RS, 5, Ascii.SI, 7, Ascii.SO, 87, 64, 82, 68, 87, 65, 64, 65, 122, 83, 76, 65, 64, 74, 124, 103, 96, 120, 124, 108, 64, 109, 83, 76, 64, 82, 113, 92, 85, 64};
    }

    static {
        A08();
    }

    private void A06() {
        C2T A00 = C2T.A00(this.A04);
        AnonymousClass15 anonymousClass15 = this.A02;
        A00.A06(anonymousClass15, anonymousClass15.A00());
    }

    private void A07() {
        if (this.A02 != null) {
            try {
                C2T.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A09(Intent intent) {
        int i10 = super.A00;
        String A04 = A04(69, 24, 89);
        if (i10 != -1) {
            ContentResolver contentResolver = this.A04.getContentResolver();
            if (A0E[3].charAt(29) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[7] = "ryaiaZaF8EzuUPZd67FeoIG9jUALGHZG";
            strArr[6] = "XITZtpYy2wf6QHmOozCOnY6Xlkm3ca51";
            if (Settings.System.getInt(contentResolver, A04(1, 22, 43), 0) != 1) {
                int i11 = super.A00;
                if (A0E[2].charAt(2) != 'm') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[1] = "mo2n49jFbf8CHvb7nubztA";
                strArr2[0] = "3h0LYrxRFByrgEG7Z48zJG";
                intent.putExtra(A04, i11);
                return;
            }
        }
        if (!ID.A0f(this.A04)) {
            intent.putExtra(A04, 6);
        }
    }

    private void A0A(boolean z10) {
        if (this.A06 == EnumC0981Jc.A0C) {
            A0C(z10);
            return;
        }
        EnumC0981Jc enumC0981Jc = this.A06;
        String[] strArr = A0E;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[4] = "1yOiFacRiwJanRzqDJ6A5hJ77lYfziAe";
        strArr2[5] = "McEelBumOV7dKb1zb6BdvUT5HG6VvrgI";
        if (enumC0981Jc == EnumC0981Jc.A0B) {
            A0B(z10);
        } else {
            A0C(z10);
        }
    }

    private void A0B(boolean z10) {
        C6G c6g = new C6G(this.A04);
        boolean z11 = ID.A1W(this.A04) && C06505g.A0A(this.A03.A0d());
        if (z11) {
            C06505g unifiedAssetsLoader = new C06505g(c6g, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z11, new Z5(this));
            c6g.A0d(new C0954Ib(this.A03.A0U(), this.A04.A08()));
            unifiedAssetsLoader.A0B();
            return;
        }
        C05561n.A02(this.A04, this.A03, z10, new Z4(this));
    }

    private void A0C(boolean isDSL) {
        C6G c6g = new C6G(this.A04);
        c6g.A0d(this.A05);
        boolean z10 = ID.A1W(this.A04) && C06505g.A0A(this.A03.A0d());
        boolean A0r = this.A03.A0r();
        if (z10) {
            new C06505g(c6g, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z10, new Z7(this, A0r)).A0B();
            return;
        }
        C1371Yo c1371Yo = (C1371Yo) this.A03;
        if (TextUtils.isEmpty(c1371Yo.A0O().A0D().A08())) {
            this.A01.AC9(this, AdError.INTERNAL_ERROR);
        } else {
            C05571o.A02(this.A04, c6g, c1371Yo);
            c6g.A0W(new C0855Ec(this, isDSL, A0r, c1371Yo, this), new AnonymousClass69(c1371Yo.A0Z(), A04(144, 14, 91)));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1382Yz
    public final int A0D() {
        AnonymousClass18 anonymousClass18 = this.A03;
        if (anonymousClass18 != null) {
            return anonymousClass18.A0K();
        }
        String[] strArr = A0E;
        if (strArr[4].charAt(5) == strArr[5].charAt(5)) {
            throw new RuntimeException();
        }
        A0E[3] = "zy8kAWNFspHhc9OUOOhBHMIK4AaCMilm";
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1382Yz
    public final AnonymousClass18 A0E() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1382Yz
    public final boolean A0F() {
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A0f(super.A01);
        String A03 = C1106Od.A03(super.A02, this.A0B, this.A08);
        this.A03.A0g(super.A02);
        this.A03.A0k(A03);
        AdActivityIntent A04 = K9.A04(this.A04);
        A04.putExtra(A04(166, 8, 91), this.A06);
        A04.putExtra(A04(119, 25, 21), this.A03);
        A04.putExtra(A04(158, 8, 119), this.A0B);
        if (A03 != null) {
            A04.putExtra(A04(104, 15, 100), A03);
        }
        A04.putExtra(A04(58, 11, 2), this.A0A);
        A04.putExtra(A04(93, 11, 8), this.A00);
        String str = this.A09;
        if (str != null) {
            A04.putExtra(A04(45, 13, 87), str);
        }
        A09(A04);
        A04.setFlags(A04.getFlags() | 268435456);
        A04.putExtra(A04(34, 11, 20), this.A03.A0U());
        ActivityUtils.A03(this.A04);
        try {
            K9.A09(this.A04, A04);
        } catch (K7 e10) {
            Throwable cause = e10.getCause();
            Throwable th = e10;
            if (cause != null) {
                th = e10.getCause();
            }
            this.A04.A06().A8u(A04(23, 11, 115), C06977l.A01, new C06987m(th));
        }
        String[] strArr = A0E;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[1] = "L0ou65zbaEHIK9W1EiRqjH";
        strArr2[0] = "MlzKsAmmQguOmiSj0COpPP";
        return true;
    }

    public final void A0G(C1316Wj c1316Wj, AnonymousClass14 anonymousClass14, C05591q c05591q, boolean z10, @Nullable String str, @Nullable String str2) {
        this.A0C.set(false);
        this.A04 = c1316Wj;
        this.A01 = anonymousClass14;
        this.A0A = c05591q.A02();
        this.A00 = c05591q.A00();
        this.A09 = str2;
        String str3 = this.A0A;
        this.A08 = str3 != null ? str3.split(A04(0, 1, 25))[0] : A04(0, 0, 20);
        this.A03 = C1371Yo.A01(c05591q.A03(), this.A04);
        this.A03.A0i(str);
        this.A03.A0e(c05591q.A01().A06());
        this.A05 = new C0954Ib(this.A03.A0U(), c1316Wj.A08());
        if (this.A03.A0r()) {
            this.A06 = EnumC0981Jc.A05;
            if (this.A03.A0o()) {
                C0R A0D2 = this.A04.A0D();
                EnumC05200c enumC05200c = EnumC05200c.A04;
                String[] strArr = A0E;
                if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                    String[] strArr2 = A0E;
                    strArr2[7] = "T6UzDEu82kzY1KsvV3iHB7OkWnIxnMBs";
                    strArr2[6] = "PWXGgNcAlDXPEXP1mMx0dPQCA8p68UI5";
                    A0D2.AEb(enumC05200c);
                }
                throw new RuntimeException();
            }
            this.A04.A0D().AEb(EnumC05200c.A06);
            this.A02 = new AnonymousClass15(this.A0B, this, anonymousClass14);
            A06();
            A0A(z10);
        }
        int experienceType = this.A03.A0J();
        if (experienceType == 0) {
            this.A06 = EnumC0981Jc.A0C;
            C1316Wj c1316Wj2 = this.A04;
            String[] strArr3 = A0E;
            if (strArr3[4].charAt(5) != strArr3[5].charAt(5)) {
                String[] strArr4 = A0E;
                strArr4[4] = "sE7A2oUzbi1vVIMuEE2CogviWDEosGc5";
                strArr4[5] = "5NgD8lzbPLe7uQJdX4ST7JevLzoIctPR";
                c1316Wj2.A0D().AEb(EnumC05200c.A09);
            }
            throw new RuntimeException();
        }
        if (experienceType == 1) {
            this.A06 = EnumC0981Jc.A0B;
            this.A04.A0D().AEb(EnumC05200c.A08);
        }
        this.A02 = new AnonymousClass15(this.A0B, this, anonymousClass14);
        A06();
        A0A(z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05300n
    public final String A63() {
        return this.A03.A0U();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05300n
    public final void onDestroy() {
        A07();
    }
}
