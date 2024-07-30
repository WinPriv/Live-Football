package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BZ {
    public static String[] A04 = {"mvf", "5vUSiUqvqexSVjGtqKGfn", "JwxxJCZPfqV7dBG9RK7xAyPr7ROekLAM", "", "XpEsaMQEhp4STG8PYYwcejEb1g", "Vmkb7cGbkehknCkwYPEH7uVKWZ5FPigs", "LeK9QdxXLgCTlktURPbNFMf3RZigSes2", "9odHEpKIuTJMz7KtuT4u9eB1nZm0XlV7"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public BZ(int i10, byte[] bArr, int i11, int i12) {
        this.A01 = i10;
        this.A03 = bArr;
        this.A02 = i11;
        this.A00 = i12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BZ bz = (BZ) obj;
        if (this.A01 == bz.A01) {
            int i10 = this.A02;
            int i11 = bz.A02;
            String[] strArr = A04;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "eTvhBYpDKk9eWFXXJfKHFDj3AmOCaziB";
            strArr2[1] = "mkymkzw6fBYyEptVGXW89";
            if (i10 == i11 && this.A00 == bz.A00 && Arrays.equals(this.A03, bz.A03)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i10 = result * 31;
        int result2 = Arrays.hashCode(this.A03);
        int result3 = (((i10 + result2) * 31) + this.A02) * 31;
        int result4 = this.A00;
        return result3 + result4;
    }
}
