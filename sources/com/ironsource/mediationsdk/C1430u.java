package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1430u {

    /* renamed from: e, reason: collision with root package name */
    public static final C1430u f25867e = new C1430u();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25868a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f25869b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public int f25870c;

    /* renamed from: d, reason: collision with root package name */
    public int f25871d;

    /* renamed from: com.ironsource.mediationsdk.u$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSource.AD_UNIT f25872s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25873t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f25874u;

        public a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, String str) {
            this.f25872s = ad_unit;
            this.f25873t = ironSourceError;
            this.f25874u = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            C1430u c1430u = C1430u.f25867e;
            IronSource.AD_UNIT ad_unit = this.f25872s;
            IronSourceError ironSourceError = this.f25873t;
            C1430u c1430u2 = C1430u.this;
            c1430u2.b(ad_unit, ironSourceError);
            c1430u2.f25869b.put(this.f25874u, Boolean.FALSE);
        }
    }

    private C1430u() {
    }

    public static synchronized C1430u a() {
        C1430u c1430u;
        synchronized (C1430u.class) {
            c1430u = f25867e;
        }
        return c1430u;
    }

    public final void b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.f25868a.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().a(ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().a(ironSourceError);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
    }

    public final void a(IronSource.AD_UNIT ad_unit, int i10) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f25870c = i10;
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f25871d = i10;
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
    }

    public final synchronized void a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        int i10;
        if (a(ad_unit)) {
            return;
        }
        String ad_unit2 = ad_unit.toString();
        if (!this.f25868a.containsKey(ad_unit2)) {
            b(ad_unit, ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            i10 = this.f25870c;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            i10 = this.f25871d;
        } else {
            IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
            i10 = 0;
        }
        long j10 = i10 * 1000;
        long currentTimeMillis = System.currentTimeMillis() - ((Long) this.f25868a.get(ad_unit2)).longValue();
        if (currentTimeMillis > j10) {
            b(ad_unit, ironSourceError);
            return;
        }
        this.f25869b.put(ad_unit2, Boolean.TRUE);
        long j11 = j10 - currentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j11);
        com.ironsource.environment.e.c.a(new a(ad_unit, ironSourceError, ad_unit2), j11);
    }

    public final synchronized boolean a(IronSource.AD_UNIT ad_unit) {
        if (!this.f25869b.containsKey(ad_unit.toString())) {
            return false;
        }
        return ((Boolean) this.f25869b.get(ad_unit.toString())).booleanValue();
    }
}
