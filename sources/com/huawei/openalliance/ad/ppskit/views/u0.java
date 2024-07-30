package com.huawei.openalliance.ad.ppskit.views;

import ka.n7;
import ka.oc;

/* loaded from: classes2.dex */
public final class u0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23553s;

    public u0(PPSRewardView pPSRewardView) {
        this.f23553s = pPSRewardView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n7.e("PPSRewardView", "onClose");
        oc ocVar = this.f23553s.y;
    }
}
