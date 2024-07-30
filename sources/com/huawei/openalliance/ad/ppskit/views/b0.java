package com.huawei.openalliance.ad.ppskit.views;

import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import ka.fj;

/* loaded from: classes2.dex */
public final class b0 implements fj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSRewardEndCardView f23393a;

    public b0(PPSRewardEndCardView pPSRewardEndCardView) {
        this.f23393a = pPSRewardEndCardView;
    }

    @Override // ka.fj
    public final void a(AppDownloadButton appDownloadButton) {
        String str;
        PPSRewardEndCardView pPSRewardEndCardView = this.f23393a;
        if (pPSRewardEndCardView.H != null) {
            if (AppStatus.INSTALLED == appDownloadButton.getStatus()) {
                str = "app";
            } else {
                str = "";
            }
            ((j0) pPSRewardEndCardView.H).a(str, pPSRewardEndCardView.E, true, true);
        }
    }

    @Override // ka.fj
    public final void b(AppDownloadButton appDownloadButton) {
        String str;
        PPSRewardEndCardView pPSRewardEndCardView = this.f23393a;
        if (pPSRewardEndCardView.H != null) {
            if (AppStatus.INSTALLED == appDownloadButton.getStatus()) {
                str = "app";
            } else {
                str = "";
            }
            ((j0) pPSRewardEndCardView.H).a(str, pPSRewardEndCardView.E, false, true);
        }
    }
}
