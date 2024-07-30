package com.huawei.openalliance.ad.ppskit.views;

import java.util.Iterator;
import ka.k9;
import ka.n7;

/* loaded from: classes2.dex */
public final class z0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RewardVideoView f23616s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f23617t = -2;

    public z0(RewardVideoView rewardVideoView) {
        this.f23616s = rewardVideoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RewardVideoView rewardVideoView = this.f23616s;
        rewardVideoView.B = true;
        n7.e("RewardMediaView", "show error");
        Iterator it = rewardVideoView.f23323z.iterator();
        while (it.hasNext()) {
            ((k9) it.next()).f(0, rewardVideoView.C, this.f23617t, -1);
        }
    }
}
