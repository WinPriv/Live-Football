package com.huawei.openalliance.ad.ppskit.views;

import android.view.View;
import ka.yi;

/* loaded from: classes2.dex */
public final class a0 implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSRewardEndCardView f23390s;

    public a0(PPSRewardEndCardView pPSRewardEndCardView) {
        this.f23390s = pPSRewardEndCardView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        PPSRewardEndCardView pPSRewardEndCardView = this.f23390s;
        yi yiVar = pPSRewardEndCardView.H;
        if (yiVar != null) {
            if (pPSRewardEndCardView.J == 9) {
                str = com.huawei.openalliance.ad.constant.v.I;
            } else {
                str = com.huawei.openalliance.ad.constant.v.B;
            }
            ((j0) yiVar).a(str, false, false, false);
        }
    }
}
