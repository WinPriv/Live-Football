package com.huawei.openalliance.ad.ppskit.views;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo;
import ka.eb;
import ka.ij;
import ka.n7;
import ka.oc;

/* loaded from: classes2.dex */
public final class l0 implements ij {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f23460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23461b;

    public l0(PPSRewardView pPSRewardView, boolean z10) {
        this.f23461b = pPSRewardView;
        this.f23460a = z10;
    }

    @Override // ka.ij
    public final void a() {
        PPSRewardView pPSRewardView = this.f23461b;
        AppDownloadButton appDownloadButton = pPSRewardView.Q.getAppDownloadButton();
        if (appDownloadButton != null) {
            appDownloadButton.setClickInfo(pPSRewardView.f23249e0.getClickInfo());
            appDownloadButton.setNeedShowConfirmDialog(false);
            appDownloadButton.setSource(16);
            appDownloadButton.performClick();
            pPSRewardView.b("128");
        }
        pPSRewardView.R(true);
    }

    @Override // ka.ij
    public final void b() {
        eb ebVar = PPSRewardView.T0;
        PPSRewardView pPSRewardView = this.f23461b;
        pPSRewardView.b("129");
        pPSRewardView.R(true);
    }

    @Override // ka.ij
    public final void c() {
        String str;
        int i10;
        boolean z10 = this.f23460a;
        n7.f("PPSRewardView", "popUpView, non button area clicked, is clickable: %s", Boolean.valueOf(z10));
        if (!z10) {
            return;
        }
        PPSRewardView pPSRewardView = this.f23461b;
        MaterialClickInfo clickInfo = pPSRewardView.f23249e0.getClickInfo();
        AdContentData adContentData = pPSRewardView.B.f35820b;
        if (adContentData != null) {
            str = adContentData.L();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            n7.e("PPSRewardView", "on download dialog clicked, landing page url is empty.");
            return;
        }
        pPSRewardView.b(true);
        pPSRewardView.f23253i0 = true;
        if (!pPSRewardView.f23255k0) {
            Long valueOf = Long.valueOf(pPSRewardView.B.h());
            MetaData g6 = pPSRewardView.B.g();
            if (g6 != null) {
                i10 = g6.d0();
            } else {
                i10 = 50;
            }
            pPSRewardView.K(valueOf, Integer.valueOf(i10), 1);
        }
        oc ocVar = pPSRewardView.y;
        if (ocVar != null) {
            ocVar.q(21, clickInfo);
        }
        pPSRewardView.R(false);
        pPSRewardView.z();
        pPSRewardView.F.setVisibility(8);
        pPSRewardView.E.setVisibility(8);
    }
}
