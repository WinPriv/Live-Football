package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.9F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9F implements Comparable<C9F> {
    public int A00;
    public long A01;

    @Nullable
    public Object A02;
    public final C07429e A03;

    public C9F(C07429e c07429e) {
        this.A03 = c07429e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull C9F c9f) {
        if ((this.A02 == null) != (c9f.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i10 = this.A00 - c9f.A00;
        if (i10 != 0) {
            return i10;
        }
        int comparePeriodIndex = C0940Hl.A07(this.A01, c9f.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i10, long j10, Object obj) {
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = obj;
    }
}
