package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: MaterialCalendarGridView.java */
/* loaded from: classes2.dex */
public final class m extends n0.a {
    @Override // n0.a
    public final void d(View view, o0.g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f33037a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(null);
    }
}
