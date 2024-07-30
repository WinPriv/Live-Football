package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class GD {
    public static String[] A03 = {"uPzvf3DrMkTy6OC2", "H2eIGrw6YlTuEfUMB", "p11InAYoC", "jGz94J", "ZtEJrdVWV1XC8XFg6mMZlCv5mMRi1ND1", "Ub1YY0rlTcSKb3yBclMaPE0dIwwpm8Yp", "Au1lLpT3HfOHruCfEBskEQ20fDVmu", "jui1pWNgNEO"};
    public int A00;
    public final int A01;
    public final GC[] A02;

    public GD(GC... gcArr) {
        this.A02 = gcArr;
        this.A01 = gcArr.length;
    }

    @Nullable
    public final GC A00(int i10) {
        return this.A02[i10];
    }

    public final GC[] A01() {
        return (GC[]) this.A02.clone();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GD gd2 = (GD) obj;
        String[] strArr = A03;
        if (strArr[1].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[5] = "VymNKk7BYdZfYlSqFiIbjljOXHtGYALy";
        strArr2[4] = "eUsLwIc5zFGsQcnFIY6bSbYyt6aFMI1L";
        return Arrays.equals(this.A02, gd2.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }
}
