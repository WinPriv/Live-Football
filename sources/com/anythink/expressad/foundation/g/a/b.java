package com.anythink.expressad.foundation.g.a;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class b<K, V> extends a<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f9803b = 16;

    /* renamed from: c, reason: collision with root package name */
    private static final int f9804c = 16777216;

    /* renamed from: d, reason: collision with root package name */
    private final int f9805d;
    private final List<V> f = Collections.synchronizedList(new LinkedList());

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f9806e = new AtomicInteger();

    private b(int i10) {
        this.f9805d = i10;
        if (i10 > 16777216) {
            Log.w("cache", String.format("You set too large memory cache size (more than %1$d Mb)", 16));
        }
    }

    private int e() {
        return this.f9805d;
    }

    @Override // com.anythink.expressad.foundation.g.a.a, com.anythink.expressad.foundation.g.a.e
    public final boolean a(K k10, V v3) {
        boolean z10;
        int c10 = c();
        int i10 = this.f9805d;
        int i11 = this.f9806e.get();
        if (c10 < i10) {
            while (i11 + c10 > i10) {
                if (this.f.remove(d())) {
                    i11 = this.f9806e.addAndGet(-c());
                }
            }
            this.f.add(v3);
            this.f9806e.addAndGet(c10);
            z10 = true;
        } else {
            z10 = false;
        }
        super.a(k10, v3);
        return z10;
    }

    @Override // com.anythink.expressad.foundation.g.a.a, com.anythink.expressad.foundation.g.a.e
    public final void b() {
        this.f.clear();
        this.f9806e.set(0);
        super.b();
    }

    public abstract int c();

    public abstract V d();

    @Override // com.anythink.expressad.foundation.g.a.a, com.anythink.expressad.foundation.g.a.e
    public final void a(K k10) {
        Object b10 = super.b(k10);
        if (b10 != null && this.f.remove(b10)) {
            this.f9806e.addAndGet(-c());
        }
        super.a(k10);
    }
}
