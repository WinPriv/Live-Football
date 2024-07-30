package com.huawei.openalliance.ad.ppskit.views;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final class q implements View.OnTouchListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ka.w f23528s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PPSFullScreenNotifyView f23529t;

    public q(PPSFullScreenNotifyView pPSFullScreenNotifyView, ka.w wVar) {
        this.f23529t = pPSFullScreenNotifyView;
        this.f23528s = wVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f23529t.H.b("2", this.f23528s);
            return true;
        }
        return true;
    }
}
