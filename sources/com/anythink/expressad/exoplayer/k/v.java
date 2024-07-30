package com.anythink.expressad.exoplayer.k;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9130a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f9131b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    private int f9132c = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(int i10, int i11) {
            super("Priority too low [priority=" + i10 + ", highest=" + i11 + "]");
        }
    }

    public final void a() {
        synchronized (this.f9130a) {
            this.f9131b.add(0);
            this.f9132c = Math.max(this.f9132c, 0);
        }
    }

    public final void b() {
        synchronized (this.f9130a) {
            while (this.f9132c != 0) {
                this.f9130a.wait();
            }
        }
    }

    public final void c() {
        int intValue;
        synchronized (this.f9130a) {
            this.f9131b.remove(0);
            if (this.f9131b.isEmpty()) {
                intValue = Integer.MIN_VALUE;
            } else {
                intValue = this.f9131b.peek().intValue();
            }
            this.f9132c = intValue;
            this.f9130a.notifyAll();
        }
    }

    private boolean b(int i10) {
        boolean z10;
        synchronized (this.f9130a) {
            z10 = this.f9132c == i10;
        }
        return z10;
    }

    public final void a(int i10) {
        synchronized (this.f9130a) {
            if (this.f9132c != i10) {
                throw new a(i10, this.f9132c);
            }
        }
    }
}
