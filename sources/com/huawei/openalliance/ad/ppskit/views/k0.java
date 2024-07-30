package com.huawei.openalliance.ad.ppskit.views;

import android.view.MotionEvent;
import android.view.View;
import ka.n7;

/* loaded from: classes2.dex */
public final class k0 implements View.OnTouchListener {

    /* renamed from: s, reason: collision with root package name */
    public float f23455s;

    /* renamed from: t, reason: collision with root package name */
    public float f23456t;

    /* renamed from: u, reason: collision with root package name */
    public float f23457u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23458v;

    public k0(PPSRewardView pPSRewardView) {
        this.f23458v = pPSRewardView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction() & com.anythink.expressad.exoplayer.k.p.f9095b;
        if (action == 0) {
            this.f23455s = motionEvent.getX();
            this.f23456t = motionEvent.getY();
        }
        if (action == 1) {
            this.f23457u = Math.abs(motionEvent.getX() - this.f23455s);
            float abs = Math.abs(motionEvent.getY() - this.f23456t);
            if (this.f23457u < 30.0f && abs < 30.0f) {
                n7.e("PPSRewardView", "click action");
                PPSRewardView pPSRewardView = this.f23458v;
                if (!pPSRewardView.f23256l0 && PPSRewardView.Z(pPSRewardView)) {
                    PPSRewardView.a0(pPSRewardView);
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
