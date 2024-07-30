package com.google.android.material.internal;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: CheckableImageButton.java */
/* loaded from: classes2.dex */
public final class a extends n0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f20825d;

    public a(CheckableImageButton checkableImageButton) {
        this.f20825d = checkableImageButton;
    }

    @Override // n0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f20825d.isChecked());
    }

    @Override // n0.a
    public final void d(View view, o0.g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f33037a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.f20825d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f20813w);
        accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
    }
}
