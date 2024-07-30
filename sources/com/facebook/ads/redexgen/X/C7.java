package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class C7 {
    public static byte[] A00;
    public static String[] A01 = {"kk3S4O13iVXJvtm5AjTeD8rK", "Zu4hi0TCs3bKXIhBk2aWCiDe3xK", "JowY5N4XtyrwAA9epoNCHGChZ5QJHmq", "OOxBqRpXIUSrAU80JlBeMYgVyXHV", "tCZgrksHUVK4eCN8oQ7yIu", "GrKlMP1w4PgYrm5YCKNZqmcWRop33Hln", "0sCqI3ucQZfe3Uil9qNltLDWT8T5PAU", "ug"};

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{76, 111, 111, 116, 93, 104, 115, 113, 73, 104, 117, 112, 109, 86, 75, 77, 72, 72, 87, 74, 76, 93, 92, Ascii.CAN, 72, 75, 75, 80, Ascii.CAN, 78, 93, 74, 75, 81, 87, 86, 2, Ascii.CAN};
    }

    static {
        A04();
    }

    public static int A00(byte[] bArr) {
        int i10;
        C6 parsedAtom = A01(bArr);
        if (parsedAtom != null) {
            i10 = parsedAtom.A00;
            return i10;
        }
        return -1;
    }

    @Nullable
    public static C6 A01(byte[] bArr) {
        HV hv = new HV(bArr);
        if (hv.A07() < 32) {
            return null;
        }
        hv.A0Y(0);
        if (hv.A08() != hv.A04() + 4) {
            return null;
        }
        int atomType = hv.A08();
        int atomSize = AbstractC0793Bp.A0r;
        String[] strArr = A01;
        if (strArr[0].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A01[6] = "KiHnRKSUZsnBoZKY996tMhDtZ8Gdi7J";
        if (atomType != atomSize) {
            return null;
        }
        int dataSize = AbstractC0793Bp.A01(hv.A08());
        if (dataSize > 1) {
            Log.w(A02(0, 12, 31), A02(12, 26, 59) + dataSize);
            return null;
        }
        UUID uuid = new UUID(hv.A0L(), hv.A0L());
        if (dataSize == 1) {
            hv.A0Z(hv.A0H() * 16);
        }
        int A0H = hv.A0H();
        if (A0H != hv.A04()) {
            return null;
        }
        byte[] bArr2 = new byte[A0H];
        hv.A0c(bArr2, 0, A0H);
        return new C6(uuid, dataSize, bArr2);
    }

    @Nullable
    public static UUID A03(byte[] bArr) {
        UUID uuid;
        C6 parsedAtom = A01(bArr);
        if (parsedAtom != null) {
            uuid = parsedAtom.A01;
            return uuid;
        }
        if (A01[6].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "A19aWphbBlm9ojDJQ1W47aeMdyevB22";
        strArr[1] = "rfVibYQBAeR1UXfUamieG6t7la8";
        return null;
    }
}
