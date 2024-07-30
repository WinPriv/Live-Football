package com.huawei.openalliance.ad.ppskit.views;

import android.app.AlertDialog;
import android.app.Dialog;
import com.huawei.openalliance.ad.ppskit.views.linkscroll.LinkScrollWebView;
import ka.n7;

/* loaded from: classes2.dex */
public final class g0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23428s;

    public g0(PPSRewardView pPSRewardView) {
        this.f23428s = pPSRewardView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PPSRewardPopUpView pPSRewardPopUpView;
        LinkScrollWebView linkScrollWebView;
        n7.e("PPSRewardView", "destroyView");
        PPSRewardView pPSRewardView = this.f23428s;
        ua.b bVar = pPSRewardView.B;
        if (bVar != null && bVar.i() != null) {
            sa.b.q().u(pPSRewardView.B.i(), pPSRewardView.R0);
        }
        RewardVideoView rewardVideoView = pPSRewardView.D;
        if (rewardVideoView != null) {
            rewardVideoView.H.b();
            RewardVideoView rewardVideoView2 = pPSRewardView.D;
            rewardVideoView2.getClass();
            n7.e("RewardVideoView", "destroyView");
            rewardVideoView2.f23328f0 = false;
            rewardVideoView2.H.l();
        }
        PPSRewardWebView pPSRewardWebView = pPSRewardView.N;
        if (pPSRewardWebView != null && (linkScrollWebView = pPSRewardWebView.f23296t) != null) {
            linkScrollWebView.destroy();
        }
        Dialog dialog = pPSRewardView.O;
        if (dialog != null) {
            if (dialog.isShowing()) {
                pPSRewardView.O.dismiss();
            }
            pPSRewardView.O = null;
        }
        AlertDialog alertDialog = pPSRewardView.M;
        if (alertDialog != null) {
            if (alertDialog.isShowing() && (pPSRewardPopUpView = pPSRewardView.f23249e0) != null) {
                pPSRewardPopUpView.b();
            }
            pPSRewardView.M = null;
        }
        PPSRewardView.T0.d();
    }
}
