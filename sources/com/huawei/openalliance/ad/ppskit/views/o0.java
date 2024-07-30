package com.huawei.openalliance.ad.ppskit.views;

import android.content.DialogInterface;
import ka.oc;

/* loaded from: classes2.dex */
public final class o0 implements DialogInterface.OnCancelListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23524s;

    public o0(PPSRewardView pPSRewardView) {
        this.f23524s = pPSRewardView;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        PPSRewardView pPSRewardView = this.f23524s;
        pPSRewardView.y0 = false;
        pPSRewardView.f23251g0 = null;
        oc ocVar = pPSRewardView.y;
        if (ocVar != null) {
            ocVar.s("130");
        }
    }
}
