package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    public AbstractAdapter f24735a;

    /* renamed from: c, reason: collision with root package name */
    public com.ironsource.mediationsdk.model.a f24736c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f24737d;

    /* renamed from: g, reason: collision with root package name */
    public long f24739g;

    /* renamed from: k, reason: collision with root package name */
    public String f24743k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f24744l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public final Object f24745m = new Object();

    /* renamed from: e, reason: collision with root package name */
    public a f24738e = a.NOT_LOADED;
    public Timer f = null;

    /* renamed from: h, reason: collision with root package name */
    public String f24740h = "";

    /* renamed from: i, reason: collision with root package name */
    public JSONObject f24741i = null;

    /* renamed from: j, reason: collision with root package name */
    public List<String> f24742j = new ArrayList();

    /* loaded from: classes2.dex */
    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public A(com.ironsource.mediationsdk.model.a aVar, AbstractAdapter abstractAdapter) {
        this.f24736c = aVar;
        this.f24735a = abstractAdapter;
        this.f24737d = aVar.f25631b;
    }

    public final a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.f24744l) {
            aVar2 = this.f24738e;
            if (Arrays.asList(aVarArr).contains(this.f24738e)) {
                b(aVar);
            }
        }
        return aVar2;
    }

    public final void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f24736c.f25630a.getProviderName() + ": current state=" + this.f24738e + ", new state=" + aVar);
        synchronized (this.f24744l) {
            this.f24738e = aVar;
        }
    }

    public final void c(TimerTask timerTask) {
        synchronized (this.f24745m) {
            j();
            Timer timer = new Timer();
            this.f = timer;
            timer.schedule(timerTask, this.f24739g);
        }
    }

    public final boolean d(a aVar, a aVar2) {
        synchronized (this.f24744l) {
            if (this.f24738e != aVar) {
                return false;
            }
            b(aVar2);
            return true;
        }
    }

    public final String e() {
        return this.f24736c.f25630a.getProviderName();
    }

    public final int f() {
        return this.f24736c.f;
    }

    public final String g() {
        return this.f24736c.f25630a.getSubProviderId();
    }

    public final boolean h() {
        return this.f24737d.optBoolean("isOneFlow", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String i() {
        a aVar = this.f24738e;
        if (aVar == null) {
            return "null";
        }
        return aVar.toString();
    }

    public final void j() {
        synchronized (this.f24745m) {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
                this.f = null;
            }
        }
    }

    public final boolean k() {
        return this.f24736c.f25633d;
    }

    public final void a(String str) {
        C1418f.a();
        this.f24743k = C1418f.d(str);
    }

    public final void b(String str) {
        this.f24740h = str;
    }

    public Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f24735a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f24735a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f24736c.f25630a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f24736c.f25630a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (this.f24736c.f25633d) {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                hashMap.put("instanceType", 2);
                if (!TextUtils.isEmpty(this.f24740h)) {
                    hashMap.put("auctionId", this.f24740h);
                }
                JSONObject jSONObject = this.f24741i;
                if (jSONObject != null && jSONObject.length() > 0) {
                    hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f24741i);
                }
            } else {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 0);
                hashMap.put("instanceType", 1);
            }
            if (!TextUtils.isEmpty(this.f24743k)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f24743k);
            }
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + e() + ")", e10);
        }
        return hashMap;
    }

    public final void a(JSONObject jSONObject) {
        this.f24741i = jSONObject;
    }

    public final void a(boolean z10) {
        try {
            this.f24737d.put("isOneFlow", z10);
        } catch (Exception e10) {
            IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z10 + ". Error: " + e10.getMessage());
        }
    }
}
