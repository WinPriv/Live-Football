package com.huawei.openalliance.ad.ppskit.views;

import com.huawei.openalliance.ad.ppskit.activity.InterstitialAdActivity;
import ka.n7;
import ka.wi;
import ka.xi;

/* loaded from: classes2.dex */
public final class v implements xi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSInterstitialView f23554a;

    public v(PPSInterstitialView pPSInterstitialView) {
        this.f23554a = pPSInterstitialView;
    }

    @Override // ka.xi
    public final void a(wi wiVar) {
        Integer num = wiVar.f32151e;
        if (num == null) {
            n7.g("PPSInterstitialView", "invalid click");
            return;
        }
        int intValue = num.intValue();
        n7.f("PPSInterstitialView", "action: %d", Integer.valueOf(intValue));
        if (intValue == 0) {
            int i10 = PPSInterstitialView.D0;
            PPSInterstitialView pPSInterstitialView = this.f23554a;
            pPSInterstitialView.getClass();
            boolean z10 = wiVar.f32148b;
            n7.f("PPSInterstitialView", "onClick, isAppRelated: %s, isHandled: %s, destination:%s", Boolean.valueOf(wiVar.f32147a), Boolean.valueOf(z10), wiVar.f32149c);
            va.a aVar = pPSInterstitialView.f23207v0;
            if (aVar != null) {
                ((InterstitialAdActivity) aVar).k(2, -1, -1);
            }
            pPSInterstitialView.F(1);
            if (z10) {
                pPSInterstitialView.x(1);
            } else {
                pPSInterstitialView.C(wiVar.f32150d);
            }
        }
    }
}
