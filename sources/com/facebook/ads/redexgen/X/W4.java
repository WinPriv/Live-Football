package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W4 implements HM {
    public static byte[] A04;

    @Nullable
    public W1 A00;

    @Nullable
    public HM A01;
    public final AnonymousClass95 A02;
    public final TV A03;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{95, 103, 126, 102, 123, 98, 126, 119, 50, 96, 119, 124, 118, 119, 96, 119, 96, 50, Ascii.DEL, 119, 118, 123, 115, 50, 113, 126, 125, 113, 121, 97, 50, 119, 124, 115, 112, 126, 119, 118, 60};
    }

    public W4(AnonymousClass95 anonymousClass95, H9 h92) {
        this.A02 = anonymousClass95;
        this.A03 = new TV(h92);
    }

    private void A01() {
        this.A03.A02(this.A01.A7F());
        C9T A7C = this.A01.A7C();
        if (!A7C.equals(this.A03.A7C())) {
            this.A03.AEX(A7C);
            this.A02.ABi(A7C);
        }
    }

    private boolean A03() {
        W1 w12 = this.A00;
        return (w12 == null || w12.A8P() || (!this.A00.A8Z() && this.A00.A82())) ? false : true;
    }

    public final long A04() {
        if (A03()) {
            A01();
            return this.A01.A7F();
        }
        return this.A03.A7F();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j10) {
        this.A03.A02(j10);
    }

    public final void A08(W1 w12) {
        if (w12 == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(W1 w12) throws AnonymousClass98 {
        HM rendererMediaClock;
        HM A6u = w12.A6u();
        if (A6u != null && A6u != (rendererMediaClock = this.A01)) {
            if (rendererMediaClock == null) {
                this.A01 = A6u;
                this.A00 = w12;
                this.A01.AEX(this.A03.A7C());
                A01();
                return;
            }
            throw AnonymousClass98.A02(new IllegalStateException(A00(0, 39, 41)));
        }
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final C9T A7C() {
        HM hm = this.A01;
        if (hm != null) {
            return hm.A7C();
        }
        return this.A03.A7C();
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final long A7F() {
        if (A03()) {
            return this.A01.A7F();
        }
        return this.A03.A7F();
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final C9T AEX(C9T c9t) {
        HM hm = this.A01;
        if (hm != null) {
            c9t = hm.AEX(c9t);
        }
        this.A03.AEX(c9t);
        this.A02.ABi(c9t);
        return c9t;
    }
}
