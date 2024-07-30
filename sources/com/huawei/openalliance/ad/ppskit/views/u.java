package com.huawei.openalliance.ad.ppskit.views;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.utils.v;
import ka.n7;

/* loaded from: classes2.dex */
public final class u implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSInterstitialView f23551s;

    /* loaded from: classes2.dex */
    public class a implements v.d {
        public a() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
        public final void a() {
            PPSInterstitialView pPSInterstitialView = u.this.f23551s;
            pPSInterstitialView.f23190e0 = false;
            pPSInterstitialView.G(false);
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
        public final void b() {
            PPSInterstitialView pPSInterstitialView = u.this.f23551s;
            int i10 = PPSInterstitialView.D0;
            pPSInterstitialView.I();
        }
    }

    public u(PPSInterstitialView pPSInterstitialView) {
        this.f23551s = pPSInterstitialView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PPSInterstitialView pPSInterstitialView = this.f23551s;
        Dialog dialog = pPSInterstitialView.f23188c0;
        if (dialog != null && dialog.isShowing()) {
            pPSInterstitialView.f23188c0.dismiss();
        }
        n7.e("PPSInterstitialView", "pop up dialog");
        Resources resources = pPSInterstitialView.getResources();
        AlertDialog b10 = com.huawei.openalliance.ad.ppskit.utils.v.b(pPSInterstitialView.getContext(), "", resources.getString(R.string.hiad_consume_data_to_play_video_no_data_size), resources.getString(R.string.hiad_reward_close_dialog_continue), resources.getString(R.string.hiad_reward_close_dialog_close), new a());
        pPSInterstitialView.f23188c0 = b10;
        b10.setCancelable(false);
    }
}
