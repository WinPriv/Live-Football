package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: TimePickerView.java */
/* loaded from: classes2.dex */
public final class e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f21234s;

    public e(TimePickerView timePickerView) {
        this.f21234s = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i10 = TimePickerView.J;
        this.f21234s.getClass();
        return false;
    }
}
