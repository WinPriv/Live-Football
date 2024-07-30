package com.huawei.openalliance.ad.ppskit.views;

import ka.ij;
import ka.n7;
import ka.oc;
import ka.wi;
import ka.xi;

/* loaded from: classes2.dex */
public final class n0 implements ij, xi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23521a;

    public /* synthetic */ n0(PPSRewardView pPSRewardView) {
        this.f23521a = pPSRewardView;
    }

    @Override // ka.ij
    public void a() {
        PPSRewardView pPSRewardView = this.f23521a;
        AppDownloadButton appDownloadButton = pPSRewardView.Q.getAppDownloadButton();
        oc ocVar = pPSRewardView.y;
        if (ocVar != null) {
            ocVar.s("128");
        }
        if (appDownloadButton != null) {
            appDownloadButton.setClickInfo(pPSRewardView.f23251g0.getClickInfo());
            appDownloadButton.setSource(5);
            appDownloadButton.performClick();
        }
        pPSRewardView.f23251g0.b();
        pPSRewardView.f23251g0 = null;
        pPSRewardView.y0 = false;
    }

    @Override // ka.ij
    public void b() {
        PPSRewardView pPSRewardView = this.f23521a;
        oc ocVar = pPSRewardView.y;
        if (ocVar != null) {
            ocVar.s("129");
        }
        pPSRewardView.f23251g0.b();
        pPSRewardView.f23251g0 = null;
        pPSRewardView.y0 = false;
    }

    @Override // ka.xi
    public void a(wi wiVar) {
        Integer num = wiVar.f32151e;
        if (num == null) {
            n7.g("PPSRewardView", "invalid click");
            return;
        }
        int intValue = num.intValue();
        n7.f("PPSRewardView", "click action: %d", Integer.valueOf(intValue));
        PPSRewardView pPSRewardView = this.f23521a;
        if (intValue == 0) {
            PPSRewardView.I(pPSRewardView, wiVar);
        } else if (intValue == 1 && PPSRewardView.Z(pPSRewardView)) {
            pPSRewardView.O0 = true;
            PPSRewardView.a0(pPSRewardView);
        }
    }

    @Override // ka.ij
    public void c() {
    }
}
