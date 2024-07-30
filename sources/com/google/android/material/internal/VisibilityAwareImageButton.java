package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: s, reason: collision with root package name */
    public int f20824s;

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f20824s = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f20824s;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
