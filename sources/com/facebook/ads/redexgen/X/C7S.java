package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.facebook.ads.redexgen.X.7S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C7S<T> {
    public C7R A00;

    @Nullable
    public abstract T A03();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7S != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    public final C7R A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7S != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    public final void A01(C7R c7r) {
        this.A00 = c7r;
    }
}
