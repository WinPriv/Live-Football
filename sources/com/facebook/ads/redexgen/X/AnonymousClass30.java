package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.30, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass30 extends C0774Al implements Comparable<AnonymousClass30> {
    public long A00;

    public AnonymousClass30() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull AnonymousClass30 anonymousClass30) {
        if (A04() != anonymousClass30.A04()) {
            return A04() ? 1 : -1;
        }
        long j10 = ((C1294Vn) this).A00 - ((C1294Vn) anonymousClass30).A00;
        if (j10 == 0) {
            long j11 = this.A00;
            long delta = anonymousClass30.A00;
            j10 = j11 - delta;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
