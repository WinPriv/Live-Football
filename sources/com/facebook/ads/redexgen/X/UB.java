package com.facebook.ads.redexgen.X;

import android.text.Layout;
import androidx.annotation.NonNull;

/* loaded from: assets/audience_network.dex */
public final class UB extends FJ implements Comparable<UB> {
    public final int A00;

    public UB(CharSequence charSequence, Layout.Alignment alignment, float f, int i10, int i11, float f10, int i12, float f11, boolean z10, int i13, int i14) {
        super(charSequence, alignment, f, i10, i11, f10, i12, f11, z10, i13);
        this.A00 = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull UB ub2) {
        int i10 = ub2.A00;
        int i11 = this.A00;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        return 0;
    }
}
