package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.ads.ep;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l0 extends k0 implements com.ironsource.environment.j, InterfaceC1415c, com.ironsource.mediationsdk.sdk.l, com.ironsource.mediationsdk.utils.d {

    /* renamed from: n, reason: collision with root package name */
    public com.ironsource.mediationsdk.sdk.i f25566n;

    /* renamed from: q, reason: collision with root package name */
    public NetworkStateReceiver f25568q;

    /* renamed from: r, reason: collision with root package name */
    public Placement f25569r;

    /* renamed from: t, reason: collision with root package name */
    public int f25571t;
    public B y;

    /* renamed from: m, reason: collision with root package name */
    public final String f25565m = l0.class.getSimpleName();

    /* renamed from: s, reason: collision with root package name */
    public Timer f25570s = null;
    public boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25567p = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f25575x = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f25573v = false;

    /* renamed from: w, reason: collision with root package name */
    public long f25574w = e0.i.e();

    /* renamed from: u, reason: collision with root package name */
    public final List<AbstractC1414b.a> f25572u = Arrays.asList(AbstractC1414b.a.INIT_FAILED, AbstractC1414b.a.CAPPED_PER_SESSION, AbstractC1414b.a.EXHAUSTED, AbstractC1414b.a.CAPPED_PER_DAY);

    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            Boolean bool;
            cancel();
            l0 l0Var = l0.this;
            synchronized (l0Var) {
                if (IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity()) && (bool = l0Var.f25559j) != null && !bool.booleanValue()) {
                    l0Var.d(102, null);
                    l0Var.d(1000, null);
                    l0Var.f25573v = true;
                    Iterator<AbstractC1414b> it = l0Var.f25553c.iterator();
                    while (it.hasNext()) {
                        AbstractC1414b next = it.next();
                        if (next.f25320a == AbstractC1414b.a.NOT_AVAILABLE) {
                            try {
                                l0Var.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Fetch from timer: " + next.f25324e + ":reload smash", 1);
                                l0Var.c(1001, next, null);
                                ((ag) next).n();
                            } catch (Throwable th) {
                                l0Var.f25557h.log(IronSourceLogger.IronSourceTag.NATIVE, next.f25324e + " Failed to call fetchVideo(), " + th.getLocalizedMessage(), 1);
                            }
                        }
                    }
                }
            }
            l0.this.d();
        }
    }

    public l0() {
        this.f25551a = new com.ironsource.mediationsdk.utils.e("rewarded_video", this);
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public final void a(ag agVar) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, a3.l.p(new StringBuilder(), agVar.f25324e, ":onRewardedVideoAdOpened()"), 1);
        c(1005, agVar, new Object[][]{new Object[]{"placement", t()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(agVar.f25311w)}});
        this.f25566n.onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public final void b(ag agVar) {
        String str;
        CopyOnWriteArrayList<AbstractC1414b> copyOnWriteArrayList = this.f25553c;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        String p10 = a3.l.p(new StringBuilder(), agVar.f25324e, ":onRewardedVideoAdClosed()");
        IronSourceLoggerManager ironSourceLoggerManager = this.f25557h;
        ironSourceLoggerManager.log(ironSourceTag, p10, 1);
        this.f25575x = false;
        StringBuilder sb2 = new StringBuilder();
        try {
            Iterator<AbstractC1414b> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                AbstractC1414b next = it.next();
                if (((ag) next).o()) {
                    sb2.append(next.f25324e + com.huawei.openalliance.ad.constant.w.aG);
                }
            }
        } catch (Throwable unused) {
            ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.INTERNAL, "Failed to check RV availability", 0);
        }
        Object[][] objArr = new Object[3];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "placement";
        objArr2[1] = t();
        objArr[0] = objArr2;
        Object[] objArr3 = new Object[2];
        objArr3[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb3 = new StringBuilder("otherRVAvailable = ");
        if (sb2.length() > 0) {
            str = "true|" + ((Object) sb2);
        } else {
            str = ep.V;
        }
        sb3.append(str);
        objArr3[1] = sb3.toString();
        objArr[1] = objArr3;
        Object[] objArr4 = new Object[2];
        objArr4[0] = IronSourceConstants.KEY_SESSION_DEPTH;
        objArr4[1] = Integer.valueOf(agVar.f25311w);
        objArr[2] = objArr4;
        c(IronSourceConstants.RV_INSTANCE_CLOSED, agVar, objArr);
        com.ironsource.mediationsdk.utils.o.a().a(1);
        if (!agVar.c() && !this.f25551a.c(agVar)) {
            c(1001, agVar, null);
        }
        k(false);
        this.f25566n.onRewardedVideoAdClosed();
        u();
        Iterator<AbstractC1414b> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            AbstractC1414b next2 = it2.next();
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
            StringBuilder sb4 = new StringBuilder("Fetch on ad closed, iterating on: ");
            String str2 = next2.f25324e;
            String str3 = next2.f25324e;
            sb4.append(str2);
            sb4.append(", Status: ");
            sb4.append(next2.f25320a);
            ironSourceLoggerManager.log(ironSourceTag2, sb4.toString(), 0);
            AbstractC1414b.a aVar = next2.f25320a;
            if (aVar == AbstractC1414b.a.NOT_AVAILABLE || aVar == AbstractC1414b.a.NEEDS_RELOAD) {
                try {
                    if (!str3.equals(agVar.f25324e)) {
                        ironSourceLoggerManager.log(ironSourceTag2, str3 + ":reload smash", 1);
                        ((ag) next2).n();
                        c(1001, next2, null);
                    }
                } catch (Throwable th) {
                    IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.NATIVE;
                    StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str3, " Failed to call fetchVideo(), ");
                    l10.append(th.getLocalizedMessage());
                    ironSourceLoggerManager.log(ironSourceTag3, l10.toString(), 1);
                }
            }
        }
    }

    public final void c(int i10, AbstractC1414b abstractC1414b, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(abstractC1414b);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, providerAdditionalData));
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1415c
    public final void c_() {
        if (IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext()) && this.f25559j != null) {
            if (h(false, true)) {
                g(a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
            }
            k(true);
            CopyOnWriteArrayList<AbstractC1414b> copyOnWriteArrayList = this.f25553c;
            Iterator<AbstractC1414b> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                AbstractC1414b next = it.next();
                AbstractC1414b.a aVar = next.f25320a;
                if (aVar == AbstractC1414b.a.AVAILABLE || aVar == AbstractC1414b.a.NOT_AVAILABLE) {
                    next.a(AbstractC1414b.a.NEEDS_RELOAD);
                }
            }
            Iterator<AbstractC1414b> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                AbstractC1414b next2 = it2.next();
                AbstractC1414b.a aVar2 = next2.f25320a;
                String str = next2.f25324e;
                if (aVar2 == AbstractC1414b.a.NEEDS_RELOAD) {
                    try {
                        IronLog.INTERNAL.info(str + ":reload smash");
                        c(1001, next2, null);
                        ((ag) next2).n();
                    } catch (Throwable th) {
                        IronLog.INTERNAL.error(str + " Failed to call fetchVideo(), " + th.getLocalizedMessage());
                    }
                }
            }
            return;
        }
        IronLog.INTERNAL.info("while reloading mediation due to expiration, internet loss occurred");
        d(IronSourceConstants.TROUBLESHOOTING_RV_TRADITIONAL_RELOAD_FAILED_INTERNET_LOSS, null);
    }

    public final void d(int i10, Object[][] objArr) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, mediationAdditionalData));
    }

    public final void e(Context context, boolean z10) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, this.f25565m + " Should Track Network State: " + z10, 0);
        try {
            this.f25558i = z10;
            if (z10) {
                if (this.f25568q == null) {
                    this.f25568q = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f25568q, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f25568q != null) {
                context.getApplicationContext().unregisterReceiver(this.f25568q);
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    public final synchronized void f(AbstractC1414b abstractC1414b, int i10) {
        com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getCurrentActiveActivity(), this.f25569r);
        if (com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getCurrentActiveActivity(), t())) {
            d(IronSourceConstants.RV_CAP_PLACEMENT, new Object[][]{new Object[]{"placement", t()}});
        }
        this.f25551a.a(abstractC1414b);
        Placement placement = this.f25569r;
        if (placement != null) {
            if (this.f25567p) {
                i(placement.getPlacementId(), ((ag) abstractC1414b).y, true);
                int placementId = this.f25569r.getPlacementId();
                for (int i11 = 0; i11 < i10 && i11 < this.f25553c.size(); i11++) {
                    if (!this.f25572u.contains(this.f25553c.get(i11).f25320a)) {
                        i(placementId, ((ag) this.f25553c.get(i11)).y, false);
                    }
                }
            }
            String t10 = t();
            c(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, abstractC1414b, new Object[][]{new Object[]{"placement", t10}, new Object[]{"status", ep.Code}});
            for (int i12 = 0; i12 < this.f25553c.size() && i12 < i10; i12++) {
                AbstractC1414b abstractC1414b2 = this.f25553c.get(i12);
                AbstractC1414b.a aVar = abstractC1414b2.f25320a;
                if (aVar == AbstractC1414b.a.NOT_AVAILABLE || aVar == AbstractC1414b.a.NEEDS_RELOAD) {
                    c(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, abstractC1414b2, new Object[][]{new Object[]{"placement", t10}, new Object[]{"status", ep.V}});
                }
            }
        } else {
            this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
        c(1201, abstractC1414b, this.f25569r != null ? new Object[][]{new Object[]{"placement", t()}} : null);
        this.f25575x = true;
        this.y.a();
        ((ag) abstractC1414b).f25311w = com.ironsource.mediationsdk.utils.o.a().b(1);
        ag agVar = (ag) abstractC1414b;
        if (agVar.f25321b != null) {
            agVar.f25336s.log(IronSourceLogger.IronSourceTag.INTERNAL, agVar.f25324e + ":showRewardedVideo()", 1);
            agVar.e();
            agVar.f25321b.showRewardedVideo(agVar.f25308t, agVar);
        }
    }

    public final synchronized void g(Map<String, Object> map) {
        ag agVar = this.f25554d;
        if (agVar != null && !this.f25560k) {
            this.f25560k = true;
            if (m(agVar) == null) {
                this.f25566n.onRewardedVideoAvailabilityChanged(this.f25559j.booleanValue());
            }
        } else {
            if (!p()) {
                this.f25566n.a(this.f25559j.booleanValue(), map);
            } else if (h(true, false)) {
                this.f25566n.onRewardedVideoAvailabilityChanged(this.f25559j.booleanValue());
            }
        }
    }

    public final synchronized boolean h(boolean z10, boolean z11) {
        boolean z12;
        Boolean bool;
        Boolean bool2 = this.f25559j;
        z12 = true;
        if (bool2 == null) {
            d();
            if (z10) {
                bool = Boolean.TRUE;
            } else {
                if (!p() && n()) {
                    bool = Boolean.FALSE;
                }
                z12 = false;
            }
            this.f25559j = bool;
        } else {
            if (z10 && !bool2.booleanValue()) {
                bool = Boolean.TRUE;
            } else {
                if (!z10 && this.f25559j.booleanValue() && ((!o() || z11) && !p())) {
                    bool = Boolean.FALSE;
                }
                z12 = false;
            }
            this.f25559j = bool;
        }
        return z12;
    }

    public final synchronized void i(final int i10, String str, final boolean z10) {
        final String str2 = "";
        try {
            str2 = ("" + str) + "&sdkVersion=" + IronSourceUtils.getSDKVersion();
            Thread thread = new Thread(new Runnable() { // from class: com.ironsource.mediationsdk.server.b.1

                /* renamed from: s */
                public final /* synthetic */ String f25861s;

                /* renamed from: t */
                public final /* synthetic */ boolean f25862t;

                /* renamed from: u */
                public final /* synthetic */ int f25863u;

                public AnonymousClass1(final String str22, final boolean z102, final int i102) {
                    r1 = str22;
                    r2 = z102;
                    r3 = i102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str3 = r1;
                    boolean z11 = r2;
                    try {
                        new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str3, z11, r3)));
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NETWORK, "callRequestURL(reqUrl:" + str3 + ", hit:" + z11 + ")", 1);
                    } catch (Throwable th) {
                        StringBuilder sb2 = new StringBuilder("callRequestURL(reqUrl:");
                        if (str3 == null) {
                            sb2.append("null");
                        } else {
                            sb2.append(str3);
                        }
                        sb2.append(", hit:");
                        sb2.append(z11);
                        sb2.append(")");
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NETWORK, sb2.toString() + ", e:" + Log.getStackTraceString(th), 0);
                    }
                }
            }, "callAsyncRequestURL");
            thread.setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
            thread.start();
        } catch (Throwable th) {
            this.f25557h.logException(IronSourceLogger.IronSourceTag.NETWORK, "reportImpression:(providerURL:" + str22 + ", hit:" + z102 + ")", th);
        }
    }

    public final synchronized void j() {
        synchronized (this) {
            this.f25561l = false;
        }
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            if (next.equals(this.f25555e)) {
                next.a(AbstractC1414b.a.CAPPED_PER_SESSION);
                l();
                return;
            }
        }
    }

    public final void k(boolean z10) {
        boolean z11 = false;
        if (!z10 && c()) {
            d(1000, null);
            d(1003, new Object[][]{new Object[]{"duration", 0}});
            this.f25573v = false;
            return;
        }
        synchronized (this) {
            Iterator<AbstractC1414b> it = this.f25553c.iterator();
            while (it.hasNext()) {
                AbstractC1414b.a aVar = it.next().f25320a;
                if (aVar == AbstractC1414b.a.NOT_AVAILABLE || aVar == AbstractC1414b.a.NEEDS_RELOAD || aVar == AbstractC1414b.a.AVAILABLE || aVar == AbstractC1414b.a.INITIATED || aVar == AbstractC1414b.a.INIT_PENDING || aVar == AbstractC1414b.a.LOAD_PENDING) {
                    z11 = true;
                    break;
                }
            }
        }
        if (z11) {
            d(1000, null);
            this.f25573v = true;
            this.f25574w = e0.i.e();
        }
    }

    public final AbstractAdapter l() {
        AbstractAdapter abstractAdapter = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            CopyOnWriteArrayList<AbstractC1414b> copyOnWriteArrayList = this.f25553c;
            if (i10 >= copyOnWriteArrayList.size() || abstractAdapter != null) {
                break;
            }
            if (copyOnWriteArrayList.get(i10).f25320a != AbstractC1414b.a.AVAILABLE && copyOnWriteArrayList.get(i10).f25320a != AbstractC1414b.a.INITIATED) {
                if (copyOnWriteArrayList.get(i10).f25320a == AbstractC1414b.a.NOT_INITIATED && (abstractAdapter = m((ag) copyOnWriteArrayList.get(i10))) == null) {
                    copyOnWriteArrayList.get(i10).a(AbstractC1414b.a.INIT_FAILED);
                }
            } else {
                i11++;
                if (i11 >= this.f25552b) {
                    break;
                }
            }
            i10++;
        }
        return abstractAdapter;
    }

    public final synchronized AbstractAdapter m(ag agVar) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.NATIVE, this.f25565m + ":startAdapter(" + agVar.f25324e + ")", 1);
        C1416d a10 = C1416d.a();
        NetworkSettings networkSettings = agVar.f25322c;
        AbstractAdapter a11 = a10.a(networkSettings, networkSettings.getRewardedVideoSettings(), false, false);
        if (a11 == null) {
            this.f25557h.log(IronSourceLogger.IronSourceTag.API, agVar.f25324e + " is configured in IronSource's platform, but the adapter is not integrated", 2);
            return null;
        }
        agVar.f25321b = a11;
        agVar.a(AbstractC1414b.a.INITIATED);
        b((AbstractC1414b) agVar);
        c(1001, agVar, null);
        try {
            String str = this.f25556g;
            String str2 = this.f;
            try {
                agVar.f();
                Timer timer = new Timer();
                agVar.f25329k = timer;
                timer.schedule(new m0(agVar), agVar.f25313z * 1000);
            } catch (Exception e10) {
                agVar.b("startInitTimer", e10.getLocalizedMessage());
            }
            if (agVar.f25321b != null) {
                agVar.f25310v.set(true);
                agVar.f25312x = new Date().getTime();
                agVar.f25321b.addRewardedVideoListener(agVar);
                agVar.f25336s.log(IronSourceLogger.IronSourceTag.INTERNAL, agVar.f25324e + ":initRewardedVideo()", 1);
                agVar.f25321b.initRewardedVideo(str, str2, agVar.f25308t, null, agVar);
            }
            return a11;
        } catch (Throwable th) {
            this.f25557h.logException(IronSourceLogger.IronSourceTag.API, this.f25565m + "failed to init adapter: " + agVar.j() + "v", th);
            agVar.a(AbstractC1414b.a.INIT_FAILED);
            return null;
        }
    }

    public final synchronized boolean n() {
        int i10;
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        i10 = 0;
        while (it.hasNext()) {
            AbstractC1414b.a aVar = it.next().f25320a;
            if (aVar == AbstractC1414b.a.INIT_FAILED || aVar == AbstractC1414b.a.CAPPED_PER_DAY || aVar == AbstractC1414b.a.CAPPED_PER_SESSION || aVar == AbstractC1414b.a.NOT_AVAILABLE || aVar == AbstractC1414b.a.NEEDS_RELOAD || aVar == AbstractC1414b.a.EXHAUSTED) {
                i10++;
            }
        }
        if (this.f25553c.size() != i10) {
            return false;
        }
        return true;
    }

    public final synchronized boolean o() {
        boolean z10;
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().f25320a == AbstractC1414b.a.AVAILABLE) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        return z10;
    }

    public final synchronized boolean p() {
        ag agVar = this.f25554d;
        if (agVar != null) {
            return agVar.o();
        }
        return false;
    }

    public final synchronized void q() {
        if (l() != null) {
            return;
        }
        AbstractC1414b.a[] aVarArr = {AbstractC1414b.a.NOT_AVAILABLE, AbstractC1414b.a.NEEDS_RELOAD, AbstractC1414b.a.CAPPED_PER_SESSION, AbstractC1414b.a.CAPPED_PER_DAY};
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            for (int i11 = 0; i11 < 4; i11++) {
                if (next.f25320a == aVarArr[i11]) {
                    i10++;
                }
            }
        }
        if (i10 < this.f25553c.size()) {
            r();
        } else if (h(false, false)) {
            g((Map<String, Object>) null);
        }
    }

    public final synchronized void r() {
        boolean z10;
        synchronized (this) {
            Iterator<AbstractC1414b> it = this.f25553c.iterator();
            while (it.hasNext()) {
                AbstractC1414b.a aVar = it.next().f25320a;
                if (aVar == AbstractC1414b.a.NOT_INITIATED || aVar == AbstractC1414b.a.INITIATED || aVar == AbstractC1414b.a.AVAILABLE) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        if (z10) {
            this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Reset Iteration", 0);
            Iterator<AbstractC1414b> it2 = this.f25553c.iterator();
            boolean z11 = false;
            while (it2.hasNext()) {
                AbstractC1414b next = it2.next();
                if (next.f25320a == AbstractC1414b.a.EXHAUSTED) {
                    next.h();
                }
                if (next.f25320a == AbstractC1414b.a.AVAILABLE) {
                    z11 = true;
                }
            }
            this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, "End of Reset Iteration", 0);
            if (h(z11, false)) {
                this.f25566n.onRewardedVideoAvailabilityChanged(this.f25559j.booleanValue());
            }
        }
    }

    public final void s() {
        CopyOnWriteArrayList<AbstractC1414b> copyOnWriteArrayList;
        int i10 = 0;
        while (true) {
            copyOnWriteArrayList = this.f25553c;
            if (i10 < copyOnWriteArrayList.size()) {
                String providerTypeForReflection = copyOnWriteArrayList.get(i10).f25322c.getProviderTypeForReflection();
                if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                    break;
                } else {
                    i10++;
                }
            } else {
                return;
            }
        }
        C1416d.a().a(copyOnWriteArrayList.get(i10).f25322c, copyOnWriteArrayList.get(i10).f25322c.getRewardedVideoSettings(), false, false);
    }

    public final String t() {
        Placement placement = this.f25569r;
        if (placement == null) {
            return "";
        }
        return placement.getPlacementName();
    }

    public final void u() {
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        long j10 = Long.MAX_VALUE;
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            if (next.f25320a == AbstractC1414b.a.AVAILABLE && next.l() != null && next.l().longValue() < j10) {
                j10 = next.l().longValue();
            }
        }
        if (j10 != Long.MAX_VALUE) {
            this.y.a(System.currentTimeMillis() - j10);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public final void c(ag agVar) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, a3.l.p(new StringBuilder(), agVar.f25324e, ":onRewardedVideoAdStarted()"), 1);
        c(IronSourceConstants.RV_INSTANCE_STARTED, agVar, new Object[][]{new Object[]{"placement", t()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(agVar.f25311w)}});
        this.f25566n.onRewardedVideoAdStarted();
    }

    public final void d() {
        if (this.f25571t <= 0) {
            this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, "load interval is not set, ignoring", 1);
            return;
        }
        Timer timer = this.f25570s;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f25570s = timer2;
        timer2.schedule(new a(), this.f25571t * 1000);
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public final void e(ag agVar) {
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        String p10 = a3.l.p(new StringBuilder(), agVar.f25324e, ":onRewardedVideoAdRewarded()");
        IronSourceLoggerManager ironSourceLoggerManager = this.f25557h;
        ironSourceLoggerManager.log(ironSourceTag, p10, 1);
        if (this.f25569r == null) {
            this.f25569r = L.a().f24865r.f25936c.f25674a.a();
        }
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(agVar);
        try {
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, agVar.f25311w);
            if (this.f25569r != null) {
                providerAdditionalData.put("placement", t());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f25569r.getRewardName());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, this.f25569r.getRewardAmount());
            } else {
                ironSourceLoggerManager.log(ironSourceTag, "mCurrentPlacement is null", 3);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.a.c cVar = new com.ironsource.mediationsdk.a.c(1010, providerAdditionalData);
        if (!TextUtils.isEmpty(this.f25556g)) {
            cVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(cVar.b(), agVar.j()));
            if (!TextUtils.isEmpty(L.a().f24861m)) {
                cVar.a(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, L.a().f24861m);
            }
            Map<String, String> map = L.a().f24862n;
            if (map != null) {
                for (String str : map.keySet()) {
                    cVar.a(s.f.b("custom_", str), map.get(str));
                }
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(cVar);
        Placement placement = this.f25569r;
        if (placement != null) {
            this.f25566n.onRewardedVideoAdRewarded(placement);
        } else {
            ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public final void f(ag agVar) {
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        String p10 = a3.l.p(new StringBuilder(), agVar.f25324e, ":onRewardedVideoAdClicked()");
        IronSourceLoggerManager ironSourceLoggerManager = this.f25557h;
        ironSourceLoggerManager.log(ironSourceTag, p10, 1);
        if (this.f25569r == null) {
            this.f25569r = L.a().f24865r.f25936c.f25674a.a();
        }
        if (this.f25569r == null) {
            ironSourceLoggerManager.log(ironSourceTag, "mCurrentPlacement is null", 3);
        } else {
            c(1006, agVar, new Object[][]{new Object[]{"placement", t()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(agVar.f25311w)}});
            this.f25566n.onRewardedVideoAdClicked(this.f25569r);
        }
    }

    @Override // com.ironsource.mediationsdk.utils.d
    public final void g() {
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            if (next.f25320a == AbstractC1414b.a.CAPPED_PER_DAY) {
                c(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, next, new Object[][]{new Object[]{"status", ep.V}});
                next.a(AbstractC1414b.a.NOT_AVAILABLE);
                if (((ag) next).o() && next.d()) {
                    next.a(AbstractC1414b.a.AVAILABLE);
                    z10 = true;
                }
            }
        }
        if (z10 && h(true, false)) {
            this.f25566n.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public final void d(ag agVar) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, a3.l.p(new StringBuilder(), agVar.f25324e, ":onRewardedVideoAdEnded()"), 1);
        c(IronSourceConstants.RV_INSTANCE_ENDED, agVar, new Object[][]{new Object[]{"placement", t()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(agVar.f25311w)}});
        this.f25566n.onRewardedVideoAdEnded();
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public final void g(ag agVar) {
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        String p10 = a3.l.p(new StringBuilder(), agVar.f25324e, ":onRewardedVideoAdVisible()");
        IronSourceLoggerManager ironSourceLoggerManager = this.f25557h;
        ironSourceLoggerManager.log(ironSourceTag, p10, 1);
        if (this.f25569r != null) {
            c(IronSourceConstants.RV_INSTANCE_VISIBLE, agVar, new Object[][]{new Object[]{"placement", t()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(agVar.f25311w)}});
        } else {
            ironSourceLoggerManager.log(ironSourceTag, "mCurrentPlacement is null", 3);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public final void a(IronSourceError ironSourceError, ag agVar) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, agVar.f25324e + ":onRewardedVideoAdShowFailed(" + ironSourceError + ")", 1);
        this.f25575x = false;
        c(1202, agVar, new Object[][]{new Object[]{"placement", t()}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(agVar.f25311w)}});
        k(false);
        this.f25566n.onRewardedVideoAdShowFailed(ironSourceError);
    }

    public final synchronized void a(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f25557h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        boolean z10 = true;
        ironSourceLoggerManager.log(ironSourceTag, this.f25565m + ":showRewardedVideo(placementName: " + str + ")", 1);
        this.f25566n.f = str;
        d(1100, new Object[][]{new Object[]{"placement", str}});
        if (this.f25575x) {
            this.f25557h.log(ironSourceTag, "showRewardedVideo error: can't show ad while an ad is already showing", 3);
            this.f25566n.onRewardedVideoAdShowFailed(new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing"));
            return;
        }
        if (this.f25558i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            this.f25557h.log(ironSourceTag, "showRewardedVideo error: can't show ad when there's no internet connection", 3);
            this.f25566n.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < this.f25553c.size(); i10++) {
            AbstractC1414b abstractC1414b = this.f25553c.get(i10);
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f25557h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager2.log(ironSourceTag2, "showRewardedVideo, iterating on: " + abstractC1414b.f25324e + ", Status: " + abstractC1414b.f25320a, 0);
            if (abstractC1414b.f25320a == AbstractC1414b.a.AVAILABLE) {
                if (((ag) abstractC1414b).o()) {
                    f(abstractC1414b, i10);
                    if (this.f25561l && !abstractC1414b.equals(this.f25555e)) {
                        j();
                    }
                    if (abstractC1414b.c()) {
                        abstractC1414b.a(AbstractC1414b.a.CAPPED_PER_SESSION);
                        c(IronSourceConstants.RV_CAP_SESSION, abstractC1414b, null);
                        q();
                        return;
                    } else if (this.f25551a.c(abstractC1414b)) {
                        abstractC1414b.a(AbstractC1414b.a.CAPPED_PER_DAY);
                        c(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, abstractC1414b, new Object[][]{new Object[]{"status", ep.Code}});
                        q();
                        return;
                    } else {
                        if (abstractC1414b.f25328j < abstractC1414b.o) {
                            z10 = false;
                        }
                        if (z10) {
                            l();
                            r();
                        }
                        return;
                    }
                }
                if (abstractC1414b.m() != null) {
                    stringBuffer.append(abstractC1414b.f25324e + com.huawei.openalliance.ad.constant.w.bE + abstractC1414b.m() + ",");
                }
                a(false, (ag) abstractC1414b);
                Exception exc = new Exception("FailedToShowVideoException");
                this.f25557h.logException(ironSourceTag2, abstractC1414b.f25324e + " Failed to show video", exc);
            }
        }
        if (p()) {
            f(this.f25554d, this.f25553c.size());
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
        this.f25566n.a(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT), hashMap);
    }

    public final synchronized boolean c() {
        this.f25557h.log(IronSourceLogger.IronSourceTag.API, this.f25565m + ":isRewardedVideoAvailable()", 1);
        if (this.f25558i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            if (next.d() && ((ag) next).o()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void a(String str, String str2) {
        this.f25557h.log(IronSourceLogger.IronSourceTag.API, this.f25565m + ":initRewardedVideo(appKey: " + str + ", userId: " + str2 + ")", 1);
        long time = new Date().getTime();
        d(IronSourceConstants.RV_MANAGER_INIT_STARTED, null);
        this.f25556g = str;
        this.f = str2;
        Iterator<AbstractC1414b> it = this.f25553c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            AbstractC1414b next = it.next();
            if (this.f25551a.b(next)) {
                c(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, next, new Object[][]{new Object[]{"status", ep.V}});
            }
            if (this.f25551a.c(next)) {
                next.a(AbstractC1414b.a.CAPPED_PER_DAY);
                i10++;
            }
        }
        if (i10 == this.f25553c.size()) {
            this.f25566n.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        d(1000, null);
        this.f25566n.f = null;
        this.f25573v = true;
        this.f25574w = new Date().getTime();
        d(IronSourceConstants.RV_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
        s();
        for (int i11 = 0; i11 < this.f25552b && i11 < this.f25553c.size() && l() != null; i11++) {
        }
    }

    @Override // com.ironsource.environment.j
    public final void a(boolean z10) {
        Boolean bool;
        if (this.f25558i) {
            boolean z11 = false;
            this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z10, 0);
            Boolean bool2 = this.f25559j;
            if (bool2 != null) {
                if (z10 && !bool2.booleanValue() && o()) {
                    bool = Boolean.TRUE;
                } else if (!z10 && this.f25559j.booleanValue()) {
                    bool = Boolean.FALSE;
                }
                this.f25559j = bool;
                z11 = true;
            }
            if (z11) {
                this.o = !z10;
                this.f25566n.onRewardedVideoAvailabilityChanged(z10);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public final synchronized void a(boolean z10, ag agVar) {
        boolean z11;
        IronSourceLoggerManager ironSourceLoggerManager = this.f25557h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, agVar.f25324e + ": onRewardedVideoAvailabilityChanged(available:" + z10 + ")", 1);
        if (this.o) {
            return;
        }
        if (z10 && this.f25573v) {
            this.f25573v = false;
            d(1003, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f25574w)}});
            u();
        }
        try {
        } catch (Throwable th) {
            this.f25557h.logException(IronSourceLogger.IronSourceTag.INTERNAL, "onRewardedVideoAvailabilityChanged(available:" + z10 + ", provider:" + agVar.j() + ")", th);
        }
        if (agVar.equals(this.f25554d)) {
            if (h(z10, false)) {
                this.f25566n.onRewardedVideoAvailabilityChanged(this.f25559j.booleanValue());
            }
            return;
        }
        if (agVar.equals(this.f25555e)) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f25557h;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(agVar.f25324e);
            sb2.append(" is a premium adapter, canShowPremium: ");
            synchronized (this) {
                sb2.append(this.f25561l);
                ironSourceLoggerManager2.log(ironSourceTag, sb2.toString(), 1);
                synchronized (this) {
                    z11 = this.f25561l;
                }
                return;
            }
            if (!z11) {
                agVar.a(AbstractC1414b.a.CAPPED_PER_SESSION);
                if (h(false, false)) {
                    this.f25566n.onRewardedVideoAvailabilityChanged(this.f25559j.booleanValue());
                }
                return;
            }
        }
        if (!this.f25551a.c(agVar)) {
            if (!z10 || !agVar.d()) {
                if (h(false, false)) {
                    g((Map<String, Object>) null);
                }
                l();
                r();
            } else if (h(true, false)) {
                this.f25566n.onRewardedVideoAvailabilityChanged(this.f25559j.booleanValue());
            }
        }
    }
}
