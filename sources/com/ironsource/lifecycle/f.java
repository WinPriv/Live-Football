package com.ironsource.lifecycle;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public Timer f24729a;

    /* renamed from: b, reason: collision with root package name */
    public Long f24730b;

    /* renamed from: c, reason: collision with root package name */
    public long f24731c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f24732d;

    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            f.this.f24732d.run();
        }
    }

    public f(long j10, Runnable runnable, boolean z10) {
        this.f24731c = j10;
        this.f24732d = runnable;
        this.f24730b = null;
        d.a().a(this);
        this.f24730b = Long.valueOf(System.currentTimeMillis() + this.f24731c);
        if (!d.a().b()) {
            d();
        }
    }

    @Override // com.ironsource.lifecycle.c
    public final void a() {
        Long l10;
        if (this.f24729a == null && (l10 = this.f24730b) != null) {
            long longValue = l10.longValue() - System.currentTimeMillis();
            this.f24731c = longValue;
            if (longValue <= 0) {
                c();
                this.f24732d.run();
            } else {
                d();
            }
        }
    }

    @Override // com.ironsource.lifecycle.c
    public final void b() {
        Timer timer = this.f24729a;
        if (timer != null && timer != null) {
            timer.cancel();
            this.f24729a = null;
        }
    }

    public final void c() {
        Timer timer = this.f24729a;
        if (timer != null) {
            timer.cancel();
            this.f24729a = null;
        }
        this.f24730b = null;
        d.a().b(this);
    }

    public final void d() {
        if (this.f24729a == null) {
            Timer timer = new Timer();
            this.f24729a = timer;
            timer.schedule(new a(), this.f24731c);
            Calendar.getInstance().setTimeInMillis(this.f24730b.longValue());
        }
    }
}
