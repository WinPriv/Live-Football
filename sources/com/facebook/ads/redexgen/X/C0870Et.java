package com.facebook.ads.redexgen.X;

import android.net.Uri;

/* renamed from: com.facebook.ads.redexgen.X.Et, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0870Et {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final Uri[] A03;

    public C0870Et() {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    public C0870Et(int i10, int[] iArr, Uri[] uriArr, long[] jArr) {
        H6.A03(iArr.length == uriArr.length);
        this.A00 = i10;
        this.A01 = iArr;
        this.A03 = uriArr;
        this.A02 = jArr;
    }

    public final int A00() {
        return A01(-1);
    }

    public final int A01(int i10) {
        int i11 = i10 + 1;
        while (true) {
            int[] iArr = this.A01;
            int nextAdIndexToPlay = iArr.length;
            if (i11 >= nextAdIndexToPlay) {
                break;
            }
            int nextAdIndexToPlay2 = iArr[i11];
            if (nextAdIndexToPlay2 == 0 || iArr[i11] == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean A02() {
        return this.A00 == -1 || A00() < this.A00;
    }
}
