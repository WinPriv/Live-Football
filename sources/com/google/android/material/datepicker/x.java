package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes2.dex */
public final class x extends androidx.recyclerview.widget.o {
    public x(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.o
    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
