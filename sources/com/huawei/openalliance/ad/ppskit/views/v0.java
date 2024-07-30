package com.huawei.openalliance.ad.ppskit.views;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import ka.n7;
import ka.oc;

/* loaded from: classes2.dex */
public final class v0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23555s;

    public v0(PPSRewardView pPSRewardView) {
        this.f23555s = pPSRewardView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n7.e("PPSRewardView", "muteSound");
        PPSRewardView pPSRewardView = this.f23555s;
        pPSRewardView.f23263s0 = true;
        RewardVideoView rewardVideoView = pPSRewardView.D;
        if (rewardVideoView != null) {
            rewardVideoView.H.E();
            oc ocVar = pPSRewardView.y;
            if (ocVar != null) {
                androidx.activity.n.L(ocVar.f31607v, (ContentRecord) ocVar.f32660t, true);
            }
        }
    }
}
