package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.d;

/* loaded from: classes.dex */
public class f extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private a f18858a;

    /* loaded from: classes.dex */
    public interface a {
        void a(d.a aVar);
    }

    public f(com.applovin.impl.sdk.p pVar, a aVar) {
        super("TaskCollectAdvertisingId", pVar, true);
        this.f18858a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f18858a.a(this.f.R().k());
    }
}
