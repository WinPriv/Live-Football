package com.huawei.openalliance.ad.views;

import android.view.View;

/* loaded from: classes2.dex */
public final class b implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSBannerView f24131s;

    public b(PPSBannerView pPSBannerView) {
        this.f24131s = pPSBannerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PPSBannerView pPSBannerView = this.f24131s;
        pPSBannerView.d(0, pPSBannerView.M, null);
        pPSBannerView.c(2, 0, pPSBannerView.m());
    }
}
