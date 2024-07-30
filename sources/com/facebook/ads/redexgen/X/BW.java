package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BW {
    public static byte[] A02;
    public final BY A00;
    public final BY A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-54, -66, 1, Ascii.SYN};
    }

    public BW(BY by) {
        this(by, by);
    }

    public BW(BY by, BY by2) {
        this.A00 = (BY) H6.A01(by);
        this.A01 = (BY) H6.A01(by2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BW bw = (BW) obj;
        return this.A00.equals(bw.A00) && this.A01.equals(bw.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A00(2, 1, 88));
        sb2.append(this.A00);
        if (this.A00.equals(this.A01)) {
            str = A00(0, 0, 98);
        } else {
            str = A00(0, 2, 80) + this.A01;
        }
        sb2.append(str);
        sb2.append(A00(3, 1, 107));
        return sb2.toString();
    }
}
