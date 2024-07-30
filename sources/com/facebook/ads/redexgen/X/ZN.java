package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class ZN extends AbstractC05230f {
    public static byte[] A02;
    public static String[] A03 = {"jy5CHS8ciK95qvgyZPKNzTZ", "EsJYGwS5VmRo2OpDKfhEPxAAyWa", "TXamSNcIJ7UnME9", "aAqXHcETEDrJIQ0", "iKc7fPJ", "AeuUMR7bsIhvkygvb", "MOi5LCZvXht1yXQHfTxaoFALkw", "2sehTzR2RD89PLQKMZ0CUhyomJdrMDfZ"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {42, 40, 51, 53, 40, 51, 46, 35, 75, 70, 79, 90};
        String[] strArr = A03;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A03[5] = "wR51MZdRiuTx9tajcMEJR1ABXy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = ZN.class.getSimpleName();
    }

    public ZN(C1316Wj c1316Wj, IT it, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1316Wj, it, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05230f
    public final void A0C() {
        IV iv = IV.A05;
        String queryParameter = this.A00.getQueryParameter(A00(0, 8, 58));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                iv = IV.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        super.A01.A96(this.A02, this.A01, this.A00.getQueryParameter(A00(8, 4, 95)), iv);
    }
}
