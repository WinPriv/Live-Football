package com.applovin.impl.mediation.a;

import android.os.SystemClock;
import com.applovin.impl.sdk.p;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends a implements com.applovin.impl.sdk.ad.g {

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference<com.applovin.impl.sdk.b.c> f17550c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f17551d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f17552e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17553g;

    public c(int i10, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
        super(i10, map, jSONObject, jSONObject2, null, pVar);
        this.f17552e = new AtomicBoolean();
        this.f17550c = new AtomicReference<>();
        this.f17551d = new AtomicBoolean();
    }

    public long C() {
        long b10 = b("ad_hidden_timeout_ms", -1L);
        if (b10 >= 0) {
            return b10;
        }
        return a("ad_hidden_timeout_ms", ((Long) this.f17558b.a(com.applovin.impl.sdk.c.a.G)).longValue());
    }

    public boolean D() {
        if (b("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return a("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f17558b.a(com.applovin.impl.sdk.c.a.H)).booleanValue();
    }

    public long E() {
        long b10 = b("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        if (b10 >= 0) {
            return b10;
        }
        return a("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f17558b.a(com.applovin.impl.sdk.c.a.I)).longValue());
    }

    public long F() {
        if (w() > 0) {
            return SystemClock.elapsedRealtime() - w();
        }
        return -1L;
    }

    public long G() {
        long b10 = b("fullscreen_display_delay_ms", -1L);
        if (b10 >= 0) {
            return b10;
        }
        return ((Long) this.f17558b.a(com.applovin.impl.sdk.c.a.f18699u)).longValue();
    }

    public long H() {
        return b("ahdm", ((Long) this.f17558b.a(com.applovin.impl.sdk.c.a.f18701w)).longValue());
    }

    public boolean I() {
        return b("susaode", (Boolean) this.f17558b.a(com.applovin.impl.sdk.c.a.f18700v)).booleanValue();
    }

    public String J() {
        return b("bcode", "");
    }

    public String K() {
        return a("mcode", "");
    }

    public boolean L() {
        return this.f17551d.get();
    }

    public void M() {
        this.f17551d.set(true);
    }

    public com.applovin.impl.sdk.b.c N() {
        return this.f17550c.getAndSet(null);
    }

    public AtomicBoolean O() {
        return this.f17552e;
    }

    @Override // com.applovin.impl.sdk.ad.g
    public long P() {
        return Q() - (SystemClock.elapsedRealtime() - w());
    }

    public long Q() {
        long b10 = b("ad_expiration_ms", -1L);
        if (b10 < 0) {
            return a("ad_expiration_ms", ((Long) this.f17558b.a(com.applovin.impl.sdk.c.a.C)).longValue());
        }
        return b10;
    }

    @Override // com.applovin.impl.sdk.ad.g
    public void R() {
        this.f17553g = true;
    }

    public boolean S() {
        return this.f;
    }

    public void a(boolean z10) {
        this.f = z10;
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new c(this, gVar);
    }

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f17550c.set(cVar);
    }

    private c(c cVar, com.applovin.impl.mediation.g gVar) {
        super(cVar.B(), cVar.af(), cVar.V(), cVar.U(), gVar, cVar.f17558b);
        this.f17552e = new AtomicBoolean();
        this.f17550c = cVar.f17550c;
        this.f17551d = cVar.f17551d;
    }
}
