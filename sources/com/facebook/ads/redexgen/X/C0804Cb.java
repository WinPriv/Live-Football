package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Cb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0804Cb {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final CU A05;
    public final HU A06 = new HU(new byte[64]);
    public final C0936Hh A07;

    public C0804Cb(CU cu, C0936Hh c0936Hh) {
        this.A05 = cu;
        this.A07 = c0936Hh;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            this.A06.A08(1);
            long pts = this.A06.A04(15) << 15;
            long A04 = (this.A06.A04(3) << 30) | pts;
            this.A06.A08(1);
            long pts2 = this.A06.A04(15);
            long j10 = A04 | pts2;
            this.A06.A08(1);
            if (!this.A04 && this.A02) {
                this.A06.A08(4);
                long pts3 = this.A06.A04(3);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A07.A07((pts3 << 30) | (this.A06.A04(15) << 15) | this.A06.A04(15));
                this.A04 = true;
            }
            this.A01 = this.A07.A07(j10);
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AEC();
    }

    public final void A03(HV hv) throws C9R {
        hv.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        hv.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.ACy(this.A01, true);
        this.A05.A48(hv);
        this.A05.ACx();
    }
}
