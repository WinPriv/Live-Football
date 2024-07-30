package com.anythink.core.b.b;

import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBiddingListener;

/* loaded from: classes.dex */
public abstract class b implements ATBiddingListener {

    /* renamed from: c, reason: collision with root package name */
    protected ATBaseAdAdapter f4600c;

    public b(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f4600c = aTBaseAdAdapter;
    }

    private void a() {
        this.f4600c = null;
    }
}
