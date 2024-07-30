package com.applovin.exoplayer2.l;

import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16254a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f16255b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    private int f16256c = Integer.MIN_VALUE;

    public void a(int i10) {
        synchronized (this.f16254a) {
            this.f16255b.add(Integer.valueOf(i10));
            this.f16256c = Math.max(this.f16256c, i10);
        }
    }

    public void b(int i10) {
        int intValue;
        synchronized (this.f16254a) {
            this.f16255b.remove(Integer.valueOf(i10));
            if (this.f16255b.isEmpty()) {
                intValue = Integer.MIN_VALUE;
            } else {
                intValue = ((Integer) ai.a(this.f16255b.peek())).intValue();
            }
            this.f16256c = intValue;
            this.f16254a.notifyAll();
        }
    }
}
