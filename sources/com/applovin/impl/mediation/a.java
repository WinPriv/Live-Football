package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.utils.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.a f17536a;

    /* renamed from: b, reason: collision with root package name */
    private final y f17537b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0200a f17538c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.mediation.a.c f17539d;

    /* renamed from: e, reason: collision with root package name */
    private int f17540e;
    private boolean f;

    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0200a {
        void a(com.applovin.impl.mediation.a.c cVar);
    }

    public a(p pVar) {
        this.f17537b = pVar.L();
        this.f17536a = pVar.w();
    }

    public void a(com.applovin.impl.mediation.a.c cVar, InterfaceC0200a interfaceC0200a) {
        if (y.a()) {
            this.f17537b.b("AdActivityObserver", "Starting for ad " + cVar.getAdUnitId() + "...");
        }
        a();
        this.f17538c = interfaceC0200a;
        this.f17539d = cVar;
        this.f17536a.a(this);
    }

    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f) {
            this.f = true;
        }
        this.f17540e++;
        if (y.a()) {
            this.f17537b.b("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f17540e);
        }
    }

    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (!this.f) {
            return;
        }
        this.f17540e--;
        if (y.a()) {
            this.f17537b.b("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f17540e);
        }
        if (this.f17540e <= 0) {
            if (y.a()) {
                this.f17537b.b("AdActivityObserver", "Last ad Activity destroyed");
            }
            if (this.f17538c != null) {
                if (y.a()) {
                    this.f17537b.b("AdActivityObserver", "Invoking callback...");
                }
                this.f17538c.a(this.f17539d);
            }
            a();
        }
    }

    public void a() {
        if (y.a()) {
            this.f17537b.b("AdActivityObserver", "Cancelling...");
        }
        this.f17536a.b(this);
        this.f17538c = null;
        this.f17539d = null;
        this.f17540e = 0;
        this.f = false;
    }
}
