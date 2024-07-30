package com.huawei.openalliance.ad.ppskit.views;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import ka.n7;

/* loaded from: classes2.dex */
public final class f0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23426s;

    public f0(PPSRewardView pPSRewardView) {
        this.f23426s = pPSRewardView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContentRecord contentRecord;
        n7.e("PPSRewardView", "stopView");
        PPSRewardView pPSRewardView = this.f23426s;
        if (pPSRewardView.N != null && (contentRecord = pPSRewardView.C) != null && pPSRewardView.f23261q0 && a0.a.D0(contentRecord.s3())) {
            pPSRewardView.N.p();
        }
    }
}
