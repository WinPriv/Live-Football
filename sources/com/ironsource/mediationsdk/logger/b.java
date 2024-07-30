package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes2.dex */
public final class b extends IronSourceLogger {

    /* renamed from: c, reason: collision with root package name */
    public LogListener f25586c;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25587s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ IronSourceLogger.IronSourceTag f25588t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f25589u;

        public a(String str, IronSourceLogger.IronSourceTag ironSourceTag, int i10) {
            this.f25587s = str;
            this.f25588t = ironSourceTag;
            this.f25589u = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            LogListener logListener = b.this.f25586c;
            if (logListener != null && (str = this.f25587s) != null) {
                logListener.onLog(this.f25588t, str, this.f25589u);
            }
        }
    }

    private b() {
        super("publisher");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        com.ironsource.environment.e.c.f24668a.b(new a(str, ironSourceTag, i10));
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }

    public b(LogListener logListener, int i10) {
        super("publisher", 1);
        this.f25586c = null;
    }
}
