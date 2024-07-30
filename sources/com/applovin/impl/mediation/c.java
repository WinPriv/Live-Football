package com.applovin.impl.mediation;

import a3.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final p f17764a;

    /* renamed from: b, reason: collision with root package name */
    private final y f17765b;

    /* renamed from: c, reason: collision with root package name */
    private final a f17766c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.f f17767d;

    /* loaded from: classes.dex */
    public interface a {
        void c(com.applovin.impl.mediation.a.c cVar);
    }

    public c(p pVar, a aVar) {
        this.f17764a = pVar;
        this.f17765b = pVar.L();
        this.f17766c = aVar;
    }

    public void a(final com.applovin.impl.mediation.a.c cVar, long j10) {
        if (y.a()) {
            this.f17765b.b("AdHiddenCallbackTimeoutManager", l.k("Scheduling in ", j10, "ms..."));
        }
        this.f17767d = com.applovin.impl.sdk.utils.f.a(j10, this.f17764a, new Runnable() { // from class: com.applovin.impl.mediation.c.1
            @Override // java.lang.Runnable
            public void run() {
                y unused = c.this.f17765b;
                if (y.a()) {
                    c.this.f17765b.b("AdHiddenCallbackTimeoutManager", "Timing out...");
                }
                c.this.f17766c.c(cVar);
            }
        });
    }

    public void a() {
        if (y.a()) {
            this.f17765b.b("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        com.applovin.impl.sdk.utils.f fVar = this.f17767d;
        if (fVar != null) {
            fVar.a();
            this.f17767d = null;
        }
    }
}
