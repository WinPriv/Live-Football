package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.hamkho.livefoot.R;
import o0.g;

/* compiled from: ClockFaceView.java */
/* loaded from: classes2.dex */
public final class b extends n0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f21231d;

    public b(ClockFaceView clockFaceView) {
        this.f21231d = clockFaceView;
    }

    @Override // n0.a
    public final void d(View view, g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f33037a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter(this.f21231d.P.get(intValue - 1));
        }
        gVar.g(g.c.a(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        gVar.b(g.a.f33524e);
    }

    @Override // n0.a
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f21231d;
            view.getHitRect(clockFaceView.M);
            float centerX = clockFaceView.M.centerX();
            float centerY = clockFaceView.M.centerY();
            clockFaceView.L.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.L.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i10, bundle);
    }
}
