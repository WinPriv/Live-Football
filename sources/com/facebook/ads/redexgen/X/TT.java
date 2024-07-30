package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: assets/audience_network.dex */
public final class TT implements HJ {
    public final Handler A00;

    public TT(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final Looper A6t() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final Message A9e(int i10, int i11, int i12) {
        return this.A00.obtainMessage(i10, i11, i12);
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final Message A9f(int i10, int i11, int i12, Object obj) {
        return this.A00.obtainMessage(i10, i11, i12, obj);
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final Message A9g(int i10, Object obj) {
        return this.A00.obtainMessage(i10, obj);
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final void ADp(int i10) {
        this.A00.removeMessages(i10);
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final boolean AEJ(int i10) {
        return this.A00.sendEmptyMessage(i10);
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final boolean AEK(int i10, long j10) {
        return this.A00.sendEmptyMessageAtTime(i10, j10);
    }
}
