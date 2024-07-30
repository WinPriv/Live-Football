package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x extends a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c.e f18947a;

    /* renamed from: b, reason: collision with root package name */
    private final AppLovinAdLoadListener f18948b;

    public x(com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super("TaskResolveVastWrapper", pVar);
        this.f18948b = appLovinAdLoadListener;
        this.f18947a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a10 = com.applovin.impl.c.m.a(this.f18947a);
        if (StringUtils.isValidString(a10)) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Resolving VAST ad with depth " + this.f18947a.a() + " at " + a10);
            }
            try {
                this.f.M().a((a) new u<com.applovin.impl.sdk.utils.t>(com.applovin.impl.sdk.network.c.a(this.f).a(a10).b("GET").a((c.a) com.applovin.impl.sdk.utils.t.f19540a).a(((Integer) this.f.a(com.applovin.impl.sdk.c.b.eO)).intValue()).b(((Integer) this.f.a(com.applovin.impl.sdk.c.b.eP)).intValue()).c(false).a(), this.f) { // from class: com.applovin.impl.sdk.e.x.1
                    @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                    public void a(com.applovin.impl.sdk.utils.t tVar, int i10) {
                        this.f.M().a((a) r.a(tVar, x.this.f18947a, x.this.f18948b, x.this.f));
                    }

                    @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                    public void a(int i10, String str, com.applovin.impl.sdk.utils.t tVar) {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f18839h.e(this.f18838g, "Unable to resolve VAST wrapper. Server returned " + i10);
                        }
                        x.this.a(i10);
                    }
                });
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18839h.b(this.f18838g, "Unable to resolve VAST wrapper", th);
                }
                a(-1);
                return;
            }
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.e(this.f18838g, "Resolving VAST failed. Could not find resolution URL");
        }
        a(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.e(this.f18838g, "Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f18948b;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
                return;
            }
            return;
        }
        com.applovin.impl.c.m.a(this.f18947a, this.f18948b, i10 == -1001 ? com.applovin.impl.c.f.TIMED_OUT : com.applovin.impl.c.f.GENERAL_WRAPPER_ERROR, i10, this.f);
    }
}
