package com.huawei.openalliance.ad.views;

import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fs;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import gb.r0;

/* loaded from: classes2.dex */
public final class m implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdContentData f24148s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PPSWLSView f24149t;

    public m(PPSWLSView pPSWLSView, AdContentData adContentData) {
        this.f24149t = pPSWLSView;
        this.f24148s = adContentData;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PPSLinkedView ppsLinkedView;
        PPSLinkedView ppsLinkedView2;
        if (ex.Code()) {
            ex.Code("PPSWLSView", "choiceView onclick");
        }
        PPSWLSView pPSWLSView = this.f24149t;
        View.OnClickListener onClickListener = pPSWLSView.f24025z;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            return;
        }
        AdContentData adContentData = this.f24148s;
        String j10 = gb.p.j(adContentData.l0());
        if (TextUtils.isEmpty(j10)) {
            j10 = gb.p.j(adContentData.k0());
        }
        if (r0.l(pPSWLSView.getContext(), j10)) {
            fs fsVar = pPSWLSView.f24022v;
            if (fsVar != null) {
                fsVar.B();
            }
            ppsLinkedView = pPSWLSView.getPpsLinkedView();
            if (ppsLinkedView != null) {
                ppsLinkedView2 = pPSWLSView.getPpsLinkedView();
                ppsLinkedView2.getClass();
                ex.Code("PPSLinkedView", "reportSplashAdShowEvent. ");
                System.currentTimeMillis();
                ex.Code("PPSLinkedView", "reportAdShowEvent. ");
            }
        }
    }
}
