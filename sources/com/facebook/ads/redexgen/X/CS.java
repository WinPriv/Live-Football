package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CS implements VN {
    public static byte[] A05;
    public static String[] A06 = {"BIb1Y700RDmcL7JF9Fn", "lk1IRtv8jtyAOasrQbC6YrAcVcFJ9", "71nm4ncPUlnpG5PegzVfukIlQIS7yUOP", "GCiVubWGa77lALd1Rb0", "chLweuz0mMl4FbXf4CPkrAmx2V", "NRv5J71Oqm94bOZTTnySoFkmq1d86Acc", "fJm6FHaelFV0WMwBghon3E9Gns2th", "ObA7Byd4NJEP2M9ay6ZCFLfldVonyLqe"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static CS A01(long j10, long j11, BU bu, HV hv) {
        int A0H;
        int i10 = bu.A04;
        int i11 = bu.A03;
        int A08 = hv.A08();
        if ((A08 & 1) != 1 || (A0H = hv.A0H()) == 0) {
            return null;
        }
        long A0F = C0940Hl.A0F(A0H, i10 * 1000000, i11);
        if ((A08 & 6) != 6) {
            return new CS(j11, bu.A02, A0F);
        }
        long A0H2 = hv.A0H();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = hv.A0E();
        }
        if (j10 != -1 && j10 != j11 + A0H2) {
            Log.w(A02(27, 10, 96), A02(2, 25, 81) + j10 + A02(0, 2, 17) + (j11 + A0H2));
        }
        return new CS(j11, bu.A02, A0F, A0H2, jArr);
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A06[5] = "xDmrh2CysME7FGpg0OVAAWQWrb1b5rm7";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 106);
            i13++;
        }
    }

    public static void A03() {
        String[] strArr = A06;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A06[5] = "O7i6ampyP1fRYbe4QOmd9JyFrRUTDP0J";
        A05 = new byte[]{87, 91, 99, 114, 117, 124, Ascii.ESC, 95, 90, 79, 90, Ascii.ESC, 72, 82, 65, 94, Ascii.ESC, 86, 82, 72, 86, 90, 79, 88, 83, 1, Ascii.ESC, 82, 99, 100, 109, 89, 111, 111, 97, 111, 120};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j10) {
        double d10;
        if (!A8d()) {
            return new BW(new BY(0L, this.A02 + this.A00));
        }
        long A0E = C0940Hl.A0E(j10, 0L, this.A03);
        double d11 = (A0E * 100.0d) / this.A03;
        if (d11 <= 0.0d) {
            d10 = 0.0d;
        } else if (d11 >= 100.0d) {
            d10 = 256.0d;
        } else {
            int i10 = (int) d11;
            double d12 = this.A04[i10];
            if (A06[4].length() == 1) {
                throw new RuntimeException();
            }
            A06[4] = "";
            d10 = d12 + (((i10 == 99 ? 256.0d : r10[i10 + 1]) - d12) * (d11 - i10));
        }
        return new BW(new BY(A0E, this.A02 + C0940Hl.A0E(Math.round((d10 / 256.0d) * this.A01), this.A00, this.A01 - 1)));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.VN
    public final long A7c(long j10) {
        long j11 = j10 - this.A02;
        if (!A8d()) {
            return 0L;
        }
        long j12 = this.A00;
        if (A06[4].length() == 1) {
            throw new RuntimeException();
        }
        A06[5] = "XBnVl7Vf2qRXlKywSNR3LOgq8shxQKKO";
        if (j11 <= j12) {
            return 0L;
        }
        double d10 = (j11 * 256.0d) / this.A01;
        int A0B = C0940Hl.A0B(this.A04, (long) d10, true, true);
        long A00 = A00(A0B);
        long j13 = this.A04[A0B];
        long A002 = A00(A0B + 1);
        return Math.round((A002 - A00) * (j13 == (A0B == 99 ? 256L : this.A04[A0B + 1]) ? 0.0d : (d10 - j13) / (r8 - j13))) + A00;
    }

    static {
        A03();
    }

    public CS(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public CS(long j10, int i10, long j11, long j12, long[] jArr) {
        this.A02 = j10;
        this.A00 = i10;
        this.A03 = j11;
        this.A01 = j12;
        this.A04 = jArr;
    }

    private long A00(int i10) {
        return (this.A03 * i10) / 100;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return this.A04 != null;
    }
}
