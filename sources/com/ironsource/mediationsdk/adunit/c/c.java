package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.ai;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.ironsource.mediationsdk.adunit.c.b.a f25193a;

    /* renamed from: b, reason: collision with root package name */
    public final ai f25194b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f25195c;

    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            c.this.f25194b.e();
        }
    }

    public c(com.ironsource.mediationsdk.adunit.c.b.a aVar, ai aiVar) {
        this.f25193a = aVar;
        this.f25194b = aiVar;
    }

    public final void a() {
        com.ironsource.mediationsdk.adunit.c.b.a aVar = this.f25193a;
        if (aVar.f25185a != a.EnumC0328a.MANUAL) {
            b(aVar.f25187c);
        }
    }

    public final void b(long j10) {
        Timer timer = this.f25195c;
        if (timer != null) {
            timer.cancel();
            this.f25195c = null;
        }
        Timer timer2 = new Timer();
        this.f25195c = timer2;
        timer2.schedule(new a(), j10);
    }

    public final void b() {
        if (this.f25193a.f25185a != a.EnumC0328a.MANUAL) {
            b(0L);
        }
    }
}
