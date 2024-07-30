package com.huawei.openalliance.ad.ppskit.views;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.activity.PPSArActivity;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import ka.n7;

/* loaded from: classes2.dex */
public final class i implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSArView f23448s;

    public i(PPSArView pPSArView) {
        this.f23448s = pPSArView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PPSArView pPSArView = this.f23448s;
        if (pPSArView.E != null) {
            n7.e("PPSArView", "handleCloseAd");
            PPSArActivity pPSArActivity = (PPSArActivity) pPSArView.E;
            pPSArActivity.getClass();
            n7.b("PPSArActivity", "onClose");
            p2.a(new la.s(pPSArActivity), 0);
            pPSArActivity.finish();
        }
    }
}
