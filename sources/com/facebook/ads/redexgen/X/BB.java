package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.b;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class BB implements UH, UI {
    public static String[] A06 = {"xZ98n6jXZ", "w0wM6S1AW5kwd8mBaLXb8IJFUPLi1ZSY", "", "5GeP1Ey0MjdLLaKEOlMigJbDmIHcG3Ps", "Q5WYazqpabUa99ZYxsI", "Gm0HQrfOciURdkrLDtJ", "cUS8ttxVNiquYZeS", "9hpvQN9G3pxye3p4YcQpNMMd2GK"};
    public long A00;
    public long A01;
    public long A02;
    public UI A03;
    public UN[] A04 = new UN[0];
    public final UH A05;

    public BB(UH uh, boolean z10, long j10, long j11) {
        this.A05 = uh;
        this.A02 = z10 ? j10 : b.f7291b;
        this.A01 = j10;
        this.A00 = j11;
    }

    private C07479j A00(long j10, C07479j c07479j) {
        long toleranceBeforeUs = C0940Hl.A0E(c07479j.A01, 0L, j10 - this.A01);
        long j11 = c07479j.A00;
        long j12 = this.A00;
        long A0E = C0940Hl.A0E(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        if (toleranceBeforeUs == c07479j.A01 && A0E == c07479j.A00) {
            return c07479j;
        }
        return new C07479j(toleranceBeforeUs, A0E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0861Ei
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void AAJ(UH uh) {
        this.A03.AAJ(this);
    }

    public static boolean A02(long j10, GC[] gcArr) {
        if (j10 != 0) {
            for (GC gc2 : gcArr) {
                if (gc2 != null && !HO.A09(gc2.A7N().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != b.f7291b;
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final boolean A4A(long j10) {
        return this.A05.A4A(j10);
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final void A4p(long j10, boolean z10) {
        this.A05.A4p(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final long A5c(long j10, C07479j c07479j) {
        long j11 = this.A01;
        if (j10 == j11) {
            return j11;
        }
        return this.A05.A5c(j10, A00(j10, c07479j));
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final long A5r() {
        long A5r = this.A05.A5r();
        if (A5r != Long.MIN_VALUE) {
            long j10 = this.A00;
            if (j10 == Long.MIN_VALUE || A5r < j10) {
                return A5r;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final long A6z() {
        long A6z = this.A05.A6z();
        if (A6z != Long.MIN_VALUE) {
            long j10 = this.A00;
            if (j10 == Long.MIN_VALUE || A6z < j10) {
                return A6z;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final TrackGroupArray A7f() {
        return this.A05.A7f();
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final void A9S() throws IOException {
        this.A05.A9S();
    }

    @Override // com.facebook.ads.redexgen.X.UI
    public final void ABq(UH uh) {
        this.A03.ABq(this);
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final void AD9(UI ui, long j10) {
        this.A03 = ui;
        this.A05.AD9(this, j10);
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final long ADU() {
        if (A03()) {
            long j10 = this.A02;
            this.A02 = b.f7291b;
            long ADU = ADU();
            return ADU != b.f7291b ? ADU : j10;
        }
        long ADU2 = this.A05.ADU();
        String[] strArr = A06;
        if (strArr[7].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "JN4lYhgdVtJugUzGLO1";
        strArr2[4] = "V7PIoeFvQi5pkabjQnk";
        if (ADU2 == b.f7291b) {
            return b.f7291b;
        }
        boolean z10 = true;
        H6.A04(ADU2 >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && ADU2 > discontinuityUs) {
            z10 = false;
        }
        H6.A04(z10);
        return ADU2;
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final void ADb(long j10) {
        this.A05.ADb(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r5 > r3) goto L17;
     */
    @Override // com.facebook.ads.redexgen.X.UH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AEH(long r9) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A02 = r0
            com.facebook.ads.redexgen.X.UN[] r3 = r8.A04
            int r2 = r3.length
            r7 = 0
            r1 = 0
        Lc:
            if (r1 >= r2) goto L18
            r0 = r3[r1]
            if (r0 == 0) goto L15
            r0.A00()
        L15:
            int r1 = r1 + 1
            goto Lc
        L18:
            com.facebook.ads.redexgen.X.UH r0 = r8.A05
            long r5 = r0.AEH(r9)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L34
            long r1 = r8.A01
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L35
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L34
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L35
        L34:
            r7 = 1
        L35:
            com.facebook.ads.redexgen.X.H6.A04(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BB.AEH(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r7 > r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    @Override // com.facebook.ads.redexgen.X.UH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AEI(com.facebook.ads.redexgen.X.GC[] r16, boolean[] r17, com.facebook.ads.redexgen.X.InterfaceC0860Eh[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r4 = r18
            int r0 = r4.length
            com.facebook.ads.redexgen.X.UN[] r0 = new com.facebook.ads.redexgen.X.UN[r0]
            r15.A04 = r0
            int r0 = r4.length
            com.facebook.ads.redexgen.X.Eh[] r11 = new com.facebook.ads.redexgen.X.InterfaceC0860Eh[r0]
            r2 = 0
        Lb:
            int r0 = r4.length
            r3 = 0
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.UN[] r1 = r15.A04
            r0 = r4[r2]
            com.facebook.ads.redexgen.X.UN r0 = (com.facebook.ads.redexgen.X.UN) r0
            r1[r2] = r0
            r0 = r1[r2]
            if (r0 == 0) goto L1f
            r0 = r1[r2]
            com.facebook.ads.redexgen.X.Eh r3 = r0.A01
        L1f:
            r11[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L24:
            com.facebook.ads.redexgen.X.UH r8 = r15.A05
            r9 = r16
            r10 = r17
            r12 = r19
            r13 = r20
            long r7 = r8.AEI(r9, r10, r11, r12, r13)
            boolean r0 = r15.A03()
            if (r0 == 0) goto L92
            long r0 = r15.A01
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L92
            boolean r0 = A02(r0, r9)
            if (r0 == 0) goto L92
            r0 = r7
        L45:
            r15.A02 = r0
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 == 0) goto L5d
            long r1 = r15.A01
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L90
            long r1 = r15.A00
            r5 = -9223372036854775808
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L5d
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L90
        L5d:
            r0 = 1
        L5e:
            com.facebook.ads.redexgen.X.H6.A04(r0)
            r5 = 0
        L62:
            int r0 = r4.length
            if (r5 >= r0) goto L98
            r0 = r11[r5]
            if (r0 != 0) goto L76
            com.facebook.ads.redexgen.X.UN[] r0 = r15.A04
            r0[r5] = r3
        L6d:
            com.facebook.ads.redexgen.X.UN[] r0 = r15.A04
            r0 = r0[r5]
            r4[r5] = r0
            int r5 = r5 + 1
            goto L62
        L76:
            r0 = r4[r5]
            if (r0 == 0) goto L84
            com.facebook.ads.redexgen.X.UN[] r0 = r15.A04
            r0 = r0[r5]
            com.facebook.ads.redexgen.X.Eh r1 = r0.A01
            r0 = r11[r5]
            if (r1 == r0) goto L6d
        L84:
            com.facebook.ads.redexgen.X.UN[] r2 = r15.A04
            r1 = r11[r5]
            com.facebook.ads.redexgen.X.UN r0 = new com.facebook.ads.redexgen.X.UN
            r0.<init>(r15, r1)
            r2[r5] = r0
            goto L6d
        L90:
            r0 = 0
            goto L5e
        L92:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L45
        L98:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BB.AEI(com.facebook.ads.redexgen.X.GC[], boolean[], com.facebook.ads.redexgen.X.Eh[], boolean[], long):long");
    }
}
