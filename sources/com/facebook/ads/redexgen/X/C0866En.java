package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.En, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0866En extends ZO {
    public static byte[] A02;
    public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {Ascii.SO, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, 61, 58, 52, 2, -24, -14, -17, -12, -15};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
        strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = C0866En.class.getSimpleName();
    }

    public C0866En(C1316Wj c1316Wj, IT it, String str, Uri uri, Map<String, String> mExtraData, @Nullable C05290m c05290m, boolean z10) {
        super(c1316Wj, it, str, c05290m, z10);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05230f
    @Nullable
    public final EnumC05220e A0A() {
        if (A0F(this.A00)) {
            return null;
        }
        try {
            KL.A0A(new KL(), ((AbstractC05230f) this).A00, KM.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC05230f) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            return EnumC05220e.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.ZO
    public final void A0D() {
        EnumC05220e enumC05220e = null;
        if (((ZO) this).A02) {
            enumC05220e = A0A();
        }
        A0E(this.A01, enumC05220e);
    }
}
