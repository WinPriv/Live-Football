package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.Fw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0899Fw implements Comparable<C0899Fw> {
    public final int A00;
    public final C0895Fs A01;

    public C0899Fw(int i10, C0895Fs c0895Fs) {
        this.A00 = i10;
        this.A01 = c0895Fs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull C0899Fw c0899Fw) {
        return this.A00 - c0899Fw.A00;
    }
}
