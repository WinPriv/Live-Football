package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CT implements VN {
    public static byte[] A03;
    public static String[] A04 = {"hwqziZW7AZPod2dXLouvGwTTrlxQftu5", "HWTvO3PtXP9N2f8hjjNBE5ELyu96O7C2", "XZiXxIUms072zxq0eptbFHl9id1xfsii", "R678H1T6QVa3UEsgGNCZuIT3k3f5TJMX", "R3CvDfTCre2oGIfhbqMtFAzPo9CSve3e", "yCxuKEdtUnEmK00296URo1FADbxWErUf", "IeIjE9tQRhU2QKWiPhSO822TtqgvRx0R", "yf6PTLZVRmp8JK3c15ye5co8mawgp7Wk"};
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A04[1].charAt(18) != 'N') {
            throw new RuntimeException();
        }
        A04[1] = "IGRalwhGPANuEueVyyNisaHhdEkfW4kv";
        A03 = new byte[]{-117, Ascii.DEL, -52, -72, -56, -65, -106, -38, -41, -22, -41, -106, -23, -33, -16, -37, -106, -29, -33, -23, -29, -41, -22, -39, -34, -80, -106, -74, -62, -46, -55, -77, -59, -59, -53, -59, -46};
    }

    static {
        A02();
    }

    public CT(long[] jArr, long[] jArr2, long j10) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j10;
    }

    public static CT A00(long durationUs, long j10, BU bu, HV hv) {
        int A0E;
        long position = j10;
        hv.A0Z(10);
        int numFrames = hv.A08();
        if (numFrames <= 0) {
            return null;
        }
        int sampleRate = bu.A03;
        long A0F = C0940Hl.A0F(numFrames, 1000000 * (sampleRate >= 32000 ? 1152 : 576), sampleRate);
        int A0I = hv.A0I();
        int sampleRate2 = hv.A0I();
        int index = hv.A0I();
        hv.A0Z(2);
        long j11 = position + bu.A02;
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        for (int scale = 0; scale < A0I; scale++) {
            jArr[scale] = (scale * A0F) / A0I;
            jArr2[scale] = Math.max(position, j11);
            if (index == 1) {
                A0E = hv.A0E();
            } else if (index == 2) {
                A0E = hv.A0I();
            } else if (index == 3) {
                A0E = hv.A0G();
            } else {
                if (index != 4) {
                    return null;
                }
                A0E = hv.A0H();
            }
            position += A0E * sampleRate2;
            if (A04[7].charAt(10) == 'P') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[5] = "SApHUsB0TeciBaZ8FVEH7XQ0HhkRahgp";
            strArr[4] = "ro1Cj1bOUorcqHsrq9aZZzvMMKgEvTZf";
        }
        if (durationUs != -1 && durationUs != position) {
            Log.w(A01(27, 10, 57), A01(2, 25, 79) + durationUs + A01(0, 2, 56) + position);
        }
        return new CT(jArr, jArr2, A0F);
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j10) {
        int A0B = C0940Hl.A0B(this.A02, j10, true, true);
        BY by = new BY(this.A02[A0B], this.A01[A0B]);
        if (by.A01 < j10) {
            long[] jArr = this.A02;
            int tableIndex = jArr.length;
            if (A0B != tableIndex - 1) {
                int tableIndex2 = A0B + 1;
                long j11 = jArr[tableIndex2];
                int tableIndex3 = A0B + 1;
                BY nextSeekPoint = new BY(j11, this.A01[tableIndex3]);
                return new BW(by, nextSeekPoint);
            }
        }
        return new BW(by);
    }

    @Override // com.facebook.ads.redexgen.X.VN
    public final long A7c(long j10) {
        return this.A02[C0940Hl.A0B(this.A01, j10, true, true)];
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return true;
    }
}
