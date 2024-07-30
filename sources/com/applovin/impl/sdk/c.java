package com.applovin.impl.sdk;

import com.applovin.impl.sdk.d;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final p f18674a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<com.applovin.impl.sdk.ad.g> f18675b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<d.a> f18676c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.p f18677d;

    private c(com.applovin.impl.sdk.ad.g gVar, d.a aVar, p pVar) {
        this.f18675b = new WeakReference<>(gVar);
        this.f18676c = new WeakReference<>(aVar);
        this.f18674a = pVar;
    }

    public void b() {
        com.applovin.impl.sdk.utils.p pVar = this.f18677d;
        if (pVar != null) {
            pVar.d();
            this.f18677d = null;
        }
    }

    public void c() {
        b();
        com.applovin.impl.sdk.ad.g a10 = a();
        if (a10 == null) {
            return;
        }
        a10.R();
        d.a aVar = this.f18676c.get();
        if (aVar == null) {
            return;
        }
        aVar.onAdExpired(a10);
    }

    public static c a(com.applovin.impl.sdk.ad.g gVar, d.a aVar, p pVar) {
        c cVar = new c(gVar, aVar, pVar);
        cVar.a(gVar.P());
        return cVar;
    }

    public com.applovin.impl.sdk.ad.g a() {
        return this.f18675b.get();
    }

    public void a(long j10) {
        b();
        if (((Boolean) this.f18674a.a(com.applovin.impl.sdk.c.b.bF)).booleanValue() || !this.f18674a.Y().isApplicationPaused()) {
            this.f18677d = com.applovin.impl.sdk.utils.p.a(j10, this.f18674a, new Runnable() { // from class: com.applovin.impl.sdk.c.1
                @Override // java.lang.Runnable
                public void run() {
                    c.this.c();
                    c.this.f18674a.V().a(c.this);
                }
            });
        }
    }
}
