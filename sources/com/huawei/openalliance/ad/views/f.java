package com.huawei.openalliance.ad.views;

import android.text.TextUtils;
import gb.r0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class f implements com.huawei.hms.ads.whythisad.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSBannerView f24140a;

    public f(PPSBannerView pPSBannerView) {
        this.f24140a = pPSBannerView;
    }

    @Override // com.huawei.hms.ads.whythisad.b
    public final void Code() {
        PPSBannerView pPSBannerView = this.f24140a;
        PPSNativeView pPSNativeView = pPSBannerView.f23786z;
        if (pPSNativeView != null) {
            pPSNativeView.setVisibility(8);
        }
        PPSNativeView pPSNativeView2 = pPSBannerView.A;
        if (pPSNativeView2 != null) {
            pPSNativeView2.setVisibility(8);
        }
    }

    @Override // com.huawei.hms.ads.whythisad.b
    public final List<String> I() {
        com.huawei.openalliance.ad.inter.data.e eVar = this.f24140a.M;
        if (eVar == null) {
            return null;
        }
        return eVar.l();
    }

    @Override // com.huawei.hms.ads.whythisad.b
    public final void V() {
        PPSBannerView pPSBannerView = this.f24140a;
        com.huawei.openalliance.ad.inter.data.e eVar = pPSBannerView.M;
        if (eVar instanceof com.huawei.openalliance.ad.inter.data.j) {
            com.huawei.openalliance.ad.inter.data.j jVar = (com.huawei.openalliance.ad.inter.data.j) eVar;
            String i10 = jVar.i();
            if (TextUtils.isEmpty(i10)) {
                i10 = jVar.h();
            }
            r0.l(pPSBannerView.getContext(), i10);
        }
    }

    @Override // com.huawei.hms.ads.whythisad.b
    public final void Code(String str) {
        PPSBannerView pPSBannerView = this.f24140a;
        PPSNativeView pPSNativeView = pPSBannerView.f23786z;
        if (pPSNativeView != null) {
            pPSNativeView.setVisibility(8);
        }
        PPSNativeView pPSNativeView2 = pPSBannerView.A;
        if (pPSNativeView2 != null) {
            pPSNativeView2.setVisibility(8);
        }
        ArrayList arrayList = new ArrayList();
        if (str == null || str.isEmpty()) {
            arrayList = null;
        } else {
            arrayList.add(str);
        }
        pPSBannerView.d(0, pPSBannerView.M, arrayList);
        pPSBannerView.c(2, 0, pPSBannerView.m());
    }
}
