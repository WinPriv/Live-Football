package com.ironsource.mediationsdk;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    public final com.ironsource.mediationsdk.utils.c f25314a;

    /* renamed from: b, reason: collision with root package name */
    public final ai f25315b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f25316c = null;

    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ah.this.f25315b.e();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ah.this.f25315b.e();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ah.this.f25315b.e();
        }
    }

    public ah(com.ironsource.mediationsdk.utils.c cVar, ai aiVar) {
        this.f25314a = cVar;
        this.f25315b = aiVar;
    }

    public final synchronized void a() {
        if (this.f25314a.f25900n) {
            Timer timer = this.f25316c;
            if (timer != null) {
                timer.cancel();
                this.f25316c = null;
            }
            Timer timer2 = new Timer();
            this.f25316c = timer2;
            timer2.schedule(new a(), this.f25314a.f25898l);
        }
    }

    public final synchronized void b() {
        if (!this.f25314a.f25900n) {
            Timer timer = this.f25316c;
            if (timer != null) {
                timer.cancel();
                this.f25316c = null;
            }
            Timer timer2 = new Timer();
            this.f25316c = timer2;
            timer2.schedule(new b(), this.f25314a.f25898l);
        }
    }

    public final void c() {
        synchronized (this) {
            try {
                Timer timer = this.f25316c;
                if (timer != null) {
                    timer.cancel();
                    this.f25316c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f25315b.e();
    }

    public final synchronized void d() {
        Timer timer = this.f25316c;
        if (timer != null) {
            timer.cancel();
            this.f25316c = null;
        }
        Timer timer2 = new Timer();
        this.f25316c = timer2;
        timer2.schedule(new c(), this.f25314a.f25897k);
    }
}
