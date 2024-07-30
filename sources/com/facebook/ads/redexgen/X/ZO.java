package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class ZO extends AbstractC05230f {
    public static String A03;
    public static String A04;
    public static String A05;
    public static byte[] A06;
    public static String[] A07 = {"1", "OJ2IOsbUnCKybSqk53zM3JXcifahO", "e4RldewFXKwYCBzcZ5CwWZ5XjhlRHNiJ", "729G42gqUNiz5ZAUAxRhvFZ2YWMhTd0L", "J1Ql0tv9onNfDvsMKNTgjNyaDa6Pnzub", "9fBm", "mbPUpspz4Nj5AFGqwEe2w9x9WWs", "2uSYGuFAJgr"};
    public final boolean A00;

    @Nullable
    public final C05290m A01;
    public final boolean A02;

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 30);
            if (A07[3].charAt(0) != '7') {
                throw new RuntimeException();
            }
            A07[5] = "PWjD";
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{93, 114, 119, 125, 117, 62, 114, 113, 121, 121, 123, 122, 68, 75, 65, 87, 74, 76, 65, Ascii.VT, 76, 75, 81, 64, 75, 81, Ascii.VT, 68, 70, 81, 76, 74, 75, Ascii.VT, 115, 108, 96, 114, Ascii.CAN, Ascii.ESC, Ascii.EM, 17, 37, Ascii.SO, 19, Ascii.ETB, Ascii.US, 46, 39, 35, 52, 39, Ascii.GS, 54, 43, 47, 39, Ascii.VT, 17, Ascii.DLE, 7, Ascii.VT, 9, 1, 37, 35, 53, 53, 51, 37, 37, 76, 87, 80, 79, 92, 75, 74, 88, 85, 102, 85, 80, 87, 82, 89, 95, 73, 94, 115, 88, 94, 77, 79, 71, 73, 94, 115, 69, 95, 115, 66, 67, 88, 115, 66, 89, 64, 64, 75, 93, 72, 95, 84, 99, 93, 82, 88, 99, 94, 78, 83, 75, 79, 89};
    }

    public abstract void A0D();

    static {
        A0B();
        A03 = A0A(64, 7, 72);
        A04 = A0A(85, 24, 50);
        A05 = A0A(109, 16, 34);
    }

    public ZO(C1316Wj c1316Wj, IT it, String str, @Nullable C05290m c05290m, boolean z10) {
        this(c1316Wj, it, str, c05290m, z10, false);
    }

    public ZO(C1316Wj c1316Wj, IT it, String str, @Nullable C05290m c05290m, boolean z10, boolean z11) {
        super(c1316Wj, it, str);
        this.A01 = c05290m;
        this.A02 = z10;
        this.A00 = z11;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05230f
    public final void A0C() {
        C05290m c05290m = this.A01;
        if (c05290m != null) {
            c05290m.A07(super.A02);
        }
        A0D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r4 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        r3 = r7.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (com.facebook.ads.redexgen.X.ZO.A07[6].length() == 8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        r2 = com.facebook.ads.redexgen.X.ZO.A07;
        r2[2] = "42brCgECckKxVuTsLxKp6fXlInYi7mUj";
        r2[4] = "SJ7s8Rg0tKhfkKPQamVQVBa2w2xrx0QV";
        r3.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        r3.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        if (r4 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(java.util.Map<java.lang.String, java.lang.String> r8, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.EnumC05220e r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZO.A0E(java.util.Map, com.facebook.ads.redexgen.X.0e):void");
    }

    public final boolean A0F(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0A(71, 14, 39));
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            String universalLink = A0A(12, 26, 59);
            Intent launchIntent = new Intent(universalLink, KM.A00(queryParameter));
            launchIntent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                launchIntent.addFlags(1024);
            }
            boolean redirectedToApp = K9.A0B(super.A00, launchIntent);
            return redirectedToApp;
        } catch (K7 unused) {
            return false;
        }
    }
}
