package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1425o {

    /* renamed from: d, reason: collision with root package name */
    public static C1425o f25759d;

    /* renamed from: a, reason: collision with root package name */
    public long f25760a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25761b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f25762c;

    /* renamed from: com.ironsource.mediationsdk.o$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IronSourceBannerLayout f25763s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25764t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f25765u;

        public a(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError, boolean z10) {
            this.f25763s = ironSourceBannerLayout;
            this.f25764t = ironSourceError;
            this.f25765u = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1425o c1425o = C1425o.this;
            c1425o.getClass();
            IronSourceBannerLayout ironSourceBannerLayout = this.f25763s;
            if (ironSourceBannerLayout != null) {
                c1425o.f25760a = System.currentTimeMillis();
                c1425o.f25761b = false;
                com.ironsource.environment.e.c.f24668a.b(new a0(ironSourceBannerLayout, this.f25764t, this.f25765u));
            }
        }
    }

    private C1425o() {
    }

    public static synchronized C1425o a() {
        C1425o c1425o;
        synchronized (C1425o.class) {
            if (f25759d == null) {
                f25759d = new C1425o();
            }
            c1425o = f25759d;
        }
        return c1425o;
    }

    public final boolean b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f25761b;
        }
        return z10;
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
        a(ironSourceBannerLayout, ironSourceError, false);
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError, boolean z10) {
        synchronized (this) {
            if (this.f25761b) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f25760a;
            long j10 = this.f25762c * 1000;
            if (currentTimeMillis > j10) {
                if (ironSourceBannerLayout != null) {
                    this.f25760a = System.currentTimeMillis();
                    this.f25761b = false;
                    com.ironsource.environment.e.c.f24668a.b(new a0(ironSourceBannerLayout, ironSourceError, z10));
                }
                return;
            }
            this.f25761b = true;
            long j11 = j10 - currentTimeMillis;
            IronLog.INTERNAL.verbose("delaying callback by " + j11);
            com.ironsource.environment.e.c.b(new a(ironSourceBannerLayout, ironSourceError, z10), j11);
        }
    }
}
