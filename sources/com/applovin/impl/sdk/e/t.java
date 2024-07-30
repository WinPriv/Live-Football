package com.applovin.impl.sdk.e;

import com.applovin.impl.c.a;
import com.applovin.impl.sdk.e.o;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import java.util.HashSet;

/* loaded from: classes.dex */
class t extends a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c.e f18935a;

    /* renamed from: b, reason: collision with root package name */
    private final AppLovinAdLoadListener f18936b;

    public t(com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super("TaskRenderVastAd", pVar);
        this.f18936b = appLovinAdLoadListener;
        this.f18935a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Rendering VAST ad...");
        }
        int size = this.f18935a.b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str2 = "";
        com.applovin.impl.c.j jVar = null;
        com.applovin.impl.c.n nVar = null;
        com.applovin.impl.c.d dVar = null;
        com.applovin.impl.c.c cVar = null;
        String str3 = "";
        for (com.applovin.impl.sdk.utils.t tVar : this.f18935a.b()) {
            if (com.applovin.impl.c.m.a(tVar)) {
                str = "Wrapper";
            } else {
                str = "InLine";
            }
            com.applovin.impl.sdk.utils.t c10 = tVar.c(str);
            if (c10 != null) {
                com.applovin.impl.sdk.utils.t c11 = c10.c("AdSystem");
                if (c11 != null) {
                    jVar = com.applovin.impl.c.j.a(c11, jVar, this.f);
                }
                str2 = com.applovin.impl.c.m.a(c10, "AdTitle", str2);
                str3 = com.applovin.impl.c.m.a(c10, "Description", str3);
                com.applovin.impl.c.m.a(c10.a("Impression"), hashSet, this.f18935a, this.f);
                com.applovin.impl.sdk.utils.t b10 = c10.b("ViewableImpression");
                if (b10 != null) {
                    com.applovin.impl.c.m.a(b10.a("Viewable"), hashSet, this.f18935a, this.f);
                }
                com.applovin.impl.sdk.utils.t c12 = c10.c("AdVerifications");
                if (c12 != null) {
                    cVar = com.applovin.impl.c.c.a(c12, cVar, this.f18935a, this.f);
                }
                com.applovin.impl.c.m.a(c10.a("Error"), hashSet2, this.f18935a, this.f);
                com.applovin.impl.sdk.utils.t b11 = c10.b("Creatives");
                if (b11 != null) {
                    for (com.applovin.impl.sdk.utils.t tVar2 : b11.d()) {
                        com.applovin.impl.sdk.utils.t b12 = tVar2.b("Linear");
                        if (b12 != null) {
                            nVar = com.applovin.impl.c.n.a(b12, nVar, this.f18935a, this.f);
                        } else {
                            com.applovin.impl.sdk.utils.t c13 = tVar2.c("CompanionAds");
                            if (c13 != null) {
                                com.applovin.impl.sdk.utils.t c14 = c13.c("Companion");
                                if (c14 != null) {
                                    dVar = com.applovin.impl.c.d.a(c14, dVar, this.f18935a, this.f);
                                }
                            } else if (com.applovin.impl.sdk.y.a()) {
                                this.f18839h.e(this.f18838g, "Received and will skip rendering for an unidentified creative: " + tVar2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.e(this.f18838g, "Did not find wrapper or inline response for node: " + tVar);
            }
        }
        com.applovin.impl.c.a a10 = new a.C0199a().a(this.f).a(this.f18935a.c()).b(this.f18935a.d()).a(this.f18935a.e()).a(this.f18935a.f()).a(str2).b(str3).a(jVar).a(nVar).a(dVar).a(cVar).a(hashSet).a(cVar).b(hashSet2).a();
        com.applovin.impl.c.f a11 = com.applovin.impl.c.m.a(a10);
        if (a11 == null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Finished rendering VAST ad: " + a10);
            }
            a10.o().b();
            e eVar = new e(a10, this.f, this.f18936b);
            o.a aVar = o.a.CACHING_OTHER;
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.bv)).booleanValue()) {
                if (a10.getType() == AppLovinAdType.REGULAR) {
                    aVar = o.a.CACHING_INTERSTITIAL;
                } else if (a10.getType() == AppLovinAdType.INCENTIVIZED) {
                    aVar = o.a.CACHING_INCENTIVIZED;
                } else if (a10.getType() == AppLovinAdType.NATIVE) {
                    aVar = o.a.CACHING_NATIVE;
                }
            }
            this.f.M().a(eVar, aVar);
            return;
        }
        com.applovin.impl.c.m.a(this.f18935a, this.f18936b, a11, -6, this.f);
    }
}
