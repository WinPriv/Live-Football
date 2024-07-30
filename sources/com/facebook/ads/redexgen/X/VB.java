package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VB implements CH {
    public static byte[] A0C;
    public static String[] A0D = {"IwWJ1rAHfmexjsebXRXcDPjaU73iSJJD", "Pfa9O7smeRLr", "YVPVKTJSUnoy1mID8h1JiHhyOv", "4YIcZCc9D0v6GYbVW55qq4", "MQGq3Ss0TGTuZcZl9hZWKHAs", "ClxO0wOPMkXGPeTsbkyLqOefUDvePx9Y", "eY8aqVMBTreysgzhCT0m33TuEQRECFok", "4vNP3Dy1WFFR"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final CG A0A = new CG();
    public final CK A0B;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 110);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{38, 7, 72, 7, Ascii.SI, Ascii.SI, 72, Ascii.CAN, 9, Ascii.SI, Ascii.CR, 72, Ascii.VT, 9, 6, 72, 10, Ascii.CR, 72, Ascii.SO, 7, Ascii.GS, 6, Ascii.FF, 70};
    }

    static {
        A0A();
    }

    public VB(long j10, long j11, CK ck, int i10, long j12) {
        H6.A03(j10 >= 0 && j11 > j10);
        this.A0B = ck;
        this.A09 = j10;
        this.A08 = j11;
        if (i10 == j11 - j10) {
            this.A07 = j12;
            this.A00 = 3;
        } else {
            this.A00 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j10, long j11, long j12) {
        long j13 = this.A08;
        long j14 = this.A09;
        long j15 = j10 + ((((j13 - j14) * j11) / this.A07) - j12);
        if (j15 < j14) {
            j15 = this.A09;
        }
        long j16 = this.A08;
        if (j15 >= j16) {
            return j16 - 1;
        }
        return j15;
    }

    private final long A01(long j10, BP bp) throws IOException, InterruptedException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long A7D = bp.A7D();
        if (A0D(bp, this.A01)) {
            this.A0A.A03(bp, false);
            bp.AE3();
            long j11 = j10 - this.A0A.A05;
            int i10 = this.A0A.A01 + this.A0A.A00;
            if (j11 >= 0) {
                String[] strArr = A0D;
                if (strArr[5].charAt(24) != strArr[0].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[2] = "1HFKFqyQYawdfec4zhOWKwAEhw";
                strArr2[3] = "atngC4wrhlAL4xDnem6FNv";
                if (j11 <= 72000) {
                    bp.AEk(i10);
                    return -(this.A0A.A05 + 2);
                }
            }
            if (j11 < 0) {
                this.A01 = A7D;
                this.A02 = this.A0A.A05;
            } else {
                long initialPosition = bp.A7D();
                this.A04 = initialPosition + i10;
                this.A05 = this.A0A.A05;
                long initialPosition2 = this.A01;
                if ((initialPosition2 - this.A04) + i10 < 100000) {
                    bp.AEk(i10);
                    long initialPosition3 = this.A05;
                    return -(initialPosition3 + 2);
                }
            }
            long initialPosition4 = this.A01;
            long j12 = this.A04;
            if (initialPosition4 - j12 < 100000) {
                this.A01 = j12;
                return j12;
            }
            long A7D2 = bp.A7D() - (i10 * (j11 > 0 ? 1L : 2L));
            long j13 = this.A01;
            long granuleDistance = this.A04;
            long j14 = (j13 - granuleDistance) * j11;
            String[] strArr3 = A0D;
            if (strArr3[5].charAt(24) != strArr3[0].charAt(24)) {
                long initialPosition5 = this.A02;
                long nextPosition = A7D2 + (j14 / (initialPosition5 - this.A05));
                return Math.min(Math.max(nextPosition, granuleDistance), this.A01 - 1);
            }
            String[] strArr4 = A0D;
            strArr4[1] = "HnyCEdH4by64";
            strArr4[7] = "f67XG71IQfud";
            long nextPosition2 = A7D2 + (j14 / (this.A02 - this.A05));
            return Math.min(Math.max(nextPosition2, granuleDistance), this.A01 - 1);
        }
        long j15 = this.A04;
        if (j15 != A7D) {
            return j15;
        }
        throw new IOException(A09(0, 25, 6));
    }

    private final long A02(BP bp) throws IOException, InterruptedException {
        A0C(bp);
        this.A0A.A02();
        while ((this.A0A.A04 & 4) != 4 && bp.A7D() < this.A08) {
            this.A0A.A03(bp, false);
            bp.AEk(this.A0A.A01 + this.A0A.A00);
        }
        return this.A0A.A05;
    }

    private final long A03(BP bp, long j10, long j11) throws IOException, InterruptedException {
        this.A0A.A03(bp, false);
        while (this.A0A.A05 < j10) {
            bp.AEk(this.A0A.A01 + this.A0A.A00);
            j11 = this.A0A.A05;
            this.A0A.A03(bp, false);
        }
        bp.AE3();
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.CH
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final VC A4S() {
        CE ce = null;
        if (this.A07 != 0) {
            return new VC(this);
        }
        return null;
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(BP bp) throws IOException, InterruptedException {
        if (A0D(bp, this.A08)) {
        } else {
            throw new EOFException();
        }
    }

    private final boolean A0D(BP bp, long j10) throws IOException, InterruptedException {
        long min = Math.min(3 + j10, this.A08);
        byte[] bArr = new byte[2048];
        int i10 = bArr.length;
        while (true) {
            if (bp.A7D() + i10 > min && (i10 = (int) (min - bp.A7D())) < 4) {
                return false;
            }
            bp.AD1(bArr, 0, i10, false);
            for (int i11 = 0; i11 < i10 - 3; i11++) {
                int peekLength = bArr[i11];
                if (peekLength == 79 && bArr[i11 + 1] == 103 && bArr[i11 + 2] == 103) {
                    int peekLength2 = bArr[i11 + 3];
                    if (peekLength2 == 83) {
                        bp.AEk(i11);
                        return true;
                    }
                }
            }
            bp.AEk(i10 - 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final long ADR(BP bp) throws IOException, InterruptedException {
        long currentGranule;
        int i10 = this.A00;
        if (i10 == 0) {
            this.A03 = bp.A7D();
            this.A00 = 1;
            long j10 = this.A08 - 65307;
            if (j10 > this.A03) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long currentGranule2 = this.A06;
            if (currentGranule2 == 0) {
                currentGranule = 0;
            } else {
                long position = A01(currentGranule2, bp);
                if (position >= 0) {
                    return position;
                }
                currentGranule = A03(bp, this.A06, -(position + 2));
            }
            this.A00 = 3;
            return -(2 + currentGranule);
        }
        long lastPageSearchPosition = A02(bp);
        this.A07 = lastPageSearchPosition;
        this.A00 = 3;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final long AEs(long j10) {
        int i10 = this.A00;
        H6.A03(i10 == 3 || i10 == 2);
        long j11 = 0;
        if (j10 != 0) {
            j11 = this.A0B.A04(j10);
        }
        this.A06 = j11;
        this.A00 = 2;
        A0B();
        long j12 = this.A06;
        String[] strArr = A0D;
        if (strArr[5].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        A0D[6] = "l4iEtEKEuRK6wb9mepvhy";
        return j12;
    }
}
