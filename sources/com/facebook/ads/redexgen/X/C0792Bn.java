package com.facebook.ads.redexgen.X;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0792Bn {
    public static byte[] A03;
    public static final long[] A04;
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{0, 33, 110, 56, 47, 34, 39, 42, 110, 56, 47, 60, 39, 32, 58, 110, 34, 43, 32, 41, 58, 38, 110, 35, 47, 61, 37, 110, 40, 33, 59, 32, 42};
    }

    static {
        A03();
        A04 = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    }

    public static int A00(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = A04;
            int varIntLength = jArr.length;
            if (i11 >= varIntLength) {
                return -1;
            }
            if ((jArr[i11] & i10) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public static long A01(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= A04[i10 - 1] ^ (-1);
        }
        for (int i11 = 1; i11 < i10; i11++) {
            long varint = bArr[i11];
            j10 = (j10 << 8) | (varint & 255);
        }
        return j10;
    }

    public final int A04() {
        return this.A00;
    }

    public final long A05(BP bp, boolean z10, boolean z11, int i10) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            if (!bp.ADV(this.A02, 0, 1, z10)) {
                return -1L;
            }
            int firstByte = this.A02[0] & DefaultClassResolver.NAME;
            this.A00 = A00(firstByte);
            if (this.A00 != -1) {
                this.A01 = 1;
            } else {
                throw new IllegalStateException(A02(0, 33, 100));
            }
        }
        int i11 = this.A00;
        if (i11 > i10) {
            this.A01 = 0;
            return -2L;
        }
        if (i11 != 1) {
            bp.readFully(this.A02, 1, i11 - 1);
        }
        this.A01 = 0;
        return A01(this.A02, this.A00, z11);
    }

    public final void A06() {
        this.A01 = 0;
        this.A00 = 0;
    }
}
