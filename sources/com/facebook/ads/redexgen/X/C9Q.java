package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;

/* renamed from: com.facebook.ads.redexgen.X.9Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9Q {
    public static String[] A0C = {"L0u3smBC6U6OaYtXppAd31iOC3v5Qhxz", "mD", "DMmTpdJrujAgbmCwwmXMokmpSOB8XVVu", "Fa0SCWKpXCwAFqaC3HE", "LFAAfAeIJjtENyizMXbJJCIXxkMYQ2BS", "EOXOixXcPNGoqbhwUMphXmxbz6TL9K", "ydRMenJrqCbsHYuDZ17G4nGASKkEf2si", "4zZeHgY0eMzISLpxtPc37pmrQXWGSxn"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C9O A04;
    public C9O A05;
    public C9O A06;
    public AbstractC07509n A07;
    public Object A08;
    public boolean A09;
    public final C07489l A0A = new C07489l();
    public final C07499m A0B = new C07499m();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C9P A02(int i10, long j10, long j11) {
        EK ek = new EK(i10, j11);
        this.A07.A09(ek.A02, this.A0A);
        int A04 = this.A0A.A04(j10);
        long A09 = A04 == -1 ? Long.MIN_VALUE : this.A0A.A09(A04);
        boolean A0A = A0A(ek, A09);
        return new C9P(ek, j10, A09, b.f7291b, A09 == Long.MIN_VALUE ? this.A0A.A07() : A09, A0A, A0B(ek, A0A));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Nullable
    private C9P A03(C9O c9o, long j10) {
        long j11;
        C9P c9p = c9o.A02;
        if (c9p.A06) {
            int A03 = this.A07.A03(c9p.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (A03 == -1) {
                return null;
            }
            int i10 = this.A07.A0A(A03, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j12 = c9p.A04.A03;
            if (this.A07.A0B(i10, this.A0B).A00 == A03) {
                Pair<Integer, Long> A08 = this.A07.A08(this.A0B, this.A0A, i10, b.f7291b, Math.max(0L, (c9o.A07() + c9p.A01) - j10));
                if (A08 == null) {
                    return null;
                }
                A03 = ((Integer) A08.first).intValue();
                j11 = ((Long) A08.second).longValue();
                if (c9o.A01 == null || !c9o.A01.A09.equals(obj)) {
                    j12 = this.A02;
                    this.A02 = j12 + 1;
                } else {
                    j12 = c9o.A01.A02.A04.A03;
                }
            } else {
                j11 = 0;
            }
            return A06(A07(A03, j11, j12), j11, j11);
        }
        EK ek = c9p.A04;
        this.A07.A09(ek.A02, this.A0A);
        if (ek.A01()) {
            int i11 = ek.A00;
            int A01 = this.A0A.A01(i11);
            if (A01 == -1) {
                return null;
            }
            int A032 = this.A0A.A03(i11, ek.A01);
            if (A032 >= A01) {
                return A02(ek.A02, c9p.A00, ek.A03);
            }
            if (this.A0A.A0E(i11, A032)) {
                return A01(ek.A02, i11, A032, c9p.A00, ek.A03);
            }
            return null;
        }
        long j13 = c9p.A02;
        if (A0C[6].charAt(23) != 'A') {
            throw new RuntimeException();
        }
        A0C[1] = "6G";
        if (j13 != Long.MIN_VALUE) {
            int A05 = this.A0A.A05(c9p.A02);
            if (A05 == -1) {
                return A02(ek.A02, c9p.A02, ek.A03);
            }
            int A02 = this.A0A.A02(A05);
            if (this.A0A.A0E(A05, A02)) {
                return A01(ek.A02, A05, A02, c9p.A02, ek.A03);
            }
            return null;
        }
        int A00 = this.A0A.A00();
        if (A00 == 0) {
            return null;
        }
        int i12 = A00 - 1;
        if (this.A0A.A09(i12) != Long.MIN_VALUE || this.A0A.A0D(i12)) {
            return null;
        }
        int A022 = this.A0A.A02(i12);
        if (!this.A0A.A0E(i12, A022)) {
            return null;
        }
        return A01(ek.A02, i12, A022, this.A0A.A07(), ek.A03);
    }

    private long A00(int i10) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0A(i10, this.A0A, true).A03;
        int holderWindowIndex = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A04(obj2)) != -1 && this.A07.A09(oldFrontPeriodIndex, this.A0A).A00 == holderWindowIndex) {
            return this.A03;
        }
        for (C9O A0E = A0E(); A0E != null; A0E = A0E.A01) {
            Object periodUid = A0E.A09;
            if (periodUid.equals(obj)) {
                return A0E.A02.A04.A03;
            }
        }
        for (C9O A0E2 = A0E(); A0E2 != null; A0E2 = A0E2.A01) {
            AbstractC07509n abstractC07509n = this.A07;
            Object periodUid2 = A0E2.A09;
            int A04 = abstractC07509n.A04(periodUid2);
            if (A04 != -1 && this.A07.A09(A04, this.A0A).A00 == holderWindowIndex) {
                return A0E2.A02.A04.A03;
            }
        }
        long j10 = this.A02;
        this.A02 = 1 + j10;
        return j10;
    }

    private C9P A01(int i10, int i11, int i12, long j10, long j11) {
        long j12;
        EK ek = new EK(i10, i11, i12, j11);
        boolean A0A = A0A(ek, Long.MIN_VALUE);
        boolean A0B = A0B(ek, A0A);
        long A0A2 = this.A07.A09(ek.A02, this.A0A).A0A(ek.A00, ek.A01);
        if (i12 == this.A0A.A02(i11)) {
            j12 = this.A0A.A06();
        } else {
            j12 = 0;
        }
        return new C9P(ek, j12, Long.MIN_VALUE, j10, A0A2, A0A, A0B);
    }

    private C9P A04(C9P c9p, EK ek) {
        long A07;
        long j10 = c9p.A03;
        long j11 = c9p.A02;
        boolean A0A = A0A(ek, j11);
        boolean A0B = A0B(ek, A0A);
        this.A07.A09(ek.A02, this.A0A);
        if (ek.A01()) {
            A07 = this.A0A.A0A(ek.A00, ek.A01);
        } else {
            if (A0C[2].charAt(30) != 'V') {
                throw new RuntimeException();
            }
            A0C[2] = "zTzAUiYM1BrQqeObFTyCKDEgqKKR2HVC";
            A07 = j11 == Long.MIN_VALUE ? this.A0A.A07() : j11;
        }
        return new C9P(ek, j10, j11, c9p.A00, A07, A0A, A0B);
    }

    private C9P A05(C9S c9s) {
        return A06(c9s.A04, c9s.A01, c9s.A02);
    }

    private C9P A06(EK ek, long j10, long j11) {
        this.A07.A09(ek.A02, this.A0A);
        if (ek.A01()) {
            if (!this.A0A.A0E(ek.A00, ek.A01)) {
                return null;
            }
            return A01(ek.A02, ek.A00, ek.A01, j10, ek.A03);
        }
        return A02(ek.A02, j11, ek.A03);
    }

    private EK A07(int i10, long j10, long j11) {
        this.A07.A09(i10, this.A0A);
        int A05 = this.A0A.A05(j10);
        if (A05 == -1) {
            return new EK(i10, j11);
        }
        return new EK(i10, A05, this.A0A.A02(A05), j11);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x001e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A08() {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.9O r3 = r11.A0E()
            r4 = 1
            if (r3 != 0) goto L8
            return r4
        L8:
            com.facebook.ads.redexgen.X.9n r5 = r11.A07
            com.facebook.ads.redexgen.X.9P r0 = r3.A02
            com.facebook.ads.redexgen.X.EK r0 = r0.A04
            int r6 = r0.A02
            com.facebook.ads.redexgen.X.9l r7 = r11.A0A
            com.facebook.ads.redexgen.X.9m r8 = r11.A0B
            int r9 = r11.A01
            boolean r10 = r11.A09
            int r1 = r5.A03(r6, r7, r8, r9, r10)
        L1c:
            com.facebook.ads.redexgen.X.9O r0 = r3.A01
            if (r0 == 0) goto L29
            com.facebook.ads.redexgen.X.9P r0 = r3.A02
            boolean r0 = r0.A06
            if (r0 != 0) goto L29
            com.facebook.ads.redexgen.X.9O r3 = r3.A01
            goto L1c
        L29:
            r0 = -1
            if (r1 == r0) goto L3a
            com.facebook.ads.redexgen.X.9O r0 = r3.A01
            if (r0 == 0) goto L3a
            com.facebook.ads.redexgen.X.9O r0 = r3.A01
            com.facebook.ads.redexgen.X.9P r0 = r0.A02
            com.facebook.ads.redexgen.X.EK r0 = r0.A04
            int r0 = r0.A02
            if (r0 == r1) goto L63
        L3a:
            boolean r2 = r11.A0S(r3)
            com.facebook.ads.redexgen.X.9P r1 = r3.A02
            com.facebook.ads.redexgen.X.9P r0 = r3.A02
            com.facebook.ads.redexgen.X.EK r0 = r0.A04
            com.facebook.ads.redexgen.X.9P r0 = r11.A04(r1, r0)
            r3.A02 = r0
            if (r2 == 0) goto L74
            boolean r3 = r11.A0P()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C9Q.A0C
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 31
            if (r1 == r0) goto L66
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L63:
            com.facebook.ads.redexgen.X.9O r3 = r3.A01
            goto L8
        L66:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C9Q.A0C
            java.lang.String r1 = "GuDKwHudSgXHMcEdzJg"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "TrxgVcYEVqGsLQMDNrMk5TDxlvQhmk"
            r0 = 5
            r2[r0] = r1
            if (r3 != 0) goto L75
        L74:
            return r4
        L75:
            r4 = 0
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C9Q.A08():boolean");
    }

    private boolean A09(C9O c9o, C9P c9p) {
        C9P c9p2 = c9o.A02;
        return c9p2.A03 == c9p.A03 && c9p2.A02 == c9p.A02 && c9p2.A04.equals(c9p.A04);
    }

    private boolean A0A(EK ek, long j10) {
        int adGroupCount = this.A07.A09(ek.A02, this.A0A).A00();
        if (adGroupCount == 0) {
            return true;
        }
        int i10 = adGroupCount - 1;
        boolean A01 = ek.A01();
        if (this.A0A.A09(i10) != Long.MIN_VALUE) {
            return !A01 && j10 == Long.MIN_VALUE;
        }
        int lastAdGroupIndex = this.A0A.A01(i10);
        if (lastAdGroupIndex == -1) {
            return false;
        }
        if (((A01 && ek.A00 == i10 && ek.A01 == lastAdGroupIndex + (-1)) ? 1 : 0) == 0) {
            return !A01 && this.A0A.A02(i10) == lastAdGroupIndex;
        }
        return true;
    }

    private boolean A0B(EK ek, boolean z10) {
        return !this.A07.A0B(this.A07.A09(ek.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(ek.A02, this.A0A, this.A0B, this.A01, this.A09) && z10;
    }

    public final C9O A0C() {
        C9O c9o = this.A05;
        if (c9o != null) {
            if (c9o == this.A06) {
                this.A06 = c9o.A01;
            }
            this.A05.A0D();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            this.A05 = this.A05.A01;
        } else {
            C9O c9o2 = this.A04;
            this.A05 = c9o2;
            this.A06 = c9o2;
        }
        return this.A05;
    }

    public final C9O A0D() {
        C9O c9o = this.A06;
        H6.A04((c9o == null || c9o.A01 == null) ? false : true);
        if (A0C[7].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "7koWfuH1ta1EVLUWQFGgmnLKJoN2uwxl";
        strArr[0] = "1LlHzPavDhI1SmiN1gPMgWkfsuEkohyV";
        this.A06 = this.A06.A01;
        return this.A06;
    }

    public final C9O A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final C9O A0F() {
        return this.A04;
    }

    public final C9O A0G() {
        return this.A05;
    }

    public final C9O A0H() {
        return this.A06;
    }

    @Nullable
    public final C9P A0I(long j10, C9S c9s) {
        C9O c9o = this.A04;
        if (c9o == null) {
            return A05(c9s);
        }
        return A03(c9o, j10);
    }

    public final C9P A0J(C9P c9p, int i10) {
        return A04(c9p, c9p.A04.A00(i10));
    }

    public final UH A0K(InterfaceC07449g[] interfaceC07449gArr, GF gf, GI gi, EM em, Object obj, C9P c9p) {
        long A07;
        C9O c9o = this.A04;
        if (c9o != null) {
            A07 = c9o.A07() + this.A04.A02.A01;
        } else {
            A07 = c9p.A03;
        }
        C9O c9o2 = new C9O(interfaceC07449gArr, A07, gf, gi, em, obj, c9p);
        if (this.A04 != null) {
            H6.A04(A0P());
            this.A04.A01 = c9o2;
        }
        this.A08 = null;
        this.A04 = c9o2;
        this.A00++;
        return c9o2.A08;
    }

    public final EK A0L(int i10, long j10) {
        return A07(i10, j10, A00(i10));
    }

    public final void A0M(long j10) {
        C9O c9o = this.A04;
        if (c9o != null) {
            c9o.A0G(j10);
        }
    }

    public final void A0N(AbstractC07509n abstractC07509n) {
        this.A07 = abstractC07509n;
    }

    public final void A0O(boolean z10) {
        C9O A0E = A0E();
        if (A0E != null) {
            this.A08 = z10 ? A0E.A09 : null;
            this.A03 = A0E.A02.A04.A03;
            A0E.A0D();
            A0S(A0E);
        } else if (!z10) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0P() {
        return this.A05 != null;
    }

    public final boolean A0Q() {
        C9O c9o = this.A04;
        return c9o == null || (!c9o.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != b.f7291b && this.A00 < 100);
    }

    public final boolean A0R(int i10) {
        this.A01 = i10;
        return A08();
    }

    public final boolean A0S(C9O c9o) {
        H6.A04(c9o != null);
        boolean z10 = false;
        this.A04 = c9o;
        while (c9o.A01 != null) {
            c9o = c9o.A01;
            if (c9o == this.A06) {
                this.A06 = this.A05;
                z10 = true;
            }
            c9o.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z10;
    }

    public final boolean A0T(UH uh) {
        C9O c9o = this.A04;
        return c9o != null && c9o.A08 == uh;
    }

    public final boolean A0U(EK ek, long j10) {
        int i10 = ek.A02;
        C9O c9o = null;
        for (C9O periodHolder = A0E(); periodHolder != null; periodHolder = periodHolder.A01) {
            if (c9o == null) {
                periodHolder.A02 = A0J(periodHolder.A02, i10);
            } else {
                if (i10 != -1) {
                    Object obj = periodHolder.A09;
                    if (A0C[2].charAt(30) != 'V') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0C;
                    strArr[4] = "cRCq0i1JCmFgPvSHr0NI30IAvGtOkPUO";
                    strArr[0] = "aqPjT6JpLbsnsfh6iIpVbm4IivKwupA2";
                    if (obj.equals(this.A07.A0A(i10, this.A0A, true).A03)) {
                        C9P A03 = A03(c9o, j10);
                        if (A03 == null) {
                            return true ^ A0S(c9o);
                        }
                        periodHolder.A02 = A0J(periodHolder.A02, i10);
                        if (!A09(periodHolder, A03)) {
                            return true ^ A0S(c9o);
                        }
                    }
                }
                return true ^ A0S(c9o);
            }
            if (periodHolder.A02.A06) {
                i10 = this.A07.A03(i10, this.A0A, this.A0B, this.A01, this.A09);
            }
            c9o = periodHolder;
        }
        return true;
    }

    public final boolean A0V(boolean z10) {
        this.A09 = z10;
        return A08();
    }
}
