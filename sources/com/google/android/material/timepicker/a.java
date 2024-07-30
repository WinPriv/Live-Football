package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: ClockFaceView.java */
/* loaded from: classes2.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f21230s;

    public a(ClockFaceView clockFaceView) {
        this.f21230s = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f21230s;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.L.f21225v) - clockFaceView.T;
        if (height != clockFaceView.J) {
            clockFaceView.J = height;
            clockFaceView.p();
            int i10 = clockFaceView.J;
            ClockHandView clockHandView = clockFaceView.L;
            clockHandView.D = i10;
            clockHandView.invalidate();
        }
        return true;
    }
}
