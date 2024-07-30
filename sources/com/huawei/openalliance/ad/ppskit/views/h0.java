package com.huawei.openalliance.ad.ppskit.views;

import com.huawei.openalliance.ad.ppskit.inter.data.RewardEvent;
import ka.n7;

/* loaded from: classes2.dex */
public final class h0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RewardEvent f23440s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23441t;

    public h0(PPSRewardView pPSRewardView, RewardEvent rewardEvent) {
        this.f23441t = pPSRewardView;
        this.f23440s = rewardEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder sb2 = new StringBuilder("onEvent:");
        RewardEvent rewardEvent = this.f23440s;
        sb2.append(rewardEvent.a());
        n7.e("PPSRewardView", sb2.toString());
        if (RewardEvent.CLOSE == rewardEvent) {
            PPSRewardView.P(this.f23441t, false);
        }
    }
}
