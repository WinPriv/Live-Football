package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.9q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07539q {
    public final int A00;
    public final EK A01;

    public C07539q(int i10, EK ek) {
        this.A00 = i10;
        this.A01 = ek;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C07539q c07539q = (C07539q) obj;
        return this.A00 == c07539q.A00 && this.A01.equals(c07539q.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
