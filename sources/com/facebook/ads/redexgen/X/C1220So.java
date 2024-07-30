package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.So, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1220So extends AbstractRunnableC0997Ju {
    public static byte[] A02;
    public static String[] A03 = {"jAsZfZwQ15YE1xm95Uum6vWOaDH1Az8A", "fi77qJmjg5Rwb", "EORDPJJatEjTyV", "9q4WoxWSHvvys", "ZnqFv4LDFQ916SUcrxzb43hFVVFJOLFp", "nu1Fhr1q5Uq1RKDrD4GP42DLl0Uj", "wJhiR1cxoop1phUk5wYOXEGX7ooerIC3", "cvoiCCK"};
    public final /* synthetic */ JT A00;
    public final /* synthetic */ JW A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, Ascii.VT, 69, 78, 95, 92, 68, 89, 64, Ascii.VT, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    static {
        A02();
    }

    public C1220So(JW jw, JT jt) {
        this.A01 = jw;
        this.A00 = jt;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        C1316Wj c1316Wj;
        C1316Wj c1316Wj2;
        C1316Wj c1316Wj3;
        C1316Wj c1316Wj4;
        C1316Wj c1316Wj5;
        long j10;
        C1316Wj c1316Wj6;
        String str;
        Map<String, String> adRequestParameters;
        InterfaceC1144Pp A032;
        C1316Wj c1316Wj7;
        C1316Wj c1316Wj8;
        C1316Wj c1316Wj9;
        C1316Wj c1316Wj10;
        long j11;
        c1316Wj = this.A01.A04;
        if (L3.A00(c1316Wj) != L2.A07) {
            c1316Wj2 = this.A01.A04;
            C07067u.A08(c1316Wj2);
            c1316Wj3 = this.A01.A04;
            C06625s.A07(c1316Wj3);
            JT jt = this.A00;
            C8G A00 = C8G.A00();
            c1316Wj4 = this.A01.A04;
            boolean z10 = true;
            Map<String, String> A08 = jt.A08(A00.A01(c1316Wj4, true).A6U());
            this.A01.A02 = A08;
            try {
                c1316Wj7 = this.A01.A04;
                PackageManager packageManager = c1316Wj7.getPackageManager();
                if (packageManager != null) {
                    String A002 = A00(1, 12, 113);
                    StringBuilder sb2 = new StringBuilder();
                    c1316Wj8 = this.A01.A04;
                    sb2.append(c1316Wj8.getPackageName());
                    sb2.append(A00(0, 1, 93));
                    c1316Wj9 = this.A01.A04;
                    sb2.append(packageManager.getInstallerPackageName(c1316Wj9.getPackageName()));
                    A08.put(A002, new String(Base64.encode(sb2.toString().getBytes(), 2)));
                }
            } catch (Exception unused) {
            }
            try {
                if (this.A00.A05() != J8.A03 && this.A00.A05() != J8.A05 && this.A00.A05() != J8.A04 && this.A00.A05() != null) {
                    z10 = false;
                }
                c1316Wj6 = this.A01.A04;
                InterfaceC1143Po A022 = Q6.A02(z10, c1316Wj6);
                str = this.A01.A06;
                Q2 q22 = new Q2();
                adRequestParameters = this.A01.A02;
                byte[] A082 = q22.A05(adRequestParameters).A08();
                A032 = this.A01.A03(L5.A00(), this.A00);
                A022.AD5(str, A082, A032);
                return;
            } catch (Exception e10) {
                AdErrorType adRequestFailed = AdErrorType.AD_REQUEST_FAILED;
                String message = e10.getMessage();
                c1316Wj5 = this.A01.A04;
                C0R A0D = c1316Wj5.A0D();
                if (A03[5].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[3] = "KP51TgwZ8p9oo";
                strArr[2] = "i0Q8y5VFLDaPT7";
                j10 = this.A01.A00;
                A0D.A2j(L5.A01(j10), adRequestFailed.getErrorCode(), message, adRequestFailed.isPublicError());
                this.A01.A0D(J3.A01(adRequestFailed, message));
                return;
            }
        }
        this.A01.A09();
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = A00(13, 21, 92);
        c1316Wj10 = this.A01.A04;
        C0R A0D2 = c1316Wj10.A0D();
        j11 = this.A01.A00;
        A0D2.A2j(L5.A01(j11), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A01.A0D(new J3(adErrorType, errorMessage));
    }
}
