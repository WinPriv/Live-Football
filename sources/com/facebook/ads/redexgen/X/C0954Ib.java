package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0954Ib {
    public static byte[] A02;
    public static String[] A03 = {"0EK1zjbC0rvKFRySirHuNeKu7O6M1c2K", "EZ3WTNSY5ayWns4cE", "iOTwBXJJn2mTXQ1MI7WizzznsNyhmcwj", "DnXRTJeCR1MDANpnyW3y9Xegmk", "0BaBrbX1x0DXsftKwoONmcZPElrNX48m", "JdhHjDAP4IE4TNrXk8Fag99Jau", "kO1FJ5pbtA78NTGKnINecVB8MAIDEUuG", "0uD1E8KeZOnBJibGqVh9DEewsO4i87jr"};
    public final IT A00;
    public final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[4].charAt(5) != 'b') {
                throw new RuntimeException();
            }
            A03[4] = "OpSsMbmoyiuJLyOxEkBMoj5ebplLMUgU";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 40);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{Ascii.CAN, Ascii.RS, 9, Ascii.US, Ascii.DC2, Ascii.ESC, Ascii.SO};
    }

    static {
        A01();
    }

    public C0954Ib(String str, IT it) {
        this.A01 = str;
        this.A00 = it;
    }

    public final void A02(EnumC0953Ia enumC0953Ia, @Nullable Map<String, String> data) {
        A03(enumC0953Ia.A02(), data);
    }

    public final void A03(String str, @Nullable Map<String, String> map) {
        if (!C0956Id.A0B(this.A01, str)) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(A00(0, 7, 67), str);
        IT it = this.A00;
        String str2 = this.A01;
        if (A03[4].charAt(5) != 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[0] = "vT3nRtW3uRS5jX4JEmaR2PdDFOqNzjtW";
        strArr[7] = "IECj1aNSpXIXDwy92hzTd369PO3PVRtC";
        it.A8x(str2, map);
    }
}
