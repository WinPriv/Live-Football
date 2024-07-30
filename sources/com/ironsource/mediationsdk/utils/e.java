package com.ironsource.mediationsdk.utils;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public final String f25910e;

    /* renamed from: g, reason: collision with root package name */
    public final d f25911g;
    public Timer f = null;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, Integer> f25906a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f25907b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f25909d = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public IronSourceLoggerManager f25908c = IronSourceLoggerManager.getLogger();

    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            synchronized (eVar) {
                try {
                    Iterator<String> it = eVar.f25906a.keySet().iterator();
                    while (it.hasNext()) {
                        eVar.b(it.next());
                    }
                    eVar.f25911g.g();
                    eVar.a();
                } catch (Exception e10) {
                    eVar.f25908c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "onTimerTick", e10);
                }
            }
        }
    }

    public e(String str, d dVar) {
        this.f25910e = str;
        this.f25911g = dVar;
        a();
    }

    public static String d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    public static String g(String str) {
        return com.ironsource.adapters.facebook.a.h(str, "_counter");
    }

    public static String h(String str) {
        return com.ironsource.adapters.facebook.a.h(str, "_day");
    }

    public final void a() {
        Timer timer = this.f;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f = timer2;
        a aVar = new a();
        Random random = new Random();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, random.nextInt(10));
        gregorianCalendar.set(13, random.nextInt(60));
        gregorianCalendar.set(14, random.nextInt(1000));
        gregorianCalendar.add(5, 1);
        timer2.schedule(aVar, gregorianCalendar.getTime());
    }

    public final void b(String str) {
        this.f25907b.put(str, 0);
        this.f25909d.put(str, d());
        IronSourceUtils.g(ContextProvider.getInstance().getApplicationContext(), 0, g(str));
        IronSourceUtils.i(ContextProvider.getInstance().getApplicationContext(), h(str), d());
    }

    public final void c(String str, int i10) {
        this.f25907b.put(str, Integer.valueOf(i10));
        this.f25909d.put(str, d());
        IronSourceUtils.g(ContextProvider.getInstance().getApplicationContext(), i10, g(str));
        IronSourceUtils.i(ContextProvider.getInstance().getApplicationContext(), h(str), d());
    }

    public final String e(String str) {
        HashMap hashMap = this.f25909d;
        if (hashMap.containsKey(str)) {
            return (String) hashMap.get(str);
        }
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        String h10 = h(str);
        String d10 = d();
        int i10 = IronSourceUtils.NOT_SAVED_NUMBER_SHARED_PREFERENCE;
        String string = applicationContext.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(h10, d10);
        hashMap.put(str, string);
        return string;
    }

    public final int f(String str) {
        HashMap hashMap = this.f25907b;
        if (hashMap.containsKey(str)) {
            return ((Integer) hashMap.get(str)).intValue();
        }
        int e10 = IronSourceUtils.e(ContextProvider.getInstance().getApplicationContext(), g(str));
        hashMap.put(str, Integer.valueOf(e10));
        return e10;
    }

    public final boolean b(AbstractC1414b abstractC1414b) {
        synchronized (this) {
            try {
                try {
                    String d10 = d(abstractC1414b);
                    if (!this.f25906a.containsKey(d10)) {
                        return false;
                    }
                    if (d().equalsIgnoreCase(e(d10))) {
                        return false;
                    }
                    return this.f25906a.get(d10).intValue() <= f(d10);
                } catch (Exception e10) {
                    this.f25908c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "shouldSendCapReleasedEvent", e10);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(AbstractC1414b abstractC1414b) {
        synchronized (this) {
            try {
                try {
                    String d10 = d(abstractC1414b);
                    if (!this.f25906a.containsKey(d10)) {
                        return false;
                    }
                    int intValue = this.f25906a.get(d10).intValue();
                    if (!d().equalsIgnoreCase(e(d10))) {
                        b(d10);
                    }
                    return intValue <= f(d10);
                } catch (Exception e10) {
                    this.f25908c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "isCapped", e10);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d(AbstractC1414b abstractC1414b) {
        return this.f25910e + "_" + abstractC1414b.f + "_" + abstractC1414b.j();
    }

    public final void a(AbstractC1414b abstractC1414b) {
        String d10;
        synchronized (this) {
            try {
                try {
                    d10 = d(abstractC1414b);
                } catch (Exception e10) {
                    this.f25908c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "increaseShowCounter", e10);
                }
                if (this.f25906a.containsKey(d10)) {
                    if (!d().equalsIgnoreCase(e(d10))) {
                        b(d10);
                    }
                    c(d10, f(d10) + 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
