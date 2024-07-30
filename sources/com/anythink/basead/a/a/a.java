package com.anythink.basead.a.a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a<R, E> implements c<R, E> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f3533a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f3534b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private b<R, E> f3535c;

    @Override // com.anythink.basead.a.a.c
    public final void a() {
        if (!this.f3533a.get() && this.f3534b.decrementAndGet() == 0) {
            this.f3533a.set(true);
            b<R, E> bVar = this.f3535c;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // com.anythink.basead.a.a.c
    public final void a(E e10) {
        if (this.f3533a.get()) {
            return;
        }
        this.f3533a.set(true);
        b<R, E> bVar = this.f3535c;
        if (bVar != null) {
            bVar.a(e10);
        }
    }

    @Override // com.anythink.basead.a.a.c
    public final void a(int i10) {
        this.f3534b.set(i10);
    }

    @Override // com.anythink.basead.a.a.c
    public final void a(b<R, E> bVar) {
        this.f3535c = bVar;
    }
}
