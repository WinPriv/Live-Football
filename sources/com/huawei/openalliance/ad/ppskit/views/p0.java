package com.huawei.openalliance.ad.ppskit.views;

/* loaded from: classes2.dex */
public final class p0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23527s;

    public p0(PPSRewardView pPSRewardView) {
        this.f23527s = pPSRewardView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PPSAppDetailView pPSAppDetailView;
        int i10;
        PPSRewardView pPSRewardView = this.f23527s;
        if (pPSRewardView.f23260p0 && "4".equals(pPSRewardView.C.f1())) {
            pPSAppDetailView = pPSRewardView.Q;
            i10 = 8;
        } else {
            pPSAppDetailView = pPSRewardView.Q;
            i10 = 0;
        }
        pPSAppDetailView.setVisibility(i10);
    }
}
