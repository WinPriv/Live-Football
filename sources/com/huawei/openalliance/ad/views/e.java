package com.huawei.openalliance.ad.views;

import android.text.TextUtils;
import android.view.View;
import gb.r0;

/* loaded from: classes2.dex */
public final class e implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSBannerView f24138s;

    public e(PPSBannerView pPSBannerView) {
        this.f24138s = pPSBannerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PPSBannerView pPSBannerView = this.f24138s;
        if (pPSBannerView.E != null) {
            PPSBannerView.l(pPSBannerView);
            pPSBannerView.E.V();
        } else {
            com.huawei.openalliance.ad.inter.data.e eVar = pPSBannerView.M;
            if ((eVar instanceof com.huawei.openalliance.ad.inter.data.j) && (eVar instanceof com.huawei.openalliance.ad.inter.data.j)) {
                com.huawei.openalliance.ad.inter.data.j jVar = (com.huawei.openalliance.ad.inter.data.j) eVar;
                String i10 = jVar.i();
                if (TextUtils.isEmpty(i10)) {
                    i10 = jVar.h();
                }
                r0.l(pPSBannerView.getContext(), i10);
            }
        }
        pPSBannerView.D.setVisibility(8);
    }
}
