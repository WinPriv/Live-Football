package com.facebook.ads.redexgen.X;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VS implements Bg {
    public static byte[] A07;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0791Bi A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C0790Bf> A05 = new ArrayDeque<>();
    public final C0792Bn A04 = new C0792Bn();

    static {
        A05();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{101, -118, -110, 125, -120, -123, Byte.MIN_VALUE, 60, -127, -120, -127, -119, -127, -118, -112, 60, -112, -107, -116, -127, 60, -73, -36, -28, -49, -38, -41, -46, -114, -44, -38, -35, -49, -30, -114, -31, -41, -24, -45, -88, -114, -95, -58, -50, -71, -60, -63, -68, 120, -63, -58, -52, -67, -65, -67, -54, 120, -53, -63, -46, -67, -110, 120, -64, -31, -33, -42, -37, -44, -115, -46, -39, -46, -38, -46, -37, -31, -115, -32, -42, -25, -46, -89, -115};
    }

    private double A00(BP bp, int i10) throws IOException, InterruptedException {
        long A02 = A02(bp, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    private long A01(BP bp) throws IOException, InterruptedException {
        bp.AE3();
        while (true) {
            bp.AD0(this.A06, 0, 4);
            int A00 = C0792Bn.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) C0792Bn.A01(this.A06, A00, false);
                if (this.A03.A8U(A01)) {
                    bp.AEk(A00);
                    return A01;
                }
            }
            bp.AEk(1);
        }
    }

    private long A02(BP bp, int i10) throws IOException, InterruptedException {
        bp.readFully(this.A06, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long value = this.A06[i11] & DefaultClassResolver.NAME;
            j10 = (j10 << 8) | value;
        }
        return j10;
    }

    private String A04(BP bp, int i10) throws IOException, InterruptedException {
        if (i10 == 0) {
            return A03(0, 0, 34);
        }
        byte[] bArr = new byte[i10];
        bp.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // com.facebook.ads.redexgen.X.Bg
    public final void A8H(InterfaceC0791Bi interfaceC0791Bi) {
        this.A03 = interfaceC0791Bi;
    }

    @Override // com.facebook.ads.redexgen.X.Bg
    public final boolean ADS(BP bp) throws IOException, InterruptedException {
        long j10;
        int i10;
        H6.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty()) {
                long A7D = bp.A7D();
                j10 = this.A05.peek().A01;
                if (A7D >= j10) {
                    InterfaceC0791Bi interfaceC0791Bi = this.A03;
                    i10 = this.A05.pop().A00;
                    interfaceC0791Bi.A5B(i10);
                    return true;
                }
            }
            if (this.A01 == 0) {
                long A05 = this.A04.A05(bp, true, false, 4);
                if (A05 == -2) {
                    A05 = A01(bp);
                }
                if (A05 == -1) {
                    return false;
                }
                this.A00 = (int) A05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(bp, false, true, 8);
                this.A01 = 2;
            }
            int A6R = this.A03.A6R(this.A00);
            if (A6R != 0) {
                if (A6R == 1) {
                    long A7D2 = bp.A7D();
                    this.A05.push(new C0790Bf(this.A00, A7D2 + this.A02));
                    this.A03.AEp(this.A00, A7D2, this.A02);
                    this.A01 = 0;
                    return true;
                }
                if (A6R == 2) {
                    long j11 = this.A02;
                    if (j11 <= 8) {
                        this.A03.A8J(this.A00, A02(bp, (int) j11));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C9R(A03(41, 22, 60) + this.A02);
                }
                if (A6R == 3) {
                    long j12 = this.A02;
                    if (j12 <= 2147483647L) {
                        this.A03.AEx(this.A00, A04(bp, (int) j12));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C9R(A03(63, 21, 81) + this.A02);
                }
                if (A6R == 4) {
                    this.A03.A3r(this.A00, (int) this.A02, bp);
                    this.A01 = 0;
                    return true;
                }
                if (A6R == 5) {
                    long j13 = this.A02;
                    if (j13 == 4 || j13 == 8) {
                        InterfaceC0791Bi interfaceC0791Bi2 = this.A03;
                        int i11 = this.A00;
                        int type = (int) this.A02;
                        interfaceC0791Bi2.A5P(i11, A00(bp, type));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C9R(A03(21, 20, 82) + this.A02);
                }
                throw new C9R(A03(0, 21, 0) + A6R);
            }
            int type2 = (int) this.A02;
            bp.AEk(type2);
            this.A01 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Bg
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
