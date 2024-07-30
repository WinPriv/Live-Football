package com.anythink.expressad.exoplayer.k;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9034a;

    public final synchronized boolean a() {
        if (this.f9034a) {
            return false;
        }
        this.f9034a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean b() {
        boolean z10;
        z10 = this.f9034a;
        this.f9034a = false;
        return z10;
    }

    public final synchronized void c() {
        while (!this.f9034a) {
            wait();
        }
    }

    private synchronized boolean a(long j10) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = j10 + elapsedRealtime;
        while (true) {
            z10 = this.f9034a;
            if (z10 || elapsedRealtime >= j11) {
                break;
            }
            wait(j11 - elapsedRealtime);
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        return z10;
    }
}
