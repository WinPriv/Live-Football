package com.huawei.openalliance.ad.ppskit.views;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final class p implements View.OnTouchListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ka.w f23525s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PPSFullScreenNotifyView f23526t;

    public p(PPSFullScreenNotifyView pPSFullScreenNotifyView, ka.w wVar) {
        this.f23526t = pPSFullScreenNotifyView;
        this.f23525s = wVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f23526t.H.b("2", this.f23525s);
            return true;
        }
        return true;
    }
}
