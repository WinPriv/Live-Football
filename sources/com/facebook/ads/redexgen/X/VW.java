package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VW implements BO {
    public static byte[] A0F;
    public static String[] A0G = {"F9KwQMNMxiTjkayDhPM6gvDLkPvUNcLn", "Em4FZTw9NeUBCVsnasMEsqdbQrmSbGq", "", "tDq5h6G1X4d5RY1LfaFLZXWqT85DrCya", "B5R7X", "Y", "Zp00UWtElOmikRSXEs37FpNUTZ5eWL9Y", "wqRNyyxlEoRi9"};
    public static final BR A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public BQ A06;
    public VY A07;
    public VT A08;
    public boolean A09;
    public final HV A0C = new HV(4);
    public final HV A0B = new HV(9);
    public final HV A0E = new HV(11);
    public final HV A0D = new HV();
    public final VV A0A = new VV();
    public int A01 = 1;
    public long A04 = b.f7291b;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{-117, -111, -101};
    }

    static {
        A03();
        A0H = new VX();
        A0I = C0940Hl.A08(A01(0, 3, 9));
    }

    private HV A00(BP bp) throws IOException, InterruptedException {
        if (this.A02 > this.A0D.A05()) {
            HV hv = this.A0D;
            hv.A0b(new byte[Math.max(hv.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        bp.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        if (!this.A09) {
            this.A06.AEE(new C1282Vb(b.f7291b));
            this.A09 = true;
        }
        if (this.A04 != b.f7291b) {
            return;
        }
        this.A04 = this.A0A.A0D() == b.f7291b ? -this.A05 : 0L;
    }

    private void A04(BP bp) throws IOException, InterruptedException {
        bp.AEk(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(BP bp) throws IOException, InterruptedException {
        if (!bp.ADV(this.A0B.A00, 0, 9, true)) {
            return false;
        }
        HV hv = this.A0B;
        if (A0G[4].length() == 15) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "xxv79KM5VyarLmUhQqEOMlbbyGFtPWOG";
        strArr[6] = "n0W8PrJEyrqWl4lCbLWkK9bcjvpbO2Fn";
        hv.A0Y(0);
        this.A0B.A0Z(4);
        int A0E = this.A0B.A0E();
        int flags = A0E & 4;
        boolean z10 = flags != 0;
        int flags2 = A0E & 1;
        boolean z11 = flags2 != 0;
        if (z10 && this.A07 == null) {
            this.A07 = new VY(this.A06.AF2(8, 1));
        }
        if (z11 && this.A08 == null) {
            this.A08 = new VT(this.A06.AF2(9, 2));
        }
        this.A06.A5C();
        int flags3 = this.A0B.A08();
        this.A00 = (flags3 - 9) + 4;
        this.A01 = 2;
        return true;
    }

    private boolean A06(BP bp) throws IOException, InterruptedException {
        boolean z10 = true;
        if (this.A03 == 8 && this.A07 != null) {
            A02();
            this.A07.A00(A00(bp), this.A04 + this.A05);
        } else if (this.A03 == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(bp), this.A04 + this.A05);
        } else {
            if (this.A03 == 18) {
                boolean wasConsumed = this.A09;
                if (!wasConsumed) {
                    this.A0A.A00(A00(bp), this.A05);
                    long A0D = this.A0A.A0D();
                    if (A0D != b.f7291b) {
                        this.A06.AEE(new C1282Vb(A0D));
                        this.A09 = true;
                    }
                }
            }
            int i10 = this.A02;
            if (A0G[4].length() == 15) {
                throw new RuntimeException();
            }
            A0G[0] = "mShHrd4Vu2jNkvRJUK8UrhhXjzgbGKl1";
            bp.AEk(i10);
            z10 = false;
        }
        this.A00 = 4;
        this.A01 = 2;
        return z10;
    }

    private boolean A07(BP bp) throws IOException, InterruptedException {
        if (!bp.ADV(this.A0E.A00, 0, 11, true)) {
            return false;
        }
        this.A0E.A0Y(0);
        this.A03 = this.A0E.A0E();
        this.A02 = this.A0E.A0G();
        this.A05 = this.A0E.A0G();
        this.A05 = ((this.A0E.A0E() << 24) | this.A05) * 1000;
        this.A0E.A0Z(3);
        this.A01 = 4;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void A8G(BQ bq) {
        this.A06 = bq;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final int ADQ(BP bp, BV bv) throws IOException, InterruptedException {
        while (true) {
            int i10 = this.A01;
            if (i10 != 1) {
                if (i10 == 2) {
                    A04(bp);
                } else {
                    if (A0G[4].length() == 15) {
                        throw new RuntimeException();
                    }
                    A0G[4] = "ncW0XwKX3pgCRaaT";
                    if (i10 != 3) {
                        if (i10 == 4) {
                            if (A06(bp)) {
                                if (A0G[0].charAt(18) != 'j') {
                                    A0G[7] = "5";
                                    return 0;
                                }
                                A0G[7] = "DR5iBP2XCUKx659t";
                                return 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (!A07(bp)) {
                        return -1;
                    }
                }
            } else if (!A05(bp)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void AED(long j10, long j11) {
        this.A01 = 1;
        this.A04 = b.f7291b;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final boolean AEm(BP bp) throws IOException, InterruptedException {
        bp.AD0(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        bp.AD0(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        bp.AD0(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset = this.A0C.A08();
        bp.AE3();
        bp.A3K(dataOffset);
        bp.AD0(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset2 = this.A0C.A08();
        return dataOffset2 == 0;
    }
}
