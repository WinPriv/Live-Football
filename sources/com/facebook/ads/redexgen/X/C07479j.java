package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07479j {
    public final long A00;
    public final long A01;
    public static final C07479j A04 = new C07479j(0, 0);
    public static final C07479j A02 = new C07479j(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C07479j A06 = new C07479j(Long.MAX_VALUE, 0);
    public static final C07479j A05 = new C07479j(0, Long.MAX_VALUE);
    public static final C07479j A03 = A04;

    public C07479j(long j10, long j11) {
        H6.A03(j10 >= 0);
        H6.A03(j11 >= 0);
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C07479j c07479j = (C07479j) obj;
        return this.A01 == c07479j.A01 && this.A00 == c07479j.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
