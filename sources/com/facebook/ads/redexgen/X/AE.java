package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class AE {

    @Nullable
    public final Handler A00;

    @Nullable
    public final AF A01;

    public AE(@Nullable Handler handler, @Nullable AF af) {
        this.A00 = af != null ? (Handler) H6.A01(handler) : null;
        this.A01 = af;
    }

    public final void A01(int i10) {
        if (this.A01 != null) {
            this.A00.post(new AD(this, i10));
        }
    }

    public final void A02(int i10, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new AB(this, i10, j10, j11));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new AA(this, format));
        }
    }

    public final void A04(C0771Ai c0771Ai) {
        if (this.A01 != null) {
            this.A00.post(new AC(this, c0771Ai));
        }
    }

    public final void A05(C0771Ai c0771Ai) {
        if (this.A01 != null) {
            this.A00.post(new A8(this, c0771Ai));
        }
    }

    public final void A06(String str, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new A9(this, str, j10, j11));
        }
    }
}
