package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: assets/audience_network.dex */
public final class UG implements InterfaceC0789Ba {
    public static String[] A0F = {"I0oQBEUbvXwmLkE4WWtRMgz", "xnniIxRr7DxSpuMWabRYn3WDpy4qBN9b", "Y7uRaXgz80uNyvcPATB9r3b0PwOkuM1V", "hSCUvOutOZqOqVGgCzlnUKxaNOAoeOWK", "Xz3O4WRIuCzLKbQHyaIDpuywePn7", "cSGy8Fn9cMgpPa", "oA7ibzMCvoxqvUcH1m6Eely4XW9nrCN1", "6CG0cGfKidBjxaDlKmMoUzgrmHvkLCHY"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public C0858Ef A04;
    public C0858Ef A05;
    public C0858Ef A06;
    public InterfaceC0859Eg A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final GI A0D;
    public final C0857Ee A0C = new C0857Ee();
    public final C0856Ed A0B = new C0856Ed();
    public final HV A0E = new HV(32);

    public UG(GI gi) {
        this.A0D = gi;
        this.A0A = gi.A6m();
        this.A04 = new C0858Ef(0L, this.A0A);
        C0858Ef c0858Ef = this.A04;
        this.A05 = c0858Ef;
        this.A06 = c0858Ef;
    }

    private int A00(int i10) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3L(), new C0858Ef(this.A06.A03, this.A0A));
        }
        return Math.min(i10, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j10) {
        if (format == null) {
            return null;
        }
        if (j10 != 0 && format.A0G != Long.MAX_VALUE) {
            return format.A0H(format.A0G + j10);
        }
        return format;
    }

    private void A02(int i10) {
        this.A01 += i10;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j10) {
        while (j10 >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j10) {
        if (j10 == -1) {
            return;
        }
        while (j10 >= this.A04.A03) {
            GI gi = this.A0D;
            GH gh = this.A04.A01;
            if (A0F[7].charAt(20) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "uyKFH8oWQ0ou8mdxvkWufQ8fbIwtl6Z0";
            strArr[1] = "5GODjm0a5UxNqoFNrNo0AvXndV19DDx4";
            gi.ADg(gh);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j10, ByteBuffer byteBuffer, int i10) {
        A03(j10);
        while (i10 > 0) {
            int remaining = (int) (this.A05.A03 - j10);
            int min = Math.min(i10, remaining);
            byte[] bArr = this.A05.A01.A01;
            int remaining2 = this.A05.A00(j10);
            byteBuffer.put(bArr, remaining2, min);
            i10 -= min;
            j10 += min;
            if (j10 == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j10, byte[] bArr, int i10) {
        A03(j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (this.A05.A03 - j10));
            byte[] bArr2 = this.A05.A01.A01;
            int toCopy = this.A05.A00(j10);
            int remaining = i10 - i11;
            System.arraycopy(bArr2, toCopy, bArr, remaining, min);
            i11 -= min;
            j10 += min;
            if (j10 == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
    
        if (r10 < r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(com.facebook.ads.redexgen.X.C1294Vn r20, com.facebook.ads.redexgen.X.C0856Ed r21) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UG.A07(com.facebook.ads.redexgen.X.Vn, com.facebook.ads.redexgen.X.Ed):void");
    }

    private void A08(C0858Ef c0858Ef) {
        if (!c0858Ef.A02) {
            return;
        }
        boolean z10 = this.A06.A02;
        GH[] ghArr = new GH[(z10 ? 1 : 0) + (((int) (this.A06.A04 - c0858Ef.A04)) / this.A0A)];
        for (int i10 = 0; i10 < ghArr.length; i10++) {
            ghArr[i10] = c0858Ef.A01;
            c0858Ef = c0858Ef.A01();
        }
        this.A0D.ADh(ghArr);
    }

    private final void A09(boolean z10) {
        this.A0C.A0H(z10);
        A08(this.A04);
        this.A04 = new C0858Ef(0L, this.A0A);
        C0858Ef c0858Ef = this.A04;
        this.A05 = c0858Ef;
        this.A06 = c0858Ef;
        this.A01 = 0L;
        this.A0D.AF3();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j10, boolean z10, boolean z11) {
        return this.A0C.A08(j10, z10, z11);
    }

    public final int A0E(C9L c9l, C1294Vn c1294Vn, boolean z10, boolean z11, long j10) {
        int A09 = this.A0C.A09(c9l, c1294Vn, z10, z11, this.A02, this.A0B);
        if (A09 == -5) {
            this.A02 = c9l.A00;
            return -5;
        }
        if (A09 != -4) {
            if (A09 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!c1294Vn.A04()) {
            long j11 = c1294Vn.A00;
            if (A0F[7].charAt(20) != 'U') {
                throw new RuntimeException();
            }
            A0F[2] = "VD6eroQucXdNz3MsoKHIT4kATW1JDfRN";
            if (j11 < j10) {
                c1294Vn.A00(Integer.MIN_VALUE);
            }
            if (c1294Vn.A0A()) {
                A07(c1294Vn, this.A0B);
            }
            int result = this.A0B.A00;
            c1294Vn.A09(result);
            long j12 = this.A0B.A01;
            ByteBuffer byteBuffer = c1294Vn.A01;
            int result2 = this.A0B.A00;
            A05(j12, byteBuffer, result2);
        }
        return -4;
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j10, boolean z10, boolean z11) {
        A04(this.A0C.A0D(j10, z10, z11));
    }

    public final void A0L(InterfaceC0859Eg interfaceC0859Eg) {
        this.A07 = interfaceC0859Eg;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0789Ba
    public final void A5T(Format format) {
        Format A01 = A01(format, this.A00);
        boolean formatChanged = this.A0C.A0K(A01);
        this.A03 = format;
        this.A08 = false;
        InterfaceC0859Eg interfaceC0859Eg = this.A07;
        if (interfaceC0859Eg != null && formatChanged) {
            interfaceC0859Eg.ACY(A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0789Ba
    public final int AE7(BP bp, int i10, boolean z10) throws IOException, InterruptedException {
        int read = bp.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        A02(read);
        if (A0F[4].length() == 13) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[0] = "gj56WjutkODHGuBsULoCjgk";
        strArr[5] = "cXoHIYif5j6YkS";
        return read;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0789Ba
    public final void AE8(HV hv, int i10) {
        while (i10 > 0) {
            int A00 = A00(i10);
            byte[] bArr = this.A06.A01.A01;
            int bytesAppended = this.A06.A00(this.A01);
            hv.A0c(bArr, bytesAppended, A00);
            i10 -= A00;
            A02(A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0789Ba
    public final void AE9(long j10, int i10, int i11, int i12, BZ bz) {
        if (this.A08) {
            A5T(this.A03);
        }
        if (this.A09) {
            if ((i10 & 1) == 0) {
                return;
            }
            C0857Ee c0857Ee = this.A0C;
            if (A0F[4].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "x9Xeu0fQ5laTPGHIgNPQILpO6czCAzIw";
            strArr[1] = "ozcoxAULLkb5oe9KcRf5sNeK93qRoKsz";
            if (!c0857Ee.A0J(j10)) {
                return;
            }
            String[] strArr2 = A0F;
            if (strArr2[0].length() == strArr2[5].length()) {
                throw new RuntimeException();
            }
            A0F[7] = "2aF6Rrv8pvM6dW2iEnwFUFag8sTvrLLb";
            this.A09 = false;
        }
        this.A0C.A0G(j10 + this.A00, i10, (this.A01 - i11) - i12, i11, bz);
    }
}
