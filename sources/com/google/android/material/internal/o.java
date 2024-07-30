package com.google.android.material.internal;

import android.view.View;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public final class o implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.h.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
