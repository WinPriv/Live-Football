package com.ironsource.mediationsdk.b;

import java.util.Timer;

/* loaded from: classes2.dex */
public final class b extends com.ironsource.mediationsdk.b.a<a> {

    /* loaded from: classes2.dex */
    public interface a {
        void b();
    }

    public b(long j10) {
        super(j10);
    }

    @Override // com.ironsource.mediationsdk.b.a
    public final void a() {
        T t10 = this.f25339c;
        if (t10 != 0) {
            ((a) t10).b();
        }
    }

    public final void d() {
        Timer timer = this.f25337a;
        if (timer != null) {
            timer.cancel();
            this.f25337a = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(a aVar) {
        long j10 = this.f25338b;
        if ((j10 <= 0) || aVar == 0) {
            return;
        }
        this.f25339c = aVar;
        Timer timer = this.f25337a;
        if (timer != null) {
            timer.cancel();
            this.f25337a = null;
        }
        Timer timer2 = new Timer();
        this.f25337a = timer2;
        timer2.schedule(new ub.a(this), j10);
    }
}
