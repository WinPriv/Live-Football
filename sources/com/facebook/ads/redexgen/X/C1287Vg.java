package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1287Vg implements BX {
    public static byte[] A06;
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{110, 112, 100, -88, -71, -74, -91, -72, -83, -77, -78, -73, -103, -73, -127, 113, 101, -76, -85, -85, -72, -86, -71, -72, -126, -96, -108, -25, -35, -18, -39, -25, -79, 126, 114, -58, -69, -65, -73, -89, -59, -113, -102, -65, -52, -59, -62, -96, -59, -69, -68, -49, Ascii.DEL, -61, -68, -59, -66, -53, -65, -108};
    }

    public C1287Vg(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        this.A00 = iArr.length;
        int i10 = this.A00;
        if (i10 > 0) {
            this.A05 = jArr2[i10 - 1] + jArr3[i10 - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j10) {
        return C0940Hl.A0B(this.A04, j10, true, true);
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j10) {
        int A00 = A00(j10);
        BY by = new BY(this.A04[A00], this.A03[A00]);
        if (by.A01 < j10) {
            int chunkIndex = this.A00;
            if (A00 != chunkIndex - 1) {
                int chunkIndex2 = A00 + 1;
                long j11 = this.A04[chunkIndex2];
                int chunkIndex3 = A00 + 1;
                BY seekPoint = new BY(j11, this.A03[chunkIndex3]);
                return new BW(by, seekPoint);
            }
        }
        return new BW(by);
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return true;
    }

    public final String toString() {
        return A01(42, 18, 22) + this.A00 + A01(25, 8, 51) + Arrays.toString(this.A01) + A01(15, 10, 4) + Arrays.toString(this.A03) + A01(33, 9, 17) + Arrays.toString(this.A04) + A01(1, 14, 3) + Arrays.toString(this.A02) + A01(0, 1, 4);
    }
}
