package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class Uu implements CU {
    public static byte[] A0D;
    public static String[] A0E = {"YsqY7Lk0NG7yMwVwuR3aCKQ1vCFnnoD7", "imTBT5eeu9SEESxnKVa9Th5", "O0aT", "zBRiiCG0AgE79WafkQACjpG1QDeKkcp1", "wwjqIDfPN4cSDtn9coCmQZMwbPpUFodD", "uPTa", "JD3sFkMXr2jLKKNxvTNpqQokakbynhd6", "fAZgloKcDeiXibtKpEsUxRbbQwdcutNH"};
    public static final double[] A0F;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC0789Ba A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final CV A0B = new CV(128);

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0E[1].length() != 23) {
                throw new RuntimeException();
            }
            A0E[4] = "Ri5OGo1CF8gLgqNPBzhcn52enWrdUOS9";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 59);
            i13++;
        }
    }

    public static void A02() {
        A0D = new byte[]{-2, -15, -20, -19, -9, -73, -11, -8, -19, -17, -70};
    }

    static {
        A02();
        A0F = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public static Pair<Format, Long> A00(CV cv, String str) {
        byte[] copyOf = Arrays.copyOf(cv.A02, cv.A00);
        int i10 = copyOf[4] & DefaultClassResolver.NAME;
        int firstByte = copyOf[5] & DefaultClassResolver.NAME;
        int aspectRatioCode = (i10 << 4) | (firstByte >> 4);
        int i11 = ((firstByte & 15) << 8) | (copyOf[6] & DefaultClassResolver.NAME);
        float f = 1.0f;
        int thirdByte = (copyOf[7] & 240) >> 4;
        if (thirdByte != 2) {
            String[] strArr = A0E;
            if (strArr[2].length() == strArr[5].length()) {
                String[] strArr2 = A0E;
                strArr2[3] = "HgbrGKSiwbnHfsjka25a0ZgViwBErbAQ";
                strArr2[6] = "kgfZHtVXJwuxNbqkZAemlWCJOmm9Ylqd";
                if (thirdByte != 3) {
                    if (thirdByte == 4) {
                        f = (i11 * 121) / (aspectRatioCode * 100);
                    }
                } else {
                    f = (i11 * 16) / (aspectRatioCode * 9);
                }
            }
            throw new RuntimeException();
        }
        f = (i11 * 4) / (aspectRatioCode * 3);
        Format A03 = Format.A03(str, A01(0, 11, 77), null, -1, -1, aspectRatioCode, i11, -1.0f, Collections.singletonList(copyOf), -1, f, null);
        long j10 = 0;
        int thirdByte2 = (copyOf[7] & Ascii.SI) - 1;
        if (thirdByte2 >= 0) {
            double[] dArr = A0F;
            if (thirdByte2 < dArr.length) {
                double d10 = dArr[thirdByte2];
                int i12 = cv.A01;
                int thirdByte3 = (copyOf[i12 + 9] & 96) >> 5;
                int firstByte2 = i12 + 9;
                if (A0E[1].length() == 23) {
                    A0E[1] = "JkGh2MRG0HwgK9dbH7jOqv6";
                    int frameRateExtensionN = copyOf[firstByte2] & Ascii.US;
                    if (thirdByte3 != frameRateExtensionN) {
                        int frameRateExtensionD = frameRateExtensionN + 1;
                        d10 *= (thirdByte3 + 1.0d) / frameRateExtensionD;
                    }
                    j10 = (long) (1000000.0d / d10);
                }
                throw new RuntimeException();
            }
        }
        return Pair.create(A03, Long.valueOf(j10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        if (r3 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        if (r21.A07 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        r21.A05.AE9(r21.A03, r21.A09 ? 1 : 0, ((int) (r21.A04 - r21.A02)) - r4, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0157, code lost:
    
        if (r3 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        if (r2 != com.anythink.expressad.exoplayer.b.f7291b) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0124, code lost:
    
        r21.A03 = r2;
        r21.A09 = false;
        r21.A01 = r4;
        r21.A0A = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0145, code lost:
    
        if (r21.A0A == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0147, code lost:
    
        r2 = r21.A03 + r21.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014d, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
    
        if (r2 != com.anythink.expressad.exoplayer.b.f7291b) goto L45;
     */
    @Override // com.facebook.ads.redexgen.X.CU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A48(com.facebook.ads.redexgen.X.HV r22) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Uu.A48(com.facebook.ads.redexgen.X.HV):void");
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A4V(BQ bq, C0811Ci c0811Ci) {
        c0811Ci.A05();
        this.A06 = c0811Ci.A04();
        this.A05 = bq.AF2(c0811Ci.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACx() {
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACy(long j10, boolean z10) {
        this.A01 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void AEC() {
        HR.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
