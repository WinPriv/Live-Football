package com.anythink.basead;

import android.os.SystemClock;
import com.anythink.core.common.b.n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    long f3811a;

    /* renamed from: b, reason: collision with root package name */
    long f3812b;

    /* renamed from: c, reason: collision with root package name */
    Runnable f3813c;

    /* renamed from: d, reason: collision with root package name */
    boolean f3814d = false;
    private final com.anythink.core.common.i.a f = com.anythink.core.common.i.c.a();

    /* renamed from: e, reason: collision with root package name */
    com.anythink.core.common.i.b f3815e = new com.anythink.core.common.i.b() { // from class: com.anythink.basead.d.1
        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            dVar.f3814d = false;
            dVar.f3812b = -1L;
            n.a().a(d.this.f3813c);
        }
    };

    public d(long j10, Runnable runnable) {
        this.f3812b = j10;
        this.f3813c = runnable;
    }

    public final synchronized void a() {
        if (this.f3812b >= 0 && !this.f3814d) {
            this.f3814d = true;
            this.f3811a = SystemClock.elapsedRealtime();
            this.f.a(this.f3815e, this.f3812b);
        }
    }

    public final synchronized void b() {
        if (this.f3814d) {
            this.f3814d = false;
            this.f3812b -= SystemClock.elapsedRealtime() - this.f3811a;
            this.f.a(this.f3815e);
        }
    }

    public final synchronized void c() {
        this.f3814d = false;
        this.f.a(this.f3815e);
        this.f3812b = -1L;
    }
}
