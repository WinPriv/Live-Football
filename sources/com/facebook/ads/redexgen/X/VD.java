package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.b;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VD implements BO, BX {
    public static byte[] A0J;
    public static String[] A0K = {"0jSfxoXEMfCjtmnyDugkNcQJRjSOySMa", "bnCyjA5DcUmWUqivzOXdDI", "awYt8cnKxKdhDKIItvFTiUYUED9yM0q1", "Luabopmg5NHaS5SoCXeHIbwAQFsLRvJ0", "odfzLqPoxtdmNhQ8QVXSS2", "Wo8IxRBaFRXe4oQbEdt7BomqryNllMGC", "1wQy", "sEQm6Nsu4XqoPKwwi3EdYrJfunZcOKFC"};
    public static final BR A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public BQ A09;
    public HV A0A;
    public boolean A0B;
    public C4[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final HV A0F;
    public final HV A0G;
    public final HV A0H;
    public final ArrayDeque<VL> A0I;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{57, Ascii.FF, Ascii.ETB, Ascii.NAK, 88, Ascii.VT, 17, 2, Ascii.GS, 88, Ascii.DC4, Ascii.GS, Ascii.VT, Ascii.VT, 88, Ascii.FF, Ascii.DLE, Ascii.EM, Ascii.SYN, 88, Ascii.DLE, Ascii.GS, Ascii.EM, Ascii.FS, Ascii.GS, 10, 88, Ascii.DC4, Ascii.GS, Ascii.SYN, Ascii.US, Ascii.FF, Ascii.DLE, 88, 80, Ascii.CR, Ascii.SYN, Ascii.VT, Ascii.CR, 8, 8, Ascii.ETB, 10, Ascii.FF, Ascii.GS, Ascii.FS, 81, 86, 4, 1, 85, 85};
    }

    static {
        A07();
        A0L = new VE();
        A0M = C0940Hl.A08(A04(48, 4, 105));
    }

    public VD() {
        this(0);
    }

    public VD(int i10) {
        this.A0E = i10;
        this.A0F = new HV(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new HV(HR.A03);
        this.A0G = new HV(4);
        this.A06 = -1;
    }

    private int A00(long j10) {
        long sampleAccumulatedBytes = Long.MAX_VALUE;
        int i10 = 1;
        int i11 = -1;
        long j11 = Long.MAX_VALUE;
        long j12 = Long.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        int i12 = 0;
        while (true) {
            C4[] c4Arr = this.A0C;
            if (i12 >= c4Arr.length) {
                break;
            }
            C4 c42 = c4Arr[i12];
            int i13 = c42.A00;
            if (i13 != c42.A03.A01) {
                long j13 = c42.A03.A06[i13];
                long j14 = this.A0D[i12][i13];
                long j15 = j13 - j10;
                int i14 = (j15 < 0 || j15 >= 262144) ? 1 : 0;
                if ((i14 == 0 && i10 != 0) || (i14 == i10 && j15 < sampleAccumulatedBytes)) {
                    i10 = i14;
                    sampleAccumulatedBytes = j15;
                    i11 = i12;
                    j11 = j14;
                }
                if (j14 < j12) {
                    j12 = j14;
                    trackIndex = i14;
                    minAccumulatedBytesTrackIndex = i12;
                }
            }
            i12++;
        }
        if (A0K[5].charAt(28) != 'l') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[7] = "2rf3IkD44HipF2iEZWYVpECLVHr0uALb";
        strArr[0] = "2zlrhAiZVnIklu1FhIrlCsqVaSaq97eM";
        if (j12 == Long.MAX_VALUE || trackIndex == 0) {
            return i11;
        }
        long preferredSkipAmount = 10485760 + j12;
        if (j11 < preferredSkipAmount) {
            return i11;
        }
        return minAccumulatedBytesTrackIndex;
    }

    private int A01(BP bp, BV bv) throws IOException, InterruptedException {
        int i10;
        long A7D = bp.A7D();
        if (this.A06 == -1) {
            this.A06 = A00(A7D);
            if (this.A06 == -1) {
                return -1;
            }
        }
        C4 c42 = this.A0C[this.A06];
        InterfaceC0789Ba trackOutput = c42.A01;
        int i11 = c42.A00;
        long j10 = c42.A03.A06[i11];
        int sampleSize = c42.A03.A05[i11];
        long j11 = (j10 - A7D) + this.A04;
        if (j11 < 0 || j11 >= 262144) {
            bv.A00 = j10;
            return 1;
        }
        if (c42.A02.A02 == 1) {
            j11 += 8;
            sampleSize -= 8;
        }
        bp.AEk((int) j11);
        if (c42.A02.A01 != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i12 = c42.A02.A01;
            int i13 = 4 - c42.A02.A01;
            while (this.A04 < sampleSize) {
                int i14 = this.A05;
                if (i14 == 0) {
                    bp.readFully(this.A0G.A00, i13, i12);
                    this.A0G.A0Y(0);
                    this.A05 = this.A0G.A0H();
                    this.A0H.A0Y(0);
                    trackOutput.AE8(this.A0H, 4);
                    this.A04 += 4;
                    sampleSize += i13;
                } else {
                    int AE7 = trackOutput.AE7(bp, i14, false);
                    this.A04 += AE7;
                    this.A05 -= AE7;
                }
            }
            i10 = 0;
        } else {
            while (true) {
                int i15 = this.A04;
                if (i15 >= sampleSize) {
                    break;
                }
                int AE72 = trackOutput.AE7(bp, sampleSize - i15, false);
                this.A04 += AE72;
                this.A05 -= AE72;
            }
            i10 = 0;
        }
        trackOutput.AE9(c42.A03.A07[i11], c42.A03.A04[i11], sampleSize, 0, null);
        c42.A00++;
        this.A06 = -1;
        this.A04 = i10;
        this.A05 = i10;
        return i10;
    }

    public static int A02(CD cd2, long j10) {
        int A00 = cd2.A00(j10);
        if (A00 == -1) {
            return cd2.A01(j10);
        }
        return A00;
    }

    public static long A03(CD cd2, long j10, long j11) {
        int A02 = A02(cd2, j10);
        if (A02 == -1) {
            return j11;
        }
        return Math.min(cd2.A06[A02], j11);
    }

    private ArrayList<CD> A05(VL vl, BS bs, boolean z10) throws C9R {
        CA A0C;
        ArrayList<CD> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            int size = vl.A01.size();
            String[] strArr = A0K;
            String str = strArr[2];
            String str2 = strArr[3];
            int i11 = str.length();
            if (i11 != str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "cCqXKTxpaVHnB5xhxhubewm2proDizNi";
            strArr2[0] = "XNMFZPcuybbaYtAFLaJvO7GLnY5oO3YZ";
            if (i10 < size) {
                VL vl2 = vl.A01.get(i10);
                int i12 = ((AbstractC0793Bp) vl2).A00;
                if (i12 == AbstractC0793Bp.A1L && (A0C = C0798Bu.A0C(vl2, vl.A07(AbstractC0793Bp.A0n), b.f7291b, null, z10, this.A0B)) != null) {
                    CD A0E = C0798Bu.A0E(A0C, vl2.A06(AbstractC0793Bp.A0d).A06(AbstractC0793Bp.A0h).A06(AbstractC0793Bp.A16), bs);
                    if (A0E.A01 != 0) {
                        arrayList.add(A0E);
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j10) throws C9R {
        while (!this.A0I.isEmpty() && this.A0I.peek().A00 == j10) {
            VL pop = this.A0I.pop();
            if (((AbstractC0793Bp) pop).A00 == AbstractC0793Bp.A0j) {
                A0A(pop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                VL containerAtom = this.A0I.peek();
                containerAtom.A08(pop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A09(long j10) {
        for (C4 track : this.A0C) {
            CD cd2 = track.A03;
            int A00 = cd2.A00(j10);
            if (A00 == -1) {
                A00 = cd2.A01(j10);
            }
            track.A00 = A00;
        }
    }

    private void A0A(VL vl) throws C9R {
        ArrayList<CD> A05;
        int trackCount = -1;
        long j10 = b.f7291b;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        BS bs = new BS();
        VK A07 = vl.A07(AbstractC0793Bp.A1P);
        if (A07 != null && (metadata = C0798Bu.A0F(A07, this.A0B)) != null) {
            bs.A05(metadata);
        }
        try {
            A05 = A05(vl, bs, (this.A0E & 1) != 0);
        } catch (VH unused) {
            bs = new BS();
            A05 = A05(vl, bs, true);
        }
        int size = A05.size();
        for (int i10 = 0; i10 < size; i10++) {
            CD cd2 = A05.get(i10);
            CA ca2 = cd2.A03;
            C4 c42 = new C4(ca2, cd2, this.A09.AF2(i10, ca2.A03));
            Format A0F = ca2.A07.A0F(cd2.A00 + 30);
            if (ca2.A03 == 1) {
                if (bs.A03()) {
                    A0F = A0F.A0G(bs.A00, bs.A01);
                }
                if (metadata != null) {
                    A0F = A0F.A0J(metadata);
                }
            }
            c42.A01.A5T(A0F);
            j10 = Math.max(j10, ca2.A04 != b.f7291b ? ca2.A04 : cd2.A02);
            if (ca2.A03 == 2 && trackCount == -1) {
                trackCount = arrayList.size();
            }
            arrayList.add(c42);
        }
        this.A02 = trackCount;
        this.A08 = j10;
        this.A0C = (C4[]) arrayList.toArray(new C4[arrayList.size()]);
        this.A0D = A0G(this.A0C);
        this.A09.A5C();
        this.A09.AEE(this);
    }

    public static boolean A0B(int i10) {
        if (i10 != AbstractC0793Bp.A0j) {
            int i11 = AbstractC0793Bp.A1L;
            String[] strArr = A0K;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "xHWkCkmm9lwx55Xb6ilKRbCBaMi3tx91";
            strArr2[3] = "ufwmFaOIh4ETn2yFiF4b2v05oMaexVS8";
            if (i10 != i11 && i10 != AbstractC0793Bp.A0d && i10 != AbstractC0793Bp.A0h && i10 != AbstractC0793Bp.A16 && i10 != AbstractC0793Bp.A0N) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0C(int i10) {
        if (i10 != AbstractC0793Bp.A0c && i10 != AbstractC0793Bp.A0n && i10 != AbstractC0793Bp.A0V && i10 != AbstractC0793Bp.A1A && i10 != AbstractC0793Bp.A1D && i10 != AbstractC0793Bp.A1B) {
            int i11 = AbstractC0793Bp.A0C;
            if (A0K[1].length() != 22) {
                throw new RuntimeException();
            }
            A0K[1] = "WjfYMB7jPbcUwDvfNOpuH1";
            if (i10 != i11 && i10 != AbstractC0793Bp.A0O && i10 != AbstractC0793Bp.A19 && i10 != AbstractC0793Bp.A1C && i10 != AbstractC0793Bp.A1E && i10 != AbstractC0793Bp.A17 && i10 != AbstractC0793Bp.A0B && i10 != AbstractC0793Bp.A1J && i10 != AbstractC0793Bp.A0U && i10 != AbstractC0793Bp.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0D(BP bp) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!bp.ADV(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        long endPosition = this.A07;
        if (endPosition == 1) {
            bp.readFully(this.A0F.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0F.A0N();
        } else if (endPosition == 0) {
            long A6r = bp.A6r();
            if (A6r == -1 && !this.A0I.isEmpty()) {
                A6r = this.A0I.peek().A00;
            }
            if (A6r != -1) {
                this.A07 = (A6r - bp.A7D()) + this.A00;
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long A7D = (bp.A7D() + this.A07) - this.A00;
                this.A0I.push(new VL(this.A01, A7D));
                if (this.A07 == this.A00) {
                    A08(A7D);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                H6.A04(this.A00 == 8);
                H6.A04(this.A07 <= 2147483647L);
                this.A0A = new HV((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new C9R(A04(0, 48, 100));
    }

    private boolean A0E(BP bp, BV bv) throws IOException, InterruptedException {
        long j10 = this.A07 - this.A00;
        long atomEndPosition = bp.A7D() + j10;
        boolean z10 = false;
        HV hv = this.A0A;
        if (hv != null) {
            bp.readFully(hv.A00, this.A00, (int) j10);
            if (this.A01 == AbstractC0793Bp.A0U) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new VK(this.A01, this.A0A));
            }
        } else if (j10 < 262144) {
            bp.AEk((int) j10);
        } else {
            long atomPayloadSize = bp.A7D();
            bv.A00 = atomPayloadSize + j10;
            z10 = true;
        }
        A08(atomEndPosition);
        return z10 && this.A03 != 2;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0F(com.facebook.ads.redexgen.X.HV r3) {
        /*
            r0 = 8
            r3.A0Y(r0)
            int r1 = r3.A08()
            int r0 = com.facebook.ads.redexgen.X.VD.A0M
            r2 = 1
            if (r1 != r0) goto Lf
            return r2
        Lf:
            r0 = 4
            r3.A0Z(r0)
        L13:
            int r0 = r3.A04()
            if (r0 <= 0) goto L22
            int r1 = r3.A08()
            int r0 = com.facebook.ads.redexgen.X.VD.A0M
            if (r1 != r0) goto L13
            return r2
        L22:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VD.A0F(com.facebook.ads.redexgen.X.HV):boolean");
    }

    public static long[][] A0G(C4[] c4Arr) {
        long[][] jArr = new long[c4Arr.length];
        int[] iArr = new int[c4Arr.length];
        long[] jArr2 = new long[c4Arr.length];
        boolean[] tracksFinished = new boolean[c4Arr.length];
        for (int i10 = 0; i10 < c4Arr.length; i10++) {
            jArr[i10] = new long[c4Arr[i10].A03.A01];
            jArr2[i10] = c4Arr[i10].A03.A07[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < c4Arr.length) {
            long j11 = Long.MAX_VALUE;
            int minTimeTrackIndex = -1;
            for (int i12 = 0; i12 < c4Arr.length; i12++) {
                if (!tracksFinished[i12]) {
                    long minTimeUs = jArr2[i12];
                    if (minTimeUs <= j11) {
                        minTimeTrackIndex = i12;
                        j11 = jArr2[i12];
                    }
                }
            }
            int i13 = iArr[minTimeTrackIndex];
            jArr[minTimeTrackIndex][i13] = j10;
            j10 += c4Arr[minTimeTrackIndex].A03.A05[i13];
            int i14 = i13 + 1;
            iArr[minTimeTrackIndex] = i14;
            if (i14 < jArr[minTimeTrackIndex].length) {
                jArr2[minTimeTrackIndex] = c4Arr[minTimeTrackIndex].A03.A07[i14];
            } else {
                tracksFinished[minTimeTrackIndex] = true;
                i11++;
            }
        }
        return jArr;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j10) {
        long j11;
        long j12;
        int sampleIndex;
        C4[] c4Arr = this.A0C;
        if (c4Arr.length == 0) {
            return new BW(BY.A04);
        }
        long secondOffset = b.f7291b;
        long secondTimeUs = -1;
        int i10 = this.A02;
        if (i10 != -1) {
            CD cd2 = c4Arr[i10].A03;
            int A02 = A02(cd2, j10);
            if (A02 == -1) {
                return new BW(BY.A04);
            }
            j11 = cd2.A07[A02];
            j12 = cd2.A06[A02];
            if (j11 < j10) {
                int secondSampleIndex = cd2.A01;
                int i11 = secondSampleIndex - 1;
                if (A0K[5].charAt(28) == 'l') {
                    String[] strArr = A0K;
                    strArr[4] = "wZC6PUUkwbL39FGS7qgHi4";
                    strArr[6] = "ISWp";
                    if (A02 < i11 && (sampleIndex = cd2.A01(j10)) != -1 && sampleIndex != A02) {
                        secondOffset = cd2.A07[sampleIndex];
                        secondTimeUs = cd2.A06[sampleIndex];
                    }
                }
                throw new RuntimeException();
            }
        } else {
            j11 = j10;
            j12 = Long.MAX_VALUE;
        }
        int secondSampleIndex2 = 0;
        while (true) {
            C4[] c4Arr2 = this.A0C;
            if (A0K[5].charAt(28) != 'l') {
                break;
            }
            String[] strArr2 = A0K;
            strArr2[2] = "HuKpkwhwNffVsg1qOYm34WvQGcpzf7CA";
            strArr2[3] = "OpSxQ7AB5KpfVVm82hohcPrOWAs1xSas";
            if (secondSampleIndex2 < c4Arr2.length) {
                if (secondSampleIndex2 != this.A02) {
                    CD cd3 = c4Arr2[secondSampleIndex2].A03;
                    j12 = A03(cd3, j11, j12);
                    if (secondOffset != b.f7291b) {
                        secondTimeUs = A03(cd3, secondOffset, secondTimeUs);
                    }
                }
                secondSampleIndex2++;
            } else {
                BY by = new BY(j11, j12);
                if (secondOffset == b.f7291b) {
                    return new BW(by);
                }
                return new BW(by, new BY(secondOffset, secondTimeUs));
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void A8G(BQ bq) {
        this.A09 = bq;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final int ADQ(BP bp, BV bv) throws IOException, InterruptedException {
        while (true) {
            int i10 = this.A03;
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "qJxbwGisfZf9YKIw0pjhTsx78598m8MK";
            strArr2[0] = "kX2rligkfJBBB9teOSCW5LaSmFhGBJWo";
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return A01(bp, bv);
                    }
                    throw new IllegalStateException();
                }
                if (A0E(bp, bv)) {
                    return 1;
                }
            } else if (!A0D(bp)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void AED(long j10, long j11) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j10 == 0) {
            A06();
        } else {
            if (this.A0C == null) {
                return;
            }
            A09(j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final boolean AEm(BP bp) throws IOException, InterruptedException {
        return C8.A04(bp);
    }
}
