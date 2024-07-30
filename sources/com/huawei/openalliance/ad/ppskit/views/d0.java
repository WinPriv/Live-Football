package com.huawei.openalliance.ad.ppskit.views;

import android.view.View;
import ka.ij;

/* loaded from: classes2.dex */
public final class d0 implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSRewardPopUpView f23414s;

    public d0(PPSRewardPopUpView pPSRewardPopUpView) {
        this.f23414s = pPSRewardPopUpView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ij ijVar = this.f23414s.B;
        if (ijVar != null) {
            ijVar.c();
        }
    }
}
