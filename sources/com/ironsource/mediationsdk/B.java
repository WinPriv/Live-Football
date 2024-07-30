package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final b f24751a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final int f24752b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1415c f24753c;

    /* renamed from: d, reason: collision with root package name */
    public com.ironsource.lifecycle.f f24754d;

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC1415c interfaceC1415c = B.this.f24753c;
            if (interfaceC1415c != null) {
                interfaceC1415c.c_();
            }
        }
    }

    public B(int i10, InterfaceC1415c interfaceC1415c) {
        this.f24752b = 0;
        this.f24753c = interfaceC1415c;
        this.f24752b = i10;
    }

    public final void a() {
        if (!(this.f24752b > 0) || this.f24754d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f24754d.c();
        this.f24754d = null;
    }

    public final void a(long j10) {
        int i10 = this.f24752b;
        if (i10 > 0) {
            long millis = TimeUnit.MINUTES.toMillis(i10) - Math.max(j10, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f24753c.c_();
                return;
            }
            a();
            this.f24754d = new com.ironsource.lifecycle.f(millis, this.f24751a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format("%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }
}
