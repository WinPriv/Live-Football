package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    public static byte[] A00;
    public static String[] A01 = {"AHE", "RRnVzkx80MTN3FqEJt", "led", "2KbHnyifL6VUnWZo871M9o2", "7ClMzpqLzs", "HkanzBoJlpvPuvCRA9YQDdQ4hb2my8M7", "vjl2zY43b2ds9JJYxQSrI76cEpLCeEgS", "N23slwJuVPJs6YUtQHSKIIyMmg17H8I"};

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A01[3] = "BHWF4fapUSaelbKAwLUt9EM";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 70);
            i13++;
        }
    }

    public static void A03() {
        A00 = new byte[]{66, 82, 69, 84, 60, 34, 36, 49, 98, 97, 125, 120, 114, 116, 49, 114, 126, 124, 124, 112, Ascii.DEL, 117, 43, 49, 101, 104, 97, 116, 44};
    }

    static {
        A03();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return A02(0, 29, 87) + getClass().getSimpleName();
    }
}
