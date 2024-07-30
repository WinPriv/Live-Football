package com.huawei.openalliance.ad.ppskit.views;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import ka.gc;

/* loaded from: classes2.dex */
public final class x implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSInterstitialView f23607s;

    public x(PPSInterstitialView pPSInterstitialView) {
        this.f23607s = pPSInterstitialView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PPSInterstitialView pPSInterstitialView = this.f23607s;
        if (pPSInterstitialView.R) {
            pPSInterstitialView.D.B.f();
        } else {
            pPSInterstitialView.D.B.E();
        }
        gc gcVar = pPSInterstitialView.T;
        if (gcVar != null) {
            androidx.activity.n.L(gcVar.f31213w, (ContentRecord) gcVar.f32660t, !pPSInterstitialView.R);
        }
    }
}
