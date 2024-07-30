package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class I8 {

    @Nullable
    public final Handler A00;

    @Nullable
    public final I9 A01;

    public I8(@Nullable Handler handler, @Nullable I9 i92) {
        this.A00 = i92 != null ? (Handler) H6.A01(handler) : null;
        this.A01 = i92;
    }

    public final void A01(int i10, int i11, int i12, float f) {
        if (this.A01 != null) {
            this.A00.post(new I5(this, i10, i11, i12, f));
        }
    }

    public final void A02(int i10, long j10) {
        if (this.A01 != null) {
            this.A00.post(new I4(this, i10, j10));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new I6(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new I3(this, format));
        }
    }

    public final void A05(C0771Ai c0771Ai) {
        if (this.A01 != null) {
            this.A00.post(new I7(this, c0771Ai));
        }
    }

    public final void A06(C0771Ai c0771Ai) {
        if (this.A01 != null) {
            this.A00.post(new I1(this, c0771Ai));
        }
    }

    public final void A07(String str, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new I2(this, str, j10, j11));
        }
    }
}
