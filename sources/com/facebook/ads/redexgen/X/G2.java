package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class G2 {
    public static String[] A03 = {"JpQuEMJyhkDDwoW2qnimD48iH4", "zq20t8z5PSjLxyVHdDvtiCtXPLpdqU3i", "so9HDpzw9NbS3t5s7rLQl2iaR2XAJ3iQ", "SPSQ89YBqvY9lwFZlxdH4ztJ", "r8lQcfIA9xflC1biO54W", "tOh5wxE3", "g5QR5HO0jbZc71FO4Igm6aH5aV", "ocODke0nsuLbpuPtat5dt9ny7kJ7l6fu"};
    public final int A00;
    public final int A01;

    @Nullable
    public final String A02;

    public G2(int i10, int i11, @Nullable String str) {
        this.A00 = i10;
        this.A01 = i11;
        this.A02 = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A03;
        if (strArr[5].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A03[7] = "ASeEdSOeJHMbddf2fOqd0PFHGr8KWkVO";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        G2 g22 = (G2) obj;
        if (this.A00 == g22.A00 && this.A01 == g22.A01 && TextUtils.equals(this.A02, g22.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int i10 = result * 31;
        int result2 = this.A01;
        int result3 = (i10 + result2) * 31;
        String str = this.A02;
        int result4 = str != null ? str.hashCode() : 0;
        return result3 + result4;
    }
}
