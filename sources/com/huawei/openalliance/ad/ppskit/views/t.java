package com.huawei.openalliance.ad.ppskit.views;

import android.os.CountDownTimer;
import ka.n7;

/* loaded from: classes2.dex */
public final class t extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSInterstitialView f23549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(PPSInterstitialView pPSInterstitialView, long j10) {
        super(j10, 500L);
        this.f23549a = pPSInterstitialView;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        PPSInterstitialView pPSInterstitialView = this.f23549a;
        pPSInterstitialView.Q.setVisibility(8);
        pPSInterstitialView.K.setVisibility(0);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        int i10 = (int) (j10 / 1000);
        int i11 = PPSInterstitialView.D0;
        this.f23549a.t(i10 + 1, false);
        n7.c("PPSInterstitialView", "count down time: %d seconds: %d", Long.valueOf(j10), Integer.valueOf(i10));
    }
}
