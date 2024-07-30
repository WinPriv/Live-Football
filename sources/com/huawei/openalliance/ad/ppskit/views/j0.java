package com.huawei.openalliance.ad.ppskit.views;

import ka.eb;
import ka.n7;
import ka.wi;
import ka.yi;

/* loaded from: classes2.dex */
public final class j0 implements yi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23453b;

    public j0(PPSRewardView pPSRewardView, String str) {
        this.f23453b = pPSRewardView;
        this.f23452a = str;
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12) {
        AppDownloadButton appDownloadButton;
        n7.f("PPSRewardView", "onCardClick, isAppRelated: %s, isHanlded: %s, destination: %s, isButtonClicked: %s", Boolean.valueOf(z10), Boolean.valueOf(z11), str, Boolean.valueOf(z12));
        wi wiVar = new wi(z10, true, str, 20);
        PPSRewardView pPSRewardView = this.f23453b;
        if (!z10) {
            PPSRewardView.I(pPSRewardView, new wi(false, z11, str, 20));
        } else if ("app".equals(str)) {
            eb ebVar = PPSRewardView.T0;
            pPSRewardView.Q("4");
            PPSRewardView.I(pPSRewardView, wiVar);
            if (!z12 && (appDownloadButton = pPSRewardView.T.f23234z) != null) {
                appDownloadButton.performClick();
            }
        } else if (z12) {
            eb ebVar2 = PPSRewardView.T0;
            pPSRewardView.Q("3");
            PPSRewardView.I(pPSRewardView, wiVar);
        } else {
            PPSRewardView.I(pPSRewardView, wiVar);
            PPSRewardView.O(pPSRewardView, this.f23452a);
        }
        pPSRewardView.M0 = null;
    }
}
