package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Timer;

/* renamed from: com.ironsource.mediationsdk.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1414b {

    /* renamed from: b, reason: collision with root package name */
    public AbstractAdapter f25321b;

    /* renamed from: c, reason: collision with root package name */
    public final NetworkSettings f25322c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25323d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25324e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f25325g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25326h;

    /* renamed from: k, reason: collision with root package name */
    public Timer f25329k;

    /* renamed from: l, reason: collision with root package name */
    public Timer f25330l;

    /* renamed from: m, reason: collision with root package name */
    public int f25331m;

    /* renamed from: n, reason: collision with root package name */
    public int f25332n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f25333p;

    /* renamed from: j, reason: collision with root package name */
    public int f25328j = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f25327i = 0;

    /* renamed from: a, reason: collision with root package name */
    public a f25320a = a.NOT_INITIATED;

    /* renamed from: s, reason: collision with root package name */
    public final IronSourceLoggerManager f25336s = IronSourceLoggerManager.getLogger();

    /* renamed from: q, reason: collision with root package name */
    public Long f25334q = null;

    /* renamed from: r, reason: collision with root package name */
    public Long f25335r = null;

    /* renamed from: com.ironsource.mediationsdk.b$a */
    /* loaded from: classes2.dex */
    public enum a {
        NOT_INITIATED(0),
        INIT_FAILED(1),
        INITIATED(2),
        AVAILABLE(3),
        NOT_AVAILABLE(4),
        EXHAUSTED(5),
        CAPPED_PER_SESSION(6),
        INIT_PENDING(7),
        LOAD_PENDING(8),
        CAPPED_PER_DAY(9),
        NEEDS_RELOAD(10);


        /* renamed from: l, reason: collision with root package name */
        public int f25351l;

        a(int i10) {
            this.f25351l = i10;
        }
    }

    public AbstractC1414b(NetworkSettings networkSettings) {
        this.f25323d = networkSettings.getProviderTypeForReflection();
        this.f25324e = networkSettings.getProviderInstanceName();
        this.f25326h = networkSettings.isMultipleInstances();
        this.f25322c = networkSettings;
        this.f = networkSettings.getSubProviderId();
        this.f25325g = networkSettings.getAdSourceNameForEvents();
    }

    public final synchronized void a(a aVar) {
        if (this.f25320a == aVar) {
            return;
        }
        this.f25320a = aVar;
        this.f25336s.log(IronSourceLogger.IronSourceTag.INTERNAL, "Smart Loading - " + this.f25324e + " state changed to " + aVar.toString(), 0);
        AbstractAdapter abstractAdapter = this.f25321b;
        if (abstractAdapter != null && (aVar == a.CAPPED_PER_SESSION || aVar == a.CAPPED_PER_DAY)) {
            abstractAdapter.setMediationState(aVar, i());
        }
    }

    public final void b(String str, String str2) {
        this.f25336s.log(IronSourceLogger.IronSourceTag.INTERNAL, a3.k.m(com.ironsource.adapters.facebook.a.l(str, " exception: "), this.f25324e, " | ", str2), 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        if (this.f25327i >= this.f25333p) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        boolean z10;
        boolean z11;
        if (this.f25328j >= this.o) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !c()) {
            if (this.f25320a == a.CAPPED_PER_DAY) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        boolean z10 = true;
        this.f25328j++;
        this.f25327i++;
        if (c()) {
            a(a.CAPPED_PER_SESSION);
            return;
        }
        if (this.f25328j < this.o) {
            z10 = false;
        }
        if (z10) {
            a(a.EXHAUSTED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        try {
            Timer timer = this.f25329k;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            b("stopInitTimer", e10.getLocalizedMessage());
        } finally {
            this.f25329k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        try {
            Timer timer = this.f25330l;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            b("stopLoadTimer", e10.getLocalizedMessage());
        } finally {
            this.f25330l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void h();

    public abstract String i();

    public final String j() {
        if (this.f25326h) {
            return this.f25323d;
        }
        return this.f25324e;
    }

    public final Long l() {
        return this.f25334q;
    }

    public final Long m() {
        return this.f25335r;
    }
}
