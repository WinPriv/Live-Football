package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class P {

    /* renamed from: d, reason: collision with root package name */
    public N f24902d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f24903e;
    public final int f;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<N>> f24899a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public String f24900b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f24901c = "";

    /* renamed from: g, reason: collision with root package name */
    public final Timer f24904g = new Timer();

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap<String, AdInfo> f24905h = new ConcurrentHashMap<>();

    /* loaded from: classes2.dex */
    public class a extends TimerTask {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f24906s;

        public a(String str) {
            this.f24906s = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            P p10 = P.this;
            String str = this.f24906s;
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + str + " from memory");
                p10.f24899a.remove(str);
                ironLog.verbose("waterfall size is currently " + p10.f24899a.size());
                ironLog.verbose("removing adInfo with id " + str + " from memory");
                p10.f24905h.remove(str);
                ironLog.verbose("adInfo size is currently " + p10.f24905h.size());
            } finally {
                cancel();
            }
        }
    }

    public P(List<String> list, int i10) {
        this.f24903e = list;
        this.f = i10;
    }

    public final AdInfo a(String str) {
        ConcurrentHashMap<String, AdInfo> concurrentHashMap = this.f24905h;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public final boolean b() {
        return this.f24899a.size() > 5;
    }

    public final CopyOnWriteArrayList<N> a() {
        CopyOnWriteArrayList<N> copyOnWriteArrayList = this.f24899a.get(this.f24900b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final synchronized boolean b(N n10) {
        boolean z10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (n10 != null && (this.f24902d == null || ((n10.b() != LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK || !this.f24902d.k().equals(n10.k())) && ((n10.b() != LoadWhileShowSupportState.NONE && !this.f24903e.contains(n10.l())) || !this.f24902d.l().equals(n10.l()))))) {
            z10 = false;
            if (z10 && n10 != null) {
                ironLog.verbose(n10.k() + " does not support load while show and will not be added to the auction request");
            }
        }
        z10 = true;
        if (z10) {
            ironLog.verbose(n10.k() + " does not support load while show and will not be added to the auction request");
        }
        return !z10;
    }

    public final synchronized void a(N n10) {
        IronLog.INTERNAL.verbose("");
        N n11 = this.f24902d;
        if (n11 != null && !n11.equals(n10)) {
            this.f24902d.c();
        }
        this.f24902d = n10;
    }

    public final void a(String str, ImpressionData impressionData) {
        if (TextUtils.isEmpty(str) || impressionData == null) {
            return;
        }
        this.f24905h.put(str, new AdInfo(impressionData));
    }

    public final void a(CopyOnWriteArrayList<N> copyOnWriteArrayList, String str) {
        boolean z10;
        IronLog.INTERNAL.verbose("updating new waterfall with id " + str);
        Iterator<N> it = a().iterator();
        while (it.hasNext()) {
            N next = it.next();
            if (!next.equals(this.f24902d)) {
                next.c();
            }
        }
        this.f24899a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f24901c)) {
            synchronized (this) {
                N n10 = this.f24902d;
                if (n10 != null) {
                    z10 = n10.f24884p.equals(this.f24901c);
                }
            }
            if (z10) {
                IronLog ironLog = IronLog.INTERNAL;
                StringBuilder sb2 = new StringBuilder("ad from previous waterfall ");
                sb2.append(this.f24901c);
                sb2.append(" is still showing - the current waterfall ");
                com.ironsource.adapters.facebook.a.r(sb2, this.f24900b, " will be deleted instead", ironLog);
                String str2 = this.f24900b;
                this.f24900b = this.f24901c;
                this.f24901c = str2;
            }
            this.f24904g.schedule(new a(this.f24901c), this.f);
        }
        this.f24901c = this.f24900b;
        this.f24900b = str;
    }
}
