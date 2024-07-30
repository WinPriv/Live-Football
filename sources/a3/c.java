package a3;

import a3.s;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f92a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f93b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f94c;

    /* renamed from: d, reason: collision with root package name */
    public final ReferenceQueue<s<?>> f95d;

    /* renamed from: e, reason: collision with root package name */
    public s.a f96e;

    /* compiled from: ActiveResources.java */
    /* loaded from: classes.dex */
    public static final class a extends WeakReference<s<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final y2.e f97a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f98b;

        /* renamed from: c, reason: collision with root package name */
        public x<?> f99c;

        public a(y2.e eVar, s<?> sVar, ReferenceQueue<? super s<?>> referenceQueue, boolean z10) {
            super(sVar, referenceQueue);
            x<?> xVar;
            androidx.activity.n.n0(eVar);
            this.f97a = eVar;
            if (sVar.f202s && z10) {
                xVar = sVar.f204u;
                androidx.activity.n.n0(xVar);
            } else {
                xVar = null;
            }
            this.f99c = xVar;
            this.f98b = sVar.f202s;
        }
    }

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a3.a());
        this.f94c = new HashMap();
        this.f95d = new ReferenceQueue<>();
        this.f92a = false;
        this.f93b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new b(this));
    }

    public final synchronized void a(y2.e eVar, s<?> sVar) {
        a aVar = (a) this.f94c.put(eVar, new a(eVar, sVar, this.f95d, this.f92a));
        if (aVar != null) {
            aVar.f99c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        x<?> xVar;
        synchronized (this) {
            this.f94c.remove(aVar.f97a);
            if (aVar.f98b && (xVar = aVar.f99c) != null) {
                this.f96e.a(aVar.f97a, new s<>(xVar, true, false, aVar.f97a, this.f96e));
            }
        }
    }
}
