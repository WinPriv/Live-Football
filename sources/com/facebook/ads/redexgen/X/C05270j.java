package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.redexgen.X.0j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05270j {
    public static byte[] A00;
    public static String[] A01 = {"4Fi3cRKjKwjo", "pfwDmZC0EgnSHGG3akphHDiSxRpjxWfc", "OwKyFlCBYoW0NHpoiuFf2exuC", "FTixXnraWBf7yQ9sseM6khJqknPB2", "87lno6sBf8EnLpq9v2WrftgOrdI4V", "hcLSbPhFObKmfxN2jEGb0Jf71EM4", "MV7VLhl", "AE1L1nhQpeYYJvXkfFkincgpQRIdvuit"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{101, 64, 4, 77, 87, 4, 77, 74, 82, 69, 72, 77, 64, 69, 80, 65, 64, 4, 83, 77, 80, 76, 75, 81, 80, 4, 80, 75, 79, 65, 74, 10, 10, Ascii.ESC, 2};
    }

    static {
        A02();
    }

    @Nullable
    public static Collection<String> A01(@Nullable JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            hashSet.add(jSONArray.optString(i10));
        }
        return hashSet;
    }

    public static boolean A03(C1316Wj c1316Wj, InterfaceC05260i interfaceC05260i, IT it) {
        EnumC05250h A6n = interfaceC05260i.A6n();
        if (A6n != null) {
            EnumC05250h invalidationBehavior = EnumC05250h.A03;
            if (A6n != invalidationBehavior) {
                boolean packageInstalled = false;
                Collection<String> A6M = interfaceC05260i.A6M();
                if (A6M == null || A6M.isEmpty()) {
                    return false;
                }
                Iterator<String> it2 = A6M.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (C1013Km.A04(c1316Wj, it2.next())) {
                        packageInstalled = true;
                        break;
                    }
                }
                EnumC05250h invalidationBehavior2 = EnumC05250h.A02;
                if (packageInstalled != (A6n == invalidationBehavior2)) {
                    return false;
                }
                String A63 = interfaceC05260i.A63();
                boolean isEmpty = TextUtils.isEmpty(A63);
                String[] strArr = A01;
                String clientToken = strArr[7];
                if (clientToken.charAt(25) != strArr[1].charAt(25)) {
                    throw new RuntimeException();
                }
                A01[2] = "Y0XUyINdugWnNFuKX72emGLWk";
                if (!isEmpty) {
                    it.A90(A63, null);
                    return true;
                }
                c1316Wj.A06().A8u(A00(32, 3, 83), C06977l.A0Z, new C06987m(A00(0, 32, 28)));
                return true;
            }
        }
        return false;
    }
}
