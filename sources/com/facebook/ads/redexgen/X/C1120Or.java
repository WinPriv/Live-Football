package com.facebook.ads.redexgen.X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Or, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1120Or extends ContentObserver {
    public final C1063Ml A00;

    public C1120Or(Handler handler, C1063Ml c1063Ml) {
        super(handler);
        this.A00 = c1063Ml;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.A00.A0Z();
    }
}
