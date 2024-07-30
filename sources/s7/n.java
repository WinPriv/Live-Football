package s7;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: EventBus.java */
/* loaded from: classes2.dex */
public final class n implements z7.d, z7.c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f35245a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f35246b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f35247c;

    public n(Executor executor) {
        this.f35247c = executor;
    }

    @Override // z7.d
    public final synchronized void a(Executor executor, z7.b bVar) {
        executor.getClass();
        if (!this.f35245a.containsKey(n7.b.class)) {
            this.f35245a.put(n7.b.class, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f35245a.get(n7.b.class)).put(bVar, executor);
    }

    @Override // z7.d
    public final void b(i8.m mVar) {
        a(this.f35247c, mVar);
    }
}
