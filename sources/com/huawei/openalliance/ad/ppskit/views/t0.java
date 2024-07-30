package com.huawei.openalliance.ad.ppskit.views;

import android.app.AlertDialog;
import android.content.res.Resources;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.views.PPSRewardView;
import ka.n7;

/* loaded from: classes2.dex */
public final class t0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23550s;

    public t0(PPSRewardView pPSRewardView) {
        this.f23550s = pPSRewardView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PPSRewardView pPSRewardView = this.f23550s;
        if (PPSRewardView.L(pPSRewardView, pPSRewardView.P)) {
            n7.b("PPSRewardView", "NonWifiDialog already shown.");
            return;
        }
        n7.e("PPSRewardView", "pop up dialog");
        Resources resources = pPSRewardView.getResources();
        AlertDialog b10 = com.huawei.openalliance.ad.ppskit.utils.v.b(pPSRewardView.getContext(), "", resources.getString(R.string.hiad_consume_data_to_play_video_no_data_size), resources.getString(R.string.hiad_reward_close_dialog_continue), resources.getString(R.string.hiad_reward_close_dialog_close), new PPSRewardView.o(pPSRewardView));
        pPSRewardView.P = b10;
        b10.setCancelable(false);
    }
}
