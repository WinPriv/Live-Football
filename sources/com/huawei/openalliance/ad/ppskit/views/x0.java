package com.huawei.openalliance.ad.ppskit.views;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.views.linkscroll.LinkScrollWebView;

/* loaded from: classes2.dex */
public final class x0 implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSWebView f23608s;

    public x0(PPSWebView pPSWebView) {
        this.f23608s = pPSWebView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PPSWebView pPSWebView = this.f23608s;
        View view2 = pPSWebView.A;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        LinkScrollWebView linkScrollWebView = pPSWebView.f23296t;
        if (linkScrollWebView != null) {
            linkScrollWebView.setVisibility(0);
        }
        pPSWebView.q();
    }
}
