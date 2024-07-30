package com.huawei.openalliance.ad.ppskit.views;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import ka.n7;
import ka.oc;

/* loaded from: classes2.dex */
public final class w0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23583s;

    public w0(PPSRewardView pPSRewardView) {
        this.f23583s = pPSRewardView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n7.e("PPSRewardView", "unmuteSound");
        PPSRewardView pPSRewardView = this.f23583s;
        pPSRewardView.f23263s0 = false;
        RewardVideoView rewardVideoView = pPSRewardView.D;
        if (rewardVideoView != null) {
            rewardVideoView.H.f();
            oc ocVar = pPSRewardView.y;
            if (ocVar != null) {
                androidx.activity.n.L(ocVar.f31607v, (ContentRecord) ocVar.f32660t, false);
            }
        }
    }
}
