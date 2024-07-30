package com.google.android.material.textfield;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: CustomEndIconDelegate.java */
/* loaded from: classes2.dex */
public final class g extends n {
    public g(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
    }

    @Override // com.google.android.material.textfield.n
    public final void r() {
        EndCompoundLayout endCompoundLayout = this.f21181b;
        endCompoundLayout.G = null;
        CheckableImageButton checkableImageButton = endCompoundLayout.y;
        checkableImageButton.setOnLongClickListener(null);
        o.d(checkableImageButton, null);
    }
}
