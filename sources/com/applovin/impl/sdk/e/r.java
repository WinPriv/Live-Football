package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class r extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinAdLoadListener f18926a;

    /* renamed from: b, reason: collision with root package name */
    private final a f18927b;

    /* loaded from: classes.dex */
    public static final class a extends com.applovin.impl.c.e {
        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.p pVar) {
            super(jSONObject, jSONObject2, bVar, pVar);
        }

        public void a(com.applovin.impl.sdk.utils.t tVar) {
            if (tVar != null) {
                this.f17401a.add(tVar);
                return;
            }
            throw new IllegalArgumentException("No aggregated vast response specified");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends r {

        /* renamed from: a, reason: collision with root package name */
        private final String f18928a;

        public b(String str, com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
            super(eVar, appLovinAdLoadListener, pVar);
            this.f18928a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a(a(this.f18928a));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends r {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f18929a;

        public c(com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
            super(eVar, appLovinAdLoadListener, pVar);
            this.f18929a = eVar.c();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f18929a, "xml", null);
            if (StringUtils.isValidString(string)) {
                if (string.length() < ((Integer) this.f.a(com.applovin.impl.sdk.c.b.eI)).intValue()) {
                    a(a(string));
                    return;
                }
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18839h.e(this.f18838g, "VAST response is over max length");
                }
                a(com.applovin.impl.c.f.XML_PARSING);
                return;
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.e(this.f18838g, "No VAST response received.");
            }
            a(com.applovin.impl.c.f.NO_WRAPPER_RESPONSE);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends r {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.utils.t f18930a;

        public d(com.applovin.impl.sdk.utils.t tVar, com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
            super(eVar, appLovinAdLoadListener, pVar);
            if (tVar != null) {
                if (eVar != null) {
                    if (appLovinAdLoadListener != null) {
                        this.f18930a = tVar;
                        return;
                    }
                    throw new IllegalArgumentException("No callback specified.");
                }
                throw new IllegalArgumentException("No context specified.");
            }
            throw new IllegalArgumentException("No response specified.");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Processing VAST Wrapper response...");
            }
            a(this.f18930a);
        }
    }

    public r(com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super("TaskProcessVastResponse", pVar);
        if (eVar != null) {
            this.f18926a = appLovinAdLoadListener;
            this.f18927b = (a) eVar;
            return;
        }
        throw new IllegalArgumentException("No context specified.");
    }

    public static r a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        return new c(new a(jSONObject, jSONObject2, bVar, pVar), appLovinAdLoadListener, pVar);
    }

    public static r a(String str, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        return new b(str, new a(jSONObject, jSONObject2, bVar, pVar), appLovinAdLoadListener, pVar);
    }

    public static r a(com.applovin.impl.sdk.utils.t tVar, com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        return new d(tVar, eVar, appLovinAdLoadListener, pVar);
    }

    public com.applovin.impl.sdk.utils.t a(String str) {
        try {
            return com.applovin.impl.sdk.utils.u.a(str, this.f);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Failed to process VAST response", th);
            }
            a(com.applovin.impl.c.f.XML_PARSING);
            return null;
        }
    }

    public void a(com.applovin.impl.sdk.utils.t tVar) {
        int a10 = this.f18927b.a();
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Finished parsing XML at depth " + a10);
        }
        this.f18927b.a(tVar);
        if (com.applovin.impl.c.m.a(tVar)) {
            int intValue = ((Integer) this.f.a(com.applovin.impl.sdk.c.b.eJ)).intValue();
            if (a10 < intValue) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18839h.b(this.f18838g, "VAST response is wrapper. Resolving...");
                }
                this.f.M().a((com.applovin.impl.sdk.e.a) new x(this.f18927b, this.f18926a, this.f));
                return;
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.e(this.f18838g, "Reached beyond max wrapper depth of " + intValue);
            }
            a(com.applovin.impl.c.f.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (com.applovin.impl.c.m.b(tVar)) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "VAST response is inline. Rendering ad...");
            }
            this.f.M().a((com.applovin.impl.sdk.e.a) new t(this.f18927b, this.f18926a, this.f));
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.e(this.f18838g, "VAST response is an error");
        }
        a(com.applovin.impl.c.f.NO_WRAPPER_RESPONSE);
    }

    public void a(com.applovin.impl.c.f fVar) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.e(this.f18838g, "Failed to process VAST response due to VAST error code " + fVar);
        }
        com.applovin.impl.c.m.a(this.f18927b, this.f18926a, fVar, -6, this.f);
    }
}
