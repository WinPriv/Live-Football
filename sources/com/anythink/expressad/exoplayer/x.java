package com.anythink.expressad.exoplayer;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final b f9364a;

    /* renamed from: b, reason: collision with root package name */
    private final a f9365b;

    /* renamed from: c, reason: collision with root package name */
    private final ae f9366c;

    /* renamed from: d, reason: collision with root package name */
    private int f9367d;

    /* renamed from: e, reason: collision with root package name */
    private Object f9368e;
    private Handler f;

    /* renamed from: g, reason: collision with root package name */
    private int f9369g;

    /* renamed from: h, reason: collision with root package name */
    private long f9370h = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9371i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9372j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9373k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9374l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9375m;

    /* loaded from: classes.dex */
    public interface a {
        void a(x xVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i10, Object obj);
    }

    public x(a aVar, b bVar, ae aeVar, int i10, Handler handler) {
        this.f9365b = aVar;
        this.f9364a = bVar;
        this.f9366c = aeVar;
        this.f = handler;
        this.f9369g = i10;
    }

    private synchronized x l() {
        com.anythink.expressad.exoplayer.k.a.b(this.f9372j);
        this.f9375m = true;
        a(false);
        return this;
    }

    public final ae a() {
        return this.f9366c;
    }

    public final b b() {
        return this.f9364a;
    }

    public final int c() {
        return this.f9367d;
    }

    public final Object d() {
        return this.f9368e;
    }

    public final Handler e() {
        return this.f;
    }

    public final long f() {
        return this.f9370h;
    }

    public final int g() {
        return this.f9369g;
    }

    public final boolean h() {
        return this.f9371i;
    }

    public final x i() {
        com.anythink.expressad.exoplayer.k.a.b(!this.f9372j);
        if (this.f9370h == com.anythink.expressad.exoplayer.b.f7291b) {
            com.anythink.expressad.exoplayer.k.a.a(this.f9371i);
        }
        this.f9372j = true;
        this.f9365b.a(this);
        return this;
    }

    public final synchronized boolean j() {
        return this.f9375m;
    }

    public final synchronized boolean k() {
        boolean z10;
        boolean z11;
        com.anythink.expressad.exoplayer.k.a.b(this.f9372j);
        if (this.f.getLooper().getThread() != Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        long j10 = 500;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
        while (true) {
            z11 = this.f9374l;
            if (z11 || j10 <= 0) {
                break;
            }
            wait(j10);
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z11) {
        } else {
            throw new TimeoutException("Message delivery time out");
        }
        return this.f9373k;
    }

    private x b(boolean z10) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f9372j);
        this.f9371i = z10;
        return this;
    }

    public final x a(int i10) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f9372j);
        this.f9367d = i10;
        return this;
    }

    public final x a(Object obj) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f9372j);
        this.f9368e = obj;
        return this;
    }

    private x a(Handler handler) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f9372j);
        this.f = handler;
        return this;
    }

    private x a(long j10) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f9372j);
        this.f9370h = j10;
        return this;
    }

    private x a(int i10, long j10) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f9372j);
        com.anythink.expressad.exoplayer.k.a.a(j10 != com.anythink.expressad.exoplayer.b.f7291b);
        if (i10 >= 0 && (this.f9366c.a() || i10 < this.f9366c.b())) {
            this.f9369g = i10;
            this.f9370h = j10;
            return this;
        }
        throw new o(this.f9366c, i10, j10);
    }

    public final synchronized void a(boolean z10) {
        this.f9373k = z10 | this.f9373k;
        this.f9374l = true;
        notifyAll();
    }
}
