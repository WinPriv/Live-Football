package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: TimePickerView.java */
/* loaded from: classes2.dex */
public final class f implements View.OnTouchListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f21235s;

    public f(GestureDetector gestureDetector) {
        this.f21235s = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f21235s.onTouchEvent(motionEvent);
        }
        return false;
    }
}
