package com.applovin.exoplayer2.l;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final d f16298a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16299b;

    public g() {
        this(d.f16291a);
    }

    public synchronized boolean a() {
        if (this.f16299b) {
            return false;
        }
        this.f16299b = true;
        notifyAll();
        return true;
    }

    public synchronized boolean b() {
        boolean z10;
        z10 = this.f16299b;
        this.f16299b = false;
        return z10;
    }

    public synchronized void c() throws InterruptedException {
        while (!this.f16299b) {
            wait();
        }
    }

    public synchronized void d() {
        boolean z10 = false;
        while (!this.f16299b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean e() {
        return this.f16299b;
    }

    public g(d dVar) {
        this.f16298a = dVar;
    }
}
