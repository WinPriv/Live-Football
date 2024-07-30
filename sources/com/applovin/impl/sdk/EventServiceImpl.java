package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", "paused", "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* renamed from: a, reason: collision with root package name */
    private final p f18454a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f18455b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18456c = new AtomicBoolean();

    public EventServiceImpl(p pVar) {
        this.f18454a = pVar;
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.br)).booleanValue()) {
            this.f18455b = JsonUtils.toStringObjectMap((String) pVar.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.B, (com.applovin.impl.sdk.c.d<String>) JsonUtils.EMPTY_JSON));
        } else {
            this.f18455b = CollectionUtils.map();
            pVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.B, (com.applovin.impl.sdk.c.d<String>) JsonUtils.EMPTY_JSON);
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public Map<String, Object> getSuperProperties() {
        return CollectionUtils.map(this.f18455b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f18456c.compareAndSet(false, true)) {
            this.f18454a.G().trackEvent("landing");
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            y.i("AppLovinEventService", "Super property key cannot be null or empty");
            return;
        }
        if (obj == null) {
            this.f18455b.remove(str);
            c();
            return;
        }
        List<String> b10 = this.f18454a.b(com.applovin.impl.sdk.c.b.bq);
        if (!Utils.objectIsOfType(obj, b10, this.f18454a)) {
            y.i("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + b10);
            return;
        }
        this.f18455b.put(str, Utils.sanitizeSuperProperty(obj, this.f18454a));
        c();
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, CollectionUtils.map());
    }

    public void trackEventSynchronously(String str) {
        this.f18454a.L();
        if (y.a()) {
            this.f18454a.L().b("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        u uVar = new u(str, CollectionUtils.map(), this.f18455b);
        this.f18454a.al().a(com.applovin.impl.sdk.network.j.o().c(a()).d(b()).a(a(uVar, true)).b(a(uVar, (Map<String, String>) null)).c(uVar.b()).b(((Boolean) this.f18454a.a(com.applovin.impl.sdk.c.b.fj)).booleanValue()).a(((Boolean) this.f18454a.a(com.applovin.impl.sdk.c.b.f18726fa)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            y.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
        }
        trackEvent(AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        return a3.l.p(new StringBuilder(), (String) this.f18454a.a(com.applovin.impl.sdk.c.b.bj), "4.0/pix");
    }

    private void c() {
        if (((Boolean) this.f18454a.a(com.applovin.impl.sdk.c.b.br)).booleanValue()) {
            this.f18454a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.B, (com.applovin.impl.sdk.c.d<String>) CollectionUtils.toJsonString(this.f18455b, JsonUtils.EMPTY_JSON));
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, null);
    }

    public void trackEvent(String str, Map<String, String> map, final Map<String, String> map2) {
        this.f18454a.L();
        if (y.a()) {
            this.f18454a.L().b("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        final u uVar = new u(str, map, this.f18455b);
        final boolean contains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        try {
            this.f18454a.M().a(new com.applovin.impl.sdk.e.z(this.f18454a, contains, new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    EventServiceImpl.this.f18454a.al().a(com.applovin.impl.sdk.network.j.o().c(EventServiceImpl.this.a()).d(EventServiceImpl.this.b()).a(EventServiceImpl.this.a(uVar, false)).b(EventServiceImpl.this.a(uVar, (Map<String, String>) map2)).c(uVar.b()).b(((Boolean) EventServiceImpl.this.f18454a.a(com.applovin.impl.sdk.c.b.fj)).booleanValue()).a(((Boolean) EventServiceImpl.this.f18454a.a(com.applovin.impl.sdk.c.b.f18726fa)).booleanValue()).c(contains).a());
                }
            }), o.a.BACKGROUND);
        } catch (Throwable th) {
            this.f18454a.L();
            if (y.a()) {
                this.f18454a.L().b("AppLovinEventService", "Unable to track event: " + uVar, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        return a3.l.p(new StringBuilder(), (String) this.f18454a.a(com.applovin.impl.sdk.c.b.bi), "4.0/pix");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(u uVar, boolean z10) {
        Map<String, Object> a10;
        boolean contains = this.f18454a.b(com.applovin.impl.sdk.c.b.bp).contains(uVar.a());
        if (this.f18454a.S() != null) {
            a10 = this.f18454a.S().a(null, z10, false);
        } else {
            a10 = this.f18454a.R().a(null, z10, false);
        }
        a10.put("event", contains ? uVar.a() : "postinstall");
        a10.put("event_id", uVar.d());
        a10.put(com.anythink.expressad.foundation.d.c.f9454bb, Long.toString(uVar.c()));
        if (!contains) {
            a10.put("sub_event", uVar.a());
        }
        return Utils.stringifyObjectMap(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(u uVar, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        boolean contains = this.f18454a.b(com.applovin.impl.sdk.c.b.bp).contains(uVar.a());
        map2.put("AppLovin-Event", contains ? uVar.a() : "postinstall");
        if (!contains) {
            map2.put("AppLovin-Sub-Event", uVar.a());
        }
        return map2;
    }
}
