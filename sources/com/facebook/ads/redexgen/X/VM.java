package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.b;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VM implements BO {
    public static byte[] A0E;
    public static String[] A0F = {"ydp2W5xsf3wxxmCItZRtLRLpaCcQN61V", "ZzeQ67WJ6", "MfxT7BiZm", "QAZkmCdKFAHfN7ilsO4NsWCm7AIOdsAB", "uXA2W", "sq6CLgUZZ", "GhmTF3RrY3ydpwpSZCJZy8aIHeXkOr61", "710SvX7FP4z"};
    public static final BR A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public BQ A04;
    public InterfaceC0789Ba A05;
    public VN A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final BS A0A;
    public final BT A0B;
    public final BU A0C;
    public final HV A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{117, 82, 90, 83, 97, 87, 83, 64, 81, 90, 87, 86, Ascii.DC2, 70, 93, 93, Ascii.DC2, 95, 83, 92, 75, Ascii.DC2, 80, 75, 70, 87, 65, Ascii.FS, 0, Ascii.DC4, 4, Ascii.US, Ascii.VT, 58, 61, 52};
    }

    static {
        A05();
        A0G = new VO();
        A0J = C0940Hl.A08(A04(32, 4, 79));
        A0H = C0940Hl.A08(A04(0, 4, 32));
        A0I = C0940Hl.A08(A04(28, 4, 74));
    }

    public VM() {
        this(0);
    }

    public VM(int i10) {
        this(i10, b.f7291b);
    }

    public VM(int i10, long j10) {
        this.A08 = i10;
        this.A09 = j10;
        this.A0D = new HV(10);
        this.A0C = new BU();
        this.A0A = new BS();
        this.A02 = b.f7291b;
        this.A0B = new BT();
    }

    private int A00(BP bp) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            bp.AE3();
            String[] strArr = A0F;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[0] = "k6Z5PTGWNQqxWVGEWp2g14fMjsllqw2H";
            strArr2[6] = "hJNgcdrxKvM79jF48EqDHnrsGOClnbxU";
            if (!bp.AD1(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int A08 = this.A0D.A08();
            int sampleHeaderData = this.A01;
            if (A06(A08, sampleHeaderData)) {
                int sampleHeaderData2 = BU.A00(A08);
                if (sampleHeaderData2 != -1) {
                    BU.A04(A08, this.A0C);
                    if (this.A02 == b.f7291b) {
                        this.A02 = this.A06.A7c(bp.A7D());
                        if (this.A09 != b.f7291b) {
                            this.A02 += this.A09 - this.A06.A7c(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0C.A02;
                    this.A00 = sampleHeaderData3;
                }
            }
            bp.AEk(1);
            this.A01 = 0;
            return 0;
        }
        int AE7 = this.A05.AE7(bp, this.A00, true);
        if (AE7 == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - AE7;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        long j10 = this.A02;
        long j11 = this.A03 * 1000000;
        int bytesAppended3 = this.A0C.A03;
        this.A05.AE9(j10 + (j11 / bytesAppended3), 1, this.A0C.A02, 0, null);
        long j12 = this.A03;
        int bytesAppended4 = this.A0C.A04;
        this.A03 = j12 + bytesAppended4;
        this.A00 = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 == r0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(com.facebook.ads.redexgen.X.HV r2, int r3) {
        /*
            int r1 = r2.A07()
            int r0 = r3 + 4
            if (r1 < r0) goto L18
            r2.A0Y(r3)
            int r1 = r2.A08()
            int r0 = com.facebook.ads.redexgen.X.VM.A0J
            if (r1 == r0) goto L17
            int r0 = com.facebook.ads.redexgen.X.VM.A0H
            if (r1 != r0) goto L18
        L17:
            return r1
        L18:
            int r1 = r2.A07()
            r0 = 40
            if (r1 < r0) goto L2e
            r0 = 36
            r2.A0Y(r0)
            int r1 = r2.A08()
            int r0 = com.facebook.ads.redexgen.X.VM.A0I
            if (r1 != r0) goto L2e
            return r0
        L2e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VM.A01(com.facebook.ads.redexgen.X.HV, int):int");
    }

    private VN A02(BP bp) throws IOException, InterruptedException {
        bp.AD0(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        BU.A04(this.A0D.A08(), this.A0C);
        return new C0807Ce(bp.A6r(), bp.A7D(), this.A0C);
    }

    private VN A03(BP bp) throws IOException, InterruptedException {
        HV hv = new HV(this.A0C.A02);
        bp.AD0(hv.A00, 0, this.A0C.A02);
        int i10 = 21;
        if ((this.A0C.A05 & 1) != 0) {
            if (this.A0C.A01 != 1) {
                i10 = 36;
            }
        } else if (this.A0C.A01 == 1) {
            i10 = 13;
        }
        int xingBase = A01(hv, i10);
        if (xingBase == A0J || xingBase == A0H) {
            CS A01 = CS.A01(bp.A6r(), bp.A7D(), this.A0C, hv);
            if (A01 != null && !this.A0A.A03()) {
                bp.AE3();
                bp.A3K(i10 + 141);
                HV frame = this.A0D;
                bp.AD0(frame.A00, 0, 3);
                HV frame2 = this.A0D;
                frame2.A0Y(0);
                BS bs = this.A0A;
                HV frame3 = this.A0D;
                bs.A04(frame3.A0G());
            }
            bp.AEk(this.A0C.A02);
            if (A01 != null && !A01.A8d() && xingBase == A0H) {
                return A02(bp);
            }
            return A01;
        }
        if (xingBase == A0I) {
            CT A00 = CT.A00(bp.A6r(), bp.A7D(), this.A0C, hv);
            bp.AEk(this.A0C.A02);
            return A00;
        }
        bp.AE3();
        return null;
    }

    public static boolean A06(int i10, long j10) {
        return ((long) ((-128000) & i10)) == ((-128000) & j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x004b, code lost:
    
        if (r15 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x004d, code lost:
    
        r14.AEk(r5 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0051, code lost:
    
        r13.A01 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0053, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0054, code lost:
    
        r14.AE3();
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A07(com.facebook.ads.redexgen.X.BP r14, boolean r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VM.A07(com.facebook.ads.redexgen.X.BP, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void A8G(BQ bq) {
        this.A04 = bq;
        this.A05 = this.A04.AF2(0, 1);
        this.A04.A5C();
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final int ADQ(BP bp, BV bv) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            try {
                A07(bp, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            this.A06 = A03(bp);
            VN vn = this.A06;
            if (vn == null || (!vn.A8d() && (this.A08 & 1) != 0)) {
                VN A02 = A02(bp);
                String[] strArr = A0F;
                if (strArr[2].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0F[3] = "vRoDRHRtSRtNnEEJ64K4r5ogXxosELXw";
                this.A06 = A02;
            }
            this.A04.AEE(this.A06);
            this.A05.A5T(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(bp);
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void AED(long j10, long j11) {
        this.A01 = 0;
        this.A02 = b.f7291b;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final boolean AEm(BP bp) throws IOException, InterruptedException {
        return A07(bp, true);
    }
}
