package com.ironsource.mediationsdk.adunit.e;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class a<Smash extends c<?>> {

    /* renamed from: d, reason: collision with root package name */
    public c<?> f25263d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f25264e;
    public final int f;

    /* renamed from: h, reason: collision with root package name */
    public final b f25266h;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f25260a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public String f25261b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f25262c = "";

    /* renamed from: g, reason: collision with root package name */
    public final Timer f25265g = new Timer();

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap<String, AdInfo> f25267i = new ConcurrentHashMap<>();

    /* renamed from: com.ironsource.mediationsdk.adunit.e.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0329a extends TimerTask {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25268s;

        public C0329a(String str) {
            this.f25268s = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            String str = this.f25268s;
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + str + " from memory");
                aVar.f25260a.remove(str);
                ironLog.verbose("waterfall size is currently " + aVar.f25260a.size());
                ironLog.verbose("removing adInfo with id " + str + " from memory");
                aVar.f25267i.remove(str);
                ironLog.verbose("adInfo size is currently " + aVar.f25267i.size());
            } finally {
                cancel();
            }
        }
    }

    public a(List<String> list, int i10, b bVar) {
        this.f25264e = list;
        this.f = i10;
        this.f25266h = bVar;
    }

    public final AdInfo a(String str) {
        ConcurrentHashMap<String, AdInfo> concurrentHashMap = this.f25267i;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public final CopyOnWriteArrayList<Smash> a() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f25260a.get(this.f25261b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final void a(a.EnumC0328a enumC0328a, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        boolean z10;
        IronLog.INTERNAL.verbose("updating new waterfall with id " + str);
        Iterator<Smash> it = a().iterator();
        while (it.hasNext()) {
            Smash next = it.next();
            if (!next.equals(this.f25263d)) {
                next.c();
            }
        }
        if (enumC0328a == a.EnumC0328a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f25260a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f25262c)) {
                synchronized (this) {
                    c<?> cVar = this.f25263d;
                    if (cVar != null && cVar.p()) {
                        z10 = this.f25263d.o().equals(this.f25262c);
                    }
                }
                if (z10) {
                    IronLog ironLog = IronLog.INTERNAL;
                    StringBuilder sb2 = new StringBuilder("ad from previous waterfall ");
                    sb2.append(this.f25262c);
                    sb2.append(" is still showing - the current waterfall ");
                    com.ironsource.adapters.facebook.a.r(sb2, this.f25261b, " will be deleted instead", ironLog);
                    String str2 = this.f25261b;
                    this.f25261b = this.f25262c;
                    this.f25262c = str2;
                }
                this.f25265g.schedule(new C0329a(this.f25262c), this.f);
            }
        } else {
            this.f25260a.clear();
            this.f25260a.put(str, copyOnWriteArrayList);
        }
        this.f25262c = this.f25261b;
        this.f25261b = str;
        if (this.f25260a.size() > 5) {
            this.f25266h.a(this.f25260a.size());
        }
    }

    public final synchronized void a(c<?> cVar) {
        IronLog.INTERNAL.verbose("");
        c<?> cVar2 = this.f25263d;
        if (cVar2 != null && !cVar2.equals(cVar)) {
            synchronized (this) {
                c<?> cVar3 = this.f25263d;
                if (cVar3 != null) {
                    cVar3.c();
                }
            }
        }
        this.f25263d = cVar;
    }

    public final void a(String str, ImpressionData impressionData) {
        if (TextUtils.isEmpty(str) || impressionData == null) {
            return;
        }
        this.f25267i.put(str, new AdInfo(impressionData));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0021, code lost:
    
        if (r2.f25263d.k().equals(r4) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a(com.ironsource.mediationsdk.adunit.c.b.a.EnumC0328a r3, java.lang.String r4, java.lang.String r5, com.ironsource.mediationsdk.LoadWhileShowSupportState r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = com.ironsource.mediationsdk.adunit.c.b.a.EnumC0328a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch: java.lang.Throwable -> L58
            r1 = 1
            if (r3 == r0) goto L7
            goto L3e
        L7:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r3 = r2.f25263d     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L3e
            boolean r3 = r3.p()     // Catch: java.lang.Throwable -> L58
            if (r3 != 0) goto L12
            goto L3e
        L12:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r3 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch: java.lang.Throwable -> L58
            r0 = 0
            if (r6 != r3) goto L25
            com.ironsource.mediationsdk.adunit.d.a.c<?> r3 = r2.f25263d     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r3.k()     // Catch: java.lang.Throwable -> L58
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L25
        L23:
            r1 = r0
            goto L3e
        L25:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r3 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch: java.lang.Throwable -> L58
            if (r6 == r3) goto L31
            java.util.List<java.lang.String> r3 = r2.f25264e     // Catch: java.lang.Throwable -> L58
            boolean r3 = r3.contains(r5)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L3e
        L31:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r3 = r2.f25263d     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r3.n()     // Catch: java.lang.Throwable -> L58
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L3e
            goto L23
        L3e:
            if (r1 != 0) goto L56
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r5.<init>()     // Catch: java.lang.Throwable -> L58
            r5.append(r4)     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = " does not support load while show and will not be added to the auction request"
            r5.append(r4)     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L58
            r3.verbose(r4)     // Catch: java.lang.Throwable -> L58
        L56:
            monitor-exit(r2)
            return r1
        L58:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.e.a.a(com.ironsource.mediationsdk.adunit.c.b.a$a, java.lang.String, java.lang.String, com.ironsource.mediationsdk.LoadWhileShowSupportState):boolean");
    }
}
