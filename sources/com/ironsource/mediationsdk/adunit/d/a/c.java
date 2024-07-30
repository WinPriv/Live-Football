package com.ironsource.mediationsdk.adunit.d.a;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1418f;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.a.b;
import com.ironsource.mediationsdk.b.b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.f;
import com.ironsource.mediationsdk.utils.n;
import e0.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class c<Listener extends com.ironsource.mediationsdk.adunit.c.a.b> implements AdapterAdListener, NetworkInitializationListener, com.ironsource.mediationsdk.adunit.b.c, b.a, n.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.ironsource.mediationsdk.adunit.d.a f25240a;

    /* renamed from: b, reason: collision with root package name */
    public final Listener f25241b;

    /* renamed from: c, reason: collision with root package name */
    public BaseAdAdapter<?, AdapterAdListener> f25242c;

    /* renamed from: d, reason: collision with root package name */
    public d f25243d;

    /* renamed from: e, reason: collision with root package name */
    public a f25244e;
    public Placement f;

    /* renamed from: g, reason: collision with root package name */
    public final com.ironsource.mediationsdk.model.a f25245g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f25246h;

    /* renamed from: i, reason: collision with root package name */
    public String f25247i;

    /* renamed from: j, reason: collision with root package name */
    public AdData f25248j;

    /* renamed from: k, reason: collision with root package name */
    public Long f25249k;

    /* renamed from: l, reason: collision with root package name */
    public f f25250l;

    /* renamed from: m, reason: collision with root package name */
    public com.ironsource.mediationsdk.b.b f25251m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f25252n = new Object();

    /* loaded from: classes2.dex */
    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdAdapter<?, ?> baseAdAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        this.f25240a = aVar;
        this.f25241b = listener;
        this.f25243d = new d(aVar.f25231a, d.b.PROVIDER, this);
        this.f25245g = aVar2;
        this.f25246h = aVar2.f25631b;
        this.f25242c = baseAdAdapter;
        this.f25251m = new com.ironsource.mediationsdk.b.b(aVar.f25234d * 1000);
        c(a.NONE);
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    @Override // com.ironsource.mediationsdk.adunit.b.c
    public final Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f25242c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f25242c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception unused) {
            IronLog.INTERNAL.error(d("could not get adapter version for event data" + m()));
        }
        com.ironsource.mediationsdk.model.a aVar = this.f25245g;
        hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, aVar.f25630a.getSubProviderId());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, aVar.f25630a.getAdSourceNameForEvents());
        hashMap.put("instanceType", Integer.valueOf(l()));
        boolean z10 = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f25247i)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f25247i);
        }
        com.ironsource.mediationsdk.adunit.d.a aVar2 = this.f25240a;
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aVar2.f25235e));
        JSONObject jSONObject = aVar2.f;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, aVar2.f);
        }
        if (!TextUtils.isEmpty(aVar2.f25236g)) {
            hashMap.put("auctionId", aVar2.f25236g);
        }
        if (bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_NO_FILL && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_OPENED && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_CLOSED && bVar != com.ironsource.mediationsdk.adunit.b.b.SHOW_AD && bVar != com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_CLICKED && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_REWARDED) {
            z10 = false;
        }
        if (z10) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(aVar2.f25237h));
            if (!TextUtils.isEmpty(aVar2.f25238i)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, aVar2.f25238i);
            }
        }
        if (!TextUtils.isEmpty(aVar2.f25233c.getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, aVar2.f25233c.getCustomNetwork());
        }
        return hashMap;
    }

    public final void b(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        d dVar = this.f25243d;
        if (dVar != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                dVar.f25160b.b(j10, i10);
            } else if (TextUtils.isEmpty(str)) {
                this.f25243d.f25160b.a(j10, i10);
            } else {
                this.f25243d.f25160b.a(j10, i10, str);
            }
        }
    }

    public final void c(a aVar) {
        IronLog.INTERNAL.verbose(d("to " + aVar));
        this.f25244e = aVar;
    }

    public final String d(String str) {
        String str2 = this.f25240a.f25231a.name() + " - " + m() + " - state = " + this.f25244e;
        return TextUtils.isEmpty(str) ? str2 : i.f(str2, " - ", str);
    }

    public final boolean e() {
        if (this.f25244e == a.LOADED) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.f25244e != a.FAILED) {
            return true;
        }
        return false;
    }

    public final void g() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.f25243d;
        if (dVar != null) {
            dVar.f25163e.a();
        }
    }

    public final Long h() {
        return this.f25249k;
    }

    public final boolean i() {
        return this.f25245g.f25633d;
    }

    @Override // com.ironsource.mediationsdk.utils.n.a
    public final int j() {
        return this.f25245g.f25635g;
    }

    @Override // com.ironsource.mediationsdk.utils.n.a
    public final String k() {
        return this.f25245g.f25630a.getProviderName();
    }

    public final int l() {
        return this.f25245g.f;
    }

    public final String m() {
        return String.format("%s %s", k(), Integer.valueOf(hashCode()));
    }

    public final String n() {
        return this.f25245g.f25630a.getProviderTypeForReflection();
    }

    public final String o() {
        return this.f25240a.f25236g;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.f25243d;
        if (dVar != null) {
            dVar.f25163e.d(q());
        }
        this.f25241b.b(this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str) {
        IronLog.INTERNAL.verbose(d("error = " + i10 + ", " + str));
        com.ironsource.mediationsdk.b.b bVar = this.f25251m;
        if (bVar != null) {
            bVar.d();
        }
        long a10 = f.a(this.f25250l);
        synchronized (this.f25252n) {
            a aVar = this.f25244e;
            if (aVar == a.LOADING) {
                b(adapterErrorType, i10, str, a10);
                c(a.FAILED);
                this.f25241b.a(new IronSourceError(i10, str), this);
            } else {
                if (aVar == a.FAILED) {
                    b(adapterErrorType, i10, str, a10);
                    return;
                }
                if (aVar == a.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                    this.f25249k = Long.valueOf(System.currentTimeMillis());
                    d dVar = this.f25243d;
                    if (dVar != null) {
                        dVar.f.p(String.format("ad expired for %s", this.f25245g.f25630a.getProviderName()));
                    }
                    return;
                }
                String format = String.format("unexpected load failed for %s, state - %s, error - %s, %s", m(), this.f25244e, Integer.valueOf(i10), str);
                d dVar2 = this.f25243d;
                if (dVar2 != null) {
                    dVar2.f.i(format);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        IronLog.INTERNAL.verbose(d(""));
        com.ironsource.mediationsdk.b.b bVar = this.f25251m;
        if (bVar != null) {
            bVar.d();
        }
        a aVar = this.f25244e;
        if (aVar == a.LOADING) {
            long a10 = f.a(this.f25250l);
            d dVar = this.f25243d;
            if (dVar != null) {
                dVar.f25160b.a(a10, false);
            }
            c(a.LOADED);
            this.f25241b.a(this);
            return;
        }
        if (aVar != a.FAILED) {
            String format = String.format("unexpected load success for %s, state - %s", m(), this.f25244e);
            d dVar2 = this.f25243d;
            if (dVar2 != null) {
                dVar2.f.h(format);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i10, String str) {
        boolean z10;
        IronLog.INTERNAL.verbose(d("error = " + i10 + ", " + str));
        a aVar = this.f25244e;
        if (aVar == a.INIT_IN_PROGRESS) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            com.ironsource.mediationsdk.b.b bVar = this.f25251m;
            if (bVar != null) {
                bVar.d();
            }
            c(a.FAILED);
            IronSourceError ironSourceError = new IronSourceError(i10, str);
            f.a(this.f25250l);
            this.f25241b.a(ironSourceError, this);
            return;
        }
        if (aVar != a.FAILED) {
            String format = String.format("unexpected init failed for %s, state - %s, error - %s, %s", m(), this.f25244e, Integer.valueOf(i10), str);
            d dVar = this.f25243d;
            if (dVar != null) {
                dVar.f.e(format);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        boolean z10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d(""));
        a aVar = this.f25244e;
        if (aVar == a.INIT_IN_PROGRESS) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            com.ironsource.mediationsdk.b.b bVar = this.f25251m;
            if (bVar != null) {
                bVar.d();
            }
            c(a.READY_TO_LOAD);
            ironLog.verbose(d(""));
            c(a.LOADING);
            try {
                this.f25251m.a(this);
                this.f25242c.loadAd(this.f25248j, ContextProvider.getInstance().getCurrentActiveActivity(), this);
                return;
            } catch (Throwable th) {
                String str = "unexpected error while calling adapter.loadAd() - " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(d(str));
                d dVar = this.f25243d;
                if (dVar != null) {
                    dVar.f.m(str);
                }
                onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_CODE_GENERIC, str);
                return;
            }
        }
        if (aVar != a.FAILED) {
            String format = String.format("unexpected init success for %s, state - %s", m(), this.f25244e);
            d dVar2 = this.f25243d;
            if (dVar2 != null) {
                dVar2.f.d(format);
            }
        }
    }

    public final boolean p() {
        if (this.f25244e == a.SHOWING) {
            return true;
        }
        return false;
    }

    public final String q() {
        Placement placement = this.f;
        if (placement == null) {
            return "";
        }
        return placement.getPlacementName();
    }

    public final void a(String str) {
        C1418f.a();
        this.f25247i = C1418f.d(str);
    }

    @Override // com.ironsource.mediationsdk.b.b.a
    public final void b() {
        IronLog.INTERNAL.verbose(d("state = " + this.f25244e + ", isBidder = " + i()));
        long a10 = f.a(this.f25250l);
        synchronized (this.f25252n) {
            if (!d()) {
                String format = String.format("unexpected timeout for %s, state - %s, error - %s", m(), this.f25244e, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT));
                d dVar = this.f25243d;
                if (dVar != null) {
                    dVar.f.l(format);
                }
                return;
            }
            c(a.FAILED);
            d dVar2 = this.f25243d;
            if (dVar2 != null) {
                dVar2.f25160b.a(a10, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT);
                this.f25243d.f25160b.a(a10, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out");
            }
            Listener listener = this.f25241b;
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            f.a(this.f25250l);
            listener.a(buildLoadFailedError, this);
        }
    }

    public void c() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f25242c;
        if (baseAdAdapter != null) {
            try {
                baseAdAdapter.releaseMemory();
                this.f25242c = null;
            } catch (Exception e10) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.f25245g.f25630a.getProviderName() + " - " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(d(str));
                this.f25243d.f.m(str);
            }
        }
        d dVar = this.f25243d;
        if (dVar != null) {
            dVar.a();
            this.f25243d = null;
        }
        com.ironsource.mediationsdk.b.b bVar = this.f25251m;
        if (bVar != null) {
            bVar.c();
            this.f25251m = null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public final void a(String str, Map<String, Object> map) {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(d(""));
            boolean z10 = false;
            this.f25243d.f25160b.a(false);
            this.f25249k = null;
            this.f25250l = new f();
            HashMap hashMap = new HashMap();
            hashMap.put("userId", this.f25240a.f25232b);
            hashMap.putAll(com.ironsource.mediationsdk.c.b.a(this.f25246h));
            this.f25248j = new AdData(str, hashMap, map);
            synchronized (this.f25252n) {
                if (this.f25244e != a.NONE) {
                    z10 = true;
                } else {
                    c(a.INIT_IN_PROGRESS);
                }
            }
            if (z10) {
                String str2 = "loadAd - incorrect state while loading, state = " + this.f25244e;
                ironLog.error(d(str2));
                this.f25243d.f.m(str2);
                onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.f25240a.f25231a), str2);
                return;
            }
            this.f25251m.a(this);
            ?? networkAdapter = this.f25242c.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.f25248j, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str3 = "loadAd - network adapter not available " + m();
            ironLog.error(d(str3));
            this.f25243d.f.a(str3);
            onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.f25240a.f25231a), str3);
        } catch (Throwable th) {
            String str4 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(d(str4));
            d dVar = this.f25243d;
            if (dVar != null) {
                dVar.f.m(str4);
            }
            onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.f25240a.f25231a), str4);
        }
    }

    public final boolean d() {
        a aVar = this.f25244e;
        return aVar == a.INIT_IN_PROGRESS || aVar == a.LOADING;
    }
}
