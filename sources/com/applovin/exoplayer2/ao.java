package com.applovin.exoplayer2;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    private final b f13229a;

    /* renamed from: b, reason: collision with root package name */
    private final a f13230b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.d f13231c;

    /* renamed from: d, reason: collision with root package name */
    private final ba f13232d;

    /* renamed from: e, reason: collision with root package name */
    private int f13233e;
    private Object f;

    /* renamed from: g, reason: collision with root package name */
    private Looper f13234g;

    /* renamed from: h, reason: collision with root package name */
    private int f13235h;

    /* renamed from: i, reason: collision with root package name */
    private long f13236i = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13237j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13238k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13239l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13240m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13241n;

    /* loaded from: classes.dex */
    public interface a {
        void a(ao aoVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i10, Object obj) throws p;
    }

    public ao(a aVar, b bVar, ba baVar, int i10, com.applovin.exoplayer2.l.d dVar, Looper looper) {
        this.f13230b = aVar;
        this.f13229a = bVar;
        this.f13232d = baVar;
        this.f13234g = looper;
        this.f13231c = dVar;
        this.f13235h = i10;
    }

    public ba a() {
        return this.f13232d;
    }

    public b b() {
        return this.f13229a;
    }

    public int c() {
        return this.f13233e;
    }

    public Object d() {
        return this.f;
    }

    public Looper e() {
        return this.f13234g;
    }

    public long f() {
        return this.f13236i;
    }

    public int g() {
        return this.f13235h;
    }

    public boolean h() {
        return this.f13237j;
    }

    public ao i() {
        com.applovin.exoplayer2.l.a.b(!this.f13238k);
        if (this.f13236i == com.anythink.expressad.exoplayer.b.f7291b) {
            com.applovin.exoplayer2.l.a.a(this.f13237j);
        }
        this.f13238k = true;
        this.f13230b.a(this);
        return this;
    }

    public synchronized boolean j() {
        return this.f13241n;
    }

    public ao a(int i10) {
        com.applovin.exoplayer2.l.a.b(!this.f13238k);
        this.f13233e = i10;
        return this;
    }

    public ao a(Object obj) {
        com.applovin.exoplayer2.l.a.b(!this.f13238k);
        this.f = obj;
        return this;
    }

    public synchronized void a(boolean z10) {
        this.f13239l = z10 | this.f13239l;
        this.f13240m = true;
        notifyAll();
    }

    public synchronized boolean a(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        com.applovin.exoplayer2.l.a.b(this.f13238k);
        com.applovin.exoplayer2.l.a.b(this.f13234g.getThread() != Thread.currentThread());
        long a10 = this.f13231c.a() + j10;
        while (true) {
            z10 = this.f13240m;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f13231c.c();
            wait(j10);
            j10 = a10 - this.f13231c.a();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f13239l;
    }
}
