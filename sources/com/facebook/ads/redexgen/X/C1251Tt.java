package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Tt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1251Tt implements GL, InterfaceC0915Gm<Object> {
    public static String[] A0A = {"8v43OWLt8X4Ft8FSsUnUJEljk6O9jZtl", "gqJU9rJqtCXP9nVsCJhzhjWr3OTUONn5", "evi8lnvhIGFpGwxvrEQ2HxpF9HfAYNb4", "XM9iQGBoaLQIRrKYvs1BFwTGSVuWakLP", "oYKHkHYzGvwdV8VAJO5FvOndhShHo3uL", "GsOQXWL80Wqi8CBj4PFxcrgidstVbv5Z", "TfEJwESWFeUjyASkqvscuoRhiyKsiSGj", "R3GeLkF45fmp7DtCtFYf0NMS1ko1sZ3Y"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;

    @Nullable
    public final Handler A06;

    @Nullable
    public final GK A07;
    public final H9 A08;
    public final C0935Hg A09;

    public C1251Tt() {
        this(null, null, 1000000L, 2000, H9.A00);
    }

    public C1251Tt(@Nullable Handler handler, @Nullable GK gk, long j10, int i10, H9 h92) {
        this.A06 = handler;
        this.A07 = gk;
        this.A09 = new C0935Hg(i10);
        this.A08 = h92;
        this.A01 = j10;
    }

    private void A01(int i10, long j10, long j11) {
        Handler handler = this.A06;
        if (handler != null) {
            GK gk = this.A07;
            String[] strArr = A0A;
            if (strArr[3].charAt(14) == strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[3] = "mcMhHiKL1Hs40ZODL70g4thjgDTU4mJQ";
            strArr2[2] = "gdrxxP25NVrEqdTm0xFGwMteDAr0ERpE";
            if (gk != null) {
                handler.post(new GV(this, i10, j10, j11));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GL
    public final synchronized long A5l() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0915Gm
    public final synchronized void AAA(Object obj, int i10) {
        this.A02 += i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0915Gm
    public final synchronized void ACU(Object obj) {
        H6.A04(this.A00 > 0);
        long nowMs = this.A08.A57();
        int i10 = (int) (nowMs - this.A03);
        this.A05 += i10;
        this.A04 += this.A02;
        if (i10 > 0) {
            this.A09.A03((int) Math.sqrt(this.A02), (float) ((this.A02 * 8000) / i10));
            if (this.A05 >= 2000 || this.A04 >= 524288) {
                this.A01 = this.A09.A02(0.5f);
            }
        }
        A01(i10, this.A02, this.A01);
        int sampleElapsedTimeMs = this.A00 - 1;
        this.A00 = sampleElapsedTimeMs;
        if (sampleElapsedTimeMs > 0) {
            this.A03 = nowMs;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0915Gm
    public final synchronized void ACV(Object obj, GU gu) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A57();
        }
        this.A00++;
    }
}
