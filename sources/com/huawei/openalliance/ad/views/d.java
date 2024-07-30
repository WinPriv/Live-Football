package com.huawei.openalliance.ad.views;

import android.view.View;
import com.huawei.openalliance.ad.activity.ComplianceActivity;

/* loaded from: classes2.dex */
public final class d implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSBannerView f24136s;

    public d(PPSBannerView pPSBannerView) {
        this.f24136s = pPSBannerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PPSBannerView pPSBannerView = this.f24136s;
        com.huawei.openalliance.ad.inter.data.e eVar = pPSBannerView.M;
        if (eVar != null && (eVar instanceof com.huawei.openalliance.ad.inter.data.j)) {
            ComplianceActivity.m(pPSBannerView.getContext(), view, ((com.huawei.openalliance.ad.inter.data.j) eVar).m(), false);
        }
    }
}
