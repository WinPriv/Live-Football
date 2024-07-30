package com.huawei.openalliance.ad.ppskit.views;

import android.view.View;

/* loaded from: classes2.dex */
public final class o implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ka.w f23522s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PPSFullScreenNotifyView f23523t;

    public o(PPSFullScreenNotifyView pPSFullScreenNotifyView, ka.w wVar) {
        this.f23523t = pPSFullScreenNotifyView;
        this.f23522s = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f23523t.H.b("0", this.f23522s);
    }
}
